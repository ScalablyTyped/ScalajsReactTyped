package typingsJapgolly.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MentionSentiment extends StObject {
  
  /**
    * The sentiment of the mention. 
    */
  var Sentiment: js.UndefOr[SentimentType] = js.undefined
  
  var SentimentScore: js.UndefOr[typingsJapgolly.awsSdk.clientsComprehendMod.SentimentScore] = js.undefined
}
object MentionSentiment {
  
  inline def apply(): MentionSentiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MentionSentiment]
  }
  
  extension [Self <: MentionSentiment](x: Self) {
    
    inline def setSentiment(value: SentimentType): Self = StObject.set(x, "Sentiment", value.asInstanceOf[js.Any])
    
    inline def setSentimentScore(value: SentimentScore): Self = StObject.set(x, "SentimentScore", value.asInstanceOf[js.Any])
    
    inline def setSentimentScoreUndefined: Self = StObject.set(x, "SentimentScore", js.undefined)
    
    inline def setSentimentUndefined: Self = StObject.set(x, "Sentiment", js.undefined)
  }
}
