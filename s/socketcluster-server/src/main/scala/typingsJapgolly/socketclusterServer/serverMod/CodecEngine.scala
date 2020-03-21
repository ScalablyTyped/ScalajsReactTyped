package typingsJapgolly.socketclusterServer.serverMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodecEngine extends js.Object {
  def decode(input: js.Any): js.Any
  def encode(`object`: js.Any): js.Any
}

object CodecEngine {
  @scala.inline
  def apply(decode: js.Any => CallbackTo[js.Any], encode: js.Any => CallbackTo[js.Any]): CodecEngine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: js.Any) => decode(t0).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: js.Any) => encode(t0).runNow()))
    __obj.asInstanceOf[CodecEngine]
  }
}

