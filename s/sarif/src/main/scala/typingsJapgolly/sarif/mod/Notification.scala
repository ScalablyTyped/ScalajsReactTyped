package typingsJapgolly.sarif.mod

import typingsJapgolly.sarif.mod.Notification.level
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notification extends StObject {
  
  /**
    * A reference used to locate the rule descriptor associated with this notification.
    */
  var associatedRule: js.UndefOr[ReportingDescriptorReference] = js.undefined
  
  /**
    * A reference used to locate the descriptor relevant to this notification.
    */
  var descriptor: js.UndefOr[ReportingDescriptorReference] = js.undefined
  
  /**
    * The runtime exception, if any, relevant to this notification.
    */
  var exception: js.UndefOr[Exception] = js.undefined
  
  /**
    * A value specifying the severity level of the notification.
    */
  var level: js.UndefOr[level] = js.undefined
  
  /**
    * The locations relevant to this notification.
    */
  var locations: js.UndefOr[js.Array[Location]] = js.undefined
  
  /**
    * A message that describes the condition that was encountered.
    */
  var message: Message
  
  /**
    * Key/value pairs that provide additional information about the notification.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * The thread identifier of the code that generated the notification.
    */
  var threadId: js.UndefOr[Double] = js.undefined
  
  /**
    * The Coordinated Universal Time (UTC) date and time at which the analysis tool generated the notification.
    */
  var timeUtc: js.UndefOr[String] = js.undefined
}
object Notification {
  
  inline def apply(message: Message): Notification = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
  
  extension [Self <: Notification](x: Self) {
    
    inline def setAssociatedRule(value: ReportingDescriptorReference): Self = StObject.set(x, "associatedRule", value.asInstanceOf[js.Any])
    
    inline def setAssociatedRuleUndefined: Self = StObject.set(x, "associatedRule", js.undefined)
    
    inline def setDescriptor(value: ReportingDescriptorReference): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    inline def setDescriptorUndefined: Self = StObject.set(x, "descriptor", js.undefined)
    
    inline def setException(value: Exception): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    inline def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
    
    inline def setLevel(value: level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setLocations(value: js.Array[Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value*))
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setThreadId(value: Double): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
    
    inline def setThreadIdUndefined: Self = StObject.set(x, "threadId", js.undefined)
    
    inline def setTimeUtc(value: String): Self = StObject.set(x, "timeUtc", value.asInstanceOf[js.Any])
    
    inline def setTimeUtcUndefined: Self = StObject.set(x, "timeUtc", js.undefined)
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sarif.sarifStrings.none
    - typingsJapgolly.sarif.sarifStrings.note
    - typingsJapgolly.sarif.sarifStrings.warning
    - typingsJapgolly.sarif.sarifStrings.error
  */
  trait level extends StObject
  object level {
    
    inline def error: typingsJapgolly.sarif.sarifStrings.error = "error".asInstanceOf[typingsJapgolly.sarif.sarifStrings.error]
    
    inline def none: typingsJapgolly.sarif.sarifStrings.none = "none".asInstanceOf[typingsJapgolly.sarif.sarifStrings.none]
    
    inline def note: typingsJapgolly.sarif.sarifStrings.note = "note".asInstanceOf[typingsJapgolly.sarif.sarifStrings.note]
    
    inline def warning: typingsJapgolly.sarif.sarifStrings.warning = "warning".asInstanceOf[typingsJapgolly.sarif.sarifStrings.warning]
  }
}
