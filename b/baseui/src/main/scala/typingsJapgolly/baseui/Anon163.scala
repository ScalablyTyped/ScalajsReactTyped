package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.PH
import typingsJapgolly.baseui.baseuiStrings.Philippines
import typingsJapgolly.baseui.baseuiStrings.Plussign63
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon163 extends js.Object {
  var dialCode: Plussign63
  var id: PH
  var label: Philippines
}

object Anon163 {
  @scala.inline
  def apply(dialCode: Plussign63, id: PH, label: Philippines): Anon163 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon163]
  }
}

