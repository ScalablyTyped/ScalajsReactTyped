package typingsJapgolly.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRegexMatchSetResponse extends StObject {
  
  /**
    * Information about the RegexMatchSet that you specified in the GetRegexMatchSet request. For more information, see RegexMatchTuple.
    */
  var RegexMatchSet: js.UndefOr[typingsJapgolly.awsSdk.clientsWafregionalMod.RegexMatchSet] = js.undefined
}
object GetRegexMatchSetResponse {
  
  inline def apply(): GetRegexMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRegexMatchSetResponse]
  }
  
  extension [Self <: GetRegexMatchSetResponse](x: Self) {
    
    inline def setRegexMatchSet(value: RegexMatchSet): Self = StObject.set(x, "RegexMatchSet", value.asInstanceOf[js.Any])
    
    inline def setRegexMatchSetUndefined: Self = StObject.set(x, "RegexMatchSet", js.undefined)
  }
}
