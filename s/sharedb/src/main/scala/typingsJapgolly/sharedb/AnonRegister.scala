package typingsJapgolly.sharedb

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRegister extends js.Object {
  def register(`type`: AnonDictkey): Unit
}

object AnonRegister {
  @scala.inline
  def apply(register: AnonDictkey => Callback): AnonRegister = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("register")(js.Any.fromFunction1((t0: typingsJapgolly.sharedb.AnonDictkey) => register(t0).runNow()))
    __obj.asInstanceOf[AnonRegister]
  }
}

