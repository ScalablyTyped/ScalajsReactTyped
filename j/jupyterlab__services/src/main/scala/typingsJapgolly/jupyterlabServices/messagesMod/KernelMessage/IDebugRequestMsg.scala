package typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage

import typingsJapgolly.jupyterlabServices.AnonArguments
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.control
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.debug_request
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An experimental `'debug_request'` messsage on the `'control'` channel.
  *
  * @hidden
  *
  * #### Notes
  * Debug messages are experimental messages that are not in the official
  * kernel message specification. As such, this function is *NOT* considered
  * part of the public API, and may change without notice.
  */
trait IDebugRequestMsg
  extends IControlMessage[debug_request]
     with _Message {
  @JSName("content")
  var content_IDebugRequestMsg: AnonArguments
}

object IDebugRequestMsg {
  @scala.inline
  def apply(
    channel: control,
    content: AnonArguments,
    header: IHeader[debug_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[
      scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView
    ] = null
  ): IDebugRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDebugRequestMsg]
  }
}

