package typingsJapgolly.node.cryptoMod

import typingsJapgolly.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "createDiffieHellman")
@js.native
object createDiffieHellman extends js.Object {
  def apply(prime_length: Double): DiffieHellman = js.native
  def apply(prime_length: Double, generator: Double): DiffieHellman = js.native
  def apply(prime_length: Double, generator: ArrayBufferView): DiffieHellman = js.native
  def apply(prime: java.lang.String, prime_encoding: HexBase64Latin1Encoding): DiffieHellman = js.native
  def apply(
    prime: java.lang.String,
    prime_encoding: HexBase64Latin1Encoding,
    generator: java.lang.String,
    generator_encoding: HexBase64Latin1Encoding
  ): DiffieHellman = js.native
  def apply(prime: java.lang.String, prime_encoding: HexBase64Latin1Encoding, generator: Double): DiffieHellman = js.native
  def apply(prime: java.lang.String, prime_encoding: HexBase64Latin1Encoding, generator: ArrayBufferView): DiffieHellman = js.native
  def apply(prime: ArrayBufferView): DiffieHellman = js.native
}

