package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePicker
  extends typingsJapgolly.senchaTouch.Ext.picker.IPicker {
  /** [Config Option] (String) */
  var dayText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of dayText
  		* @returns String
  		*/
  var getDayText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of monthText
  		* @returns String
  		*/
  var getMonthText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of slotOrder
  		* @returns Array
  		*/
  var getSlotOrder: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of yearFrom
  		* @returns Number
  		*/
  var getYearFrom: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of yearText
  		* @returns String
  		*/
  var getYearText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of yearTo
  		* @returns Number
  		*/
  var getYearTo: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (String) */
  var monthText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of dayText
  		* @param dayText String The new value.
  		*/
  var setDayText: js.UndefOr[js.Function1[/* dayText */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of monthText
  		* @param monthText String The new value.
  		*/
  var setMonthText: js.UndefOr[js.Function1[/* monthText */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of slotOrder
  		* @param slotOrder Array The new value.
  		*/
  var setSlotOrder: js.UndefOr[js.Function1[/* slotOrder */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the values of the pickers slots
  		* @param value Object
  		* @param animated Object
  		* @returns Ext.Picker this This picker.
  		*/
  @JSName("setValue")
  var setValue_IDatePicker: js.UndefOr[
    js.Function2[/* value */ js.UndefOr[js.Any], /* animated */ js.UndefOr[js.Any], IPicker]
  ] = js.undefined
  /** [Method] Sets the value of yearFrom
  		* @param yearFrom Number The new value.
  		*/
  var setYearFrom: js.UndefOr[js.Function1[/* yearFrom */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of yearText
  		* @param yearText String The new value.
  		*/
  var setYearText: js.UndefOr[js.Function1[/* yearText */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of yearTo
  		* @param yearTo Number The new value.
  		*/
  var setYearTo: js.UndefOr[js.Function1[/* yearTo */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Config Option] (Array) */
  var slotOrder: js.UndefOr[Array] = js.undefined
  /** [Method] Updates the dayText configuration
  		* @param newDayText Object
  		* @param oldDayText Object
  		*/
  var updateDayText: js.UndefOr[
    js.Function2[/* newDayText */ js.UndefOr[js.Any], /* oldDayText */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Updates the monthText configuration
  		* @param newMonthText Object
  		* @param oldMonthText Object
  		*/
  var updateMonthText: js.UndefOr[
    js.Function2[/* newMonthText */ js.UndefOr[js.Any], /* oldMonthText */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Updates the yearFrom configuration */
  var updateYearFrom: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Updates the yearText configuration
  		* @param yearText Object
  		*/
  var updateYearText: js.UndefOr[js.Function1[/* yearText */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Updates the yearTo configuration */
  var updateYearTo: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Number) */
  var yearFrom: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var yearText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var yearTo: js.UndefOr[Double] = js.undefined
}

object IDatePicker {
  @scala.inline
  def apply(
    IPicker: typingsJapgolly.senchaTouch.Ext.picker.IPicker = null,
    dayText: java.lang.String = null,
    getDayText: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getMonthText: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getSlotOrder: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getYearFrom: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getYearText: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getYearTo: js.UndefOr[CallbackTo[Double]] = js.undefined,
    monthText: java.lang.String = null,
    setDayText: /* dayText */ js.UndefOr[java.lang.String] => Callback = null,
    setMonthText: /* monthText */ js.UndefOr[java.lang.String] => Callback = null,
    setSlotOrder: /* slotOrder */ js.UndefOr[Array] => Callback = null,
    setValue: (/* value */ js.UndefOr[js.Any], /* animated */ js.UndefOr[js.Any]) => CallbackTo[IPicker] = null,
    setYearFrom: /* yearFrom */ js.UndefOr[Double] => Callback = null,
    setYearText: /* yearText */ js.UndefOr[java.lang.String] => Callback = null,
    setYearTo: /* yearTo */ js.UndefOr[Double] => Callback = null,
    slotOrder: Array = null,
    updateDayText: (/* newDayText */ js.UndefOr[js.Any], /* oldDayText */ js.UndefOr[js.Any]) => Callback = null,
    updateMonthText: (/* newMonthText */ js.UndefOr[js.Any], /* oldMonthText */ js.UndefOr[js.Any]) => Callback = null,
    updateYearFrom: js.UndefOr[Callback] = js.undefined,
    updateYearText: /* yearText */ js.UndefOr[js.Any] => Callback = null,
    updateYearTo: js.UndefOr[Callback] = js.undefined,
    yearFrom: Int | Double = null,
    yearText: java.lang.String = null,
    yearTo: Int | Double = null
  ): IDatePicker = {
    val __obj = js.Dynamic.literal()
    if (IPicker != null) js.Dynamic.global.Object.assign(__obj, IPicker)
    if (dayText != null) __obj.updateDynamic("dayText")(dayText.asInstanceOf[js.Any])
    getDayText.foreach(p => __obj.updateDynamic("getDayText")(p.toJsFn))
    getMonthText.foreach(p => __obj.updateDynamic("getMonthText")(p.toJsFn))
    getSlotOrder.foreach(p => __obj.updateDynamic("getSlotOrder")(p.toJsFn))
    getYearFrom.foreach(p => __obj.updateDynamic("getYearFrom")(p.toJsFn))
    getYearText.foreach(p => __obj.updateDynamic("getYearText")(p.toJsFn))
    getYearTo.foreach(p => __obj.updateDynamic("getYearTo")(p.toJsFn))
    if (monthText != null) __obj.updateDynamic("monthText")(monthText.asInstanceOf[js.Any])
    if (setDayText != null) __obj.updateDynamic("setDayText")(js.Any.fromFunction1((t0: /* dayText */ js.UndefOr[java.lang.String]) => setDayText(t0).runNow()))
    if (setMonthText != null) __obj.updateDynamic("setMonthText")(js.Any.fromFunction1((t0: /* monthText */ js.UndefOr[java.lang.String]) => setMonthText(t0).runNow()))
    if (setSlotOrder != null) __obj.updateDynamic("setSlotOrder")(js.Any.fromFunction1((t0: /* slotOrder */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setSlotOrder(t0).runNow()))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction2((t0: /* value */ js.UndefOr[js.Any], t1: /* animated */ js.UndefOr[js.Any]) => setValue(t0, t1).runNow()))
    if (setYearFrom != null) __obj.updateDynamic("setYearFrom")(js.Any.fromFunction1((t0: /* yearFrom */ js.UndefOr[scala.Double]) => setYearFrom(t0).runNow()))
    if (setYearText != null) __obj.updateDynamic("setYearText")(js.Any.fromFunction1((t0: /* yearText */ js.UndefOr[java.lang.String]) => setYearText(t0).runNow()))
    if (setYearTo != null) __obj.updateDynamic("setYearTo")(js.Any.fromFunction1((t0: /* yearTo */ js.UndefOr[scala.Double]) => setYearTo(t0).runNow()))
    if (slotOrder != null) __obj.updateDynamic("slotOrder")(slotOrder.asInstanceOf[js.Any])
    if (updateDayText != null) __obj.updateDynamic("updateDayText")(js.Any.fromFunction2((t0: /* newDayText */ js.UndefOr[js.Any], t1: /* oldDayText */ js.UndefOr[js.Any]) => updateDayText(t0, t1).runNow()))
    if (updateMonthText != null) __obj.updateDynamic("updateMonthText")(js.Any.fromFunction2((t0: /* newMonthText */ js.UndefOr[js.Any], t1: /* oldMonthText */ js.UndefOr[js.Any]) => updateMonthText(t0, t1).runNow()))
    updateYearFrom.foreach(p => __obj.updateDynamic("updateYearFrom")(p.toJsFn))
    if (updateYearText != null) __obj.updateDynamic("updateYearText")(js.Any.fromFunction1((t0: /* yearText */ js.UndefOr[js.Any]) => updateYearText(t0).runNow()))
    updateYearTo.foreach(p => __obj.updateDynamic("updateYearTo")(p.toJsFn))
    if (yearFrom != null) __obj.updateDynamic("yearFrom")(yearFrom.asInstanceOf[js.Any])
    if (yearText != null) __obj.updateDynamic("yearText")(yearText.asInstanceOf[js.Any])
    if (yearTo != null) __obj.updateDynamic("yearTo")(yearTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePicker]
  }
}

