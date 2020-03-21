package typingsJapgolly.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.StringLiteral")
@js.native
class StringLiteral protected () extends IASTToken {
  def this(_text: String, _valueText: String) = this()
  var _text: js.Any = js.native
  var _valueText: js.Any = js.native
  def structuralEquals(ast: StringLiteral, includingPosition: Boolean): Boolean = js.native
}

