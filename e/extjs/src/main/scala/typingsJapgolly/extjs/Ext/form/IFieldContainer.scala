package typingsJapgolly.extjs.Ext.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IElement
import typingsJapgolly.extjs.Ext.container.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.extjs.Ext.IClass because Already inherited
- typingsJapgolly.extjs.Ext.IBase because Already inherited
- typingsJapgolly.extjs.Ext.form.IFieldAncestor because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined fieldDefaults, initFieldAncestor, onFieldErrorChange, onFieldValidityChange
- typingsJapgolly.extjs.Ext.form.ILabelable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined activeError, activeErrorsTpl, afterBodyEl, afterLabelTextTpl, afterLabelTpl, afterSubTpl, autoFitErrors, baseBodyCls, beforeBodyEl, beforeLabelTextTpl, beforeLabelTpl, beforeSubTpl, clearCls, errorMsgCls, fieldBodyCls, fieldLabel, formItemCls, hideEmptyLabel, hideLabel, invalidCls, labelAlign, labelAttrTpl, labelCls, labelClsExtra, labelPad, labelSeparator, labelStyle, labelWidth, msgTarget, preventMark, bodyEl, errorEl, isFieldLabelable, labelCell, labelEl, getActiveError, getActiveErrors, getFieldLabel, getInputId, getLabelWidth, getLabelableRenderData, getSubTplMarkup, hasActiveError, hasVisibleLabel, initLabelable, setActiveError, setActiveErrors, setFieldDefaults, setFieldLabel, trimLabelSeparator, unsetActiveError */ trait IFieldContainer extends IContainer {
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
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeBodyEl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeLabelTextTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeLabelTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeSubTpl: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Ext.Element) */
  var bodyEl: js.UndefOr[IElement] = js.undefined
  /** [Config Option] (String) */
  var clearCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var combineErrors: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var combineLabels: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Ext.Element) */
  var errorEl: js.UndefOr[IElement] = js.undefined
  /** [Config Option] (String) */
  var errorMsgCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var fieldBodyCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (Object) */
  var fieldDefaults: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var fieldLabel: js.UndefOr[String] = js.undefined
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
  /** [Method] Takes an Array of invalid Ext form field Field objects and builds a combined list of error messages from them
  		* @param invalidFields Ext.form.field.Field[] An Array of the sub-fields which are currently invalid.
  		* @returns String[] The combined list of error messages
  		*/
  var getCombinedErrors: js.UndefOr[js.Function1[/* invalidFields */ js.UndefOr[Array], Array]] = js.undefined
  /** [Method] Returns the combined field label if combineLabels is set to true and if there is no set fieldLabel
  		* @returns String The label, or empty string if none.
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
  /** [Method] Gets the markup to be inserted into the outer template s bodyEl
  		* @returns String The markup to be inserted
  		*/
  var getSubTplMarkup: js.UndefOr[js.Function0[String]] = js.undefined
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
  /** [Method] Initializes the FieldAncestor s state this must be called from the initComponent method of any components importing */
  var initFieldAncestor: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Performs initialization of this mixin  */
  var initLabelable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Initialized the renderData to be used when rendering the renderTpl
  		* @returns Object Object with keys and values that are going to be applied to the renderTpl
  		*/
  @JSName("initRenderData")
  var initRenderData_IFieldContainer: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String) */
  var invalidCls: js.UndefOr[String] = js.undefined
  /** [Property] (Boolean) */
  var isFieldLabelable: js.UndefOr[Boolean] = js.undefined
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
  /** [Config Option] (String) */
  var labelConnector: js.UndefOr[String] = js.undefined
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
  /** [Config Option] (String) */
  var msgTarget: js.UndefOr[String] = js.undefined
  /** [Method] Called when a Ext form Labelable instance is added to the container s subtree
  		* @param labelable Ext.form.Labelable The instance that was added
  		*/
  @JSName("onAdd")
  var onAdd_IFieldContainer: js.UndefOr[js.Function1[/* labelable */ js.UndefOr[ILabelable], Unit]] = js.undefined
  /** [Method] Fired when the error message of any field within the container changes
  		* @param field Ext.form.Labelable The sub-field whose active error changed
  		* @param error String The new active error message
  		*/
  var onFieldErrorChange: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[ILabelable], /* error */ js.UndefOr[String], Unit]
  ] = js.undefined
  /** [Method] Fired when the validity of any field within the container changes
  		* @param field Ext.form.field.Field The sub-field whose validity changed
  		* @param valid Boolean The new validity state
  		*/
  var onFieldValidityChange: js.UndefOr[
    js.Function2[js.UndefOr[typingsJapgolly.extjs.Ext.form.field.IField], js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Method] Called when a Ext form Labelable instance is removed from the container s subtree
  		* @param labelable Ext.form.Labelable The instance that was removed
  		*/
  @JSName("onRemove")
  var onRemove_IFieldContainer: js.UndefOr[js.Function1[/* labelable */ js.UndefOr[ILabelable], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var preventMark: js.UndefOr[Boolean] = js.undefined
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
  /** [Method] Returns the trimmed label by slicing off the label separator character
  		* @returns String The trimmed field label, or empty string if not defined
  		*/
  var trimLabelSeparator: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Clears the active error message s */
  var unsetActiveError: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IFieldContainer {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    activeError: String = null,
    activeErrorsTpl: js.Any = null,
    afterBodyEl: js.Any = null,
    afterLabelTextTpl: js.Any = null,
    afterLabelTpl: js.Any = null,
    afterSubTpl: js.Any = null,
    autoFitErrors: js.UndefOr[Boolean] = js.undefined,
    baseBodyCls: String = null,
    beforeBodyEl: js.Any = null,
    beforeLabelTextTpl: js.Any = null,
    beforeLabelTpl: js.Any = null,
    beforeSubTpl: js.Any = null,
    bodyEl: IElement = null,
    clearCls: String = null,
    combineErrors: js.UndefOr[Boolean] = js.undefined,
    combineLabels: js.UndefOr[Boolean] = js.undefined,
    errorEl: IElement = null,
    errorMsgCls: String = null,
    fieldBodyCls: String = null,
    fieldDefaults: js.Any = null,
    fieldLabel: String = null,
    formItemCls: String = null,
    getActiveError: js.UndefOr[CallbackTo[String]] = js.undefined,
    getActiveErrors: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getCombinedErrors: /* invalidFields */ js.UndefOr[Array] => CallbackTo[Array] = null,
    getFieldLabel: js.UndefOr[CallbackTo[String]] = js.undefined,
    getInputId: js.UndefOr[CallbackTo[String]] = js.undefined,
    getLabelWidth: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getLabelableRenderData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getSubTplMarkup: js.UndefOr[CallbackTo[String]] = js.undefined,
    hasActiveError: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    hasVisibleLabel: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    hideEmptyLabel: js.UndefOr[Boolean] = js.undefined,
    hideLabel: js.UndefOr[Boolean] = js.undefined,
    initFieldAncestor: js.UndefOr[Callback] = js.undefined,
    initLabelable: js.UndefOr[Callback] = js.undefined,
    initRenderData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    invalidCls: String = null,
    isFieldLabelable: js.UndefOr[Boolean] = js.undefined,
    labelAlign: String = null,
    labelAttrTpl: js.Any = null,
    labelCell: IElement = null,
    labelCls: String = null,
    labelClsExtra: String = null,
    labelConnector: String = null,
    labelEl: IElement = null,
    labelPad: Int | Double = null,
    labelSeparator: String = null,
    labelStyle: String = null,
    labelWidth: Int | Double = null,
    msgTarget: String = null,
    onAdd: /* labelable */ js.UndefOr[ILabelable] => Callback = null,
    onFieldErrorChange: (/* field */ js.UndefOr[ILabelable], /* error */ js.UndefOr[String]) => Callback = null,
    onFieldValidityChange: (js.UndefOr[typingsJapgolly.extjs.Ext.form.field.IField], js.UndefOr[Boolean]) => Callback = null,
    onRemove: /* labelable */ js.UndefOr[ILabelable] => Callback = null,
    preventMark: js.UndefOr[Boolean] = js.undefined,
    setActiveError: js.UndefOr[String] => Callback = null,
    setActiveErrors: js.UndefOr[Array] => Callback = null,
    setFieldDefaults: js.UndefOr[js.Any] => Callback = null,
    setFieldLabel: js.UndefOr[String] => Callback = null,
    trimLabelSeparator: js.UndefOr[CallbackTo[String]] = js.undefined,
    unsetActiveError: js.UndefOr[Callback] = js.undefined
  ): IFieldContainer = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (activeError != null) __obj.updateDynamic("activeError")(activeError.asInstanceOf[js.Any])
    if (activeErrorsTpl != null) __obj.updateDynamic("activeErrorsTpl")(activeErrorsTpl.asInstanceOf[js.Any])
    if (afterBodyEl != null) __obj.updateDynamic("afterBodyEl")(afterBodyEl.asInstanceOf[js.Any])
    if (afterLabelTextTpl != null) __obj.updateDynamic("afterLabelTextTpl")(afterLabelTextTpl.asInstanceOf[js.Any])
    if (afterLabelTpl != null) __obj.updateDynamic("afterLabelTpl")(afterLabelTpl.asInstanceOf[js.Any])
    if (afterSubTpl != null) __obj.updateDynamic("afterSubTpl")(afterSubTpl.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFitErrors)) __obj.updateDynamic("autoFitErrors")(autoFitErrors.asInstanceOf[js.Any])
    if (baseBodyCls != null) __obj.updateDynamic("baseBodyCls")(baseBodyCls.asInstanceOf[js.Any])
    if (beforeBodyEl != null) __obj.updateDynamic("beforeBodyEl")(beforeBodyEl.asInstanceOf[js.Any])
    if (beforeLabelTextTpl != null) __obj.updateDynamic("beforeLabelTextTpl")(beforeLabelTextTpl.asInstanceOf[js.Any])
    if (beforeLabelTpl != null) __obj.updateDynamic("beforeLabelTpl")(beforeLabelTpl.asInstanceOf[js.Any])
    if (beforeSubTpl != null) __obj.updateDynamic("beforeSubTpl")(beforeSubTpl.asInstanceOf[js.Any])
    if (bodyEl != null) __obj.updateDynamic("bodyEl")(bodyEl.asInstanceOf[js.Any])
    if (clearCls != null) __obj.updateDynamic("clearCls")(clearCls.asInstanceOf[js.Any])
    if (!js.isUndefined(combineErrors)) __obj.updateDynamic("combineErrors")(combineErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(combineLabels)) __obj.updateDynamic("combineLabels")(combineLabels.asInstanceOf[js.Any])
    if (errorEl != null) __obj.updateDynamic("errorEl")(errorEl.asInstanceOf[js.Any])
    if (errorMsgCls != null) __obj.updateDynamic("errorMsgCls")(errorMsgCls.asInstanceOf[js.Any])
    if (fieldBodyCls != null) __obj.updateDynamic("fieldBodyCls")(fieldBodyCls.asInstanceOf[js.Any])
    if (fieldDefaults != null) __obj.updateDynamic("fieldDefaults")(fieldDefaults.asInstanceOf[js.Any])
    if (fieldLabel != null) __obj.updateDynamic("fieldLabel")(fieldLabel.asInstanceOf[js.Any])
    if (formItemCls != null) __obj.updateDynamic("formItemCls")(formItemCls.asInstanceOf[js.Any])
    getActiveError.foreach(p => __obj.updateDynamic("getActiveError")(p.toJsFn))
    getActiveErrors.foreach(p => __obj.updateDynamic("getActiveErrors")(p.toJsFn))
    if (getCombinedErrors != null) __obj.updateDynamic("getCombinedErrors")(js.Any.fromFunction1((t0: /* invalidFields */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => getCombinedErrors(t0).runNow()))
    getFieldLabel.foreach(p => __obj.updateDynamic("getFieldLabel")(p.toJsFn))
    getInputId.foreach(p => __obj.updateDynamic("getInputId")(p.toJsFn))
    getLabelWidth.foreach(p => __obj.updateDynamic("getLabelWidth")(p.toJsFn))
    getLabelableRenderData.foreach(p => __obj.updateDynamic("getLabelableRenderData")(p.toJsFn))
    getSubTplMarkup.foreach(p => __obj.updateDynamic("getSubTplMarkup")(p.toJsFn))
    hasActiveError.foreach(p => __obj.updateDynamic("hasActiveError")(p.toJsFn))
    hasVisibleLabel.foreach(p => __obj.updateDynamic("hasVisibleLabel")(p.toJsFn))
    if (!js.isUndefined(hideEmptyLabel)) __obj.updateDynamic("hideEmptyLabel")(hideEmptyLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(hideLabel)) __obj.updateDynamic("hideLabel")(hideLabel.asInstanceOf[js.Any])
    initFieldAncestor.foreach(p => __obj.updateDynamic("initFieldAncestor")(p.toJsFn))
    initLabelable.foreach(p => __obj.updateDynamic("initLabelable")(p.toJsFn))
    initRenderData.foreach(p => __obj.updateDynamic("initRenderData")(p.toJsFn))
    if (invalidCls != null) __obj.updateDynamic("invalidCls")(invalidCls.asInstanceOf[js.Any])
    if (!js.isUndefined(isFieldLabelable)) __obj.updateDynamic("isFieldLabelable")(isFieldLabelable.asInstanceOf[js.Any])
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign.asInstanceOf[js.Any])
    if (labelAttrTpl != null) __obj.updateDynamic("labelAttrTpl")(labelAttrTpl.asInstanceOf[js.Any])
    if (labelCell != null) __obj.updateDynamic("labelCell")(labelCell.asInstanceOf[js.Any])
    if (labelCls != null) __obj.updateDynamic("labelCls")(labelCls.asInstanceOf[js.Any])
    if (labelClsExtra != null) __obj.updateDynamic("labelClsExtra")(labelClsExtra.asInstanceOf[js.Any])
    if (labelConnector != null) __obj.updateDynamic("labelConnector")(labelConnector.asInstanceOf[js.Any])
    if (labelEl != null) __obj.updateDynamic("labelEl")(labelEl.asInstanceOf[js.Any])
    if (labelPad != null) __obj.updateDynamic("labelPad")(labelPad.asInstanceOf[js.Any])
    if (labelSeparator != null) __obj.updateDynamic("labelSeparator")(labelSeparator.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (labelWidth != null) __obj.updateDynamic("labelWidth")(labelWidth.asInstanceOf[js.Any])
    if (msgTarget != null) __obj.updateDynamic("msgTarget")(msgTarget.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction1((t0: /* labelable */ js.UndefOr[typingsJapgolly.extjs.Ext.form.ILabelable]) => onAdd(t0).runNow()))
    if (onFieldErrorChange != null) __obj.updateDynamic("onFieldErrorChange")(js.Any.fromFunction2((t0: /* field */ js.UndefOr[typingsJapgolly.extjs.Ext.form.ILabelable], t1: /* error */ js.UndefOr[java.lang.String]) => onFieldErrorChange(t0, t1).runNow()))
    if (onFieldValidityChange != null) __obj.updateDynamic("onFieldValidityChange")(js.Any.fromFunction2((t0: js.UndefOr[typingsJapgolly.extjs.Ext.form.field.IField], t1: js.UndefOr[scala.Boolean]) => onFieldValidityChange(t0, t1).runNow()))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1((t0: /* labelable */ js.UndefOr[typingsJapgolly.extjs.Ext.form.ILabelable]) => onRemove(t0).runNow()))
    if (!js.isUndefined(preventMark)) __obj.updateDynamic("preventMark")(preventMark.asInstanceOf[js.Any])
    if (setActiveError != null) __obj.updateDynamic("setActiveError")(js.Any.fromFunction1((t0: js.UndefOr[java.lang.String]) => setActiveError(t0).runNow()))
    if (setActiveErrors != null) __obj.updateDynamic("setActiveErrors")(js.Any.fromFunction1((t0: js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => setActiveErrors(t0).runNow()))
    if (setFieldDefaults != null) __obj.updateDynamic("setFieldDefaults")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => setFieldDefaults(t0).runNow()))
    if (setFieldLabel != null) __obj.updateDynamic("setFieldLabel")(js.Any.fromFunction1((t0: js.UndefOr[java.lang.String]) => setFieldLabel(t0).runNow()))
    trimLabelSeparator.foreach(p => __obj.updateDynamic("trimLabelSeparator")(p.toJsFn))
    unsetActiveError.foreach(p => __obj.updateDynamic("unsetActiveError")(p.toJsFn))
    __obj.asInstanceOf[IFieldContainer]
  }
}

