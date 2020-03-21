package typingsJapgolly.reactInstantsearchCore.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentRefinementsExposed extends js.Object {
  /** Pass true to also clear the search query */
  var clearsQuery: js.UndefOr[Boolean] = js.undefined
  /**
    * Function to modify the items being displayed, e.g. for filtering or sorting them.
    * Takes an items as parameter and expects it back in return.
    */
  var transformItems: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object CurrentRefinementsExposed {
  @scala.inline
  def apply(
    clearsQuery: js.UndefOr[Boolean] = js.undefined,
    transformItems: /* repeated */ js.Any => CallbackTo[js.Any] = null
  ): CurrentRefinementsExposed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clearsQuery)) __obj.updateDynamic("clearsQuery")(clearsQuery.asInstanceOf[js.Any])
    if (transformItems != null) __obj.updateDynamic("transformItems")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => transformItems(t0).runNow()))
    __obj.asInstanceOf[CurrentRefinementsExposed]
  }
}

