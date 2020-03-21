package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.carouselMod.CarouselProps
import typingsJapgolly.antDesignReactNative.gridMod.GridProps
import typingsJapgolly.antDesignReactNative.gridMod.default
import typingsJapgolly.antDesignReactNative.gridPropsTypeMod.DataItem
import typingsJapgolly.antDesignReactNative.gridStyleMod.GridStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Grid {
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
    styles: Partial[GridStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[GridProps, default, Unit, GridProps] = {
    val __obj = js.Dynamic.literal(carouselMaxRow = carouselMaxRow.asInstanceOf[js.Any], columnNum = columnNum.asInstanceOf[js.Any])
  
      if (carouselProps != null) __obj.updateDynamic("carouselProps")(carouselProps.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(hasLine)) __obj.updateDynamic("hasLine")(hasLine.asInstanceOf[js.Any])
    if (!js.isUndefined(isCarousel)) __obj.updateDynamic("isCarousel")(isCarousel.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction2((t0: /* dataItem */ js.UndefOr[typingsJapgolly.antDesignReactNative.gridPropsTypeMod.DataItem], t1: /* itemIndex */ scala.Double) => onPress(t0, t1).runNow()))
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction2((t0: /* dataItem */ js.UndefOr[typingsJapgolly.antDesignReactNative.gridPropsTypeMod.DataItem], t1: /* itemIndex */ scala.Double) => renderItem(t0, t1).runNow()))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.gridMod.GridProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.gridMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.gridMod.GridProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/grid", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

