package typingsJapgolly.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TracingConfigResponse extends StObject {
  
  /**
    * The tracing mode.
    */
  var Mode: js.UndefOr[TracingMode] = js.undefined
}
object TracingConfigResponse {
  
  inline def apply(): TracingConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracingConfigResponse]
  }
  
  extension [Self <: TracingConfigResponse](x: Self) {
    
    inline def setMode(value: TracingMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
  }
}
