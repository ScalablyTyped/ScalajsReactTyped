package typingsJapgolly.reactBootstrap

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMediaMod {
  
  @JSImport("react-bootstrap/lib/Media", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[MediaProps, js.Object, Any]
  @JSImport("react-bootstrap/lib/Media", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Media", "Body")
  @js.native
  open class Body ()
    extends typingsJapgolly.reactBootstrap.libMediaBodyMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Media", "Body")
  @js.native
  def Body: Instantiable0[typingsJapgolly.reactBootstrap.libMediaBodyMod.^] = js.native
  inline def Body_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libMediaBodyMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Body")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Media", "Heading")
  @js.native
  open class Heading ()
    extends typingsJapgolly.reactBootstrap.libMediaHeadingMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Media", "Heading")
  @js.native
  def Heading: Instantiable0[typingsJapgolly.reactBootstrap.libMediaHeadingMod.^] = js.native
  inline def Heading_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libMediaHeadingMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Heading")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Media", "Left")
  @js.native
  open class Left ()
    extends typingsJapgolly.reactBootstrap.libMediaLeftMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Media", "Left")
  @js.native
  def Left: Instantiable0[typingsJapgolly.reactBootstrap.libMediaLeftMod.^] = js.native
  inline def Left_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libMediaLeftMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Left")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Media", "List")
  @js.native
  open class List ()
    extends typingsJapgolly.reactBootstrap.libMediaListMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Media", "List")
  @js.native
  def List: Instantiable0[typingsJapgolly.reactBootstrap.libMediaListMod.^] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Media", "ListItem")
  @js.native
  open class ListItem ()
    extends typingsJapgolly.reactBootstrap.libMediaListItemMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Media", "ListItem")
  @js.native
  def ListItem: Instantiable0[typingsJapgolly.reactBootstrap.libMediaListItemMod.^] = js.native
  inline def ListItem_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libMediaListItemMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ListItem")(x.asInstanceOf[js.Any])
  
  inline def List_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libMediaListMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("List")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Media", "Right")
  @js.native
  open class Right ()
    extends typingsJapgolly.reactBootstrap.libMediaRightMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Media", "Right")
  @js.native
  def Right: Instantiable0[typingsJapgolly.reactBootstrap.libMediaRightMod.^] = js.native
  inline def Right_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libMediaRightMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Right")(x.asInstanceOf[js.Any])
  
  type Media = japgolly.scalajs.react.facade.React.Component[MediaProps & js.Object, js.Object]
  
  trait MediaProps
    extends StObject
       with HTMLProps[japgolly.scalajs.react.facade.React.Component[MediaProps & js.Object, js.Object]] {
    
    var componentClass: js.UndefOr[ElementType] = js.undefined
  }
  object MediaProps {
    
    inline def apply(): MediaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaProps]
    }
    
    extension [Self <: MediaProps](x: Self) {
      
      inline def setComponentClass(value: ElementType): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
