package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentColorProvider extends js.Object {
  /**
    * Provide the string representations for a color.
    */
  def provideColorPresentations(model: ITextModel, colorInfo: IColorInformation, token: CancellationToken): ProviderResult[js.Array[IColorPresentation]]
  /**
    * Provides the color ranges for a specific model.
    */
  def provideDocumentColors(model: ITextModel, token: CancellationToken): ProviderResult[js.Array[IColorInformation]]
}

object DocumentColorProvider {
  @scala.inline
  def apply(
    provideColorPresentations: (ITextModel, IColorInformation, CancellationToken) => CallbackTo[ProviderResult[js.Array[IColorPresentation]]],
    provideDocumentColors: (ITextModel, CancellationToken) => CallbackTo[ProviderResult[js.Array[IColorInformation]]]
  ): DocumentColorProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideColorPresentations")(js.Any.fromFunction3((t0: typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: typingsJapgolly.monacoEditor.mod.languages.IColorInformation, t2: typingsJapgolly.monacoEditor.mod.CancellationToken) => provideColorPresentations(t0, t1, t2).runNow()))
    __obj.updateDynamic("provideDocumentColors")(js.Any.fromFunction2((t0: typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: typingsJapgolly.monacoEditor.mod.CancellationToken) => provideDocumentColors(t0, t1).runNow()))
    __obj.asInstanceOf[DocumentColorProvider]
  }
}

