package typingsJapgolly.baseX.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseConverter extends js.Object {
  def decode(string: String): Buffer
  def decodeUnsafe(string: String): js.UndefOr[Buffer]
  def encode(buffer: Buffer): String
}

object BaseConverter {
  @scala.inline
  def apply(
    decode: String => CallbackTo[Buffer],
    decodeUnsafe: String => CallbackTo[js.UndefOr[Buffer]],
    encode: Buffer => CallbackTo[String]
  ): BaseConverter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: java.lang.String) => decode(t0).runNow()))
    __obj.updateDynamic("decodeUnsafe")(js.Any.fromFunction1((t0: java.lang.String) => decodeUnsafe(t0).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: typingsJapgolly.node.Buffer) => encode(t0).runNow()))
    __obj.asInstanceOf[BaseConverter]
  }
}

