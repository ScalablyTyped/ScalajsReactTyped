package typingsJapgolly.antdMobileRn.textareaItemIndexNativeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.Element
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.URL
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`box-none`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`box-only`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`cc-csc`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`cc-exp-month`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`cc-exp-year`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`cc-exp`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`cc-number`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`no-hide-descendants`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`postal-code`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`street-address`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`unless-editing`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`while-editing`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.addressCity
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.addressCityAndState
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.addressState
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.always
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.assertive
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.auto
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.balanced
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.bottom
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.button
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.center
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.characters
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.countryName
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.creditCardNumber
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.dark
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.email
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.emailAddress
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.familyName
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.fullStreetAddress
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.givenName
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.highQuality
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.jobTitle
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.light
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.location
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.middleName
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.name
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.namePrefix
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.nameSuffix
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.never
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.newPassword
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.nickname
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.no
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.noExcludeDescendants
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.none
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.off
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.oneTimeCode
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.organizationName
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.password
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.polite
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.postalCode
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.radiobutton_checked
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.radiobutton_unchecked
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.sentences
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.simple
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.streetAddressLine1
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.streetAddressLine2
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.sublocality
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.tel
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.telephoneNumber
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.top
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.username
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.words
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.yes
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.yesExcludeDescendants
import typingsJapgolly.antdMobileRn.textareaItemPropsTypeMod.TextAreaItemPropsType
import typingsJapgolly.antdMobileRn.textareaItemStyleIndexNativeMod.ITextareaItemStyle
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.antdMobileRn.textareaItemIndexNativeMod.TextInputProps because var conflicts: defaultValue, editable, maxLength, placeholder, value. Inlined onAccessibilityTap, textContentType, pointerEvents, tvParallaxTiltAngle, returnKeyLabel, onResponderGrant, onResponderStart, underlineColorAndroid, placeholderTextColor, accessibilityState, accessibilityRole, textAlignVertical, selectionColor, textBreakStrategy, keyboardType, onAccessibilityEscape, onStartShouldSetResponder, multiline, accessibilityElementsHidden, onStartShouldSetResponderCapture, tvParallaxMagnification, hitSlop, onTouchStart, selectionState, maxFontSizeMultiplier, style, accessibilityStates, inlineImageLeft, dataDetectorTypes, blurOnSubmit, onScroll, accessibilityTraits, tvParallaxShiftDistanceY, onContentSizeChange, onResponderTerminate, onTouchMove, onTouchEnd, secureTextEntry, onAccessibilityAction, spellCheck, onMoveShouldSetResponderCapture, returnKeyType, onSubmitEditing, rejectResponderTermination, inlineImagePadding, selectTextOnFocus, onEndEditing, autoCapitalize, isTVSelectable, onLayout, onKeyPress, accessibilityLiveRegion, disableFullscreenUI, allowFontScaling, clearTextOnFocus, tvParallaxProperties, onTouchEndCapture, onResponderMove, accessibilityLabel, shouldRasterizeIOS, numberOfLines, contextMenuHidden, collapsable, enablesReturnKeyAutomatically, tvParallaxShiftDistanceX, renderToHardwareTextureAndroid, onResponderReject, onMoveShouldSetResponder, needsOffscreenAlphaCompositing, accessibilityIgnoresInvertColors, keyboardAppearance, onResponderEnd, inputAccessoryViewID, clearButtonMode, removeClippedSubviews, importantForAccessibility, accessibilityHint, importantForAutofill, onMagicTap, autoCompleteType, autoFocus, passwordRules, onResponderRelease, onTouchCancel, hasTVPreferredFocus, onSelectionChange, onChangeText, nativeID, accessibilityComponentType, selection, testID, caretHidden, accessibilityViewIsModal, accessible, scrollEnabled, autoCorrect, onResponderTerminationRequest, accessibilityActions */ trait TextareaItemNativeProps extends TextAreaItemPropsType {
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
  var contextMenuHidden: js.UndefOr[Boolean] = js.undefined
  var dataDetectorTypes: js.UndefOr[DataDetectorTypes | js.Array[DataDetectorTypes]] = js.undefined
  var disableFullscreenUI: js.UndefOr[Boolean] = js.undefined
  var enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.undefined
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
  var hitSlop: js.UndefOr[Insets] = js.undefined
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  var importantForAutofill: js.UndefOr[auto | no | noExcludeDescendants | yes | yesExcludeDescendants] = js.undefined
  var inlineImageLeft: js.UndefOr[String] = js.undefined
  var inlineImagePadding: js.UndefOr[Double] = js.undefined
  var inputAccessoryViewID: js.UndefOr[String] = js.undefined
  var isTVSelectable: js.UndefOr[Boolean] = js.undefined
  var keyboardAppearance: js.UndefOr[typingsJapgolly.antdMobileRn.antdMobileRnStrings.default | light | dark] = js.undefined
  var keyboardType: js.UndefOr[KeyboardTypeOptions] = js.undefined
  var last: js.UndefOr[Boolean] = js.undefined
  var maxFontSizeMultiplier: js.UndefOr[Double] = js.undefined
  var multiline: js.UndefOr[Boolean] = js.undefined
  var nativeID: js.UndefOr[String] = js.undefined
  var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined
  var numberOfLines: js.UndefOr[Double] = js.undefined
  var onAccessibilityAction: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
  var onContentSizeChange: js.UndefOr[js.Function1[(/* e */ js.Any) | (ReactEventFrom[NodeHandle with Element]), Unit]] = js.undefined
  var onEndEditing: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onKeyPress: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onMoveShouldSetResponder: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Boolean]] = js.undefined
  var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Boolean]] = js.undefined
  var onResponderEnd: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onResponderGrant: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onResponderMove: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onResponderReject: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onResponderRelease: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onResponderStart: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onResponderTerminate: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onResponderTerminationRequest: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Boolean]] = js.undefined
  var onScroll: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onSelectionChange: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onStartShouldSetResponder: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Boolean]] = js.undefined
  var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Boolean]] = js.undefined
  var onSubmitEditing: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onTouchCancel: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onTouchEnd: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onTouchEndCapture: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onTouchMove: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onTouchStart: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var passwordRules: js.UndefOr[String] = js.undefined
  var placeholderTextColor: js.UndefOr[String] = js.undefined
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
  var rejectResponderTermination: js.UndefOr[Boolean] = js.undefined
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined
  var returnKeyLabel: js.UndefOr[String] = js.undefined
  var returnKeyType: js.UndefOr[ReturnKeyTypeOptions] = js.undefined
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
  var secureTextEntry: js.UndefOr[Boolean] = js.undefined
  var selectTextOnFocus: js.UndefOr[Boolean] = js.undefined
  var selection: js.UndefOr[AnonStart] = js.undefined
  var selectionColor: js.UndefOr[String] = js.undefined
  var selectionState: js.UndefOr[DocumentSelectionState] = js.undefined
  var shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
  var spellCheck: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var styles: js.UndefOr[ITextareaItemStyle] = js.undefined
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
}

