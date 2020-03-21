package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofss7ops extends js.Object {
  def isup_to_json(proto: Double): Double
}

object Typeofss7ops {
  @scala.inline
  def apply(isup_to_json: Double => CallbackTo[Double]): Typeofss7ops = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isup_to_json")(js.Any.fromFunction1((t0: scala.Double) => isup_to_json(t0).runNow()))
    __obj.asInstanceOf[Typeofss7ops]
  }
}

