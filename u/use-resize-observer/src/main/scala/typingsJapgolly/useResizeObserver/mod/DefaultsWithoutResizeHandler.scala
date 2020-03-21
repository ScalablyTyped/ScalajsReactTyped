package typingsJapgolly.useResizeObserver.mod

import japgolly.scalajs.react.raw.React.RefHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultsWithoutResizeHandler[TElement] extends ObserverDefaults[TElement] {
  var ref: js.UndefOr[RefHandle[TElement]] = js.undefined
}

object DefaultsWithoutResizeHandler {
  @scala.inline
  def apply[TElement](ref: RefHandle[TElement] = null): DefaultsWithoutResizeHandler[TElement] = {
    val __obj = js.Dynamic.literal()
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultsWithoutResizeHandler[TElement]]
  }
}

