package typingsJapgolly.intlMessageformat.mod

import typingsJapgolly.intlMessageformat.intlMessageformatNumbers.`0`
import typingsJapgolly.intlMessageformat.intlMessageformatNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.intlMessageformat.mod.LiteralPart
  - typingsJapgolly.intlMessageformat.mod.ArgumentPart
*/
trait MessageFormatPart extends js.Object

object MessageFormatPart {
  @scala.inline
  def LiteralPart(`type`: `0`, value: String): MessageFormatPart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageFormatPart]
  }
  @scala.inline
  def ArgumentPart(`type`: `1`, value: js.Any): MessageFormatPart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageFormatPart]
  }
}

