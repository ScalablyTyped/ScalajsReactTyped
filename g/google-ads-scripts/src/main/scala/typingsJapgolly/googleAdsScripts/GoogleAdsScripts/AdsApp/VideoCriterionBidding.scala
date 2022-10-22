package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to a video criterion's bidding fields. */
trait VideoCriterionBidding extends StObject {
  
  /**
    * Returns the bidding strategy source of this video criterion.
    *
    * @deprecated **Deprecated**. Google Ads does not support setting bidding strategies at different levels. As a result, 'CAMPAIGN' is the only possible source for bidding strategies.
    */
  def getStrategySource(): String
  
  /** Returns the bidding strategy type of this video criterion. */
  def getStrategyType(): String
}
object VideoCriterionBidding {
  
  inline def apply(getStrategySource: CallbackTo[String], getStrategyType: CallbackTo[String]): VideoCriterionBidding = {
    val __obj = js.Dynamic.literal(getStrategySource = getStrategySource.toJsFn, getStrategyType = getStrategyType.toJsFn)
    __obj.asInstanceOf[VideoCriterionBidding]
  }
  
  extension [Self <: VideoCriterionBidding](x: Self) {
    
    inline def setGetStrategySource(value: CallbackTo[String]): Self = StObject.set(x, "getStrategySource", value.toJsFn)
    
    inline def setGetStrategyType(value: CallbackTo[String]): Self = StObject.set(x, "getStrategyType", value.toJsFn)
  }
}
