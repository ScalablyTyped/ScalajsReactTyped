package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.AS
import typingsJapgolly.baseui.baseuiStrings.Plussign1684
import typingsJapgolly.baseui.baseuiStrings.`American Samoa`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdLabel extends js.Object {
  var dialCode: Plussign1684
  var id: AS
  var label: `American Samoa`
}

object AnonIdLabel {
  @scala.inline
  def apply(dialCode: Plussign1684, id: AS, label: `American Samoa`): AnonIdLabel = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIdLabel]
  }
}

