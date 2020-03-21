package typingsJapgolly.extjs.Ext.form.field

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IComponent
import typingsJapgolly.extjs.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.extjs.Ext.IClass because Already inherited
- typingsJapgolly.extjs.Ext.IBase because Already inherited
- typingsJapgolly.extjs.Ext.form.field.IField because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, disabled, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined name, submitValue, validateOnChange, value, isFormField, originalValue, batchChanges, beforeReset, checkChange, checkDirty, clearInvalid, extractFileInput, getErrors, getModelData, getName, getSubmitData, getValue, initField, initValue, isDirty, isEqual, isFileUpload, isValid, markInvalid, reset, resetOriginalValue, setValue, transformOriginalValue, validate
- typingsJapgolly.extjs.Ext.form.ILabelable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined activeError, activeErrorsTpl, afterBodyEl, afterLabelTextTpl, afterLabelTpl, afterSubTpl, autoFitErrors, baseBodyCls, beforeBodyEl, beforeLabelTextTpl, beforeLabelTpl, beforeSubTpl, clearCls, errorMsgCls, fieldBodyCls, fieldLabel, formItemCls, hideEmptyLabel, hideLabel, invalidCls, labelAlign, labelAttrTpl, labelCls, labelClsExtra, labelPad, labelSeparator, labelStyle, labelWidth, msgTarget, preventMark, bodyEl, errorEl, isFieldLabelable, labelCell, labelEl, getActiveError, getActiveErrors, getFieldLabel, getInputId, getLabelWidth, getLabelableRenderData, getSubTplMarkup, hasActiveError, hasVisibleLabel, initLabelable, setActiveError, setActiveErrors, setFieldDefaults, setFieldLabel, trimLabelSeparator, unsetActiveError */ trait IBase extends IComponent {
  /** [Config Option] (String) */
  var activeError: js.UndefOr[String] = js.undefined
  /** [Config Option] (String/String[]/Ext.XTemplate) */
  var activeErrorsTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterBodyEl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterLabelTextTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterLabelTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterSubTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var autoFitErrors: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var baseBodyCls: js.UndefOr[String] = js.undefined
  /** [Method] A utility for grouping a set of modifications which may trigger value changes into a single transaction to prevent e
  		* @param fn Object A function containing the transaction code
  		*/
  var batchChanges: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeBodyEl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeLabelTextTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeLabelTpl: js.UndefOr[js.Any] = js.undefined
  /** [Method] Template method before a field is reset  */
  var beforeReset: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeSubTpl: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Ext.Element) */
  var bodyEl: js.UndefOr[IElement] = js.undefined
  /** [Method] Checks whether the value of the field has changed since the last time it was checked  */
  var checkChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Number) */
  var checkChangeBuffer: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String[]) */
  var checkChangeEvents: js.UndefOr[Array] = js.undefined
  /** [Method] Checks the isDirty state of the field and if it has changed since the last time it was checked fires the dirtychange  */
  var checkDirty: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var clearCls: js.UndefOr[String] = js.undefined
  /** [Method] Clear any invalid styles messages for this field  */
  var clearInvalid: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var dirtyCls: js.UndefOr[String] = js.undefined
  /** [Property] (Ext.Element) */
  var errorEl: js.UndefOr[IElement] = js.undefined
  /** [Config Option] (String) */
  var errorMsgCls: js.UndefOr[String] = js.undefined
  /** [Method] Only relevant if the instance s isFileUpload method returns true
  		* @returns HTMLElement
  		*/
  var extractFileInput: js.UndefOr[js.Function0[_ | HTMLElement]] = js.undefined
  /** [Config Option] (String) */
  var fieldBodyCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var fieldCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var fieldLabel: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var fieldStyle: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var focusCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var formItemCls: js.UndefOr[String] = js.undefined
  /** [Method] Gets the active error message for this component if any
  		* @returns String The active error message on the component; if there is no error, an empty string is returned.
  		*/
  var getActiveError: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Gets an Array of any active error messages currently applied to the field
  		* @returns String[] The active error messages on the component; if there are no errors, an empty Array is returned.
  		*/
  var getActiveErrors: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Runs this field s validators and returns an array of error messages for any validation failures
  		* @param value Object The value to get errors for (defaults to the current field value)
  		* @returns String[] All error messages for this field; an empty Array if none.
  		*/
  var getErrors: js.UndefOr[js.Function1[js.UndefOr[js.Any], _ | Array]] = js.undefined
  /** [Method] Returns the label for the field
  		* @returns String The configured field label, or empty string if not defined
  		*/
  var getFieldLabel: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Get the input id if any for this component
  		* @returns String The input id
  		*/
  var getInputId: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Gets the width of the label if visible
  		* @returns Number The label width
  		*/
  var getLabelWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Generates the arguments for the field decorations rendering template
  		* @returns Object The template arguments
  		*/
  var getLabelableRenderData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value s that should be saved to the Ext data Model instance for this field when Ext form Basic updateRe
  		* @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
  		*/
  var getModelData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the name attribute of the field
  		* @returns String name The field name
  		*/
  var getName: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the raw value of the field without performing any normalization conversion or validation
  		* @returns any value The raw String value of the field
  		*/
  var getRawValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Creates and returns the data object to be used when rendering the fieldSubTpl
  		* @returns Object The template data
  		*/
  var getSubTplData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets the markup to be inserted into the outer template s bodyEl
  		* @returns String The markup to be inserted
  		*/
  var getSubTplMarkup: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] private override to use getSubmitValue  as a convenience
  		* @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
  		*/
  var getSubmitData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value that would be included in a standard form submit for this field
  		* @returns any The value to be submitted, or null.
  		*/
  var getSubmitValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the current data value of the field
  		* @returns Object value The field value
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Tells whether the field currently has an active error message
  		* @returns Boolean
  		*/
  var hasActiveError: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Checks if the field has a visible label
  		* @returns Boolean True if the field has a visible label
  		*/
  var hasVisibleLabel: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var hideEmptyLabel: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var hideLabel: js.UndefOr[Boolean] = js.undefined
  /** [Method] Initializes this Field mixin on the current instance  */
  var initField: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Performs initialization of this mixin  */
  var initLabelable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Initialized the renderData to be used when rendering the renderTpl
  		* @returns Object Object with keys and values that are going to be applied to the renderTpl
  		*/
  @JSName("initRenderData")
  var initRenderData_IBase: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Initializes the field s value based on the initial config  */
  var initValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var inputAttrTpl: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Ext.Element) */
  var inputEl: js.UndefOr[IElement] = js.undefined
  /** [Config Option] (String) */
  var inputId: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var inputType: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var invalidCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var invalidText: js.UndefOr[String] = js.undefined
  /** [Method] Returns true if the value of this Field has been changed from its originalValue
  		* @returns Boolean True if this field has been changed from its original value (and is not disabled), false otherwise.
  		*/
  var isDirty: js.UndefOr[js.Function0[_ | Boolean]] = js.undefined
  /** [Method] Returns whether two field values are logically equal
  		* @param value1 Object The first value to compare
  		* @param value2 Object The second value to compare
  		* @returns Boolean True if the values are equal, false if inequal.
  		*/
  var isEqual: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], _ | Boolean]] = js.undefined
  /** [Property] (Boolean) */
  var isFieldLabelable: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
  		* @returns Boolean
  		*/
  var isFileUpload: js.UndefOr[js.Function0[_ | Boolean]] = js.undefined
  /** [Property] (Boolean) */
  var isFormField: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns whether or not the field value is currently valid by validating the processed raw value of the field
  		* @returns Boolean True if the value is valid, else false
  		*/
  var isValid: js.UndefOr[js.Function0[_ | Boolean]] = js.undefined
  /** [Config Option] (String) */
  var labelAlign: js.UndefOr[String] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var labelAttrTpl: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Ext.Element) */
  var labelCell: js.UndefOr[IElement] = js.undefined
  /** [Config Option] (String) */
  var labelCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var labelClsExtra: js.UndefOr[String] = js.undefined
  /** [Property] (Ext.Element) */
  var labelEl: js.UndefOr[IElement] = js.undefined
  /** [Config Option] (Number) */
  var labelPad: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var labelSeparator: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var labelStyle: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var labelWidth: js.UndefOr[Double] = js.undefined
  /** [Method] Display one or more error messages associated with this field using msgTarget to determine how to display the messag
  		* @param errors String/String[] The validation message(s) to display.
  		*/
  var markInvalid: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String) */
  var msgTarget: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.undefined
  /** [Method] private */
  @JSName("onRender")
  var onRender_IBase: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (Object) */
  var originalValue: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var preventMark: js.UndefOr[Boolean] = js.undefined
  /** [Method] Performs any necessary manipulation of a raw field value to prepare it for conversion and or validation for instance
  		* @param value Object The unprocessed string value
  		* @returns Object The processed string value
  		*/
  var processRawValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Converts a raw input field value into a mixed type value that is suitable for this particular field type
  		* @param rawValue Object
  		* @returns Object The converted value.
  		*/
  var rawToValue: js.UndefOr[js.Function1[/* rawValue */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var readOnlyCls: js.UndefOr[String] = js.undefined
  /** [Method] Resets the current field value to the originally loaded value and clears any validation messages  */
  var reset: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Resets the field s originalValue property so it matches the current value  */
  var resetOriginalValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets the active error message to the given string
  		* @param msg String The error message
  		*/
  var setActiveError: js.UndefOr[js.Function1[js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Set the active error message to an Array of error messages
  		* @param errors String[] The error messages
  		*/
  var setActiveErrors: js.UndefOr[js.Function1[js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Applies a set of default configuration values to this Labelable instance
  		* @param defaults Object The defaults to apply to the object.
  		*/
  var setFieldDefaults: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Set the label of this field
  		* @param label String The new label. The labelSeparator will be automatically appended to the label string.
  		*/
  var setFieldLabel: js.UndefOr[js.Function1[js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Set the CSS style of the field input element
  		* @param style String/Object/Function The style(s) to apply. Should be a valid argument to Ext.Element.applyStyles.
  		*/
  var setFieldStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the field s raw value directly bypassing value conversion change detection and validation
  		* @param value Object The value to set
  		* @returns Object value The field value that is set
  		*/
  var setRawValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Sets the read only state of this field
  		* @param readOnly Boolean Whether the field should be read only.
  		*/
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets a data value into the field and runs the change detection and validation
  		* @param value Object The value to set
  		* @returns any this
  		*/
  var setValue: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Boolean) */
  var submitValue: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var tabIndex: js.UndefOr[Double] = js.undefined
  /** [Method] Allows for any necessary modifications before the original value is set
  		* @param value Object The initial value
  		* @returns Object The modified initial value
  		*/
  var transformOriginalValue: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Transform the raw value before it is set
  		* @param value Object The value
  		* @returns Object The value to set
  		*/
  var transformRawValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the trimmed label by slicing off the label separator character
  		* @returns String The trimmed field label, or empty string if not defined
  		*/
  var trimLabelSeparator: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Clears the active error message s */
  var unsetActiveError: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value and fires the vali
  		* @returns Boolean True if the value is valid, else false
  		*/
  var validate: js.UndefOr[js.Function0[_ | Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var validateOnBlur: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var validateOnChange: js.UndefOr[Boolean] = js.undefined
  /** [Method] Uses getErrors to build an array of validation errors
  		* @param value Object The value to validate
  		* @returns Boolean True if all validations passed, false if one or more failed
  		*/
  var validateValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Config Option] (Object) */
  var value: js.UndefOr[js.Any] = js.undefined
  /** [Method] Converts a mixed type value to a raw representation suitable for displaying in the field
  		* @param value Object The mixed-type value to convert to the raw representation.
  		* @returns Object The converted raw value.
  		*/
  var valueToRaw: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.undefined
}

object IBase {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    activeError: String = null,
    activeErrorsTpl: js.Any = null,
    afterBodyEl: js.Any = null,
    afterLabelTextTpl: js.Any = null,
    afterLabelTpl: js.Any = null,
    afterSubTpl: js.Any = null,
    autoFitErrors: js.UndefOr[Boolean] = js.undefined,
    baseBodyCls: String = null,
    batchChanges: js.UndefOr[js.Any] => Callback = null,
    beforeBodyEl: js.Any = null,
    beforeLabelTextTpl: js.Any = null,
    beforeLabelTpl: js.Any = null,
    beforeReset: js.UndefOr[Callback] = js.undefined,
    beforeSubTpl: js.Any = null,
    bodyEl: IElement = null,
    checkChange: js.UndefOr[Callback] = js.undefined,
    checkChangeBuffer: Int | Double = null,
    checkChangeEvents: Array = null,
    checkDirty: js.UndefOr[Callback] = js.undefined,
    clearCls: String = null,
    clearInvalid: js.UndefOr[Callback] = js.undefined,
    dirtyCls: String = null,
    errorEl: IElement = null,
    errorMsgCls: String = null,
    extractFileInput: js.UndefOr[CallbackTo[js.Any | HTMLElement]] = js.undefined,
    fieldBodyCls: String = null,
    fieldCls: String = null,
    fieldLabel: String = null,
    fieldStyle: String = null,
    focusCls: String = null,
    formItemCls: String = null,
    getActiveError: js.UndefOr[CallbackTo[String]] = js.undefined,
    getActiveErrors: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getErrors: js.UndefOr[js.Any] => CallbackTo[js.Any | Array] = null,
    getFieldLabel: js.UndefOr[CallbackTo[String]] = js.undefined,
    getInputId: js.UndefOr[CallbackTo[String]] = js.undefined,
    getLabelWidth: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getLabelableRenderData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getModelData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getName: js.UndefOr[CallbackTo[String]] = js.undefined,
    getRawValue: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getSubTplData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getSubTplMarkup: js.UndefOr[CallbackTo[String]] = js.undefined,
    getSubmitData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getSubmitValue: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getValue: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    hasActiveError: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    hasVisibleLabel: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    hideEmptyLabel: js.UndefOr[Boolean] = js.undefined,
    hideLabel: js.UndefOr[Boolean] = js.undefined,
    initField: js.UndefOr[Callback] = js.undefined,
    initLabelable: js.UndefOr[Callback] = js.undefined,
    initRenderData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    initValue: js.UndefOr[Callback] = js.undefined,
    inputAttrTpl: js.Any = null,
    inputEl: IElement = null,
    inputId: String = null,
    inputType: String = null,
    invalidCls: String = null,
    invalidText: String = null,
    isDirty: js.UndefOr[CallbackTo[js.Any | Boolean]] = js.undefined,
    isEqual: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => CallbackTo[js.Any | Boolean] = null,
    isFieldLabelable: js.UndefOr[Boolean] = js.undefined,
    isFileUpload: js.UndefOr[CallbackTo[js.Any | Boolean]] = js.undefined,
    isFormField: js.UndefOr[Boolean] = js.undefined,
    isValid: js.UndefOr[CallbackTo[js.Any | Boolean]] = js.undefined,
    labelAlign: String = null,
    labelAttrTpl: js.Any = null,
    labelCell: IElement = null,
    labelCls: String = null,
    labelClsExtra: String = null,
    labelEl: IElement = null,
    labelPad: Int | Double = null,
    labelSeparator: String = null,
    labelStyle: String = null,
    labelWidth: Int | Double = null,
    markInvalid: js.UndefOr[js.Any] => Callback = null,
    msgTarget: String = null,
    name: String = null,
    onRender: js.UndefOr[Callback] = js.undefined,
    originalValue: js.Any = null,
    preventMark: js.UndefOr[Boolean] = js.undefined,
    processRawValue: /* value */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    rawToValue: /* rawValue */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    readOnlyCls: String = null,
    reset: js.UndefOr[Callback] = js.undefined,
    resetOriginalValue: js.UndefOr[Callback] = js.undefined,
    setActiveError: js.UndefOr[String] => Callback = null,
    setActiveErrors: js.UndefOr[Array] => Callback = null,
    setFieldDefaults: js.UndefOr[js.Any] => Callback = null,
    setFieldLabel: js.UndefOr[String] => Callback = null,
    setFieldStyle: /* style */ js.UndefOr[js.Any] => Callback = null,
    setRawValue: /* value */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    setReadOnly: /* readOnly */ js.UndefOr[Boolean] => Callback = null,
    setValue: js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    submitValue: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    transformOriginalValue: js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    transformRawValue: /* value */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    trimLabelSeparator: js.UndefOr[CallbackTo[String]] = js.undefined,
    unsetActiveError: js.UndefOr[Callback] = js.undefined,
    validate: js.UndefOr[CallbackTo[js.Any | Boolean]] = js.undefined,
    validateOnBlur: js.UndefOr[Boolean] = js.undefined,
    validateOnChange: js.UndefOr[Boolean] = js.undefined,
    validateValue: /* value */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    value: js.Any = null,
    valueToRaw: /* value */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null
  ): IBase = {
    val __obj = js.Dynamic.literal()
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    if (activeError != null) __obj.updateDynamic("activeError")(activeError.asInstanceOf[js.Any])
    if (activeErrorsTpl != null) __obj.updateDynamic("activeErrorsTpl")(activeErrorsTpl.asInstanceOf[js.Any])
    if (afterBodyEl != null) __obj.updateDynamic("afterBodyEl")(afterBodyEl.asInstanceOf[js.Any])
    if (afterLabelTextTpl != null) __obj.updateDynamic("afterLabelTextTpl")(afterLabelTextTpl.asInstanceOf[js.Any])
    if (afterLabelTpl != null) __obj.updateDynamic("afterLabelTpl")(afterLabelTpl.asInstanceOf[js.Any])
    if (afterSubTpl != null) __obj.updateDynamic("afterSubTpl")(afterSubTpl.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFitErrors)) __obj.updateDynamic("autoFitErrors")(autoFitErrors.asInstanceOf[js.Any])
    if (baseBodyCls != null) __obj.updateDynamic("baseBodyCls")(baseBodyCls.asInstanceOf[js.Any])
    if (batchChanges != null) __obj.updateDynamic("batchChanges")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => batchChanges(t0).runNow()))
    if (beforeBodyEl != null) __obj.updateDynamic("beforeBodyEl")(beforeBodyEl.asInstanceOf[js.Any])
    if (beforeLabelTextTpl != null) __obj.updateDynamic("beforeLabelTextTpl")(beforeLabelTextTpl.asInstanceOf[js.Any])
    if (beforeLabelTpl != null) __obj.updateDynamic("beforeLabelTpl")(beforeLabelTpl.asInstanceOf[js.Any])
    beforeReset.foreach(p => __obj.updateDynamic("beforeReset")(p.toJsFn))
    if (beforeSubTpl != null) __obj.updateDynamic("beforeSubTpl")(beforeSubTpl.asInstanceOf[js.Any])
    if (bodyEl != null) __obj.updateDynamic("bodyEl")(bodyEl.asInstanceOf[js.Any])
    checkChange.foreach(p => __obj.updateDynamic("checkChange")(p.toJsFn))
    if (checkChangeBuffer != null) __obj.updateDynamic("checkChangeBuffer")(checkChangeBuffer.asInstanceOf[js.Any])
    if (checkChangeEvents != null) __obj.updateDynamic("checkChangeEvents")(checkChangeEvents.asInstanceOf[js.Any])
    checkDirty.foreach(p => __obj.updateDynamic("checkDirty")(p.toJsFn))
    if (clearCls != null) __obj.updateDynamic("clearCls")(clearCls.asInstanceOf[js.Any])
    clearInvalid.foreach(p => __obj.updateDynamic("clearInvalid")(p.toJsFn))
    if (dirtyCls != null) __obj.updateDynamic("dirtyCls")(dirtyCls.asInstanceOf[js.Any])
    if (errorEl != null) __obj.updateDynamic("errorEl")(errorEl.asInstanceOf[js.Any])
    if (errorMsgCls != null) __obj.updateDynamic("errorMsgCls")(errorMsgCls.asInstanceOf[js.Any])
    extractFileInput.foreach(p => __obj.updateDynamic("extractFileInput")(p.toJsFn))
    if (fieldBodyCls != null) __obj.updateDynamic("fieldBodyCls")(fieldBodyCls.asInstanceOf[js.Any])
    if (fieldCls != null) __obj.updateDynamic("fieldCls")(fieldCls.asInstanceOf[js.Any])
    if (fieldLabel != null) __obj.updateDynamic("fieldLabel")(fieldLabel.asInstanceOf[js.Any])
    if (fieldStyle != null) __obj.updateDynamic("fieldStyle")(fieldStyle.asInstanceOf[js.Any])
    if (focusCls != null) __obj.updateDynamic("focusCls")(focusCls.asInstanceOf[js.Any])
    if (formItemCls != null) __obj.updateDynamic("formItemCls")(formItemCls.asInstanceOf[js.Any])
    getActiveError.foreach(p => __obj.updateDynamic("getActiveError")(p.toJsFn))
    getActiveErrors.foreach(p => __obj.updateDynamic("getActiveErrors")(p.toJsFn))
    if (getErrors != null) __obj.updateDynamic("getErrors")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => getErrors(t0).runNow()))
    getFieldLabel.foreach(p => __obj.updateDynamic("getFieldLabel")(p.toJsFn))
    getInputId.foreach(p => __obj.updateDynamic("getInputId")(p.toJsFn))
    getLabelWidth.foreach(p => __obj.updateDynamic("getLabelWidth")(p.toJsFn))
    getLabelableRenderData.foreach(p => __obj.updateDynamic("getLabelableRenderData")(p.toJsFn))
    getModelData.foreach(p => __obj.updateDynamic("getModelData")(p.toJsFn))
    getName.foreach(p => __obj.updateDynamic("getName")(p.toJsFn))
    getRawValue.foreach(p => __obj.updateDynamic("getRawValue")(p.toJsFn))
    getSubTplData.foreach(p => __obj.updateDynamic("getSubTplData")(p.toJsFn))
    getSubTplMarkup.foreach(p => __obj.updateDynamic("getSubTplMarkup")(p.toJsFn))
    getSubmitData.foreach(p => __obj.updateDynamic("getSubmitData")(p.toJsFn))
    getSubmitValue.foreach(p => __obj.updateDynamic("getSubmitValue")(p.toJsFn))
    getValue.foreach(p => __obj.updateDynamic("getValue")(p.toJsFn))
    hasActiveError.foreach(p => __obj.updateDynamic("hasActiveError")(p.toJsFn))
    hasVisibleLabel.foreach(p => __obj.updateDynamic("hasVisibleLabel")(p.toJsFn))
    if (!js.isUndefined(hideEmptyLabel)) __obj.updateDynamic("hideEmptyLabel")(hideEmptyLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(hideLabel)) __obj.updateDynamic("hideLabel")(hideLabel.asInstanceOf[js.Any])
    initField.foreach(p => __obj.updateDynamic("initField")(p.toJsFn))
    initLabelable.foreach(p => __obj.updateDynamic("initLabelable")(p.toJsFn))
    initRenderData.foreach(p => __obj.updateDynamic("initRenderData")(p.toJsFn))
    initValue.foreach(p => __obj.updateDynamic("initValue")(p.toJsFn))
    if (inputAttrTpl != null) __obj.updateDynamic("inputAttrTpl")(inputAttrTpl.asInstanceOf[js.Any])
    if (inputEl != null) __obj.updateDynamic("inputEl")(inputEl.asInstanceOf[js.Any])
    if (inputId != null) __obj.updateDynamic("inputId")(inputId.asInstanceOf[js.Any])
    if (inputType != null) __obj.updateDynamic("inputType")(inputType.asInstanceOf[js.Any])
    if (invalidCls != null) __obj.updateDynamic("invalidCls")(invalidCls.asInstanceOf[js.Any])
    if (invalidText != null) __obj.updateDynamic("invalidText")(invalidText.asInstanceOf[js.Any])
    isDirty.foreach(p => __obj.updateDynamic("isDirty")(p.toJsFn))
    if (isEqual != null) __obj.updateDynamic("isEqual")(js.Any.fromFunction2((t0: js.UndefOr[js.Any], t1: js.UndefOr[js.Any]) => isEqual(t0, t1).runNow()))
    if (!js.isUndefined(isFieldLabelable)) __obj.updateDynamic("isFieldLabelable")(isFieldLabelable.asInstanceOf[js.Any])
    isFileUpload.foreach(p => __obj.updateDynamic("isFileUpload")(p.toJsFn))
    if (!js.isUndefined(isFormField)) __obj.updateDynamic("isFormField")(isFormField.asInstanceOf[js.Any])
    isValid.foreach(p => __obj.updateDynamic("isValid")(p.toJsFn))
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign.asInstanceOf[js.Any])
    if (labelAttrTpl != null) __obj.updateDynamic("labelAttrTpl")(labelAttrTpl.asInstanceOf[js.Any])
    if (labelCell != null) __obj.updateDynamic("labelCell")(labelCell.asInstanceOf[js.Any])
    if (labelCls != null) __obj.updateDynamic("labelCls")(labelCls.asInstanceOf[js.Any])
    if (labelClsExtra != null) __obj.updateDynamic("labelClsExtra")(labelClsExtra.asInstanceOf[js.Any])
    if (labelEl != null) __obj.updateDynamic("labelEl")(labelEl.asInstanceOf[js.Any])
    if (labelPad != null) __obj.updateDynamic("labelPad")(labelPad.asInstanceOf[js.Any])
    if (labelSeparator != null) __obj.updateDynamic("labelSeparator")(labelSeparator.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (labelWidth != null) __obj.updateDynamic("labelWidth")(labelWidth.asInstanceOf[js.Any])
    if (markInvalid != null) __obj.updateDynamic("markInvalid")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => markInvalid(t0).runNow()))
    if (msgTarget != null) __obj.updateDynamic("msgTarget")(msgTarget.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    onRender.foreach(p => __obj.updateDynamic("onRender")(p.toJsFn))
    if (originalValue != null) __obj.updateDynamic("originalValue")(originalValue.asInstanceOf[js.Any])
    if (!js.isUndefined(preventMark)) __obj.updateDynamic("preventMark")(preventMark.asInstanceOf[js.Any])
    if (processRawValue != null) __obj.updateDynamic("processRawValue")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => processRawValue(t0).runNow()))
    if (rawToValue != null) __obj.updateDynamic("rawToValue")(js.Any.fromFunction1((t0: /* rawValue */ js.UndefOr[js.Any]) => rawToValue(t0).runNow()))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (readOnlyCls != null) __obj.updateDynamic("readOnlyCls")(readOnlyCls.asInstanceOf[js.Any])
    reset.foreach(p => __obj.updateDynamic("reset")(p.toJsFn))
    resetOriginalValue.foreach(p => __obj.updateDynamic("resetOriginalValue")(p.toJsFn))
    if (setActiveError != null) __obj.updateDynamic("setActiveError")(js.Any.fromFunction1((t0: js.UndefOr[java.lang.String]) => setActiveError(t0).runNow()))
    if (setActiveErrors != null) __obj.updateDynamic("setActiveErrors")(js.Any.fromFunction1((t0: js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => setActiveErrors(t0).runNow()))
    if (setFieldDefaults != null) __obj.updateDynamic("setFieldDefaults")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => setFieldDefaults(t0).runNow()))
    if (setFieldLabel != null) __obj.updateDynamic("setFieldLabel")(js.Any.fromFunction1((t0: js.UndefOr[java.lang.String]) => setFieldLabel(t0).runNow()))
    if (setFieldStyle != null) __obj.updateDynamic("setFieldStyle")(js.Any.fromFunction1((t0: /* style */ js.UndefOr[js.Any]) => setFieldStyle(t0).runNow()))
    if (setRawValue != null) __obj.updateDynamic("setRawValue")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => setRawValue(t0).runNow()))
    if (setReadOnly != null) __obj.updateDynamic("setReadOnly")(js.Any.fromFunction1((t0: /* readOnly */ js.UndefOr[scala.Boolean]) => setReadOnly(t0).runNow()))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => setValue(t0).runNow()))
    if (!js.isUndefined(submitValue)) __obj.updateDynamic("submitValue")(submitValue.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (transformOriginalValue != null) __obj.updateDynamic("transformOriginalValue")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => transformOriginalValue(t0).runNow()))
    if (transformRawValue != null) __obj.updateDynamic("transformRawValue")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => transformRawValue(t0).runNow()))
    trimLabelSeparator.foreach(p => __obj.updateDynamic("trimLabelSeparator")(p.toJsFn))
    unsetActiveError.foreach(p => __obj.updateDynamic("unsetActiveError")(p.toJsFn))
    validate.foreach(p => __obj.updateDynamic("validate")(p.toJsFn))
    if (!js.isUndefined(validateOnBlur)) __obj.updateDynamic("validateOnBlur")(validateOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange.asInstanceOf[js.Any])
    if (validateValue != null) __obj.updateDynamic("validateValue")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => validateValue(t0).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueToRaw != null) __obj.updateDynamic("valueToRaw")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => valueToRaw(t0).runNow()))
    __obj.asInstanceOf[IBase]
  }
}

