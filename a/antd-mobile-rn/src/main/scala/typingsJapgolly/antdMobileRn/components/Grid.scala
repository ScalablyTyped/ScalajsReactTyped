package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.carouselIndexNativeMod.CarouselProps
import typingsJapgolly.antdMobileRn.gridIndexNativeMod.GridProps
import typingsJapgolly.antdMobileRn.gridPropsTypeMod.DataItem
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Grid {
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
    styles: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[GridProps, typingsJapgolly.antdMobileRn.mod.Grid, Unit, GridProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobileRn.gridIndexNativeMod.GridProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobileRn.mod.Grid](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.gridIndexNativeMod.GridProps])(children: _*)
  }
  @JSImport("antd-mobile-rn", "Grid")
  @js.native
  object componentImport extends js.Object
  
}

