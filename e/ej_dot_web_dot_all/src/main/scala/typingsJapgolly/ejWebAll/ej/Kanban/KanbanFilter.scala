package typingsJapgolly.ejWebAll.ej.Kanban

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KanbanFilter extends js.Object {
  /** Send a clear request to filter cards in the kanban.
    * @returns {void}
    */
  def clearFilter(): Unit
  /** Method used for send a clear search request to Kanban.
    * @returns {void}
    */
  def clearSearch(): Unit
  /** Send a filtering request to cards in the kanban.
    * @returns {void}
    */
  def filterCards(): Unit
  /** Send a search request to Kanban with specified string passed in it.
    * @param {string} Pass the string to search in Kanban card
    * @returns {void}
    */
  def searchCards(searchString: String): Unit
}

object KanbanFilter {
  @scala.inline
  def apply(
    clearFilter: Callback,
    clearSearch: Callback,
    filterCards: Callback,
    searchCards: String => Callback
  ): KanbanFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearFilter")(clearFilter.toJsFn)
    __obj.updateDynamic("clearSearch")(clearSearch.toJsFn)
    __obj.updateDynamic("filterCards")(filterCards.toJsFn)
    __obj.updateDynamic("searchCards")(js.Any.fromFunction1((t0: java.lang.String) => searchCards(t0).runNow()))
    __obj.asInstanceOf[KanbanFilter]
  }
}

