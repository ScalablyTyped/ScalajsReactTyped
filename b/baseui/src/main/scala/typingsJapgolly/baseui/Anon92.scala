package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.ID
import typingsJapgolly.baseui.baseuiStrings.Indonesia
import typingsJapgolly.baseui.baseuiStrings.Plussign62
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon92 extends js.Object {
  var dialCode: Plussign62
  var id: ID
  var label: Indonesia
}

object Anon92 {
  @scala.inline
  def apply(dialCode: Plussign62, id: ID, label: Indonesia): Anon92 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon92]
  }
}

