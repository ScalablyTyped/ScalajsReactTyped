package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentFormattingEditProvider extends js.Object {
  val displayName: js.UndefOr[String] = js.undefined
  /**
    * Provide formatting edits for a whole document.
    */
  def provideDocumentFormattingEdits(model: ITextModel, options: FormattingOptions, token: CancellationToken): ProviderResult[js.Array[TextEdit]]
}

object DocumentFormattingEditProvider {
  @scala.inline
  def apply(
    provideDocumentFormattingEdits: (ITextModel, FormattingOptions, CancellationToken) => CallbackTo[ProviderResult[js.Array[TextEdit]]],
    displayName: String = null
  ): DocumentFormattingEditProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideDocumentFormattingEdits")(js.Any.fromFunction3((t0: typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: typingsJapgolly.monacoEditor.mod.languages.FormattingOptions, t2: typingsJapgolly.monacoEditor.mod.CancellationToken) => provideDocumentFormattingEdits(t0, t1, t2).runNow()))
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentFormattingEditProvider]
  }
}

