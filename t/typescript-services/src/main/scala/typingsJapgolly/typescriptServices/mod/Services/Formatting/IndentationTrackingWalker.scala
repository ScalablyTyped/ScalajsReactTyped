package typingsJapgolly.typescriptServices.mod.Services.Formatting

import typingsJapgolly.typescriptServices.FormattingOptions
import typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.ITextSnapshot
import typingsJapgolly.typescriptServices.TypeScript.SourceUnitSyntax
import typingsJapgolly.typescriptServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.IndentationTrackingWalker")
@js.native
class IndentationTrackingWalker protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.IndentationTrackingWalker {
  def this(
    textSpan: TextSpan,
    sourceUnit: SourceUnitSyntax,
    snapshot: ITextSnapshot,
    indentFirstToken: Boolean,
    options: FormattingOptions
  ) = this()
}

