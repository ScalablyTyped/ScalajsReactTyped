package typingsJapgolly.angularCompiler.viewCompilerMod

import typingsJapgolly.angularCompiler.bindingParserMod.BindingParser
import typingsJapgolly.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typingsJapgolly.angularCompiler.compileReflectorMod.CompileReflector
import typingsJapgolly.angularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/compiler", "compileDirectiveFromRender2")
@js.native
object compileDirectiveFromRender2 extends js.Object {
  def apply(
    outputCtx: OutputContext,
    directive: CompileDirectiveMetadata,
    reflector: CompileReflector,
    bindingParser: BindingParser
  ): Unit = js.native
}

