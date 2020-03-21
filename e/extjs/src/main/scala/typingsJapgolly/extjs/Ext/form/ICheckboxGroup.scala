package typingsJapgolly.extjs.Ext.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.extjs.Ext.IClass because Already inherited
- typingsJapgolly.extjs.Ext.IBase because Already inherited
- typingsJapgolly.extjs.Ext.form.field.IField because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, disabled, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined name, submitValue, validateOnChange, value, isFormField, originalValue, batchChanges, beforeReset, checkChange, checkDirty, clearInvalid, extractFileInput, getErrors, getModelData, getName, getSubmitData, getValue, initField, initValue, isDirty, isEqual, isFileUpload, isValid, markInvalid, reset, resetOriginalValue, setValue, transformOriginalValue, validate */ trait ICheckboxGroup extends IFieldContainer {
  /** [Config Option] (Boolean) */
  var allowBlank: js.UndefOr[Boolean] = js.undefined
  /** [Method] A utility for grouping a set of modifications which may trigger value changes into a single transaction to prevent e
  		* @param fn Object A function containing the transaction code
  		*/
  var batchChanges: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Template method before a field is reset  */
  var beforeReset: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var blankText: js.UndefOr[String] = js.undefined
  /** [Method] Checks whether the value of the field has changed since the last time it was checked  */
  var checkChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Checks the isDirty state of the field and if it has changed since the last time it was checked fires the dirtychange  */
  var checkDirty: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Clear any invalid styles messages for this field  */
  var clearInvalid: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String/Number/Number[]) */
  var columns: js.UndefOr[js.Any] = js.undefined
  /** [Method] Only relevant if the instance s isFileUpload method returns true
  		* @returns HTMLElement
  		*/
  var extractFileInput: js.UndefOr[js.Function0[_ | HTMLElement]] = js.undefined
  /** [Method] Returns an Array of all checkboxes in the container which are currently checked
  		* @returns Ext.form.field.Checkbox[] Array of Ext.form.field.Checkbox components
  		*/
  var getChecked: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Runs CheckboxGroup s validations and returns an array of any errors
  		* @returns String[] Array of all validation errors
  		*/
  var getErrors: js.UndefOr[js.Function0[Array] | (js.Function1[/* value */ js.UndefOr[js.Any], _])] = js.undefined
  /** [Method] Don t return any data for the model the form will get the info from the individual checkboxes themselves
  		* @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
  		*/
  var getModelData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the name attribute of the field
  		* @returns String name The field name
  		*/
  var getName: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Don t return any data for submit the form will get the info from the individual checkboxes themselves
  		* @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
  		*/
  var getSubmitData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns an object containing the values of all checked checkboxes within the group  */
  var getValue: js.UndefOr[js.Function0[_ | Unit]] = js.undefined
  /** [Method] Initializes this Field mixin on the current instance  */
  var initField: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Initializes the field s value based on the initial config  */
  var initValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] private override
  		* @returns Boolean True if this field has been changed from its original value (and is not disabled), false otherwise.
  		*/
  var isDirty: js.UndefOr[js.Function0[_ | Boolean]] = js.undefined
  /** [Method] private override  the group value is a complex object compare using object serialization
  		* @param value1 Object
  		* @param value2 Object
  		* @returns Boolean True if the values are equal, false if inequal.
  		*/
  var isEqual: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], _ | Boolean]] = js.undefined
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
  		* @returns Boolean
  		*/
  var isFileUpload: js.UndefOr[js.Function0[_ | Boolean]] = js.undefined
  /** [Property] (Boolean) */
  var isFormField: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value
  		* @returns Boolean True if the value is valid, else false
  		*/
  var isValid: js.UndefOr[js.Function0[_ | Boolean]] = js.undefined
  /** [Method] Associate one or more error messages with this field
  		* @param errors String/String[] The error message(s) for the field.
  		*/
  var markInvalid: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.undefined
  /** [Method] When a checkbox is added to the group monitor it for changes
  		* @param field Object
  		*/
  @JSName("onAdd")
  var onAdd_ICheckboxGroup: js.UndefOr[js.Function1[/* field */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Called when a Ext form Labelable instance is removed from the container s subtree
  		* @param item Object
  		*/
  @JSName("onRemove")
  var onRemove_ICheckboxGroup: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Property] (Object) */
  var originalValue: js.UndefOr[js.Any] = js.undefined
  /** [Method] Resets the checked state of all checkboxes in the group to their originally loaded values and clears any validation m  */
  var reset: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Resets the field s originalValue property so it matches the current value  */
  var resetOriginalValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets the value s of all checkboxes in the group
  		* @param value Object The mapping of checkbox names to values.
  		* @returns Ext.form.CheckboxGroup this
  		*/
  var setValue: js.UndefOr[js.Function1[js.UndefOr[js.Any], this.type | _]] = js.undefined
  /** [Config Option] (Boolean) */
  var submitValue: js.UndefOr[Boolean] = js.undefined
  /** [Method] Allows for any necessary modifications before the original value is set
  		* @param value Object The initial value
  		* @returns Object The modified initial value
  		*/
  var transformOriginalValue: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value and fires the vali
  		* @returns Boolean True if the value is valid, else false
  		*/
  var validate: js.UndefOr[js.Function0[_ | Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var validateOnChange: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object) */
  var value: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object ICheckboxGroup {
  @scala.inline
  def apply(
    IFieldContainer: IFieldContainer = null,
    allowBlank: js.UndefOr[Boolean] = js.undefined,
    batchChanges: js.UndefOr[js.Any] => Callback = null,
    beforeReset: js.UndefOr[Callback] = js.undefined,
    blankText: String = null,
    checkChange: js.UndefOr[Callback] = js.undefined,
    checkDirty: js.UndefOr[Callback] = js.undefined,
    clearInvalid: js.UndefOr[Callback] = js.undefined,
    columns: js.Any = null,
    extractFileInput: js.UndefOr[CallbackTo[js.Any | HTMLElement]] = js.undefined,
    getChecked: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getErrors: js.Function0[Array] | (js.Function1[/* value */ js.UndefOr[js.Any], _]) = null,
    getModelData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getName: js.UndefOr[CallbackTo[String]] = js.undefined,
    getSubmitData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getValue: js.UndefOr[CallbackTo[js.Any | Unit]] = js.undefined,
    initField: js.UndefOr[Callback] = js.undefined,
    initValue: js.UndefOr[Callback] = js.undefined,
    isDirty: js.UndefOr[CallbackTo[js.Any | Boolean]] = js.undefined,
    isEqual: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => CallbackTo[js.Any | Boolean] = null,
    isFileUpload: js.UndefOr[CallbackTo[js.Any | Boolean]] = js.undefined,
    isFormField: js.UndefOr[Boolean] = js.undefined,
    isValid: js.UndefOr[CallbackTo[js.Any | Boolean]] = js.undefined,
    markInvalid: js.UndefOr[js.Any] => Callback = null,
    name: String = null,
    onAdd: /* field */ js.UndefOr[js.Any] => Callback = null,
    onRemove: /* item */ js.UndefOr[js.Any] => Callback = null,
    originalValue: js.Any = null,
    reset: js.UndefOr[Callback] = js.undefined,
    resetOriginalValue: js.UndefOr[Callback] = js.undefined,
    setValue: js.UndefOr[js.Any] => CallbackTo[ICheckboxGroup | js.Any] = null,
    submitValue: js.UndefOr[Boolean] = js.undefined,
    transformOriginalValue: js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    validate: js.UndefOr[CallbackTo[js.Any | Boolean]] = js.undefined,
    validateOnChange: js.UndefOr[Boolean] = js.undefined,
    value: js.Any = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): ICheckboxGroup = {
    val __obj = js.Dynamic.literal()
    if (IFieldContainer != null) js.Dynamic.global.Object.assign(__obj, IFieldContainer)
    if (!js.isUndefined(allowBlank)) __obj.updateDynamic("allowBlank")(allowBlank.asInstanceOf[js.Any])
    if (batchChanges != null) __obj.updateDynamic("batchChanges")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => batchChanges(t0).runNow()))
    beforeReset.foreach(p => __obj.updateDynamic("beforeReset")(p.toJsFn))
    if (blankText != null) __obj.updateDynamic("blankText")(blankText.asInstanceOf[js.Any])
    checkChange.foreach(p => __obj.updateDynamic("checkChange")(p.toJsFn))
    checkDirty.foreach(p => __obj.updateDynamic("checkDirty")(p.toJsFn))
    clearInvalid.foreach(p => __obj.updateDynamic("clearInvalid")(p.toJsFn))
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    extractFileInput.foreach(p => __obj.updateDynamic("extractFileInput")(p.toJsFn))
    getChecked.foreach(p => __obj.updateDynamic("getChecked")(p.toJsFn))
    if (getErrors != null) __obj.updateDynamic("getErrors")(getErrors.asInstanceOf[js.Any])
    getModelData.foreach(p => __obj.updateDynamic("getModelData")(p.toJsFn))
    getName.foreach(p => __obj.updateDynamic("getName")(p.toJsFn))
    getSubmitData.foreach(p => __obj.updateDynamic("getSubmitData")(p.toJsFn))
    getValue.foreach(p => __obj.updateDynamic("getValue")(p.toJsFn))
    initField.foreach(p => __obj.updateDynamic("initField")(p.toJsFn))
    initValue.foreach(p => __obj.updateDynamic("initValue")(p.toJsFn))
    isDirty.foreach(p => __obj.updateDynamic("isDirty")(p.toJsFn))
    if (isEqual != null) __obj.updateDynamic("isEqual")(js.Any.fromFunction2((t0: js.UndefOr[js.Any], t1: js.UndefOr[js.Any]) => isEqual(t0, t1).runNow()))
    isFileUpload.foreach(p => __obj.updateDynamic("isFileUpload")(p.toJsFn))
    if (!js.isUndefined(isFormField)) __obj.updateDynamic("isFormField")(isFormField.asInstanceOf[js.Any])
    isValid.foreach(p => __obj.updateDynamic("isValid")(p.toJsFn))
    if (markInvalid != null) __obj.updateDynamic("markInvalid")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => markInvalid(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction1((t0: /* field */ js.UndefOr[js.Any]) => onAdd(t0).runNow()))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[js.Any]) => onRemove(t0).runNow()))
    if (originalValue != null) __obj.updateDynamic("originalValue")(originalValue.asInstanceOf[js.Any])
    reset.foreach(p => __obj.updateDynamic("reset")(p.toJsFn))
    resetOriginalValue.foreach(p => __obj.updateDynamic("resetOriginalValue")(p.toJsFn))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => setValue(t0).runNow()))
    if (!js.isUndefined(submitValue)) __obj.updateDynamic("submitValue")(submitValue.asInstanceOf[js.Any])
    if (transformOriginalValue != null) __obj.updateDynamic("transformOriginalValue")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => transformOriginalValue(t0).runNow()))
    validate.foreach(p => __obj.updateDynamic("validate")(p.toJsFn))
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckboxGroup]
  }
}

