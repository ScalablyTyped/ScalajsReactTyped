package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.Position
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImplementationProvider extends js.Object {
  /**
    * Provide the implementation of the symbol at the given position and document.
    */
  def provideImplementation(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[Definition | js.Array[LocationLink]]
}

object ImplementationProvider {
  @scala.inline
  def apply(
    provideImplementation: (ITextModel, Position, CancellationToken) => CallbackTo[ProviderResult[Definition | js.Array[LocationLink]]]
  ): ImplementationProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideImplementation")(js.Any.fromFunction3((t0: typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: typingsJapgolly.monacoEditor.mod.Position, t2: typingsJapgolly.monacoEditor.mod.CancellationToken) => provideImplementation(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ImplementationProvider]
  }
}

