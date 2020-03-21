package typingsJapgolly.cryptojs.CryptoJS.lib

import typingsJapgolly.cryptojs.CryptoJS.mode.IBlockCipherDecryptor
import typingsJapgolly.cryptojs.CryptoJS.mode.IBlockCipherEncryptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockCipherMode extends Base {
  def create(): BlockCipherMode = js.native
  def create(cipher: Cipher): BlockCipherMode = js.native
  def create(cipher: Cipher, iv: js.Array[Double]): BlockCipherMode = js.native
  def createDecryptor(cipher: Cipher, iv: js.Array[Double]): IBlockCipherDecryptor = js.native
  def createEncryptor(cipher: Cipher, iv: js.Array[Double]): IBlockCipherEncryptor = js.native
  def init(): Unit = js.native
  def init(cipher: Cipher): Unit = js.native
  def init(cipher: Cipher, iv: js.Array[Double]): Unit = js.native
}

