package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceSymbolProvider extends js.Object {
  /**
  		 * Given a symbol fill in its [location](#SymbolInformation.location). This method is called whenever a symbol
  		 * is selected in the UI. Providers can implement this method and return incomplete symbols from
  		 * [`provideWorkspaceSymbols`](#WorkspaceSymbolProvider.provideWorkspaceSymbols) which often helps to improve
  		 * performance.
  		 *
  		 * @param symbol The symbol that is to be resolved. Guaranteed to be an instance of an object returned from an
  		 * earlier call to `provideWorkspaceSymbols`.
  		 * @param token A cancellation token.
  		 * @return The resolved symbol or a thenable that resolves to that. When no result is returned,
  		 * the given `symbol` is used.
  		 */
  var resolveWorkspaceSymbol: js.UndefOr[
    js.Function2[
      /* symbol */ SymbolInformation, 
      /* token */ CancellationToken, 
      ProviderResult[SymbolInformation]
    ]
  ] = js.undefined
  /**
  		 * Project-wide search for a symbol matching the given query string.
  		 *
  		 * The `query`-parameter should be interpreted in a *relaxed way* as the editor will apply its own highlighting
  		 * and scoring on the results. A good rule of thumb is to match case-insensitive and to simply check that the
  		 * characters of *query* appear in their order in a candidate symbol. Don't use prefix, substring, or similar
  		 * strict matching.
  		 *
  		 * To improve performance implementors can implement `resolveWorkspaceSymbol` and then provide symbols with partial
  		 * [location](#SymbolInformation.location)-objects, without a `range` defined. The editor will then call
  		 * `resolveWorkspaceSymbol` for selected symbols only, e.g. when opening a workspace symbol.
  		 *
  		 * @param query A query string, can be the empty string in which case all symbols should be returned.
  		 * @param token A cancellation token.
  		 * @return An array of document highlights or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined`, `null`, or an empty array.
  		 */
  def provideWorkspaceSymbols(query: String, token: CancellationToken): ProviderResult[js.Array[SymbolInformation]]
}

object WorkspaceSymbolProvider {
  @scala.inline
  def apply(
    provideWorkspaceSymbols: (String, CancellationToken) => CallbackTo[ProviderResult[js.Array[SymbolInformation]]],
    resolveWorkspaceSymbol: (/* symbol */ SymbolInformation, /* token */ CancellationToken) => CallbackTo[ProviderResult[SymbolInformation]] = null
  ): WorkspaceSymbolProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideWorkspaceSymbols")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.vscode.mod.CancellationToken) => provideWorkspaceSymbols(t0, t1).runNow()))
    if (resolveWorkspaceSymbol != null) __obj.updateDynamic("resolveWorkspaceSymbol")(js.Any.fromFunction2((t0: /* symbol */ typingsJapgolly.vscode.mod.SymbolInformation, t1: /* token */ typingsJapgolly.vscode.mod.CancellationToken) => resolveWorkspaceSymbol(t0, t1).runNow()))
    __obj.asInstanceOf[WorkspaceSymbolProvider]
  }
}

