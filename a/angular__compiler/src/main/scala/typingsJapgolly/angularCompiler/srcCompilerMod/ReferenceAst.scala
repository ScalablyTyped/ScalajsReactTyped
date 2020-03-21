package typingsJapgolly.angularCompiler.srcCompilerMod

import typingsJapgolly.angularCompiler.compileMetadataMod.CompileTokenMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "ReferenceAst")
@js.native
class ReferenceAst protected ()
  extends typingsJapgolly.angularCompiler.templateAstMod.ReferenceAst {
  def this(
    name: String,
    value: CompileTokenMetadata,
    originalValue: String,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

