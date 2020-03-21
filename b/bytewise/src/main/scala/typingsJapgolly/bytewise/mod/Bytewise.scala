package typingsJapgolly.bytewise.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bytewise
  extends /* k */ StringDictionary[js.Any] {
  def decode(value: Buffer): js.Any
  def encode(value: js.Any): Buffer
}

object Bytewise {
  @scala.inline
  def apply(
    decode: Buffer => CallbackTo[js.Any],
    encode: js.Any => CallbackTo[Buffer],
    StringDictionary: /* k */ StringDictionary[js.Any] = null
  ): Bytewise = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: typingsJapgolly.node.Buffer) => decode(t0).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: js.Any) => encode(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Bytewise]
  }
}

