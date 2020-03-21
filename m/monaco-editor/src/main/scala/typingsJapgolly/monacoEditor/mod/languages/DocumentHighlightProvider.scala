package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.Position
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentHighlightProvider extends js.Object {
  /**
    * Provide a set of document highlights, like all occurrences of a variable or
    * all exit-points of a function.
    */
  def provideDocumentHighlights(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[js.Array[DocumentHighlight]]
}

object DocumentHighlightProvider {
  @scala.inline
  def apply(
    provideDocumentHighlights: (ITextModel, Position, CancellationToken) => CallbackTo[ProviderResult[js.Array[DocumentHighlight]]]
  ): DocumentHighlightProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideDocumentHighlights")(js.Any.fromFunction3((t0: typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: typingsJapgolly.monacoEditor.mod.Position, t2: typingsJapgolly.monacoEditor.mod.CancellationToken) => provideDocumentHighlights(t0, t1, t2).runNow()))
    __obj.asInstanceOf[DocumentHighlightProvider]
  }
}

