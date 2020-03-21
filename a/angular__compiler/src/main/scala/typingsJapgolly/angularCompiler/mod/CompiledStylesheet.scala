package typingsJapgolly.angularCompiler.mod

import typingsJapgolly.angularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "CompiledStylesheet")
@js.native
class CompiledStylesheet protected ()
  extends typingsJapgolly.angularCompiler.publicApiMod.CompiledStylesheet {
  def this(
    outputCtx: OutputContext,
    stylesVar: String,
    dependencies: js.Array[typingsJapgolly.angularCompiler.styleCompilerMod.StylesCompileDependency],
    isShimmed: Boolean,
    meta: typingsJapgolly.angularCompiler.compileMetadataMod.CompileStylesheetMetadata
  ) = this()
}

