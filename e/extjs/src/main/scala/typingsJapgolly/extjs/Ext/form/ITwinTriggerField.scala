package typingsJapgolly.extjs.Ext.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.ICompositeElement
import typingsJapgolly.extjs.Ext.IElement
import typingsJapgolly.extjs.Ext.IEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITwinTriggerField
  extends typingsJapgolly.extjs.Ext.form.field.IText {
  /** [Config Option] (Boolean) */
  var editable: js.UndefOr[Boolean] = js.undefined
  /** [Method] Generates the arguments for the field decorations rendering template
  		* @returns Object The template arguments
  		*/
  @JSName("getLabelableRenderData")
  var getLabelableRenderData_ITwinTriggerField: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Get the total width of the trigger button area
  		* @returns Number The total trigger width
  		*/
  var getTriggerWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (Boolean) */
  var hideTrigger: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Ext.Element) */
  var inputCell: js.UndefOr[IElement] = js.undefined
  /** [Method] The function that should handle the trigger s click event
  		* @param e Ext.EventObject
  		*/
  var onTriggerClick: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var repeatTriggerClick: js.UndefOr[Boolean] = js.undefined
  /** [Method] Sets the editable state of this field
  		* @param editable Boolean True to allow the user to directly edit the field text. If false is passed, the user will only be able to modify the field using the trigger. Will also add a click event to the text field which will call the trigger.
  		*/
  var setEditable: js.UndefOr[js.Function1[/* editable */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (String) */
  var triggerBaseCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var triggerCls: js.UndefOr[String] = js.undefined
  /** [Property] (Ext.CompositeElement) */
  var triggerEl: js.UndefOr[ICompositeElement] = js.undefined
  /** [Config Option] (String) */
  var triggerNoEditCls: js.UndefOr[String] = js.undefined
  /** [Property] (Ext.Element) */
  var triggerWrap: js.UndefOr[IElement] = js.undefined
  /** [Config Option] (String) */
  var triggerWrapCls: js.UndefOr[String] = js.undefined
}

object ITwinTriggerField {
  @scala.inline
  def apply(
    IText: typingsJapgolly.extjs.Ext.form.field.IText = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    getLabelableRenderData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getTriggerWidth: js.UndefOr[CallbackTo[Double]] = js.undefined,
    hideTrigger: js.UndefOr[Boolean] = js.undefined,
    inputCell: IElement = null,
    onTriggerClick: /* e */ js.UndefOr[IEventObject] => Callback = null,
    repeatTriggerClick: js.UndefOr[Boolean] = js.undefined,
    setEditable: /* editable */ js.UndefOr[Boolean] => Callback = null,
    triggerBaseCls: String = null,
    triggerCls: String = null,
    triggerEl: ICompositeElement = null,
    triggerNoEditCls: String = null,
    triggerWrap: IElement = null,
    triggerWrapCls: String = null
  ): ITwinTriggerField = {
    val __obj = js.Dynamic.literal()
    if (IText != null) js.Dynamic.global.Object.assign(__obj, IText)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    getLabelableRenderData.foreach(p => __obj.updateDynamic("getLabelableRenderData")(p.toJsFn))
    getTriggerWidth.foreach(p => __obj.updateDynamic("getTriggerWidth")(p.toJsFn))
    if (!js.isUndefined(hideTrigger)) __obj.updateDynamic("hideTrigger")(hideTrigger.asInstanceOf[js.Any])
    if (inputCell != null) __obj.updateDynamic("inputCell")(inputCell.asInstanceOf[js.Any])
    if (onTriggerClick != null) __obj.updateDynamic("onTriggerClick")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.extjs.Ext.IEventObject]) => onTriggerClick(t0).runNow()))
    if (!js.isUndefined(repeatTriggerClick)) __obj.updateDynamic("repeatTriggerClick")(repeatTriggerClick.asInstanceOf[js.Any])
    if (setEditable != null) __obj.updateDynamic("setEditable")(js.Any.fromFunction1((t0: /* editable */ js.UndefOr[scala.Boolean]) => setEditable(t0).runNow()))
    if (triggerBaseCls != null) __obj.updateDynamic("triggerBaseCls")(triggerBaseCls.asInstanceOf[js.Any])
    if (triggerCls != null) __obj.updateDynamic("triggerCls")(triggerCls.asInstanceOf[js.Any])
    if (triggerEl != null) __obj.updateDynamic("triggerEl")(triggerEl.asInstanceOf[js.Any])
    if (triggerNoEditCls != null) __obj.updateDynamic("triggerNoEditCls")(triggerNoEditCls.asInstanceOf[js.Any])
    if (triggerWrap != null) __obj.updateDynamic("triggerWrap")(triggerWrap.asInstanceOf[js.Any])
    if (triggerWrapCls != null) __obj.updateDynamic("triggerWrapCls")(triggerWrapCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITwinTriggerField]
  }
}

