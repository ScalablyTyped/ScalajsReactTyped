package typingsJapgolly.atAngularCompiler

import typingsJapgolly.atAngularCompiler.atAngularCompilerStrings.DOLLARquotedDOLLAR
import typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Type
import typingsJapgolly.atAngularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/value_util", JSImport.Namespace)
@js.native
object srcOutputValueUnderscoreUtilMod extends js.Object {
  val QUOTED_KEYS: DOLLARquotedDOLLAR = js.native
  def convertValueToOutputAst(ctx: OutputContext, value: js.Any): Expression = js.native
  def convertValueToOutputAst(ctx: OutputContext, value: js.Any, `type`: Type): Expression = js.native
}

