package typingsJapgolly.reactDashNativeDashVectorDashIcons.iconMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactDashNative.NodeHandle
import typingsJapgolly.reactDashNative.reactDashNativeMod.AccessibilityActionInfo
import typingsJapgolly.reactDashNative.reactDashNativeMod.AccessibilityRole
import typingsJapgolly.reactDashNative.reactDashNativeMod.AccessibilityState
import typingsJapgolly.reactDashNative.reactDashNativeMod.AccessibilityStates
import typingsJapgolly.reactDashNative.reactDashNativeMod.AccessibilityTrait
import typingsJapgolly.reactDashNative.reactDashNativeMod.ImageURISource
import typingsJapgolly.reactDashNative.reactDashNativeMod.Insets
import typingsJapgolly.reactDashNative.reactDashNativeMod.LayoutChangeEvent
import typingsJapgolly.reactDashNative.reactDashNativeMod.StyleProp
import typingsJapgolly.reactDashNative.reactDashNativeMod.TVParallaxProperties
import typingsJapgolly.reactDashNative.reactDashNativeMod.TabBarIOSItemProps
import typingsJapgolly.reactDashNative.reactDashNativeMod.ViewStyle
import typingsJapgolly.reactDashNative.reactDashNativeStrings.`box-none`
import typingsJapgolly.reactDashNative.reactDashNativeStrings.`box-only`
import typingsJapgolly.reactDashNative.reactDashNativeStrings.`most-recent`
import typingsJapgolly.reactDashNative.reactDashNativeStrings.`most-viewed`
import typingsJapgolly.reactDashNative.reactDashNativeStrings.`no-hide-descendants`
import typingsJapgolly.reactDashNative.reactDashNativeStrings.`top-rated`
import typingsJapgolly.reactDashNative.reactDashNativeStrings.assertive
import typingsJapgolly.reactDashNative.reactDashNativeStrings.auto
import typingsJapgolly.reactDashNative.reactDashNativeStrings.bookmarks
import typingsJapgolly.reactDashNative.reactDashNativeStrings.button
import typingsJapgolly.reactDashNative.reactDashNativeStrings.contacts
import typingsJapgolly.reactDashNative.reactDashNativeStrings.downloads
import typingsJapgolly.reactDashNative.reactDashNativeStrings.favorites
import typingsJapgolly.reactDashNative.reactDashNativeStrings.featured
import typingsJapgolly.reactDashNative.reactDashNativeStrings.history
import typingsJapgolly.reactDashNative.reactDashNativeStrings.more
import typingsJapgolly.reactDashNative.reactDashNativeStrings.no
import typingsJapgolly.reactDashNative.reactDashNativeStrings.none
import typingsJapgolly.reactDashNative.reactDashNativeStrings.polite
import typingsJapgolly.reactDashNative.reactDashNativeStrings.radiobutton_checked
import typingsJapgolly.reactDashNative.reactDashNativeStrings.radiobutton_unchecked
import typingsJapgolly.reactDashNative.reactDashNativeStrings.recents
import typingsJapgolly.reactDashNative.reactDashNativeStrings.search
import typingsJapgolly.reactDashNative.reactDashNativeStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarItemIOSProps extends TabBarIOSItemProps {
  /**
    * Color of the icon
    *
    */
  var iconColor: js.UndefOr[String] = js.undefined
  /**
    * Name of the default icon (similar to TabBarIOS.Item icon)
    *
    */
  var iconName: String
  /**
    * Size of the icon
    *
    * @default 30
    */
  var iconSize: js.UndefOr[Double] = js.undefined
  /**
    * Color of the selected icon.
    *
    * Defaults to iconColor
    *
    */
  var selectedIconColor: js.UndefOr[String] = js.undefined
  /**
    * Name of the selected icon (similar to TabBarIOS.Item selectedIcon)
    *
    * Defaults to iconName
    *
    */
  var selectedIconName: js.UndefOr[String] = js.undefined
}

