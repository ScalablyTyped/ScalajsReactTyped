package typingsJapgolly.useResizeObserver.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.useResizeObserver.mod.DefaultsWithoutResizeHandler[TElement]
  - typingsJapgolly.useResizeObserver.mod.DefaultsWithResizeHandler[TElement]
*/
trait ObserverDefaults[TElement /* <: HTMLElement */] extends js.Object

object ObserverDefaults {
  @scala.inline
  def DefaultsWithoutResizeHandler[TElement /* <: HTMLElement */](ref: RefHandle[TElement] = null): ObserverDefaults[TElement] = {
    val __obj = js.Dynamic.literal()
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserverDefaults[TElement]]
  }
  @scala.inline
  def DefaultsWithResizeHandler[TElement /* <: HTMLElement */](onResize: /* newSize */ RefSize => Callback, ref: RefHandle[TElement] = null): ObserverDefaults[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onResize")(js.Any.fromFunction1((t0: /* newSize */ typingsJapgolly.useResizeObserver.mod.RefSize) => onResize(t0).runNow()))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserverDefaults[TElement]]
  }
}

