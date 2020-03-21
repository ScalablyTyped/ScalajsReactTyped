package typingsJapgolly.dynatable.JQueryDynatable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Records extends js.Object {
  /**
    * Count records from table
    *
    * @return The length of the records Array
    */
  def count(): Double
  /**
    * Get initial recordset to populate table
    * if ajax, call ajaxUrl
    * otherwise, initialize from in-table records
    *
    * @return An Array with the records
    */
  def getFromTable(): js.Array[js.Object]
  /** Create and init the records */
  def init(): Unit
  /**
    * Check if ajax feature is enabled
    *
    * @return A boolean if ajax feature is enabled
    */
  def initOnLoad(): Boolean
  /**
    * Get the first and the last indexes based on current page and number of items per page
    *
    * @return An Array with the first index ([0]) and the last index ([1])
    */
  def pageBounds(): js.Array[Double]
  /** Update the records with the new page */
  def paginate(): Unit
  /** Reset the records */
  def resetOriginal(): Unit
  /**
    * Call the appropriated sort function
    *
    * @return The number (-1, 0 or +1) representing the comparison
    */
  def sort(): Double
  /**
    * Merge ajax response json with cached data including (meta-data and records)
    *
    * @param data The new data
    */
  def updateFromJson(data: js.Any): Unit
}

object Records {
  @scala.inline
  def apply(
    count: CallbackTo[Double],
    getFromTable: CallbackTo[js.Array[js.Object]],
    init: Callback,
    initOnLoad: CallbackTo[Boolean],
    pageBounds: CallbackTo[js.Array[Double]],
    paginate: Callback,
    resetOriginal: Callback,
    sort: CallbackTo[Double],
    updateFromJson: js.Any => Callback
  ): Records = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count.toJsFn)
    __obj.updateDynamic("getFromTable")(getFromTable.toJsFn)
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("initOnLoad")(initOnLoad.toJsFn)
    __obj.updateDynamic("pageBounds")(pageBounds.toJsFn)
    __obj.updateDynamic("paginate")(paginate.toJsFn)
    __obj.updateDynamic("resetOriginal")(resetOriginal.toJsFn)
    __obj.updateDynamic("sort")(sort.toJsFn)
    __obj.updateDynamic("updateFromJson")(js.Any.fromFunction1((t0: js.Any) => updateFromJson(t0).runNow()))
    __obj.asInstanceOf[Records]
  }
}

