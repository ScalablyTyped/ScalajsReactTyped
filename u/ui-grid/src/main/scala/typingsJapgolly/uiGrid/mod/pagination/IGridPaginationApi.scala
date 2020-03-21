package typingsJapgolly.uiGrid.mod.pagination

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.uiGrid.AnonPaginationChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridPaginationApi extends js.Object {
  // Events
  var on: AnonPaginationChanged
  // Methods
  /**
    * Get the current page
    * @returns {number} the number of the current page
    */
  def getPage(): Double
  /**
    * Get the total number of pages
    * @returns {number} the total number of pages
    */
  def getTotalPages(): Double
  /**
    * Moves to the next page if possible
    */
  def nextPage(): Unit
  /**
    * Moves to the previous page if we're not on the first page.
    */
  def previousPage(): Unit
  /**
    * Moves to the requested page
    * @param {number} page The number of the page that should be displayed
    */
  def seek(page: Double): Unit
}

object IGridPaginationApi {
  @scala.inline
  def apply(
    getPage: CallbackTo[Double],
    getTotalPages: CallbackTo[Double],
    nextPage: Callback,
    on: AnonPaginationChanged,
    previousPage: Callback,
    seek: Double => Callback
  ): IGridPaginationApi = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    __obj.updateDynamic("getPage")(getPage.toJsFn)
    __obj.updateDynamic("getTotalPages")(getTotalPages.toJsFn)
    __obj.updateDynamic("nextPage")(nextPage.toJsFn)
    __obj.updateDynamic("previousPage")(previousPage.toJsFn)
    __obj.updateDynamic("seek")(js.Any.fromFunction1((t0: scala.Double) => seek(t0).runNow()))
    __obj.asInstanceOf[IGridPaginationApi]
  }
}

