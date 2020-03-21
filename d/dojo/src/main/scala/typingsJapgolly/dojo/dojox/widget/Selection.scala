package typingsJapgolly.dojo.dojox.widget

import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dojo.Stateful
import typingsJapgolly.dojo.dojoStrings.selectedItem
import typingsJapgolly.dojo.dojoStrings.selectedItems
import typingsJapgolly.dojo.dojoStrings.selectionMode
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/Selection.html
  *
  * Base class for widgets that manage a list of selected data items.
  *
  */
@JSGlobal("dojox.widget.Selection")
@js.native
class Selection () extends Stateful {
  /**
    * In single selection mode, the selected item or in multiple selection mode the last selected item.
    * Warning: Do not use this property directly, make sure to call set() or get() methods.
    *
    */
  var selectedItem: js.Object = js.native
  /**
    * The list of selected items.
    * Warning: Do not use this property directly, make sure to call set() or get() methods.
    *
    */
  var selectedItems: js.Object = js.native
  /**
    * Valid values are:
    *
    * "none": No selection can be done.
    * "single": Only one item can be selected at a time.
    * "multiple": Several item can be selected using the control key modifier.
    * Default value is "single".
    *
    */
  var selectionMode: String = js.native
  /**
    * Dispatch a selection change event.
    *
    * @param oldSelectedItem The previously selectedItem.
    * @param newSelectedItem The new selectedItem.
    * @param renderer The visual renderer of the selected/deselected item.
    * @param triggerEvent The event that lead to the selection of the item.
    */
  def dispatchChange(oldSelectedItem: js.Object, newSelectedItem: js.Object, renderer: js.Object, triggerEvent: Event_): Unit = js.native
  /**
    * This function must be implemented to return the id of a item.
    *
    * @param item The item to query the identity for.
    */
  def getIdentity(item: js.Object): Unit = js.native
  @JSName("get")
  def get_selectedItem(property: selectedItem): js.Object = js.native
  @JSName("get")
  def get_selectedItems(property: selectedItems): js.Object = js.native
  @JSName("get")
  def get_selectionMode(property: selectionMode): String = js.native
  /**
    * Returns wether an item is selected or not.
    *
    * @param item The item to test the selection for.
    */
  def isItemSelected(item: js.Object): js.Any = js.native
  /**
    * Called when the selection changed.
    *
    */
  def onChange(): Unit = js.native
  /**
    * Applies selection triggered by an user interaction
    *
    * @param e The source event of the user interaction.
    * @param item The render item that has been selected/deselected.
    * @param renderer The visual renderer of the selected/deselected item.
    * @param dispatch Whether an event must be dispatched or not.
    */
  def selectFromEvent(e: Event_, item: js.Object, renderer: js.Object, dispatch: Boolean): js.Any = js.native
  /**
    * Change the selection state of an item.
    *
    * @param item The item to change the selection state for.
    * @param value True to select the item, false to deselect it.
    */
  def setItemSelected(item: js.Object, value: Boolean): Unit = js.native
  @JSName("set")
  def set_selectedItem(property: selectedItem, value: js.Object): Unit = js.native
  @JSName("set")
  def set_selectedItems(property: selectedItems, value: js.Object): Unit = js.native
  @JSName("set")
  def set_selectionMode(property: selectionMode, value: String): Unit = js.native
  @JSName("watch")
  def watch_selectedItem(
    property: selectedItem,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_selectedItems(
    property: selectedItems,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_selectionMode(
    property: selectionMode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

