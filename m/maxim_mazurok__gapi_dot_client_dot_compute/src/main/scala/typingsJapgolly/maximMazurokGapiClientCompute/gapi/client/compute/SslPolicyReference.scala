package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SslPolicyReference extends StObject {
  
  /** URL of the SSL policy resource. Set this to empty string to clear any existing SSL policy associated with the target proxy resource. */
  var sslPolicy: js.UndefOr[String] = js.undefined
}
object SslPolicyReference {
  
  inline def apply(): SslPolicyReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslPolicyReference]
  }
  
  extension [Self <: SslPolicyReference](x: Self) {
    
    inline def setSslPolicy(value: String): Self = StObject.set(x, "sslPolicy", value.asInstanceOf[js.Any])
    
    inline def setSslPolicyUndefined: Self = StObject.set(x, "sslPolicy", js.undefined)
  }
}
