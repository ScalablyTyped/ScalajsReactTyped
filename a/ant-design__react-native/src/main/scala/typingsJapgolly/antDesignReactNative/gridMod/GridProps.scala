package typingsJapgolly.antDesignReactNative.gridMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antDesignReactNative.carouselMod.CarouselProps
import typingsJapgolly.antDesignReactNative.gridPropsTypeMod.DataItem
import typingsJapgolly.antDesignReactNative.gridPropsTypeMod.GridPropsType
import typingsJapgolly.antDesignReactNative.gridStyleMod.GridStyle
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps
  extends GridPropsType
     with WithThemeStyles[GridStyle] {
  var carouselProps: js.UndefOr[CarouselProps] = js.undefined
  var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object GridProps {
  @scala.inline
  def apply(
    carouselMaxRow: Double,
    columnNum: Double,
    carouselProps: CarouselProps = null,
    data: js.Array[js.UndefOr[DataItem]] = null,
    hasLine: js.UndefOr[Boolean] = js.undefined,
    isCarousel: js.UndefOr[Boolean] = js.undefined,
    itemStyle: StyleProp[ViewStyle] = null,
    onPress: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => Callback = null,
    renderItem: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => CallbackTo[Element] = null,
    styles: Partial[GridStyle] = null
  ): GridProps = {
    val __obj = js.Dynamic.literal(carouselMaxRow = carouselMaxRow.asInstanceOf[js.Any], columnNum = columnNum.asInstanceOf[js.Any])
    if (carouselProps != null) __obj.updateDynamic("carouselProps")(carouselProps.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(hasLine)) __obj.updateDynamic("hasLine")(hasLine.asInstanceOf[js.Any])
    if (!js.isUndefined(isCarousel)) __obj.updateDynamic("isCarousel")(isCarousel.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction2((t0: /* dataItem */ js.UndefOr[typingsJapgolly.antDesignReactNative.gridPropsTypeMod.DataItem], t1: /* itemIndex */ scala.Double) => onPress(t0, t1).runNow()))
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction2((t0: /* dataItem */ js.UndefOr[typingsJapgolly.antDesignReactNative.gridPropsTypeMod.DataItem], t1: /* itemIndex */ scala.Double) => renderItem(t0, t1).runNow()))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProps]
  }
}

