package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to a video campaign's bidding fields. */
trait VideoCampaignBidding extends StObject {
  
  /** Returns the bidding strategy type of this video campaign. */
  def getStrategyType(): String
}
object VideoCampaignBidding {
  
  inline def apply(getStrategyType: CallbackTo[String]): VideoCampaignBidding = {
    val __obj = js.Dynamic.literal(getStrategyType = getStrategyType.toJsFn)
    __obj.asInstanceOf[VideoCampaignBidding]
  }
  
  extension [Self <: VideoCampaignBidding](x: Self) {
    
    inline def setGetStrategyType(value: CallbackTo[String]): Self = StObject.set(x, "getStrategyType", value.toJsFn)
  }
}
