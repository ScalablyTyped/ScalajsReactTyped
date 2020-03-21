package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.Position
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionRangeProvider extends js.Object {
  /**
    * Provide ranges that should be selected from the given position.
    */
  def provideSelectionRanges(model: ITextModel, positions: js.Array[Position], token: CancellationToken): ProviderResult[js.Array[js.Array[SelectionRange]]]
}

object SelectionRangeProvider {
  @scala.inline
  def apply(
    provideSelectionRanges: (ITextModel, js.Array[Position], CancellationToken) => CallbackTo[ProviderResult[js.Array[js.Array[SelectionRange]]]]
  ): SelectionRangeProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideSelectionRanges")(js.Any.fromFunction3((t0: typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: js.Array[typingsJapgolly.monacoEditor.mod.Position], t2: typingsJapgolly.monacoEditor.mod.CancellationToken) => provideSelectionRanges(t0, t1, t2).runNow()))
    __obj.asInstanceOf[SelectionRangeProvider]
  }
}

