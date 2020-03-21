package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.ER
import typingsJapgolly.baseui.baseuiStrings.Eritrea
import typingsJapgolly.baseui.baseuiStrings.Plussign291
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon60 extends js.Object {
  var dialCode: Plussign291
  var id: ER
  var label: Eritrea
}

object Anon60 {
  @scala.inline
  def apply(dialCode: Plussign291, id: ER, label: Eritrea): Anon60 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon60]
  }
}

