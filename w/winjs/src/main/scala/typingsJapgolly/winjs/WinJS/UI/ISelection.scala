package typingsJapgolly.winjs.WinJS.UI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a selection of ListView items.
  **/
trait ISelection[T] extends js.Object {
  //#region Methods
  /**
    * Adds one or more items to the selection.
    * @param items The indexes or keys of the items to add. You can provide different types of objects for the items parameter: you can specify an index, a key, or a range of indexes. It can also be an array that contains one or more of these objects. For more info, see the Remarks section.
    * @returns A Promise that is fulfilled when the operation completes.
    **/
  def add(items: js.Any): Promise[_]
  /**
    * Clears the selection.
    * @returns A Promise that is fulfilled when the clear operation completes.
    **/
  def clear(): Promise[_]
  /**
    * Returns the number of items in the selection.
    * @returns The number of items in the selection.
    **/
  def count(): Double
  /**
    * Returns a list of the indexes for the items in the selection.
    * @returns The list of indexes for the items in the selection as an array of Number objects.
    **/
  def getIndices(): js.Array[Double]
  /**
    * Returns an array that contains the items in the selection.
    * @returns A Promise that contains an array of the requested IItem objects.
    **/
  def getItems(): Promise[js.Array[IItem[T]]]
  /**
    * Gets an array of the index ranges for the selected items.
    * @returns An array that contains an ISelectionRange object for each index range in the selection.
    **/
  def getRanges(): js.Array[ISelectionRange]
  /**
    * Returns a value that indicates whether the selection contains every item in the data source.
    * @returns true if the selection contains every item in the data source; otherwise, false.
    **/
  def isEverything(): Boolean
  /**
    * Removes the specified items from the selection.
    * @param items The indexes or keys of the items to remove. You can provide different types of objects for the items parameter: you can specify an index, a key, or a range of indexes. It can also be an array that contains one or more of these objects. For more info, see the Remarks section.
    * @returns A Promise that is fulfilled when the operation completes.
    **/
  def remove(items: js.Any): Promise[_]
  /**
    * Adds all the items in the ListView to the selection.
    **/
  def selectAll(): Unit
  /**
    * Clears the current selection and replaces it with the specified items.
    * @param items The indexes or keys of the items that make up the selection. You can provide different types of objects for the items parameter: you can specify an index, a key, or a range of indexes. It can also be an array that contains one or more of these objects. For more info, see the Remarks section.
    * @returns A Promise that is fulfilled when the operation completes.
    **/
  def set(items: js.Any): Promise[_]
}

object ISelection {
  @scala.inline
  def apply[T](
    add: js.Any => CallbackTo[Promise[js.Any]],
    clear: CallbackTo[Promise[js.Any]],
    count: CallbackTo[Double],
    getIndices: CallbackTo[js.Array[Double]],
    getItems: CallbackTo[Promise[js.Array[IItem[T]]]],
    getRanges: CallbackTo[js.Array[ISelectionRange]],
    isEverything: CallbackTo[Boolean],
    remove: js.Any => CallbackTo[Promise[js.Any]],
    selectAll: Callback,
    set: js.Any => CallbackTo[Promise[js.Any]]
  ): ISelection[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: js.Any) => add(t0).runNow()))
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("count")(count.toJsFn)
    __obj.updateDynamic("getIndices")(getIndices.toJsFn)
    __obj.updateDynamic("getItems")(getItems.toJsFn)
    __obj.updateDynamic("getRanges")(getRanges.toJsFn)
    __obj.updateDynamic("isEverything")(isEverything.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: js.Any) => remove(t0).runNow()))
    __obj.updateDynamic("selectAll")(selectAll.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: js.Any) => set(t0).runNow()))
    __obj.asInstanceOf[ISelection[T]]
  }
}

