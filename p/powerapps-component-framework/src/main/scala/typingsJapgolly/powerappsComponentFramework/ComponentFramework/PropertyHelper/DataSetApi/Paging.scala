package typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Paging state for a dataset
			 */
trait Paging extends js.Object {
  /**
  				 * Whether the result set can be paged forwards.
  				 */
  var hasNextPage: Boolean
  /**
  				 * Whether the result set can be paged backwards.
  				 */
  var hasPreviousPage: Boolean
  /**
  				 * Total number of results on the server for the current query.
  				 */
  var totalResultCount: Double
  /**
  				 * Request the next page of results to be loaded. New data will be pushed to control in another 'updateView' cycle.
  				 */
  def loadNextPage(): Unit
  /**
  				 * Request the previous page of results to be loaded. New data will be pushed to control in another 'updateView' cycle.
  				 */
  def loadPreviousPage(): Unit
  /**
  				 * Reload the results from the server, and reset to page 1.
  				 */
  def reset(): Unit
  /**
  				 * Sets the number of results to return per page on the next data refresh.
  				 * @pageSize pageSize to be set.
  				 */
  def setPageSize(pageSize: Double): Unit
}

object Paging {
  @scala.inline
  def apply(
    hasNextPage: Boolean,
    hasPreviousPage: Boolean,
    loadNextPage: Callback,
    loadPreviousPage: Callback,
    reset: Callback,
    setPageSize: Double => Callback,
    totalResultCount: Double
  ): Paging = {
    val __obj = js.Dynamic.literal(hasNextPage = hasNextPage.asInstanceOf[js.Any], hasPreviousPage = hasPreviousPage.asInstanceOf[js.Any], totalResultCount = totalResultCount.asInstanceOf[js.Any])
    __obj.updateDynamic("loadNextPage")(loadNextPage.toJsFn)
    __obj.updateDynamic("loadPreviousPage")(loadPreviousPage.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("setPageSize")(js.Any.fromFunction1((t0: scala.Double) => setPageSize(t0).runNow()))
    __obj.asInstanceOf[Paging]
  }
}

