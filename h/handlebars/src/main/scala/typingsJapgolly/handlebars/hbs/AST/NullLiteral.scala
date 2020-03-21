package typingsJapgolly.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullLiteral extends Node {
  @JSName("type")
  var type_NullLiteral: typingsJapgolly.handlebars.handlebarsStrings.NullLiteral
}

object NullLiteral {
  @scala.inline
  def apply(loc: SourceLocation, `type`: typingsJapgolly.handlebars.handlebarsStrings.NullLiteral): NullLiteral = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullLiteral]
  }
}

