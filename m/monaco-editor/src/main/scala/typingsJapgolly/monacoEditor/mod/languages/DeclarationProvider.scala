package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.Position
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationProvider extends js.Object {
  /**
    * Provide the declaration of the symbol at the given position and document.
    */
  def provideDeclaration(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[Definition | js.Array[LocationLink]]
}

object DeclarationProvider {
  @scala.inline
  def apply(
    provideDeclaration: (ITextModel, Position, CancellationToken) => CallbackTo[ProviderResult[Definition | js.Array[LocationLink]]]
  ): DeclarationProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideDeclaration")(js.Any.fromFunction3((t0: typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: typingsJapgolly.monacoEditor.mod.Position, t2: typingsJapgolly.monacoEditor.mod.CancellationToken) => provideDeclaration(t0, t1, t2).runNow()))
    __obj.asInstanceOf[DeclarationProvider]
  }
}

