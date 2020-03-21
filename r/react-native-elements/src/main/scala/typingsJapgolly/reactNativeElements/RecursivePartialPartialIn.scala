package typingsJapgolly.reactNativeElements

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
import typingsJapgolly.reactNativeElements.mod.RecursivePartial
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

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.InputProps>> */
trait RecursivePartialPartialIn extends js.Object {
  var accessibilityActions: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]]] = js.undefined
  var accessibilityComponentType: js.UndefOr[
    RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]
  ] = js.undefined
  var accessibilityElementsHidden: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var accessibilityHint: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var accessibilityIgnoresInvertColors: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var accessibilityLabel: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var accessibilityLiveRegion: js.UndefOr[RecursivePartial[js.UndefOr[none | polite | assertive]]] = js.undefined
  var accessibilityRole: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityRole]]] = js.undefined
  var accessibilityState: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityState]]] = js.undefined
  var accessibilityStates: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[AccessibilityStates]]]] = js.undefined
  var accessibilityTraits: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]] = js.undefined
  var accessibilityViewIsModal: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var accessible: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var allowFontScaling: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var autoCapitalize: js.UndefOr[RecursivePartial[js.UndefOr[none | sentences | words | characters]]] = js.undefined
  var autoCompleteType: js.UndefOr[
    RecursivePartial[
      js.UndefOr[
        `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off
      ]
    ]
  ] = js.undefined
  var autoCorrect: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var autoFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var blurOnSubmit: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var caretHidden: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var clearButtonMode: js.UndefOr[
    RecursivePartial[js.UndefOr[never | `while-editing` | `unless-editing` | always]]
  ] = js.undefined
  var clearTextOnFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var collapsable: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var contextMenuHidden: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var dataDetectorTypes: js.UndefOr[RecursivePartial[js.UndefOr[DataDetectorTypes | js.Array[DataDetectorTypes]]]] = js.undefined
  var defaultValue: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var disableFullscreenUI: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var disabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var disabledInputStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  var editable: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var enablesReturnKeyAutomatically: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var errorMessage: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var errorProps: js.UndefOr[RecursivePartial[js.UndefOr[TextProps]]] = js.undefined
  var errorStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  var hasTVPreferredFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var hitSlop: js.UndefOr[RecursivePartial[js.UndefOr[Insets]]] = js.undefined
  var importantForAccessibility: js.UndefOr[RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.undefined
  var importantForAutofill: js.UndefOr[
    RecursivePartial[js.UndefOr[auto | no | noExcludeDescendants | yes | yesExcludeDescendants]]
  ] = js.undefined
  var inlineImageLeft: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var inlineImagePadding: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var inputAccessoryViewID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var inputComponent: js.UndefOr[RecursivePartial[js.UndefOr[ComponentType[_]]]] = js.undefined
  var inputContainerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var inputStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  var isTVSelectable: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var keyboardAppearance: js.UndefOr[RecursivePartial[js.UndefOr[default | light | dark]]] = js.undefined
  var keyboardType: js.UndefOr[RecursivePartial[js.UndefOr[KeyboardTypeOptions]]] = js.undefined
  var label: js.UndefOr[RecursivePartial[js.UndefOr[String | Element]]] = js.undefined
  var labelProps: js.UndefOr[RecursivePartial[js.UndefOr[TextProps]]] = js.undefined
  var labelStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  var leftIcon: js.UndefOr[RecursivePartial[js.UndefOr[IconNode]]] = js.undefined
  var leftIconContainerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var maxFontSizeMultiplier: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var maxLength: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var multiline: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var nativeID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var needsOffscreenAlphaCompositing: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var numberOfLines: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var onAccessibilityAction: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ]
  ] = js.undefined
  var onAccessibilityEscape: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onAccessibilityTap: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onBlur: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ]
  ] = js.undefined
  var onChange: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ]
  ] = js.undefined
  var onChangeText: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* text */ String, Unit]]]] = js.undefined
  var onContentSizeChange: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ]
  ] = js.undefined
  var onEndEditing: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ]
  ] = js.undefined
  var onFocus: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ]
  ] = js.undefined
  var onKeyPress: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ]
  ] = js.undefined
  var onLayout: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]] = js.undefined
  var onMagicTap: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onMoveShouldSetResponder: js.UndefOr[
    RecursivePartial[
      js.UndefOr[
        js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Boolean]
      ]
    ]
  ] = js.undefined
  var onMoveShouldSetResponderCapture: js.UndefOr[
    RecursivePartial[
      js.UndefOr[
        js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Boolean]
      ]
    ]
  ] = js.undefined
  var onResponderEnd: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ]
  ] = js.undefined
  var onResponderGrant: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ]
  ] = js.undefined
  var onResponderMove: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ]
  ] = js.undefined
  var onResponderReject: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ]
  ] = js.undefined
  var onResponderRelease: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ]
  ] = js.undefined
  var onResponderStart: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ]
  ] = js.undefined
  var onResponderTerminate: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ]
  ] = js.undefined
  var onResponderTerminationRequest: js.UndefOr[
    RecursivePartial[
      js.UndefOr[
        js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Boolean]
      ]
    ]
  ] = js.undefined
  var onScroll: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ]
  ] = js.undefined
  var onSelectionChange: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ]
  ] = js.undefined
  var onStartShouldSetResponder: js.UndefOr[
    RecursivePartial[
      js.UndefOr[
        js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Boolean]
      ]
    ]
  ] = js.undefined
  var onStartShouldSetResponderCapture: js.UndefOr[
    RecursivePartial[
      js.UndefOr[
        js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Boolean]
      ]
    ]
  ] = js.undefined
  var onSubmitEditing: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ]
  ] = js.undefined
  var onTouchCancel: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ]
  ] = js.undefined
  var onTouchEnd: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ]
  ] = js.undefined
  var onTouchEndCapture: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ]
  ] = js.undefined
  var onTouchMove: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ]
  ] = js.undefined
  var onTouchStart: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ]
  ] = js.undefined
  var passwordRules: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var placeholder: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var placeholderTextColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var pointerEvents: js.UndefOr[RecursivePartial[js.UndefOr[`box-none` | none | `box-only` | auto]]] = js.undefined
  var rejectResponderTermination: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var removeClippedSubviews: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var renderToHardwareTextureAndroid: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var returnKeyLabel: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var returnKeyType: js.UndefOr[RecursivePartial[js.UndefOr[ReturnKeyTypeOptions]]] = js.undefined
  var rightIcon: js.UndefOr[RecursivePartial[js.UndefOr[IconNode]]] = js.undefined
  var rightIconContainerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var scrollEnabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var secureTextEntry: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var selectTextOnFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var selection: js.UndefOr[RecursivePartial[js.UndefOr[AnonStart]]] = js.undefined
  var selectionColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var selectionState: js.UndefOr[RecursivePartial[js.UndefOr[DocumentSelectionState]]] = js.undefined
  var shouldRasterizeIOS: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var spellCheck: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var style: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  var testID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var textAlignVertical: js.UndefOr[RecursivePartial[js.UndefOr[auto | top | bottom | center]]] = js.undefined
  var textBreakStrategy: js.UndefOr[RecursivePartial[js.UndefOr[simple | highQuality | balanced]]] = js.undefined
  var textContentType: js.UndefOr[
    RecursivePartial[
      js.UndefOr[
        none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
      ]
    ]
  ] = js.undefined
  var tvParallaxMagnification: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var tvParallaxProperties: js.UndefOr[RecursivePartial[js.UndefOr[TVParallaxProperties]]] = js.undefined
  var tvParallaxShiftDistanceX: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var tvParallaxShiftDistanceY: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var tvParallaxTiltAngle: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var underlineColorAndroid: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var value: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
}

object RecursivePartialPartialIn {
  @scala.inline
  def apply(
    accessibilityActions: RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]] = null,
    accessibilityComponentType: RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]] = null,
    accessibilityElementsHidden: RecursivePartial[js.UndefOr[Boolean]] = null,
    accessibilityHint: RecursivePartial[js.UndefOr[String]] = null,
    accessibilityIgnoresInvertColors: RecursivePartial[js.UndefOr[Boolean]] = null,
    accessibilityLabel: RecursivePartial[js.UndefOr[String]] = null,
    accessibilityLiveRegion: RecursivePartial[js.UndefOr[none | polite | assertive]] = null,
    accessibilityRole: RecursivePartial[js.UndefOr[AccessibilityRole]] = null,
    accessibilityState: RecursivePartial[js.UndefOr[AccessibilityState]] = null,
    accessibilityStates: RecursivePartial[js.UndefOr[js.Array[AccessibilityStates]]] = null,
    accessibilityTraits: RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]] = null,
    accessibilityViewIsModal: RecursivePartial[js.UndefOr[Boolean]] = null,
    accessible: RecursivePartial[js.UndefOr[Boolean]] = null,
    allowFontScaling: RecursivePartial[js.UndefOr[Boolean]] = null,
    autoCapitalize: RecursivePartial[js.UndefOr[none | sentences | words | characters]] = null,
    autoCompleteType: RecursivePartial[
      js.UndefOr[
        `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off
      ]
    ] = null,
    autoCorrect: RecursivePartial[js.UndefOr[Boolean]] = null,
    autoFocus: RecursivePartial[js.UndefOr[Boolean]] = null,
    blurOnSubmit: RecursivePartial[js.UndefOr[Boolean]] = null,
    caretHidden: RecursivePartial[js.UndefOr[Boolean]] = null,
    clearButtonMode: RecursivePartial[js.UndefOr[never | `while-editing` | `unless-editing` | always]] = null,
    clearTextOnFocus: RecursivePartial[js.UndefOr[Boolean]] = null,
    collapsable: RecursivePartial[js.UndefOr[Boolean]] = null,
    containerStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    contextMenuHidden: RecursivePartial[js.UndefOr[Boolean]] = null,
    dataDetectorTypes: RecursivePartial[js.UndefOr[DataDetectorTypes | js.Array[DataDetectorTypes]]] = null,
    defaultValue: RecursivePartial[js.UndefOr[String]] = null,
    disableFullscreenUI: RecursivePartial[js.UndefOr[Boolean]] = null,
    disabled: RecursivePartial[js.UndefOr[Boolean]] = null,
    disabledInputStyle: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]] = null,
    editable: RecursivePartial[js.UndefOr[Boolean]] = null,
    enablesReturnKeyAutomatically: RecursivePartial[js.UndefOr[Boolean]] = null,
    errorMessage: RecursivePartial[js.UndefOr[String]] = null,
    errorProps: RecursivePartial[js.UndefOr[TextProps]] = null,
    errorStyle: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]] = null,
    hasTVPreferredFocus: RecursivePartial[js.UndefOr[Boolean]] = null,
    hitSlop: RecursivePartial[js.UndefOr[Insets]] = null,
    importantForAccessibility: RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]] = null,
    importantForAutofill: RecursivePartial[js.UndefOr[auto | no | noExcludeDescendants | yes | yesExcludeDescendants]] = null,
    inlineImageLeft: RecursivePartial[js.UndefOr[String]] = null,
    inlineImagePadding: RecursivePartial[js.UndefOr[Double]] = null,
    inputAccessoryViewID: RecursivePartial[js.UndefOr[String]] = null,
    inputComponent: RecursivePartial[js.UndefOr[ComponentType[_]]] = null,
    inputContainerStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    inputStyle: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]] = null,
    isTVSelectable: RecursivePartial[js.UndefOr[Boolean]] = null,
    keyboardAppearance: RecursivePartial[js.UndefOr[default | light | dark]] = null,
    keyboardType: RecursivePartial[js.UndefOr[KeyboardTypeOptions]] = null,
    label: RecursivePartial[js.UndefOr[String | Element]] = null,
    labelProps: RecursivePartial[js.UndefOr[TextProps]] = null,
    labelStyle: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]] = null,
    leftIcon: RecursivePartial[js.UndefOr[IconNode]] = null,
    leftIconContainerStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    maxFontSizeMultiplier: RecursivePartial[js.UndefOr[Double]] = null,
    maxLength: RecursivePartial[js.UndefOr[Double]] = null,
    multiline: RecursivePartial[js.UndefOr[Boolean]] = null,
    nativeID: RecursivePartial[js.UndefOr[String]] = null,
    needsOffscreenAlphaCompositing: RecursivePartial[js.UndefOr[Boolean]] = null,
    numberOfLines: RecursivePartial[js.UndefOr[Double]] = null,
    onAccessibilityAction: RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ] = null,
    onAccessibilityEscape: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    onAccessibilityTap: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    onBlur: RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ] = null,
    onChange: RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ] = null,
    onChangeText: RecursivePartial[js.UndefOr[js.Function1[/* text */ String, Unit]]] = null,
    onContentSizeChange: RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ] = null,
    onEndEditing: RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ] = null,
    onFocus: RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ] = null,
    onKeyPress: RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ] = null,
    onLayout: RecursivePartial[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]] = null,
    onMagicTap: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    onMoveShouldSetResponder: RecursivePartial[
      js.UndefOr[
        js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Boolean]
      ]
    ] = null,
    onMoveShouldSetResponderCapture: RecursivePartial[
      js.UndefOr[
        js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Boolean]
      ]
    ] = null,
    onResponderEnd: RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ] = null,
    onResponderGrant: RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ] = null,
    onResponderMove: RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ] = null,
    onResponderReject: RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ] = null,
    onResponderRelease: RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ] = null,
    onResponderStart: RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ] = null,
    onResponderTerminate: RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ] = null,
    onResponderTerminationRequest: RecursivePartial[
      js.UndefOr[
        js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Boolean]
      ]
    ] = null,
    onScroll: RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ] = null,
    onSelectionChange: RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ] = null,
    onStartShouldSetResponder: RecursivePartial[
      js.UndefOr[
        js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Boolean]
      ]
    ] = null,
    onStartShouldSetResponderCapture: RecursivePartial[
      js.UndefOr[
        js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Boolean]
      ]
    ] = null,
    onSubmitEditing: RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ] = null,
    onTouchCancel: RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ] = null,
    onTouchEnd: RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ] = null,
    onTouchEndCapture: RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ] = null,
    onTouchMove: RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ] = null,
    onTouchStart: RecursivePartial[
      js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], Unit]]
    ] = null,
    passwordRules: RecursivePartial[js.UndefOr[String]] = null,
    placeholder: RecursivePartial[js.UndefOr[String]] = null,
    placeholderTextColor: RecursivePartial[js.UndefOr[String]] = null,
    pointerEvents: RecursivePartial[js.UndefOr[`box-none` | none | `box-only` | auto]] = null,
    rejectResponderTermination: RecursivePartial[js.UndefOr[Boolean]] = null,
    removeClippedSubviews: RecursivePartial[js.UndefOr[Boolean]] = null,
    renderToHardwareTextureAndroid: RecursivePartial[js.UndefOr[Boolean]] = null,
    returnKeyLabel: RecursivePartial[js.UndefOr[String]] = null,
    returnKeyType: RecursivePartial[js.UndefOr[ReturnKeyTypeOptions]] = null,
    rightIcon: RecursivePartial[js.UndefOr[IconNode]] = null,
    rightIconContainerStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    scrollEnabled: RecursivePartial[js.UndefOr[Boolean]] = null,
    secureTextEntry: RecursivePartial[js.UndefOr[Boolean]] = null,
    selectTextOnFocus: RecursivePartial[js.UndefOr[Boolean]] = null,
    selection: RecursivePartial[js.UndefOr[AnonStart]] = null,
    selectionColor: RecursivePartial[js.UndefOr[String]] = null,
    selectionState: RecursivePartial[js.UndefOr[DocumentSelectionState]] = null,
    shouldRasterizeIOS: RecursivePartial[js.UndefOr[Boolean]] = null,
    spellCheck: RecursivePartial[js.UndefOr[Boolean]] = null,
    style: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]] = null,
    testID: RecursivePartial[js.UndefOr[String]] = null,
    textAlignVertical: RecursivePartial[js.UndefOr[auto | top | bottom | center]] = null,
    textBreakStrategy: RecursivePartial[js.UndefOr[simple | highQuality | balanced]] = null,
    textContentType: RecursivePartial[
      js.UndefOr[
        none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
      ]
    ] = null,
    tvParallaxMagnification: RecursivePartial[js.UndefOr[Double]] = null,
    tvParallaxProperties: RecursivePartial[js.UndefOr[TVParallaxProperties]] = null,
    tvParallaxShiftDistanceX: RecursivePartial[js.UndefOr[Double]] = null,
    tvParallaxShiftDistanceY: RecursivePartial[js.UndefOr[Double]] = null,
    tvParallaxTiltAngle: RecursivePartial[js.UndefOr[Double]] = null,
    underlineColorAndroid: RecursivePartial[js.UndefOr[String]] = null,
    value: RecursivePartial[js.UndefOr[String]] = null
  ): RecursivePartialPartialIn = {
    val __obj = js.Dynamic.literal()
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (accessibilityElementsHidden != null) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden.asInstanceOf[js.Any])
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint.asInstanceOf[js.Any])
    if (accessibilityIgnoresInvertColors != null) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole.asInstanceOf[js.Any])
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState.asInstanceOf[js.Any])
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates.asInstanceOf[js.Any])
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (accessibilityViewIsModal != null) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal.asInstanceOf[js.Any])
    if (accessible != null) __obj.updateDynamic("accessible")(accessible.asInstanceOf[js.Any])
    if (allowFontScaling != null) __obj.updateDynamic("allowFontScaling")(allowFontScaling.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCompleteType != null) __obj.updateDynamic("autoCompleteType")(autoCompleteType.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoFocus != null) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (blurOnSubmit != null) __obj.updateDynamic("blurOnSubmit")(blurOnSubmit.asInstanceOf[js.Any])
    if (caretHidden != null) __obj.updateDynamic("caretHidden")(caretHidden.asInstanceOf[js.Any])
    if (clearButtonMode != null) __obj.updateDynamic("clearButtonMode")(clearButtonMode.asInstanceOf[js.Any])
    if (clearTextOnFocus != null) __obj.updateDynamic("clearTextOnFocus")(clearTextOnFocus.asInstanceOf[js.Any])
    if (collapsable != null) __obj.updateDynamic("collapsable")(collapsable.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (contextMenuHidden != null) __obj.updateDynamic("contextMenuHidden")(contextMenuHidden.asInstanceOf[js.Any])
    if (dataDetectorTypes != null) __obj.updateDynamic("dataDetectorTypes")(dataDetectorTypes.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (disableFullscreenUI != null) __obj.updateDynamic("disableFullscreenUI")(disableFullscreenUI.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledInputStyle != null) __obj.updateDynamic("disabledInputStyle")(disabledInputStyle.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (enablesReturnKeyAutomatically != null) __obj.updateDynamic("enablesReturnKeyAutomatically")(enablesReturnKeyAutomatically.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (errorProps != null) __obj.updateDynamic("errorProps")(errorProps.asInstanceOf[js.Any])
    if (errorStyle != null) __obj.updateDynamic("errorStyle")(errorStyle.asInstanceOf[js.Any])
    if (hasTVPreferredFocus != null) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (importantForAutofill != null) __obj.updateDynamic("importantForAutofill")(importantForAutofill.asInstanceOf[js.Any])
    if (inlineImageLeft != null) __obj.updateDynamic("inlineImageLeft")(inlineImageLeft.asInstanceOf[js.Any])
    if (inlineImagePadding != null) __obj.updateDynamic("inlineImagePadding")(inlineImagePadding.asInstanceOf[js.Any])
    if (inputAccessoryViewID != null) __obj.updateDynamic("inputAccessoryViewID")(inputAccessoryViewID.asInstanceOf[js.Any])
    if (inputComponent != null) __obj.updateDynamic("inputComponent")(inputComponent.asInstanceOf[js.Any])
    if (inputContainerStyle != null) __obj.updateDynamic("inputContainerStyle")(inputContainerStyle.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (isTVSelectable != null) __obj.updateDynamic("isTVSelectable")(isTVSelectable.asInstanceOf[js.Any])
    if (keyboardAppearance != null) __obj.updateDynamic("keyboardAppearance")(keyboardAppearance.asInstanceOf[js.Any])
    if (keyboardType != null) __obj.updateDynamic("keyboardType")(keyboardType.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelProps != null) __obj.updateDynamic("labelProps")(labelProps.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (leftIconContainerStyle != null) __obj.updateDynamic("leftIconContainerStyle")(leftIconContainerStyle.asInstanceOf[js.Any])
    if (maxFontSizeMultiplier != null) __obj.updateDynamic("maxFontSizeMultiplier")(maxFontSizeMultiplier.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (multiline != null) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (needsOffscreenAlphaCompositing != null) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing.asInstanceOf[js.Any])
    if (numberOfLines != null) __obj.updateDynamic("numberOfLines")(numberOfLines.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(onAccessibilityAction.asInstanceOf[js.Any])
    if (onAccessibilityEscape != null) __obj.updateDynamic("onAccessibilityEscape")(onAccessibilityEscape.asInstanceOf[js.Any])
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(onAccessibilityTap.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(onChangeText.asInstanceOf[js.Any])
    if (onContentSizeChange != null) __obj.updateDynamic("onContentSizeChange")(onContentSizeChange.asInstanceOf[js.Any])
    if (onEndEditing != null) __obj.updateDynamic("onEndEditing")(onEndEditing.asInstanceOf[js.Any])
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus.asInstanceOf[js.Any])
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress.asInstanceOf[js.Any])
    if (onLayout != null) __obj.updateDynamic("onLayout")(onLayout.asInstanceOf[js.Any])
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(onMagicTap.asInstanceOf[js.Any])
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(onMoveShouldSetResponder.asInstanceOf[js.Any])
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(onMoveShouldSetResponderCapture.asInstanceOf[js.Any])
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(onResponderEnd.asInstanceOf[js.Any])
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(onResponderGrant.asInstanceOf[js.Any])
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(onResponderMove.asInstanceOf[js.Any])
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(onResponderReject.asInstanceOf[js.Any])
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(onResponderRelease.asInstanceOf[js.Any])
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(onResponderStart.asInstanceOf[js.Any])
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(onResponderTerminate.asInstanceOf[js.Any])
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(onResponderTerminationRequest.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll.asInstanceOf[js.Any])
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(onSelectionChange.asInstanceOf[js.Any])
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(onStartShouldSetResponder.asInstanceOf[js.Any])
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(onStartShouldSetResponderCapture.asInstanceOf[js.Any])
    if (onSubmitEditing != null) __obj.updateDynamic("onSubmitEditing")(onSubmitEditing.asInstanceOf[js.Any])
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel.asInstanceOf[js.Any])
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd.asInstanceOf[js.Any])
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(onTouchEndCapture.asInstanceOf[js.Any])
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove.asInstanceOf[js.Any])
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart.asInstanceOf[js.Any])
    if (passwordRules != null) __obj.updateDynamic("passwordRules")(passwordRules.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (placeholderTextColor != null) __obj.updateDynamic("placeholderTextColor")(placeholderTextColor.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (rejectResponderTermination != null) __obj.updateDynamic("rejectResponderTermination")(rejectResponderTermination.asInstanceOf[js.Any])
    if (removeClippedSubviews != null) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    if (renderToHardwareTextureAndroid != null) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid.asInstanceOf[js.Any])
    if (returnKeyLabel != null) __obj.updateDynamic("returnKeyLabel")(returnKeyLabel.asInstanceOf[js.Any])
    if (returnKeyType != null) __obj.updateDynamic("returnKeyType")(returnKeyType.asInstanceOf[js.Any])
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon.asInstanceOf[js.Any])
    if (rightIconContainerStyle != null) __obj.updateDynamic("rightIconContainerStyle")(rightIconContainerStyle.asInstanceOf[js.Any])
    if (scrollEnabled != null) __obj.updateDynamic("scrollEnabled")(scrollEnabled.asInstanceOf[js.Any])
    if (secureTextEntry != null) __obj.updateDynamic("secureTextEntry")(secureTextEntry.asInstanceOf[js.Any])
    if (selectTextOnFocus != null) __obj.updateDynamic("selectTextOnFocus")(selectTextOnFocus.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor.asInstanceOf[js.Any])
    if (selectionState != null) __obj.updateDynamic("selectionState")(selectionState.asInstanceOf[js.Any])
    if (shouldRasterizeIOS != null) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS.asInstanceOf[js.Any])
    if (spellCheck != null) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[RecursivePartialPartialIn]
  }
}

