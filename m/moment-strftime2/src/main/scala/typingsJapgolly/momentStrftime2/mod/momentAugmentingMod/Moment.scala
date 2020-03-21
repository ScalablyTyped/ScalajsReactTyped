package typingsJapgolly.momentStrftime2.mod.momentAugmentingMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Moment extends js.Object {
  def strftime(pattern: String): String
}

object Moment {
  @scala.inline
  def apply(strftime: String => CallbackTo[String]): Moment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("strftime")(js.Any.fromFunction1((t0: java.lang.String) => strftime(t0).runNow()))
    __obj.asInstanceOf[Moment]
  }
}

