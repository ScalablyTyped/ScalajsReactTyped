package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.JM
import typingsJapgolly.baseui.baseuiStrings.Jamaica
import typingsJapgolly.baseui.baseuiStrings.Plussign1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon99 extends js.Object {
  var dialCode: Plussign1
  var id: JM
  var label: Jamaica
}

object Anon99 {
  @scala.inline
  def apply(dialCode: Plussign1, id: JM, label: Jamaica): Anon99 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon99]
  }
}