object TextareaItemNativeProps {
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
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    blurOnSubmit: js.UndefOr[Boolean] = js.undefined,
    caretHidden: js.UndefOr[Boolean] = js.undefined,
    clear: js.UndefOr[Boolean] = js.undefined,
    clearButtonMode: never | `while-editing` | `unless-editing` | always = null,
    clearTextOnFocus: js.UndefOr[Boolean] = js.undefined,
    collapsable: js.UndefOr[Boolean] = js.undefined,
    contextMenuHidden: js.UndefOr[Boolean] = js.undefined,
    count: Int | Double = null,
    dataDetectorTypes: DataDetectorTypes | js.Array[DataDetectorTypes] = null,
    defaultValue: String = null,
    disableFullscreenUI: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    importantForAutofill: auto | no | noExcludeDescendants | yes | yesExcludeDescendants = null,
    inlineImageLeft: String = null,
    inlineImagePadding: Int | Double = null,
    inputAccessoryViewID: String = null,
    isTVSelectable: js.UndefOr[Boolean] = js.undefined,
    keyboardAppearance: typingsJapgolly.antdMobileRn.antdMobileRnStrings.default | light | dark = null,
    keyboardType: KeyboardTypeOptions = null,
    labelNumber: Int | Double = null,
    last: js.UndefOr[Boolean] = js.undefined,
    maxFontSizeMultiplier: Int | Double = null,
    maxLength: Int | Double = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    nativeID: String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
    numberOfLines: Int | Double = null,
    onAccessibilityAction: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onAccessibilityEscape: js.UndefOr[Callback] = js.undefined,
    onAccessibilityTap: js.UndefOr[Callback] = js.undefined,
    onBlur: /* val */ js.UndefOr[String] => Callback = null,
    onChange: /* val */ js.UndefOr[String] => Callback = null,
    onChangeText: /* text */ String => Callback = null,
    onContentSizeChange: (/* e */ js.Any) | (ReactEventFrom[NodeHandle with Element]) => Callback = null,
    onEndEditing: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onErrorClick: js.UndefOr[Callback] = js.undefined,
    onFocus: /* val */ js.UndefOr[String] => Callback = null,
    onKeyPress: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onLayout: /* event */ LayoutChangeEvent => Callback = null,
    onMagicTap: js.UndefOr[Callback] = js.undefined,
    onMoveShouldSetResponder: ReactEventFrom[NodeHandle with Element] => CallbackTo[Boolean] = null,
    onMoveShouldSetResponderCapture: ReactEventFrom[NodeHandle with Element] => CallbackTo[Boolean] = null,
    onResponderEnd: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderGrant: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderMove: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderReject: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderRelease: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderStart: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderTerminate: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderTerminationRequest: ReactEventFrom[NodeHandle with Element] => CallbackTo[Boolean] = null,
    onScroll: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onSelectionChange: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onStartShouldSetResponder: ReactEventFrom[NodeHandle with Element] => CallbackTo[Boolean] = null,
    onStartShouldSetResponderCapture: ReactEventFrom[NodeHandle with Element] => CallbackTo[Boolean] = null,
    onSubmitEditing: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onTouchCancel: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onTouchEnd: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onTouchEndCapture: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onTouchMove: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onTouchStart: ReactEventFrom[NodeHandle with Element] => Callback = null,
    passwordRules: String = null,
    placeholder: String = null,
    placeholderTextColor: String = null,
    pointerEvents: `box-none` | none | `box-only` | auto = null,
    rejectResponderTermination: js.UndefOr[Boolean] = js.undefined,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
    returnKeyLabel: String = null,
    returnKeyType: ReturnKeyTypeOptions = null,
    rows: Int | Double = null,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    secureTextEntry: js.UndefOr[Boolean] = js.undefined,
    selectTextOnFocus: js.UndefOr[Boolean] = js.undefined,
    selection: AnonStart = null,
    selectionColor: String = null,
    selectionState: DocumentSelectionState = null,
    shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[TextStyle] = null,
    styles: ITextareaItemStyle = null,
    testID: String = null,
    textAlignVertical: auto | top | bottom | center = null,
    textBreakStrategy: simple | highQuality | balanced = null,
    textContentType: none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode = null,
    title: VdomNode = null,
    tvParallaxMagnification: Int | Double = null,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: Int | Double = null,
    tvParallaxShiftDistanceY: Int | Double = null,
    tvParallaxTiltAngle: Int | Double = null,
    underlineColorAndroid: String = null,
    value: String = null
  ): TextareaItemNativeProps = {
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
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(blurOnSubmit)) __obj.updateDynamic("blurOnSubmit")(blurOnSubmit.asInstanceOf[js.Any])
    if (!js.isUndefined(caretHidden)) __obj.updateDynamic("caretHidden")(caretHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(clear)) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (clearButtonMode != null) __obj.updateDynamic("clearButtonMode")(clearButtonMode.asInstanceOf[js.Any])
    if (!js.isUndefined(clearTextOnFocus)) __obj.updateDynamic("clearTextOnFocus")(clearTextOnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable.asInstanceOf[js.Any])
    if (!js.isUndefined(contextMenuHidden)) __obj.updateDynamic("contextMenuHidden")(contextMenuHidden.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (dataDetectorTypes != null) __obj.updateDynamic("dataDetectorTypes")(dataDetectorTypes.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFullscreenUI)) __obj.updateDynamic("disableFullscreenUI")(disableFullscreenUI.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (!js.isUndefined(enablesReturnKeyAutomatically)) __obj.updateDynamic("enablesReturnKeyAutomatically")(enablesReturnKeyAutomatically.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (importantForAutofill != null) __obj.updateDynamic("importantForAutofill")(importantForAutofill.asInstanceOf[js.Any])
    if (inlineImageLeft != null) __obj.updateDynamic("inlineImageLeft")(inlineImageLeft.asInstanceOf[js.Any])
    if (inlineImagePadding != null) __obj.updateDynamic("inlineImagePadding")(inlineImagePadding.asInstanceOf[js.Any])
    if (inputAccessoryViewID != null) __obj.updateDynamic("inputAccessoryViewID")(inputAccessoryViewID.asInstanceOf[js.Any])
    if (!js.isUndefined(isTVSelectable)) __obj.updateDynamic("isTVSelectable")(isTVSelectable.asInstanceOf[js.Any])
    if (keyboardAppearance != null) __obj.updateDynamic("keyboardAppearance")(keyboardAppearance.asInstanceOf[js.Any])
    if (keyboardType != null) __obj.updateDynamic("keyboardType")(keyboardType.asInstanceOf[js.Any])
    if (labelNumber != null) __obj.updateDynamic("labelNumber")(labelNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (maxFontSizeMultiplier != null) __obj.updateDynamic("maxFontSizeMultiplier")(maxFontSizeMultiplier.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing.asInstanceOf[js.Any])
    if (numberOfLines != null) __obj.updateDynamic("numberOfLines")(numberOfLines.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onAccessibilityAction(t0).runNow()))
    onAccessibilityEscape.foreach(p => __obj.updateDynamic("onAccessibilityEscape")(p.toJsFn))
    onAccessibilityTap.foreach(p => __obj.updateDynamic("onAccessibilityTap")(p.toJsFn))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* val */ js.UndefOr[java.lang.String]) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* val */ js.UndefOr[java.lang.String]) => onChange(t0).runNow()))
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => onChangeText(t0).runNow()))
    if (onContentSizeChange != null) __obj.updateDynamic("onContentSizeChange")(js.Any.fromFunction1((t0: (/* e */ js.Any) | (japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element])) => onContentSizeChange(t0).runNow()))
    if (onEndEditing != null) __obj.updateDynamic("onEndEditing")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onEndEditing(t0).runNow()))
    onErrorClick.foreach(p => __obj.updateDynamic("onErrorClick")(p.toJsFn))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* val */ js.UndefOr[java.lang.String]) => onFocus(t0).runNow()))
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
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(secureTextEntry)) __obj.updateDynamic("secureTextEntry")(secureTextEntry.asInstanceOf[js.Any])
    if (!js.isUndefined(selectTextOnFocus)) __obj.updateDynamic("selectTextOnFocus")(selectTextOnFocus.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor.asInstanceOf[js.Any])
    if (selectionState != null) __obj.updateDynamic("selectionState")(selectionState.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (textAlignVertical != null) __obj.updateDynamic("textAlignVertical")(textAlignVertical.asInstanceOf[js.Any])
    if (textBreakStrategy != null) __obj.updateDynamic("textBreakStrategy")(textBreakStrategy.asInstanceOf[js.Any])
    if (textContentType != null) __obj.updateDynamic("textContentType")(textContentType.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (tvParallaxMagnification != null) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceX != null) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceY != null) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.asInstanceOf[js.Any])
    if (tvParallaxTiltAngle != null) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.asInstanceOf[js.Any])
    if (underlineColorAndroid != null) __obj.updateDynamic("underlineColorAndroid")(underlineColorAndroid.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextareaItemNativeProps]
  }
}

