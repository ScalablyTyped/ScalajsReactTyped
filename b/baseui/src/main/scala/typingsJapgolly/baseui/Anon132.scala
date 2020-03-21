package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.FM
import typingsJapgolly.baseui.baseuiStrings.Micronesia
import typingsJapgolly.baseui.baseuiStrings.Plussign691
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon132 extends js.Object {
  var dialCode: Plussign691
  var id: FM
  var label: Micronesia
}

object Anon132 {
  @scala.inline
  def apply(dialCode: Plussign691, id: FM, label: Micronesia): Anon132 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon132]
  }
}

