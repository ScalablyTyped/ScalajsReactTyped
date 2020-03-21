package typingsJapgolly.diffieHellman

import typingsJapgolly.node.NodeJS.ArrayBufferView
import typingsJapgolly.node.cryptoMod.HexBase64Latin1Encoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diffie-hellman", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class DiffieHellman protected ()
    extends typingsJapgolly.node.cryptoMod.DiffieHellman
  
  def createDiffieHellman(prime_length: Double): typingsJapgolly.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime_length: Double, generator: Double): typingsJapgolly.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime_length: Double, generator: ArrayBufferView): typingsJapgolly.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding): typingsJapgolly.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(
    prime: String,
    prime_encoding: HexBase64Latin1Encoding,
    generator: String,
    generator_encoding: HexBase64Latin1Encoding
  ): typingsJapgolly.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: Double): typingsJapgolly.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: ArrayBufferView): typingsJapgolly.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: ArrayBufferView): typingsJapgolly.node.cryptoMod.DiffieHellman = js.native
  def getDiffieHellman(group_name: String): typingsJapgolly.node.cryptoMod.DiffieHellman = js.native
}

