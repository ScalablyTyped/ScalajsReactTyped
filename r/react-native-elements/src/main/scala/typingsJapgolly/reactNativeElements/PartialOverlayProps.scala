package typingsJapgolly.reactNativeElements

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`landscape-left`
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`landscape-right`
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`portrait-upside-down`
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.fade
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.formSheet
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.fullScreen
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.landscape
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.none
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.overFullScreen
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.pageSheet
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.portrait
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-elements.react-native-elements.OverlayProps> */
trait PartialOverlayProps extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var animationType: js.UndefOr[none | slide | fade] = js.undefined
  var borderRadius: js.UndefOr[Double] = js.undefined
  var children: js.UndefOr[Element] = js.undefined
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var fullScreen: js.UndefOr[Boolean] = js.undefined
  var hardwareAccelerated: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var isVisible: js.UndefOr[Boolean] = js.undefined
  var onBackdropPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOrientationChange: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onRequestClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var overlayBackgroundColor: js.UndefOr[String] = js.undefined
  var overlayStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var presentationStyle: js.UndefOr[fullScreen | pageSheet | formSheet | overFullScreen] = js.undefined
  var supportedOrientations: js.UndefOr[
    js.Array[
      portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
    ]
  ] = js.undefined
  var transparent: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
  var windowBackgroundColor: js.UndefOr[String] = js.undefined
}

object PartialOverlayProps {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    animationType: none | slide | fade = null,
    borderRadius: Int | Double = null,
    children: VdomElement = null,
    containerStyle: StyleProp[ViewStyle] = null,
    fullScreen: js.UndefOr[Boolean] = js.undefined,
    hardwareAccelerated: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    isVisible: js.UndefOr[Boolean] = js.undefined,
    onBackdropPress: js.UndefOr[Callback] = js.undefined,
    onDismiss: js.UndefOr[Callback] = js.undefined,
    onOrientationChange: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onRequestClose: js.UndefOr[Callback] = js.undefined,
    onShow: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    overlayBackgroundColor: String = null,
    overlayStyle: StyleProp[ViewStyle] = null,
    presentationStyle: fullScreen | pageSheet | formSheet | overFullScreen = null,
    supportedOrientations: js.Array[
      portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
    ] = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null,
    windowBackgroundColor: String = null
  ): PartialOverlayProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (animationType != null) __obj.updateDynamic("animationType")(animationType.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawElement.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(fullScreen)) __obj.updateDynamic("fullScreen")(fullScreen.asInstanceOf[js.Any])
    if (!js.isUndefined(hardwareAccelerated)) __obj.updateDynamic("hardwareAccelerated")(hardwareAccelerated.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isVisible)) __obj.updateDynamic("isVisible")(isVisible.asInstanceOf[js.Any])
    onBackdropPress.foreach(p => __obj.updateDynamic("onBackdropPress")(p.toJsFn))
    onDismiss.foreach(p => __obj.updateDynamic("onDismiss")(p.toJsFn))
    if (onOrientationChange != null) __obj.updateDynamic("onOrientationChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onOrientationChange(t0).runNow()))
    onRequestClose.foreach(p => __obj.updateDynamic("onRequestClose")(p.toJsFn))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onShow(t0).runNow()))
    if (overlayBackgroundColor != null) __obj.updateDynamic("overlayBackgroundColor")(overlayBackgroundColor.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (presentationStyle != null) __obj.updateDynamic("presentationStyle")(presentationStyle.asInstanceOf[js.Any])
    if (supportedOrientations != null) __obj.updateDynamic("supportedOrientations")(supportedOrientations.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (windowBackgroundColor != null) __obj.updateDynamic("windowBackgroundColor")(windowBackgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOverlayProps]
  }
}

