package typingsJapgolly.reactInstantsearchCore

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.SearchBoxProvided> */
trait PartialSearchBoxProvided extends js.Object {
  var currentRefinement: js.UndefOr[String] = js.undefined
  var isSearchStalled: js.UndefOr[Boolean] = js.undefined
  var refine: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object PartialSearchBoxProvided {
  @scala.inline
  def apply(
    currentRefinement: String = null,
    isSearchStalled: js.UndefOr[Boolean] = js.undefined,
    refine: /* repeated */ js.Any => CallbackTo[js.Any] = null
  ): PartialSearchBoxProvided = {
    val __obj = js.Dynamic.literal()
    if (currentRefinement != null) __obj.updateDynamic("currentRefinement")(currentRefinement.asInstanceOf[js.Any])
    if (!js.isUndefined(isSearchStalled)) __obj.updateDynamic("isSearchStalled")(isSearchStalled.asInstanceOf[js.Any])
    if (refine != null) __obj.updateDynamic("refine")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => refine(t0).runNow()))
    __obj.asInstanceOf[PartialSearchBoxProvided]
  }
}

