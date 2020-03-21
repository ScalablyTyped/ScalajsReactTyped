package typingsJapgolly.materialTextfield.helperTextConstantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialBase.foundationMod.MDCStrings
import typingsJapgolly.materialTextfield.materialTextfieldStrings.`mdc-text-field-helper-text--persistent`
import typingsJapgolly.materialTextfield.materialTextfieldStrings.`mdc-text-field-helper-text--validation-msg`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var HELPER_TEXT_PERSISTENT: `mdc-text-field-helper-text--persistent`
  var HELPER_TEXT_VALIDATION_MSG: `mdc-text-field-helper-text--validation-msg`
}

object cssClasses {
  @scala.inline
  def apply(
    HELPER_TEXT_PERSISTENT: `mdc-text-field-helper-text--persistent`,
    HELPER_TEXT_VALIDATION_MSG: `mdc-text-field-helper-text--validation-msg`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(HELPER_TEXT_PERSISTENT = HELPER_TEXT_PERSISTENT.asInstanceOf[js.Any], HELPER_TEXT_VALIDATION_MSG = HELPER_TEXT_VALIDATION_MSG.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

