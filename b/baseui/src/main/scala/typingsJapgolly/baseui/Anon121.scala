package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.MW
import typingsJapgolly.baseui.baseuiStrings.Malawi
import typingsJapgolly.baseui.baseuiStrings.Plussign265
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon121 extends js.Object {
  var dialCode: Plussign265
  var id: MW
  var label: Malawi
}

object Anon121 {
  @scala.inline
  def apply(dialCode: Plussign265, id: MW, label: Malawi): Anon121 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon121]
  }
}

