package typingsJapgolly.extjs.Ext.form.field

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IField
  extends typingsJapgolly.extjs.Ext.IBase {
  /** [Method] A utility for grouping a set of modifications which may trigger value changes into a single transaction to prevent e
  		* @param fn Object A function containing the transaction code
  		*/
  var batchChanges: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Template method before a field is reset  */
  var beforeReset: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Checks whether the value of the field has changed since the last time it was checked  */
  var checkChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Checks the isDirty state of the field and if it has changed since the last time it was checked fires the dirtychange  */
  var checkDirty: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Clear any invalid styles messages for this field  */
  var clearInvalid: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** [Method] Only relevant if the instance s isFileUpload method returns true
  		* @returns any
  		*/
  var extractFileInput: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Runs this field s validators and returns an array of error messages for any validation failures
  		* @param value Object The value to get errors for (defaults to the current field value)
  		* @returns any All error messages for this field; an empty Array if none.
  		*/
  var getErrors: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the value s that should be saved to the Ext data Model instance for this field when Ext form Basic updateRe
  		* @returns any A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
  		*/
  var getModelData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the name attribute of the field
  		* @returns string name The field name
  		*/
  var getName: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the parameter s that would be included in a standard form submit for this field
  		* @returns any A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
  		*/
  var getSubmitData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the current data value of the field
  		* @returns any value The field value
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Initializes this Field mixin on the current instance  */
  var initField: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Initializes the field s value based on the initial config  */
  var initValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns true if the value of this Field has been changed from its originalValue
  		* @returns any True if this field has been changed from its original value (and is not disabled), false otherwise.
  		*/
  var isDirty: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns whether two field values are logically equal
  		* @param value1 Object The first value to compare
  		* @param value2 Object The second value to compare
  		* @returns any True if the values are equal, false if inequal.
  		*/
  var isEqual: js.UndefOr[
    js.Function2[/* value1 */ js.UndefOr[js.Any], /* value2 */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
  		* @returns any
  		*/
  var isFileUpload: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Property] (Boolean) */
  var isFormField: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value
  		* @returns any True if the value is valid, else false
  		*/
  var isValid: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Associate one or more error messages with this field
  		* @param errors String/String[] The error message(s) for the field.
  		*/
  var markInvalid: js.UndefOr[js.Function1[/* errors */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.undefined
  /** [Property] (Object) */
  var originalValue: js.UndefOr[js.Any] = js.undefined
  /** [Method] Resets the current field value to the originally loaded value and clears any validation messages  */
  var reset: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Resets the field s originalValue property so it matches the current value  */
  var resetOriginalValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets a data value into the field and runs the change detection and validation
  		* @param value Object The value to set
  		* @returns any this
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Boolean) */
  var submitValue: js.UndefOr[Boolean] = js.undefined
  /** [Method] Allows for any necessary modifications before the original value is set
  		* @param value Object The initial value
  		* @returns any The modified initial value
  		*/
  var transformOriginalValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value and fires the vali
  		* @returns any True if the value is valid, else false
  		*/
  var validate: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Boolean) */
  var validateOnChange: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object) */
  var value: js.UndefOr[js.Any] = js.undefined
}

object IField {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    batchChanges: /* fn */ js.UndefOr[js.Any] => Callback = null,
    beforeReset: js.UndefOr[Callback] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    checkChange: js.UndefOr[Callback] = js.undefined,
    checkDirty: js.UndefOr[Callback] = js.undefined,
    clearInvalid: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    extend: String = null,
    extractFileInput: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getErrors: /* value */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getModelData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getName: js.UndefOr[CallbackTo[String]] = js.undefined,
    getSubmitData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getValue: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IField] = null,
    initField: js.UndefOr[Callback] = js.undefined,
    initValue: js.UndefOr[Callback] = js.undefined,
    isDirty: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    isEqual: (/* value1 */ js.UndefOr[js.Any], /* value2 */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    isFileUpload: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    isFormField: js.UndefOr[Boolean] = js.undefined,
    isValid: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    markInvalid: /* errors */ js.UndefOr[js.Any] => Callback = null,
    mixins: js.Any = null,
    name: String = null,
    originalValue: js.Any = null,
    requires: Array = null,
    reset: js.UndefOr[Callback] = js.undefined,
    resetOriginalValue: js.UndefOr[Callback] = js.undefined,
    self: IClass = null,
    setValue: /* value */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    submitValue: js.UndefOr[Boolean] = js.undefined,
    transformOriginalValue: /* value */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    uses: Array = null,
    validate: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    validateOnChange: js.UndefOr[Boolean] = js.undefined,
    value: js.Any = null
  ): IField = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (batchChanges != null) __obj.updateDynamic("batchChanges")(js.Any.fromFunction1((t0: /* fn */ js.UndefOr[js.Any]) => batchChanges(t0).runNow()))
    beforeReset.foreach(p => __obj.updateDynamic("beforeReset")(p.toJsFn))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    checkChange.foreach(p => __obj.updateDynamic("checkChange")(p.toJsFn))
    checkDirty.foreach(p => __obj.updateDynamic("checkDirty")(p.toJsFn))
    clearInvalid.foreach(p => __obj.updateDynamic("clearInvalid")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    extractFileInput.foreach(p => __obj.updateDynamic("extractFileInput")(p.toJsFn))
    if (getErrors != null) __obj.updateDynamic("getErrors")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => getErrors(t0).runNow()))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getModelData.foreach(p => __obj.updateDynamic("getModelData")(p.toJsFn))
    getName.foreach(p => __obj.updateDynamic("getName")(p.toJsFn))
    getSubmitData.foreach(p => __obj.updateDynamic("getSubmitData")(p.toJsFn))
    getValue.foreach(p => __obj.updateDynamic("getValue")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    initField.foreach(p => __obj.updateDynamic("initField")(p.toJsFn))
    initValue.foreach(p => __obj.updateDynamic("initValue")(p.toJsFn))
    isDirty.foreach(p => __obj.updateDynamic("isDirty")(p.toJsFn))
    if (isEqual != null) __obj.updateDynamic("isEqual")(js.Any.fromFunction2((t0: /* value1 */ js.UndefOr[js.Any], t1: /* value2 */ js.UndefOr[js.Any]) => isEqual(t0, t1).runNow()))
    isFileUpload.foreach(p => __obj.updateDynamic("isFileUpload")(p.toJsFn))
    if (!js.isUndefined(isFormField)) __obj.updateDynamic("isFormField")(isFormField.asInstanceOf[js.Any])
    isValid.foreach(p => __obj.updateDynamic("isValid")(p.toJsFn))
    if (markInvalid != null) __obj.updateDynamic("markInvalid")(js.Any.fromFunction1((t0: /* errors */ js.UndefOr[js.Any]) => markInvalid(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (originalValue != null) __obj.updateDynamic("originalValue")(originalValue.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    reset.foreach(p => __obj.updateDynamic("reset")(p.toJsFn))
    resetOriginalValue.foreach(p => __obj.updateDynamic("resetOriginalValue")(p.toJsFn))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => setValue(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (!js.isUndefined(submitValue)) __obj.updateDynamic("submitValue")(submitValue.asInstanceOf[js.Any])
    if (transformOriginalValue != null) __obj.updateDynamic("transformOriginalValue")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => transformOriginalValue(t0).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    validate.foreach(p => __obj.updateDynamic("validate")(p.toJsFn))
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IField]
  }
}

