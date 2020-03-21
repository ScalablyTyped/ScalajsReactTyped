package typingsJapgolly.extjs.Ext.form.field

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRadio extends ICheckbox {
  /** [Method] If this radio is part of a group it will return the selected value
  		* @returns String
  		*/
  var getGroupValue: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value s that should be saved to the Ext data Model instance for this field when Ext form Basic updateRe
  		* @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
  		*/
  @JSName("getModelData")
  var getModelData_IRadio: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Property] (Boolean) */
  var isRadio: js.UndefOr[Boolean] = js.undefined
  /** [Method] Method to manage awareness of when components are removed from their respective Container firing a removed event  */
  @JSName("onRemoved")
  var onRemoved_IRadio: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IRadio {
  @scala.inline
  def apply(
    ICheckbox: ICheckbox = null,
    getGroupValue: js.UndefOr[CallbackTo[String]] = js.undefined,
    getModelData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    isRadio: js.UndefOr[Boolean] = js.undefined,
    onRemoved: js.UndefOr[Callback] = js.undefined
  ): IRadio = {
    val __obj = js.Dynamic.literal()
    if (ICheckbox != null) js.Dynamic.global.Object.assign(__obj, ICheckbox)
    getGroupValue.foreach(p => __obj.updateDynamic("getGroupValue")(p.toJsFn))
    getModelData.foreach(p => __obj.updateDynamic("getModelData")(p.toJsFn))
    if (!js.isUndefined(isRadio)) __obj.updateDynamic("isRadio")(isRadio.asInstanceOf[js.Any])
    onRemoved.foreach(p => __obj.updateDynamic("onRemoved")(p.toJsFn))
    __obj.asInstanceOf[IRadio]
  }
}

