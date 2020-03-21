package typingsJapgolly.cryptoJs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cryptoJs.mod.LibWordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreate extends js.Object {
  def create(v: js.Any): LibWordArray
  def random(v: Double): String
}

object AnonCreate {
  @scala.inline
  def apply(create: js.Any => CallbackTo[LibWordArray], random: Double => CallbackTo[String]): AnonCreate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: js.Any) => create(t0).runNow()))
    __obj.updateDynamic("random")(js.Any.fromFunction1((t0: scala.Double) => random(t0).runNow()))
    __obj.asInstanceOf[AnonCreate]
  }
}

