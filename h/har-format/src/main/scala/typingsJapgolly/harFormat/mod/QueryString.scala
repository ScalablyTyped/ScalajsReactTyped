package typingsJapgolly.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryString extends js.Object {
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.undefined
  var name: String
  var value: String
}

object QueryString {
  @scala.inline
  def apply(name: String, value: String, comment: String = null): QueryString = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryString]
  }
}

