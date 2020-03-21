package typingsJapgolly.cryptojs.CryptoJS.lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibStatic extends js.Object {
  var Base: typingsJapgolly.cryptojs.CryptoJS.lib.Base
  var CipherParams: typingsJapgolly.cryptojs.CryptoJS.lib.CipherParams
  var PasswordBasedCipher: typingsJapgolly.cryptojs.CryptoJS.lib.PasswordBasedCipher
  var SerializableCipher: typingsJapgolly.cryptojs.CryptoJS.lib.SerializableCipher
  var WordArray: typingsJapgolly.cryptojs.CryptoJS.lib.WordArray
}

object LibStatic {
  @scala.inline
  def apply(
    Base: Base,
    CipherParams: CipherParams,
    PasswordBasedCipher: PasswordBasedCipher,
    SerializableCipher: SerializableCipher,
    WordArray: WordArray
  ): LibStatic = {
    val __obj = js.Dynamic.literal(Base = Base.asInstanceOf[js.Any], CipherParams = CipherParams.asInstanceOf[js.Any], PasswordBasedCipher = PasswordBasedCipher.asInstanceOf[js.Any], SerializableCipher = SerializableCipher.asInstanceOf[js.Any], WordArray = WordArray.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LibStatic]
  }
}

