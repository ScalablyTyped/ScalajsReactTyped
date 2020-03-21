package typingsJapgolly.angularCompiler.compileMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileTypeSummary extends js.Object {
  var summaryKind: CompileSummaryKind | Null
  var `type`: CompileTypeMetadata
}

object CompileTypeSummary {
  @scala.inline
  def apply(`type`: CompileTypeMetadata, summaryKind: CompileSummaryKind = null): CompileTypeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (summaryKind != null) __obj.updateDynamic("summaryKind")(summaryKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileTypeSummary]
  }
}

