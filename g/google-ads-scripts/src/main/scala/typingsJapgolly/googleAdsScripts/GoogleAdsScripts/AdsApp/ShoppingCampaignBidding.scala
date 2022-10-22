package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to a shopping campaign's bidding fields. */
trait ShoppingCampaignBidding extends StObject {
  
  /** Returns the flexible bidding strategy of the shopping campaign. */
  def getStrategy(): BiddingStrategy
  
  /** Returns the bidding strategy source of this shopping campaign. */
  def getStrategySource(): String
  
  /** Returns the bidding strategy type of this shopping campaign. */
  def getStrategyType(): String
  
  /** Sets the bidding strategy of this shopping campaign to the specified standard bidding strategy. */
  def setStrategy(biddingStrategy: String): Unit
}
object ShoppingCampaignBidding {
  
  inline def apply(
    getStrategy: CallbackTo[BiddingStrategy],
    getStrategySource: CallbackTo[String],
    getStrategyType: CallbackTo[String],
    setStrategy: String => Callback
  ): ShoppingCampaignBidding = {
    val __obj = js.Dynamic.literal(getStrategy = getStrategy.toJsFn, getStrategySource = getStrategySource.toJsFn, getStrategyType = getStrategyType.toJsFn, setStrategy = js.Any.fromFunction1((t0: String) => setStrategy(t0).runNow()))
    __obj.asInstanceOf[ShoppingCampaignBidding]
  }
  
  extension [Self <: ShoppingCampaignBidding](x: Self) {
    
    inline def setGetStrategy(value: CallbackTo[BiddingStrategy]): Self = StObject.set(x, "getStrategy", value.toJsFn)
    
    inline def setGetStrategySource(value: CallbackTo[String]): Self = StObject.set(x, "getStrategySource", value.toJsFn)
    
    inline def setGetStrategyType(value: CallbackTo[String]): Self = StObject.set(x, "getStrategyType", value.toJsFn)
    
    inline def setSetStrategy(value: String => Callback): Self = StObject.set(x, "setStrategy", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
