package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.Position
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameProvider extends js.Object {
  var resolveRenameLocation: js.UndefOr[
    js.Function3[
      /* model */ ITextModel, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      ProviderResult[RenameLocation with Rejection]
    ]
  ] = js.undefined
  def provideRenameEdits(model: ITextModel, position: Position, newName: String, token: CancellationToken): ProviderResult[WorkspaceEdit with Rejection]
}

object RenameProvider {
  @scala.inline
  def apply(
    provideRenameEdits: (ITextModel, Position, String, CancellationToken) => CallbackTo[ProviderResult[WorkspaceEdit with Rejection]],
    resolveRenameLocation: (/* model */ ITextModel, /* position */ Position, /* token */ CancellationToken) => CallbackTo[ProviderResult[RenameLocation with Rejection]] = null
  ): RenameProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideRenameEdits")(js.Any.fromFunction4((t0: typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: typingsJapgolly.monacoEditor.mod.Position, t2: java.lang.String, t3: typingsJapgolly.monacoEditor.mod.CancellationToken) => provideRenameEdits(t0, t1, t2, t3).runNow()))
    if (resolveRenameLocation != null) __obj.updateDynamic("resolveRenameLocation")(js.Any.fromFunction3((t0: /* model */ typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: /* position */ typingsJapgolly.monacoEditor.mod.Position, t2: /* token */ typingsJapgolly.monacoEditor.mod.CancellationToken) => resolveRenameLocation(t0, t1, t2).runNow()))
    __obj.asInstanceOf[RenameProvider]
  }
}

