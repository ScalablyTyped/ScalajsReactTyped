package typingsJapgolly.nodeJose.mod.JWE

import typingsJapgolly.nodeJose.mod.JWK.Key
import typingsJapgolly.nodeJose.mod.JWK.KeyStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "JWE.createDecrypt")
@js.native
object createDecrypt extends js.Object {
  def apply(key: Key): Decryptor = js.native
  def apply(key: KeyStore): Decryptor = js.native
  def apply(key: KeyStore, opts: js.Any): Decryptor = js.native
  def apply(key: Key, opts: js.Any): Decryptor = js.native
}

