package typingsJapgolly.nodeJose.mod.JWK

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWEEncryptor extends js.Object {
  def `final`(): js.Promise[String]
  def update(input: js.Any): this.type
}

object JWEEncryptor {
  @scala.inline
  def apply(`final`: CallbackTo[js.Promise[String]], update: js.Any => CallbackTo[JWEEncryptor]): JWEEncryptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("final")(`final`.toJsFn)
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: js.Any) => update(t0).runNow()))
    __obj.asInstanceOf[JWEEncryptor]
  }
}

