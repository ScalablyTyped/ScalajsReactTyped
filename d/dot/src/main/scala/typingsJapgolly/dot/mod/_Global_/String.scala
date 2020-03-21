package typingsJapgolly.dot.mod._Global_

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait String extends js.Object {
  def encodeHTML(): java.lang.String
}

object String {
  @scala.inline
  def apply(encodeHTML: CallbackTo[java.lang.String]): String = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encodeHTML")(encodeHTML.toJsFn)
    __obj.asInstanceOf[String]
  }
}

