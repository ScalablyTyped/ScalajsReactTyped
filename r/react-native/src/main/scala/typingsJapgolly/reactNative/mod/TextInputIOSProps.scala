package typingsJapgolly.reactNative.mod

import typingsJapgolly.reactNative.reactNativeStrings.URL
import typingsJapgolly.reactNative.reactNativeStrings.`unless-editing`
import typingsJapgolly.reactNative.reactNativeStrings.`while-editing`
import typingsJapgolly.reactNative.reactNativeStrings.addressCity
import typingsJapgolly.reactNative.reactNativeStrings.addressCityAndState
import typingsJapgolly.reactNative.reactNativeStrings.addressState
import typingsJapgolly.reactNative.reactNativeStrings.always
import typingsJapgolly.reactNative.reactNativeStrings.countryName
import typingsJapgolly.reactNative.reactNativeStrings.creditCardNumber
import typingsJapgolly.reactNative.reactNativeStrings.dark
import typingsJapgolly.reactNative.reactNativeStrings.default
import typingsJapgolly.reactNative.reactNativeStrings.emailAddress
import typingsJapgolly.reactNative.reactNativeStrings.familyName
import typingsJapgolly.reactNative.reactNativeStrings.fullStreetAddress
import typingsJapgolly.reactNative.reactNativeStrings.givenName
import typingsJapgolly.reactNative.reactNativeStrings.jobTitle
import typingsJapgolly.reactNative.reactNativeStrings.light
import typingsJapgolly.reactNative.reactNativeStrings.location
import typingsJapgolly.reactNative.reactNativeStrings.middleName
import typingsJapgolly.reactNative.reactNativeStrings.name
import typingsJapgolly.reactNative.reactNativeStrings.namePrefix
import typingsJapgolly.reactNative.reactNativeStrings.nameSuffix
import typingsJapgolly.reactNative.reactNativeStrings.never
import typingsJapgolly.reactNative.reactNativeStrings.newPassword
import typingsJapgolly.reactNative.reactNativeStrings.nickname
import typingsJapgolly.reactNative.reactNativeStrings.none
import typingsJapgolly.reactNative.reactNativeStrings.oneTimeCode
import typingsJapgolly.reactNative.reactNativeStrings.organizationName
import typingsJapgolly.reactNative.reactNativeStrings.password
import typingsJapgolly.reactNative.reactNativeStrings.postalCode
import typingsJapgolly.reactNative.reactNativeStrings.streetAddressLine1
import typingsJapgolly.reactNative.reactNativeStrings.streetAddressLine2
import typingsJapgolly.reactNative.reactNativeStrings.sublocality
import typingsJapgolly.reactNative.reactNativeStrings.telephoneNumber
import typingsJapgolly.reactNative.reactNativeStrings.username
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputIOSProps extends js.Object {
  /**
    * enum('never', 'while-editing', 'unless-editing', 'always')
    * When the clear button should appear on the right side of the text view
    */
  var clearButtonMode: js.UndefOr[never | `while-editing` | `unless-editing` | always] = js.undefined
  /**
    * If true, clears the text field automatically when editing begins
    */
  var clearTextOnFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines the types of data converted to clickable URLs in the text input.
    * Only valid if `multiline={true}` and `editable={false}`.
    * By default no data types are detected.
    *
    * You can provide one type or an array of many types.
    *
    * Possible values for `dataDetectorTypes` are:
    *
    * - `'phoneNumber'`
    * - `'link'`
    * - `'address'`
    * - `'calendarEvent'`
    * - `'none'`
    * - `'all'`
    */
  var dataDetectorTypes: js.UndefOr[DataDetectorTypes | js.Array[DataDetectorTypes]] = js.undefined
  /**
    * If true, the keyboard disables the return key when there is no text and automatically enables it when there is text.
    * The default value is false.
    */
  var enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines the color of the keyboard.
    */
  var keyboardAppearance: js.UndefOr[default | light | dark] = js.undefined
  /**
    * Provide rules for your password.
    * For example, say you want to require a password with at least eight characters consisting of a mix of uppercase and lowercase letters, at least one number, and at most two consecutive characters.
    * "required: upper; required: lower; required: digit; max-consecutive: 2; minlength: 8;"
    */
  var passwordRules: js.UndefOr[String | Null] = js.undefined
  /**
    * If `true`, allows TextInput to pass touch events to the parent component.
    * This allows components to be swipeable from the TextInput on iOS,
    * as is the case on Android by default.
    * If `false`, TextInput always asks to handle the input (except when disabled).
    */
  var rejectResponderTermination: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * If false, scrolling of the text view will be disabled. The default value is true. Only works with multiline={true}
    */
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * See DocumentSelectionState.js, some state that is responsible for maintaining selection information for a document
    */
  var selectionState: js.UndefOr[DocumentSelectionState] = js.undefined
  /**
    * If false, disables spell-check style (i.e. red underlines). The default value is inherited from autoCorrect
    */
  var spellCheck: js.UndefOr[Boolean] = js.undefined
  /**
    * Give the keyboard and the system information about the expected
    * semantic meaning for the content that users enter.
    *
    * For iOS 11+ you can set `textContentType` to `username` or `password` to
    * enable autofill of login details from the device keychain.
    *
    * For iOS 12+ `newPassword` can be used to indicate a new password input the
    * user may want to save in the keychain, and `oneTimeCode` can be used to indicate
    * that a field can be autofilled by a code arriving in an SMS.
    *
    * To disable autofill, set textContentType to `none`.
    *
    * Possible values for `textContentType` are:
    *
    *  - `'none'`
    *  - `'URL'`
    *  - `'addressCity'`
    *  - `'addressCityAndState'`
    *  - `'addressState'`
    *  - `'countryName'`
    *  - `'creditCardNumber'`
    *  - `'emailAddress'`
    *  - `'familyName'`
    *  - `'fullStreetAddress'`
    *  - `'givenName'`
    *  - `'jobTitle'`
    *  - `'location'`
    *  - `'middleName'`
    *  - `'name'`
    *  - `'namePrefix'`
    *  - `'nameSuffix'`
    *  - `'nickname'`
    *  - `'organizationName'`
    *  - `'postalCode'`
    *  - `'streetAddressLine1'`
    *  - `'streetAddressLine2'`
    *  - `'sublocality'`
    *  - `'telephoneNumber'`
    *  - `'username'`
    *  - `'password'`
    *  - `'newPassword'`
    *  - `'oneTimeCode'`
    *
    */
  var textContentType: js.UndefOr[
    none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
  ] = js.undefined
}

