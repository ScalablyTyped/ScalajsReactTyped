package typingsJapgolly.useResizeObserver.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.RefHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultsWithResizeHandler[TElement] extends ObserverDefaults[TElement] {
  var onResize: ResizeHandler
  var ref: js.UndefOr[RefHandle[TElement]] = js.undefined
}

object DefaultsWithResizeHandler {
  @scala.inline
  def apply[TElement](onResize: /* newSize */ RefSize => Callback, ref: RefHandle[TElement] = null): DefaultsWithResizeHandler[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onResize")(js.Any.fromFunction1((t0: /* newSize */ typingsJapgolly.useResizeObserver.mod.RefSize) => onResize(t0).runNow()))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultsWithResizeHandler[TElement]]
  }
}

