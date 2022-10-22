package typingsJapgolly.tabulatorTables.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.tabulatorTables.tabulatorTablesBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupComponent extends StObject {
  
  /** The getElement function returns the DOM node for the group header. */
  def getElement(): HTMLElement
  
  /** Returns the string of the field that all rows in this group have been grouped by. (if a function is used to group the rows rather than a field, this function will return false) */
  def getField(): String
  
  /** The getKey function returns the unique key that is shared between all rows in this group. */
  def getKey(): Any
  
  /** The getParentGroup function returns the GroupComponent for the parent group of this group. if no parent exists, this function will return false. */
  def getParentGroup(): GroupComponent | `false`
  
  /** The getRows function returns an array of RowComponent objects, one for each row in the group */
  def getRows(): js.Array[RowComponent]
  
  /** The getSubGroups function returns an array of GroupComponent objects, one for each sub group of this group. */
  def getSubGroups(): js.Array[GroupComponent]
  
  /** The getTable function returns the Tabulator object for the table containing the group */
  def getTable(): Tabulator
  
  /** The hide function hides the group if it is visible. */
  def hide(): Unit
  
  /** The isVisible function returns a boolean to show if the group is visible, a value of true means it is visible. */
  def isVisible(): Boolean
  
  def popup(contents: String, position: PopupPosition): Unit
  
  /** The show function shows the group if it is hidden. */
  def show(): Unit
  
  /** The toggle function toggles the visibility of the group, switching between hidden and visible. */
  def toggle(): Unit
}
object GroupComponent {
  
  inline def apply(
    getElement: CallbackTo[HTMLElement],
    getField: CallbackTo[String],
    getKey: CallbackTo[Any],
    getParentGroup: CallbackTo[GroupComponent | `false`],
    getRows: CallbackTo[js.Array[RowComponent]],
    getSubGroups: CallbackTo[js.Array[GroupComponent]],
    getTable: CallbackTo[Tabulator],
    hide: Callback,
    isVisible: CallbackTo[Boolean],
    popup: (String, PopupPosition) => Callback,
    show: Callback,
    toggle: Callback
  ): GroupComponent = {
    val __obj = js.Dynamic.literal(getElement = getElement.toJsFn, getField = getField.toJsFn, getKey = getKey.toJsFn, getParentGroup = getParentGroup.toJsFn, getRows = getRows.toJsFn, getSubGroups = getSubGroups.toJsFn, getTable = getTable.toJsFn, hide = hide.toJsFn, isVisible = isVisible.toJsFn, popup = js.Any.fromFunction2((t0: String, t1: PopupPosition) => (popup(t0, t1)).runNow()), show = show.toJsFn, toggle = toggle.toJsFn)
    __obj.asInstanceOf[GroupComponent]
  }
  
  extension [Self <: GroupComponent](x: Self) {
    
    inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
    
    inline def setGetField(value: CallbackTo[String]): Self = StObject.set(x, "getField", value.toJsFn)
    
    inline def setGetKey(value: CallbackTo[Any]): Self = StObject.set(x, "getKey", value.toJsFn)
    
    inline def setGetParentGroup(value: CallbackTo[GroupComponent | `false`]): Self = StObject.set(x, "getParentGroup", value.toJsFn)
    
    inline def setGetRows(value: CallbackTo[js.Array[RowComponent]]): Self = StObject.set(x, "getRows", value.toJsFn)
    
    inline def setGetSubGroups(value: CallbackTo[js.Array[GroupComponent]]): Self = StObject.set(x, "getSubGroups", value.toJsFn)
    
    inline def setGetTable(value: CallbackTo[Tabulator]): Self = StObject.set(x, "getTable", value.toJsFn)
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setIsVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVisible", value.toJsFn)
    
    inline def setPopup(value: (String, PopupPosition) => Callback): Self = StObject.set(x, "popup", js.Any.fromFunction2((t0: String, t1: PopupPosition) => (value(t0, t1)).runNow()))
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    
    inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
  }
}
