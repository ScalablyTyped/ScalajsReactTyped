package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.BB
import typingsJapgolly.baseui.baseuiStrings.Barbados
import typingsJapgolly.baseui.baseuiStrings.Plussign1246
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon12 extends js.Object {
  var dialCode: Plussign1246
  var id: BB
  var label: Barbados
}

object Anon12 {
  @scala.inline
  def apply(dialCode: Plussign1246, id: BB, label: Barbados): Anon12 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon12]
  }
}

