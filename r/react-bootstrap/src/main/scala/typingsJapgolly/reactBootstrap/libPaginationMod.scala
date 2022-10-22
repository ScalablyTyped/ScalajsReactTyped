package typingsJapgolly.reactBootstrap

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPaginationMod {
  
  @JSImport("react-bootstrap/lib/Pagination", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PaginationProps, js.Object, Any]
  @JSImport("react-bootstrap/lib/Pagination", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Pagination", "Ellipsis")
  @js.native
  open class Ellipsis ()
    extends typingsJapgolly.reactBootstrap.libPaginationEllipsisMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Pagination", "Ellipsis")
  @js.native
  def Ellipsis: Instantiable0[typingsJapgolly.reactBootstrap.libPaginationEllipsisMod.^] = js.native
  inline def Ellipsis_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libPaginationEllipsisMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ellipsis")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Pagination", "First")
  @js.native
  open class First ()
    extends typingsJapgolly.reactBootstrap.libPaginationFirstMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Pagination", "First")
  @js.native
  def First: Instantiable0[typingsJapgolly.reactBootstrap.libPaginationFirstMod.^] = js.native
  inline def First_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libPaginationFirstMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("First")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Pagination", "Item")
  @js.native
  open class Item ()
    extends typingsJapgolly.reactBootstrap.libPaginationItemMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Pagination", "Item")
  @js.native
  def Item: Instantiable0[typingsJapgolly.reactBootstrap.libPaginationItemMod.^] = js.native
  inline def Item_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libPaginationItemMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Pagination", "Last")
  @js.native
  open class Last ()
    extends typingsJapgolly.reactBootstrap.libPaginationLastMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Pagination", "Last")
  @js.native
  def Last: Instantiable0[typingsJapgolly.reactBootstrap.libPaginationLastMod.^] = js.native
  inline def Last_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libPaginationLastMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Last")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Pagination", "Next")
  @js.native
  open class Next ()
    extends typingsJapgolly.reactBootstrap.libPaginationNextMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Pagination", "Next")
  @js.native
  def Next: Instantiable0[typingsJapgolly.reactBootstrap.libPaginationNextMod.^] = js.native
  inline def Next_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libPaginationNextMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Next")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Pagination", "Prev")
  @js.native
  open class Prev ()
    extends typingsJapgolly.reactBootstrap.libPaginationPrevMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Pagination", "Prev")
  @js.native
  def Prev: Instantiable0[typingsJapgolly.reactBootstrap.libPaginationPrevMod.^] = js.native
  inline def Prev_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libPaginationPrevMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Prev")(x.asInstanceOf[js.Any])
  
  type Pagination = japgolly.scalajs.react.facade.React.Component[PaginationProps & js.Object, js.Object]
  
  trait PaginationProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[PaginationProps & js.Object, js.Object]
        ] {
    
    var bsSize: js.UndefOr[Sizes] = js.undefined
  }
  object PaginationProps {
    
    inline def apply(): PaginationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationProps]
    }
    
    extension [Self <: PaginationProps](x: Self) {
      
      inline def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      inline def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
    }
  }
}
