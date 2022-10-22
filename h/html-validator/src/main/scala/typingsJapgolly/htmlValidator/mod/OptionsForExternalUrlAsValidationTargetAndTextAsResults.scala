package typingsJapgolly.htmlValidator.mod

import typingsJapgolly.htmlValidator.htmlValidatorStrings.gnu
import typingsJapgolly.htmlValidator.htmlValidatorStrings.html
import typingsJapgolly.htmlValidator.htmlValidatorStrings.text
import typingsJapgolly.htmlValidator.htmlValidatorStrings.xhtml
import typingsJapgolly.htmlValidator.htmlValidatorStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsForExternalUrlAsValidationTargetAndTextAsResults
  extends StObject
     with OptionsForHtmlFileAsValidationTarget {
  
  var format: html | xhtml | xml | gnu | text
}
object OptionsForExternalUrlAsValidationTargetAndTextAsResults {
  
  inline def apply(data: String, format: html | xhtml | xml | gnu | text): OptionsForExternalUrlAsValidationTargetAndTextAsResults = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsForExternalUrlAsValidationTargetAndTextAsResults]
  }
  
  extension [Self <: OptionsForExternalUrlAsValidationTargetAndTextAsResults](x: Self) {
    
    inline def setFormat(value: html | xhtml | xml | gnu | text): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
