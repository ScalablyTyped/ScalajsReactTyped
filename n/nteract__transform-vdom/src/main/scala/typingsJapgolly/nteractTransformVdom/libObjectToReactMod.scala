package typingsJapgolly.nteractTransformVdom

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nteractTransformVdom.libEventToObjectMod.SerializedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libObjectToReactMod {
  
  @JSImport("@nteract/transform-vdom/lib/object-to-react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def objectToReactElement(
    obj: VDOMEl,
    onVDOMEvent: js.Function2[/* targetName */ String, /* event */ SerializedEvent[Any], Unit]
  ): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("objectToReactElement")(obj.asInstanceOf[js.Any], onVDOMEvent.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  type Attributes = StringDictionary[Any]
  
  type EventHandlers = StringDictionary[String]
  
  trait VDOMEl extends StObject {
    
    var attributes: Attributes
    
    var children: Node | VDOMEl | (js.Array[Node | VDOMEl])
    
    var eventHandlers: js.UndefOr[EventHandlers] = js.undefined
    
    var key: Double | String | Null
    
    var tagName: String
  }
  object VDOMEl {
    
    inline def apply(attributes: Attributes, tagName: String): VDOMEl = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], children = null, key = null)
      __obj.asInstanceOf[VDOMEl]
    }
    
    extension [Self <: VDOMEl](x: Self) {
      
      inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: Node | VDOMEl | (js.Array[Node | VDOMEl])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Element | Empty | JsNumber | Node | String | VDOMEl)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setEventHandlers(value: EventHandlers): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
      
      inline def setEventHandlersUndefined: Self = StObject.set(x, "eventHandlers", js.undefined)
      
      inline def setKey(value: Double | String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
}
