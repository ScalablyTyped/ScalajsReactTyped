package typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage

import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.history_request
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'history_request'` message.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#history).
  *
  * **See also:** [[IHistoryReplyMsg]], [[[IKernel.history]]]
  */
trait IHistoryRequestMsg
  extends IShellMessage[history_request]
     with _Message {
  @JSName("content")
  var content_IHistoryRequestMsg: IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail
}

object IHistoryRequestMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail,
    header: IHeader[history_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[
      scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView
    ] = null
  ): IHistoryRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHistoryRequestMsg]
  }
}

