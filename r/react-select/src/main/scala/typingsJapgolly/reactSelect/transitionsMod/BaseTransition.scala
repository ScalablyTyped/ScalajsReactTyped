package typingsJapgolly.reactSelect.transitionsMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTransition extends js.Object {
  /** Whether we are in a transition. */
  var in: Boolean
  /** Function to be called once transition finishes. */
  var onExited: fn
}

object BaseTransition {
  @scala.inline
  def apply(in: Boolean, onExited: Callback): BaseTransition = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.updateDynamic("onExited")(onExited.toJsFn)
    __obj.asInstanceOf[BaseTransition]
  }
}

