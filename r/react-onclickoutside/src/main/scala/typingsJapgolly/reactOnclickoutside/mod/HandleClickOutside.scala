package typingsJapgolly.reactOnclickoutside.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleClickOutside[T] extends js.Object {
  var handleClickOutside: MouseEventHandler[T]
}

object HandleClickOutside {
  @scala.inline
  def apply[T](handleClickOutside: ReactMouseEventFrom[T with Element] => Callback): HandleClickOutside[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handleClickOutside")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[T with org.scalajs.dom.raw.Element]) => handleClickOutside(t0).runNow()))
    __obj.asInstanceOf[HandleClickOutside[T]]
  }
}

