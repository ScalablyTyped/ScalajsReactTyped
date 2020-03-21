package typingsJapgolly.levelCodec.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodecEncoder extends js.Object {
  var buffer: Boolean
  var `type`: String
  def decode(`val`: js.Any): js.Any
  def encode(`val`: js.Any): js.Any
}

object CodecEncoder {
  @scala.inline
  def apply(
    buffer: Boolean,
    decode: js.Any => CallbackTo[js.Any],
    encode: js.Any => CallbackTo[js.Any],
    `type`: String
  ): CodecEncoder = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
    __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: js.Any) => decode(t0).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: js.Any) => encode(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodecEncoder]
  }
}

