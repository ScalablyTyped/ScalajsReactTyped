package typingsJapgolly.googleMarkerclustererplus

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait String extends js.Object {
  def trim(): java.lang.String
}

object String {
  @scala.inline
  def apply(trim: CallbackTo[java.lang.String]): String = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("trim")(trim.toJsFn)
    __obj.asInstanceOf[String]
  }
}

