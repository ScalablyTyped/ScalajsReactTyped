package typingsJapgolly.senchaTouch.Ext.field

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.IDecorator
import typingsJapgolly.senchaTouch.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IField extends IDecorator {
  /** [Config Option] (Boolean) */
  var clearIcon: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var fieldCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var fieldLabel: js.UndefOr[String] = js.undefined
  /** [Method] Returns the value of clearIcon
  		* @returns Boolean
  		*/
  var getClearIcon: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of inputCls
  		* @returns String
  		*/
  var getInputCls: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of inputType
  		* @returns String
  		*/
  var getInputType: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of label
  		* @returns String
  		*/
  var getLabel: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of labelAlign
  		* @returns String
  		*/
  var getLabelAlign: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of labelCls
  		* @returns String
  		*/
  var getLabelCls: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of labelWidth
  		* @returns Number/String
  		*/
  var getLabelWidth: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of labelWrap
  		* @returns Boolean
  		*/
  var getLabelWrap: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of name
  		* @returns String
  		*/
  var getName: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of required
  		* @returns Boolean
  		*/
  var getRequired: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of requiredCls
  		* @returns String
  		*/
  var getRequiredCls: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of tabIndex
  		* @returns Number
  		*/
  var getTabIndex: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of value
  		* @returns Mixed
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String) */
  var inputCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var inputType: js.UndefOr[String] = js.undefined
  /** [Method] Returns true if the value of this Field has been changed from its originalValue
  		* @returns Boolean true if this field has been changed from its original value (and is not disabled), false otherwise.
  		*/
  var isDirty: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Property] (Boolean) */
  var isField: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var label: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var labelAlign: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var labelCls: js.UndefOr[String] = js.undefined
  /** [Property] (Ext.Element) */
  var labelEl: js.UndefOr[IElement] = js.undefined
  /** [Config Option] (Number/String) */
  var labelWidth: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var labelWrap: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.undefined
  /** [Property] (Mixed) */
  var originalValue: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var required: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var requiredCls: js.UndefOr[String] = js.undefined
  /** [Method] Resets the current field value back to the original value on this field when it was created
  		* @returns Ext.field.Field this
  		*/
  var reset: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Resets the field s originalValue property so it matches the current value  */
  var resetOriginalValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets the value of clearIcon
  		* @param clearIcon Boolean The new value.
  		*/
  var setClearIcon: js.UndefOr[js.Function1[/* clearIcon */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of inputCls
  		* @param inputCls String The new value.
  		*/
  var setInputCls: js.UndefOr[js.Function1[/* inputCls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of inputType
  		* @param inputType String The new value.
  		*/
  var setInputType: js.UndefOr[js.Function1[/* inputType */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of label
  		* @param label String The new value.
  		*/
  var setLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of labelAlign
  		* @param labelAlign String The new value.
  		*/
  var setLabelAlign: js.UndefOr[js.Function1[/* labelAlign */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of labelCls
  		* @param labelCls String The new value.
  		*/
  var setLabelCls: js.UndefOr[js.Function1[/* labelCls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of labelWidth
  		* @param labelWidth Number/String The new value.
  		*/
  var setLabelWidth: js.UndefOr[js.Function1[/* labelWidth */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of labelWrap
  		* @param labelWrap Boolean The new value.
  		*/
  var setLabelWrap: js.UndefOr[js.Function1[/* labelWrap */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name String The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of required
  		* @param required Boolean The new value.
  		*/
  var setRequired: js.UndefOr[js.Function1[/* required */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of requiredCls
  		* @param requiredCls String The new value.
  		*/
  var setRequiredCls: js.UndefOr[js.Function1[/* requiredCls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of tabIndex
  		* @param tabIndex Number The new value.
  		*/
  var setTabIndex: js.UndefOr[js.Function1[/* tabIndex */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of value
  		* @param value Mixed The new value.
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var tabIndex: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var useClearIcon: js.UndefOr[String] = js.undefined
  /** [Config Option] (Mixed) */
  var value: js.UndefOr[js.Any] = js.undefined
}

object IField {
  @scala.inline
  def apply(
    IDecorator: IDecorator = null,
    clearIcon: js.UndefOr[Boolean] = js.undefined,
    fieldCls: String = null,
    fieldLabel: String = null,
    getClearIcon: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getInputCls: js.UndefOr[CallbackTo[String]] = js.undefined,
    getInputType: js.UndefOr[CallbackTo[String]] = js.undefined,
    getLabel: js.UndefOr[CallbackTo[String]] = js.undefined,
    getLabelAlign: js.UndefOr[CallbackTo[String]] = js.undefined,
    getLabelCls: js.UndefOr[CallbackTo[String]] = js.undefined,
    getLabelWidth: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getLabelWrap: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getName: js.UndefOr[CallbackTo[String]] = js.undefined,
    getRequired: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getRequiredCls: js.UndefOr[CallbackTo[String]] = js.undefined,
    getTabIndex: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getValue: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    inputCls: String = null,
    inputType: String = null,
    isDirty: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isField: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    labelAlign: String = null,
    labelCls: String = null,
    labelEl: IElement = null,
    labelWidth: js.Any = null,
    labelWrap: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    originalValue: js.Any = null,
    required: js.UndefOr[Boolean] = js.undefined,
    requiredCls: String = null,
    reset: js.UndefOr[CallbackTo[IField]] = js.undefined,
    resetOriginalValue: js.UndefOr[Callback] = js.undefined,
    setClearIcon: /* clearIcon */ js.UndefOr[Boolean] => Callback = null,
    setInputCls: /* inputCls */ js.UndefOr[String] => Callback = null,
    setInputType: /* inputType */ js.UndefOr[String] => Callback = null,
    setLabel: /* label */ js.UndefOr[String] => Callback = null,
    setLabelAlign: /* labelAlign */ js.UndefOr[String] => Callback = null,
    setLabelCls: /* labelCls */ js.UndefOr[String] => Callback = null,
    setLabelWidth: /* labelWidth */ js.UndefOr[js.Any] => Callback = null,
    setLabelWrap: /* labelWrap */ js.UndefOr[Boolean] => Callback = null,
    setName: /* name */ js.UndefOr[String] => Callback = null,
    setRequired: /* required */ js.UndefOr[Boolean] => Callback = null,
    setRequiredCls: /* requiredCls */ js.UndefOr[String] => Callback = null,
    setTabIndex: /* tabIndex */ js.UndefOr[Double] => Callback = null,
    setValue: /* value */ js.UndefOr[js.Any] => Callback = null,
    tabIndex: Int | Double = null,
    useClearIcon: String = null,
    value: js.Any = null
  ): IField = {
    val __obj = js.Dynamic.literal()
    if (IDecorator != null) js.Dynamic.global.Object.assign(__obj, IDecorator)
    if (!js.isUndefined(clearIcon)) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    if (fieldCls != null) __obj.updateDynamic("fieldCls")(fieldCls.asInstanceOf[js.Any])
    if (fieldLabel != null) __obj.updateDynamic("fieldLabel")(fieldLabel.asInstanceOf[js.Any])
    getClearIcon.foreach(p => __obj.updateDynamic("getClearIcon")(p.toJsFn))
    getInputCls.foreach(p => __obj.updateDynamic("getInputCls")(p.toJsFn))
    getInputType.foreach(p => __obj.updateDynamic("getInputType")(p.toJsFn))
    getLabel.foreach(p => __obj.updateDynamic("getLabel")(p.toJsFn))
    getLabelAlign.foreach(p => __obj.updateDynamic("getLabelAlign")(p.toJsFn))
    getLabelCls.foreach(p => __obj.updateDynamic("getLabelCls")(p.toJsFn))
    getLabelWidth.foreach(p => __obj.updateDynamic("getLabelWidth")(p.toJsFn))
    getLabelWrap.foreach(p => __obj.updateDynamic("getLabelWrap")(p.toJsFn))
    getName.foreach(p => __obj.updateDynamic("getName")(p.toJsFn))
    getRequired.foreach(p => __obj.updateDynamic("getRequired")(p.toJsFn))
    getRequiredCls.foreach(p => __obj.updateDynamic("getRequiredCls")(p.toJsFn))
    getTabIndex.foreach(p => __obj.updateDynamic("getTabIndex")(p.toJsFn))
    getValue.foreach(p => __obj.updateDynamic("getValue")(p.toJsFn))
    if (inputCls != null) __obj.updateDynamic("inputCls")(inputCls.asInstanceOf[js.Any])
    if (inputType != null) __obj.updateDynamic("inputType")(inputType.asInstanceOf[js.Any])
    isDirty.foreach(p => __obj.updateDynamic("isDirty")(p.toJsFn))
    if (!js.isUndefined(isField)) __obj.updateDynamic("isField")(isField.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign.asInstanceOf[js.Any])
    if (labelCls != null) __obj.updateDynamic("labelCls")(labelCls.asInstanceOf[js.Any])
    if (labelEl != null) __obj.updateDynamic("labelEl")(labelEl.asInstanceOf[js.Any])
    if (labelWidth != null) __obj.updateDynamic("labelWidth")(labelWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(labelWrap)) __obj.updateDynamic("labelWrap")(labelWrap.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (originalValue != null) __obj.updateDynamic("originalValue")(originalValue.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (requiredCls != null) __obj.updateDynamic("requiredCls")(requiredCls.asInstanceOf[js.Any])
    reset.foreach(p => __obj.updateDynamic("reset")(p.toJsFn))
    resetOriginalValue.foreach(p => __obj.updateDynamic("resetOriginalValue")(p.toJsFn))
    if (setClearIcon != null) __obj.updateDynamic("setClearIcon")(js.Any.fromFunction1((t0: /* clearIcon */ js.UndefOr[scala.Boolean]) => setClearIcon(t0).runNow()))
    if (setInputCls != null) __obj.updateDynamic("setInputCls")(js.Any.fromFunction1((t0: /* inputCls */ js.UndefOr[java.lang.String]) => setInputCls(t0).runNow()))
    if (setInputType != null) __obj.updateDynamic("setInputType")(js.Any.fromFunction1((t0: /* inputType */ js.UndefOr[java.lang.String]) => setInputType(t0).runNow()))
    if (setLabel != null) __obj.updateDynamic("setLabel")(js.Any.fromFunction1((t0: /* label */ js.UndefOr[java.lang.String]) => setLabel(t0).runNow()))
    if (setLabelAlign != null) __obj.updateDynamic("setLabelAlign")(js.Any.fromFunction1((t0: /* labelAlign */ js.UndefOr[java.lang.String]) => setLabelAlign(t0).runNow()))
    if (setLabelCls != null) __obj.updateDynamic("setLabelCls")(js.Any.fromFunction1((t0: /* labelCls */ js.UndefOr[java.lang.String]) => setLabelCls(t0).runNow()))
    if (setLabelWidth != null) __obj.updateDynamic("setLabelWidth")(js.Any.fromFunction1((t0: /* labelWidth */ js.UndefOr[js.Any]) => setLabelWidth(t0).runNow()))
    if (setLabelWrap != null) __obj.updateDynamic("setLabelWrap")(js.Any.fromFunction1((t0: /* labelWrap */ js.UndefOr[scala.Boolean]) => setLabelWrap(t0).runNow()))
    if (setName != null) __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => setName(t0).runNow()))
    if (setRequired != null) __obj.updateDynamic("setRequired")(js.Any.fromFunction1((t0: /* required */ js.UndefOr[scala.Boolean]) => setRequired(t0).runNow()))
    if (setRequiredCls != null) __obj.updateDynamic("setRequiredCls")(js.Any.fromFunction1((t0: /* requiredCls */ js.UndefOr[java.lang.String]) => setRequiredCls(t0).runNow()))
    if (setTabIndex != null) __obj.updateDynamic("setTabIndex")(js.Any.fromFunction1((t0: /* tabIndex */ js.UndefOr[scala.Double]) => setTabIndex(t0).runNow()))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => setValue(t0).runNow()))
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (useClearIcon != null) __obj.updateDynamic("useClearIcon")(useClearIcon.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IField]
  }
}

