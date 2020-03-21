package typingsJapgolly.yandexMaps

import typingsJapgolly.yandexMaps.mod.IClassConstructor
import typingsJapgolly.yandexMaps.mod.ISelectableControlLayout
import typingsJapgolly.yandexMaps.yandexMapsStrings.left
import typingsJapgolly.yandexMaps.yandexMapsStrings.none
import typingsJapgolly.yandexMaps.yandexMapsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined yandex-maps.yandex-maps.control.IBaseButtonParametersOptions & {  collapseOnBlur ? :boolean,   expandOnClick ? :boolean,   popupFloat ? :'left' | 'right'} */
trait IBaseButtonParametersOptiAdjustMapMargin extends js.Object {
  var adjustMapMargin: js.UndefOr[Boolean] = js.undefined
  var collapseOnBlur: js.UndefOr[Boolean] = js.undefined
  var expandOnClick: js.UndefOr[Boolean] = js.undefined
  var float: js.UndefOr[none | left | right] = js.undefined
  var floatIndex: js.UndefOr[Double] = js.undefined
  var layout: js.UndefOr[IClassConstructor[ISelectableControlLayout] | String] = js.undefined
  var maxWidth: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.undefined
  var popupFloat: js.UndefOr[left | right] = js.undefined
  var position: js.UndefOr[AnonBottom] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object IBaseButtonParametersOptiAdjustMapMargin {
  @scala.inline
  def apply(
    adjustMapMargin: js.UndefOr[Boolean] = js.undefined,
    collapseOnBlur: js.UndefOr[Boolean] = js.undefined,
    expandOnClick: js.UndefOr[Boolean] = js.undefined,
    float: none | left | right = null,
    floatIndex: Int | Double = null,
    layout: IClassConstructor[ISelectableControlLayout] | String = null,
    maxWidth: (js.Array[js.Array[Double] | Double]) | Double = null,
    popupFloat: left | right = null,
    position: AnonBottom = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): IBaseButtonParametersOptiAdjustMapMargin = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustMapMargin)) __obj.updateDynamic("adjustMapMargin")(adjustMapMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(collapseOnBlur)) __obj.updateDynamic("collapseOnBlur")(collapseOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(expandOnClick)) __obj.updateDynamic("expandOnClick")(expandOnClick.asInstanceOf[js.Any])
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (floatIndex != null) __obj.updateDynamic("floatIndex")(floatIndex.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (popupFloat != null) __obj.updateDynamic("popupFloat")(popupFloat.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseButtonParametersOptiAdjustMapMargin]
  }
}

