package typingsJapgolly.tablesorter.uidatecompareoptionsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.jqueryui.JQueryUI.DatepickerOptions
import typingsJapgolly.tablesorter.comparableOptionsMod.ComparableOptions
import typingsJapgolly.tablesorter.controlOptionsMod.ControlOptions
import typingsJapgolly.tablesorter.dateOptionsMod.DateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIDateCompareOptions
  extends DatepickerOptions
     with DateOptions
     with ControlOptions
     with ComparableOptions

object UIDateCompareOptions {
  @scala.inline
  def apply(
    altField: js.Any = null,
    altFormat: String = null,
    appendText: String = null,
    autoSize: js.UndefOr[Boolean] = js.undefined,
    autohide: js.UndefOr[Boolean] = js.undefined,
    beforeShow: (/* input */ Element, /* inst */ js.Any) => CallbackTo[DatepickerOptions] = null,
    beforeShowDay: /* date */ js.Date => CallbackTo[js.Array[js.Any]] = null,
    buttonImage: String = null,
    buttonImageOnly: js.UndefOr[Boolean] = js.undefined,
    buttonText: String = null,
    calculateWeek: /* date */ js.Date => CallbackTo[String] = null,
    cellText: String = null,
    changeMonth: js.UndefOr[Boolean] = js.undefined,
    changeYear: js.UndefOr[Boolean] = js.undefined,
    closeText: String = null,
    compare: String | js.Array[String] = null,
    constrainInput: js.UndefOr[Boolean] = js.undefined,
    currentText: String = null,
    dateFormat: String = null,
    dayNames: js.Array[String] = null,
    dayNamesMin: js.Array[String] = null,
    dayNamesShort: js.Array[String] = null,
    defaultDate: js.Any = null,
    duration: String = null,
    endDate: js.Date = null,
    endOfDay: js.UndefOr[Boolean] = js.undefined,
    firstDay: Int | Double = null,
    gotoCurrent: js.UndefOr[Boolean] = js.undefined,
    hideIfNoPrevNext: js.UndefOr[Boolean] = js.undefined,
    isRTL: js.UndefOr[Boolean] = js.undefined,
    maxDate: js.Any = null,
    minDate: js.Any = null,
    monthNames: js.Array[String] = null,
    monthNamesShort: js.Array[String] = null,
    navigationAsDateFormat: js.UndefOr[Boolean] = js.undefined,
    nextText: String = null,
    numberOfMonths: js.Any = null,
    onChangeMonthYear: (/* year */ Double, /* month */ Double, /* inst */ js.Any) => Callback = null,
    onClose: (/* dateText */ String, /* inst */ js.Any) => Callback = null,
    onSelect: (/* dateText */ String, /* inst */ js.Any) => Callback = null,
    prevText: String = null,
    selectOtherMonths: js.UndefOr[Boolean] = js.undefined,
    shortYearCutoff: js.Any = null,
    showAnim: String = null,
    showButtonPanel: js.UndefOr[Boolean] = js.undefined,
    showCurrentAtPos: Int | Double = null,
    showMonthAfterYear: js.UndefOr[Boolean] = js.undefined,
    showOn: String = null,
    showOptions: js.Any = null,
    showOtherMonths: js.UndefOr[Boolean] = js.undefined,
    showWeek: js.UndefOr[Boolean] = js.undefined,
    stepMonths: Int | Double = null,
    weekHeader: String = null,
    yearRange: String = null,
    yearSuffix: String = null
  ): UIDateCompareOptions = {
    val __obj = js.Dynamic.literal()
    if (altField != null) __obj.updateDynamic("altField")(altField.asInstanceOf[js.Any])
    if (altFormat != null) __obj.updateDynamic("altFormat")(altFormat.asInstanceOf[js.Any])
    if (appendText != null) __obj.updateDynamic("appendText")(appendText.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSize)) __obj.updateDynamic("autoSize")(autoSize.asInstanceOf[js.Any])
    if (!js.isUndefined(autohide)) __obj.updateDynamic("autohide")(autohide.asInstanceOf[js.Any])
    if (beforeShow != null) __obj.updateDynamic("beforeShow")(js.Any.fromFunction2((t0: /* input */ org.scalajs.dom.raw.Element, t1: /* inst */ js.Any) => beforeShow(t0, t1).runNow()))
    if (beforeShowDay != null) __obj.updateDynamic("beforeShowDay")(js.Any.fromFunction1((t0: /* date */ js.Date) => beforeShowDay(t0).runNow()))
    if (buttonImage != null) __obj.updateDynamic("buttonImage")(buttonImage.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonImageOnly)) __obj.updateDynamic("buttonImageOnly")(buttonImageOnly.asInstanceOf[js.Any])
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (calculateWeek != null) __obj.updateDynamic("calculateWeek")(js.Any.fromFunction1((t0: /* date */ js.Date) => calculateWeek(t0).runNow()))
    if (cellText != null) __obj.updateDynamic("cellText")(cellText.asInstanceOf[js.Any])
    if (!js.isUndefined(changeMonth)) __obj.updateDynamic("changeMonth")(changeMonth.asInstanceOf[js.Any])
    if (!js.isUndefined(changeYear)) __obj.updateDynamic("changeYear")(changeYear.asInstanceOf[js.Any])
    if (closeText != null) __obj.updateDynamic("closeText")(closeText.asInstanceOf[js.Any])
    if (compare != null) __obj.updateDynamic("compare")(compare.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainInput)) __obj.updateDynamic("constrainInput")(constrainInput.asInstanceOf[js.Any])
    if (currentText != null) __obj.updateDynamic("currentText")(currentText.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (dayNames != null) __obj.updateDynamic("dayNames")(dayNames.asInstanceOf[js.Any])
    if (dayNamesMin != null) __obj.updateDynamic("dayNamesMin")(dayNamesMin.asInstanceOf[js.Any])
    if (dayNamesShort != null) __obj.updateDynamic("dayNamesShort")(dayNamesShort.asInstanceOf[js.Any])
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (!js.isUndefined(endOfDay)) __obj.updateDynamic("endOfDay")(endOfDay.asInstanceOf[js.Any])
    if (firstDay != null) __obj.updateDynamic("firstDay")(firstDay.asInstanceOf[js.Any])
    if (!js.isUndefined(gotoCurrent)) __obj.updateDynamic("gotoCurrent")(gotoCurrent.asInstanceOf[js.Any])
    if (!js.isUndefined(hideIfNoPrevNext)) __obj.updateDynamic("hideIfNoPrevNext")(hideIfNoPrevNext.asInstanceOf[js.Any])
    if (!js.isUndefined(isRTL)) __obj.updateDynamic("isRTL")(isRTL.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (monthNames != null) __obj.updateDynamic("monthNames")(monthNames.asInstanceOf[js.Any])
    if (monthNamesShort != null) __obj.updateDynamic("monthNamesShort")(monthNamesShort.asInstanceOf[js.Any])
    if (!js.isUndefined(navigationAsDateFormat)) __obj.updateDynamic("navigationAsDateFormat")(navigationAsDateFormat.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText.asInstanceOf[js.Any])
    if (numberOfMonths != null) __obj.updateDynamic("numberOfMonths")(numberOfMonths.asInstanceOf[js.Any])
    if (onChangeMonthYear != null) __obj.updateDynamic("onChangeMonthYear")(js.Any.fromFunction3((t0: /* year */ scala.Double, t1: /* month */ scala.Double, t2: /* inst */ js.Any) => onChangeMonthYear(t0, t1, t2).runNow()))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2((t0: /* dateText */ java.lang.String, t1: /* inst */ js.Any) => onClose(t0, t1).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: /* dateText */ java.lang.String, t1: /* inst */ js.Any) => onSelect(t0, t1).runNow()))
    if (prevText != null) __obj.updateDynamic("prevText")(prevText.asInstanceOf[js.Any])
    if (!js.isUndefined(selectOtherMonths)) __obj.updateDynamic("selectOtherMonths")(selectOtherMonths.asInstanceOf[js.Any])
    if (shortYearCutoff != null) __obj.updateDynamic("shortYearCutoff")(shortYearCutoff.asInstanceOf[js.Any])
    if (showAnim != null) __obj.updateDynamic("showAnim")(showAnim.asInstanceOf[js.Any])
    if (!js.isUndefined(showButtonPanel)) __obj.updateDynamic("showButtonPanel")(showButtonPanel.asInstanceOf[js.Any])
    if (showCurrentAtPos != null) __obj.updateDynamic("showCurrentAtPos")(showCurrentAtPos.asInstanceOf[js.Any])
    if (!js.isUndefined(showMonthAfterYear)) __obj.updateDynamic("showMonthAfterYear")(showMonthAfterYear.asInstanceOf[js.Any])
    if (showOn != null) __obj.updateDynamic("showOn")(showOn.asInstanceOf[js.Any])
    if (showOptions != null) __obj.updateDynamic("showOptions")(showOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(showOtherMonths)) __obj.updateDynamic("showOtherMonths")(showOtherMonths.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeek)) __obj.updateDynamic("showWeek")(showWeek.asInstanceOf[js.Any])
    if (stepMonths != null) __obj.updateDynamic("stepMonths")(stepMonths.asInstanceOf[js.Any])
    if (weekHeader != null) __obj.updateDynamic("weekHeader")(weekHeader.asInstanceOf[js.Any])
    if (yearRange != null) __obj.updateDynamic("yearRange")(yearRange.asInstanceOf[js.Any])
    if (yearSuffix != null) __obj.updateDynamic("yearSuffix")(yearSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIDateCompareOptions]
  }
}

