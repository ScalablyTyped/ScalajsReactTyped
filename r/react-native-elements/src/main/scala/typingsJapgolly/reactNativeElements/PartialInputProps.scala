package typingsJapgolly.reactNativeElements

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNative.AnonStart
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityStates
import typingsJapgolly.reactNative.mod.AccessibilityTrait
import typingsJapgolly.reactNative.mod.DataDetectorTypes
import typingsJapgolly.reactNative.mod.DocumentSelectionState
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.KeyboardTypeOptions
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.ReturnKeyTypeOptions
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.mod.IconNode
import typingsJapgolly.reactNativeElements.mod.TextProps
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.URL
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`box-none`
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`box-only`
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`cc-csc`
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`cc-exp-month`
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`cc-exp-year`
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`cc-exp`
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`cc-number`
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`postal-code`
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`street-address`
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`unless-editing`
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`while-editing`
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.addressCity
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.addressCityAndState
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.addressState
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.always
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.assertive
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.auto
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.balanced
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.bottom
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.button
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.center
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.characters
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.countryName
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.creditCardNumber
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.dark
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.default
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.email
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.emailAddress
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.familyName
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.fullStreetAddress
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.givenName
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.highQuality
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.jobTitle
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.light
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.location
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.middleName
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.name
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.namePrefix
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.nameSuffix
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.never
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.newPassword
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.nickname
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.no
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.noExcludeDescendants
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.none
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.off
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.oneTimeCode
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.organizationName
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.password
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.polite
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.postalCode
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.radiobutton_checked
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.radiobutton_unchecked
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.sentences
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.simple
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.streetAddressLine1
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.streetAddressLine2
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.sublocality
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.tel
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.telephoneNumber
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.top
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.username
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.words
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.yes
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.yesExcludeDescendants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-elements.react-native-elements.InputProps> */
trait PartialInputProps extends js.Object {
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
  var accessibilityComponentType: js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked] = js.undefined
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
  var accessibilityHint: js.UndefOr[String] = js.undefined
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
  var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
  var accessibilityStates: js.UndefOr[js.Array[AccessibilityStates]] = js.undefined
  var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.undefined
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
  var accessible: js.UndefOr[Boolean] = js.undefined
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  var autoCapitalize: js.UndefOr[none | sentences | words | characters] = js.undefined
  var autoCompleteType: js.UndefOr[
    `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off
  ] = js.undefined
  var autoCorrect: js.UndefOr[Boolean] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var blurOnSubmit: js.UndefOr[Boolean] = js.undefined
  var caretHidden: js.UndefOr[Boolean] = js.undefined
  var clearButtonMode: js.UndefOr[never | `while-editing` | `unless-editing` | always] = js.undefined
  var clearTextOnFocus: js.UndefOr[Boolean] = js.undefined
  var collapsable: js.UndefOr[Boolean] = js.undefined
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var contextMenuHidden: js.UndefOr[Boolean] = js.undefined
  var dataDetectorTypes: js.UndefOr[DataDetectorTypes | js.Array[DataDetectorTypes]] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var disableFullscreenUI: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledInputStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var editable: js.UndefOr[Boolean] = js.undefined
  var enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.undefined
  var errorMessage: js.UndefOr[String] = js.undefined
  var errorProps: js.UndefOr[TextProps] = js.undefined
  var errorStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
  var hitSlop: js.UndefOr[Insets] = js.undefined
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  var importantForAutofill: js.UndefOr[auto | no | noExcludeDescendants | yes | yesExcludeDescendants] = js.undefined
  var inlineImageLeft: js.UndefOr[String] = js.undefined
  var inlineImagePadding: js.UndefOr[Double] = js.undefined
  var inputAccessoryViewID: js.UndefOr[String] = js.undefined
  var inputComponent: js.UndefOr[ComponentType[_]] = js.undefined
  var inputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var inputStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var isTVSelectable: js.UndefOr[Boolean] = js.undefined
  var keyboardAppearance: js.UndefOr[default | light | dark] = js.undefined
  var keyboardType: js.UndefOr[KeyboardTypeOptions] = js.undefined
  var label: js.UndefOr[String | Element] = js.undefined
  var labelProps: js.UndefOr[TextProps] = js.undefined
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var leftIcon: js.UndefOr[IconNode] = js.undefined
  var leftIconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var maxFontSizeMultiplier: js.UndefOr[Double] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var multiline: js.UndefOr[Boolean] = js.undefined
  var nativeID: js.UndefOr[String] = js.undefined
  var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined
  var numberOfLines: js.UndefOr[Double] = js.undefined
  var onAccessibilityAction: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onBlur: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
  var onContentSizeChange: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onEndEditing: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onKeyPress: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onMoveShouldSetResponder: js.UndefOr[
    js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Boolean]
  ] = js.undefined
  var onMoveShouldSetResponderCapture: js.UndefOr[
    js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Boolean]
  ] = js.undefined
  var onResponderEnd: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onResponderGrant: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onResponderMove: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onResponderReject: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onResponderRelease: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onResponderStart: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onResponderTerminate: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onResponderTerminationRequest: js.UndefOr[
    js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Boolean]
  ] = js.undefined
  var onScroll: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onSelectionChange: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onStartShouldSetResponder: js.UndefOr[
    js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Boolean]
  ] = js.undefined
  var onStartShouldSetResponderCapture: js.UndefOr[
    js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Boolean]
  ] = js.undefined
  var onSubmitEditing: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onTouchCancel: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onTouchEnd: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onTouchEndCapture: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onTouchMove: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var onTouchStart: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]] = js.undefined
  var passwordRules: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var placeholderTextColor: js.UndefOr[String] = js.undefined
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
  var rejectResponderTermination: js.UndefOr[Boolean] = js.undefined
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined
  var returnKeyLabel: js.UndefOr[String] = js.undefined
  var returnKeyType: js.UndefOr[ReturnKeyTypeOptions] = js.undefined
  var rightIcon: js.UndefOr[IconNode] = js.undefined
  var rightIconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
  var secureTextEntry: js.UndefOr[Boolean] = js.undefined
  var selectTextOnFocus: js.UndefOr[Boolean] = js.undefined
  var selection: js.UndefOr[AnonStart] = js.undefined
  var selectionColor: js.UndefOr[String] = js.undefined
  var selectionState: js.UndefOr[DocumentSelectionState] = js.undefined
  var shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
  var spellCheck: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var testID: js.UndefOr[String] = js.undefined
  var textAlignVertical: js.UndefOr[auto | top | bottom | center] = js.undefined
  var textBreakStrategy: js.UndefOr[simple | highQuality | balanced] = js.undefined
  var textContentType: js.UndefOr[
    none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
  ] = js.undefined
  var tvParallaxMagnification: js.UndefOr[Double] = js.undefined
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
  var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined
  var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined
  var tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined
  var underlineColorAndroid: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object PartialInputProps {
  @scala.inline
  def apply(
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
    allowFontScaling: js.UndefOr[Boolean] = js.undefined,
    autoCapitalize: none | sentences | words | characters = null,
    autoCompleteType: `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off = null,
    autoCorrect: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    blurOnSubmit: js.UndefOr[Boolean] = js.undefined,
    caretHidden: js.UndefOr[Boolean] = js.undefined,
    clearButtonMode: never | `while-editing` | `unless-editing` | always = null,
    clearTextOnFocus: js.UndefOr[Boolean] = js.undefined,
    collapsable: js.UndefOr[Boolean] = js.undefined,
    containerStyle: StyleProp[ViewStyle] = null,
    contextMenuHidden: js.UndefOr[Boolean] = js.undefined,
    dataDetectorTypes: DataDetectorTypes | js.Array[DataDetectorTypes] = null,
    defaultValue: String = null,
    disableFullscreenUI: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledInputStyle: StyleProp[TextStyle] = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.undefined,
    errorMessage: String = null,
    errorProps: TextProps = null,
    errorStyle: StyleProp[TextStyle] = null,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    importantForAutofill: auto | no | noExcludeDescendants | yes | yesExcludeDescendants = null,
    inlineImageLeft: String = null,
    inlineImagePadding: Int | Double = null,
    inputAccessoryViewID: String = null,
    inputComponent: ComponentType[_] = null,
    inputContainerStyle: StyleProp[ViewStyle] = null,
    inputStyle: StyleProp[TextStyle] = null,
    isTVSelectable: js.UndefOr[Boolean] = js.undefined,
    keyboardAppearance: default | light | dark = null,
    keyboardType: KeyboardTypeOptions = null,
    label: String | Element = null,
    labelProps: TextProps = null,
    labelStyle: StyleProp[TextStyle] = null,
    leftIcon: IconNode = null,
    leftIconContainerStyle: StyleProp[ViewStyle] = null,
    maxFontSizeMultiplier: Int | Double = null,
    maxLength: Int | Double = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    nativeID: String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
    numberOfLines: Int | Double = null,
    onAccessibilityAction: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onAccessibilityEscape: js.UndefOr[Callback] = js.undefined,
    onAccessibilityTap: js.UndefOr[Callback] = js.undefined,
    onBlur: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onChange: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onChangeText: /* text */ String => Callback = null,
    onContentSizeChange: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onEndEditing: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onFocus: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onKeyPress: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onLayout: /* event */ LayoutChangeEvent => Callback = null,
    onMagicTap: js.UndefOr[Callback] = js.undefined,
    onMoveShouldSetResponder: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => CallbackTo[Boolean] = null,
    onMoveShouldSetResponderCapture: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => CallbackTo[Boolean] = null,
    onResponderEnd: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onResponderGrant: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onResponderMove: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onResponderReject: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onResponderRelease: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onResponderStart: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onResponderTerminate: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onResponderTerminationRequest: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => CallbackTo[Boolean] = null,
    onScroll: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onSelectionChange: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onStartShouldSetResponder: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => CallbackTo[Boolean] = null,
    onStartShouldSetResponderCapture: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => CallbackTo[Boolean] = null,
    onSubmitEditing: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onTouchCancel: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onTouchEnd: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onTouchEndCapture: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onTouchMove: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onTouchStart: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    passwordRules: String = null,
    placeholder: String = null,
    placeholderTextColor: String = null,
    pointerEvents: `box-none` | none | `box-only` | auto = null,
    rejectResponderTermination: js.UndefOr[Boolean] = js.undefined,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
    returnKeyLabel: String = null,
    returnKeyType: ReturnKeyTypeOptions = null,
    rightIcon: IconNode = null,
    rightIconContainerStyle: StyleProp[ViewStyle] = null,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    secureTextEntry: js.UndefOr[Boolean] = js.undefined,
    selectTextOnFocus: js.UndefOr[Boolean] = js.undefined,
    selection: AnonStart = null,
    selectionColor: String = null,
    selectionState: DocumentSelectionState = null,
    shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[TextStyle] = null,
    testID: String = null,
    textAlignVertical: auto | top | bottom | center = null,
    textBreakStrategy: simple | highQuality | balanced = null,
    textContentType: none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode = null,
    tvParallaxMagnification: Int | Double = null,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: Int | Double = null,
    tvParallaxShiftDistanceY: Int | Double = null,
    tvParallaxTiltAngle: Int | Double = null,
    underlineColorAndroid: String = null,
    value: String = null
  ): PartialInputProps = {
    val __obj = js.Dynamic.literal()
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
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCompleteType != null) __obj.updateDynamic("autoCompleteType")(autoCompleteType.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCorrect)) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(blurOnSubmit)) __obj.updateDynamic("blurOnSubmit")(blurOnSubmit.asInstanceOf[js.Any])
    if (!js.isUndefined(caretHidden)) __obj.updateDynamic("caretHidden")(caretHidden.asInstanceOf[js.Any])
    if (clearButtonMode != null) __obj.updateDynamic("clearButtonMode")(clearButtonMode.asInstanceOf[js.Any])
    if (!js.isUndefined(clearTextOnFocus)) __obj.updateDynamic("clearTextOnFocus")(clearTextOnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(contextMenuHidden)) __obj.updateDynamic("contextMenuHidden")(contextMenuHidden.asInstanceOf[js.Any])
    if (dataDetectorTypes != null) __obj.updateDynamic("dataDetectorTypes")(dataDetectorTypes.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFullscreenUI)) __obj.updateDynamic("disableFullscreenUI")(disableFullscreenUI.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledInputStyle != null) __obj.updateDynamic("disabledInputStyle")(disabledInputStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (!js.isUndefined(enablesReturnKeyAutomatically)) __obj.updateDynamic("enablesReturnKeyAutomatically")(enablesReturnKeyAutomatically.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (errorProps != null) __obj.updateDynamic("errorProps")(errorProps.asInstanceOf[js.Any])
    if (errorStyle != null) __obj.updateDynamic("errorStyle")(errorStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (importantForAutofill != null) __obj.updateDynamic("importantForAutofill")(importantForAutofill.asInstanceOf[js.Any])
    if (inlineImageLeft != null) __obj.updateDynamic("inlineImageLeft")(inlineImageLeft.asInstanceOf[js.Any])
    if (inlineImagePadding != null) __obj.updateDynamic("inlineImagePadding")(inlineImagePadding.asInstanceOf[js.Any])
    if (inputAccessoryViewID != null) __obj.updateDynamic("inputAccessoryViewID")(inputAccessoryViewID.asInstanceOf[js.Any])
    if (inputComponent != null) __obj.updateDynamic("inputComponent")(inputComponent.asInstanceOf[js.Any])
    if (inputContainerStyle != null) __obj.updateDynamic("inputContainerStyle")(inputContainerStyle.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(isTVSelectable)) __obj.updateDynamic("isTVSelectable")(isTVSelectable.asInstanceOf[js.Any])
    if (keyboardAppearance != null) __obj.updateDynamic("keyboardAppearance")(keyboardAppearance.asInstanceOf[js.Any])
    if (keyboardType != null) __obj.updateDynamic("keyboardType")(keyboardType.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelProps != null) __obj.updateDynamic("labelProps")(labelProps.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (leftIconContainerStyle != null) __obj.updateDynamic("leftIconContainerStyle")(leftIconContainerStyle.asInstanceOf[js.Any])
    if (maxFontSizeMultiplier != null) __obj.updateDynamic("maxFontSizeMultiplier")(maxFontSizeMultiplier.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing.asInstanceOf[js.Any])
    if (numberOfLines != null) __obj.updateDynamic("numberOfLines")(numberOfLines.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onAccessibilityAction(t0).runNow()))
    onAccessibilityEscape.foreach(p => __obj.updateDynamic("onAccessibilityEscape")(p.toJsFn))
    onAccessibilityTap.foreach(p => __obj.updateDynamic("onAccessibilityTap")(p.toJsFn))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onChange(t0).runNow()))
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => onChangeText(t0).runNow()))
    if (onContentSizeChange != null) __obj.updateDynamic("onContentSizeChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onContentSizeChange(t0).runNow()))
    if (onEndEditing != null) __obj.updateDynamic("onEndEditing")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onEndEditing(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onKeyPress(t0).runNow()))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactNative.mod.LayoutChangeEvent) => onLayout(t0).runNow()))
    onMagicTap.foreach(p => __obj.updateDynamic("onMagicTap")(p.toJsFn))
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onMoveShouldSetResponder(t0).runNow()))
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onMoveShouldSetResponderCapture(t0).runNow()))
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderEnd(t0).runNow()))
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderGrant(t0).runNow()))
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderMove(t0).runNow()))
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderReject(t0).runNow()))
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderRelease(t0).runNow()))
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderStart(t0).runNow()))
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderTerminate(t0).runNow()))
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderTerminationRequest(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onScroll(t0).runNow()))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onSelectionChange(t0).runNow()))
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onStartShouldSetResponder(t0).runNow()))
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onStartShouldSetResponderCapture(t0).runNow()))
    if (onSubmitEditing != null) __obj.updateDynamic("onSubmitEditing")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onSubmitEditing(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onTouchEnd(t0).runNow()))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onTouchEndCapture(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onTouchStart(t0).runNow()))
    if (passwordRules != null) __obj.updateDynamic("passwordRules")(passwordRules.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (placeholderTextColor != null) __obj.updateDynamic("placeholderTextColor")(placeholderTextColor.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectResponderTermination)) __obj.updateDynamic("rejectResponderTermination")(rejectResponderTermination.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid.asInstanceOf[js.Any])
    if (returnKeyLabel != null) __obj.updateDynamic("returnKeyLabel")(returnKeyLabel.asInstanceOf[js.Any])
    if (returnKeyType != null) __obj.updateDynamic("returnKeyType")(returnKeyType.asInstanceOf[js.Any])
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon.asInstanceOf[js.Any])
    if (rightIconContainerStyle != null) __obj.updateDynamic("rightIconContainerStyle")(rightIconContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(secureTextEntry)) __obj.updateDynamic("secureTextEntry")(secureTextEntry.asInstanceOf[js.Any])
    if (!js.isUndefined(selectTextOnFocus)) __obj.updateDynamic("selectTextOnFocus")(selectTextOnFocus.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor.asInstanceOf[js.Any])
    if (selectionState != null) __obj.updateDynamic("selectionState")(selectionState.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (textAlignVertical != null) __obj.updateDynamic("textAlignVertical")(textAlignVertical.asInstanceOf[js.Any])
    if (textBreakStrategy != null) __obj.updateDynamic("textBreakStrategy")(textBreakStrategy.asInstanceOf[js.Any])
    if (textContentType != null) __obj.updateDynamic("textContentType")(textContentType.asInstanceOf[js.Any])
    if (tvParallaxMagnification != null) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceX != null) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceY != null) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.asInstanceOf[js.Any])
    if (tvParallaxTiltAngle != null) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.asInstanceOf[js.Any])
    if (underlineColorAndroid != null) __obj.updateDynamic("underlineColorAndroid")(underlineColorAndroid.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialInputProps]
  }
}