object TabBarItemIOSProps {
  @scala.inline
  def apply(
    iconName: String,
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
    badge: String | Double = null,
    badgeColor: String = null,
    collapsable: js.UndefOr[Boolean] = js.undefined,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    icon: ImageURISource = null,
    iconColor: String = null,
    iconSize: Int | Double = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    isTVSelectable: js.UndefOr[Boolean] = js.undefined,
    nativeID: String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
    onAccessibilityAction: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onAccessibilityTap: js.UndefOr[Callback] = js.undefined,
    onLayout: /* event */ LayoutChangeEvent => Callback = null,
    onMagicTap: js.UndefOr[Callback] = js.undefined,
    onMoveShouldSetResponder: ReactEventFrom[NodeHandle with Element] => CallbackTo[Boolean] = null,
    onMoveShouldSetResponderCapture: ReactEventFrom[NodeHandle with Element] => CallbackTo[Boolean] = null,
    onPress: js.UndefOr[Callback] = js.undefined,
    onResponderEnd: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderGrant: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderMove: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderReject: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderRelease: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderStart: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderTerminate: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderTerminationRequest: ReactEventFrom[NodeHandle with Element] => CallbackTo[Boolean] = null,
    onStartShouldSetResponder: ReactEventFrom[NodeHandle with Element] => CallbackTo[Boolean] = null,
    onStartShouldSetResponderCapture: ReactEventFrom[NodeHandle with Element] => CallbackTo[Boolean] = null,
    onTouchCancel: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onTouchEnd: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onTouchEndCapture: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onTouchMove: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onTouchStart: ReactEventFrom[NodeHandle with Element] => Callback = null,
    pointerEvents: `box-none` | none | `box-only` | auto = null,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    renderAsOriginal: js.UndefOr[Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    selectedIcon: ImageURISource = null,
    selectedIconColor: String = null,
    selectedIconName: String = null,
    shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    systemIcon: bookmarks | contacts | downloads | favorites | featured | history | more | `most-recent` | `most-viewed` | recents | search | `top-rated` = null,
    testID: String = null,
    title: String = null,
    tvParallaxMagnification: Int | Double = null,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: Int | Double = null,
    tvParallaxShiftDistanceY: Int | Double = null,
    tvParallaxTiltAngle: Int | Double = null
  ): TabBarItemIOSProps = {
    val __obj = js.Dynamic.literal(iconName = iconName.asInstanceOf[js.Any])
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
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (badgeColor != null) __obj.updateDynamic("badgeColor")(badgeColor.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(isTVSelectable)) __obj.updateDynamic("isTVSelectable")(isTVSelectable.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactDashNative.NodeHandle with org.scalajs.dom.raw.Element]) => onAccessibilityAction(t0).runNow()))
    onAccessibilityTap.foreach(p => __obj.updateDynamic("onAccessibilityTap")(p.toJsFn))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactDashNative.reactDashNativeMod.LayoutChangeEvent) => onLayout(t0).runNow()))
    onMagicTap.foreach(p => __obj.updateDynamic("onMagicTap")(p.toJsFn))
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactDashNative.NodeHandle with org.scalajs.dom.raw.Element]) => onMoveShouldSetResponder(t0).runNow()))
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactDashNative.NodeHandle with org.scalajs.dom.raw.Element]) => onMoveShouldSetResponderCapture(t0).runNow()))
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactDashNative.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderEnd(t0).runNow()))
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactDashNative.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderGrant(t0).runNow()))
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactDashNative.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderMove(t0).runNow()))
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactDashNative.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderReject(t0).runNow()))
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactDashNative.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderRelease(t0).runNow()))
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactDashNative.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderStart(t0).runNow()))
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactDashNative.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderTerminate(t0).runNow()))
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactDashNative.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderTerminationRequest(t0).runNow()))
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactDashNative.NodeHandle with org.scalajs.dom.raw.Element]) => onStartShouldSetResponder(t0).runNow()))
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactDashNative.NodeHandle with org.scalajs.dom.raw.Element]) => onStartShouldSetResponderCapture(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactDashNative.NodeHandle with org.scalajs.dom.raw.Element]) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactDashNative.NodeHandle with org.scalajs.dom.raw.Element]) => onTouchEnd(t0).runNow()))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactDashNative.NodeHandle with org.scalajs.dom.raw.Element]) => onTouchEndCapture(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactDashNative.NodeHandle with org.scalajs.dom.raw.Element]) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactDashNative.NodeHandle with org.scalajs.dom.raw.Element]) => onTouchStart(t0).runNow()))
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAsOriginal)) __obj.updateDynamic("renderAsOriginal")(renderAsOriginal.asInstanceOf[js.Any])
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (selectedIcon != null) __obj.updateDynamic("selectedIcon")(selectedIcon.asInstanceOf[js.Any])
    if (selectedIconColor != null) __obj.updateDynamic("selectedIconColor")(selectedIconColor.asInstanceOf[js.Any])
    if (selectedIconName != null) __obj.updateDynamic("selectedIconName")(selectedIconName.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (systemIcon != null) __obj.updateDynamic("systemIcon")(systemIcon.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tvParallaxMagnification != null) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceX != null) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceY != null) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.asInstanceOf[js.Any])
    if (tvParallaxTiltAngle != null) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarItemIOSProps]
  }
}

