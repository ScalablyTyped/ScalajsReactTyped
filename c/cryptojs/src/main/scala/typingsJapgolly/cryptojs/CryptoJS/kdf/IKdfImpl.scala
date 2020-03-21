package typingsJapgolly.cryptojs.CryptoJS.kdf

import typingsJapgolly.cryptojs.CryptoJS.lib.CipherParams
import typingsJapgolly.cryptojs.CryptoJS.lib.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKdfImpl extends js.Object {
  def execute(password: String, keySize: Double, ivSize: Double): CipherParams = js.native
  def execute(password: String, keySize: Double, ivSize: Double, salt: String): CipherParams = js.native
  def execute(password: String, keySize: Double, ivSize: Double, salt: WordArray): CipherParams = js.native
}

