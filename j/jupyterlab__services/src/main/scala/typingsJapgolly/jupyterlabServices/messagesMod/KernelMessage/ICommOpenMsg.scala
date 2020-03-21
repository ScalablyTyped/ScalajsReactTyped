package typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage

import typingsJapgolly.jupyterlabServices.AnonCommid
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.comm_open
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'comm_open'` message on the `'iopub'` channel.
  *
  * See [Comm open](https://jupyter-client.readthedocs.io/en/latest/messaging.html#opening-a-comm).
  */
trait ICommOpenMsg[T /* <: shell | iopub */] extends IMessage[comm_open] {
  @JSName("channel")
  var channel_ICommOpenMsg: T
  @JSName("content")
  var content_ICommOpenMsg: AnonCommid
}

object ICommOpenMsg {
  @scala.inline
  def apply[T /* <: shell | iopub */](
    channel: T,
    content: AnonCommid,
    header: IHeader[comm_open],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[
      scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView
    ] = null
  ): ICommOpenMsg[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommOpenMsg[T]]
  }
}

