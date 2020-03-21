package typingsJapgolly.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "BindingPipe")
@js.native
class BindingPipe protected () extends AST {
  def this(span: ParseSpan, exp: AST, name: String, args: js.Array[_]) = this()
  var args: js.Array[_] = js.native
  var exp: AST = js.native
  var name: String = js.native
}

