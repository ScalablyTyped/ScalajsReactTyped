package typingsJapgolly.jestCore.testSchedulerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestSchedulerOptions extends js.Object {
  def startRun(globalConfig: GlobalConfig): Unit
}

object TestSchedulerOptions {
  @scala.inline
  def apply(startRun: GlobalConfig => Callback): TestSchedulerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("startRun")(js.Any.fromFunction1((t0: typingsJapgolly.jestTypes.configMod.GlobalConfig) => startRun(t0).runNow()))
    __obj.asInstanceOf[TestSchedulerOptions]
  }
}

