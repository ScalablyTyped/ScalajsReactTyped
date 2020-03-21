package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.Range
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentRangeFormattingEditProvider extends js.Object {
  val displayName: js.UndefOr[String] = js.undefined
  /**
    * Provide formatting edits for a range in a document.
    *
    * The given range is a hint and providers can decide to format a smaller
    * or larger range. Often this is done by adjusting the start and end
    * of the range to full syntax nodes.
    */
  def provideDocumentRangeFormattingEdits(model: ITextModel, range: Range, options: FormattingOptions, token: CancellationToken): ProviderResult[js.Array[TextEdit]]
}

object DocumentRangeFormattingEditProvider {
  @scala.inline
  def apply(
    provideDocumentRangeFormattingEdits: (ITextModel, Range, FormattingOptions, CancellationToken) => CallbackTo[ProviderResult[js.Array[TextEdit]]],
    displayName: String = null
  ): DocumentRangeFormattingEditProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideDocumentRangeFormattingEdits")(js.Any.fromFunction4((t0: typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: typingsJapgolly.monacoEditor.mod.Range, t2: typingsJapgolly.monacoEditor.mod.languages.FormattingOptions, t3: typingsJapgolly.monacoEditor.mod.CancellationToken) => provideDocumentRangeFormattingEdits(t0, t1, t2, t3).runNow()))
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentRangeFormattingEditProvider]
  }
}

