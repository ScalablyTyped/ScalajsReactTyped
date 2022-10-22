package typingsJapgolly.reactNativeElements.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.ValidationMap
import typingsJapgolly.reactNativeElements.distButtonsButtonMod.ButtonProps
import typingsJapgolly.reactNativeElements.distDialogDialogActionsMod.DialogActionsProps
import typingsJapgolly.reactNativeElements.distDialogDialogLoadingMod.DialogLoadingProps
import typingsJapgolly.reactNativeElements.distDialogDialogTitleMod.DialogTitleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<std.Pick<react-native-elements.react-native-elements/dist/dialog/Dialog.DialogProps, 'style' | 'onLayout' | 'testID' | 'accessible' | 'accessibilityActions' | 'accessibilityLabel' | 'accessibilityRole' | 'accessibilityState' | 'accessibilityHint' | 'accessibilityValue' | 'onAccessibilityAction' | 'accessibilityLiveRegion' | 'importantForAccessibility' | 'accessibilityElementsHidden' | 'accessibilityViewIsModal' | 'onAccessibilityEscape' | 'onAccessibilityTap' | 'onMagicTap' | 'accessibilityIgnoresInvertColors' | 'visible' | 'nativeID' | 'hitSlop' | 'hasTVPreferredFocus' | 'tvParallaxProperties' | 'transparent' | 'children' | 'pointerEvents' | 'removeClippedSubviews' | 'collapsable' | 'needsOffscreenAlphaCompositing' | 'renderToHardwareTextureAndroid' | 'focusable' | 'shouldRasterizeIOS' | 'isTVSelectable' | 'tvParallaxShiftDistanceX' | 'tvParallaxShiftDistanceY' | 'tvParallaxTiltAngle' | 'tvParallaxMagnification' | 'onStartShouldSetResponder' | 'onMoveShouldSetResponder' | 'onResponderEnd' | 'onResponderGrant' | 'onResponderReject' | 'onResponderMove' | 'onResponderRelease' | 'onResponderStart' | 'onResponderTerminationRequest' | 'onResponderTerminate' | 'onStartShouldSetResponderCapture' | 'onMoveShouldSetResponderCapture' | 'onTouchStart' | 'onTouchMove' | 'onTouchEnd' | 'onTouchCancel' | 'onTouchEndCapture' | 'isVisible' | 'animated' | 'animationType' | 'onRequestClose' | 'onShow' | 'presentationStyle' | 'supportedOrientations' | 'onDismiss' | 'onOrientationChange' | 'hardwareAccelerated' | 'statusBarTranslucent' | 'backdropStyle' | 'overlayStyle' | 'onBackdropPress' | 'ModalComponent'>> & {  Loading :react.react.FunctionComponent<std.Pick<react-native-elements.react-native-elements/dist/dialog/DialogLoading.DialogLoadingProps, 'loadingStyle' | 'loadingProps'>> | react.react.ForwardRefExoticComponent<react-native-elements.react-native-elements/dist/dialog/DialogLoading.DialogLoadingProps>,   Title :react.react.FunctionComponent<std.Pick<react-native-elements.react-native-elements/dist/dialog/DialogTitle.DialogTitleProps, 'title' | 'titleStyle' | 'titleProps'>> | react.react.ForwardRefExoticComponent<react-native-elements.react-native-elements/dist/dialog/DialogTitle.DialogTitleProps>,   Actions :react.react.FunctionComponent<std.Pick<react-native-elements.react-native-elements/dist/dialog/DialogActions.DialogActionsProps, 'children'>> | react.react.ForwardRefExoticComponent<react-native-elements.react-native-elements/dist/dialog/DialogActions.DialogActionsProps>,   Button :react.react.FunctionComponent<std.Pick<react-native-elements.react-native-elements.ButtonProps, 'style' | 'onLayout' | 'testID' | 'accessible' | 'accessibilityActions' | 'accessibilityLabel' | 'accessibilityRole' | 'accessibilityState' | 'accessibilityHint' | 'accessibilityValue' | 'onAccessibilityAction' | 'accessibilityLiveRegion' | 'importantForAccessibility' | 'accessibilityElementsHidden' | 'accessibilityViewIsModal' | 'onAccessibilityEscape' | 'onAccessibilityTap' | 'onMagicTap' | 'accessibilityIgnoresInvertColors' | 'raised' | 'disabled' | 'onPress' | 'onLongPress' | 'activeOpacity' | 'delayLongPress' | 'delayPressIn' | 'delayPressOut' | 'hitSlop' | 'onBlur' | 'onFocus' | 'onPressIn' | 'onPressOut' | 'pressRetentionOffset' | 'hasTVPreferredFocus' | 'tvParallaxProperties' | 'touchSoundDisabled' | 'background' | 'useForeground' | 'type' | 'containerStyle' | 'disabledStyle' | 'title' | 'icon' | 'titleStyle' | 'loading' | 'titleProps' | 'buttonStyle' | 'loadingStyle' | 'loadingProps' | 'iconContainerStyle' | 'iconRight' | 'linearGradientProps' | 'TouchableComponent' | 'ViewComponent' | 'disabledTitleStyle' | 'iconPosition'>> | react.react.ForwardRefExoticComponent<react-native-elements.react-native-elements.ButtonProps>} */
@js.native
trait FunctionComponentPickDial extends StObject {
  
  def apply(props: PickDialogPropsstyleonLay): Element | Null = js.native
  def apply(props: PickDialogPropsstyleonLay, context: Any): Element | Null = js.native
  
  var Actions: FunctionComponent[PickDialogActionsPropschi] | typingsJapgolly.react.mod.ForwardRefExoticComponent[DialogActionsProps] = js.native
  
  var Button: FunctionComponent[PickButtonPropsstyleonLay] | typingsJapgolly.react.mod.ForwardRefExoticComponent[ButtonProps] = js.native
  
  var Loading: FunctionComponent[PickDialogLoadingPropsloa] | typingsJapgolly.react.mod.ForwardRefExoticComponent[DialogLoadingProps] = js.native
  
  var Title: FunctionComponent[PickDialogTitlePropstitle] | typingsJapgolly.react.mod.ForwardRefExoticComponent[DialogTitleProps] = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var defaultProps: js.UndefOr[PartialPickDialogPropssty] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapPickDial] = js.native
}
