package typingsJapgolly.sshpk.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.cryptoMod.BinaryLike
import typingsJapgolly.node.cryptoMod.BinaryToTextEncoding
import typingsJapgolly.node.cryptoMod.Encoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** extends crypto.Verify but override 'verify' function */
@js.native
trait Verify extends StObject {
  
  def update(data: String, input_encoding: Encoding): Verify = js.native
  def update(data: BinaryLike): Verify = js.native
  
  def verify(signature: String): Boolean = js.native
  def verify(signature: String, fmt: BinaryToTextEncoding): Boolean = js.native
  def verify(signature: Buffer): Boolean = js.native
  def verify(signature: Buffer, fmt: BinaryToTextEncoding): Boolean = js.native
  def verify(signature: Signature): Boolean = js.native
}
