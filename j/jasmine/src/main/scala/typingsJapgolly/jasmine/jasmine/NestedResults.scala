package typingsJapgolly.jasmine.jasmine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedResults extends Result {
  var description: String
  var failedCount: Double
  var passedCount: Double
  var skipped: Boolean
  var totalCount: Double
  def addResult(result: Result): Unit
  def getItems(): js.Array[Result]
  def log(values: js.Any): Unit
  def passed(): Boolean
  def rollupCounts(result: NestedResults): Unit
}

object NestedResults {
  @scala.inline
  def apply(
    addResult: Result => Callback,
    description: String,
    failedCount: Double,
    getItems: CallbackTo[js.Array[Result]],
    log: js.Any => Callback,
    passed: CallbackTo[Boolean],
    passedCount: Double,
    rollupCounts: NestedResults => Callback,
    skipped: Boolean,
    totalCount: Double,
    `type`: String
  ): NestedResults = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], failedCount = failedCount.asInstanceOf[js.Any], passedCount = passedCount.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.updateDynamic("addResult")(js.Any.fromFunction1((t0: typingsJapgolly.jasmine.jasmine.Result) => addResult(t0).runNow()))
    __obj.updateDynamic("getItems")(getItems.toJsFn)
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: js.Any) => log(t0).runNow()))
    __obj.updateDynamic("passed")(passed.toJsFn)
    __obj.updateDynamic("rollupCounts")(js.Any.fromFunction1((t0: typingsJapgolly.jasmine.jasmine.NestedResults) => rollupCounts(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedResults]
  }
}

