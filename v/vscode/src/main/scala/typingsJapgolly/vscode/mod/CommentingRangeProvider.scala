package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentingRangeProvider extends js.Object {
  /**
  		 * Provide a list of ranges which allow new comment threads creation or null for a given document
  		 */
  def provideCommentingRanges(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[Range]]
}

object CommentingRangeProvider {
  @scala.inline
  def apply(
    provideCommentingRanges: (TextDocument, CancellationToken) => CallbackTo[ProviderResult[js.Array[Range]]]
  ): CommentingRangeProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideCommentingRanges")(js.Any.fromFunction2((t0: typingsJapgolly.vscode.mod.TextDocument, t1: typingsJapgolly.vscode.mod.CancellationToken) => provideCommentingRanges(t0, t1).runNow()))
    __obj.asInstanceOf[CommentingRangeProvider]
  }
}

