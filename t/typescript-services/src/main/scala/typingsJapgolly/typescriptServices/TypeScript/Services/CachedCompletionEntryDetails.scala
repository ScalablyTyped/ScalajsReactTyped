package typingsJapgolly.typescriptServices.TypeScript.Services

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CachedCompletionEntryDetails extends CompletionEntryDetails {
  def isResolved(): Boolean
}

object CachedCompletionEntryDetails {
  @scala.inline
  def apply(
    docComment: String,
    fullSymbolName: String,
    isResolved: CallbackTo[Boolean],
    kind: String,
    kindModifiers: String,
    name: String,
    `type`: String
  ): CachedCompletionEntryDetails = {
    val __obj = js.Dynamic.literal(docComment = docComment.asInstanceOf[js.Any], fullSymbolName = fullSymbolName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("isResolved")(isResolved.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachedCompletionEntryDetails]
  }
}

