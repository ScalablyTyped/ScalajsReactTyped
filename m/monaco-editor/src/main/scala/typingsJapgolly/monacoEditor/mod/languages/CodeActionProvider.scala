package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.Range
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeActionProvider extends js.Object {
  /**
    * Provide commands for the given document and range.
    */
  def provideCodeActions(model: ITextModel, range: Range, context: CodeActionContext, token: CancellationToken): CodeActionList | js.Promise[CodeActionList]
}

object CodeActionProvider {
  @scala.inline
  def apply(
    provideCodeActions: (ITextModel, Range, CodeActionContext, CancellationToken) => CallbackTo[CodeActionList | js.Promise[CodeActionList]]
  ): CodeActionProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideCodeActions")(js.Any.fromFunction4((t0: typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: typingsJapgolly.monacoEditor.mod.Range, t2: typingsJapgolly.monacoEditor.mod.languages.CodeActionContext, t3: typingsJapgolly.monacoEditor.mod.CancellationToken) => provideCodeActions(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[CodeActionProvider]
  }
}

