package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProvider extends js.Object {
  var resolveLink: js.UndefOr[
    js.Function2[/* link */ ILink, /* token */ CancellationToken, ProviderResult[ILink]]
  ] = js.undefined
  def provideLinks(model: ITextModel, token: CancellationToken): ProviderResult[ILinksList]
}

object LinkProvider {
  @scala.inline
  def apply(
    provideLinks: (ITextModel, CancellationToken) => CallbackTo[ProviderResult[ILinksList]],
    resolveLink: (/* link */ ILink, /* token */ CancellationToken) => CallbackTo[ProviderResult[ILink]] = null
  ): LinkProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideLinks")(js.Any.fromFunction2((t0: typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: typingsJapgolly.monacoEditor.mod.CancellationToken) => provideLinks(t0, t1).runNow()))
    if (resolveLink != null) __obj.updateDynamic("resolveLink")(js.Any.fromFunction2((t0: /* link */ typingsJapgolly.monacoEditor.mod.languages.ILink, t1: /* token */ typingsJapgolly.monacoEditor.mod.CancellationToken) => resolveLink(t0, t1).runNow()))
    __obj.asInstanceOf[LinkProvider]
  }
}

