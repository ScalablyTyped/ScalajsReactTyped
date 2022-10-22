package typingsJapgolly.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateXssMatchSetResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the CreateXssMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typingsJapgolly.awsSdk.clientsWafMod.ChangeToken] = js.undefined
  
  /**
    * An XssMatchSet.
    */
  var XssMatchSet: js.UndefOr[typingsJapgolly.awsSdk.clientsWafMod.XssMatchSet] = js.undefined
}
object CreateXssMatchSetResponse {
  
  inline def apply(): CreateXssMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateXssMatchSetResponse]
  }
  
  extension [Self <: CreateXssMatchSetResponse](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
    
    inline def setXssMatchSet(value: XssMatchSet): Self = StObject.set(x, "XssMatchSet", value.asInstanceOf[js.Any])
    
    inline def setXssMatchSetUndefined: Self = StObject.set(x, "XssMatchSet", js.undefined)
  }
}
