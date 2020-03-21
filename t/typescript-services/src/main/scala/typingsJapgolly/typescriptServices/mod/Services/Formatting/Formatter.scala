package typingsJapgolly.typescriptServices.mod.Services.Formatting

import typingsJapgolly.typescriptServices.FormattingOptions
import typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.ITextSnapshot
import typingsJapgolly.typescriptServices.TypeScript.SourceUnitSyntax
import typingsJapgolly.typescriptServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.Formatter")
@js.native
class Formatter protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Formatter {
  def this(
    textSpan: TextSpan,
    sourceUnit: SourceUnitSyntax,
    indentFirstToken: Boolean,
    options: FormattingOptions,
    snapshot: ITextSnapshot,
    rulesProvider: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RulesProvider,
    formattingRequestKind: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind
  ) = this()
}

/* static members */
@JSImport("typescript-services", "Services.Formatting.Formatter")
@js.native
object Formatter extends js.Object {
  def getEdits(
    textSpan: TextSpan,
    sourceUnit: SourceUnitSyntax,
    options: FormattingOptions,
    indentFirstToken: Boolean,
    snapshot: ITextSnapshot,
    rulesProvider: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RulesProvider,
    formattingRequestKind: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind
  ): js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.TextEditInfo] = js.native
}

