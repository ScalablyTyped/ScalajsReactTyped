package typingsJapgolly.esquery.mod

import typingsJapgolly.esquery.esqueryStrings.`class`
import typingsJapgolly.esquery.esqueryStrings.declaration
import typingsJapgolly.esquery.esqueryStrings.expression
import typingsJapgolly.esquery.esqueryStrings.function
import typingsJapgolly.esquery.esqueryStrings.pattern
import typingsJapgolly.esquery.esqueryStrings.statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Class
  extends Atom
     with Selector {
  var name: declaration | expression | function | pattern | statement
  @JSName("type")
  var type_Class: `class`
}

object Class {
  @scala.inline
  def apply(name: declaration | expression | function | pattern | statement, `type`: `class`): Class = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
}

