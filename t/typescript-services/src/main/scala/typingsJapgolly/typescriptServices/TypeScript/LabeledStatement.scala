package typingsJapgolly.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.LabeledStatement")
@js.native
class LabeledStatement protected () extends AST {
  def this(identifier: Identifier, statement: AST) = this()
  var identifier: Identifier = js.native
  var statement: AST = js.native
  def structuralEquals(ast: LabeledStatement, includingPosition: Boolean): Boolean = js.native
}

