package typingsJapgolly.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DominantLanguage extends StObject {
  
  /**
    * The RFC 5646 language code for the dominant language. For more information about RFC 5646, see Tags for Identifying Languages on the IETF Tools web site.
    */
  var LanguageCode: js.UndefOr[String] = js.undefined
  
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
    */
  var Score: js.UndefOr[Float] = js.undefined
}
object DominantLanguage {
  
  inline def apply(): DominantLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DominantLanguage]
  }
  
  extension [Self <: DominantLanguage](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
  }
}
