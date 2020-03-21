package typingsJapgolly.typescriptServices.mod.Services.Formatting

import typingsJapgolly.typescriptServices.TypeScript.Services.EditorOptions
import typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.ITextSnapshot
import typingsJapgolly.typescriptServices.TypeScript.SyntaxTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.FormattingManager")
@js.native
class FormattingManager protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.FormattingManager {
  def this(
    syntaxTree: SyntaxTree,
    snapshot: ITextSnapshot,
    rulesProvider: typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RulesProvider,
    editorOptions: EditorOptions
  ) = this()
}

