package typingsJapgolly.kdbxweb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAes extends js.Object {
  var Aes: String
  var ChaCha20: String
}

object AnonAes {
  @scala.inline
  def apply(Aes: String, ChaCha20: String): AnonAes = {
    val __obj = js.Dynamic.literal(Aes = Aes.asInstanceOf[js.Any], ChaCha20 = ChaCha20.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAes]
  }
}

