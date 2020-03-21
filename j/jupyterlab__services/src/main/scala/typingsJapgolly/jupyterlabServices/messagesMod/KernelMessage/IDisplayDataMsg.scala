package typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage

import typingsJapgolly.jupyterlabServices.AnonData
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.display_data
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'display_data'` message on the `'iopub'` channel.
  *
  * See [Display data](https://jupyter-client.readthedocs.io/en/latest/messaging.html#display-data).
  */
trait IDisplayDataMsg
  extends IIOPubMessage[display_data]
     with _Message {
  @JSName("content")
  var content_IDisplayDataMsg: AnonData
}

object IDisplayDataMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: AnonData,
    header: IHeader[display_data],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[
      scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView
    ] = null
  ): IDisplayDataMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisplayDataMsg]
  }
}

