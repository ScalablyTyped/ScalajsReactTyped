package typingsJapgolly.clearbladejsClient.CbClient

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resp extends js.Object {
  def error(msg: js.Any): scala.Nothing
   // todo: figure out if we can have the compiler throw an error if someone adds code after this
  def success(msg: js.Any): scala.Nothing
}

object Resp {
  @scala.inline
  def apply(error: js.Any => CallbackTo[scala.Nothing], success: js.Any => CallbackTo[scala.Nothing]): Resp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: js.Any) => error(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[Resp]
  }
}

