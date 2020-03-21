package typingsJapgolly.easyXapiSupertest.stringDecoderMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeStringDecoder extends js.Object {
  def detectIncompleteChar(buffer: Buffer): Double
  def write(buffer: Buffer): String
}

object NodeStringDecoder {
  @scala.inline
  def apply(detectIncompleteChar: Buffer => CallbackTo[Double], write: Buffer => CallbackTo[String]): NodeStringDecoder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("detectIncompleteChar")(js.Any.fromFunction1((t0: typingsJapgolly.node.Buffer) => detectIncompleteChar(t0).runNow()))
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: typingsJapgolly.node.Buffer) => write(t0).runNow()))
    __obj.asInstanceOf[NodeStringDecoder]
  }
}

