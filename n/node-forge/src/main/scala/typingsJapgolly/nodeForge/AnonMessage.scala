package typingsJapgolly.nodeForge

import typingsJapgolly.nodeForge.mod.pki.ed25519.NativeBuffer
import typingsJapgolly.nodeForge.mod.pki.ed25519.ToNativeBufferParameters
import typingsJapgolly.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessage extends ToNativeBufferParameters {
  var message: NativeBuffer | ByteBuffer
}

object AnonMessage {
  @scala.inline
  def apply(message: NativeBuffer | ByteBuffer): AnonMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMessage]
  }
}

