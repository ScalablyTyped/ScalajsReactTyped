package typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Filter state for a dataset.
			 */
trait Filtering extends js.Object {
  /**
  				 * Clears the filter associated with the data-set.
  				 */
  def clearFilter(): Unit
  /**
  				 * Returns the top-most filter associated with the data-set
  				 */
  def getFilter(): FilterExpression
  /**
  				 * Sets the top-most filter associated with the data-set
  				 * @expression filter expression to be set
  				 */
  def setFilter(expression: FilterExpression): Unit
}

object Filtering {
  @scala.inline
  def apply(
    clearFilter: Callback,
    getFilter: CallbackTo[FilterExpression],
    setFilter: FilterExpression => Callback
  ): Filtering = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearFilter")(clearFilter.toJsFn)
    __obj.updateDynamic("getFilter")(getFilter.toJsFn)
    __obj.updateDynamic("setFilter")(js.Any.fromFunction1((t0: typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.FilterExpression) => setFilter(t0).runNow()))
    __obj.asInstanceOf[Filtering]
  }
}

