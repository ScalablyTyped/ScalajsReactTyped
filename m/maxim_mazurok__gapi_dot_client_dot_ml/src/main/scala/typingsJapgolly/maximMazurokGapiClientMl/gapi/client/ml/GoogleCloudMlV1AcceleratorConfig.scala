package typingsJapgolly.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1AcceleratorConfig extends StObject {
  
  /** The number of accelerators to attach to each machine running the job. */
  var count: js.UndefOr[String] = js.undefined
  
  /** The type of accelerator to use. */
  var `type`: js.UndefOr[String] = js.undefined
}
object GoogleCloudMlV1AcceleratorConfig {
  
  inline def apply(): GoogleCloudMlV1AcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1AcceleratorConfig]
  }
  
  extension [Self <: GoogleCloudMlV1AcceleratorConfig](x: Self) {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
