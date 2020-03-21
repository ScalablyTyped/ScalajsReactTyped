package typingsJapgolly.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashPair extends Node {
  var key: String
  @JSName("type")
  var type_HashPair: typingsJapgolly.handlebars.handlebarsStrings.HashPair
  var value: Expression
}

object HashPair {
  @scala.inline
  def apply(
    key: String,
    loc: SourceLocation,
    `type`: typingsJapgolly.handlebars.handlebarsStrings.HashPair,
    value: Expression
  ): HashPair = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashPair]
  }
}

