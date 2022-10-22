package typingsJapgolly.reactBigCalendar.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceHeaderProps[TResource /* <: js.Object */] extends StObject {
  
  var index: Double
  
  var label: Node
  
  var resource: TResource
}
object ResourceHeaderProps {
  
  inline def apply[TResource /* <: js.Object */](index: Double, resource: TResource): ResourceHeaderProps[TResource] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], label = null)
    __obj.asInstanceOf[ResourceHeaderProps[TResource]]
  }
  
  extension [Self <: ResourceHeaderProps[?], TResource /* <: js.Object */](x: Self & ResourceHeaderProps[TResource]) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
    
    inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
    
    inline def setResource(value: TResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
