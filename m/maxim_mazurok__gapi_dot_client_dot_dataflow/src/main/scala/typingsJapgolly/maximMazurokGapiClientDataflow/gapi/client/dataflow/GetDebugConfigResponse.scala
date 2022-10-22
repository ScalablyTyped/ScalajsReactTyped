package typingsJapgolly.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDebugConfigResponse extends StObject {
  
  /** The encoded debug configuration for the requested component. */
  var config: js.UndefOr[String] = js.undefined
}
object GetDebugConfigResponse {
  
  inline def apply(): GetDebugConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDebugConfigResponse]
  }
  
  extension [Self <: GetDebugConfigResponse](x: Self) {
    
    inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
  }
}
