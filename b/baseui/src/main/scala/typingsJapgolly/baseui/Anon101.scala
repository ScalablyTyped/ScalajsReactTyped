package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.JE
import typingsJapgolly.baseui.baseuiStrings.Jersey
import typingsJapgolly.baseui.baseuiStrings.Plussign44
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon101 extends js.Object {
  var dialCode: Plussign44
  var id: JE
  var label: Jersey
}

object Anon101 {
  @scala.inline
  def apply(dialCode: Plussign44, id: JE, label: Jersey): Anon101 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon101]
  }
}

