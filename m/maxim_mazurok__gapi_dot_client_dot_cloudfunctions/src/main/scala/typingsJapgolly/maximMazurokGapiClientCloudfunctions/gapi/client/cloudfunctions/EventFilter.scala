package typingsJapgolly.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventFilter extends StObject {
  
  /** Required. The name of a CloudEvents attribute. */
  var attribute: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The operator used for matching the events with the value of the filter. If not specified, only events that have an exact key-value pair specified in the filter are
    * matched. The only allowed value is `match-path-pattern`.
    */
  var operator: js.UndefOr[String] = js.undefined
  
  /** Required. The value for the attribute. */
  var value: js.UndefOr[String] = js.undefined
}
object EventFilter {
  
  inline def apply(): EventFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventFilter]
  }
  
  extension [Self <: EventFilter](x: Self) {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
