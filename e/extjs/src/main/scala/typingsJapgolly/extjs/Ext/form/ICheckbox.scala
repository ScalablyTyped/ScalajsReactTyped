package typingsJapgolly.extjs.Ext.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.IElement
import typingsJapgolly.extjs.Ext.form.field.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckbox extends IBase {
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterBoxLabelTextTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterBoxLabelTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeBoxLabelTextTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeBoxLabelTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var boxLabel: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var boxLabelAlign: js.UndefOr[String] = js.undefined
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var boxLabelAttrTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var boxLabelCls: js.UndefOr[String] = js.undefined
  /** [Property] (Ext.Element) */
  var boxLabelEl: js.UndefOr[IElement] = js.undefined
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var checkedCls: js.UndefOr[String] = js.undefined
  /** [Method] Returns the checked state of the checkbox
  		* @returns Boolean True if checked, else false
  		*/
  @JSName("getRawValue")
  var getRawValue_ICheckbox: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the checked state of the checkbox
  		* @returns Boolean True if checked, else false
  		*/
  @JSName("getValue")
  var getValue_ICheckbox: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.undefined
  /** [Method] Initializes the field s value based on the initial config  */
  @JSName("initValue")
  var initValue_ICheckbox: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var inputValue: js.UndefOr[String] = js.undefined
  /** [Method] Resets the field s originalValue property so it matches the current value
  		* @param fromBoxInGroup Object
  		*/
  @JSName("resetOriginalValue")
  var resetOriginalValue_ICheckbox: js.UndefOr[js.Function1[/* fromBoxInGroup */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the boxLabel for this checkbox
  		* @param boxLabel String The new label
  		*/
  var setBoxLabel: js.UndefOr[js.Function1[/* boxLabel */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the checked state of the checkbox
  		* @param value Boolean/String/Number The following values will check the checkbox: true, 'true', '1', 1, or 'on', as well as a String that matches the inputValue. Any other value will uncheck the checkbox.
  		* @returns Boolean the new checked state of the checkbox
  		*/
  @JSName("setRawValue")
  var setRawValue_ICheckbox: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Sets the read only state of this field
  		* @param readOnly Object
  		*/
  @JSName("setReadOnly")
  var setReadOnly_ICheckbox: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the checked state of the checkbox and invokes change detection
  		* @param checked Boolean/String The following values will check the checkbox: true, 'true', '1', or 'on', as well as a String that matches the inputValue. Any other value will uncheck the checkbox.
  		* @returns Ext.form.field.Checkbox this
  		*/
  @JSName("setValue")
  var setValue_ICheckbox: js.UndefOr[js.Function1[/* checked */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (String) */
  var uncheckedValue: js.UndefOr[String] = js.undefined
}

object ICheckbox {
  @scala.inline
  def apply(
    IBase: IBase = null,
    afterBoxLabelTextTpl: js.Any = null,
    afterBoxLabelTpl: js.Any = null,
    beforeBoxLabelTextTpl: js.Any = null,
    beforeBoxLabelTpl: js.Any = null,
    boxLabel: String = null,
    boxLabelAlign: String = null,
    boxLabelAttrTpl: js.Any = null,
    boxLabelCls: String = null,
    boxLabelEl: IElement = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    checkedCls: String = null,
    getRawValue: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getValue: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    handler: js.Any = null,
    initValue: js.UndefOr[Callback] = js.undefined,
    inputValue: String = null,
    resetOriginalValue: /* fromBoxInGroup */ js.UndefOr[js.Any] => Callback = null,
    scope: js.Any = null,
    setBoxLabel: /* boxLabel */ js.UndefOr[String] => Callback = null,
    setRawValue: /* value */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    setReadOnly: /* readOnly */ js.UndefOr[js.Any] => Callback = null,
    setValue: /* checked */ js.UndefOr[js.Any] => CallbackTo[ICheckbox] = null,
    uncheckedValue: String = null
  ): ICheckbox = {
    val __obj = js.Dynamic.literal()
    if (IBase != null) js.Dynamic.global.Object.assign(__obj, IBase)
    if (afterBoxLabelTextTpl != null) __obj.updateDynamic("afterBoxLabelTextTpl")(afterBoxLabelTextTpl.asInstanceOf[js.Any])
    if (afterBoxLabelTpl != null) __obj.updateDynamic("afterBoxLabelTpl")(afterBoxLabelTpl.asInstanceOf[js.Any])
    if (beforeBoxLabelTextTpl != null) __obj.updateDynamic("beforeBoxLabelTextTpl")(beforeBoxLabelTextTpl.asInstanceOf[js.Any])
    if (beforeBoxLabelTpl != null) __obj.updateDynamic("beforeBoxLabelTpl")(beforeBoxLabelTpl.asInstanceOf[js.Any])
    if (boxLabel != null) __obj.updateDynamic("boxLabel")(boxLabel.asInstanceOf[js.Any])
    if (boxLabelAlign != null) __obj.updateDynamic("boxLabelAlign")(boxLabelAlign.asInstanceOf[js.Any])
    if (boxLabelAttrTpl != null) __obj.updateDynamic("boxLabelAttrTpl")(boxLabelAttrTpl.asInstanceOf[js.Any])
    if (boxLabelCls != null) __obj.updateDynamic("boxLabelCls")(boxLabelCls.asInstanceOf[js.Any])
    if (boxLabelEl != null) __obj.updateDynamic("boxLabelEl")(boxLabelEl.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (checkedCls != null) __obj.updateDynamic("checkedCls")(checkedCls.asInstanceOf[js.Any])
    getRawValue.foreach(p => __obj.updateDynamic("getRawValue")(p.toJsFn))
    getValue.foreach(p => __obj.updateDynamic("getValue")(p.toJsFn))
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    initValue.foreach(p => __obj.updateDynamic("initValue")(p.toJsFn))
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (resetOriginalValue != null) __obj.updateDynamic("resetOriginalValue")(js.Any.fromFunction1((t0: /* fromBoxInGroup */ js.UndefOr[js.Any]) => resetOriginalValue(t0).runNow()))
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (setBoxLabel != null) __obj.updateDynamic("setBoxLabel")(js.Any.fromFunction1((t0: /* boxLabel */ js.UndefOr[java.lang.String]) => setBoxLabel(t0).runNow()))
    if (setRawValue != null) __obj.updateDynamic("setRawValue")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => setRawValue(t0).runNow()))
    if (setReadOnly != null) __obj.updateDynamic("setReadOnly")(js.Any.fromFunction1((t0: /* readOnly */ js.UndefOr[js.Any]) => setReadOnly(t0).runNow()))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: /* checked */ js.UndefOr[js.Any]) => setValue(t0).runNow()))
    if (uncheckedValue != null) __obj.updateDynamic("uncheckedValue")(uncheckedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckbox]
  }
}

