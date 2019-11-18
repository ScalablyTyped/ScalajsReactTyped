package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HmacKeyAlgorithm extends KeyAlgorithm {
  var hash: org.scalajs.dom.crypto.KeyAlgorithm
  var length: Double
}

object HmacKeyAlgorithm {
  @scala.inline
  def apply(hash: org.scalajs.dom.crypto.KeyAlgorithm, length: Double, name: java.lang.String): HmacKeyAlgorithm = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HmacKeyAlgorithm]
  }
}

