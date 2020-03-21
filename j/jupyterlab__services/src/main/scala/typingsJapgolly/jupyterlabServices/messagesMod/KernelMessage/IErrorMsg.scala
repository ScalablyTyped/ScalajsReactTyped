package typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage

import typingsJapgolly.jupyterlabServices.AnonEname
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.error
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'error'` message on the `'iopub'` channel.
  *
  * See [Execution errors](https://jupyter-client.readthedocs.io/en/latest/messaging.html#execution-errors).
  */
trait IErrorMsg
  extends IIOPubMessage[error]
     with _Message {
  @JSName("content")
  var content_IErrorMsg: AnonEname
}

object IErrorMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: AnonEname,
    header: IHeader[error],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[
      scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView
    ] = null
  ): IErrorMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IErrorMsg]
  }
}

