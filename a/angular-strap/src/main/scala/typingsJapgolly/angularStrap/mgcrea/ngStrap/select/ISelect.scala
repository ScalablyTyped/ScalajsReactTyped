package typingsJapgolly.angularStrap.mgcrea.ngStrap.select

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelect extends js.Object {
  def active(index: Double): Double
  def hide(): Unit
  def select(index: Double): Unit
  def show(): Unit
  def update(matches: js.Any): Unit
}

object ISelect {
  @scala.inline
  def apply(
    active: Double => CallbackTo[Double],
    hide: Callback,
    select: Double => Callback,
    show: Callback,
    update: js.Any => Callback
  ): ISelect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(js.Any.fromFunction1((t0: scala.Double) => active(t0).runNow()))
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("select")(js.Any.fromFunction1((t0: scala.Double) => select(t0).runNow()))
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: js.Any) => update(t0).runNow()))
    __obj.asInstanceOf[ISelect]
  }
}

