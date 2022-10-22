package typingsJapgolly.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChangeTokenResponse extends StObject {
  
  /**
    * The ChangeToken that you used in the request. Use this value in a GetChangeTokenStatus request to get the current status of the request. 
    */
  var ChangeToken: js.UndefOr[typingsJapgolly.awsSdk.clientsWafregionalMod.ChangeToken] = js.undefined
}
object GetChangeTokenResponse {
  
  inline def apply(): GetChangeTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetChangeTokenResponse]
  }
  
  extension [Self <: GetChangeTokenResponse](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
  }
}
