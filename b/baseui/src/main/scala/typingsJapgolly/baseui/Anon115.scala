package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.LI
import typingsJapgolly.baseui.baseuiStrings.Liechtenstein
import typingsJapgolly.baseui.baseuiStrings.Plussign423
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon115 extends js.Object {
  var dialCode: Plussign423
  var id: LI
  var label: Liechtenstein
}

object Anon115 {
  @scala.inline
  def apply(dialCode: Plussign423, id: LI, label: Liechtenstein): Anon115 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon115]
  }
}

