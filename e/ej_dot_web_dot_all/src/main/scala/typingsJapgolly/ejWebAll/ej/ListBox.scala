package typingsJapgolly.ejWebAll.ej

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBox
  extends StObject
     with Widget_ {
  
  def addItem(listItem: String, index: Double): Unit = js.native
  /** Adds a given list items in the ListBox widget at a specified index. It accepts two parameters.
    * @param {any|string} This can be a list item object (for JSON binding) or a string (for UL and LI rendering). Also we can the specify this as an array of list item object or an
    * array of strings to add multiple items.
    * @param {number} The index value to add the given items at the specified index. If index is not specified, the given items will be added at the end of the list.
    * @returns {void}
    */
  def addItem(listItem: Any, index: Double): Unit = js.native
  
  /** Checks all the list items in the ListBox widget. It is dependent on showCheckbox property.
    * @returns {void}
    */
  def checkAll(): Unit = js.native
  
  /** Checks a list item by using its index. It is dependent on showCheckbox property.
    * @param {number} Index of the listbox item to be checked. If index is not specified, the given items will be added at the end of the list.
    * @returns {void}
    */
  def checkItemByIndex(index: Double): Unit = js.native
  
  /** Checks multiple list items by using its index values. It is dependent on showCheckbox property.
    * @param {number[]} Index/Indices of the listbox items to be checked. If index is not specified, the given items will be added at the end of the list.
    * @returns {void}
    */
  def checkItemsByIndices(indices: js.Array[Double]): Unit = js.native
  
  var defaults: Model = js.native
  
  /** Disables the ListBox widget.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** Disables a list item by passing the item text as parameter.
    * @param {string} Text of the listbox item to be disabled.
    * @returns {void}
    */
  def disableItem(text: String): Unit = js.native
  
  /** Disables a list Item using its index value.
    * @param {number} Index of the listbox item to be disabled.
    * @returns {void}
    */
  def disableItemByIndex(index: Double): Unit = js.native
  
  def disableItemsByIndices(Indices: String): Unit = js.native
  /** Disables set of list Items using its index values.
    * @param {number[]|string} Indices of the listbox items to be disabled.
    * @returns {void}
    */
  def disableItemsByIndices(Indices: js.Array[Double]): Unit = js.native
  
  /** Enables the ListBox widget when it is disabled.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** Enables a list Item using its item text value.
    * @param {string} Text of the listbox item to be enabled.
    * @returns {void}
    */
  def enableItem(text: String): Unit = js.native
  
  /** Enables a list item using its index value.
    * @param {number} Index of the listbox item to be enabled.
    * @returns {void}
    */
  def enableItemByIndex(index: Double): Unit = js.native
  
  def enableItemsByIndices(indices: String): Unit = js.native
  /** Enables a set of list Items using its index values.
    * @param {number[]|string} Indices of the listbox items to be enabled.
    * @returns {void}
    */
  def enableItemsByIndices(indices: js.Array[Double]): Unit = js.native
  
  /** Returns the list of checked items in the ListBox widget. It is dependent on showCheckbox property.
    * @returns {any}
    */
  def getCheckedItems(): Any = js.native
  
  /** Returns an itemâ€™s index based on the given text.
    * @param {string} The list item text (label)
    * @returns {number}
    */
  def getIndexByText(text: String): Double = js.native
  
  /** Returns an itemâ€™s index based on the value given.
    * @param {string} The list itemâ€™s value
    * @returns {number}
    */
  def getIndexByValue(indices: String): Double = js.native
  
  /** Returns a list itemâ€™s object using its index.
    * @returns {any}
    */
  def getItemByIndex(): Any = js.native
  
  /** Returns a list itemâ€™s object based on the text given.
    * @param {string} The list item text.
    * @returns {any}
    */
  def getItemByText(text: String): Any = js.native
  
  /** Returns the list of selected items in the ListBox widget.
    * @returns {any}
    */
  def getSelectedItems(): Any = js.native
  
  /** Returns an itemâ€™s text (label) based on the index given.
    * @returns {string}
    */
  def getTextByIndex(): String = js.native
  
  /** Hides the listbox.
    * @returns {void}
    */
  def hide(): Unit = js.native
  
  /** Hides all the listbox items in the listbox.
    * @returns {void}
    */
  def hideAllItems(): Unit = js.native
  
  /** Hides all the checked items in the listbox.
    * @returns {void}
    */
  def hideCheckedItems(): Unit = js.native
  
  /** Hides a list item using its index value.
    * @param {number} Index of the listbox item to be hidden.
    * @returns {void}
    */
  def hideItemByIndex(index: Double): Unit = js.native
  
  /** Hide a list item using its value.
    * @param {string} Value of the listbox item to be hidden.
    * @returns {void}
    */
  def hideItemByValue(value: String): Unit = js.native
  
  def hideItemsByIndices(indices: String): Unit = js.native
  /** Hides a set of list Items using its index values.
    * @param {number[]|string} Indices of the listbox items to be hidden.
    * @returns {void}
    */
  def hideItemsByIndices(indices: js.Array[Double]): Unit = js.native
  
  /** Hides the list item using its values.
    * @param {any[]} Values of the listbox items to be hidden.
    * @returns {void}
    */
  def hideItemsByValues(values: js.Array[Any]): Unit = js.native
  
  /** Merges the given data with the existing data items in the listbox.
    * @param {any[]} Data to merge in listbox.
    * @returns {void}
    */
  def mergeData(data: js.Array[Any]): Unit = js.native
  
  @JSName("model")
  var model_ListBox: Model = js.native
  
  /** Selects the next item based on the current selection.
    * @returns {void}
    */
  def moveDown(): Unit = js.native
  
  /** Selects the previous item based on the current selection.
    * @returns {void}
    */
  def moveUp(): Unit = js.native
  
  /** Refreshes the ListBox widget.
    * @param {boolean} Refreshes both the datasource and the dimensions of the ListBox widget when the parameter is passed as true, otherwise only the ListBox dimensions will be
    * refreshed.
    * @returns {void}
    */
  def refresh(refreshData: Boolean): Unit = js.native
  
  /** Removes all the list items from listbox.
    * @returns {void}
    */
  def removeAll(): Unit = js.native
  
  /** Removes a list item by using its index value.
    * @param {number} Index of the listbox item to be removed.
    * @returns {void}
    */
  def removeItemByIndex(index: Double): Unit = js.native
  
  /** Removes a list item by using its text.
    * @param {string} Text of the listbox item to be removed.
    * @returns {void}
    */
  def removeItemByText(text: String): Unit = js.native
  
  /** Removes the selected list items from the listbox.
    * @returns {void}
    */
  def removeSelectedItems(): Unit = js.native
  
  /**
    * @returns {void}
    */
  def selectAll(): Unit = js.native
  
  /** Selects list item using its index value.
    * @param {number} Index of the listbox item to be selected.
    * @returns {void}
    */
  def selectItemByIndex(index: Double): Unit = js.native
  
  /** Selects the list item using its text value.
    * @param {string} Text of the listbox item to be selected.
    * @returns {void}
    */
  def selectItemByText(text: String): Unit = js.native
  
  /** Selects list item using its value property.
    * @param {string} Value of the listbox item to be selected.
    * @returns {void}
    */
  def selectItemByValue(value: String): Unit = js.native
  
  def selectItemsByIndices(Indices: js.Array[Double]): Unit = js.native
  /** Selects a set of list items through its index values.
    * @param {number|number[]} Index/Indices of the listbox item to be selected.
    * @returns {void}
    */
  def selectItemsByIndices(Indices: Double): Unit = js.native
  
  /**
    * @returns {void}
    */
  def show(): Unit = js.native
  
  /** Shows all the listbox items in the listbox.
    * @returns {void}
    */
  def showAllItems(): Unit = js.native
  
  /** Shows a hidden list item using its index value.
    * @param {number} Index of the listbox item to be shown.
    * @returns {void}
    */
  def showItemByIndex(index: Double): Unit = js.native
  
  def showItemByIndices(indices: String): Unit = js.native
  /** Shows a set of hidden list Items using its index values.
    * @param {number[]|string} Indices of the listbox items to be shown.
    * @returns {void}
    */
  def showItemByIndices(indices: js.Array[Double]): Unit = js.native
  
  /** Shows a hidden list item using its value.
    * @param {string} Value of the listbox item to be shown.
    * @returns {void}
    */
  def showItemByValue(value: String): Unit = js.native
  
  /** Shows the hidden list items using its values.
    * @param {any[]} Values of the listbox items to be shown.
    * @returns {void}
    */
  def showItemsByValues(values: js.Array[Any]): Unit = js.native
  
  /** Unchecks all the checked list items in the ListBox widget. To use this method showCheckbox property to be set as true.
    * @returns {void}
    */
  def uncheckAll(): Unit = js.native
  
  /** Unchecks a checked list item using its index value. To use this method showCheckbox property to be set as true.
    * @param {number} Index of the listbox item to be unchecked.
    * @returns {void}
    */
  def uncheckItemByIndex(index: Double): Unit = js.native
  
  def uncheckItemsByIndices(indices: String): Unit = js.native
  /** Unchecks the set of checked list items using its index values. To use this method showCheckbox property must be set to true.
    * @param {number[]|string} Indices of the listbox item to be unchecked.
    * @returns {void}
    */
  def uncheckItemsByIndices(indices: js.Array[Double]): Unit = js.native
  
  /**
    * @returns {void}
    */
  def unselectAll(): Unit = js.native
  
  /** Unselects a selected list item using its index value
    * @param {number} Index of the listbox item to be unselected.
    * @returns {void}
    */
  def unselectItemByIndex(index: Double): Unit = js.native
  
  /** Unselects a selected list item using its text value.
    * @param {string} Text of the listbox item to be unselected.
    * @returns {void}
    */
  def unselectItemByText(text: String): Unit = js.native
  
  /** Unselects a selected list item using its value.
    * @param {string} Value of the listbox item to be unselected.
    * @returns {void}
    */
  def unselectItemByValue(value: String): Unit = js.native
  
  def unselectItemsByIndices(indices: String): Unit = js.native
  /** Unselects a set of list items using its index values.
    * @param {number[]|string} Indices of the listbox item to be unselected.
    * @returns {void}
    */
  def unselectItemsByIndices(indices: js.Array[Double]): Unit = js.native
}
object ListBox {
  
