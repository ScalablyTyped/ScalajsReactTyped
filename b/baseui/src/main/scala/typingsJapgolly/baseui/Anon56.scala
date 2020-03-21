package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.EC
import typingsJapgolly.baseui.baseuiStrings.Ecuador
import typingsJapgolly.baseui.baseuiStrings.Plussign593
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon56 extends js.Object {
  var dialCode: Plussign593
  var id: EC
  var label: Ecuador
}

object Anon56 {
  @scala.inline
  def apply(dialCode: Plussign593, id: EC, label: Ecuador): Anon56 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon56]
  }
}

