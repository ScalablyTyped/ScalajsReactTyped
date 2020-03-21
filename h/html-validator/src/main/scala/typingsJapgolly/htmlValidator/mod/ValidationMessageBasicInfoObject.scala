package typingsJapgolly.htmlValidator.mod

import typingsJapgolly.htmlValidator.htmlValidatorStrings.info
import typingsJapgolly.htmlValidator.htmlValidatorStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationMessageBasicInfoObject extends js.Object {
  var subType: js.UndefOr[warning] = js.undefined
  var `type`: info
}

object ValidationMessageBasicInfoObject {
  @scala.inline
  def apply(`type`: info, subType: warning = null): ValidationMessageBasicInfoObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (subType != null) __obj.updateDynamic("subType")(subType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationMessageBasicInfoObject]
  }
}

