package typingsJapgolly.yandexMaps

import typingsJapgolly.yandexMaps.mod.IClassConstructor
import typingsJapgolly.yandexMaps.mod.ISelectableControlLayout
import typingsJapgolly.yandexMaps.yandexMapsStrings.auto
import typingsJapgolly.yandexMaps.yandexMapsStrings.large
import typingsJapgolly.yandexMaps.yandexMapsStrings.left
import typingsJapgolly.yandexMaps.yandexMapsStrings.medium
import typingsJapgolly.yandexMaps.yandexMapsStrings.none
import typingsJapgolly.yandexMaps.yandexMapsStrings.right
import typingsJapgolly.yandexMaps.yandexMapsStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined yandex-maps.yandex-maps.control.IBaseButtonParametersOptions & {  selectOnClick ? :boolean,   size ? :'auto' | 'small' | 'medium' | 'large'} */
trait IBaseButtonParametersOpti extends js.Object {
  var adjustMapMargin: js.UndefOr[Boolean] = js.undefined
  var float: js.UndefOr[none | left | right] = js.undefined
  var floatIndex: js.UndefOr[Double] = js.undefined
  var layout: js.UndefOr[IClassConstructor[ISelectableControlLayout] | String] = js.undefined
  var maxWidth: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.undefined
  var position: js.UndefOr[AnonBottom] = js.undefined
  var selectOnClick: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[auto | small | medium | large] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object IBaseButtonParametersOpti {
  @scala.inline
  def apply(
    adjustMapMargin: js.UndefOr[Boolean] = js.undefined,
    float: none | left | right = null,
    floatIndex: Int | Double = null,
    layout: IClassConstructor[ISelectableControlLayout] | String = null,
    maxWidth: (js.Array[js.Array[Double] | Double]) | Double = null,
    position: AnonBottom = null,
    selectOnClick: js.UndefOr[Boolean] = js.undefined,
    size: auto | small | medium | large = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): IBaseButtonParametersOpti = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustMapMargin)) __obj.updateDynamic("adjustMapMargin")(adjustMapMargin.asInstanceOf[js.Any])
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (floatIndex != null) __obj.updateDynamic("floatIndex")(floatIndex.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(selectOnClick)) __obj.updateDynamic("selectOnClick")(selectOnClick.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseButtonParametersOpti]
  }
}

