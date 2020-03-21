package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.form.field.IField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditor
  extends typingsJapgolly.extjs.Ext.container.IContainer {
  /** [Method] private
  		* @param ct Object
  		* @param position Object
  		*/
  @JSName("afterRender")
  var afterRender_IEditor: js.UndefOr[
    js.Function2[/* ct */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Config Option] (String) */
  var alignment: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var allowBlur: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var autoSize: js.UndefOr[js.Any] = js.undefined
  /** [Method] Cancels the editing process and hides the editor without persisting any changes
  		* @param remainVisible Boolean Override the default behavior and keep the editor visible after cancel
  		*/
  var cancelEdit: js.UndefOr[js.Function1[/* remainVisible */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var cancelOnEsc: js.UndefOr[Boolean] = js.undefined
  /** [Method] Ends the editing process persists the changed value to the underlying field and hides the editor
  		* @param remainVisible Boolean Override the default behavior and keep the editor visible after edit
  		*/
  var completeEdit: js.UndefOr[js.Function1[/* remainVisible */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var completeOnEnter: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Ext.form.field.Field) */
  var field: js.UndefOr[IField] = js.undefined
  /** [Method] Gets the data value of the editor
  		* @returns Object The data value
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Boolean) */
  var hideEl: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var ignoreNoChange: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number[]) */
  var offsets: js.UndefOr[Array] = js.undefined
  /** [Method] private */
  @JSName("onHide")
  var onHide_IEditor: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] private */
  @JSName("onShow")
  var onShow_IEditor: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var parentEl: js.UndefOr[js.Any] = js.undefined
  /** [Method] Realigns the editor to the bound field based on the current alignment config value
  		* @param autoSize Boolean True to size the field to the dimensions of the bound element.
  		*/
  var realign: js.UndefOr[js.Function1[/* autoSize */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var revertInvalid: js.UndefOr[Boolean] = js.undefined
  /** [Method] Sets the data value of the editor
  		* @param value Object Any valid value supported by the underlying field
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Starts the editing process and shows the editor
  		* @param el String/HTMLElement/Ext.Element The element to edit
  		* @param value String A value to initialize the editor with. If a value is not provided, it defaults to the innerHTML of el.
  		*/
  var startEdit: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String], Unit]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var swallowKeys: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var updateEl: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object) */
  var value: js.UndefOr[js.Any] = js.undefined
}

object IEditor {
  @scala.inline
  def apply(
    IContainer: typingsJapgolly.extjs.Ext.container.IContainer = null,
    afterRender: (/* ct */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any]) => Callback = null,
    alignment: java.lang.String = null,
    allowBlur: js.UndefOr[Boolean] = js.undefined,
    autoSize: js.Any = null,
    cancelEdit: /* remainVisible */ js.UndefOr[Boolean] => Callback = null,
    cancelOnEsc: js.UndefOr[Boolean] = js.undefined,
    completeEdit: /* remainVisible */ js.UndefOr[Boolean] => Callback = null,
    completeOnEnter: js.UndefOr[Boolean] = js.undefined,
    field: IField = null,
    getValue: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    hideEl: js.UndefOr[Boolean] = js.undefined,
    ignoreNoChange: js.UndefOr[Boolean] = js.undefined,
    offsets: Array = null,
    onHide: js.UndefOr[Callback] = js.undefined,
    onShow: js.UndefOr[Callback] = js.undefined,
    parentEl: js.Any = null,
    realign: /* autoSize */ js.UndefOr[Boolean] => Callback = null,
    revertInvalid: js.UndefOr[Boolean] = js.undefined,
    setValue: /* value */ js.UndefOr[js.Any] => Callback = null,
    startEdit: (/* el */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String]) => Callback = null,
    swallowKeys: js.UndefOr[Boolean] = js.undefined,
    updateEl: js.UndefOr[Boolean] = js.undefined,
    value: js.Any = null
  ): IEditor = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (afterRender != null) __obj.updateDynamic("afterRender")(js.Any.fromFunction2((t0: /* ct */ js.UndefOr[js.Any], t1: /* position */ js.UndefOr[js.Any]) => afterRender(t0, t1).runNow()))
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (!js.isUndefined(allowBlur)) __obj.updateDynamic("allowBlur")(allowBlur.asInstanceOf[js.Any])
    if (autoSize != null) __obj.updateDynamic("autoSize")(autoSize.asInstanceOf[js.Any])
    if (cancelEdit != null) __obj.updateDynamic("cancelEdit")(js.Any.fromFunction1((t0: /* remainVisible */ js.UndefOr[scala.Boolean]) => cancelEdit(t0).runNow()))
    if (!js.isUndefined(cancelOnEsc)) __obj.updateDynamic("cancelOnEsc")(cancelOnEsc.asInstanceOf[js.Any])
    if (completeEdit != null) __obj.updateDynamic("completeEdit")(js.Any.fromFunction1((t0: /* remainVisible */ js.UndefOr[scala.Boolean]) => completeEdit(t0).runNow()))
    if (!js.isUndefined(completeOnEnter)) __obj.updateDynamic("completeOnEnter")(completeOnEnter.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    getValue.foreach(p => __obj.updateDynamic("getValue")(p.toJsFn))
    if (!js.isUndefined(hideEl)) __obj.updateDynamic("hideEl")(hideEl.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreNoChange)) __obj.updateDynamic("ignoreNoChange")(ignoreNoChange.asInstanceOf[js.Any])
    if (offsets != null) __obj.updateDynamic("offsets")(offsets.asInstanceOf[js.Any])
    onHide.foreach(p => __obj.updateDynamic("onHide")(p.toJsFn))
    onShow.foreach(p => __obj.updateDynamic("onShow")(p.toJsFn))
    if (parentEl != null) __obj.updateDynamic("parentEl")(parentEl.asInstanceOf[js.Any])
    if (realign != null) __obj.updateDynamic("realign")(js.Any.fromFunction1((t0: /* autoSize */ js.UndefOr[scala.Boolean]) => realign(t0).runNow()))
    if (!js.isUndefined(revertInvalid)) __obj.updateDynamic("revertInvalid")(revertInvalid.asInstanceOf[js.Any])
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => setValue(t0).runNow()))
    if (startEdit != null) __obj.updateDynamic("startEdit")(js.Any.fromFunction2((t0: /* el */ js.UndefOr[js.Any], t1: /* value */ js.UndefOr[java.lang.String]) => startEdit(t0, t1).runNow()))
    if (!js.isUndefined(swallowKeys)) __obj.updateDynamic("swallowKeys")(swallowKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(updateEl)) __obj.updateDynamic("updateEl")(updateEl.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditor]
  }
}

