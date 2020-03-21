package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.IDisposable
import typingsJapgolly.monacoEditor.mod.IEvent
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeLensProvider extends js.Object {
  var onDidChange: js.UndefOr[IEvent[this.type]] = js.undefined
  var resolveCodeLens: js.UndefOr[
    js.Function3[
      /* model */ ITextModel, 
      /* codeLens */ CodeLens, 
      /* token */ CancellationToken, 
      ProviderResult[CodeLens]
    ]
  ] = js.undefined
  def provideCodeLenses(model: ITextModel, token: CancellationToken): ProviderResult[CodeLensList]
}

object CodeLensProvider {
  @scala.inline
  def apply(
    provideCodeLenses: (ITextModel, CancellationToken) => CallbackTo[ProviderResult[CodeLensList]],
    onDidChange: (/* listener */ js.Function1[CodeLensProvider, js.Any], /* thisArg */ js.UndefOr[js.Any]) => CallbackTo[IDisposable] = null,
    resolveCodeLens: (/* model */ ITextModel, /* codeLens */ CodeLens, /* token */ CancellationToken) => CallbackTo[ProviderResult[CodeLens]] = null
  ): CodeLensProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideCodeLenses")(js.Any.fromFunction2((t0: typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: typingsJapgolly.monacoEditor.mod.CancellationToken) => provideCodeLenses(t0, t1).runNow()))
    if (onDidChange != null) __obj.updateDynamic("onDidChange")(js.Any.fromFunction2((t0: /* listener */ js.Function1[typingsJapgolly.monacoEditor.mod.languages.CodeLensProvider, js.Any], t1: /* thisArg */ js.UndefOr[js.Any]) => onDidChange(t0, t1).runNow()))
    if (resolveCodeLens != null) __obj.updateDynamic("resolveCodeLens")(js.Any.fromFunction3((t0: /* model */ typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: /* codeLens */ typingsJapgolly.monacoEditor.mod.languages.CodeLens, t2: /* token */ typingsJapgolly.monacoEditor.mod.CancellationToken) => resolveCodeLens(t0, t1, t2).runNow()))
    __obj.asInstanceOf[CodeLensProvider]
  }
}

