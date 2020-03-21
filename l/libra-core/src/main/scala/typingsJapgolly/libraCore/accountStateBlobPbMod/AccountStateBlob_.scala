package typingsJapgolly.libraCore.accountStateBlobPbMod

import typingsJapgolly.googleProtobuf.mod.Message
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateBlob")
@js.native
class AccountStateBlob_ () extends Message {
  def getBlob(): scala.scalajs.js.typedarray.Uint8Array | String = js.native
  def getBlob_asB64(): String = js.native
  def getBlob_asU8(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def setBlob(value: String): Unit = js.native
  def setBlob(value: Uint8Array): Unit = js.native
}

