package typingsJapgolly.officeUiFabricReact.calendarYearMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.officeUiFabricReact.calendarTypesMod.ICalendarIconStrings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarYearProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var maxYear: js.UndefOr[Double] = js.undefined
  var minYear: js.UndefOr[Double] = js.undefined
  var navigatedYear: js.UndefOr[Double] = js.undefined
  var navigationIcons: js.UndefOr[ICalendarIconStrings] = js.undefined
  var onHeaderSelect: js.UndefOr[js.Function1[/* focus */ Boolean, Unit]] = js.undefined
  var onRenderTitle: js.UndefOr[js.Function1[/* props */ ICalendarYearHeaderProps, Node]] = js.undefined
  var onRenderYear: js.UndefOr[js.Function1[/* year */ Double, Node]] = js.undefined
  var onSelectYear: js.UndefOr[js.Function1[/* year */ Double, Unit]] = js.undefined
  var selectedYear: js.UndefOr[Double] = js.undefined
  var strings: js.UndefOr[ICalendarYearStrings] = js.undefined
}

object ICalendarYearProps {
  @scala.inline
  def apply(
    className: String = null,
    maxYear: Int | Double = null,
    minYear: Int | Double = null,
    navigatedYear: Int | Double = null,
    navigationIcons: ICalendarIconStrings = null,
    onHeaderSelect: /* focus */ Boolean => Callback = null,
    onRenderTitle: /* props */ ICalendarYearHeaderProps => CallbackTo[Node] = null,
    onRenderYear: /* year */ Double => CallbackTo[Node] = null,
    onSelectYear: /* year */ Double => Callback = null,
    selectedYear: Int | Double = null,
    strings: ICalendarYearStrings = null
  ): ICalendarYearProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (maxYear != null) __obj.updateDynamic("maxYear")(maxYear.asInstanceOf[js.Any])
    if (minYear != null) __obj.updateDynamic("minYear")(minYear.asInstanceOf[js.Any])
    if (navigatedYear != null) __obj.updateDynamic("navigatedYear")(navigatedYear.asInstanceOf[js.Any])
    if (navigationIcons != null) __obj.updateDynamic("navigationIcons")(navigationIcons.asInstanceOf[js.Any])
    if (onHeaderSelect != null) __obj.updateDynamic("onHeaderSelect")(js.Any.fromFunction1((t0: /* focus */ scala.Boolean) => onHeaderSelect(t0).runNow()))
    if (onRenderTitle != null) __obj.updateDynamic("onRenderTitle")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.officeUiFabricReact.calendarYearMod.ICalendarYearHeaderProps) => onRenderTitle(t0).runNow()))
    if (onRenderYear != null) __obj.updateDynamic("onRenderYear")(js.Any.fromFunction1((t0: /* year */ scala.Double) => onRenderYear(t0).runNow()))
    if (onSelectYear != null) __obj.updateDynamic("onSelectYear")(js.Any.fromFunction1((t0: /* year */ scala.Double) => onSelectYear(t0).runNow()))
    if (selectedYear != null) __obj.updateDynamic("selectedYear")(selectedYear.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarYearProps]
  }
}

