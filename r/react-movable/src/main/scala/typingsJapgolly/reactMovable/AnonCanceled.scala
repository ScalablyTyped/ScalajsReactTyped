package typingsJapgolly.reactMovable

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCanceled extends js.Object {
  def canceled(position: Double): String
  def dropped(from: Double, to: Double): String
  def item(position: Double): String
  def lifted(position: Double): String
  def moved(position: Double, up: Boolean): String
}

object AnonCanceled {
  @scala.inline
  def apply(
    canceled: Double => CallbackTo[String],
    dropped: (Double, Double) => CallbackTo[String],
    item: Double => CallbackTo[String],
    lifted: Double => CallbackTo[String],
    moved: (Double, Boolean) => CallbackTo[String]
  ): AnonCanceled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canceled")(js.Any.fromFunction1((t0: scala.Double) => canceled(t0).runNow()))
    __obj.updateDynamic("dropped")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => dropped(t0, t1).runNow()))
    __obj.updateDynamic("item")(js.Any.fromFunction1((t0: scala.Double) => item(t0).runNow()))
    __obj.updateDynamic("lifted")(js.Any.fromFunction1((t0: scala.Double) => lifted(t0).runNow()))
    __obj.updateDynamic("moved")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => moved(t0, t1).runNow()))
    __obj.asInstanceOf[AnonCanceled]
  }
}