  @js.native
  sealed trait SortOrder extends StObject
  @JSGlobal("ej.ListBox.SortOrder")
  @js.native
  object SortOrder extends StObject {
    
    ///To sort items in Ascending order.
    @js.native
    sealed trait Ascending
      extends StObject
         with SortOrder
    
    ///To sort items in Descending order.
    @js.native
    sealed trait Descending
      extends StObject
         with SortOrder
    
    ///The items are not sorted.
    @js.native
    sealed trait None
      extends StObject
         with SortOrder
  }
  
  trait ActionBeforeSuccessEventArgs extends StObject {
    
    /** List of actual object.
      */
    var actual: js.UndefOr[Any] = js.undefined
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the listbox model object.
      */
    var model: js.UndefOr[typingsJapgolly.ejWebAll.ej.Model] = js.undefined
    
    /** Object of ListBox widget which contains DataManager arguments
      */
    var request: js.UndefOr[Any] = js.undefined
    
    /** List of array object
      */
    var result: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** ExecuteQuery object of DataManager
      */
    var xhr: js.UndefOr[Any] = js.undefined
  }
  object ActionBeforeSuccessEventArgs {
    
    inline def apply(): ActionBeforeSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionBeforeSuccessEventArgs]
    }
    
    extension [Self <: ActionBeforeSuccessEventArgs](x: Self) {
      
      inline def setActual(value: Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typingsJapgolly.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRequest(value: Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setResult(value: js.Array[Any]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setResultVarargs(value: Any*): Self = StObject.set(x, "result", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setXhr(value: Any): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  trait ActionBeginEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the ListBox model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ActionBeginEventArgs {
    
    inline def apply(): ActionBeginEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionBeginEventArgs]
    }
    
    extension [Self <: ActionBeginEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ActionCompleteEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns number of times trying to fetch the data
      */
    var count: js.UndefOr[Double] = js.undefined
    
    /** returns the ListBox model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the query for data retrieval
      */
    var query: js.UndefOr[Any] = js.undefined
    
    /** Returns the query for data retrieval from the Database
      */
    var request: js.UndefOr[Any] = js.undefined
    
    /** Returns the number of items fetched from remote data
      */
    var result: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Returns the requested data
      */
    var xhr: js.UndefOr[Any] = js.undefined
  }
  object ActionCompleteEventArgs {
    
    inline def apply(): ActionCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionCompleteEventArgs]
    }
    
    extension [Self <: ActionCompleteEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRequest(value: Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setResult(value: js.Array[Any]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setResultVarargs(value: Any*): Self = StObject.set(x, "result", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setXhr(value: Any): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  trait ActionFailureEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the error message
      */
    var error: js.UndefOr[Any] = js.undefined
    
    /** returns the ListBox model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the query for data retrieval
      */
    var query: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ActionFailureEventArgs {
    
    inline def apply(): ActionFailureEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionFailureEventArgs]
    }
    
    extension [Self <: ActionFailureEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ActionSuccessEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns number of times trying to fetch the data
      */
    var count: js.UndefOr[Double] = js.undefined
    
    /** returns the ListBox model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the query for data retrieval
      */
    var query: js.UndefOr[Any] = js.undefined
    
    /** Returns the query for data retrieval from the Database
      */
    var request: js.UndefOr[Any] = js.undefined
    
    /** Returns the number of items fetched from remote data
      */
    var result: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Returns the requested data
      */
    var xhr: js.UndefOr[Any] = js.undefined
  }
  object ActionSuccessEventArgs {
    
    inline def apply(): ActionSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionSuccessEventArgs]
    }
    
    extension [Self <: ActionSuccessEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRequest(value: Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setResult(value: js.Array[Any]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setResultVarargs(value: Any*): Self = StObject.set(x, "result", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setXhr(value: Any): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  trait ChangeEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** The Datasource of the listbox.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** List itemâ€™s index.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** Boolean value based on whether the list item is checked or not.
      */
    var isChecked: js.UndefOr[Boolean] = js.undefined
    
    /** Boolean value based on the list item is enabled or not.
      */
    var isEnabled: js.UndefOr[Boolean] = js.undefined
    
    /** Boolean value based on whether the list item is selected or not.
      */
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    /** List item object.
      */
    var item: js.UndefOr[Any] = js.undefined
    
    /** Instance of the listbox model object.
      */
    var model: js.UndefOr[typingsJapgolly.ejWebAll.ej.Model] = js.undefined
    
    /** List itemâ€™s text (label).
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** List itemâ€™s value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object ChangeEventArgs {
    
    inline def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    extension [Self <: ChangeEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setModel(value: typingsJapgolly.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CheckChangeEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** The Datasource of the listbox.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** List itemâ€™s index.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** Boolean value based on whether the list item is checked or not.
      */
    var isChecked: js.UndefOr[Boolean] = js.undefined
    
    /** Boolean value based on the list item is enabled or not.
      */
    var isEnabled: js.UndefOr[Boolean] = js.undefined
    
    /** Boolean value based on whether the list item is selected or not.
      */
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    /** List item object.
      */
    var item: js.UndefOr[Any] = js.undefined
    
    /** Instance of the listbox model object.
      */
    var model: js.UndefOr[typingsJapgolly.ejWebAll.ej.Model] = js.undefined
    
    /** List itemâ€™s text (label).
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** List itemâ€™s value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object CheckChangeEventArgs {
    
    inline def apply(): CheckChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckChangeEventArgs]
    }
    
    extension [Self <: CheckChangeEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setModel(value: typingsJapgolly.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the listbox model object.
      */
    var model: js.UndefOr[typingsJapgolly.ejWebAll.ej.Model] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CreateEventArgs {
    
    inline def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    extension [Self <: CreateEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typingsJapgolly.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the listbox model object.
      */
    var model: js.UndefOr[typingsJapgolly.ejWebAll.ej.Model] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DestroyEventArgs {
    
    inline def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    extension [Self <: DestroyEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typingsJapgolly.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Fields extends StObject {
    
    /** Defines the specific field name which contains Boolean values to specify whether the list items to be checked by default or not.
      */
    var checkBy: js.UndefOr[Boolean] = js.undefined
    
    /** The grouping in the ListBox widget can be defined using this field.
      */
    var groupBy: js.UndefOr[String] = js.undefined
    
    /** Defines the HTML attributes such as id, class, styles for the specific ListBox item.
      */
    var htmlAttributes: js.UndefOr[Any] = js.undefined
    
    /** Defines the specific field name which contains id values for the list items.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** Defines the image attributes such as height, width, styles and so on.
      */
    var imageAttributes: js.UndefOr[String] = js.undefined
    
    /** Defines the imageURL for the image to be displayed in the ListBox item.
      */
    var imageUrl: js.UndefOr[String] = js.undefined
    
    /** Defines the specific field name which contains Boolean values to specify whether the list items to be selected by default or not.
      */
    var selectBy: js.UndefOr[Boolean] = js.undefined
    
    /** Defines the sprite CSS class for the image to be displayed.
      */
    var spriteCssClass: js.UndefOr[String] = js.undefined
    
    /** Defines the table name to get the specific set of list items to be loaded in the ListBox widget while rendering with remote data.
      */
    var tableName: js.UndefOr[String] = js.undefined
    
    /** Defines the specific field name in the data source to load the list with data.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Defines the specific field name in the data source to load the list with data value property.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object Fields {
    
    inline def apply(): Fields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fields]
    }
    
    extension [Self <: Fields](x: Self) {
      
      inline def setCheckBy(value: Boolean): Self = StObject.set(x, "checkBy", value.asInstanceOf[js.Any])
      
      inline def setCheckByUndefined: Self = StObject.set(x, "checkBy", js.undefined)
      
      inline def setGroupBy(value: String): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      inline def setHtmlAttributes(value: Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setImageAttributes(value: String): Self = StObject.set(x, "imageAttributes", value.asInstanceOf[js.Any])
      
      inline def setImageAttributesUndefined: Self = StObject.set(x, "imageAttributes", js.undefined)
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      inline def setSelectBy(value: Boolean): Self = StObject.set(x, "selectBy", value.asInstanceOf[js.Any])
      
      inline def setSelectByUndefined: Self = StObject.set(x, "selectBy", js.undefined)
      
      inline def setSpriteCssClass(value: String): Self = StObject.set(x, "spriteCssClass", value.asInstanceOf[js.Any])
      
      inline def setSpriteCssClassUndefined: Self = StObject.set(x, "spriteCssClass", js.undefined)
      
      inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait FocusInEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the listbox model object.
      */
    var model: js.UndefOr[typingsJapgolly.ejWebAll.ej.Model] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object FocusInEventArgs {
    
    inline def apply(): FocusInEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusInEventArgs]
    }
    
    extension [Self <: FocusInEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typingsJapgolly.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait FocusOutEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the listbox model object.
      */
    var model: js.UndefOr[typingsJapgolly.ejWebAll.ej.Model] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object FocusOutEventArgs {
    
    inline def apply(): FocusOutEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusOutEventArgs]
    }
    
    extension [Self <: FocusOutEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typingsJapgolly.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ItemDragEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** The Datasource of the listbox.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** List itemâ€™s index.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** Boolean value based on whether the list item is checked or not.
      */
    var isChecked: js.UndefOr[Boolean] = js.undefined
    
    /** Boolean value based on whether the list item is enabled or not.
      */
    var isEnabled: js.UndefOr[Boolean] = js.undefined
    
    /** Boolean value based on whether the list item is selected or not.
      */
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the listbox model object.
      */
    var model: js.UndefOr[typingsJapgolly.ejWebAll.ej.Model] = js.undefined
    
    /** List itemâ€™s text (label).
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** List itemâ€™s value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object ItemDragEventArgs {
    
    inline def apply(): ItemDragEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemDragEventArgs]
    }
    
    extension [Self <: ItemDragEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setModel(value: typingsJapgolly.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ItemDragStartEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** The Datasource of the listbox.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** List itemâ€™s index.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** Boolean value based on whether the list item is checked or not.
      */
    var isChecked: js.UndefOr[Boolean] = js.undefined
    
    /** Boolean value based on whether the list item is enabled or not.
      */
    var isEnabled: js.UndefOr[Boolean] = js.undefined
    
    /** Boolean value based on whether the list item is selected or not.
      */
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the listbox model object.
      */
    var model: js.UndefOr[typingsJapgolly.ejWebAll.ej.Model] = js.undefined
    
    /** List itemâ€™s text (label).
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** List itemâ€™s value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object ItemDragStartEventArgs {
    
    inline def apply(): ItemDragStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemDragStartEventArgs]
    }
    
    extension [Self <: ItemDragStartEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setModel(value: typingsJapgolly.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ItemDragStopEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** The Datasource of the listbox.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** List itemâ€™s index.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** Boolean value based on whether the list item is checked or not.
      */
    var isChecked: js.UndefOr[Boolean] = js.undefined
    
    /** Boolean value based on whether the list item is enabled or not.
      */
    var isEnabled: js.UndefOr[Boolean] = js.undefined
    
    /** Boolean value based on whether the list item is selected or not.
      */
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the listbox model object.
      */
    var model: js.UndefOr[typingsJapgolly.ejWebAll.ej.Model] = js.undefined
    
    /** List itemâ€™s text (label).
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** List itemâ€™s value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object ItemDragStopEventArgs {
    
    inline def apply(): ItemDragStopEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemDragStopEventArgs]
    }
    
    extension [Self <: ItemDragStopEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setModel(value: typingsJapgolly.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ItemDropEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** The Datasource of the listbox.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** List itemâ€™s index.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** Boolean value based on whether the list item is checked or not.
      */
    var isChecked: js.UndefOr[Boolean] = js.undefined
    
    /** Boolean value based on whether the list item is enabled or not.
      */
    var isEnabled: js.UndefOr[Boolean] = js.undefined
    
    /** Boolean value based on whether the list item is selected or not.
      */
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the listbox model object.
      */
    var model: js.UndefOr[typingsJapgolly.ejWebAll.ej.Model] = js.undefined
    
    /** List itemâ€™s text (label).
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** List itemâ€™s value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object ItemDropEventArgs {
    
    inline def apply(): ItemDropEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemDropEventArgs]
    }
    
    extension [Self <: ItemDropEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setModel(value: typingsJapgolly.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Event will be triggered before the requested data via AJAX once loaded in successfully.
      */
    var actionBeforeSuccess: js.UndefOr[js.Function1[/* e */ ActionBeforeSuccessEventArgs, Unit]] = js.undefined
    
    /** Triggers before the AJAX request begins to load data in the ListBox widget.
      */
    var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.undefined
    
    /** Triggers when the AJAX requests complete. The request may get failed or succeed.
      */
    var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.undefined
    
    /** Triggers when the data requested from AJAX get failed.
      */
    var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.undefined
    
    /** Triggers after the data requested via AJAX is successfully loaded in the ListBox widget.
      */
    var actionSuccess: js.UndefOr[js.Function1[/* e */ ActionSuccessEventArgs, Unit]] = js.undefined
    
    /** Enables/disables the dragging behavior of the items in ListBox widget.
      * @Default {false}
      */
    var allowDrag: js.UndefOr[Boolean] = js.undefined
    
    /** Accepts the items which are dropped in to it, when it is set to true.
      * @Default {false}
      */
    var allowDrop: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables multiple selection.
      * @Default {false}
      */
    var allowMultiSelection: js.UndefOr[Boolean] = js.undefined
    
    /** Loads the list data on demand via scrolling behavior to improve the applicationâ€™s performance. There are two ways to load data which can be defined using â€œvirtualScrollModeâ€
      * property.
      * @Default {false}
      */
    var allowVirtualScrolling: js.UndefOr[Boolean] = js.undefined
    
    /** Dynamically populate data of a list box while selecting an item in another list box i.e. rendering child list box based on the item selection in parent list box. This property
      * accepts the id of the child ListBox widget to populate the data.
      * @Default {null}
      */
    var cascadeTo: js.UndefOr[String] = js.undefined
    
    /** Enables or disables the case sensitive search for list item by typing the text (search) value.
      * @Default {false}
      */
    var caseSensitiveSearch: js.UndefOr[Boolean] = js.undefined
    
    /** Triggers when the item selection is changed.
      */
    var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
    
    /** Triggers when the list item is checked or unchecked.
      */
    var checkChange: js.UndefOr[js.Function1[/* e */ CheckChangeEventArgs, Unit]] = js.undefined
    
    /** Set of list items to be checked by default using its index. It works only when the showCheckbox property is set to true.
      * @Default {null}
      */
    var checkedIndices: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Triggers when the ListBox widget is created successfully.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** The root class for the ListBox widget to customize the existing theme.
      * @Default {â€œâ€}
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Contains the list of data for generating the list items.
      * @Default {null}
      */
    var dataSource: js.UndefOr[Any] = js.undefined
    
    /** Triggers when the ListBox widget is destroyed successfully.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Enables or disables the search behavior to find the specific list item by typing the text value.
      * @Default {false}
      */
    var enableIncrementalSearch: js.UndefOr[Boolean] = js.undefined
    
    /** Allows the current model values to be saved in local storage or browser cookies for state maintenance when it is set to true.
      * @Default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.undefined
    
    /** Displays the ListBox widgetâ€™s content from right to left when enabled.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies ellipsis (&quot;...&quot;) representation in an overflowed list item content when it is set to false.
      * @Default {true}
      */
    var enableWordWrap: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the ListBox widget.
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Mapping fields for the data items of the ListBox widget.
      * @Default {null}
      */
    var fields: js.UndefOr[Fields] = js.undefined
    
    /** Triggers when focus the listbox items.
      */
    var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, Unit]] = js.undefined
    
    /** Triggers when focus out from listbox items.
      */
    var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.undefined
    
    /** Defines the height of the ListBox widget.
      * @Default {null}
      */
    var height: js.UndefOr[String] = js.undefined
    
    /** Triggers when the list item is being dragged.
      */
    var itemDrag: js.UndefOr[js.Function1[/* e */ ItemDragEventArgs, Unit]] = js.undefined
    
    /** Triggers when the list item is ready to be dragged.
      */
    var itemDragStart: js.UndefOr[js.Function1[/* e */ ItemDragStartEventArgs, Unit]] = js.undefined
    
    /** Triggers when the list item stops dragging.
      */
    var itemDragStop: js.UndefOr[js.Function1[/* e */ ItemDragStopEventArgs, Unit]] = js.undefined
    
    /** Triggers when the list item is dropped.
      */
    var itemDrop: js.UndefOr[js.Function1[/* e */ ItemDropEventArgs, Unit]] = js.undefined
    
    /** Defines the height for individual ListBox item.
      * @Default {null}
      */
    var itemHeight: js.UndefOr[String] = js.undefined
    
    /** The number of list items to be loaded in the list box while enabling virtual scrolling and when virtualScrollMode is set to continuous.
      * @Default {5}
      */
    var itemRequestCount: js.UndefOr[Double] = js.undefined
    
    /** The number of list items to be shown in the ListBox widget. The remaining list items will be scrollable.
      * @Default {null}
      */
    var itemsCount: js.UndefOr[Double] = js.undefined
    
    /** Loads data for the listbox by default (i.e. on initialization) when it is set to true. It creates empty ListBox if it is set to false.
      * @Default {true}
      */
    var loadDataOnInit: js.UndefOr[Boolean] = js.undefined
    
    /** The query to retrieve required data from the data source.
      * @Default {ej.Query()}
      */
    var query: js.UndefOr[Query] = js.undefined
    
    /** Triggers when a list item gets selected.
      */
    var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.undefined
    
    /** The list item to be selected by default using its index.
      * @Default {null}
      */
    var selectedIndex: js.UndefOr[Double] = js.undefined
    
    /** The list items to be selected by default using its indices. To use this property allowMultiSelection should be enabled.
      * @Default {[]}
      */
    var selectedIndices: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Enables/Disables the multi selection option with the help of checkbox control.
      * @Default {false}
      */
    var showCheckbox: js.UndefOr[Boolean] = js.undefined
    
    /** To display the ListBox container with rounded corners.
      * @Default {false}
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
    
    /** Set to sort ListBox items either by Ascending or Descending order. By default sortOrder is set as enum type of &quot;None&quot;.You can use only below mentioned type for sorting
      * purpose.
      * @Default {ej.SortOrder.None}
      */
    var sortOrder: js.UndefOr[SortOrder_ | String] = js.undefined
    
    /** Specifies the targetID for the listbox items.
      * @Default {null}
      */
    var targetID: js.UndefOr[String] = js.undefined
    
    /** The template to display the ListBox widget with customized appearance.
      * @Default {null}
      */
    var template: js.UndefOr[String] = js.undefined
    
    /** The total number of list items to be rendered in the ListBox widget.
      * @Default {null}
      */
    var totalItemsCount: js.UndefOr[Double] = js.undefined
    
    /** Triggers when a list item gets unselected.
      */
    var unselect: js.UndefOr[js.Function1[/* e */ UnselectEventArgs, Unit]] = js.undefined
    
    /** Holds the selected items values and used to bind value to the list item using AngularJS and KnockoutJS.
      * @Default {â€œâ€}
      */
    var value: js.UndefOr[Double] = js.undefined
    
    /** Specifies the virtual scroll mode to load the list data on demand via scrolling behavior. There are two types of mode.
      * @Default {ej.VirtualScrollMode.Normal}
      */
    var virtualScrollMode: js.UndefOr[VirtualScrollMode | String] = js.undefined
    
    /** Defines the width of the ListBox widget.
      * @Default {null}
      */
    var width: js.UndefOr[String] = js.undefined
  }
  object Model {
    
    inline def apply(): typingsJapgolly.ejWebAll.ej.ListBox.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.ejWebAll.ej.ListBox.Model]
    }
    
    extension [Self <: typingsJapgolly.ejWebAll.ej.ListBox.Model](x: Self) {
      
      inline def setActionBeforeSuccess(value: /* e */ ActionBeforeSuccessEventArgs => Callback): Self = StObject.set(x, "actionBeforeSuccess", js.Any.fromFunction1((t0: /* e */ ActionBeforeSuccessEventArgs) => value(t0).runNow()))
      
      inline def setActionBeforeSuccessUndefined: Self = StObject.set(x, "actionBeforeSuccess", js.undefined)
      
      inline def setActionBegin(value: /* e */ ActionBeginEventArgs => Callback): Self = StObject.set(x, "actionBegin", js.Any.fromFunction1((t0: /* e */ ActionBeginEventArgs) => value(t0).runNow()))
      
      inline def setActionBeginUndefined: Self = StObject.set(x, "actionBegin", js.undefined)
      
      inline def setActionComplete(value: /* e */ ActionCompleteEventArgs => Callback): Self = StObject.set(x, "actionComplete", js.Any.fromFunction1((t0: /* e */ ActionCompleteEventArgs) => value(t0).runNow()))
      
      inline def setActionCompleteUndefined: Self = StObject.set(x, "actionComplete", js.undefined)
      
      inline def setActionFailure(value: /* e */ ActionFailureEventArgs => Callback): Self = StObject.set(x, "actionFailure", js.Any.fromFunction1((t0: /* e */ ActionFailureEventArgs) => value(t0).runNow()))
      
      inline def setActionFailureUndefined: Self = StObject.set(x, "actionFailure", js.undefined)
      
      inline def setActionSuccess(value: /* e */ ActionSuccessEventArgs => Callback): Self = StObject.set(x, "actionSuccess", js.Any.fromFunction1((t0: /* e */ ActionSuccessEventArgs) => value(t0).runNow()))
      
      inline def setActionSuccessUndefined: Self = StObject.set(x, "actionSuccess", js.undefined)
      
      inline def setAllowDrag(value: Boolean): Self = StObject.set(x, "allowDrag", value.asInstanceOf[js.Any])
      
      inline def setAllowDragUndefined: Self = StObject.set(x, "allowDrag", js.undefined)
      
      inline def setAllowDrop(value: Boolean): Self = StObject.set(x, "allowDrop", value.asInstanceOf[js.Any])
      
      inline def setAllowDropUndefined: Self = StObject.set(x, "allowDrop", js.undefined)
      
      inline def setAllowMultiSelection(value: Boolean): Self = StObject.set(x, "allowMultiSelection", value.asInstanceOf[js.Any])
      
      inline def setAllowMultiSelectionUndefined: Self = StObject.set(x, "allowMultiSelection", js.undefined)
      
      inline def setAllowVirtualScrolling(value: Boolean): Self = StObject.set(x, "allowVirtualScrolling", value.asInstanceOf[js.Any])
      
      inline def setAllowVirtualScrollingUndefined: Self = StObject.set(x, "allowVirtualScrolling", js.undefined)
      
      inline def setCascadeTo(value: String): Self = StObject.set(x, "cascadeTo", value.asInstanceOf[js.Any])
      
      inline def setCascadeToUndefined: Self = StObject.set(x, "cascadeTo", js.undefined)
      
      inline def setCaseSensitiveSearch(value: Boolean): Self = StObject.set(x, "caseSensitiveSearch", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveSearchUndefined: Self = StObject.set(x, "caseSensitiveSearch", js.undefined)
      
      inline def setChange(value: /* e */ ChangeEventArgs => Callback): Self = StObject.set(x, "change", js.Any.fromFunction1((t0: /* e */ ChangeEventArgs) => value(t0).runNow()))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setCheckChange(value: /* e */ CheckChangeEventArgs => Callback): Self = StObject.set(x, "checkChange", js.Any.fromFunction1((t0: /* e */ CheckChangeEventArgs) => value(t0).runNow()))
      
      inline def setCheckChangeUndefined: Self = StObject.set(x, "checkChange", js.undefined)
      
      inline def setCheckedIndices(value: js.Array[Any]): Self = StObject.set(x, "checkedIndices", value.asInstanceOf[js.Any])
      
      inline def setCheckedIndicesUndefined: Self = StObject.set(x, "checkedIndices", js.undefined)
      
      inline def setCheckedIndicesVarargs(value: Any*): Self = StObject.set(x, "checkedIndices", js.Array(value*))
      
      inline def setCreate(value: /* e */ CreateEventArgs => Callback): Self = StObject.set(x, "create", js.Any.fromFunction1((t0: /* e */ CreateEventArgs) => value(t0).runNow()))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Callback): Self = StObject.set(x, "destroy", js.Any.fromFunction1((t0: /* e */ DestroyEventArgs) => value(t0).runNow()))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setEnableIncrementalSearch(value: Boolean): Self = StObject.set(x, "enableIncrementalSearch", value.asInstanceOf[js.Any])
      
      inline def setEnableIncrementalSearchUndefined: Self = StObject.set(x, "enableIncrementalSearch", js.undefined)
      
      inline def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      inline def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnableWordWrap(value: Boolean): Self = StObject.set(x, "enableWordWrap", value.asInstanceOf[js.Any])
      
      inline def setEnableWordWrapUndefined: Self = StObject.set(x, "enableWordWrap", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFocusIn(value: /* e */ FocusInEventArgs => Callback): Self = StObject.set(x, "focusIn", js.Any.fromFunction1((t0: /* e */ FocusInEventArgs) => value(t0).runNow()))
      
      inline def setFocusInUndefined: Self = StObject.set(x, "focusIn", js.undefined)
      
      inline def setFocusOut(value: /* e */ FocusOutEventArgs => Callback): Self = StObject.set(x, "focusOut", js.Any.fromFunction1((t0: /* e */ FocusOutEventArgs) => value(t0).runNow()))
      
      inline def setFocusOutUndefined: Self = StObject.set(x, "focusOut", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setItemDrag(value: /* e */ ItemDragEventArgs => Callback): Self = StObject.set(x, "itemDrag", js.Any.fromFunction1((t0: /* e */ ItemDragEventArgs) => value(t0).runNow()))
      
      inline def setItemDragStart(value: /* e */ ItemDragStartEventArgs => Callback): Self = StObject.set(x, "itemDragStart", js.Any.fromFunction1((t0: /* e */ ItemDragStartEventArgs) => value(t0).runNow()))
      
      inline def setItemDragStartUndefined: Self = StObject.set(x, "itemDragStart", js.undefined)
      
      inline def setItemDragStop(value: /* e */ ItemDragStopEventArgs => Callback): Self = StObject.set(x, "itemDragStop", js.Any.fromFunction1((t0: /* e */ ItemDragStopEventArgs) => value(t0).runNow()))
      
      inline def setItemDragStopUndefined: Self = StObject.set(x, "itemDragStop", js.undefined)
      
      inline def setItemDragUndefined: Self = StObject.set(x, "itemDrag", js.undefined)
      
      inline def setItemDrop(value: /* e */ ItemDropEventArgs => Callback): Self = StObject.set(x, "itemDrop", js.Any.fromFunction1((t0: /* e */ ItemDropEventArgs) => value(t0).runNow()))
      
      inline def setItemDropUndefined: Self = StObject.set(x, "itemDrop", js.undefined)
      
      inline def setItemHeight(value: String): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      inline def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
      
      inline def setItemRequestCount(value: Double): Self = StObject.set(x, "itemRequestCount", value.asInstanceOf[js.Any])
      
      inline def setItemRequestCountUndefined: Self = StObject.set(x, "itemRequestCount", js.undefined)
      
      inline def setItemsCount(value: Double): Self = StObject.set(x, "itemsCount", value.asInstanceOf[js.Any])
      
      inline def setItemsCountUndefined: Self = StObject.set(x, "itemsCount", js.undefined)
      
      inline def setLoadDataOnInit(value: Boolean): Self = StObject.set(x, "loadDataOnInit", value.asInstanceOf[js.Any])
      
      inline def setLoadDataOnInitUndefined: Self = StObject.set(x, "loadDataOnInit", js.undefined)
      
      inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setSelect(value: /* e */ SelectEventArgs => Callback): Self = StObject.set(x, "select", js.Any.fromFunction1((t0: /* e */ SelectEventArgs) => value(t0).runNow()))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
      
      inline def setSelectedIndices(value: js.Array[Any]): Self = StObject.set(x, "selectedIndices", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndicesUndefined: Self = StObject.set(x, "selectedIndices", js.undefined)
      
      inline def setSelectedIndicesVarargs(value: Any*): Self = StObject.set(x, "selectedIndices", js.Array(value*))
      
      inline def setShowCheckbox(value: Boolean): Self = StObject.set(x, "showCheckbox", value.asInstanceOf[js.Any])
      
      inline def setShowCheckboxUndefined: Self = StObject.set(x, "showCheckbox", js.undefined)
      
      inline def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      inline def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      inline def setSortOrder(value: SortOrder_ | String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      inline def setTargetID(value: String): Self = StObject.set(x, "targetID", value.asInstanceOf[js.Any])
      
      inline def setTargetIDUndefined: Self = StObject.set(x, "targetID", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTotalItemsCount(value: Double): Self = StObject.set(x, "totalItemsCount", value.asInstanceOf[js.Any])
      
      inline def setTotalItemsCountUndefined: Self = StObject.set(x, "totalItemsCount", js.undefined)
      
      inline def setUnselect(value: /* e */ UnselectEventArgs => Callback): Self = StObject.set(x, "unselect", js.Any.fromFunction1((t0: /* e */ UnselectEventArgs) => value(t0).runNow()))
      
      inline def setUnselectUndefined: Self = StObject.set(x, "unselect", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVirtualScrollMode(value: VirtualScrollMode | String): Self = StObject.set(x, "virtualScrollMode", value.asInstanceOf[js.Any])
      
      inline def setVirtualScrollModeUndefined: Self = StObject.set(x, "virtualScrollMode", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SelectEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** The Datasource of the listbox.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** List itemâ€™s index.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** Boolean value based on whether the list item is checked or not.
      */
    var isChecked: js.UndefOr[Boolean] = js.undefined
    
    /** Boolean value based on the list item is enabled or not.
      */
    var isEnabled: js.UndefOr[Boolean] = js.undefined
    
    /** Boolean value based on whether the list item is selected or not.
      */
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    /** List item object.
      */
    var item: js.UndefOr[Any] = js.undefined
    
    /** Instance of the listbox model object.
      */
    var model: js.UndefOr[typingsJapgolly.ejWebAll.ej.Model] = js.undefined
    
    /** List itemâ€™s text (label).
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** List itemâ€™s value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object SelectEventArgs {
    
    inline def apply(): SelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectEventArgs]
    }
    
    extension [Self <: SelectEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setModel(value: typingsJapgolly.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait UnselectEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** The Datasource of the listbox.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** List itemâ€™s index.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** Boolean value based on whether the list item is checked or not.
      */
    var isChecked: js.UndefOr[Boolean] = js.undefined
    
    /** Boolean value based on the list item is enabled or not.
      */
    var isEnabled: js.UndefOr[Boolean] = js.undefined
    
    /** Boolean value based on whether the list item is selected or not.
      */
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    /** List item object.
      */
    var item: js.UndefOr[Any] = js.undefined
    
    /** Instance of the listbox model object.
      */
    var model: js.UndefOr[typingsJapgolly.ejWebAll.ej.Model] = js.undefined
    
    /** List itemâ€™s text (label).
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** List itemâ€™s value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object UnselectEventArgs {
    
    inline def apply(): UnselectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnselectEventArgs]
    }
    
    extension [Self <: UnselectEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setModel(value: typingsJapgolly.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