object TextInputIOSProps {
  @scala.inline
  def apply(
    clearButtonMode: never | `while-editing` | `unless-editing` | always = null,
    clearTextOnFocus: js.UndefOr[Boolean] = js.undefined,
    dataDetectorTypes: DataDetectorTypes | js.Array[DataDetectorTypes] = null,
    enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.undefined,
    keyboardAppearance: default | light | dark = null,
    passwordRules: String = null,
    rejectResponderTermination: js.UndefOr[Boolean] = js.undefined,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    selectionState: DocumentSelectionState = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    textContentType: none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode = null
  ): TextInputIOSProps = {
    val __obj = js.Dynamic.literal()
    if (clearButtonMode != null) __obj.updateDynamic("clearButtonMode")(clearButtonMode.asInstanceOf[js.Any])
    if (!js.isUndefined(clearTextOnFocus)) __obj.updateDynamic("clearTextOnFocus")(clearTextOnFocus.asInstanceOf[js.Any])
    if (dataDetectorTypes != null) __obj.updateDynamic("dataDetectorTypes")(dataDetectorTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(enablesReturnKeyAutomatically)) __obj.updateDynamic("enablesReturnKeyAutomatically")(enablesReturnKeyAutomatically.asInstanceOf[js.Any])
    if (keyboardAppearance != null) __obj.updateDynamic("keyboardAppearance")(keyboardAppearance.asInstanceOf[js.Any])
    if (passwordRules != null) __obj.updateDynamic("passwordRules")(passwordRules.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectResponderTermination)) __obj.updateDynamic("rejectResponderTermination")(rejectResponderTermination.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled.asInstanceOf[js.Any])
    if (selectionState != null) __obj.updateDynamic("selectionState")(selectionState.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (textContentType != null) __obj.updateDynamic("textContentType")(textContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputIOSProps]
  }
}

