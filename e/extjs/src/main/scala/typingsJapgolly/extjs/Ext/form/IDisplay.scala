package typingsJapgolly.extjs.Ext.form

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.form.field.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisplay extends IBase {
  /** [Method] Returns the raw value of the field without performing any normalization conversion or validation
  		* @returns String value The raw String value of the field
  		*/
  @JSName("getRawValue")
  var getRawValue_IDisplay: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Config Option] (Boolean) */
  var htmlEncode: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns true if the value of this Field has been changed from its originalValue
  		* @returns Boolean True if this field has been changed from its original value (and is not disabled), false otherwise.
  		*/
  @JSName("isDirty")
  var isDirty_IDisplay: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns whether or not the field value is currently valid by validating the processed raw value of the field
  		* @returns Boolean True if the value is valid, else false
  		*/
  @JSName("isValid")
  var isValid_IDisplay: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value and fires the vali
  		* @returns Boolean True if the value is valid, else false
  		*/
  @JSName("validate")
  var validate_IDisplay: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object IDisplay {
  @scala.inline
  def apply(
    IBase: IBase = null,
    getRawValue: js.UndefOr[CallbackTo[String]] = js.undefined,
    htmlEncode: js.UndefOr[Boolean] = js.undefined,
    isDirty: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isValid: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    renderer: js.Any = null,
    scope: js.Any = null,
    validate: js.UndefOr[CallbackTo[Boolean]] = js.undefined
  ): IDisplay = {
    val __obj = js.Dynamic.literal()
    if (IBase != null) js.Dynamic.global.Object.assign(__obj, IBase)
    getRawValue.foreach(p => __obj.updateDynamic("getRawValue")(p.toJsFn))
    if (!js.isUndefined(htmlEncode)) __obj.updateDynamic("htmlEncode")(htmlEncode.asInstanceOf[js.Any])
    isDirty.foreach(p => __obj.updateDynamic("isDirty")(p.toJsFn))
    isValid.foreach(p => __obj.updateDynamic("isValid")(p.toJsFn))
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    validate.foreach(p => __obj.updateDynamic("validate")(p.toJsFn))
    __obj.asInstanceOf[IDisplay]
  }
}

