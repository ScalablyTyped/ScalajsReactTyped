package typingsJapgolly.remarkable

import typingsJapgolly.remarkable.libMod.InlineParsingRule
import typingsJapgolly.remarkable.rulerMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRuler extends js.Object {
  var ruler: ^[InlineParsingRule]
}

object AnonRuler {
  @scala.inline
  def apply(ruler: ^[InlineParsingRule]): AnonRuler = {
    val __obj = js.Dynamic.literal(ruler = ruler.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRuler]
  }
}

