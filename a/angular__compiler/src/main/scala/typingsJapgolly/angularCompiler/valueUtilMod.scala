package typingsJapgolly.angularCompiler

import typingsJapgolly.angularCompiler.angularCompilerStrings.DollarquotedDollar
import typingsJapgolly.angularCompiler.outputAstMod.Expression
import typingsJapgolly.angularCompiler.outputAstMod.Type
import typingsJapgolly.angularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/value_util", JSImport.Namespace)
@js.native
object valueUtilMod extends js.Object {
  val QUOTED_KEYS: DollarquotedDollar = js.native
  def convertValueToOutputAst(ctx: OutputContext, value: js.Any): Expression = js.native
  def convertValueToOutputAst(ctx: OutputContext, value: js.Any, `type`: Type): Expression = js.native
}

