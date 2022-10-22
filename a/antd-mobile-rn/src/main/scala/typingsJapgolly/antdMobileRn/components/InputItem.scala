package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.URL
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`birthdate-day`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`birthdate-full`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`birthdate-month`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`birthdate-year`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`box-none`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`box-only`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`cc-csc`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`cc-exp-day`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`cc-exp-month`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`cc-exp-year`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`cc-exp`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`cc-number`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`name-family`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`name-given`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`name-middle-initial`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`name-middle`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`name-prefix`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`name-suffix`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`no-hide-descendants`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`password-new`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`postal-address-country`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`postal-address-extended-postal-code`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`postal-address-extended`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`postal-address-locality`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`postal-address-region`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`postal-address`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`postal-code`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`sms-otp`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`street-address`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`tel-country-code`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`tel-device`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`tel-national`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`unless-editing`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`username-new`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.`while-editing`
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.addressCity
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.addressCityAndState
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.addressState
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.always
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.assertive
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.auto
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.balanced
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.bankCard
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.bottom
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.center
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.characters
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.countryName
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.creditCardNumber
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.dark
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.default
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.digit
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.email
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.emailAddress
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.familyName
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.fullStreetAddress
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.gender
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.givenName
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.highQuality
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.jobTitle
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.left
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
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.number
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.off
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.oneTimeCode
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.organizationName
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.password
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.phone
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.polite
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.postalCode
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.sentences
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.simple
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.streetAddressLine1
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.streetAddressLine2
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.sublocality
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.tel
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.telephoneNumber
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.text
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.top
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.username
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.words
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.yes
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.yesExcludeDescendants
import typingsJapgolly.antdMobileRn.libInputItemIndexDotnativeMod.InputItemProps
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
import typingsJapgolly.reactNative.mod.PointerEvent
import typingsJapgolly.reactNative.mod.ReturnKeyTypeOptions
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.TextInputContentSizeChangeEventData
import typingsJapgolly.reactNative.mod.TextInputEndEditingEventData
import typingsJapgolly.reactNative.mod.TextInputKeyPressEventData
import typingsJapgolly.reactNative.mod.TextInputScrollEventData
import typingsJapgolly.reactNative.mod.TextInputSelectionChangeEventData
import typingsJapgolly.reactNative.mod.TextInputSubmitEditingEventData
import typingsJapgolly.reactNative.mod.TextInputTextInputEventData
import typingsJapgolly.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InputItem {
  
  @JSImport("antd-mobile-rn", "InputItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antdMobileRn.mod.InputItem] {
    
    inline def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
    
    inline def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value*))
    
    inline def accessibilityElementsHidden(value: Boolean): this.type = set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def accessibilityHint(value: String): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def accessibilityIgnoresInvertColors(value: Boolean): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabelledBy(value: String | js.Array[String]): this.type = set("accessibilityLabelledBy", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabelledByVarargs(value: String*): this.type = set("accessibilityLabelledBy", js.Array(value*))
    
    inline def accessibilityLanguage(value: String): this.type = set("accessibilityLanguage", value.asInstanceOf[js.Any])
    
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
    
    inline def clear(value: Boolean): this.type = set("clear", value.asInstanceOf[js.Any])
    
    inline def clearButtonMode(value: never | `while-editing` | `unless-editing` | always): this.type = set("clearButtonMode", value.asInstanceOf[js.Any])
    
    inline def clearTextOnFocus(value: Boolean): this.type = set("clearTextOnFocus", value.asInstanceOf[js.Any])
    
    inline def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
    
    inline def contextMenuHidden(value: Boolean): this.type = set("contextMenuHidden", value.asInstanceOf[js.Any])
    
    inline def cursorColor(value: ColorValue): this.type = set("cursorColor", value.asInstanceOf[js.Any])
    
    inline def cursorColorNull: this.type = set("cursorColor", null)
    
    inline def dataDetectorTypes(value: DataDetectorTypes | js.Array[DataDetectorTypes]): this.type = set("dataDetectorTypes", value.asInstanceOf[js.Any])
    
    inline def dataDetectorTypesVarargs(value: DataDetectorTypes*): this.type = set("dataDetectorTypes", js.Array(value*))
    
    inline def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def disableFullscreenUI(value: Boolean): this.type = set("disableFullscreenUI", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def editable(value: Boolean): this.type = set("editable", value.asInstanceOf[js.Any])
    
    inline def enablesReturnKeyAutomatically(value: Boolean): this.type = set("enablesReturnKeyAutomatically", value.asInstanceOf[js.Any])
    
    inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def extra(value: VdomNode): this.type = set("extra", value.rawNode.asInstanceOf[js.Any])
    
    inline def extraNull: this.type = set("extra", null)
    
    inline def extraVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("extra", js.Array(value*))
    
    inline def extraVdomElement(value: VdomElement): this.type = set("extra", value.rawElement.asInstanceOf[js.Any])
    
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
    
    inline def labelNumber(value: Double): this.type = set("labelNumber", value.asInstanceOf[js.Any])
    
    inline def labelPosition(value: left | top): this.type = set("labelPosition", value.asInstanceOf[js.Any])
    
    inline def last(value: Boolean): this.type = set("last", value.asInstanceOf[js.Any])
    
    inline def locale(value: js.Object): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def maxFontSizeMultiplier(value: Double): this.type = set("maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    inline def maxFontSizeMultiplierNull: this.type = set("maxFontSizeMultiplier", null)
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    inline def multiline(value: Boolean): this.type = set("multiline", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    inline def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    inline def numberOfLines(value: Double): this.type = set("numberOfLines", value.asInstanceOf[js.Any])
    
    inline def onAccessibilityAction(value: /* event */ AccessibilityActionEvent => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: /* event */ AccessibilityActionEvent) => value(t0).runNow()))
    
    inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
    
    inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
    
    inline def onBlur(value: /* value */ js.UndefOr[String] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: /* value */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def onChange(value: /* value */ String => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def onChangeText(value: /* text */ String => Callback): this.type = set("onChangeText", js.Any.fromFunction1((t0: /* text */ String) => value(t0).runNow()))
    
    inline def onContentSizeChange(value: /* e */ NativeSyntheticEvent[TextInputContentSizeChangeEventData] => Callback): this.type = set("onContentSizeChange", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TextInputContentSizeChangeEventData]) => value(t0).runNow()))
    
    inline def onEndEditing(value: /* e */ NativeSyntheticEvent[TextInputEndEditingEventData] => Callback): this.type = set("onEndEditing", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TextInputEndEditingEventData]) => value(t0).runNow()))
    
    inline def onErrorClick(value: /* event */ GestureResponderEvent => Callback): this.type = set("onErrorClick", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onExtraClick(value: /* event */ GestureResponderEvent => Callback): this.type = set("onExtraClick", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onFocus(value: /* value */ js.UndefOr[String] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* value */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def onKeyPress(value: /* e */ NativeSyntheticEvent[TextInputKeyPressEventData] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TextInputKeyPressEventData]) => value(t0).runNow()))
    
    inline def onLayout(value: /* event */ LayoutChangeEvent => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
    
    inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
    
    inline def onMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def onMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def onPointerCancel(value: /* event */ PointerEvent => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerCancelCapture(value: /* event */ PointerEvent => Callback): this.type = set("onPointerCancelCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerDown(value: /* event */ PointerEvent => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerDownCapture(value: /* event */ PointerEvent => Callback): this.type = set("onPointerDownCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerEnter(value: /* event */ PointerEvent => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerEnterCapture(value: /* event */ PointerEvent => Callback): this.type = set("onPointerEnterCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerLeave(value: /* event */ PointerEvent => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerLeaveCapture(value: /* event */ PointerEvent => Callback): this.type = set("onPointerLeaveCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerMove(value: /* event */ PointerEvent => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerMoveCapture(value: /* event */ PointerEvent => Callback): this.type = set("onPointerMoveCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerUp(value: /* event */ PointerEvent => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerUpCapture(value: /* event */ PointerEvent => Callback): this.type = set("onPointerUpCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
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
    
    inline def onVirtualKeyboardConfirm(value: /* value */ js.UndefOr[String] => Callback): this.type = set("onVirtualKeyboardConfirm", js.Any.fromFunction1((t0: /* value */ js.UndefOr[String]) => value(t0).runNow()))
    
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
    
    inline def styles(value: Any): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def textAlign(value: left | center): this.type = set("textAlign", value.asInstanceOf[js.Any])
    
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
    
    inline def `type`(value: text | bankCard | phone | password | number | digit): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def underlineColorAndroid(value: ColorValue): this.type = set("underlineColorAndroid", value.asInstanceOf[js.Any])
    
    inline def updatePlaceholder(value: Boolean): this.type = set("updatePlaceholder", value.asInstanceOf[js.Any])
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InputItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InputItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
