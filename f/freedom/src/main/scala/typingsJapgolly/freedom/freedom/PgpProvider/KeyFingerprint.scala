package typingsJapgolly.freedom.freedom.PgpProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyFingerprint extends js.Object {
  var fingerprint: String
  var words: js.Array[String]
}

object KeyFingerprint {
  @scala.inline
  def apply(fingerprint: String, words: js.Array[String]): KeyFingerprint = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeyFingerprint]
  }
}

