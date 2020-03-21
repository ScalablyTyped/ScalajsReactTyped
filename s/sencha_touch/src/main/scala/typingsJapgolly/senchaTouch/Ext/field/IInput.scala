package typingsJapgolly.senchaTouch.Ext.field

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInput extends IComponent {
  /** [Config Option] (Boolean) */
  var autoCapitalize: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var autoComplete: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var autoCorrect: js.UndefOr[Boolean] = js.undefined
  /** [Method] Attempts to forcefully blur input focus for the field
  		* @returns Ext.field.Input this
  		*/
  var blur: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  @JSName("cls")
  var cls_IInput: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var fastFocus: js.UndefOr[Boolean] = js.undefined
  /** [Method] Attempts to set the field as the active input focus
  		* @returns Ext.field.Input this
  		*/
  var focus: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (String) */
  var focusCls: js.UndefOr[String] = js.undefined
  /** [Method] Returns the value of autoCapitalize
  		* @returns Boolean
  		*/
  var getAutoCapitalize: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of autoComplete
  		* @returns Boolean
  		*/
  var getAutoComplete: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of autoCorrect
  		* @returns Boolean
  		*/
  var getAutoCorrect: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the checked value of this field
  		* @returns Mixed value The field value
  		*/
  var getChecked: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  @JSName("getCls")
  var getCls_IInput: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of fastFocus
  		* @returns Boolean
  		*/
  var getFastFocus: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of focusCls
  		* @returns String
  		*/
  var getFocusCls: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of maxLength
  		* @returns Number
  		*/
  var getMaxLength: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of maxRows
  		* @returns Number
  		*/
  var getMaxRows: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of maxValue
  		* @returns Number
  		*/
  var getMaxValue: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of minValue
  		* @returns Number
  		*/
  var getMinValue: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of name
  		* @returns String
  		*/
  var getName: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of pattern
  		* @returns String
  		*/
  var getPattern: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of placeHolder
  		* @returns String
  		*/
  var getPlaceHolder: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of readOnly
  		* @returns Boolean
  		*/
  var getReadOnly: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of startValue
  		* @returns Mixed
  		*/
  var getStartValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of stepValue
  		* @returns Number
  		*/
  var getStepValue: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of tabIndex
  		* @returns Number
  		*/
  var getTabIndex: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of type
  		* @returns String
  		*/
  var getType: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the field data value
  		* @returns Mixed value The field value.
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns true if the value of this Field has been changed from its original value
  		* @returns Boolean
  		*/
  var isDirty: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Property] (Boolean) */
  var isFocused: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var maxLength: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var maxRows: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var pattern: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var placeHolder: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** [Method] Resets the current field value to the original value  */
  var reset: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Attempts to forcefully select all the contents of the input field
  		* @returns Ext.field.Input this
  		*/
  var select: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Sets the value of autoCapitalize
  		* @param autoCapitalize Boolean The new value.
  		*/
  var setAutoCapitalize: js.UndefOr[js.Function1[/* autoCapitalize */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of autoComplete
  		* @param autoComplete Boolean The new value.
  		*/
  var setAutoComplete: js.UndefOr[js.Function1[/* autoComplete */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of autoCorrect
  		* @param autoCorrect Boolean The new value.
  		*/
  var setAutoCorrect: js.UndefOr[js.Function1[/* autoCorrect */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  @JSName("setCls")
  var setCls_IInput: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of fastFocus
  		* @param fastFocus Boolean The new value.
  		*/
  var setFastFocus: js.UndefOr[js.Function1[/* fastFocus */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of focusCls
  		* @param focusCls String The new value.
  		*/
  var setFocusCls: js.UndefOr[js.Function1[/* focusCls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of maxLength
  		* @param maxLength Number The new value.
  		*/
  var setMaxLength: js.UndefOr[js.Function1[/* maxLength */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of maxRows
  		* @param maxRows Number The new value.
  		*/
  var setMaxRows: js.UndefOr[js.Function1[/* maxRows */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of maxValue
  		* @param maxValue Number The new value.
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* maxValue */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of minValue
  		* @param minValue Number The new value.
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* minValue */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name String The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of pattern
  		* @param pattern String The new value.
  		*/
  var setPattern: js.UndefOr[js.Function1[/* pattern */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of placeHolder
  		* @param placeHolder String The new value.
  		*/
  var setPlaceHolder: js.UndefOr[js.Function1[/* placeHolder */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of readOnly
  		* @param readOnly Boolean The new value.
  		*/
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of startValue
  		* @param startValue Mixed The new value.
  		*/
  var setStartValue: js.UndefOr[js.Function1[/* startValue */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of stepValue
  		* @param stepValue Number The new value.
  		*/
  var setStepValue: js.UndefOr[js.Function1[/* stepValue */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of tabIndex
  		* @param tabIndex Number The new value.
  		*/
  var setTabIndex: js.UndefOr[js.Function1[/* tabIndex */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of type
  		* @param type String The new value.
  		*/
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (Mixed) */
  var startValue: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var stepValue: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var tabIndex: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.undefined
  /** [Method] Updates the cls configuration
  		* @param newCls Object
  		* @param oldCls Object
  		*/
  var updateCls: js.UndefOr[
    js.Function2[/* newCls */ js.UndefOr[js.Any], /* oldCls */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Updates the useMask configuration
  		* @param newUseMask Object
  		*/
  var updateUseMask: js.UndefOr[js.Function1[/* newUseMask */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Mixed) */
  var value: js.UndefOr[js.Any] = js.undefined
}

object IInput {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    autoCapitalize: js.UndefOr[Boolean] = js.undefined,
    autoComplete: js.UndefOr[Boolean] = js.undefined,
    autoCorrect: js.UndefOr[Boolean] = js.undefined,
    blur: js.UndefOr[CallbackTo[IInput]] = js.undefined,
    checked: js.UndefOr[Boolean] = js.undefined,
    cls: String = null,
    fastFocus: js.UndefOr[Boolean] = js.undefined,
    focus: js.UndefOr[CallbackTo[IInput]] = js.undefined,
    focusCls: String = null,
    getAutoCapitalize: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getAutoComplete: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getAutoCorrect: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getChecked: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getCls: js.UndefOr[CallbackTo[String]] = js.undefined,
    getFastFocus: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getFocusCls: js.UndefOr[CallbackTo[String]] = js.undefined,
    getMaxLength: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMaxRows: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMaxValue: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMinValue: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getName: js.UndefOr[CallbackTo[String]] = js.undefined,
    getPattern: js.UndefOr[CallbackTo[String]] = js.undefined,
    getPlaceHolder: js.UndefOr[CallbackTo[String]] = js.undefined,
    getReadOnly: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getStartValue: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getStepValue: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getTabIndex: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getType: js.UndefOr[CallbackTo[String]] = js.undefined,
    getValue: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    isDirty: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isFocused: js.UndefOr[Boolean] = js.undefined,
    maxLength: Int | Double = null,
    maxRows: Int | Double = null,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    name: String = null,
    pattern: String = null,
    placeHolder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    reset: js.UndefOr[Callback] = js.undefined,
    select: js.UndefOr[CallbackTo[IInput]] = js.undefined,
    setAutoCapitalize: /* autoCapitalize */ js.UndefOr[Boolean] => Callback = null,
    setAutoComplete: /* autoComplete */ js.UndefOr[Boolean] => Callback = null,
    setAutoCorrect: /* autoCorrect */ js.UndefOr[Boolean] => Callback = null,
    setCls: /* cls */ js.UndefOr[String] => Callback = null,
    setFastFocus: /* fastFocus */ js.UndefOr[Boolean] => Callback = null,
    setFocusCls: /* focusCls */ js.UndefOr[String] => Callback = null,
    setMaxLength: /* maxLength */ js.UndefOr[Double] => Callback = null,
    setMaxRows: /* maxRows */ js.UndefOr[Double] => Callback = null,
    setMaxValue: /* maxValue */ js.UndefOr[Double] => Callback = null,
    setMinValue: /* minValue */ js.UndefOr[Double] => Callback = null,
    setName: /* name */ js.UndefOr[String] => Callback = null,
    setPattern: /* pattern */ js.UndefOr[String] => Callback = null,
    setPlaceHolder: /* placeHolder */ js.UndefOr[String] => Callback = null,
    setReadOnly: /* readOnly */ js.UndefOr[Boolean] => Callback = null,
    setStartValue: /* startValue */ js.UndefOr[js.Any] => Callback = null,
    setStepValue: /* stepValue */ js.UndefOr[Double] => Callback = null,
    setTabIndex: /* tabIndex */ js.UndefOr[Double] => Callback = null,
    setType: /* type */ js.UndefOr[String] => Callback = null,
    startValue: js.Any = null,
    stepValue: Int | Double = null,
    tabIndex: Int | Double = null,
    `type`: String = null,
    updateCls: (/* newCls */ js.UndefOr[js.Any], /* oldCls */ js.UndefOr[js.Any]) => Callback = null,
    updateUseMask: /* newUseMask */ js.UndefOr[js.Any] => Callback = null,
    value: js.Any = null
  ): IInput = {
    val __obj = js.Dynamic.literal()
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    if (!js.isUndefined(autoCapitalize)) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (!js.isUndefined(autoComplete)) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCorrect)) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    blur.foreach(p => __obj.updateDynamic("blur")(p.toJsFn))
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (cls != null) __obj.updateDynamic("cls")(cls.asInstanceOf[js.Any])
    if (!js.isUndefined(fastFocus)) __obj.updateDynamic("fastFocus")(fastFocus.asInstanceOf[js.Any])
    focus.foreach(p => __obj.updateDynamic("focus")(p.toJsFn))
    if (focusCls != null) __obj.updateDynamic("focusCls")(focusCls.asInstanceOf[js.Any])
    getAutoCapitalize.foreach(p => __obj.updateDynamic("getAutoCapitalize")(p.toJsFn))
    getAutoComplete.foreach(p => __obj.updateDynamic("getAutoComplete")(p.toJsFn))
    getAutoCorrect.foreach(p => __obj.updateDynamic("getAutoCorrect")(p.toJsFn))
    getChecked.foreach(p => __obj.updateDynamic("getChecked")(p.toJsFn))
    getCls.foreach(p => __obj.updateDynamic("getCls")(p.toJsFn))
    getFastFocus.foreach(p => __obj.updateDynamic("getFastFocus")(p.toJsFn))
    getFocusCls.foreach(p => __obj.updateDynamic("getFocusCls")(p.toJsFn))
    getMaxLength.foreach(p => __obj.updateDynamic("getMaxLength")(p.toJsFn))
    getMaxRows.foreach(p => __obj.updateDynamic("getMaxRows")(p.toJsFn))
    getMaxValue.foreach(p => __obj.updateDynamic("getMaxValue")(p.toJsFn))
    getMinValue.foreach(p => __obj.updateDynamic("getMinValue")(p.toJsFn))
    getName.foreach(p => __obj.updateDynamic("getName")(p.toJsFn))
    getPattern.foreach(p => __obj.updateDynamic("getPattern")(p.toJsFn))
    getPlaceHolder.foreach(p => __obj.updateDynamic("getPlaceHolder")(p.toJsFn))
    getReadOnly.foreach(p => __obj.updateDynamic("getReadOnly")(p.toJsFn))
    getStartValue.foreach(p => __obj.updateDynamic("getStartValue")(p.toJsFn))
    getStepValue.foreach(p => __obj.updateDynamic("getStepValue")(p.toJsFn))
    getTabIndex.foreach(p => __obj.updateDynamic("getTabIndex")(p.toJsFn))
    getType.foreach(p => __obj.updateDynamic("getType")(p.toJsFn))
    getValue.foreach(p => __obj.updateDynamic("getValue")(p.toJsFn))
    isDirty.foreach(p => __obj.updateDynamic("isDirty")(p.toJsFn))
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    reset.foreach(p => __obj.updateDynamic("reset")(p.toJsFn))
    select.foreach(p => __obj.updateDynamic("select")(p.toJsFn))
    if (setAutoCapitalize != null) __obj.updateDynamic("setAutoCapitalize")(js.Any.fromFunction1((t0: /* autoCapitalize */ js.UndefOr[scala.Boolean]) => setAutoCapitalize(t0).runNow()))
    if (setAutoComplete != null) __obj.updateDynamic("setAutoComplete")(js.Any.fromFunction1((t0: /* autoComplete */ js.UndefOr[scala.Boolean]) => setAutoComplete(t0).runNow()))
    if (setAutoCorrect != null) __obj.updateDynamic("setAutoCorrect")(js.Any.fromFunction1((t0: /* autoCorrect */ js.UndefOr[scala.Boolean]) => setAutoCorrect(t0).runNow()))
    if (setCls != null) __obj.updateDynamic("setCls")(js.Any.fromFunction1((t0: /* cls */ js.UndefOr[java.lang.String]) => setCls(t0).runNow()))
    if (setFastFocus != null) __obj.updateDynamic("setFastFocus")(js.Any.fromFunction1((t0: /* fastFocus */ js.UndefOr[scala.Boolean]) => setFastFocus(t0).runNow()))
    if (setFocusCls != null) __obj.updateDynamic("setFocusCls")(js.Any.fromFunction1((t0: /* focusCls */ js.UndefOr[java.lang.String]) => setFocusCls(t0).runNow()))
    if (setMaxLength != null) __obj.updateDynamic("setMaxLength")(js.Any.fromFunction1((t0: /* maxLength */ js.UndefOr[scala.Double]) => setMaxLength(t0).runNow()))
    if (setMaxRows != null) __obj.updateDynamic("setMaxRows")(js.Any.fromFunction1((t0: /* maxRows */ js.UndefOr[scala.Double]) => setMaxRows(t0).runNow()))
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(js.Any.fromFunction1((t0: /* maxValue */ js.UndefOr[scala.Double]) => setMaxValue(t0).runNow()))
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(js.Any.fromFunction1((t0: /* minValue */ js.UndefOr[scala.Double]) => setMinValue(t0).runNow()))
    if (setName != null) __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => setName(t0).runNow()))
    if (setPattern != null) __obj.updateDynamic("setPattern")(js.Any.fromFunction1((t0: /* pattern */ js.UndefOr[java.lang.String]) => setPattern(t0).runNow()))
    if (setPlaceHolder != null) __obj.updateDynamic("setPlaceHolder")(js.Any.fromFunction1((t0: /* placeHolder */ js.UndefOr[java.lang.String]) => setPlaceHolder(t0).runNow()))
    if (setReadOnly != null) __obj.updateDynamic("setReadOnly")(js.Any.fromFunction1((t0: /* readOnly */ js.UndefOr[scala.Boolean]) => setReadOnly(t0).runNow()))
    if (setStartValue != null) __obj.updateDynamic("setStartValue")(js.Any.fromFunction1((t0: /* startValue */ js.UndefOr[js.Any]) => setStartValue(t0).runNow()))
    if (setStepValue != null) __obj.updateDynamic("setStepValue")(js.Any.fromFunction1((t0: /* stepValue */ js.UndefOr[scala.Double]) => setStepValue(t0).runNow()))
    if (setTabIndex != null) __obj.updateDynamic("setTabIndex")(js.Any.fromFunction1((t0: /* tabIndex */ js.UndefOr[scala.Double]) => setTabIndex(t0).runNow()))
    if (setType != null) __obj.updateDynamic("setType")(js.Any.fromFunction1((t0: /* type */ js.UndefOr[java.lang.String]) => setType(t0).runNow()))
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    if (stepValue != null) __obj.updateDynamic("stepValue")(stepValue.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (updateCls != null) __obj.updateDynamic("updateCls")(js.Any.fromFunction2((t0: /* newCls */ js.UndefOr[js.Any], t1: /* oldCls */ js.UndefOr[js.Any]) => updateCls(t0, t1).runNow()))
    if (updateUseMask != null) __obj.updateDynamic("updateUseMask")(js.Any.fromFunction1((t0: /* newUseMask */ js.UndefOr[js.Any]) => updateUseMask(t0).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInput]
  }
}

