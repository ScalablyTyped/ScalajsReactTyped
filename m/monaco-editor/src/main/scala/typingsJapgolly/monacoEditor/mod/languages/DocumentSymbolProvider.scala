package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentSymbolProvider extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * Provide symbol information for the given document.
    */
  def provideDocumentSymbols(model: ITextModel, token: CancellationToken): ProviderResult[js.Array[DocumentSymbol]]
}

object DocumentSymbolProvider {
  @scala.inline
  def apply(
    provideDocumentSymbols: (ITextModel, CancellationToken) => CallbackTo[ProviderResult[js.Array[DocumentSymbol]]],
    displayName: String = null
  ): DocumentSymbolProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideDocumentSymbols")(js.Any.fromFunction2((t0: typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: typingsJapgolly.monacoEditor.mod.CancellationToken) => provideDocumentSymbols(t0, t1).runNow()))
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSymbolProvider]
  }
}

