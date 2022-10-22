package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalClaim extends StObject {
  
  /**
    * The UNIX epoch time at which the claim was acquired from the external provider.
    */
  var acquiredTime: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the external claim being requested.
    */
  var claimName: js.UndefOr[String] = js.undefined
  
  /**
    * The claim provider's client ID from which the claim is being requested.
    */
  var provider: js.UndefOr[String] = js.undefined
  
  /**
    * The value provided for the external claim.
    */
  var value: js.UndefOr[String] = js.undefined
}
object ExternalClaim {
  
  inline def apply(): ExternalClaim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalClaim]
  }
  
  extension [Self <: ExternalClaim](x: Self) {
    
    inline def setAcquiredTime(value: String): Self = StObject.set(x, "acquiredTime", value.asInstanceOf[js.Any])
    
    inline def setAcquiredTimeUndefined: Self = StObject.set(x, "acquiredTime", js.undefined)
    
    inline def setClaimName(value: String): Self = StObject.set(x, "claimName", value.asInstanceOf[js.Any])
    
    inline def setClaimNameUndefined: Self = StObject.set(x, "claimName", js.undefined)
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
