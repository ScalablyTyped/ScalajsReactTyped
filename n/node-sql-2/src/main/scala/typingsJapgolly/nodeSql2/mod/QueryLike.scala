package typingsJapgolly.nodeSql2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryLike extends js.Object {
  var text: String
  var values: js.Array[_]
}

object QueryLike {
  @scala.inline
  def apply(text: String, values: js.Array[_]): QueryLike = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryLike]
  }
}

