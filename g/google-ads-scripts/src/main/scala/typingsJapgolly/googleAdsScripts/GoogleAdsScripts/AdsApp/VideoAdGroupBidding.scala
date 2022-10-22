package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to a video ad group's bidding fields. */
trait VideoAdGroupBidding extends StObject {
  
  /** Returns the Target CPA bid for this video ad group. */
  def getCpa(): Double
  
  /** Returns the CPM bid for this video ad group. */
  def getCpm(): Double
  
  /** Returns the max CPV bid for this video ad group. */
  def getCpv(): Double
  
  /**
    * Returns the bidding strategy source of this video ad group.
    *
    * @deprecated **Deprecated**. Google Ads does not support setting bidding strategies at different levels. As a result, 'CAMPAIGN' is the only possible source for bidding strategies.
    */
  def getStrategySource(): String
  
  /** Returns the bidding strategy type of this video ad group. */
  def getStrategyType(): String
  
  /** Returns the Target CPM bid for this video ad group. */
  def getTargetCpm(): Double
  
  /** Sets the Target CPA bid for this video ad group. */
  def setCpa(cpa: Double): Unit
  
  /** Sets the CPM bid for this video ad group. */
  def setCpm(cpm: Double): Unit
  
  /** Sets the max CPV bid for this video ad group. */
  def setCpv(cpv: Double): Unit
  
  /** Sets the Target CPM bid for this video ad group. */
  def setTargetCpm(cpm: Double): Unit
}
object VideoAdGroupBidding {
  
  inline def apply(
    getCpa: CallbackTo[Double],
    getCpm: CallbackTo[Double],
    getCpv: CallbackTo[Double],
    getStrategySource: CallbackTo[String],
    getStrategyType: CallbackTo[String],
    getTargetCpm: CallbackTo[Double],
    setCpa: Double => Callback,
    setCpm: Double => Callback,
    setCpv: Double => Callback,
    setTargetCpm: Double => Callback
  ): VideoAdGroupBidding = {
    val __obj = js.Dynamic.literal(getCpa = getCpa.toJsFn, getCpm = getCpm.toJsFn, getCpv = getCpv.toJsFn, getStrategySource = getStrategySource.toJsFn, getStrategyType = getStrategyType.toJsFn, getTargetCpm = getTargetCpm.toJsFn, setCpa = js.Any.fromFunction1((t0: Double) => setCpa(t0).runNow()), setCpm = js.Any.fromFunction1((t0: Double) => setCpm(t0).runNow()), setCpv = js.Any.fromFunction1((t0: Double) => setCpv(t0).runNow()), setTargetCpm = js.Any.fromFunction1((t0: Double) => setTargetCpm(t0).runNow()))
    __obj.asInstanceOf[VideoAdGroupBidding]
  }
  
  extension [Self <: VideoAdGroupBidding](x: Self) {
    
    inline def setGetCpa(value: CallbackTo[Double]): Self = StObject.set(x, "getCpa", value.toJsFn)
    
    inline def setGetCpm(value: CallbackTo[Double]): Self = StObject.set(x, "getCpm", value.toJsFn)
    
    inline def setGetCpv(value: CallbackTo[Double]): Self = StObject.set(x, "getCpv", value.toJsFn)
    
    inline def setGetStrategySource(value: CallbackTo[String]): Self = StObject.set(x, "getStrategySource", value.toJsFn)
    
    inline def setGetStrategyType(value: CallbackTo[String]): Self = StObject.set(x, "getStrategyType", value.toJsFn)
    
    inline def setGetTargetCpm(value: CallbackTo[Double]): Self = StObject.set(x, "getTargetCpm", value.toJsFn)
    
    inline def setSetCpa(value: Double => Callback): Self = StObject.set(x, "setCpa", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetCpm(value: Double => Callback): Self = StObject.set(x, "setCpm", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetCpv(value: Double => Callback): Self = StObject.set(x, "setCpv", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetTargetCpm(value: Double => Callback): Self = StObject.set(x, "setTargetCpm", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
