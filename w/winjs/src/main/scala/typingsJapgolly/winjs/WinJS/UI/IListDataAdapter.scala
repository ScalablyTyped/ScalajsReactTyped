package typingsJapgolly.winjs.WinJS.UI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Accesses data for an IListDataSource.
  **/
trait IListDataAdapter[T] extends js.Object {
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets a value that specifies whether to use an object's identity to determine if an item has changed.
    **/
  var compareByIdentity: Boolean
  //#region Methods
  /**
    * Overwrites the data of the specified item.
    * @param key The key of the item to overwrite.
    * @param newData The new data for the item.
    * @param indexHint The index of the item, if known.
    * @returns A Promise that returns null or undefined when the operation completes.
    **/
  def change(key: String, newData: T, indexHint: Double): Promise[Unit]
  /**
    * Gets the number of items in the IListDataAdapter object's data source.
    * @returns A Promise that contains the number of items the IListDataAdapter contains, or an approximate value if the actual number is unknown.
    **/
  def getCount(): Promise[Double]
  /**
    * Inserts the specified data after the specified item.
    * @param key A key that can be used to retrieve the new data.
    * @param data The new data to add to the IListDataAdapter object's data source.
    * @param previousKey The key of an item in the IListDataAdapter object's data source. The new data will be inserted after this item.
    * @param previousIndexHint The index of the item to insert the new data after, if known.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def insertAfter(key: String, data: T, previousKey: String, previousIndexHint: Double): Promise[IItem[T]]
  /**
    * Adds the specified key and data to the end of the IListDataAdapter object's data source.
    * @param key A key that can be used to retrieve the new data.
    * @param data The new data to add to the IListDataAdapter object's data source.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def insertAtEnd(key: String, data: T): Promise[IItem[T]]
  /**
    * Adds the specified key and data to the beginning of the IListDataAdapter object's data source.
    * @param key A key that can be used to retrieve the new data.
    * @param data The new data to add to the IListDataAdapter object's data source.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def insertAtStart(key: String, data: T): Promise[IItem[T]]
  /**
    * Inserts the specified data before the specified item.
    * @param key A key that can be used to retrieve the new data.
    * @param data The new data to add to the IListDataAdapter object's data source.
    * @param nextKey The key of an item in the IListDataAdapter object's data source. The new data will be inserted before this item.
    * @param nextIndexHint The index of the item to insert the new data before, if known.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def insertBefore(key: String, data: T, nextKey: String, nextIndexHint: Double): Promise[IItem[T]]
  /**
    * Returns a string representation of the specified item that can be used for comparisons.
    * @param item The item for which to generate a signature.
    * @returns The signature representation of the specified item.
    **/
  def itemSignature(item: IItem[T]): String
  /**
    * Retrieves the item that matches the specified description and also retrieves the specified number of items before and after the matched item.
    * @param description A description of the item to locate.
    * @param countBefore The number of items before the matched item to retrieve.
    * @param countAfter The number of items after the matched item to retrieve.
    * @returns A Promise that provides an IFetchResult that contains the selected items or a FetchError if an error was encountered.
    **/
  def itemsFromDescription(description: String, countBefore: Double, countAfter: Double): Promise[IFetchResult[T]]
  /**
    * Retrieves the specified number of items from the end of the IListDataAdapter object's data source.
    * @param count The number of items to retrieve.
    * @returns A Promise that provides an IFetchResult that contains the selected items or a FetchError if an error was encountered.
    **/
  def itemsFromEnd(count: Double): Promise[IFetchResult[T]]
  /**
    * Retrieves the item at the specified index and also retrieves the specified number of items before and after the selected item.
    * @param index The index of the item to retrieve.
    * @param countBefore The number of items to retrieve from before the selected item.
    * @param countAfter The number of items to retrieve from after the selected item.
    * @returns A Promise that provides an IFetchResult that contains the selected items or a FetchError if an error was encountered.
    **/
  def itemsFromIndex(index: Double, countBefore: Double, countAfter: Double): Promise[IFetchResult[T]]
  /**
    * Retrieves the item that has the specified key and also retrieves the specified number of items before and after the selected item.
    * @param key The key of the item to retrieve.
    * @param countBefore The number of items to retrieve from before the selected item.
    * @param countAfter The number of items to retrieve from after the selected item.
    * @returns A Promise that provides an IFetchResult that contains the selected items or a FetchError if an error was encountered.
    **/
  def itemsFromKey(key: String, countBefore: Double, countAfter: Double): Promise[IFetchResult[T]]
  /**
    * Retrieves the specified number of items from the beginning of the IListDataAdapter object's data source.
    * @param count The number of items to retrieve.
    * @returns A Promise that provides an IFetchResult that contains the selected items or a FetchError if an error was encountered.
    **/
  def itemsFromStart(count: Double): Promise[IFetchResult[T]]
  /**
    * Moves the specified item to just after another item.
    * @param key A key of the item to move.
    * @param previousKey The key of another item. The item to move will be moved to just after this item.
    * @param indexHint The index of the item to move, if known.
    * @param previousIndexHint The index to move the item after, if known.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def moveAfter(key: String, previousKey: js.Any, indexHint: String, previousIndexHint: Double): Promise[IItem[T]]
  /**
    * Moves the specified item to just before another item.
    * @param key A key of the item to move.
    * @param nextKey The key of another item. The item to move will be moved to just before this item.
    * @param indexHint The index of the item to move, if known.
    * @param nextIndexHint The index to move the item before, if known.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def moveBefore(key: String, nextKey: js.Any, indexHint: String, nextIndexHint: Double): Promise[IItem[T]]
  /**
    * Moves the specified item to the end of the IListDataAdapter object's data source.
    * @param key The key for the item to move.
    * @param indexHint The index of the item to move, if known.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def moveToEnd(key: String, indexHint: Double): Promise[IItem[T]]
  /**
    * Moves the specified item to the beginning of the IListDataAdapter object's data source.
    * @param key The key for the item to move.
    * @param indexHint The index of the item to move, if known.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def moveToStart(key: String, indexHint: Double): Promise[IItem[T]]
  /**
    * Removes the specified item from the IListDataAdapter object's data source.
    * @param key The key of the item to remove.
    * @param data The new data for the item.
    * @param indexHint The index of the item.
    * @returns A Promise that returns null or undefined when the operation completes.
    **/
  def remove(key: String, data: T, indexHint: Double): Promise[Unit]
  /**
    * Registers a notification handler. The IListDataAdapter uses the handler to notify listening objects when its data changes.
    * @param notificationHandler The notification handler that the IListDataAdapter will use to provide change notifications. .
    **/
  def setNotificationHandler(notificationHandler: IListDataNotificationHandler[T]): Unit
}

