package typingsJapgolly.griddleReact.mod.components

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.griddleReact.mod.GriddleFilter
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var setFilter: js.UndefOr[js.Function1[/* filter */ GriddleFilter, Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object FilterProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    placeholder: String = null,
    setFilter: /* filter */ GriddleFilter => Callback = null,
    style: CSSProperties = null
  ): FilterProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (setFilter != null) __obj.updateDynamic("setFilter")(js.Any.fromFunction1((t0: /* filter */ typingsJapgolly.griddleReact.mod.GriddleFilter) => setFilter(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterProps]
  }
}

