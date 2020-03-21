package typingsJapgolly.esquery.mod

import typingsJapgolly.esquery.esqueryStrings.literal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.esquery.mod.StringLiteral
  - typingsJapgolly.esquery.mod.NumericLiteral
*/
trait Literal extends js.Object

object Literal {
  @scala.inline
  def StringLiteral(`type`: literal, value: String): Literal = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  @scala.inline
  def NumericLiteral(`type`: literal, value: Double): Literal = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
}

