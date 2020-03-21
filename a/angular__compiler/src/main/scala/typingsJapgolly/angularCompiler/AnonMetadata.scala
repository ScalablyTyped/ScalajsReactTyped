package typingsJapgolly.angularCompiler

import typingsJapgolly.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typingsJapgolly.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typingsJapgolly.angularCompiler.compileMetadataMod.CompilePipeMetadata
import typingsJapgolly.angularCompiler.compileMetadataMod.CompileTypeMetadata
import typingsJapgolly.angularCompiler.compileMetadataMod.CompileTypeSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMetadata extends js.Object {
  var metadata: CompileNgModuleMetadata | CompileDirectiveMetadata | CompilePipeMetadata | CompileTypeMetadata
  var summary: CompileTypeSummary
}

object AnonMetadata {
  @scala.inline
  def apply(
    metadata: CompileNgModuleMetadata | CompileDirectiveMetadata | CompilePipeMetadata | CompileTypeMetadata,
    summary: CompileTypeSummary
  ): AnonMetadata = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMetadata]
  }
}

