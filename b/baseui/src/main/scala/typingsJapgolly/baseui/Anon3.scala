package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.AR
import typingsJapgolly.baseui.baseuiStrings.Argentina
import typingsJapgolly.baseui.baseuiStrings.Plussign54
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon3 extends js.Object {
  var dialCode: Plussign54
  var id: AR
  var label: Argentina
}

object Anon3 {
  @scala.inline
  def apply(dialCode: Plussign54, id: AR, label: Argentina): Anon3 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon3]
  }
}

