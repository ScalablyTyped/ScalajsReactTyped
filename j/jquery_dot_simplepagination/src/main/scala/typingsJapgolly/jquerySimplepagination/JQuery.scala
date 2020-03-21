package typingsJapgolly.jquerySimplepagination

import typingsJapgolly.jquerySimplepagination.jquerySimplepaginationStrings.destroy
import typingsJapgolly.jquerySimplepagination.jquerySimplepaginationStrings.disable
import typingsJapgolly.jquerySimplepagination.jquerySimplepaginationStrings.drawPage
import typingsJapgolly.jquerySimplepagination.jquerySimplepaginationStrings.enable
import typingsJapgolly.jquerySimplepagination.jquerySimplepaginationStrings.getCurrentPage
import typingsJapgolly.jquerySimplepagination.jquerySimplepaginationStrings.getItemsOnPage
import typingsJapgolly.jquerySimplepagination.jquerySimplepaginationStrings.getPagesCount
import typingsJapgolly.jquerySimplepagination.jquerySimplepaginationStrings.nextPage
import typingsJapgolly.jquerySimplepagination.jquerySimplepaginationStrings.prevPage
import typingsJapgolly.jquerySimplepagination.jquerySimplepaginationStrings.redraw
import typingsJapgolly.jquerySimplepagination.jquerySimplepaginationStrings.selectPage
import typingsJapgolly.jquerySimplepagination.jquerySimplepaginationStrings.setPagesCount
import typingsJapgolly.jquerySimplepagination.jquerySimplepaginationStrings.updateItems
import typingsJapgolly.jquerySimplepagination.jquerySimplepaginationStrings.updateItemsOnPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def pagination(): JQuery = js.native
  def pagination(method: String): js.Any = js.native
  def pagination(method: String, value: js.Any): js.Any = js.native
  def pagination(options: SimplePaginationOptions): JQuery = js.native
  /**
    * destroy - Visually destroys the pagination, any existing settings are kept.
    * 
    * @param destroy
    * @returns {JQuery} 
    * @memberof JQuery
    */
  @JSName("pagination")
  def pagination_destroy(method: destroy): JQuery = js.native
  /**
    * disable - Disables pagination functionality.
    * 
    * @param disable
    * @returns {JQuery} 
    * @memberof JQuery
    */
  @JSName("pagination")
  def pagination_disable(method: disable): JQuery = js.native
  /**
    * drawPage - takes a page number as a parameter and it sets the "currentPage" value to the given page number and draws the pagination
    * 
    * @param drawPage
    * @param {number} pageNumber 
    * @returns {JQuery} 
    * @memberof JQuery
    */
  @JSName("pagination")
  def pagination_drawPage(method: drawPage, pageNumber: Double): JQuery = js.native
  /**
    * enable - Enables the pagination after it was previously disabled.
    * 
    * @param enable
    * @returns {JQuery} 
    * @memberof JQuery
    */
  @JSName("pagination")
  def pagination_enable(method: enable): JQuery = js.native
  /**
    * getCurrentPage - Returns the current page number.
    * 
    * @param getCurrentPage
    * @returns {number} 
    * @memberof JQuery
    */
  @JSName("pagination")
  def pagination_getCurrentPage(method: getCurrentPage): Double = js.native
  @JSName("pagination")
  def pagination_getItemsOnPage(method: getItemsOnPage): Double = js.native
  /**
    * getPagesCount - Returns the total number of pages.
    * 
    * @param getPagesCount
    * @returns {number} 
    * @memberof JQuery
    */
  @JSName("pagination")
  def pagination_getPagesCount(method: getPagesCount): Double = js.native
  /**
    * nextPage - Select the next page.
    * 
    * @param nextPage
    * @returns {JQuery} 
    * @memberof JQuery
    */
  @JSName("pagination")
  def pagination_nextPage(method: nextPage): JQuery = js.native
  /**
    * prevPage - Selects the previous page.
    * 
    * @param prevPage
    * @returns {JQuery} 
    * @memberof JQuery
    */
  @JSName("pagination")
  def pagination_prevPage(method: prevPage): JQuery = js.native
  /**
    * redraw - The pagination is drawn again using the existing settings. (useful after you have destroyed a pagination for example)
    * 
    * @param redraw
    * @returns {JQuery} 
    * @memberof JQuery
    */
  @JSName("pagination")
  def pagination_redraw(method: redraw): JQuery = js.native
  @JSName("pagination")
  def pagination_selectPage(method: selectPage): JQuery = js.native
  /**
    * selectPage - Select a page based on page number.
    * 
    * @param selectPage
    * @param {number} pageNumber 
    * @memberof JQuery
    */
  @JSName("pagination")
  def pagination_selectPage(method: selectPage, pageNumber: Double): Unit = js.native
  @JSName("pagination")
  def pagination_setPagesCount(method: setPagesCount, count: Double): Unit = js.native
  /**
    * updateItems - allows to dynamically change how many items are rendered by the pagination
    * 
    * @param updateItems
    * @param {number} items 
    * @memberof JQuery
    */
  @JSName("pagination")
  def pagination_updateItems(method: updateItems, items: Double): Unit = js.native
  /**
    * updateItemsOnPage - allows to dynamically change how many items are rendered on each page
    * 
    * @param updateItemsOnPage
    * @param {number} itemsOnPage 
    * @returns {JQuery} 
    * @memberof JQuery
    */
  @JSName("pagination")
  def pagination_updateItemsOnPage(method: updateItemsOnPage, itemsOnPage: Double): JQuery = js.native
}

