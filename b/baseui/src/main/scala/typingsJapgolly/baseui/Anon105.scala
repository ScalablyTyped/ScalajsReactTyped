package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.KI
import typingsJapgolly.baseui.baseuiStrings.Kiribati
import typingsJapgolly.baseui.baseuiStrings.Plussign686
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon105 extends js.Object {
  var dialCode: Plussign686
  var id: KI
  var label: Kiribati
}

object Anon105 {
  @scala.inline
  def apply(dialCode: Plussign686, id: KI, label: Kiribati): Anon105 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon105]
  }
}

