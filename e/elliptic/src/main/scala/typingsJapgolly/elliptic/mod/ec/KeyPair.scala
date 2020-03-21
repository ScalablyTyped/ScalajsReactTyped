package typingsJapgolly.elliptic.mod.ec

import typingsJapgolly.elliptic.AnonReason
import typingsJapgolly.elliptic.AnonX
import typingsJapgolly.elliptic.ellipticStrings.array
import typingsJapgolly.elliptic.ellipticStrings.hex
import typingsJapgolly.elliptic.mod.BNInput
import typingsJapgolly.elliptic.mod.SignatureInput
import typingsJapgolly.elliptic.mod.curve.base.BasePoint
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elliptic", "ec.KeyPair")
@js.native
class KeyPair protected () extends js.Object {
  def this(ec: typingsJapgolly.elliptic.mod.ec, options: KeyPairOptions) = this()
  var ec: typingsJapgolly.elliptic.mod.ec = js.native
  def derive(pub: BasePoint): js.Any = js.native
  def getPrivate(): js.Any = js.native
  @JSName("getPrivate")
  def getPrivate_hex(enc: hex): String = js.native
  def getPublic(): BasePoint = js.native
  @JSName("getPublic")
  def getPublic_array(compact: Boolean, enc: array): js.Array[Double] = js.native
  @JSName("getPublic")
  def getPublic_array(enc: array): js.Array[Double] = js.native
  @JSName("getPublic")
  def getPublic_hex(compact: Boolean, enc: hex): String = js.native
  @JSName("getPublic")
  def getPublic_hex(enc: hex): String = js.native
  def inspect(): String = js.native
  def sign(msg: BNInput): Signature = js.native
  def sign(msg: BNInput, enc: String): Signature = js.native
  def sign(msg: BNInput, enc: String, options: SignOptions): Signature = js.native
  def sign(msg: BNInput, options: SignOptions): Signature = js.native
  def validate(): AnonReason = js.native
  def verify(msg: BNInput, signature: SignatureInput): Boolean = js.native
}

/* static members */
@JSImport("elliptic", "ec.KeyPair")
@js.native
object KeyPair extends js.Object {
  def fromPrivate(ec: typingsJapgolly.elliptic.mod.ec, priv: String): KeyPair = js.native
  def fromPrivate(ec: typingsJapgolly.elliptic.mod.ec, priv: String, enc: String): KeyPair = js.native
  def fromPrivate(ec: typingsJapgolly.elliptic.mod.ec, priv: KeyPair): KeyPair = js.native
  def fromPrivate(ec: typingsJapgolly.elliptic.mod.ec, priv: KeyPair, enc: String): KeyPair = js.native
  def fromPrivate(ec: typingsJapgolly.elliptic.mod.ec, priv: Buffer): KeyPair = js.native
  def fromPrivate(ec: typingsJapgolly.elliptic.mod.ec, priv: Buffer, enc: String): KeyPair = js.native
  def fromPublic(ec: typingsJapgolly.elliptic.mod.ec, pub: String): KeyPair = js.native
  def fromPublic(ec: typingsJapgolly.elliptic.mod.ec, pub: String, enc: String): KeyPair = js.native
  def fromPublic(ec: typingsJapgolly.elliptic.mod.ec, pub: AnonX): KeyPair = js.native
  def fromPublic(ec: typingsJapgolly.elliptic.mod.ec, pub: AnonX, enc: String): KeyPair = js.native
  def fromPublic(ec: typingsJapgolly.elliptic.mod.ec, pub: KeyPair): KeyPair = js.native
  def fromPublic(ec: typingsJapgolly.elliptic.mod.ec, pub: KeyPair, enc: String): KeyPair = js.native
  def fromPublic(ec: typingsJapgolly.elliptic.mod.ec, pub: Buffer): KeyPair = js.native
  def fromPublic(ec: typingsJapgolly.elliptic.mod.ec, pub: Buffer, enc: String): KeyPair = js.native
}

