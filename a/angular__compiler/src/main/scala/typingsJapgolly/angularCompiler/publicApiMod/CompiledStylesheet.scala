package typingsJapgolly.angularCompiler.publicApiMod

import typingsJapgolly.angularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "CompiledStylesheet")
@js.native
class CompiledStylesheet protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.CompiledStylesheet {
  def this(
    outputCtx: OutputContext,
    stylesVar: String,
    dependencies: js.Array[typingsJapgolly.angularCompiler.styleCompilerMod.StylesCompileDependency],
    isShimmed: Boolean,
    meta: typingsJapgolly.angularCompiler.compileMetadataMod.CompileStylesheetMetadata
  ) = this()
}

