package typingsJapgolly.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRegexPatternSetResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the CreateRegexPatternSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typingsJapgolly.awsSdk.clientsWafMod.ChangeToken] = js.undefined
  
  /**
    * A RegexPatternSet that contains no objects.
    */
  var RegexPatternSet: js.UndefOr[typingsJapgolly.awsSdk.clientsWafMod.RegexPatternSet] = js.undefined
}
object CreateRegexPatternSetResponse {
  
  inline def apply(): CreateRegexPatternSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRegexPatternSetResponse]
  }
  
  extension [Self <: CreateRegexPatternSetResponse](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
    
    inline def setRegexPatternSet(value: RegexPatternSet): Self = StObject.set(x, "RegexPatternSet", value.asInstanceOf[js.Any])
    
    inline def setRegexPatternSetUndefined: Self = StObject.set(x, "RegexPatternSet", js.undefined)
  }
}
