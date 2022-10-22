package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayBidding
  extends StObject
     with AdWordsBidding {
  
  def clearCpc(): Unit
  
  def clearCpm(): Unit
  
  def getCpc(): Double
  
  def getCpm(): Double
  
  def setCpc(cpc: Double): Unit
  
  def setCpm(cpm: Double): Unit
}
object DisplayBidding {
  
  inline def apply(
    clearCpc: Callback,
    clearCpm: Callback,
    getCpc: CallbackTo[Double],
    getCpm: CallbackTo[Double],
    getStrategy: CallbackTo[BiddingStrategy],
    getStrategySource: CallbackTo[BiddingStrategySource],
    getStrategyType: CallbackTo[String],
    setCpc: Double => Callback,
    setCpm: Double => Callback
  ): DisplayBidding = {
    val __obj = js.Dynamic.literal(clearCpc = clearCpc.toJsFn, clearCpm = clearCpm.toJsFn, getCpc = getCpc.toJsFn, getCpm = getCpm.toJsFn, getStrategy = getStrategy.toJsFn, getStrategySource = getStrategySource.toJsFn, getStrategyType = getStrategyType.toJsFn, setCpc = js.Any.fromFunction1((t0: Double) => setCpc(t0).runNow()), setCpm = js.Any.fromFunction1((t0: Double) => setCpm(t0).runNow()))
    __obj.asInstanceOf[DisplayBidding]
  }
  
  extension [Self <: DisplayBidding](x: Self) {
    
    inline def setClearCpc(value: Callback): Self = StObject.set(x, "clearCpc", value.toJsFn)
    
    inline def setClearCpm(value: Callback): Self = StObject.set(x, "clearCpm", value.toJsFn)
    
    inline def setGetCpc(value: CallbackTo[Double]): Self = StObject.set(x, "getCpc", value.toJsFn)
    
    inline def setGetCpm(value: CallbackTo[Double]): Self = StObject.set(x, "getCpm", value.toJsFn)
    
    inline def setSetCpc(value: Double => Callback): Self = StObject.set(x, "setCpc", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetCpm(value: Double => Callback): Self = StObject.set(x, "setCpm", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
