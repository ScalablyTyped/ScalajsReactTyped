package typingsJapgolly.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegexValidation extends StObject {
  
  /** Required. RE2 regular expressions used to validate the parameter's value. The value must match the regex in its entirety (substring matches are not sufficient). */
  var regexes: js.UndefOr[js.Array[String]] = js.undefined
}
object RegexValidation {
  
  inline def apply(): RegexValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegexValidation]
  }
  
  extension [Self <: RegexValidation](x: Self) {
    
    inline def setRegexes(value: js.Array[String]): Self = StObject.set(x, "regexes", value.asInstanceOf[js.Any])
    
    inline def setRegexesUndefined: Self = StObject.set(x, "regexes", js.undefined)
    
    inline def setRegexesVarargs(value: String*): Self = StObject.set(x, "regexes", js.Array(value*))
  }
}
