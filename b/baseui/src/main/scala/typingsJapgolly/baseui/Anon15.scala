package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.BZ
import typingsJapgolly.baseui.baseuiStrings.Belize
import typingsJapgolly.baseui.baseuiStrings.Plussign501
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon15 extends js.Object {
  var dialCode: Plussign501
  var id: BZ
  var label: Belize
}

object Anon15 {
  @scala.inline
  def apply(dialCode: Plussign501, id: BZ, label: Belize): Anon15 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon15]
  }
}

