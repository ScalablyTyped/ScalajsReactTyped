package typingsJapgolly.bitcoinComputerBitcore.mod.Bitcoin

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcoin-computer-bitcore", "Bitcoin.Message")
@js.native
open class Message protected () extends StObject {
  def this(message: String) = this()
  
  def fromJSON(json: String): Message = js.native
  
  def fromString(str: String): Message = js.native
  
  def inspect(): String = js.native
  
  def magicHash(): Buffer = js.native
  
  def sign(privateKey: PrivateKey): String = js.native
  
  def toJSON(): String = js.native
  
  def toObject(): typingsJapgolly.bitcoinComputerBitcore.anon.Message = js.native
  
  def verify(bitcoinAddress: String, signatureString: String): Boolean = js.native
  def verify(bitcoinAddress: Address, signatureString: String): Boolean = js.native
}
