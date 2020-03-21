package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.CancellationToken
import typingsJapgolly.monacoEditor.mod.Position
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureHelpProvider extends js.Object {
  val signatureHelpRetriggerCharacters: js.UndefOr[js.Array[String]] = js.undefined
  val signatureHelpTriggerCharacters: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Provide help for the signature at the given position and document.
    */
  def provideSignatureHelp(model: ITextModel, position: Position, token: CancellationToken, context: SignatureHelpContext): ProviderResult[SignatureHelpResult]
}

object SignatureHelpProvider {
  @scala.inline
  def apply(
    provideSignatureHelp: (ITextModel, Position, CancellationToken, SignatureHelpContext) => CallbackTo[ProviderResult[SignatureHelpResult]],
    signatureHelpRetriggerCharacters: js.Array[String] = null,
    signatureHelpTriggerCharacters: js.Array[String] = null
  ): SignatureHelpProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideSignatureHelp")(js.Any.fromFunction4((t0: typingsJapgolly.monacoEditor.mod.editor.ITextModel, t1: typingsJapgolly.monacoEditor.mod.Position, t2: typingsJapgolly.monacoEditor.mod.CancellationToken, t3: typingsJapgolly.monacoEditor.mod.languages.SignatureHelpContext) => provideSignatureHelp(t0, t1, t2, t3).runNow()))
    if (signatureHelpRetriggerCharacters != null) __obj.updateDynamic("signatureHelpRetriggerCharacters")(signatureHelpRetriggerCharacters.asInstanceOf[js.Any])
    if (signatureHelpTriggerCharacters != null) __obj.updateDynamic("signatureHelpTriggerCharacters")(signatureHelpTriggerCharacters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpProvider]
  }
}

