package typingsJapgolly.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Returns important keywords in the content. Supported languages: English, French, German, Italian, Japanese, Korean, Portuguese, Russian, Spanish, Swedish. */
trait KeywordsOptions extends StObject {
  
  /** Set this to `true` to analyze emotion for detected keywords. */
  var emotion: js.UndefOr[Boolean] = js.undefined
  
  /** Maximum number of keywords to return. */
  var limit: js.UndefOr[Double] = js.undefined
  
  /** Set this to `true` to return sentiment information for detected keywords. */
  var sentiment: js.UndefOr[Boolean] = js.undefined
}
object KeywordsOptions {
  
  inline def apply(): KeywordsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeywordsOptions]
  }
  
  extension [Self <: KeywordsOptions](x: Self) {
    
    inline def setEmotion(value: Boolean): Self = StObject.set(x, "emotion", value.asInstanceOf[js.Any])
    
    inline def setEmotionUndefined: Self = StObject.set(x, "emotion", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setSentiment(value: Boolean): Self = StObject.set(x, "sentiment", value.asInstanceOf[js.Any])
    
    inline def setSentimentUndefined: Self = StObject.set(x, "sentiment", js.undefined)
  }
}
