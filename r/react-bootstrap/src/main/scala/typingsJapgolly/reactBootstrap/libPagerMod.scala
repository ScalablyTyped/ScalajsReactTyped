package typingsJapgolly.reactBootstrap

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.reactBootstrap.mod.SelectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPagerMod {
  
  @JSImport("react-bootstrap/lib/Pager", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PagerProps, js.Object, Any]
  @JSImport("react-bootstrap/lib/Pager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Pager", "Item")
  @js.native
  open class Item ()
    extends typingsJapgolly.reactBootstrap.libPagerItemMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Pager", "Item")
  @js.native
  def Item: Instantiable0[typingsJapgolly.reactBootstrap.libPagerItemMod.^] = js.native
  inline def Item_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libPagerItemMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  type Pager = japgolly.scalajs.react.facade.React.Component[PagerProps & js.Object, js.Object]
  
  trait PagerProps
    extends StObject
       with HTMLProps[japgolly.scalajs.react.facade.React.Component[PagerProps & js.Object, js.Object]] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    @JSName("onSelect")
    var onSelect_PagerProps: js.UndefOr[SelectCallback] = js.undefined
  }
  object PagerProps {
    
    inline def apply(): PagerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagerProps]
    }
    
    extension [Self <: PagerProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setOnSelect(value: SelectCallback): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    }
  }
}
