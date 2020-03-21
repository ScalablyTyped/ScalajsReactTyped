package typingsJapgolly.primereact.scrollableViewMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollableViewProps extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var footer: js.UndefOr[js.Any] = js.undefined
  var frozen: js.UndefOr[Boolean] = js.undefined
  var frozenBody: js.UndefOr[js.Any] = js.undefined
  var frozenWidth: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[js.Any] = js.undefined
  var onVirtualScroll: js.UndefOr[js.Function1[/* page */ Double, Unit]] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var totalRcords: js.UndefOr[Double] = js.undefined
  var unfrozenWidth: js.UndefOr[String] = js.undefined
  var virtualScroll: js.UndefOr[Boolean] = js.undefined
}

object ScrollableViewProps {
  @scala.inline
  def apply(
    body: js.Any = null,
    footer: js.Any = null,
    frozen: js.UndefOr[Boolean] = js.undefined,
    frozenBody: js.Any = null,
    frozenWidth: String = null,
    header: js.Any = null,
    onVirtualScroll: /* page */ Double => Callback = null,
    rows: Int | Double = null,
    totalRcords: Int | Double = null,
    unfrozenWidth: String = null,
    virtualScroll: js.UndefOr[Boolean] = js.undefined
  ): ScrollableViewProps = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(frozen)) __obj.updateDynamic("frozen")(frozen.asInstanceOf[js.Any])
    if (frozenBody != null) __obj.updateDynamic("frozenBody")(frozenBody.asInstanceOf[js.Any])
    if (frozenWidth != null) __obj.updateDynamic("frozenWidth")(frozenWidth.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (onVirtualScroll != null) __obj.updateDynamic("onVirtualScroll")(js.Any.fromFunction1((t0: /* page */ scala.Double) => onVirtualScroll(t0).runNow()))
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (totalRcords != null) __obj.updateDynamic("totalRcords")(totalRcords.asInstanceOf[js.Any])
    if (unfrozenWidth != null) __obj.updateDynamic("unfrozenWidth")(unfrozenWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualScroll)) __obj.updateDynamic("virtualScroll")(virtualScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollableViewProps]
  }
}

