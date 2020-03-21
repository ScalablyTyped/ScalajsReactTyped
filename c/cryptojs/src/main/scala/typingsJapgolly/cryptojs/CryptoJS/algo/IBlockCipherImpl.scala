package typingsJapgolly.cryptojs.CryptoJS.algo

import typingsJapgolly.cryptojs.CryptoJS.lib.CipherParamsData
import typingsJapgolly.cryptojs.CryptoJS.lib.IBlockCipherCfg
import typingsJapgolly.cryptojs.CryptoJS.lib.IStreamCipher
import typingsJapgolly.cryptojs.CryptoJS.lib.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBlockCipherImpl extends IStreamCipher[IBlockCipherCfg] {
  def createDecryptor(key: WordArray, cfg: CipherParamsData): IBlockCipherImpl = js.native
  def createEncryptor(key: WordArray, cfg: CipherParamsData): IBlockCipherImpl = js.native
  def decryptBlock(M: js.Array[Double], offset: Double): Unit = js.native
  def encryptBlock(M: js.Array[Double], offset: Double): Unit = js.native
}

