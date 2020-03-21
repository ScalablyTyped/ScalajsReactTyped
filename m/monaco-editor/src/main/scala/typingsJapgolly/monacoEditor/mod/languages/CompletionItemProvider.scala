package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.Position
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionItemProvider extends js.Object {
  /**
    * Given a completion item fill in more data, like [doc-comment](#CompletionItem.documentation)
    * or [details](#CompletionItem.detail).
    *
    * The editor will only resolve a completion item once.
    */
  var resolveCompletionItem: js.UndefOr[
    js.Function4[
      /* model */ ITextModel, 
      /* position */ Position, 
      /* item */ CompletionItem, 
      /* token */ CancellationToken, 
      ProviderResult[CompletionItem]
    ]
  ] = js.undefined
  var triggerCharacters: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Provide completion items for the given position and document.
    */
  def provideCompletionItems(model: ITextModel, position: Position, context: CompletionContext, token: CancellationToken): ProviderResult[CompletionList]
}

object CompletionItemProvider {
  @scala.inline
  def apply(
    provideCompletionItems: (ITextModel, Position, CompletionContext, CancellationToken) => CallbackTo[ProviderResult[CompletionList]],
    resolveCompletionItem: (/* model */ ITextModel, /* position */ Position, /* item */ CompletionItem, /* token */ CancellationToken) => CallbackTo[ProviderResult[CompletionItem]] = null,
    triggerCharacters: js.Array[String] = null
  ): CompletionItemProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideCompletionItems")(js.Any.fromFunction4((t0: typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: typingsJapgolly.monacoEditor.mod.Position, t2: typingsJapgolly.monacoEditor.mod.languages.CompletionContext, t3: typingsJapgolly.monacoEditor.mod.CancellationToken) => provideCompletionItems(t0, t1, t2, t3).runNow()))
    if (resolveCompletionItem != null) __obj.updateDynamic("resolveCompletionItem")(js.Any.fromFunction4((t0: /* model */ typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: /* position */ typingsJapgolly.monacoEditor.mod.Position, t2: /* item */ typingsJapgolly.monacoEditor.mod.languages.CompletionItem, t3: /* token */ typingsJapgolly.monacoEditor.mod.CancellationToken) => resolveCompletionItem(t0, t1, t2, t3).runNow()))
    if (triggerCharacters != null) __obj.updateDynamic("triggerCharacters")(triggerCharacters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionItemProvider]
  }
}

