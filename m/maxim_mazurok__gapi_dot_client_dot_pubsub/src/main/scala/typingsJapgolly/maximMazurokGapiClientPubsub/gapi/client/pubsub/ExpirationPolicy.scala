package typingsJapgolly.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpirationPolicy extends StObject {
  
  /**
    * Specifies the "time-to-live" duration for an associated resource. The resource expires if it is not active for a period of `ttl`. The definition of "activity" depends on the type of
    * the associated resource. The minimum and maximum allowed values for `ttl` depend on the type of the associated resource, as well. If `ttl` is not set, the associated resource never
    * expires.
    */
  var ttl: js.UndefOr[String] = js.undefined
}
object ExpirationPolicy {
  
  inline def apply(): ExpirationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpirationPolicy]
  }
  
  extension [Self <: ExpirationPolicy](x: Self) {
    
    inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
