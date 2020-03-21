package typingsJapgolly.extjs.Ext.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILabelable extends IBase {
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
  /** [Property] (Ext.Element) */
  var errorEl: js.UndefOr[IElement] = js.undefined
  /** [Config Option] (String) */
  var errorMsgCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var fieldBodyCls: js.UndefOr[String] = js.undefined
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
  /** [Method] Performs initialization of this mixin  */
  var initLabelable: js.UndefOr[js.Function0[Unit]] = js.undefined
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
  /** [Config Option] (Boolean) */
  var preventMark: js.UndefOr[Boolean] = js.undefined
  /** [Method] Sets the active error message to the given string
  		* @param msg String The error message
  		*/
  var setActiveError: js.UndefOr[js.Function1[/* msg */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Set the active error message to an Array of error messages
  		* @param errors String[] The error messages
  		*/
  var setActiveErrors: js.UndefOr[js.Function1[/* errors */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Applies a set of default configuration values to this Labelable instance
  		* @param defaults Object The defaults to apply to the object.
  		*/
  var setFieldDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Set the label of this field
  		* @param label String The new label. The labelSeparator will be automatically appended to the label string.
  		*/
  var setFieldLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Returns the trimmed label by slicing off the label separator character
  		* @returns String The trimmed field label, or empty string if not defined
  		*/
  var trimLabelSeparator: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Clears the active error message s */
  var unsetActiveError: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ILabelable {
  @scala.inline
  def apply(
    activeError: String = null,
    activeErrorsTpl: js.Any = null,
    afterBodyEl: js.Any = null,
    afterLabelTextTpl: js.Any = null,
    afterLabelTpl: js.Any = null,
    afterSubTpl: js.Any = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    autoFitErrors: js.UndefOr[Boolean] = js.undefined,
    baseBodyCls: String = null,
    beforeBodyEl: js.Any = null,
    beforeLabelTextTpl: js.Any = null,
    beforeLabelTpl: js.Any = null,
    beforeSubTpl: js.Any = null,
    bodyEl: IElement = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clearCls: String = null,
    config: js.Any = null,
    errorEl: IElement = null,
    errorMsgCls: String = null,
    extend: String = null,
    fieldBodyCls: String = null,
    fieldLabel: String = null,
    formItemCls: String = null,
    getActiveError: js.UndefOr[CallbackTo[String]] = js.undefined,
    getActiveErrors: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getFieldLabel: js.UndefOr[CallbackTo[String]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getInputId: js.UndefOr[CallbackTo[String]] = js.undefined,
    getLabelWidth: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getLabelableRenderData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getSubTplMarkup: js.UndefOr[CallbackTo[String]] = js.undefined,
    hasActiveError: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    hasVisibleLabel: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    hideEmptyLabel: js.UndefOr[Boolean] = js.undefined,
    hideLabel: js.UndefOr[Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[ILabelable] = null,
    initLabelable: js.UndefOr[Callback] = js.undefined,
    invalidCls: String = null,
    isFieldLabelable: js.UndefOr[Boolean] = js.undefined,
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
    mixins: js.Any = null,
    msgTarget: String = null,
    preventMark: js.UndefOr[Boolean] = js.undefined,
    requires: Array = null,
    self: IClass = null,
    setActiveError: /* msg */ js.UndefOr[String] => Callback = null,
    setActiveErrors: /* errors */ js.UndefOr[Array] => Callback = null,
    setFieldDefaults: /* defaults */ js.UndefOr[js.Any] => Callback = null,
    setFieldLabel: /* label */ js.UndefOr[String] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    trimLabelSeparator: js.UndefOr[CallbackTo[String]] = js.undefined,
    unsetActiveError: js.UndefOr[Callback] = js.undefined,
    uses: Array = null
  ): ILabelable = {
    val __obj = js.Dynamic.literal()
    if (activeError != null) __obj.updateDynamic("activeError")(activeError.asInstanceOf[js.Any])
    if (activeErrorsTpl != null) __obj.updateDynamic("activeErrorsTpl")(activeErrorsTpl.asInstanceOf[js.Any])
    if (afterBodyEl != null) __obj.updateDynamic("afterBodyEl")(afterBodyEl.asInstanceOf[js.Any])
    if (afterLabelTextTpl != null) __obj.updateDynamic("afterLabelTextTpl")(afterLabelTextTpl.asInstanceOf[js.Any])
    if (afterLabelTpl != null) __obj.updateDynamic("afterLabelTpl")(afterLabelTpl.asInstanceOf[js.Any])
    if (afterSubTpl != null) __obj.updateDynamic("afterSubTpl")(afterSubTpl.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFitErrors)) __obj.updateDynamic("autoFitErrors")(autoFitErrors.asInstanceOf[js.Any])
    if (baseBodyCls != null) __obj.updateDynamic("baseBodyCls")(baseBodyCls.asInstanceOf[js.Any])
    if (beforeBodyEl != null) __obj.updateDynamic("beforeBodyEl")(beforeBodyEl.asInstanceOf[js.Any])
    if (beforeLabelTextTpl != null) __obj.updateDynamic("beforeLabelTextTpl")(beforeLabelTextTpl.asInstanceOf[js.Any])
    if (beforeLabelTpl != null) __obj.updateDynamic("beforeLabelTpl")(beforeLabelTpl.asInstanceOf[js.Any])
    if (beforeSubTpl != null) __obj.updateDynamic("beforeSubTpl")(beforeSubTpl.asInstanceOf[js.Any])
    if (bodyEl != null) __obj.updateDynamic("bodyEl")(bodyEl.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (clearCls != null) __obj.updateDynamic("clearCls")(clearCls.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (errorEl != null) __obj.updateDynamic("errorEl")(errorEl.asInstanceOf[js.Any])
    if (errorMsgCls != null) __obj.updateDynamic("errorMsgCls")(errorMsgCls.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fieldBodyCls != null) __obj.updateDynamic("fieldBodyCls")(fieldBodyCls.asInstanceOf[js.Any])
    if (fieldLabel != null) __obj.updateDynamic("fieldLabel")(fieldLabel.asInstanceOf[js.Any])
    if (formItemCls != null) __obj.updateDynamic("formItemCls")(formItemCls.asInstanceOf[js.Any])
    getActiveError.foreach(p => __obj.updateDynamic("getActiveError")(p.toJsFn))
    getActiveErrors.foreach(p => __obj.updateDynamic("getActiveErrors")(p.toJsFn))
    getFieldLabel.foreach(p => __obj.updateDynamic("getFieldLabel")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getInputId.foreach(p => __obj.updateDynamic("getInputId")(p.toJsFn))
    getLabelWidth.foreach(p => __obj.updateDynamic("getLabelWidth")(p.toJsFn))
    getLabelableRenderData.foreach(p => __obj.updateDynamic("getLabelableRenderData")(p.toJsFn))
    getSubTplMarkup.foreach(p => __obj.updateDynamic("getSubTplMarkup")(p.toJsFn))
    hasActiveError.foreach(p => __obj.updateDynamic("hasActiveError")(p.toJsFn))
    hasVisibleLabel.foreach(p => __obj.updateDynamic("hasVisibleLabel")(p.toJsFn))
    if (!js.isUndefined(hideEmptyLabel)) __obj.updateDynamic("hideEmptyLabel")(hideEmptyLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(hideLabel)) __obj.updateDynamic("hideLabel")(hideLabel.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    initLabelable.foreach(p => __obj.updateDynamic("initLabelable")(p.toJsFn))
    if (invalidCls != null) __obj.updateDynamic("invalidCls")(invalidCls.asInstanceOf[js.Any])
    if (!js.isUndefined(isFieldLabelable)) __obj.updateDynamic("isFieldLabelable")(isFieldLabelable.asInstanceOf[js.Any])
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
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (msgTarget != null) __obj.updateDynamic("msgTarget")(msgTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(preventMark)) __obj.updateDynamic("preventMark")(preventMark.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setActiveError != null) __obj.updateDynamic("setActiveError")(js.Any.fromFunction1((t0: /* msg */ js.UndefOr[java.lang.String]) => setActiveError(t0).runNow()))
    if (setActiveErrors != null) __obj.updateDynamic("setActiveErrors")(js.Any.fromFunction1((t0: /* errors */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => setActiveErrors(t0).runNow()))
    if (setFieldDefaults != null) __obj.updateDynamic("setFieldDefaults")(js.Any.fromFunction1((t0: /* defaults */ js.UndefOr[js.Any]) => setFieldDefaults(t0).runNow()))
    if (setFieldLabel != null) __obj.updateDynamic("setFieldLabel")(js.Any.fromFunction1((t0: /* label */ js.UndefOr[java.lang.String]) => setFieldLabel(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    trimLabelSeparator.foreach(p => __obj.updateDynamic("trimLabelSeparator")(p.toJsFn))
    unsetActiveError.foreach(p => __obj.updateDynamic("unsetActiveError")(p.toJsFn))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILabelable]
  }
}

