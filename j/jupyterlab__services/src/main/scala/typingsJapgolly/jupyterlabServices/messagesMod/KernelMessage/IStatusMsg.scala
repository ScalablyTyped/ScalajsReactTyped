package typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage

import typingsJapgolly.jupyterlabServices.AnonExecutionstate
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.status
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'status'` message on the `'iopub'` channel.
  *
  * See [Kernel status](https://jupyter-client.readthedocs.io/en/latest/messaging.html#kernel-status).
  */
trait IStatusMsg
  extends IIOPubMessage[status]
     with _Message {
  @JSName("content")
  var content_IStatusMsg: AnonExecutionstate
}

object IStatusMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: AnonExecutionstate,
    header: IHeader[status],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[
      scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView
    ] = null
  ): IStatusMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStatusMsg]
  }
}

