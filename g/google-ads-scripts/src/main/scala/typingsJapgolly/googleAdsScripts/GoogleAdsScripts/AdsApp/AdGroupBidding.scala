package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to an AdGroup's bidding fields. */
trait AdGroupBidding extends StObject {
  
  /** Returns the Target CPA bid for this ad group. */
  def getCpa(): Double
  
  /** Returns the max CPC bid for this ad group. */
  def getCpc(): Double
  
  /** Returns the CPM bid for this ad group. */
  def getCpm(): Double
  
  /** Returns the flexible bidding strategy of the ad group. */
  def getStrategy(): BiddingStrategy
  
  /** Returns the bidding strategy source of this ad group. */
  def getStrategySource(): String
  
  /** Returns the bidding strategy type of this ad group. */
  def getStrategyType(): String
  
  /** Sets the Target CPA bid for this ad group. */
  def setCpa(cpa: Double): Unit
  
  /** Sets the max CPC bid for this ad group. */
  def setCpc(cpc: Double): Unit
  
  /** Sets the CPM bid for this ad group. */
  def setCpm(cpm: Double): Unit
}
object AdGroupBidding {
  
  inline def apply(
    getCpa: CallbackTo[Double],
    getCpc: CallbackTo[Double],
    getCpm: CallbackTo[Double],
    getStrategy: CallbackTo[BiddingStrategy],
    getStrategySource: CallbackTo[String],
    getStrategyType: CallbackTo[String],
    setCpa: Double => Callback,
    setCpc: Double => Callback,
    setCpm: Double => Callback
  ): AdGroupBidding = {
    val __obj = js.Dynamic.literal(getCpa = getCpa.toJsFn, getCpc = getCpc.toJsFn, getCpm = getCpm.toJsFn, getStrategy = getStrategy.toJsFn, getStrategySource = getStrategySource.toJsFn, getStrategyType = getStrategyType.toJsFn, setCpa = js.Any.fromFunction1((t0: Double) => setCpa(t0).runNow()), setCpc = js.Any.fromFunction1((t0: Double) => setCpc(t0).runNow()), setCpm = js.Any.fromFunction1((t0: Double) => setCpm(t0).runNow()))
    __obj.asInstanceOf[AdGroupBidding]
  }
  
  extension [Self <: AdGroupBidding](x: Self) {
    
    inline def setGetCpa(value: CallbackTo[Double]): Self = StObject.set(x, "getCpa", value.toJsFn)
    
    inline def setGetCpc(value: CallbackTo[Double]): Self = StObject.set(x, "getCpc", value.toJsFn)
    
    inline def setGetCpm(value: CallbackTo[Double]): Self = StObject.set(x, "getCpm", value.toJsFn)
    
    inline def setGetStrategy(value: CallbackTo[BiddingStrategy]): Self = StObject.set(x, "getStrategy", value.toJsFn)
    
    inline def setGetStrategySource(value: CallbackTo[String]): Self = StObject.set(x, "getStrategySource", value.toJsFn)
    
    inline def setGetStrategyType(value: CallbackTo[String]): Self = StObject.set(x, "getStrategyType", value.toJsFn)
    
    inline def setSetCpa(value: Double => Callback): Self = StObject.set(x, "setCpa", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetCpc(value: Double => Callback): Self = StObject.set(x, "setCpc", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetCpm(value: Double => Callback): Self = StObject.set(x, "setCpm", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
