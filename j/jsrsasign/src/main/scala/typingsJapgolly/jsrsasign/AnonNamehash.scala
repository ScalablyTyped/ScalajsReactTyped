package typingsJapgolly.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNamehash extends js.Object {
  var alg: String
  var keyhash: String
  var namehash: String
  var serial: String
}

object AnonNamehash {
  @scala.inline
  def apply(alg: String, keyhash: String, namehash: String, serial: String): AnonNamehash = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], keyhash = keyhash.asInstanceOf[js.Any], namehash = namehash.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNamehash]
  }
}

