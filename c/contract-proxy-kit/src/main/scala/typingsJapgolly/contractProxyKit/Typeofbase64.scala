package typingsJapgolly.contractProxyKit

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ethers.typesMod.Arrayish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofbase64 extends js.Object {
  def decode(textData: String): scala.scalajs.js.typedarray.Uint8Array
  def encode(data: Arrayish): String
}

object Typeofbase64 {
  @scala.inline
  def apply(
    decode: String => CallbackTo[scala.scalajs.js.typedarray.Uint8Array],
    encode: Arrayish => CallbackTo[String]
  ): Typeofbase64 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: java.lang.String) => decode(t0).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: typingsJapgolly.ethers.typesMod.Arrayish) => encode(t0).runNow()))
    __obj.asInstanceOf[Typeofbase64]
  }
}

