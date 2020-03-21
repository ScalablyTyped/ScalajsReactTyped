package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.AnonPlaceholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameProvider extends js.Object {
  /**
  		 * Optional function for resolving and validating a position *before* running rename. The result can
  		 * be a range or a range and a placeholder text. The placeholder text should be the identifier of the symbol
  		 * which is being renamed - when omitted the text in the returned range is used.
  		 *
  		 * *Note: * This function should throw an error or return a rejected thenable when the provided location
  		 * doesn't allow for a rename.
  		 *
  		 * @param document The document in which rename will be invoked.
  		 * @param position The position at which rename will be invoked.
  		 * @param token A cancellation token.
  		 * @return The range or range and placeholder text of the identifier that is to be renamed. The lack of a result can signaled by returning `undefined` or `null`.
  		 */
  var prepareRename: js.UndefOr[
    js.Function3[
      /* document */ TextDocument, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      ProviderResult[Range | AnonPlaceholder]
    ]
  ] = js.undefined
  /**
  		 * Provide an edit that describes changes that have to be made to one
  		 * or many resources to rename a symbol to a different name.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param position The position at which the command was invoked.
  		 * @param newName The new name of the symbol. If the given name is not valid, the provider must return a rejected promise.
  		 * @param token A cancellation token.
  		 * @return A workspace edit or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined` or `null`.
  		 */
  def provideRenameEdits(document: TextDocument, position: Position, newName: String, token: CancellationToken): ProviderResult[WorkspaceEdit]
}

object RenameProvider {
  @scala.inline
  def apply(
    provideRenameEdits: (TextDocument, Position, String, CancellationToken) => CallbackTo[ProviderResult[WorkspaceEdit]],
    prepareRename: (/* document */ TextDocument, /* position */ Position, /* token */ CancellationToken) => CallbackTo[ProviderResult[Range | AnonPlaceholder]] = null
  ): RenameProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideRenameEdits")(js.Any.fromFunction4((t0: typingsJapgolly.vscode.mod.TextDocument, t1: typingsJapgolly.vscode.mod.Position, t2: java.lang.String, t3: typingsJapgolly.vscode.mod.CancellationToken) => provideRenameEdits(t0, t1, t2, t3).runNow()))
    if (prepareRename != null) __obj.updateDynamic("prepareRename")(js.Any.fromFunction3((t0: /* document */ typingsJapgolly.vscode.mod.TextDocument, t1: /* position */ typingsJapgolly.vscode.mod.Position, t2: /* token */ typingsJapgolly.vscode.mod.CancellationToken) => prepareRename(t0, t1, t2).runNow()))
    __obj.asInstanceOf[RenameProvider]
  }
}

