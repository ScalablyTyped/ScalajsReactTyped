package typingsJapgolly.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UndefinedLiteral extends Node {
  @JSName("type")
  var type_UndefinedLiteral: typingsJapgolly.handlebars.handlebarsStrings.UndefinedLiteral
}

object UndefinedLiteral {
  @scala.inline
  def apply(loc: SourceLocation, `type`: typingsJapgolly.handlebars.handlebarsStrings.UndefinedLiteral): UndefinedLiteral = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndefinedLiteral]
  }
}

