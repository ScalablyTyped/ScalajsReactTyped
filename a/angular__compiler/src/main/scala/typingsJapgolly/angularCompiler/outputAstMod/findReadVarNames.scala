package typingsJapgolly.angularCompiler.outputAstMod

import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "findReadVarNames")
@js.native
object findReadVarNames extends js.Object {
  def apply(stmts: js.Array[Statement]): Set[String] = js.native
}

