package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to a keyword's bidding fields. */
trait KeywordBidding extends StObject {
  
  /** Clears the max CPC bid for this keyword. */
  def clearCpc(): Unit
  
  /** Clears the CPM bid for this keyword. */
  def clearCpm(): Unit
  
  /** Returns the max CPC bid for this keyword. */
  def getCpc(): Double
  
  /** Returns the CPM bid for this keyword. */
  def getCpm(): Double
  
  /** Returns the flexible bidding strategy of the keyword. */
  def getStrategy(): BiddingStrategy
  
  /** Returns the bidding strategy source of this keyword. */
  def getStrategySource(): String
  
  /** Returns the bidding strategy type of this keyword. */
  def getStrategyType(): String
  
  /** Sets the max CPC bid for this keyword. */
  def setCpc(cpc: Double): Unit
  
  /** Sets the CPM bid for this keyword. */
  def setCpm(cpm: Double): Unit
}
object KeywordBidding {
  
  inline def apply(
    clearCpc: Callback,
    clearCpm: Callback,
    getCpc: CallbackTo[Double],
    getCpm: CallbackTo[Double],
    getStrategy: CallbackTo[BiddingStrategy],
    getStrategySource: CallbackTo[String],
    getStrategyType: CallbackTo[String],
    setCpc: Double => Callback,
    setCpm: Double => Callback
  ): KeywordBidding = {
    val __obj = js.Dynamic.literal(clearCpc = clearCpc.toJsFn, clearCpm = clearCpm.toJsFn, getCpc = getCpc.toJsFn, getCpm = getCpm.toJsFn, getStrategy = getStrategy.toJsFn, getStrategySource = getStrategySource.toJsFn, getStrategyType = getStrategyType.toJsFn, setCpc = js.Any.fromFunction1((t0: Double) => setCpc(t0).runNow()), setCpm = js.Any.fromFunction1((t0: Double) => setCpm(t0).runNow()))
    __obj.asInstanceOf[KeywordBidding]
  }
  
  extension [Self <: KeywordBidding](x: Self) {
    
    inline def setClearCpc(value: Callback): Self = StObject.set(x, "clearCpc", value.toJsFn)
    
    inline def setClearCpm(value: Callback): Self = StObject.set(x, "clearCpm", value.toJsFn)
    
    inline def setGetCpc(value: CallbackTo[Double]): Self = StObject.set(x, "getCpc", value.toJsFn)
    
    inline def setGetCpm(value: CallbackTo[Double]): Self = StObject.set(x, "getCpm", value.toJsFn)
    
    inline def setGetStrategy(value: CallbackTo[BiddingStrategy]): Self = StObject.set(x, "getStrategy", value.toJsFn)
    
    inline def setGetStrategySource(value: CallbackTo[String]): Self = StObject.set(x, "getStrategySource", value.toJsFn)
    
    inline def setGetStrategyType(value: CallbackTo[String]): Self = StObject.set(x, "getStrategyType", value.toJsFn)
    
    inline def setSetCpc(value: Double => Callback): Self = StObject.set(x, "setCpc", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetCpm(value: Double => Callback): Self = StObject.set(x, "setCpm", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
