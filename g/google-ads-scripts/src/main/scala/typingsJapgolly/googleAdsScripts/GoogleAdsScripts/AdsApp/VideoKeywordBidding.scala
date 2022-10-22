package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to a video criterion's bidding fields. */
trait VideoKeywordBidding extends StObject {
  
  /** Clears the max CPV bid for this video keyword. */
  def clearCpv(): Unit
  
  /** Returns the max CPV bid for this video keyword. */
  def getCpv(): Double
  
  /**
    * Returns the bidding strategy source of this video criterion.
    *
    * @deprecated **Deprecated**. Google Ads does not support setting bidding strategies at different levels. As a result, 'CAMPAIGN' is the only possible source for bidding strategies.
    */
  def getStrategySource(): String
  
  /** Returns the bidding strategy type of this video criterion. */
  def getStrategyType(): String
  
  /** Sets the max CPV bid for this video keyword. */
  def setCpv(cpv: Double): Unit
}
object VideoKeywordBidding {
  
  inline def apply(
    clearCpv: Callback,
    getCpv: CallbackTo[Double],
    getStrategySource: CallbackTo[String],
    getStrategyType: CallbackTo[String],
    setCpv: Double => Callback
  ): VideoKeywordBidding = {
    val __obj = js.Dynamic.literal(clearCpv = clearCpv.toJsFn, getCpv = getCpv.toJsFn, getStrategySource = getStrategySource.toJsFn, getStrategyType = getStrategyType.toJsFn, setCpv = js.Any.fromFunction1((t0: Double) => setCpv(t0).runNow()))
    __obj.asInstanceOf[VideoKeywordBidding]
  }
  
  extension [Self <: VideoKeywordBidding](x: Self) {
    
    inline def setClearCpv(value: Callback): Self = StObject.set(x, "clearCpv", value.toJsFn)
    
    inline def setGetCpv(value: CallbackTo[Double]): Self = StObject.set(x, "getCpv", value.toJsFn)
    
    inline def setGetStrategySource(value: CallbackTo[String]): Self = StObject.set(x, "getStrategySource", value.toJsFn)
    
    inline def setGetStrategyType(value: CallbackTo[String]): Self = StObject.set(x, "getStrategyType", value.toJsFn)
    
    inline def setSetCpv(value: Double => Callback): Self = StObject.set(x, "setCpv", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
