package typingsJapgolly.antd

import typingsJapgolly.antd.cascaderMod.CascaderOptionType
import typingsJapgolly.antd.cascaderMod.CascaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/lib/cascader.CascaderState> */
trait PartialCascaderState extends js.Object {
  var flattenOptions: js.UndefOr[js.Array[js.Array[CascaderOptionType]]] = js.undefined
  var inputFocused: js.UndefOr[Boolean] = js.undefined
  var inputValue: js.UndefOr[String] = js.undefined
  var popupVisible: js.UndefOr[Boolean] = js.undefined
  var prevProps: js.UndefOr[CascaderProps] = js.undefined
  var value: js.UndefOr[js.Array[String]] = js.undefined
}

object PartialCascaderState {
  @scala.inline
  def apply(
    flattenOptions: js.Array[js.Array[CascaderOptionType]] = null,
    inputFocused: js.UndefOr[Boolean] = js.undefined,
    inputValue: String = null,
    popupVisible: js.UndefOr[Boolean] = js.undefined,
    prevProps: CascaderProps = null,
    value: js.Array[String] = null
  ): PartialCascaderState = {
    val __obj = js.Dynamic.literal()
    if (flattenOptions != null) __obj.updateDynamic("flattenOptions")(flattenOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(inputFocused)) __obj.updateDynamic("inputFocused")(inputFocused.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (!js.isUndefined(popupVisible)) __obj.updateDynamic("popupVisible")(popupVisible.asInstanceOf[js.Any])
    if (prevProps != null) __obj.updateDynamic("prevProps")(prevProps.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCascaderState]
  }
}

