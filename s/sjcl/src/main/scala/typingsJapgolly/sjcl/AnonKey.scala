package typingsJapgolly.sjcl

import typingsJapgolly.sjcl.mod.BitArray_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var key: BitArray_
  var salt: BitArray_
}

object AnonKey {
  @scala.inline
  def apply(key: BitArray_, salt: BitArray_): AnonKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKey]
  }
}

