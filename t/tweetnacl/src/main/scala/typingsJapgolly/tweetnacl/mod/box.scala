package typingsJapgolly.tweetnacl.mod

import typingsJapgolly.tweetnacl.mod.box.keyPair
import typingsJapgolly.tweetnacl.mod.box.open
import typingsJapgolly.tweetnacl.tweetnaclBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait box extends js.Object {
  @JSName("keyPair")
  var keyPair_Original: keyPair = js.native
  val nonceLength: Double = js.native
  @JSName("open")
  var open_Original: open = js.native
  val overheadLength: Double = js.native
  val publicKeyLength: Double = js.native
  val secretKeyLength: Double = js.native
  val sharedKeyLength: Double = js.native
  def apply(
    msg: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    secretKey: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def after(
    msg: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def before(
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    secretKey: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def keyPair(): BoxKeyPair = js.native
  def open(
    msg: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    secretKey: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array | `false` = js.native
}

@JSImport("tweetnacl", "box")
@js.native
object box extends js.Object {
  @js.native
  trait keyPair extends js.Object {
    def apply(): BoxKeyPair = js.native
    def fromSecretKey(secretKey: scala.scalajs.js.typedarray.Uint8Array): BoxKeyPair = js.native
  }
  
  @js.native
  trait open extends js.Object {
    def apply(
      msg: scala.scalajs.js.typedarray.Uint8Array,
      nonce: scala.scalajs.js.typedarray.Uint8Array,
      publicKey: scala.scalajs.js.typedarray.Uint8Array,
      secretKey: scala.scalajs.js.typedarray.Uint8Array
    ): scala.scalajs.js.typedarray.Uint8Array | `false` = js.native
    def after(
      box: scala.scalajs.js.typedarray.Uint8Array,
      nonce: scala.scalajs.js.typedarray.Uint8Array,
      key: scala.scalajs.js.typedarray.Uint8Array
    ): scala.scalajs.js.typedarray.Uint8Array | `false` = js.native
  }
  
}

