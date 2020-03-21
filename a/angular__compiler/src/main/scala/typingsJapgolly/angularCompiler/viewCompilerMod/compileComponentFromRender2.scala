package typingsJapgolly.angularCompiler.viewCompilerMod

import typingsJapgolly.angularCompiler.bindingParserMod.BindingParser
import typingsJapgolly.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typingsJapgolly.angularCompiler.compileReflectorMod.CompileReflector
import typingsJapgolly.angularCompiler.r3TemplateTransformMod.Render3ParseResult
import typingsJapgolly.angularCompiler.srcUtilMod.OutputContext
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/compiler", "compileComponentFromRender2")
@js.native
object compileComponentFromRender2 extends js.Object {
  def apply(
    outputCtx: OutputContext,
    component: CompileDirectiveMetadata,
    render3Ast: Render3ParseResult,
    reflector: CompileReflector,
    bindingParser: BindingParser,
    directiveTypeBySel: Map[String, _],
    pipeTypeByName: Map[String, _]
  ): Unit = js.native
}

