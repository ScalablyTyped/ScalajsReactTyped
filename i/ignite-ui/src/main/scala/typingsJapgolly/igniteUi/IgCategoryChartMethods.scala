package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgCategoryChartMethods extends js.Object {
  /**
  	 * Adds a new item to the data source and notifies the chart.
  	 *
  	 * @param item The item that we want to add to the data source.
  	 */
  def addItem(item: js.Object): js.Object
  /**
  	 * Get reference to chart object.
  	 */
  def chart(): js.Object
  /**
  	 * Binds data to the chart
  	 */
  def dataBind(): Unit
  def destroy(): Unit
  def exportVisualData(): Unit
  /**
  	 * Find index of item within actual data used by chart.
  	 *
  	 * @param item The reference to item.
  	 */
  def findIndexOfItem(item: js.Object): Double
  /**
  	 * Forces any pending deferred work to render on the chart before continuing
  	 */
  def flush(): Unit
  /**
  	 * Get reference of actual data used by chart.
  	 */
  def getData(): js.Array[_]
  /**
  	 * Get item within actual data used by chart. That is similar to this.getData()[ index ].
  	 *
  	 * @param index Index of data item.
  	 */
  def getDataItem(index: js.Object): js.Object
  def id(): Unit
  /**
  	 * Inserts a new item to the data source and notifies the chart.
  	 *
  	 * @param item the new item that we want to insert in the data source.
  	 * @param index The index in the data source where the new item will be inserted.
  	 */
  def insertItem(item: js.Object, index: Double): js.Object
  /**
  	 * Notifies the chart that the items have been cleared from an associated data source.
  	 * It's not necessary to notify more than one target of a change if they share the same items source.
  	 *
  	 * @param dataSource The data source in which the change happened.
  	 */
  def notifyClearItems(dataSource: js.Object): js.Object
  /**
  	 * Notifies the target axis or series that an item has been inserted at the specified index in its data source.
  	 * It's not necessary to notify more than one target of a change if they share the same items source.
  	 *
  	 * @param dataSource The data source in which the change happened.
  	 * @param index The index in the items source where the new item has been inserted.
  	 * @param newItem the new item that has been set in the collection.
  	 */
  def notifyInsertItem(dataSource: js.Object, index: Double, newItem: js.Object): js.Object
  /**
  	 * Notifies the target axis or series that an item has been removed from the specified index in its data source.
  	 * It's not necessary to notify more than one target of a change if they share the same items source.
  	 *
  	 * @param dataSource The data source in which the change happened.
  	 * @param index The index in the items source from where the old item has been removed.
  	 * @param oldItem the old item that has been removed from the collection.
  	 */
  def notifyRemoveItem(dataSource: js.Object, index: Double, oldItem: js.Object): js.Object
  /**
  	 * Notifies the chart that an item has been set in an associated data source.
  	 *
  	 * @param dataSource The data source in which the change happened.
  	 * @param index The index in the items source that has been changed.
  	 * @param newItem the new item that has been set in the collection.
  	 * @param oldItem the old item that has been overwritten in the collection.
  	 */
  def notifySetItem(dataSource: js.Object, index: Double, newItem: js.Object, oldItem: js.Object): js.Object
  /**
  	 * Deletes an item from the data source and notifies the chart.
  	 *
  	 * @param index The index in the data source from where the item will be been removed.
  	 */
  def removeItem(index: Double): js.Object
  /**
  	 * Updates an item in the data source and notifies the chart.
  	 *
  	 * @param index The index of the item in the data source that we want to change.
  	 * @param item The new item object that will be set in the data source.
  	 */
  def setItem(index: Double, item: js.Object): js.Object
}

object IgCategoryChartMethods {
  @scala.inline
  def apply(
    addItem: js.Object => CallbackTo[js.Object],
    chart: CallbackTo[js.Object],
    dataBind: Callback,
    destroy: Callback,
    exportVisualData: Callback,
    findIndexOfItem: js.Object => CallbackTo[Double],
    flush: Callback,
    getData: CallbackTo[js.Array[js.Any]],
    getDataItem: js.Object => CallbackTo[js.Object],
    id: Callback,
    insertItem: (js.Object, Double) => CallbackTo[js.Object],
    notifyClearItems: js.Object => CallbackTo[js.Object],
    notifyInsertItem: (js.Object, Double, js.Object) => CallbackTo[js.Object],
    notifyRemoveItem: (js.Object, Double, js.Object) => CallbackTo[js.Object],
    notifySetItem: (js.Object, Double, js.Object, js.Object) => CallbackTo[js.Object],
    removeItem: Double => CallbackTo[js.Object],
    setItem: (Double, js.Object) => CallbackTo[js.Object]
  ): IgCategoryChartMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addItem")(js.Any.fromFunction1((t0: js.Object) => addItem(t0).runNow()))
    __obj.updateDynamic("chart")(chart.toJsFn)
    __obj.updateDynamic("dataBind")(dataBind.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("exportVisualData")(exportVisualData.toJsFn)
    __obj.updateDynamic("findIndexOfItem")(js.Any.fromFunction1((t0: js.Object) => findIndexOfItem(t0).runNow()))
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.updateDynamic("getData")(getData.toJsFn)
    __obj.updateDynamic("getDataItem")(js.Any.fromFunction1((t0: js.Object) => getDataItem(t0).runNow()))
    __obj.updateDynamic("id")(id.toJsFn)
    __obj.updateDynamic("insertItem")(js.Any.fromFunction2((t0: js.Object, t1: scala.Double) => insertItem(t0, t1).runNow()))
    __obj.updateDynamic("notifyClearItems")(js.Any.fromFunction1((t0: js.Object) => notifyClearItems(t0).runNow()))
    __obj.updateDynamic("notifyInsertItem")(js.Any.fromFunction3((t0: js.Object, t1: scala.Double, t2: js.Object) => notifyInsertItem(t0, t1, t2).runNow()))
    __obj.updateDynamic("notifyRemoveItem")(js.Any.fromFunction3((t0: js.Object, t1: scala.Double, t2: js.Object) => notifyRemoveItem(t0, t1, t2).runNow()))
    __obj.updateDynamic("notifySetItem")(js.Any.fromFunction4((t0: js.Object, t1: scala.Double, t2: js.Object, t3: js.Object) => notifySetItem(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("removeItem")(js.Any.fromFunction1((t0: scala.Double) => removeItem(t0).runNow()))
    __obj.updateDynamic("setItem")(js.Any.fromFunction2((t0: scala.Double, t1: js.Object) => setItem(t0, t1).runNow()))
    __obj.asInstanceOf[IgCategoryChartMethods]
  }
}

