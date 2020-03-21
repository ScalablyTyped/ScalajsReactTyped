package typingsJapgolly.qunitDom.testAssertionsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestAssertions extends js.Object {
  var results: js.Array[_]
  def dom(target: js.Any, rootElement: js.Any): typingsJapgolly.qunitDom.assertionsMod.default
  def pushResult(result: js.Any): Unit
}

object TestAssertions {
  @scala.inline
  def apply(
    dom: (js.Any, js.Any) => CallbackTo[typingsJapgolly.qunitDom.assertionsMod.default],
    pushResult: js.Any => Callback,
    results: js.Array[_]
  ): TestAssertions = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.updateDynamic("dom")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => dom(t0, t1).runNow()))
    __obj.updateDynamic("pushResult")(js.Any.fromFunction1((t0: js.Any) => pushResult(t0).runNow()))
    __obj.asInstanceOf[TestAssertions]
  }
}

