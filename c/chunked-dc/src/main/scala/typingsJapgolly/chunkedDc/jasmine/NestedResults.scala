package typingsJapgolly.chunkedDc.jasmine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NestedResults
  extends StObject
     with Result {
  
  def addResult(result: Result): Unit
  
  var description: String
  
  var failedCount: Double
  
  def getItems(): js.Array[Result]
  
  def log(values: scala.Any): Unit
  
  def passed(): Boolean
  
  var passedCount: Double
  
  def rollupCounts(result: NestedResults): Unit
  
  var skipped: Boolean
  
  var totalCount: Double
}
object NestedResults {
  
  inline def apply(
    addResult: Result => Callback,
    description: String,
    failedCount: Double,
    getItems: CallbackTo[js.Array[Result]],
    log: scala.Any => Callback,
    passed: CallbackTo[Boolean],
    passedCount: Double,
    rollupCounts: NestedResults => Callback,
    skipped: Boolean,
    totalCount: Double,
    `type`: String
  ): NestedResults = {
    val __obj = js.Dynamic.literal(addResult = js.Any.fromFunction1((t0: Result) => addResult(t0).runNow()), description = description.asInstanceOf[js.Any], failedCount = failedCount.asInstanceOf[js.Any], getItems = getItems.toJsFn, log = js.Any.fromFunction1((t0: scala.Any) => log(t0).runNow()), passed = passed.toJsFn, passedCount = passedCount.asInstanceOf[js.Any], rollupCounts = js.Any.fromFunction1((t0: NestedResults) => rollupCounts(t0).runNow()), skipped = skipped.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedResults]
  }
  
  extension [Self <: NestedResults](x: Self) {
    
    inline def setAddResult(value: Result => Callback): Self = StObject.set(x, "addResult", js.Any.fromFunction1((t0: Result) => value(t0).runNow()))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFailedCount(value: Double): Self = StObject.set(x, "failedCount", value.asInstanceOf[js.Any])
    
    inline def setGetItems(value: CallbackTo[js.Array[Result]]): Self = StObject.set(x, "getItems", value.toJsFn)
    
    inline def setLog(value: scala.Any => Callback): Self = StObject.set(x, "log", js.Any.fromFunction1((t0: scala.Any) => value(t0).runNow()))
    
    inline def setPassed(value: CallbackTo[Boolean]): Self = StObject.set(x, "passed", value.toJsFn)
    
    inline def setPassedCount(value: Double): Self = StObject.set(x, "passedCount", value.asInstanceOf[js.Any])
    
    inline def setRollupCounts(value: NestedResults => Callback): Self = StObject.set(x, "rollupCounts", js.Any.fromFunction1((t0: NestedResults) => value(t0).runNow()))
    
    inline def setSkipped(value: Boolean): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
    
    inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
  }
}
