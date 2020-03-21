package typingsJapgolly.appleMapkitJs.mapkit

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object or callback function called when performing a search or autocomplete
  * request.
  */
trait SearchDelegate extends js.Object {
  /**
    * When an autocomplete request successfully completes, this method returns
    * a data array that is the same as the one passed to the autocomplete
    * callback function.
    */
  var autocompleteDidComplete: js.UndefOr[js.Function1[/* data */ SearchAutocompleteResponse, Unit]] = js.undefined
  /**
    * Invoked when an autocomplete request fails.
    */
  var autocompleteDidError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  /**
    * Upon successful completion of a search request, this method returns a data
    * object that is the same as the one passed to the search callback function.
    */
  var searchDidComplete: js.UndefOr[js.Function1[/* data */ SearchResponse, Unit]] = js.undefined
  /**
    * Called when the search request fails.
    */
  var searchDidError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
}

object SearchDelegate {
  @scala.inline
  def apply(
    autocompleteDidComplete: /* data */ SearchAutocompleteResponse => Callback = null,
    autocompleteDidError: /* error */ js.Error => Callback = null,
    searchDidComplete: /* data */ SearchResponse => Callback = null,
    searchDidError: /* error */ js.Error => Callback = null
  ): SearchDelegate = {
    val __obj = js.Dynamic.literal()
    if (autocompleteDidComplete != null) __obj.updateDynamic("autocompleteDidComplete")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.appleMapkitJs.mapkit.SearchAutocompleteResponse) => autocompleteDidComplete(t0).runNow()))
    if (autocompleteDidError != null) __obj.updateDynamic("autocompleteDidError")(js.Any.fromFunction1((t0: /* error */ js.Error) => autocompleteDidError(t0).runNow()))
    if (searchDidComplete != null) __obj.updateDynamic("searchDidComplete")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.appleMapkitJs.mapkit.SearchResponse) => searchDidComplete(t0).runNow()))
    if (searchDidError != null) __obj.updateDynamic("searchDidError")(js.Any.fromFunction1((t0: /* error */ js.Error) => searchDidError(t0).runNow()))
    __obj.asInstanceOf[SearchDelegate]
  }
}