object IListDataAdapter {
  @scala.inline
  def apply[T](
    change: (String, T, Double) => CallbackTo[Promise[Unit]],
    compareByIdentity: Boolean,
    getCount: CallbackTo[Promise[Double]],
    insertAfter: (String, T, String, Double) => CallbackTo[Promise[IItem[T]]],
    insertAtEnd: (String, T) => CallbackTo[Promise[IItem[T]]],
    insertAtStart: (String, T) => CallbackTo[Promise[IItem[T]]],
    insertBefore: (String, T, String, Double) => CallbackTo[Promise[IItem[T]]],
    itemSignature: IItem[T] => CallbackTo[String],
    itemsFromDescription: (String, Double, Double) => CallbackTo[Promise[IFetchResult[T]]],
    itemsFromEnd: Double => CallbackTo[Promise[IFetchResult[T]]],
    itemsFromIndex: (Double, Double, Double) => CallbackTo[Promise[IFetchResult[T]]],
    itemsFromKey: (String, Double, Double) => CallbackTo[Promise[IFetchResult[T]]],
    itemsFromStart: Double => CallbackTo[Promise[IFetchResult[T]]],
    moveAfter: (String, js.Any, String, Double) => CallbackTo[Promise[IItem[T]]],
    moveBefore: (String, js.Any, String, Double) => CallbackTo[Promise[IItem[T]]],
    moveToEnd: (String, Double) => CallbackTo[Promise[IItem[T]]],
    moveToStart: (String, Double) => CallbackTo[Promise[IItem[T]]],
    remove: (String, T, Double) => CallbackTo[Promise[Unit]],
    setNotificationHandler: IListDataNotificationHandler[T] => Callback
  ): IListDataAdapter[T] = {
    val __obj = js.Dynamic.literal(compareByIdentity = compareByIdentity.asInstanceOf[js.Any])
    __obj.updateDynamic("change")(js.Any.fromFunction3((t0: java.lang.String, t1: T, t2: scala.Double) => change(t0, t1, t2).runNow()))
    __obj.updateDynamic("getCount")(getCount.toJsFn)
    __obj.updateDynamic("insertAfter")(js.Any.fromFunction4((t0: java.lang.String, t1: T, t2: java.lang.String, t3: scala.Double) => insertAfter(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("insertAtEnd")(js.Any.fromFunction2((t0: java.lang.String, t1: T) => insertAtEnd(t0, t1).runNow()))
    __obj.updateDynamic("insertAtStart")(js.Any.fromFunction2((t0: java.lang.String, t1: T) => insertAtStart(t0, t1).runNow()))
    __obj.updateDynamic("insertBefore")(js.Any.fromFunction4((t0: java.lang.String, t1: T, t2: java.lang.String, t3: scala.Double) => insertBefore(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("itemSignature")(js.Any.fromFunction1((t0: typingsJapgolly.winjs.WinJS.UI.IItem[T]) => itemSignature(t0).runNow()))
    __obj.updateDynamic("itemsFromDescription")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: scala.Double) => itemsFromDescription(t0, t1, t2).runNow()))
    __obj.updateDynamic("itemsFromEnd")(js.Any.fromFunction1((t0: scala.Double) => itemsFromEnd(t0).runNow()))
    __obj.updateDynamic("itemsFromIndex")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => itemsFromIndex(t0, t1, t2).runNow()))
    __obj.updateDynamic("itemsFromKey")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: scala.Double) => itemsFromKey(t0, t1, t2).runNow()))
    __obj.updateDynamic("itemsFromStart")(js.Any.fromFunction1((t0: scala.Double) => itemsFromStart(t0).runNow()))
    __obj.updateDynamic("moveAfter")(js.Any.fromFunction4((t0: java.lang.String, t1: js.Any, t2: java.lang.String, t3: scala.Double) => moveAfter(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("moveBefore")(js.Any.fromFunction4((t0: java.lang.String, t1: js.Any, t2: java.lang.String, t3: scala.Double) => moveBefore(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("moveToEnd")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => moveToEnd(t0, t1).runNow()))
    __obj.updateDynamic("moveToStart")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => moveToStart(t0, t1).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction3((t0: java.lang.String, t1: T, t2: scala.Double) => remove(t0, t1, t2).runNow()))
    __obj.updateDynamic("setNotificationHandler")(js.Any.fromFunction1((t0: typingsJapgolly.winjs.WinJS.UI.IListDataNotificationHandler[T]) => setNotificationHandler(t0).runNow()))
    __obj.asInstanceOf[IListDataAdapter[T]]
  }
}

