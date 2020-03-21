package typingsJapgolly.yadda

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofScenarioLevelPlugin extends js.Object {
  def init(options: js.Any): Unit
}

object TypeofScenarioLevelPlugin {
  @scala.inline
  def apply(init: js.Any => Callback): TypeofScenarioLevelPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(js.Any.fromFunction1((t0: js.Any) => init(t0).runNow()))
    __obj.asInstanceOf[TypeofScenarioLevelPlugin]
  }
}

