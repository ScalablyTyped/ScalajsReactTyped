package typingsJapgolly.reactNative.mod

import typingsJapgolly.reactNative.reactNativeStrings.`cc-csc`
import typingsJapgolly.reactNative.reactNativeStrings.`cc-exp-month`
import typingsJapgolly.reactNative.reactNativeStrings.`cc-exp-year`
import typingsJapgolly.reactNative.reactNativeStrings.`cc-exp`
import typingsJapgolly.reactNative.reactNativeStrings.`cc-number`
import typingsJapgolly.reactNative.reactNativeStrings.`postal-code`
import typingsJapgolly.reactNative.reactNativeStrings.`street-address`
import typingsJapgolly.reactNative.reactNativeStrings.auto
import typingsJapgolly.reactNative.reactNativeStrings.balanced
import typingsJapgolly.reactNative.reactNativeStrings.bottom
import typingsJapgolly.reactNative.reactNativeStrings.center
import typingsJapgolly.reactNative.reactNativeStrings.email
import typingsJapgolly.reactNative.reactNativeStrings.highQuality
import typingsJapgolly.reactNative.reactNativeStrings.name
import typingsJapgolly.reactNative.reactNativeStrings.no
import typingsJapgolly.reactNative.reactNativeStrings.noExcludeDescendants
import typingsJapgolly.reactNative.reactNativeStrings.off
import typingsJapgolly.reactNative.reactNativeStrings.password
import typingsJapgolly.reactNative.reactNativeStrings.simple
import typingsJapgolly.reactNative.reactNativeStrings.tel
import typingsJapgolly.reactNative.reactNativeStrings.top
import typingsJapgolly.reactNative.reactNativeStrings.username
import typingsJapgolly.reactNative.reactNativeStrings.yes
import typingsJapgolly.reactNative.reactNativeStrings.yesExcludeDescendants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputAndroidProps extends js.Object {
  /**
    * Determines which content to suggest on auto complete, e.g.`username`.
    * To disable auto complete, use `off`.
    *
    * *Android Only*
    *
    * The following values work on Android only:
    *
    * - `username`
    * - `password`
    * - `email`
    * - `name`
    * - `tel`
    * - `street-address`
    * - `postal-code`
    * - `cc-number`
    * - `cc-csc`
    * - `cc-exp`
    * - `cc-exp-month`
    * - `cc-exp-year`
    * - `off`
    */
  var autoCompleteType: js.UndefOr[
    `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off
  ] = js.undefined
  /**
    * When false, if there is a small amount of space available around a text input (e.g. landscape orientation on a phone),
    *   the OS may choose to have the user edit the text inside of a full screen text input mode.
    * When true, this feature is disabled and users will always edit the text directly inside of the text input.
    * Defaults to false.
    */
  var disableFullscreenUI: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines whether the individual fields in your app should be included in a
    * view structure for autofill purposes on Android API Level 26+. Defaults to auto.
    * To disable auto complete, use `off`.
    *
    * *Android Only*
    *
    * The following values work on Android only:
    *
    * - `auto` - let Android decide
    * - `no` - not important for autofill
    * - `noExcludeDescendants` - this view and its children aren't important for autofill
    * - `yes` - is important for autofill
    * - `yesExcludeDescendants` - this view is important for autofill but its children aren't
    */
  var importantForAutofill: js.UndefOr[auto | no | noExcludeDescendants | yes | yesExcludeDescendants] = js.undefined
  /**
    * If defined, the provided image resource will be rendered on the left.
    */
  var inlineImageLeft: js.UndefOr[String] = js.undefined
  /**
    * Padding between the inline image, if any, and the text input itself.
    */
  var inlineImagePadding: js.UndefOr[Double] = js.undefined
  /**
    * Sets the number of lines for a TextInput.
    * Use it with multiline set to true to be able to fill the lines.
    */
  var numberOfLines: js.UndefOr[Double] = js.undefined
  /**
    * Sets the return key to the label. Use it instead of `returnKeyType`.
    * @platform android
    */
  var returnKeyLabel: js.UndefOr[String] = js.undefined
  /**
    * Vertically align text when `multiline` is set to true
    */
  var textAlignVertical: js.UndefOr[auto | top | bottom | center] = js.undefined
  /**
    * Set text break strategy on Android API Level 23+, possible values are simple, highQuality, balanced
    * The default value is simple.
    */
  var textBreakStrategy: js.UndefOr[simple | highQuality | balanced] = js.undefined
  /**
    * The color of the textInput underline.
    */
  var underlineColorAndroid: js.UndefOr[String] = js.undefined
}

object TextInputAndroidProps {
  @scala.inline
  def apply(
    autoCompleteType: `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off = null,
    disableFullscreenUI: js.UndefOr[Boolean] = js.undefined,
    importantForAutofill: auto | no | noExcludeDescendants | yes | yesExcludeDescendants = null,
    inlineImageLeft: String = null,
    inlineImagePadding: Int | Double = null,
    numberOfLines: Int | Double = null,
    returnKeyLabel: String = null,
    textAlignVertical: auto | top | bottom | center = null,
    textBreakStrategy: simple | highQuality | balanced = null,
    underlineColorAndroid: String = null
  ): TextInputAndroidProps = {
    val __obj = js.Dynamic.literal()
    if (autoCompleteType != null) __obj.updateDynamic("autoCompleteType")(autoCompleteType.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFullscreenUI)) __obj.updateDynamic("disableFullscreenUI")(disableFullscreenUI.asInstanceOf[js.Any])
    if (importantForAutofill != null) __obj.updateDynamic("importantForAutofill")(importantForAutofill.asInstanceOf[js.Any])
    if (inlineImageLeft != null) __obj.updateDynamic("inlineImageLeft")(inlineImageLeft.asInstanceOf[js.Any])
    if (inlineImagePadding != null) __obj.updateDynamic("inlineImagePadding")(inlineImagePadding.asInstanceOf[js.Any])
    if (numberOfLines != null) __obj.updateDynamic("numberOfLines")(numberOfLines.asInstanceOf[js.Any])
    if (returnKeyLabel != null) __obj.updateDynamic("returnKeyLabel")(returnKeyLabel.asInstanceOf[js.Any])
    if (textAlignVertical != null) __obj.updateDynamic("textAlignVertical")(textAlignVertical.asInstanceOf[js.Any])
    if (textBreakStrategy != null) __obj.updateDynamic("textBreakStrategy")(textBreakStrategy.asInstanceOf[js.Any])
    if (underlineColorAndroid != null) __obj.updateDynamic("underlineColorAndroid")(underlineColorAndroid.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputAndroidProps]
  }
}

