package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureHelpProvider extends js.Object {
  /**
  		 * Provide help for the signature at the given position and document.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param position The position at which the command was invoked.
  		 * @param token A cancellation token.
  		 * @param context Information about how signature help was triggered.
  		 *
  		 * @return Signature help or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined` or `null`.
  		 */
  def provideSignatureHelp(
    document: TextDocument,
    position: Position,
    token: CancellationToken,
    context: SignatureHelpContext
  ): ProviderResult[SignatureHelp]
}

object SignatureHelpProvider {
  @scala.inline
  def apply(
    provideSignatureHelp: (TextDocument, Position, CancellationToken, SignatureHelpContext) => CallbackTo[ProviderResult[SignatureHelp]]
  ): SignatureHelpProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideSignatureHelp")(js.Any.fromFunction4((t0: typingsJapgolly.vscode.mod.TextDocument, t1: typingsJapgolly.vscode.mod.Position, t2: typingsJapgolly.vscode.mod.CancellationToken, t3: typingsJapgolly.vscode.mod.SignatureHelpContext) => provideSignatureHelp(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[SignatureHelpProvider]
  }
}

