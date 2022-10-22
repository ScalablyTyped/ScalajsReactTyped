package typingsJapgolly.reactNativePaper.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.anon.End
import typingsJapgolly.reactNative.mod.AccessibilityActionEvent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.ColorValue
import typingsJapgolly.reactNative.mod.DataDetectorTypes
import typingsJapgolly.reactNative.mod.DocumentSelectionState
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.KeyboardTypeOptions
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNative.mod.NativeTouchEvent
import typingsJapgolly.reactNative.mod.ReturnKeyTypeOptions
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.TextInputChangeEventData
import typingsJapgolly.reactNative.mod.TextInputContentSizeChangeEventData
import typingsJapgolly.reactNative.mod.TextInputEndEditingEventData
import typingsJapgolly.reactNative.mod.TextInputFocusEventData
import typingsJapgolly.reactNative.mod.TextInputKeyPressEventData
import typingsJapgolly.reactNative.mod.TextInputScrollEventData
import typingsJapgolly.reactNative.mod.TextInputSelectionChangeEventData
import typingsJapgolly.reactNative.mod.TextInputSubmitEditingEventData
import typingsJapgolly.reactNative.mod.TextInputTextInputEventData
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNativePaper.anon.DeepPartialTheme
import typingsJapgolly.reactNativePaper.anon.PickTextInputPropsRefAttr
import typingsJapgolly.reactNativePaper.libTypescriptComponentsTextInputTypesMod.RenderProps
import typingsJapgolly.reactNativePaper.libTypescriptComponentsTextInputTypesMod.TextInputLabelProp
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.URL
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`birthdate-day`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`birthdate-full`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`birthdate-month`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`birthdate-year`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`box-none`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`box-only`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`cc-csc`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`cc-exp-day`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`cc-exp-month`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`cc-exp-year`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`cc-exp`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`cc-number`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`name-family`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`name-given`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`name-middle-initial`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`name-middle`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`name-prefix`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`name-suffix`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`no-hide-descendants`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`password-new`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`postal-address-country`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`postal-address-extended-postal-code`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`postal-address-extended`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`postal-address-locality`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`postal-address-region`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`postal-address`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`postal-code`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`sms-otp`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`street-address`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`tel-country-code`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`tel-device`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`tel-national`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`unless-editing`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`username-new`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.`while-editing`
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.addressCity
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.addressCityAndState
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.addressState
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.always
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.assertive
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.auto
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.balanced
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.bottom
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.center
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.characters
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.countryName
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.creditCardNumber
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.dark
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.default
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.email
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.emailAddress
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.familyName
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.flat
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.fullStreetAddress
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.gender
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.givenName
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.highQuality
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.jobTitle
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.left
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.light
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.location
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.middleName
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.name
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.namePrefix
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.nameSuffix
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.never
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.newPassword
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.nickname
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.no
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.noExcludeDescendants
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.none
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.off
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.oneTimeCode
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.organizationName
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.outlined
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.password
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.polite
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.postalCode
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.right
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.sentences
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.simple
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.streetAddressLine1
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.streetAddressLine2
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.sublocality
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.tel
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.telephoneNumber
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.top
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.username
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.words
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.yes
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.yesExcludeDescendants
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextInput {
  
  @JSImport("react-native-paper", "TextInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNative.mod.TextInput] {
    
    inline def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
    
    inline def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value*))
    
    inline def accessibilityElementsHidden(value: Boolean): this.type = set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def accessibilityHint(value: String): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def accessibilityIgnoresInvertColors(value: Boolean): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def accessibilityLiveRegion(value: none | polite | assertive): this.type = set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    inline def accessibilityRole(value: AccessibilityRole): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
    
    inline def accessibilityState(value: AccessibilityState): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
    
    inline def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
    
    inline def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    inline def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    
    inline def activeOutlineColor(value: String): this.type = set("activeOutlineColor", value.asInstanceOf[js.Any])
    
    inline def activeUnderlineColor(value: String): this.type = set("activeUnderlineColor", value.asInstanceOf[js.Any])
    
    inline def allowFontScaling(value: Boolean): this.type = set("allowFontScaling", value.asInstanceOf[js.Any])
    
    inline def autoCapitalize(value: none | sentences | words | characters): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def autoComplete(
      value: `birthdate-day` | `birthdate-full` | `birthdate-month` | `birthdate-year` | `cc-csc` | `cc-exp` | `cc-exp-day` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | gender | name | `name-family` | `name-given` | `name-middle` | `name-middle-initial` | `name-prefix` | `name-suffix` | password | `password-new` | `postal-address` | `postal-address-country` | `postal-address-extended` | `postal-address-extended-postal-code` | `postal-address-locality` | `postal-address-region` | `postal-code` | `street-address` | `sms-otp` | tel | `tel-country-code` | `tel-national` | `tel-device` | username | `username-new` | off
    ): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    
    inline def autoCorrect(value: Boolean): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def blurOnSubmit(value: Boolean): this.type = set("blurOnSubmit", value.asInstanceOf[js.Any])
    
    inline def caretHidden(value: Boolean): this.type = set("caretHidden", value.asInstanceOf[js.Any])
    
    inline def clearButtonMode(value: never | `while-editing` | `unless-editing` | always): this.type = set("clearButtonMode", value.asInstanceOf[js.Any])
    
    inline def clearTextOnFocus(value: Boolean): this.type = set("clearTextOnFocus", value.asInstanceOf[js.Any])
    
    inline def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
    
    inline def contextMenuHidden(value: Boolean): this.type = set("contextMenuHidden", value.asInstanceOf[js.Any])
    
    inline def dataDetectorTypes(value: DataDetectorTypes | js.Array[DataDetectorTypes]): this.type = set("dataDetectorTypes", value.asInstanceOf[js.Any])
    
    inline def dataDetectorTypesVarargs(value: DataDetectorTypes*): this.type = set("dataDetectorTypes", js.Array(value*))
    
    inline def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def dense(value: Boolean): this.type = set("dense", value.asInstanceOf[js.Any])
    
    inline def disableFullscreenUI(value: Boolean): this.type = set("disableFullscreenUI", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def editable(value: Boolean): this.type = set("editable", value.asInstanceOf[js.Any])
    
    inline def enablesReturnKeyAutomatically(value: Boolean): this.type = set("enablesReturnKeyAutomatically", value.asInstanceOf[js.Any])
    
    inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    inline def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    inline def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def importantForAutofill(value: auto | no | noExcludeDescendants | yes | yesExcludeDescendants): this.type = set("importantForAutofill", value.asInstanceOf[js.Any])
    
    inline def inlineImageLeft(value: String): this.type = set("inlineImageLeft", value.asInstanceOf[js.Any])
    
    inline def inlineImagePadding(value: Double): this.type = set("inlineImagePadding", value.asInstanceOf[js.Any])
    
    inline def inputAccessoryViewID(value: String): this.type = set("inputAccessoryViewID", value.asInstanceOf[js.Any])
    
    inline def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
    
    inline def keyboardAppearance(value: default | light | dark): this.type = set("keyboardAppearance", value.asInstanceOf[js.Any])
    
    inline def keyboardType(value: KeyboardTypeOptions): this.type = set("keyboardType", value.asInstanceOf[js.Any])
    
    inline def label(value: TextInputLabelProp): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def left(value: VdomNode): this.type = set("left", value.rawNode.asInstanceOf[js.Any])
    
    inline def leftNull: this.type = set("left", null)
    
    inline def leftVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("left", js.Array(value*))
    
    inline def leftVdomElement(value: VdomElement): this.type = set("left", value.rawElement.asInstanceOf[js.Any])
    
    inline def maxFontSizeMultiplier(value: Double): this.type = set("maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    inline def maxFontSizeMultiplierNull: this.type = set("maxFontSizeMultiplier", null)
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    inline def mode(value: flat | outlined): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def multiline(value: Boolean): this.type = set("multiline", value.asInstanceOf[js.Any])
    
    inline def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    inline def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    inline def numberOfLines(value: Double): this.type = set("numberOfLines", value.asInstanceOf[js.Any])
    
    inline def onAccessibilityAction(value: /* event */ AccessibilityActionEvent => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: /* event */ AccessibilityActionEvent) => value(t0).runNow()))
    
    inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
    
    inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
    
    inline def onBlur(value: /* e */ NativeSyntheticEvent[TextInputFocusEventData] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TextInputFocusEventData]) => value(t0).runNow()))
    
    inline def onChange(value: /* e */ NativeSyntheticEvent[TextInputChangeEventData] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TextInputChangeEventData]) => value(t0).runNow()))
    
    inline def onChangeText(value: /* text */ String => Callback): this.type = set("onChangeText", js.Any.fromFunction1((t0: /* text */ String) => value(t0).runNow()))
    
    inline def onContentSizeChange(value: /* e */ NativeSyntheticEvent[TextInputContentSizeChangeEventData] => Callback): this.type = set("onContentSizeChange", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TextInputContentSizeChangeEventData]) => value(t0).runNow()))
    
    inline def onEndEditing(value: /* e */ NativeSyntheticEvent[TextInputEndEditingEventData] => Callback): this.type = set("onEndEditing", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TextInputEndEditingEventData]) => value(t0).runNow()))
    
    inline def onFocus(value: /* e */ NativeSyntheticEvent[TextInputFocusEventData] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TextInputFocusEventData]) => value(t0).runNow()))
    
    inline def onKeyPress(value: /* e */ NativeSyntheticEvent[TextInputKeyPressEventData] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TextInputKeyPressEventData]) => value(t0).runNow()))
    
    inline def onLayout(value: /* event */ LayoutChangeEvent => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
    
    inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
    
    inline def onMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def onMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def onPressIn(value: /* e */ NativeSyntheticEvent[NativeTouchEvent] => Callback): this.type = set("onPressIn", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[NativeTouchEvent]) => value(t0).runNow()))
    
    inline def onPressOut(value: /* e */ NativeSyntheticEvent[NativeTouchEvent] => Callback): this.type = set("onPressOut", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[NativeTouchEvent]) => value(t0).runNow()))
    
    inline def onResponderEnd(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderEnd", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderGrant(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderGrant", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderMove(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderMove", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderReject(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderReject", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderRelease(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderRelease", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderStart(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderStart", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderTerminate(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderTerminate", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderTerminationRequest(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    inline def onScroll(value: /* e */ NativeSyntheticEvent[TextInputScrollEventData] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TextInputScrollEventData]) => value(t0).runNow()))
    
    inline def onSelectionChange(value: /* e */ NativeSyntheticEvent[TextInputSelectionChangeEventData] => Callback): this.type = set("onSelectionChange", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TextInputSelectionChangeEventData]) => value(t0).runNow()))
    
    inline def onStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def onStartShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def onSubmitEditing(value: /* e */ NativeSyntheticEvent[TextInputSubmitEditingEventData] => Callback): this.type = set("onSubmitEditing", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TextInputSubmitEditingEventData]) => value(t0).runNow()))
    
    inline def onTextInput(value: /* e */ NativeSyntheticEvent[TextInputTextInputEventData] => Callback): this.type = set("onTextInput", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TextInputTextInputEventData]) => value(t0).runNow()))
    
    inline def onTouchCancel(value: /* event */ GestureResponderEvent => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onTouchEnd(value: /* event */ GestureResponderEvent => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onTouchEndCapture(value: /* event */ GestureResponderEvent => Callback): this.type = set("onTouchEndCapture", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onTouchMove(value: /* event */ GestureResponderEvent => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onTouchStart(value: /* event */ GestureResponderEvent => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def outlineColor(value: String): this.type = set("outlineColor", value.asInstanceOf[js.Any])
    
    inline def passwordRules(value: String): this.type = set("passwordRules", value.asInstanceOf[js.Any])
    
    inline def passwordRulesNull: this.type = set("passwordRules", null)
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def placeholderTextColor(value: ColorValue): this.type = set("placeholderTextColor", value.asInstanceOf[js.Any])
    
    inline def pointerEvents(value: `box-none` | none | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    inline def rejectResponderTermination(value: Boolean): this.type = set("rejectResponderTermination", value.asInstanceOf[js.Any])
    
    inline def rejectResponderTerminationNull: this.type = set("rejectResponderTermination", null)
    
    inline def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def render(value: /* props */ RenderProps => Node): this.type = set("render", js.Any.fromFunction1(value))
    
    inline def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    inline def returnKeyLabel(value: String): this.type = set("returnKeyLabel", value.asInstanceOf[js.Any])
    
    inline def returnKeyType(value: ReturnKeyTypeOptions): this.type = set("returnKeyType", value.asInstanceOf[js.Any])
    
    inline def right(value: VdomNode): this.type = set("right", value.rawNode.asInstanceOf[js.Any])
    
    inline def rightNull: this.type = set("right", null)
    
    inline def rightVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("right", js.Array(value*))
    
    inline def rightVdomElement(value: VdomElement): this.type = set("right", value.rawElement.asInstanceOf[js.Any])
    
    inline def scrollEnabled(value: Boolean): this.type = set("scrollEnabled", value.asInstanceOf[js.Any])
    
    inline def secureTextEntry(value: Boolean): this.type = set("secureTextEntry", value.asInstanceOf[js.Any])
    
    inline def selectTextOnFocus(value: Boolean): this.type = set("selectTextOnFocus", value.asInstanceOf[js.Any])
    
    inline def selection(value: End): this.type = set("selection", value.asInstanceOf[js.Any])
    
    inline def selectionColor(value: ColorValue): this.type = set("selectionColor", value.asInstanceOf[js.Any])
    
    inline def selectionState(value: DocumentSelectionState): this.type = set("selectionState", value.asInstanceOf[js.Any])
    
    inline def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    inline def showSoftInputOnFocus(value: Boolean): this.type = set("showSoftInputOnFocus", value.asInstanceOf[js.Any])
    
    inline def spellCheck(value: Boolean): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[TextStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def textAlign(value: left | center | right): this.type = set("textAlign", value.asInstanceOf[js.Any])
    
    inline def textAlignVertical(value: auto | top | bottom | center): this.type = set("textAlignVertical", value.asInstanceOf[js.Any])
    
    inline def textBreakStrategy(value: simple | highQuality | balanced): this.type = set("textBreakStrategy", value.asInstanceOf[js.Any])
    
    inline def textContentType(
      value: none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
    ): this.type = set("textContentType", value.asInstanceOf[js.Any])
    
    inline def theme(value: DeepPartialTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    inline def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    inline def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    inline def underlineColor(value: String): this.type = set("underlineColor", value.asInstanceOf[js.Any])
    
    inline def underlineColorAndroid(value: ColorValue): this.type = set("underlineColorAndroid", value.asInstanceOf[js.Any])
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TextInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PickTextInputPropsRefAttr): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
