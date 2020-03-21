package typingsJapgolly.esquery.mod

import typingsJapgolly.esquery.esqueryStrings.literal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Literals
//
trait StringLiteral
  extends LiteralAtom
     with Literal {
  @JSName("value")
  var value_StringLiteral: String
}

object StringLiteral {
  @scala.inline
  def apply(`type`: literal, value: String): StringLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringLiteral]
  }
}

