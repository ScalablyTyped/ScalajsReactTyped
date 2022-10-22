package typingsJapgolly.reactBootstrap

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMediaBodyMod {
  
  @JSImport("react-bootstrap/lib/MediaBody", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[MediaBodyProps, js.Object, Any]
  
  type MediaBody = japgolly.scalajs.react.facade.React.Component[MediaBodyProps & js.Object, js.Object]
  
  trait MediaBodyProps
    extends StObject
       with ClassAttributes[
          japgolly.scalajs.react.facade.React.Component[MediaBodyProps & js.Object, js.Object]
        ] {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var componentClass: js.UndefOr[ElementType] = js.undefined
  }
  object MediaBodyProps {
    
    inline def apply(): MediaBodyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaBodyProps]
    }
    
    extension [Self <: MediaBodyProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setComponentClass(value: ElementType): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
