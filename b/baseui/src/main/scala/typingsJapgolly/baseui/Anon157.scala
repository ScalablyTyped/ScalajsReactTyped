package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.PW
import typingsJapgolly.baseui.baseuiStrings.Palau
import typingsJapgolly.baseui.baseuiStrings.Plussign680
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon157 extends js.Object {
  var dialCode: Plussign680
  var id: PW
  var label: Palau
}

object Anon157 {
  @scala.inline
  def apply(dialCode: Plussign680, id: PW, label: Palau): Anon157 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon157]
  }
}

