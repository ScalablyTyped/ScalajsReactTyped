package typingsJapgolly.nodeJose.mod.JWE

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encryptor extends js.Object {
  def `final`(): js.Promise[String]
  def update(input: js.Any): this.type
}

object Encryptor {
  @scala.inline
  def apply(`final`: CallbackTo[js.Promise[String]], update: js.Any => CallbackTo[Encryptor]): Encryptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("final")(`final`.toJsFn)
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: js.Any) => update(t0).runNow()))
    __obj.asInstanceOf[Encryptor]
  }
}

