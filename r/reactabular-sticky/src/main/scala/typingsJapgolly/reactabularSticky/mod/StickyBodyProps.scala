package typingsJapgolly.reactabularSticky.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.reactabularSticky.PartialUIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickyBodyProps extends js.Object {
  var onScroll: js.UndefOr[js.Function1[/* e */ PartialUIEvent, Unit]] = js.undefined
  var tableHeader: HTMLElement | Null
}

object StickyBodyProps {
  @scala.inline
  def apply(onScroll: /* e */ PartialUIEvent => Callback = null, tableHeader: HTMLElement = null): StickyBodyProps = {
    val __obj = js.Dynamic.literal()
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactabularSticky.PartialUIEvent) => onScroll(t0).runNow()))
    if (tableHeader != null) __obj.updateDynamic("tableHeader")(tableHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickyBodyProps]
  }
}

