package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayParam[T] extends js.Object {
  var array: js.Array[T]
}

object ArrayParam {
  @scala.inline
  def apply[T](array: js.Array[T]): ArrayParam[T] = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ArrayParam[T]]
  }
}

