package typingsJapgolly.officeUiFabricReact.calendarYearMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.officeUiFabricReact.calendarTypesMod.ICalendarIconStrings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarYearHeaderProps
  extends ICalendarYearProps
     with ICalendarYearRange {
  var onSelectNext: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSelectPrev: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ICalendarYearHeaderProps {
  @scala.inline
  def apply(
    fromYear: Double,
    toYear: Double,
    className: String = null,
    maxYear: Int | Double = null,
    minYear: Int | Double = null,
    navigatedYear: Int | Double = null,
    navigationIcons: ICalendarIconStrings = null,
    onHeaderSelect: /* focus */ Boolean => Callback = null,
    onRenderTitle: /* props */ ICalendarYearHeaderProps => CallbackTo[Node] = null,
    onRenderYear: /* year */ Double => CallbackTo[Node] = null,
    onSelectNext: js.UndefOr[Callback] = js.undefined,
    onSelectPrev: js.UndefOr[Callback] = js.undefined,
    onSelectYear: /* year */ Double => Callback = null,
    selectedYear: Int | Double = null,
    strings: ICalendarYearStrings = null
  ): ICalendarYearHeaderProps = {
    val __obj = js.Dynamic.literal(fromYear = fromYear.asInstanceOf[js.Any], toYear = toYear.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (maxYear != null) __obj.updateDynamic("maxYear")(maxYear.asInstanceOf[js.Any])
    if (minYear != null) __obj.updateDynamic("minYear")(minYear.asInstanceOf[js.Any])
    if (navigatedYear != null) __obj.updateDynamic("navigatedYear")(navigatedYear.asInstanceOf[js.Any])
    if (navigationIcons != null) __obj.updateDynamic("navigationIcons")(navigationIcons.asInstanceOf[js.Any])
    if (onHeaderSelect != null) __obj.updateDynamic("onHeaderSelect")(js.Any.fromFunction1((t0: /* focus */ scala.Boolean) => onHeaderSelect(t0).runNow()))
    if (onRenderTitle != null) __obj.updateDynamic("onRenderTitle")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.officeUiFabricReact.calendarYearMod.ICalendarYearHeaderProps) => onRenderTitle(t0).runNow()))
    if (onRenderYear != null) __obj.updateDynamic("onRenderYear")(js.Any.fromFunction1((t0: /* year */ scala.Double) => onRenderYear(t0).runNow()))
    onSelectNext.foreach(p => __obj.updateDynamic("onSelectNext")(p.toJsFn))
    onSelectPrev.foreach(p => __obj.updateDynamic("onSelectPrev")(p.toJsFn))
    if (onSelectYear != null) __obj.updateDynamic("onSelectYear")(js.Any.fromFunction1((t0: /* year */ scala.Double) => onSelectYear(t0).runNow()))
    if (selectedYear != null) __obj.updateDynamic("selectedYear")(selectedYear.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarYearHeaderProps]
  }
}

