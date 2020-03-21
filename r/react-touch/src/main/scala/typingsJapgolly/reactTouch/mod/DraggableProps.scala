package typingsJapgolly.reactTouch.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableProps extends js.Object {
  var children: DraggableCallback
  /**
    * An object that defines the initial position of the draggable component.
    * You can pass any of the following styles to it
    * and they'll be updated and passed back out in the callback with every animation tick.
    */
  var style: DraggableStyle
}

object DraggableProps {
  @scala.inline
  def apply(children: /* argument */ DraggableCallbackArgument => CallbackTo[Element], style: DraggableStyle): DraggableProps = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* argument */ typingsJapgolly.reactTouch.mod.DraggableCallbackArgument) => children(t0).runNow()))
    __obj.asInstanceOf[DraggableProps]
  }
}

