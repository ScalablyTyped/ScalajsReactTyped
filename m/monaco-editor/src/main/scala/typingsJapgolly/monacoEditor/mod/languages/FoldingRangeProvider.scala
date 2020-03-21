package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldingRangeProvider extends js.Object {
  /**
    * Provides the color ranges for a specific model.
    */
  def provideFoldingRanges(model: ITextModel, context: FoldingContext, token: CancellationToken): ProviderResult[js.Array[FoldingRange]]
}

object FoldingRangeProvider {
  @scala.inline
  def apply(
    provideFoldingRanges: (ITextModel, FoldingContext, CancellationToken) => CallbackTo[ProviderResult[js.Array[FoldingRange]]]
  ): FoldingRangeProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideFoldingRanges")(js.Any.fromFunction3((t0: typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: typingsJapgolly.monacoEditor.mod.languages.FoldingContext, t2: typingsJapgolly.monacoEditor.mod.CancellationToken) => provideFoldingRanges(t0, t1, t2).runNow()))
    __obj.asInstanceOf[FoldingRangeProvider]
  }
}

