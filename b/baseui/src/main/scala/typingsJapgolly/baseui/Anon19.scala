package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.BO
import typingsJapgolly.baseui.baseuiStrings.Bolivia
import typingsJapgolly.baseui.baseuiStrings.Plussign591
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon19 extends js.Object {
  var dialCode: Plussign591
  var id: BO
  var label: Bolivia
}

object Anon19 {
  @scala.inline
  def apply(dialCode: Plussign591, id: BO, label: Bolivia): Anon19 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon19]
  }
}

