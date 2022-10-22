package typingsJapgolly.braftEditor.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.braftEditor.braftEditorStrings.component
import typingsJapgolly.braftEditor.mod.ExtendControlType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component
  extends StObject
     with ExtendControlType {
  
  var component: Node
  
  var key: String
  
  var `type`: component
}
object Component {
  
  inline def apply(key: String): Component = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], component = null)
    __obj.updateDynamic("type")("component")
    __obj.asInstanceOf[Component]
  }
  
  extension [Self <: Component](x: Self) {
    
    inline def setComponent(value: VdomNode): Self = StObject.set(x, "component", value.rawNode.asInstanceOf[js.Any])
    
    inline def setComponentNull: Self = StObject.set(x, "component", null)
    
    inline def setComponentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "component", js.Array(value*))
    
    inline def setComponentVdomElement(value: VdomElement): Self = StObject.set(x, "component", value.rawElement.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: component): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
