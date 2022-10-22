package typingsJapgolly.fhir.r2Mod

import typingsJapgolly.fhir.fhirStrings.Consequence
import typingsJapgolly.fhir.fhirStrings.Currency
import typingsJapgolly.fhir.fhirStrings.Notification
import typingsJapgolly.fhir.fhirStrings.receiver
import typingsJapgolly.fhir.fhirStrings.sender
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformanceMessagingEvent
  extends StObject
     with BackboneElement {
  
  var _category: js.UndefOr[Element] = js.undefined
  
  var _documentation: js.UndefOr[Element] = js.undefined
  
  var _focus: js.UndefOr[Element] = js.undefined
  
  var _mode: js.UndefOr[Element] = js.undefined
  
  /**
    * The impact of the content of the message.
    */
  var category: js.UndefOr[Consequence | Currency | Notification] = js.undefined
  
  /**
    * A coded identifier of a supported messaging event.
    */
  var code: Coding
  
  /**
    * Guidance on how this event is handled, such as internal system trigger points, business rules, etc.
    */
  var documentation: js.UndefOr[String] = js.undefined
  
  /**
    * A resource associated with the event.  This is the resource that defines the event.
    */
  var focus: String
  
  /**
    * The mode of this event declaration - whether application is sender or receiver.
    */
  var mode: sender | receiver
  
  /**
    * Information about the request for this event.
    */
  var request: Reference
  
  /**
    * Information about the response for this event.
    */
  var response: Reference
}
object ConformanceMessagingEvent {
  
  inline def apply(code: Coding, focus: String, mode: sender | receiver, request: Reference, response: Reference): ConformanceMessagingEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformanceMessagingEvent]
  }
  
  extension [Self <: ConformanceMessagingEvent](x: Self) {
    
    inline def setCategory(value: Consequence | Currency | Notification): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCode(value: Coding): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setMode(value: sender | receiver): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: Reference): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: Reference): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def set_category(value: Element): Self = StObject.set(x, "_category", value.asInstanceOf[js.Any])
    
    inline def set_categoryUndefined: Self = StObject.set(x, "_category", js.undefined)
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    inline def set_focus(value: Element): Self = StObject.set(x, "_focus", value.asInstanceOf[js.Any])
    
    inline def set_focusUndefined: Self = StObject.set(x, "_focus", js.undefined)
    
    inline def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    inline def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
  }
}
