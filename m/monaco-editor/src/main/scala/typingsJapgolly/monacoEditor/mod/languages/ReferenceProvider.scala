package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.Position
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceProvider extends js.Object {
  /**
    * Provide a set of project-wide references for the given position and document.
    */
  def provideReferences(model: ITextModel, position: Position, context: ReferenceContext, token: CancellationToken): ProviderResult[js.Array[Location]]
}

object ReferenceProvider {
  @scala.inline
  def apply(
    provideReferences: (ITextModel, Position, ReferenceContext, CancellationToken) => CallbackTo[ProviderResult[js.Array[Location]]]
  ): ReferenceProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideReferences")(js.Any.fromFunction4((t0: typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: typingsJapgolly.monacoEditor.mod.Position, t2: typingsJapgolly.monacoEditor.mod.languages.ReferenceContext, t3: typingsJapgolly.monacoEditor.mod.CancellationToken) => provideReferences(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[ReferenceProvider]
  }
}

