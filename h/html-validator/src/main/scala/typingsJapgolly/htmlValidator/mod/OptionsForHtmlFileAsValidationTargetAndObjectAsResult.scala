package typingsJapgolly.htmlValidator.mod

import typingsJapgolly.htmlValidator.htmlValidatorStrings.json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsForHtmlFileAsValidationTargetAndObjectAsResult
  extends StObject
     with OptionsForHtmlFileAsValidationTarget {
  
  var format: js.UndefOr[json] = js.undefined
}
object OptionsForHtmlFileAsValidationTargetAndObjectAsResult {
  
  inline def apply(data: String): OptionsForHtmlFileAsValidationTargetAndObjectAsResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsForHtmlFileAsValidationTargetAndObjectAsResult]
  }
  
  extension [Self <: OptionsForHtmlFileAsValidationTargetAndObjectAsResult](x: Self) {
    
    inline def setFormat(value: json): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
