package typingsJapgolly.reactInstantsearchCore.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBoxProvided extends js.Object {
  /** the current query used */
  var currentRefinement: String
  /** a flag that indicates if InstantSearch has detected that searches are stalled */
  var isSearchStalled: Boolean
  /** a function to change the current query */
  def refine(args: js.Any*): js.Any
}

object SearchBoxProvided {
  @scala.inline
  def apply(
    currentRefinement: String,
    isSearchStalled: Boolean,
    refine: /* repeated */ js.Any => CallbackTo[js.Any]
  ): SearchBoxProvided = {
    val __obj = js.Dynamic.literal(currentRefinement = currentRefinement.asInstanceOf[js.Any], isSearchStalled = isSearchStalled.asInstanceOf[js.Any])
    __obj.updateDynamic("refine")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => refine(t0).runNow()))
    __obj.asInstanceOf[SearchBoxProvided]
  }
}

