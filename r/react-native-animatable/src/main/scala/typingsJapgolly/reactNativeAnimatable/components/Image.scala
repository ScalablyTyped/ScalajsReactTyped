package typingsJapgolly.reactNativeAnimatable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityStates
import typingsJapgolly.reactNative.mod.AccessibilityTrait
import typingsJapgolly.reactNative.mod.ImageProperties
import typingsJapgolly.reactNative.mod.ImageResizeMode
import typingsJapgolly.reactNative.mod.ImageSourcePropType
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsJapgolly.reactNative.reactNativeStrings.assertive
import typingsJapgolly.reactNative.reactNativeStrings.auto
import typingsJapgolly.reactNative.reactNativeStrings.button
import typingsJapgolly.reactNative.reactNativeStrings.no
import typingsJapgolly.reactNative.reactNativeStrings.none
import typingsJapgolly.reactNative.reactNativeStrings.polite
import typingsJapgolly.reactNative.reactNativeStrings.radiobutton_checked
import typingsJapgolly.reactNative.reactNativeStrings.radiobutton_unchecked
import typingsJapgolly.reactNative.reactNativeStrings.resize
import typingsJapgolly.reactNative.reactNativeStrings.scale
import typingsJapgolly.reactNative.reactNativeStrings.yes
import typingsJapgolly.reactNativeAnimatable.mod.AnimatableProperties
import typingsJapgolly.reactNativeAnimatable.mod.Animation
import typingsJapgolly.reactNativeAnimatable.mod.CustomAnimation
import typingsJapgolly.reactNativeAnimatable.mod.Direction
import typingsJapgolly.reactNativeAnimatable.mod.Easing
import typingsJapgolly.reactNativeAnimatable.mod.ImageCls
import typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.infinite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Image {
  def apply(
    source: ImageSourcePropType,
    accessibilityActions: js.Array[AccessibilityActionInfo] = null,
    accessibilityComponentType: none | button | radiobutton_checked | radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined,
    accessibilityHint: String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined,
    accessibilityLabel: String = null,
    accessibilityLiveRegion: none | polite | assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityState: AccessibilityState = null,
    accessibilityStates: js.Array[AccessibilityStates] = null,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined,
    accessible: js.UndefOr[Boolean] = js.undefined,
    animation: Animation | String | (CustomAnimation[TextStyle with ViewStyle with ImageStyle]) = null,
    blurRadius: Int | Double = null,
    borderBottomLeftRadius: Int | Double = null,
    borderBottomRightRadius: Int | Double = null,
    borderRadius: Int | Double = null,
    borderTopLeftRadius: Int | Double = null,
    borderTopRightRadius: Int | Double = null,
    capInsets: Insets = null,
    defaultSource: ImageURISource | Double = null,
    delay: Int | Double = null,
    direction: Direction = null,
    duration: Int | Double = null,
    easing: Easing = null,
    fadeDuration: Int | Double = null,
    height: Int | Double = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    iterationCount: Double | infinite = null,
    iterationDelay: Int | Double = null,
    loadingIndicatorSource: ImageURISource = null,
    onAccessibilityAction: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onAccessibilityEscape: js.UndefOr[Callback] = js.undefined,
    onAccessibilityTap: js.UndefOr[Callback] = js.undefined,
    onAnimationBegin: js.Function = null,
    onAnimationEnd: js.Function = null,
    onError: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onLayout: /* event */ LayoutChangeEvent => Callback = null,
    onLoad: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onLoadEnd: js.UndefOr[Callback] = js.undefined,
    onLoadStart: js.UndefOr[Callback] = js.undefined,
    onMagicTap: js.UndefOr[Callback] = js.undefined,
    onPartialLoad: js.UndefOr[Callback] = js.undefined,
    onProgress: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onTransitionBegin: /* property */ String => Callback = null,
    onTransitionEnd: /* property */ String => Callback = null,
    progressiveRenderingEnabled: js.UndefOr[Boolean] = js.undefined,
    resizeMethod: auto | resize | scale = null,
    resizeMode: ImageResizeMode = null,
    style: StyleProp[ImageStyle] = null,
    testID: String = null,
    transition: String | js.Array[String] = null,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    AnimatableProperties[ImageStyle] with ImageProperties, 
    ImageCls, 
    Unit, 
    AnimatableProperties[ImageStyle] with ImageProperties
  ] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
  
      if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden.asInstanceOf[js.Any])
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole.asInstanceOf[js.Any])
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState.asInstanceOf[js.Any])
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates.asInstanceOf[js.Any])
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (blurRadius != null) __obj.updateDynamic("blurRadius")(blurRadius.asInstanceOf[js.Any])
    if (borderBottomLeftRadius != null) __obj.updateDynamic("borderBottomLeftRadius")(borderBottomLeftRadius.asInstanceOf[js.Any])
    if (borderBottomRightRadius != null) __obj.updateDynamic("borderBottomRightRadius")(borderBottomRightRadius.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderTopLeftRadius != null) __obj.updateDynamic("borderTopLeftRadius")(borderTopLeftRadius.asInstanceOf[js.Any])
    if (borderTopRightRadius != null) __obj.updateDynamic("borderTopRightRadius")(borderTopRightRadius.asInstanceOf[js.Any])
    if (capInsets != null) __obj.updateDynamic("capInsets")(capInsets.asInstanceOf[js.Any])
    if (defaultSource != null) __obj.updateDynamic("defaultSource")(defaultSource.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (fadeDuration != null) __obj.updateDynamic("fadeDuration")(fadeDuration.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (iterationCount != null) __obj.updateDynamic("iterationCount")(iterationCount.asInstanceOf[js.Any])
    if (iterationDelay != null) __obj.updateDynamic("iterationDelay")(iterationDelay.asInstanceOf[js.Any])
    if (loadingIndicatorSource != null) __obj.updateDynamic("loadingIndicatorSource")(loadingIndicatorSource.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onAccessibilityAction(t0).runNow()))
    onAccessibilityEscape.foreach(p => __obj.updateDynamic("onAccessibilityEscape")(p.toJsFn))
    onAccessibilityTap.foreach(p => __obj.updateDynamic("onAccessibilityTap")(p.toJsFn))
    if (onAnimationBegin != null) __obj.updateDynamic("onAnimationBegin")(onAnimationBegin.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(onAnimationEnd.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onError(t0).runNow()))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactNative.mod.LayoutChangeEvent) => onLayout(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onLoad(t0).runNow()))
    onLoadEnd.foreach(p => __obj.updateDynamic("onLoadEnd")(p.toJsFn))
    onLoadStart.foreach(p => __obj.updateDynamic("onLoadStart")(p.toJsFn))
    onMagicTap.foreach(p => __obj.updateDynamic("onMagicTap")(p.toJsFn))
    onPartialLoad.foreach(p => __obj.updateDynamic("onPartialLoad")(p.toJsFn))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onProgress(t0).runNow()))
    if (onTransitionBegin != null) __obj.updateDynamic("onTransitionBegin")(js.Any.fromFunction1((t0: /* property */ java.lang.String) => onTransitionBegin(t0).runNow()))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1((t0: /* property */ java.lang.String) => onTransitionEnd(t0).runNow()))
    if (!js.isUndefined(progressiveRenderingEnabled)) __obj.updateDynamic("progressiveRenderingEnabled")(progressiveRenderingEnabled.asInstanceOf[js.Any])
    if (resizeMethod != null) __obj.updateDynamic("resizeMethod")(resizeMethod.asInstanceOf[js.Any])
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeAnimatable.mod.AnimatableProperties[typingsJapgolly.reactNative.mod.ImageStyle] with typingsJapgolly.reactNative.mod.ImageProperties, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeAnimatable.mod.ImageCls](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeAnimatable.mod.AnimatableProperties[typingsJapgolly.reactNative.mod.ImageStyle] with typingsJapgolly.reactNative.mod.ImageProperties])(children: _*)
  }
  @JSImport("react-native-animatable", "Image")
  @js.native
  object componentImport extends js.Object
  
}

