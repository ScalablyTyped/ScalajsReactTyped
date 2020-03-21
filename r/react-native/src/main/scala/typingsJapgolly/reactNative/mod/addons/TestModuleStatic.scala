package typingsJapgolly.reactNative.mod.addons

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestModuleStatic extends js.Object {
  def markTestCompleted(): Unit
  def markTestPassed(indicator: js.Any): Unit
  def verifySnapshot(done: js.Function1[/* indicator */ js.UndefOr[js.Any], Unit]): Unit
}

object TestModuleStatic {
  @scala.inline
  def apply(
    markTestCompleted: Callback,
    markTestPassed: js.Any => Callback,
    verifySnapshot: js.Function1[/* indicator */ js.UndefOr[js.Any], Unit] => Callback
  ): TestModuleStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("markTestCompleted")(markTestCompleted.toJsFn)
    __obj.updateDynamic("markTestPassed")(js.Any.fromFunction1((t0: js.Any) => markTestPassed(t0).runNow()))
    __obj.updateDynamic("verifySnapshot")(js.Any.fromFunction1((t0: js.Function1[/* indicator */ js.UndefOr[js.Any], scala.Unit]) => verifySnapshot(t0).runNow()))
    __obj.asInstanceOf[TestModuleStatic]
  }
}

