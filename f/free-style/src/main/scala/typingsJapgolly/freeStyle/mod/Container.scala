package typingsJapgolly.freeStyle.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container[T] extends js.Object {
  var id: String
  def getStyles(): String
}

object Container {
  @scala.inline
  def apply[T](getStyles: CallbackTo[String], id: String): Container[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("getStyles")(getStyles.toJsFn)
    __obj.asInstanceOf[Container[T]]
  }
}

