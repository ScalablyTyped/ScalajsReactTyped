package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.Position
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinitionProvider extends js.Object {
  /**
    * Provide the definition of the symbol at the given position and document.
    */
  def provideDefinition(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[Definition | js.Array[LocationLink]]
}

object DefinitionProvider {
  @scala.inline
  def apply(
    provideDefinition: (ITextModel, Position, CancellationToken) => CallbackTo[ProviderResult[Definition | js.Array[LocationLink]]]
  ): DefinitionProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideDefinition")(js.Any.fromFunction3((t0: typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: typingsJapgolly.monacoEditor.mod.Position, t2: typingsJapgolly.monacoEditor.mod.CancellationToken) => provideDefinition(t0, t1, t2).runNow()))
    __obj.asInstanceOf[DefinitionProvider]
  }
}

