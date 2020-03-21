package typingsJapgolly.htmlValidator.mod

import typingsJapgolly.htmlValidator.htmlValidatorStrings.`non-document-error`
import typingsJapgolly.htmlValidator.htmlValidatorStrings.internal
import typingsJapgolly.htmlValidator.htmlValidatorStrings.io
import typingsJapgolly.htmlValidator.htmlValidatorStrings.schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationMessageBasicNonDocumentErrorObject extends js.Object {
  var subType: js.UndefOr[internal | io | schema] = js.undefined
  var `type`: `non-document-error`
}

object ValidationMessageBasicNonDocumentErrorObject {
  @scala.inline
  def apply(`type`: `non-document-error`, subType: internal | io | schema = null): ValidationMessageBasicNonDocumentErrorObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (subType != null) __obj.updateDynamic("subType")(subType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationMessageBasicNonDocumentErrorObject]
  }
}

