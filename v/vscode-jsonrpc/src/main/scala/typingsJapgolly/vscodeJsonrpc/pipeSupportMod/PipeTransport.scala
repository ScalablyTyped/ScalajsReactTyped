package typingsJapgolly.vscodeJsonrpc.pipeSupportMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscodeJsonrpc.Thenable
import typingsJapgolly.vscodeJsonrpc.messageReaderMod.MessageReader
import typingsJapgolly.vscodeJsonrpc.messageWriterMod.MessageWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeTransport extends js.Object {
  def onConnected(): Thenable[js.Tuple2[MessageReader, MessageWriter]]
}

object PipeTransport {
  @scala.inline
  def apply(onConnected: CallbackTo[Thenable[js.Tuple2[MessageReader, MessageWriter]]]): PipeTransport = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onConnected")(onConnected.toJsFn)
    __obj.asInstanceOf[PipeTransport]
  }
}

