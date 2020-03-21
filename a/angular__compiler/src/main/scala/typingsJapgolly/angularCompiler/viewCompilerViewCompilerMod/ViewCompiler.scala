package typingsJapgolly.angularCompiler.viewCompilerViewCompilerMod

import typingsJapgolly.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typingsJapgolly.angularCompiler.compileMetadataMod.CompilePipeSummary
import typingsJapgolly.angularCompiler.compileReflectorMod.CompileReflector
import typingsJapgolly.angularCompiler.outputAstMod.Expression
import typingsJapgolly.angularCompiler.srcUtilMod.OutputContext
import typingsJapgolly.angularCompiler.templateAstMod.TemplateAst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/view_compiler/view_compiler", "ViewCompiler")
@js.native
class ViewCompiler protected () extends js.Object {
  def this(_reflector: CompileReflector) = this()
  var _reflector: js.Any = js.native
  def compileComponent(
    outputCtx: OutputContext,
    component: CompileDirectiveMetadata,
    template: js.Array[TemplateAst],
    styles: Expression,
    usedPipes: js.Array[CompilePipeSummary]
  ): ViewCompileResult = js.native
}

