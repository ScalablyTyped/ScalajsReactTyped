package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.GP
import typingsJapgolly.baseui.baseuiStrings.Guadeloupe
import typingsJapgolly.baseui.baseuiStrings.Plussign590
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon79 extends js.Object {
  var dialCode: Plussign590
  var id: GP
  var label: Guadeloupe
}

object Anon79 {
  @scala.inline
  def apply(dialCode: Plussign590, id: GP, label: Guadeloupe): Anon79 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon79]
  }
}

