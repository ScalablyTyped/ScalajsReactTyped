package typingsJapgolly.reactCloseOnEscape.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseOnEscapeProps extends js.Object {
  /**
    * Callback triggered by pressing ESC
    */
  def onEscape(): Unit
}

object CloseOnEscapeProps {
  @scala.inline
  def apply(onEscape: Callback): CloseOnEscapeProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onEscape")(onEscape.toJsFn)
    __obj.asInstanceOf[CloseOnEscapeProps]
  }
}

