package typingsJapgolly.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegexMatcher extends StObject {
  
  /** Google's RE2 regex engine. */
  var googleRe2: js.UndefOr[GoogleRE2] = js.undefined
  
  /** The regex match string. The string must be supported by the configured engine. */
  var regex: js.UndefOr[String] = js.undefined
}
object RegexMatcher {
  
  inline def apply(): RegexMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegexMatcher]
  }
  
  extension [Self <: RegexMatcher](x: Self) {
    
    inline def setGoogleRe2(value: GoogleRE2): Self = StObject.set(x, "googleRe2", value.asInstanceOf[js.Any])
    
    inline def setGoogleRe2Undefined: Self = StObject.set(x, "googleRe2", js.undefined)
    
    inline def setRegex(value: String): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
  }
}
