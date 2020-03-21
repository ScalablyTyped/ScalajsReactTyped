package typingsJapgolly.reactNativeSnapCarousel.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.FlatListProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSnapCarousel.mod.PaginationProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pagination {
  def apply(
    activeDotIndex: Double,
    dotsLength: Double,
    activeOpacity: Int | Double = null,
    carouselRef: Component[FlatListProps[_] with js.Object, js.Object] = null,
    containerStyle: StyleProp[ViewStyle] = null,
    dotColor: String = null,
    dotContainerStyle: StyleProp[ViewStyle] = null,
    dotElement: VdomNode = null,
    dotStyle: StyleProp[ViewStyle] = null,
    inactiveDotColor: String = null,
    inactiveDotElement: VdomNode = null,
    inactiveDotOpacity: Int | Double = null,
    inactiveDotScale: Int | Double = null,
    inactiveDotStyle: StyleProp[ViewStyle] = null,
    renderDots: (/* activeIndex */ Double, /* total */ Double, /* context */ js.Any) => CallbackTo[Node] = null,
    tappableDots: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PaginationProperties, 
    typingsJapgolly.reactNativeSnapCarousel.mod.Pagination, 
    Unit, 
    PaginationProperties
  ] = {
    val __obj = js.Dynamic.literal(activeDotIndex = activeDotIndex.asInstanceOf[js.Any], dotsLength = dotsLength.asInstanceOf[js.Any])
  
      if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (carouselRef != null) __obj.updateDynamic("carouselRef")(carouselRef.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (dotColor != null) __obj.updateDynamic("dotColor")(dotColor.asInstanceOf[js.Any])
    if (dotContainerStyle != null) __obj.updateDynamic("dotContainerStyle")(dotContainerStyle.asInstanceOf[js.Any])
    if (dotElement != null) __obj.updateDynamic("dotElement")(dotElement.rawNode.asInstanceOf[js.Any])
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle.asInstanceOf[js.Any])
    if (inactiveDotColor != null) __obj.updateDynamic("inactiveDotColor")(inactiveDotColor.asInstanceOf[js.Any])
    if (inactiveDotElement != null) __obj.updateDynamic("inactiveDotElement")(inactiveDotElement.rawNode.asInstanceOf[js.Any])
    if (inactiveDotOpacity != null) __obj.updateDynamic("inactiveDotOpacity")(inactiveDotOpacity.asInstanceOf[js.Any])
    if (inactiveDotScale != null) __obj.updateDynamic("inactiveDotScale")(inactiveDotScale.asInstanceOf[js.Any])
    if (inactiveDotStyle != null) __obj.updateDynamic("inactiveDotStyle")(inactiveDotStyle.asInstanceOf[js.Any])
    if (renderDots != null) __obj.updateDynamic("renderDots")(js.Any.fromFunction3((t0: /* activeIndex */ scala.Double, t1: /* total */ scala.Double, t2: /* context */ js.Any) => renderDots(t0, t1, t2).runNow()))
    if (!js.isUndefined(tappableDots)) __obj.updateDynamic("tappableDots")(tappableDots.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeSnapCarousel.mod.PaginationProperties, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeSnapCarousel.mod.Pagination](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeSnapCarousel.mod.PaginationProperties])(children: _*)
  }
  @JSImport("react-native-snap-carousel", "Pagination")
  @js.native
  object componentImport extends js.Object
  
}

