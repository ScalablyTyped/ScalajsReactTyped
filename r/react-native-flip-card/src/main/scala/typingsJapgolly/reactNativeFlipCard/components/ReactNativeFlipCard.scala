package typingsJapgolly.reactNativeFlipCard.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeFlipCard.mod.FlipCardProps
import typingsJapgolly.reactNativeFlipCard.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeFlipCard {
  def apply(
    alignHeight: js.UndefOr[Boolean] = js.undefined,
    alignWidth: js.UndefOr[Boolean] = js.undefined,
    clickable: js.UndefOr[Boolean] = js.undefined,
    flip: js.UndefOr[Boolean] = js.undefined,
    flipHorizontal: js.UndefOr[Boolean] = js.undefined,
    flipVertical: js.UndefOr[Boolean] = js.undefined,
    friction: Int | Double = null,
    onFlipEnd: js.UndefOr[Callback] = js.undefined,
    onFlipStart: js.UndefOr[Callback] = js.undefined,
    perspective: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FlipCardProps, default, Unit, FlipCardProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(alignHeight)) __obj.updateDynamic("alignHeight")(alignHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(alignWidth)) __obj.updateDynamic("alignWidth")(alignWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (!js.isUndefined(flipHorizontal)) __obj.updateDynamic("flipHorizontal")(flipHorizontal.asInstanceOf[js.Any])
    if (!js.isUndefined(flipVertical)) __obj.updateDynamic("flipVertical")(flipVertical.asInstanceOf[js.Any])
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    onFlipEnd.foreach(p => __obj.updateDynamic("onFlipEnd")(p.toJsFn))
    onFlipStart.foreach(p => __obj.updateDynamic("onFlipStart")(p.toJsFn))
    if (perspective != null) __obj.updateDynamic("perspective")(perspective.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeFlipCard.mod.FlipCardProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeFlipCard.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeFlipCard.mod.FlipCardProps])(children: _*)
  }
  @JSImport("react-native-flip-card", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

