package typingsJapgolly.inboxsdk.mod.Search

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchQueryRewriter extends js.Object {
  var term: String
  def termReplacer(): String | js.Promise[String]
}

object SearchQueryRewriter {
  @scala.inline
  def apply(term: String, termReplacer: CallbackTo[String | js.Promise[String]]): SearchQueryRewriter = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any])
    __obj.updateDynamic("termReplacer")(termReplacer.toJsFn)
    __obj.asInstanceOf[SearchQueryRewriter]
  }
}

