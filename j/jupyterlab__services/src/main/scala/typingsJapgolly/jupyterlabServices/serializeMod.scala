package typingsJapgolly.jupyterlabServices

import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IMessage
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.MessageType
import typingsJapgolly.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel/serialize", JSImport.Namespace)
@js.native
object serializeMod extends js.Object {
  def deserialize(data: String): IMessage[MessageType] = js.native
  def deserialize(data: ArrayBuffer): IMessage[MessageType] = js.native
  def serialize(msg: IMessage[MessageType]): String | scala.scalajs.js.typedarray.ArrayBuffer = js.native
}

