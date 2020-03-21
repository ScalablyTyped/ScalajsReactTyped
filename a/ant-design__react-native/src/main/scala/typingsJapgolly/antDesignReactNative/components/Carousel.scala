package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.antDesignReactNative.carouselMod.CarouselProps
import typingsJapgolly.antDesignReactNative.carouselMod.CarouselState
import typingsJapgolly.antDesignReactNative.carouselMod.PaginationProps
import typingsJapgolly.antDesignReactNative.carouselMod.default
import typingsJapgolly.antDesignReactNative.carouselStyleMod.CarouselStyle
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Carousel {
  def apply(
    afterChange: /* index */ Double => Callback = null,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayInterval: Int | Double = null,
    bounces: js.UndefOr[Boolean] = js.undefined,
    dotActiveStyle: StyleProp[ViewStyle] = null,
    dotStyle: StyleProp[ViewStyle] = null,
    dots: js.UndefOr[Boolean] = js.undefined,
    infinite: js.UndefOr[Boolean] = js.undefined,
    initialSlideWidth: Int | Double = null,
    onMomentumScrollEnd: (ReactEventFrom[NodeHandle with Element], /* state */ CarouselState, /* carousel */ typingsJapgolly.antDesignReactNative.carouselMod.Carousel) => Callback = null,
    onScrollBeginDrag: (ReactEventFrom[NodeHandle with Element], /* state */ CarouselState, /* carousel */ typingsJapgolly.antDesignReactNative.carouselMod.Carousel) => Callback = null,
    pagination: /* props */ PaginationProps => CallbackTo[Node] = null,
    selectedIndex: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[CarouselStyle] = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CarouselProps, default, Unit, CarouselProps] = {
    val __obj = js.Dynamic.literal()
  
      if (afterChange != null) __obj.updateDynamic("afterChange")(js.Any.fromFunction1((t0: /* index */ scala.Double) => afterChange(t0).runNow()))
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (autoplayInterval != null) __obj.updateDynamic("autoplayInterval")(autoplayInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(bounces)) __obj.updateDynamic("bounces")(bounces.asInstanceOf[js.Any])
    if (dotActiveStyle != null) __obj.updateDynamic("dotActiveStyle")(dotActiveStyle.asInstanceOf[js.Any])
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite.asInstanceOf[js.Any])
    if (initialSlideWidth != null) __obj.updateDynamic("initialSlideWidth")(initialSlideWidth.asInstanceOf[js.Any])
    if (onMomentumScrollEnd != null) __obj.updateDynamic("onMomentumScrollEnd")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element], t1: /* state */ typingsJapgolly.antDesignReactNative.carouselMod.CarouselState, t2: /* carousel */ typingsJapgolly.antDesignReactNative.carouselMod.Carousel) => onMomentumScrollEnd(t0, t1, t2).runNow()))
    if (onScrollBeginDrag != null) __obj.updateDynamic("onScrollBeginDrag")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element], t1: /* state */ typingsJapgolly.antDesignReactNative.carouselMod.CarouselState, t2: /* carousel */ typingsJapgolly.antDesignReactNative.carouselMod.Carousel) => onScrollBeginDrag(t0, t1, t2).runNow()))
    if (pagination != null) __obj.updateDynamic("pagination")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.antDesignReactNative.carouselMod.PaginationProps) => pagination(t0).runNow()))
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.carouselMod.CarouselProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.carouselMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.carouselMod.CarouselProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/carousel", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

