package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.AD
import typingsJapgolly.baseui.baseuiStrings.Andorra
import typingsJapgolly.baseui.baseuiStrings.Plussign376
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDialCodeIdLabel extends js.Object {
  var dialCode: Plussign376
  var id: AD
  var label: Andorra
}

object AnonDialCodeIdLabel {
  @scala.inline
  def apply(dialCode: Plussign376, id: AD, label: Andorra): AnonDialCodeIdLabel = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDialCodeIdLabel]
  }
}

