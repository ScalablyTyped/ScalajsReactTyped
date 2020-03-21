package typingsJapgolly.reactBeautifulDnd.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactTransitionEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.TransitionEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableProvidedDraggableProps extends js.Object {
  // used for shared global styles
  var `data-rbd-draggable-context-id`: String
  var `data-rbd-draggable-id`: String
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[_]] = js.undefined
  // inline style
  var style: js.UndefOr[DraggingStyle | NotDraggingStyle] = js.undefined
}

object DraggableProvidedDraggableProps {
  @scala.inline
  def apply(
    `data-rbd-draggable-context-id`: String,
    `data-rbd-draggable-id`: String,
    onTransitionEnd: ReactTransitionEventFrom[Element] => Callback = null,
    style: DraggingStyle | NotDraggingStyle = null
  ): DraggableProvidedDraggableProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data-rbd-draggable-context-id")(`data-rbd-draggable-context-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-rbd-draggable-id")(`data-rbd-draggable-id`.asInstanceOf[js.Any])
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTransitionEventFrom[org.scalajs.dom.raw.Element]) => onTransitionEnd(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableProvidedDraggableProps]
  }
}

