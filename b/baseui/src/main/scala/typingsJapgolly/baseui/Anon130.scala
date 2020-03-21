package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.Mayotte
import typingsJapgolly.baseui.baseuiStrings.Plussign262
import typingsJapgolly.baseui.baseuiStrings.YT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon130 extends js.Object {
  var dialCode: Plussign262
  var id: YT
  var label: Mayotte
}

object Anon130 {
  @scala.inline
  def apply(dialCode: Plussign262, id: YT, label: Mayotte): Anon130 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon130]
  }
}

