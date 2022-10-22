package typingsJapgolly.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectKeyPhrasesRequest extends StObject {
  
  /**
    * The language of the input documents. You can specify any of the primary languages supported by Amazon Comprehend. All documents must be in the same language.
    */
  var LanguageCode: typingsJapgolly.awsSdk.clientsComprehendMod.LanguageCode
  
  /**
    * A UTF-8 text string. The string must contain less than 100 KB of UTF-8 encoded characters.
    */
  var Text: CustomerInputString
}
object DetectKeyPhrasesRequest {
  
  inline def apply(LanguageCode: LanguageCode, Text: CustomerInputString): DetectKeyPhrasesRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectKeyPhrasesRequest]
  }
  
  extension [Self <: DetectKeyPhrasesRequest](x: Self) {
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setText(value: CustomerInputString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
