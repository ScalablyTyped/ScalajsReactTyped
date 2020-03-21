package typingsJapgolly.reactInstantsearchCore.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactInstantsearchCore.AnonCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProvided extends js.Object {
  var currentRefinement: String
  var isFromSearch: Boolean
  var items: js.Array[AnonCount]
  def createURL(args: js.Any*): js.Any
  def refine(args: js.Any*): js.Any
  def searchForItems(args: js.Any*): js.Any
}

object MenuProvided {
  @scala.inline
  def apply(
    createURL: /* repeated */ js.Any => CallbackTo[js.Any],
    currentRefinement: String,
    isFromSearch: Boolean,
    items: js.Array[AnonCount],
    refine: /* repeated */ js.Any => CallbackTo[js.Any],
    searchForItems: /* repeated */ js.Any => CallbackTo[js.Any]
  ): MenuProvided = {
    val __obj = js.Dynamic.literal(currentRefinement = currentRefinement.asInstanceOf[js.Any], isFromSearch = isFromSearch.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("createURL")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => createURL(t0).runNow()))
    __obj.updateDynamic("refine")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => refine(t0).runNow()))
    __obj.updateDynamic("searchForItems")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => searchForItems(t0).runNow()))
    __obj.asInstanceOf[MenuProvided]
  }
}

