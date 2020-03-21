package typingsJapgolly.clearbladejsServer.CbServer

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resp_ extends js.Object {
  def error(msg: js.Any): scala.Nothing
  def success(msg: js.Any): scala.Nothing
}

object Resp_ {
  @scala.inline
  def apply(error: js.Any => CallbackTo[scala.Nothing], success: js.Any => CallbackTo[scala.Nothing]): Resp_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: js.Any) => error(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[Resp_]
  }
}

