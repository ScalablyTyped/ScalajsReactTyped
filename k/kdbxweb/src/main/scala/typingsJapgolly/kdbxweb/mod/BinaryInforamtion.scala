package typingsJapgolly.kdbxweb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryInforamtion extends js.Object {
  var ref: String
  var value: ProtectedValue | scala.scalajs.js.typedarray.ArrayBuffer
}

object BinaryInforamtion {
  @scala.inline
  def apply(ref: String, value: ProtectedValue | scala.scalajs.js.typedarray.ArrayBuffer): BinaryInforamtion = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BinaryInforamtion]
  }
}

