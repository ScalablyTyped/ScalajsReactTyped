package typingsJapgolly.sshpk.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.cryptoMod.BinaryLike
import typingsJapgolly.node.cryptoMod.BinaryToTextEncoding
import typingsJapgolly.node.cryptoMod.Encoding
import typingsJapgolly.node.cryptoMod.KeyLike
import typingsJapgolly.node.cryptoMod.SignKeyObjectInput
import typingsJapgolly.node.cryptoMod.SignPrivateKeyInput
import typingsJapgolly.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sshpk", "Signer")
@js.native
/* private */ open class Signer () extends Writable {
  
  def sign(): Signature = js.native
  def sign(private_key: KeyLike): Buffer = js.native
  def sign(private_key: KeyLike, output_format: BinaryToTextEncoding): String = js.native
  def sign(private_key: SignKeyObjectInput): Buffer = js.native
  def sign(private_key: SignKeyObjectInput, output_format: BinaryToTextEncoding): String = js.native
  def sign(private_key: SignPrivateKeyInput): Buffer = js.native
  def sign(private_key: SignPrivateKeyInput, output_format: BinaryToTextEncoding): String = js.native
  
  def update(data: String, input_encoding: Encoding): this.type = js.native
  def update(data: BinaryLike): this.type = js.native
}
