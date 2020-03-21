package typingsJapgolly.angularCompiler.publicApiMod

import typingsJapgolly.angularCompiler.compileMetadataMod.CompileDirectiveSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "DirectiveAst")
@js.native
class DirectiveAst protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.DirectiveAst {
  def this(
    directive: CompileDirectiveSummary,
    inputs: js.Array[typingsJapgolly.angularCompiler.templateAstMod.BoundDirectivePropertyAst],
    hostProperties: js.Array[typingsJapgolly.angularCompiler.templateAstMod.BoundElementPropertyAst],
    hostEvents: js.Array[typingsJapgolly.angularCompiler.templateAstMod.BoundEventAst],
    contentQueryStartId: Double,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

