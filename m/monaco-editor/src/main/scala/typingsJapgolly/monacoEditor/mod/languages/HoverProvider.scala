package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.Position
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoverProvider extends js.Object {
  /**
    * Provide a hover for the given position and document. Multiple hovers at the same
    * position will be merged by the editor. A hover can have a range which defaults
    * to the word range at the position when omitted.
    */
  def provideHover(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[Hover]
}

object HoverProvider {
  @scala.inline
  def apply(provideHover: (ITextModel, Position, CancellationToken) => CallbackTo[ProviderResult[Hover]]): HoverProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideHover")(js.Any.fromFunction3((t0: typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: typingsJapgolly.monacoEditor.mod.Position, t2: typingsJapgolly.monacoEditor.mod.CancellationToken) => provideHover(t0, t1, t2).runNow()))
    __obj.asInstanceOf[HoverProvider]
  }
}

