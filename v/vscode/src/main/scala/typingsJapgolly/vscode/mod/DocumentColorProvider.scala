package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.AnonDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentColorProvider extends js.Object {
  /**
  		 * Provide [representations](#ColorPresentation) for a color.
  		 *
  		 * @param color The color to show and insert.
  		 * @param context A context object with additional information
  		 * @param token A cancellation token.
  		 * @return An array of color presentations or a thenable that resolves to such. The lack of a result
  		 * can be signaled by returning `undefined`, `null`, or an empty array.
  		 */
  def provideColorPresentations(color: Color, context: AnonDocument, token: CancellationToken): ProviderResult[js.Array[ColorPresentation]]
  /**
  		 * Provide colors for the given document.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param token A cancellation token.
  		 * @return An array of [color information](#ColorInformation) or a thenable that resolves to such. The lack of a result
  		 * can be signaled by returning `undefined`, `null`, or an empty array.
  		 */
  def provideDocumentColors(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[ColorInformation]]
}

object DocumentColorProvider {
  @scala.inline
  def apply(
    provideColorPresentations: (Color, AnonDocument, CancellationToken) => CallbackTo[ProviderResult[js.Array[ColorPresentation]]],
    provideDocumentColors: (TextDocument, CancellationToken) => CallbackTo[ProviderResult[js.Array[ColorInformation]]]
  ): DocumentColorProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideColorPresentations")(js.Any.fromFunction3((t0: typingsJapgolly.vscode.mod.Color, t1: typingsJapgolly.vscode.AnonDocument, t2: typingsJapgolly.vscode.mod.CancellationToken) => provideColorPresentations(t0, t1, t2).runNow()))
    __obj.updateDynamic("provideDocumentColors")(js.Any.fromFunction2((t0: typingsJapgolly.vscode.mod.TextDocument, t1: typingsJapgolly.vscode.mod.CancellationToken) => provideDocumentColors(t0, t1).runNow()))
    __obj.asInstanceOf[DocumentColorProvider]
  }
}

