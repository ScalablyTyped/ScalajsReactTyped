package typingsJapgolly.extjs.Ext.form.field

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPicker extends ITrigger {
  /** [Method] Aligns the picker to the input element */
  var alignPicker: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Collapses this field s picker dropdown  */
  var collapse: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Creates and returns the component to be used as this field s picker  */
  var createPicker: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Expands this field s picker dropdown  */
  var expand: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns a reference to the picker component for this field creating it if necessary by calling createPicker
  		* @returns Ext.Component The picker component
  		*/
  var getPicker: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Property] (Boolean) */
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var matchFieldWidth: js.UndefOr[Boolean] = js.undefined
  /** [Method] Handles the trigger click by default toggles between expanding and collapsing the picker component  */
  @JSName("onTriggerClick")
  var onTriggerClick_IPicker: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var openCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var pickerAlign: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number[]) */
  var pickerOffset: js.UndefOr[Array] = js.undefined
}

object IPicker {
  @scala.inline
  def apply(
    ITrigger: ITrigger = null,
    alignPicker: js.UndefOr[Callback] = js.undefined,
    collapse: js.UndefOr[Callback] = js.undefined,
    createPicker: js.UndefOr[Callback] = js.undefined,
    expand: js.UndefOr[Callback] = js.undefined,
    getPicker: js.UndefOr[CallbackTo[IComponent]] = js.undefined,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    matchFieldWidth: js.UndefOr[Boolean] = js.undefined,
    onTriggerClick: js.UndefOr[Callback] = js.undefined,
    openCls: String = null,
    pickerAlign: String = null,
    pickerOffset: Array = null
  ): IPicker = {
    val __obj = js.Dynamic.literal()
    if (ITrigger != null) js.Dynamic.global.Object.assign(__obj, ITrigger)
    alignPicker.foreach(p => __obj.updateDynamic("alignPicker")(p.toJsFn))
    collapse.foreach(p => __obj.updateDynamic("collapse")(p.toJsFn))
    createPicker.foreach(p => __obj.updateDynamic("createPicker")(p.toJsFn))
    expand.foreach(p => __obj.updateDynamic("expand")(p.toJsFn))
    getPicker.foreach(p => __obj.updateDynamic("getPicker")(p.toJsFn))
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(matchFieldWidth)) __obj.updateDynamic("matchFieldWidth")(matchFieldWidth.asInstanceOf[js.Any])
    onTriggerClick.foreach(p => __obj.updateDynamic("onTriggerClick")(p.toJsFn))
    if (openCls != null) __obj.updateDynamic("openCls")(openCls.asInstanceOf[js.Any])
    if (pickerAlign != null) __obj.updateDynamic("pickerAlign")(pickerAlign.asInstanceOf[js.Any])
    if (pickerOffset != null) __obj.updateDynamic("pickerOffset")(pickerOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPicker]
  }
}

