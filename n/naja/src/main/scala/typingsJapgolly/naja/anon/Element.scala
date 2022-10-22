package typingsJapgolly.naja.anon

import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var element: org.scalajs.dom.Element
  
  var options: typingsJapgolly.naja.distNajaMod.Options
  
  var originalEvent: js.UndefOr[Event] = js.undefined
}
object Element {
  
  inline def apply(element: org.scalajs.dom.Element, options: typingsJapgolly.naja.distNajaMod.Options): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: typingsJapgolly.naja.distNajaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
  }
}
