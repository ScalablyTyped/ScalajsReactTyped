package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThirdPartyVerifierAssignedTargetingOptionDetails extends StObject {
  
  /** Third party brand verifier -- Adloox. */
  var adloox: js.UndefOr[Adloox] = js.undefined
  
  /** Third party brand verifier -- DoubleVerify. */
  var doubleVerify: js.UndefOr[DoubleVerify] = js.undefined
  
  /** Third party brand verifier -- Integral Ad Science. */
  var integralAdScience: js.UndefOr[IntegralAdScience] = js.undefined
}
object ThirdPartyVerifierAssignedTargetingOptionDetails {
  
  inline def apply(): ThirdPartyVerifierAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyVerifierAssignedTargetingOptionDetails]
  }
  
  extension [Self <: ThirdPartyVerifierAssignedTargetingOptionDetails](x: Self) {
    
    inline def setAdloox(value: Adloox): Self = StObject.set(x, "adloox", value.asInstanceOf[js.Any])
    
    inline def setAdlooxUndefined: Self = StObject.set(x, "adloox", js.undefined)
    
    inline def setDoubleVerify(value: DoubleVerify): Self = StObject.set(x, "doubleVerify", value.asInstanceOf[js.Any])
    
    inline def setDoubleVerifyUndefined: Self = StObject.set(x, "doubleVerify", js.undefined)
    
    inline def setIntegralAdScience(value: IntegralAdScience): Self = StObject.set(x, "integralAdScience", value.asInstanceOf[js.Any])
    
    inline def setIntegralAdScienceUndefined: Self = StObject.set(x, "integralAdScience", js.undefined)
  }
}
