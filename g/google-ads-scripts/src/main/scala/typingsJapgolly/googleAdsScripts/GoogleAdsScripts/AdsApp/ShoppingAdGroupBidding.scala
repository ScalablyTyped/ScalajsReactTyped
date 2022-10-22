package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShoppingAdGroupBidding extends StObject {
  
  /** Returns the max CPC bid for this shopping ad group. */
  def getCpc(): Double
  
  /** Returns the flexible bidding strategy of the shopping ad group. */
  def getStrategy(): BiddingStrategy
  
  /**
    * Returns the bidding strategy source of this shopping ad group.
    *
    * @deprecated **Deprecated**. Google Ads does not support setting bidding strategies at different levels. As a result, 'CAMPAIGN' is the only possible source for bidding strategies.
    */
  def getStrategySource(): String
  
  /** Returns the bidding strategy type of this shopping ad group. */
  def getStrategyType(): String
  
  /** Sets the max CPC bid for this shopping ad group. */
  def setCpc(cpc: Double): Unit
}
object ShoppingAdGroupBidding {
  
  inline def apply(
    getCpc: CallbackTo[Double],
    getStrategy: CallbackTo[BiddingStrategy],
    getStrategySource: CallbackTo[String],
    getStrategyType: CallbackTo[String],
    setCpc: Double => Callback
  ): ShoppingAdGroupBidding = {
    val __obj = js.Dynamic.literal(getCpc = getCpc.toJsFn, getStrategy = getStrategy.toJsFn, getStrategySource = getStrategySource.toJsFn, getStrategyType = getStrategyType.toJsFn, setCpc = js.Any.fromFunction1((t0: Double) => setCpc(t0).runNow()))
    __obj.asInstanceOf[ShoppingAdGroupBidding]
  }
  
  extension [Self <: ShoppingAdGroupBidding](x: Self) {
    
    inline def setGetCpc(value: CallbackTo[Double]): Self = StObject.set(x, "getCpc", value.toJsFn)
    
    inline def setGetStrategy(value: CallbackTo[BiddingStrategy]): Self = StObject.set(x, "getStrategy", value.toJsFn)
    
    inline def setGetStrategySource(value: CallbackTo[String]): Self = StObject.set(x, "getStrategySource", value.toJsFn)
    
    inline def setGetStrategyType(value: CallbackTo[String]): Self = StObject.set(x, "getStrategyType", value.toJsFn)
    
    inline def setSetCpc(value: Double => Callback): Self = StObject.set(x, "setCpc", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
