package typingsJapgolly.jose.mod.JWE

import typingsJapgolly.jose.joseStrings.compact
import typingsJapgolly.jose.joseStrings.flattened
import typingsJapgolly.jose.joseStrings.general
import typingsJapgolly.jose.mod.ProduceKeyInput
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWE.Encrypt")
@js.native
class Encrypt_ protected () extends js.Object {
  def this(cleartext: String) = this()
  def this(cleartext: Buffer) = this()
  def this(cleartext: String, `protected`: js.Object) = this()
  def this(cleartext: Buffer, `protected`: js.Object) = this()
  def this(cleartext: String, `protected`: js.Object, unprotected: js.Object) = this()
  def this(cleartext: Buffer, `protected`: js.Object, unprotected: js.Object) = this()
  def this(cleartext: String, `protected`: js.Object, unprotected: js.Object, aad: String) = this()
  def this(cleartext: Buffer, `protected`: js.Object, unprotected: js.Object, aad: String) = this()
  @JSName("encrypt")
  def encrypt_compact(serialization: compact): String = js.native
  @JSName("encrypt")
  def encrypt_flattened(serialization: flattened): FlattenedJWE = js.native
  @JSName("encrypt")
  def encrypt_general(serialization: general): GeneralJWE = js.native
  def recipient(key: ProduceKeyInput): Unit = js.native
  def recipient(key: ProduceKeyInput, header: js.Object): Unit = js.native
}

