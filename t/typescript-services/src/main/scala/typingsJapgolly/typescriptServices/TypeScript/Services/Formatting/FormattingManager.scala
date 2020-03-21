package typingsJapgolly.typescriptServices.TypeScript.Services.Formatting

import typingsJapgolly.typescriptServices.TypeScript.Services.EditorOptions
import typingsJapgolly.typescriptServices.TypeScript.Services.TextEdit
import typingsJapgolly.typescriptServices.TypeScript.SyntaxTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.FormattingManager")
@js.native
class FormattingManager protected () extends js.Object {
  def this(
    syntaxTree: SyntaxTree,
    snapshot: ITextSnapshot,
    rulesProvider: RulesProvider,
    editorOptions: EditorOptions
  ) = this()
  var options: js.Any = js.native
  var rulesProvider: js.Any = js.native
  var snapshot: js.Any = js.native
  var syntaxTree: js.Any = js.native
  def formatDocument(minChar: Double, limChar: Double): js.Array[TextEdit] = js.native
  def formatOnClosingCurlyBrace(caretPosition: Double): js.Array[TextEdit] = js.native
  def formatOnEnter(caretPosition: Double): js.Array[TextEdit] = js.native
  def formatOnPaste(minChar: Double, limChar: Double): js.Array[TextEdit] = js.native
  def formatOnSemicolon(caretPosition: Double): js.Array[TextEdit] = js.native
  def formatSelection(minChar: Double, limChar: Double): js.Array[TextEdit] = js.native
  /* private */ def formatSpan(span: js.Any, formattingRequestKind: js.Any): js.Any = js.native
}

