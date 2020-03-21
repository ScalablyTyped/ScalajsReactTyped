package typingsJapgolly.cryptojs.CryptoJS.mode

import typingsJapgolly.cryptojs.CryptoJS.lib.BlockCipherMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBlockCipherDecryptor extends BlockCipherMode {
  //exactly as IBlockCipherEncryptor
  def processBlock(words: js.Array[Double], offset: Double): Unit = js.native
}

