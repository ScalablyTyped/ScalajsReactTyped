package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.HT
import typingsJapgolly.baseui.baseuiStrings.Haiti
import typingsJapgolly.baseui.baseuiStrings.Plussign509
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon86 extends js.Object {
  var dialCode: Plussign509
  var id: HT
  var label: Haiti
}

object Anon86 {
  @scala.inline
  def apply(dialCode: Plussign509, id: HT, label: Haiti): Anon86 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon86]
  }
}

