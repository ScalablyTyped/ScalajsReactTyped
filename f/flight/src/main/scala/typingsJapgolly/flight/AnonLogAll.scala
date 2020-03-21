package typingsJapgolly.flight

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLogAll extends js.Object {
  def logAll(): Unit
  def logByAction(action: String): Unit
  def logByName(name: String): Unit
  def logNone(): Unit
}

object AnonLogAll {
  @scala.inline
  def apply(
    logAll: Callback,
    logByAction: String => Callback,
    logByName: String => Callback,
    logNone: Callback
  ): AnonLogAll = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("logAll")(logAll.toJsFn)
    __obj.updateDynamic("logByAction")(js.Any.fromFunction1((t0: java.lang.String) => logByAction(t0).runNow()))
    __obj.updateDynamic("logByName")(js.Any.fromFunction1((t0: java.lang.String) => logByName(t0).runNow()))
    __obj.updateDynamic("logNone")(logNone.toJsFn)
    __obj.asInstanceOf[AnonLogAll]
  }
}

