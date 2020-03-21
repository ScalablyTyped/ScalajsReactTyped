package typingsJapgolly.angularCompiler.publicApiMod

import typingsJapgolly.angularCompiler.compileMetadataMod.CompileTokenMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "ReferenceAst")
@js.native
class ReferenceAst protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.ReferenceAst {
  def this(
    name: String,
    value: CompileTokenMetadata,
    originalValue: String,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

