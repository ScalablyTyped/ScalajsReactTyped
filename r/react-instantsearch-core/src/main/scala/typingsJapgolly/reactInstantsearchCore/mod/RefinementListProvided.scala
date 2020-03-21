package typingsJapgolly.reactInstantsearchCore.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactInstantsearchCore.HitcountnumberisRefinedbo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefinementListProvided extends js.Object {
  /** a boolean that says whether you can currently refine */
  var canRefine: Boolean
  /** the refinement currently applied */
  var currentRefinement: js.Array[String]
  /** a boolean that says if the items props contains facet values from the global search or from the search inside items. */
  var isFromSearch: Boolean
  /**
    * The list of items the RefinementList can display.
    * If isFromSearch is false, the hit properties like _highlightResult are undefined
    */
  var items: js.Array[HitcountnumberisRefinedbo]
  /** a function to generate a URL for the corresponding search state */
  def createURL(args: js.Any*): js.Any
  /** a function to toggle a refinement */
  def refine(value: js.Array[String]): js.Any
  /** a function to toggle a search inside items values */
  def searchForItems(args: js.Any*): js.Any
}

object RefinementListProvided {
  @scala.inline
  def apply(
    canRefine: Boolean,
    createURL: /* repeated */ js.Any => CallbackTo[js.Any],
    currentRefinement: js.Array[String],
    isFromSearch: Boolean,
    items: js.Array[HitcountnumberisRefinedbo],
    refine: js.Array[String] => CallbackTo[js.Any],
    searchForItems: /* repeated */ js.Any => CallbackTo[js.Any]
  ): RefinementListProvided = {
    val __obj = js.Dynamic.literal(canRefine = canRefine.asInstanceOf[js.Any], currentRefinement = currentRefinement.asInstanceOf[js.Any], isFromSearch = isFromSearch.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("createURL")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => createURL(t0).runNow()))
    __obj.updateDynamic("refine")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => refine(t0).runNow()))
    __obj.updateDynamic("searchForItems")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => searchForItems(t0).runNow()))
    __obj.asInstanceOf[RefinementListProvided]
  }
}

