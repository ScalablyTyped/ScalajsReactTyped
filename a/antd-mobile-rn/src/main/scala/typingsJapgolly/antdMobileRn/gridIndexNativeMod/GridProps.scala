package typingsJapgolly.antdMobileRn.gridIndexNativeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antdMobileRn.carouselIndexNativeMod.CarouselProps
import typingsJapgolly.antdMobileRn.gridPropsTypeMod.DataItem
import typingsJapgolly.antdMobileRn.gridPropsTypeMod.GridPropsType
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps extends GridPropsType {
  var carouselProps: js.UndefOr[CarouselProps] = js.undefined
  var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
}

object GridProps {
  @scala.inline
  def apply(
    carouselMaxRow: Int | Double = null,
    carouselProps: CarouselProps = null,
    columnNum: Int | Double = null,
    data: js.Array[js.UndefOr[DataItem]] = null,
    hasLine: js.UndefOr[Boolean] = js.undefined,
    isCarousel: js.UndefOr[Boolean] = js.undefined,
    itemStyle: StyleProp[ViewStyle] = null,
    onClick: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => Callback = null,
    renderItem: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => CallbackTo[Element] = null,
    styles: js.Any = null
  ): GridProps = {
    val __obj = js.Dynamic.literal()
    if (carouselMaxRow != null) __obj.updateDynamic("carouselMaxRow")(carouselMaxRow.asInstanceOf[js.Any])
    if (carouselProps != null) __obj.updateDynamic("carouselProps")(carouselProps.asInstanceOf[js.Any])
    if (columnNum != null) __obj.updateDynamic("columnNum")(columnNum.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(hasLine)) __obj.updateDynamic("hasLine")(hasLine.asInstanceOf[js.Any])
    if (!js.isUndefined(isCarousel)) __obj.updateDynamic("isCarousel")(isCarousel.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* dataItem */ js.UndefOr[typingsJapgolly.antdMobileRn.gridPropsTypeMod.DataItem], t1: /* itemIndex */ scala.Double) => onClick(t0, t1).runNow()))
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction2((t0: /* dataItem */ js.UndefOr[typingsJapgolly.antdMobileRn.gridPropsTypeMod.DataItem], t1: /* itemIndex */ scala.Double) => renderItem(t0, t1).runNow()))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProps]
  }
}

