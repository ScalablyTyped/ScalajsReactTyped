package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.GG
import typingsJapgolly.baseui.baseuiStrings.Guernsey
import typingsJapgolly.baseui.baseuiStrings.Plussign44
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon82 extends js.Object {
  var dialCode: Plussign44
  var id: GG
  var label: Guernsey
}

object Anon82 {
  @scala.inline
  def apply(dialCode: Plussign44, id: GG, label: Guernsey): Anon82 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon82]
  }
}

