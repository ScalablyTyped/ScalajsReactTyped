package typingsJapgolly.reactNativeWindows.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeWindows.anon.End
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.URL
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`birthdate-day`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`birthdate-full`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`birthdate-month`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`birthdate-year`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`box-none`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`box-only`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`cc-csc`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`cc-exp-day`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`cc-exp-month`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`cc-exp-year`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`cc-exp`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`cc-number`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`name-family`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`name-given`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`name-middle-initial`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`name-middle`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`name-prefix`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`name-suffix`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`no-hide-descendants`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`password-new`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`postal-address-country`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`postal-address-extended-postal-code`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`postal-address-extended`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`postal-address-locality`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`postal-address-region`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`postal-address`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`postal-code`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`sms-otp`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`street-address`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`tel-country-code`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`tel-device`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`tel-national`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`unless-editing`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`username-new`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`while-editing`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.addressCity
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.addressCityAndState
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.addressState
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.always
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.assertive
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.auto
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.balanced
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.bottom
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.center
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.characters
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.countryName
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.creditCardNumber
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.dark
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.default
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.email
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.emailAddress
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.familyName
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.fullStreetAddress
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.gender
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.givenName
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.highQuality
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.jobTitle
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.left
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.light
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.location
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.middleName
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.name
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.namePrefix
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.nameSuffix
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.never
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.newPassword
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.nickname
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.no
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.noExcludeDescendants
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.none
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.off
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.oneTimeCode
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.organizationName
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.password
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.polite
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.postalCode
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.right
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.sentences
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.simple
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.streetAddressLine1
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.streetAddressLine2
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.sublocality
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.tel
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.telephoneNumber
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.top
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.username
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.words
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.yes
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.yesExcludeDescendants
import typingsJapgolly.reactNativeWindows.rntypesMod.AccessibilityActionInfo
import typingsJapgolly.reactNativeWindows.rntypesMod.AccessibilityRole
import typingsJapgolly.reactNativeWindows.rntypesMod.AccessibilityState
import typingsJapgolly.reactNativeWindows.rntypesMod.AccessibilityValue
import typingsJapgolly.reactNativeWindows.rntypesMod.ColorValue
import typingsJapgolly.reactNativeWindows.rntypesMod.DataDetectorTypes
import typingsJapgolly.reactNativeWindows.rntypesMod.DocumentSelectionState
import typingsJapgolly.reactNativeWindows.rntypesMod.Insets
import typingsJapgolly.reactNativeWindows.rntypesMod.KeyboardTypeOptions
import typingsJapgolly.reactNativeWindows.rntypesMod.NodeHandle
import typingsJapgolly.reactNativeWindows.rntypesMod.ReturnKeyTypeOptions
import typingsJapgolly.reactNativeWindows.rntypesMod.StyleProp
import typingsJapgolly.reactNativeWindows.rntypesMod.TVParallaxProperties
import typingsJapgolly.reactNativeWindows.rntypesMod.TextInputProps
import typingsJapgolly.reactNativeWindows.rntypesMod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextInput {
  
  @JSImport("react-native-windows", "TextInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeWindows.mod.TextInput] {
    
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
    
    inline def disableFullscreenUI(value: Boolean): this.type = set("disableFullscreenUI", value.asInstanceOf[js.Any])
    
    inline def editable(value: Boolean): this.type = set("editable", value.asInstanceOf[js.Any])
    
    inline def enablesReturnKeyAutomatically(value: Boolean): this.type = set("enablesReturnKeyAutomatically", value.asInstanceOf[js.Any])
    
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
    
    inline def maxFontSizeMultiplier(value: Double): this.type = set("maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    inline def maxFontSizeMultiplierNull: this.type = set("maxFontSizeMultiplier", null)
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    inline def multiline(value: Boolean): this.type = set("multiline", value.asInstanceOf[js.Any])
    
    inline def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    inline def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    inline def numberOfLines(value: Double): this.type = set("numberOfLines", value.asInstanceOf[js.Any])
    
    inline def onAccessibilityAction(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
    
    inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
    
    inline def onBlur(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onChange(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onChangeText(value: /* text */ String => Callback): this.type = set("onChangeText", js.Any.fromFunction1((t0: /* text */ String) => value(t0).runNow()))
    
    inline def onContentSizeChange(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onContentSizeChange", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onEndEditing(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onEndEditing", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onFocus(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onKeyPress(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onLayout(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
    
    inline def onMoveShouldSetResponder(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def onMoveShouldSetResponderCapture(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def onPressIn(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPressIn", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPressOut(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPressOut", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onResponderEnd(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderEnd", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onResponderGrant(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderGrant", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onResponderMove(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderMove", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onResponderReject(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderReject", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onResponderRelease(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderRelease", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onResponderStart(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderStart", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onResponderTerminate(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderTerminate", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onResponderTerminationRequest(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    inline def onScroll(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onSelectionChange(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onSelectionChange", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onStartShouldSetResponder(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def onStartShouldSetResponderCapture(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def onSubmitEditing(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onSubmitEditing", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onTextInput(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onTextInput", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onTouchCancel(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onTouchEnd(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onTouchEndCapture(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onTouchEndCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onTouchMove(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onTouchStart(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def passwordRules(value: String): this.type = set("passwordRules", value.asInstanceOf[js.Any])
    
    inline def passwordRulesNull: this.type = set("passwordRules", null)
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def placeholderTextColor(value: ColorValue): this.type = set("placeholderTextColor", value.asInstanceOf[js.Any])
    
    inline def pointerEvents(value: `box-none` | none | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    inline def rejectResponderTermination(value: Boolean): this.type = set("rejectResponderTermination", value.asInstanceOf[js.Any])
    
    inline def rejectResponderTerminationNull: this.type = set("rejectResponderTermination", null)
    
    inline def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    inline def returnKeyLabel(value: String): this.type = set("returnKeyLabel", value.asInstanceOf[js.Any])
    
    inline def returnKeyType(value: ReturnKeyTypeOptions): this.type = set("returnKeyType", value.asInstanceOf[js.Any])
    
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
    
    inline def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    inline def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    inline def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    inline def underlineColorAndroid(value: ColorValue): this.type = set("underlineColorAndroid", value.asInstanceOf[js.Any])
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TextInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TextInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
