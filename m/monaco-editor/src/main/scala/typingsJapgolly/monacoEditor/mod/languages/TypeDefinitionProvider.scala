package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.Position
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeDefinitionProvider extends js.Object {
  /**
    * Provide the type definition of the symbol at the given position and document.
    */
  def provideTypeDefinition(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[Definition | js.Array[LocationLink]]
}

object TypeDefinitionProvider {
  @scala.inline
  def apply(
    provideTypeDefinition: (ITextModel, Position, CancellationToken) => CallbackTo[ProviderResult[Definition | js.Array[LocationLink]]]
  ): TypeDefinitionProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideTypeDefinition")(js.Any.fromFunction3((t0: typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: typingsJapgolly.monacoEditor.mod.Position, t2: typingsJapgolly.monacoEditor.mod.CancellationToken) => provideTypeDefinition(t0, t1, t2).runNow()))
    __obj.asInstanceOf[TypeDefinitionProvider]
  }
}

