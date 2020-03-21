package typingsJapgolly.twix.mod.momentAugmentingMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  def afterMoment(date: String): String
  def beforeMoment(date: String): String
}

object Duration {
  @scala.inline
  def apply(afterMoment: String => CallbackTo[String], beforeMoment: String => CallbackTo[String]): Duration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("afterMoment")(js.Any.fromFunction1((t0: java.lang.String) => afterMoment(t0).runNow()))
    __obj.updateDynamic("beforeMoment")(js.Any.fromFunction1((t0: java.lang.String) => beforeMoment(t0).runNow()))
    __obj.asInstanceOf[Duration]
  }
}

