package typingsJapgolly.dragselect.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import typingsJapgolly.dragselect.AnonBottom
import typingsJapgolly.dragselect.AnonX
import typingsJapgolly.dragselect.AnonY
import typingsJapgolly.dragselect.dragselectBooleans.`false`
import typingsJapgolly.dragselect.dragselectStrings.altKey
import typingsJapgolly.dragselect.dragselectStrings.bottom
import typingsJapgolly.dragselect.dragselectStrings.ctrlKey
import typingsJapgolly.dragselect.dragselectStrings.left
import typingsJapgolly.dragselect.dragselectStrings.metaKey
import typingsJapgolly.dragselect.dragselectStrings.right
import typingsJapgolly.dragselect.dragselectStrings.shiftKey
import typingsJapgolly.dragselect.dragselectStrings.top
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.Document_
import typingsJapgolly.std.MouseEvent
import typingsJapgolly.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragSelect extends js.Object {
  var area: HTMLElement | SVGElement | Document_ = js.native
  var autoScrollSpeed: Double = js.native
  var customStyles: Boolean = js.native
  var hoverClass: String = js.native
  var multiSelectKeys: js.Array[ctrlKey | shiftKey | metaKey | altKey] = js.native
  var multiSelectMode: Boolean = js.native
  var selectableClass: String = js.native
  var selectables: (ArrayLike[HTMLElement | SVGElement]) | HTMLElement | SVGElement = js.native
  // These properties store the options passed to the constructor, or the
  // defaults if the relevant options aren't passed. See the docs below.
  var selectedClass: String = js.native
  var selector: HTMLElement = js.native
  var selectorClass: String = js.native
  var zoom: Double = js.native
  /**
    * Add nodes that can be selected.
    * The algorithm makes sure that no node is added twice
    * @param _nodes dom nodes
    * @param [addToSelection] if elements should also be added to current selection
    * @return _nodes the added node(s)
    */
  def addSelectables(_nodes: ArrayLike[HTMLElement | SVGElement]): js.Array[HTMLElement | SVGElement] = js.native
  def addSelectables(_nodes: ArrayLike[HTMLElement | SVGElement], addToSelection: Boolean): js.Array[HTMLElement | SVGElement] = js.native
  /**
    * Adds several items to the selection list
    * also adds the specific classes and take into account all calculations.
    * Does not clear the selection, in contrary to .setSelection
    * Can add multiple nodes at once, in contrary to .select
    * @param _nodes one or multiple nodes
    * @param [triggerCallback] - if callback should be called
    * @param [dontAddToSelectables] - if element should not be added to the list of selectable nodes
    * @return all selected nodes
    */
  def addSelection(_nodes: ArrayLike[HTMLElement | SVGElement]): js.Array[HTMLElement | SVGElement] = js.native
  def addSelection(_nodes: ArrayLike[HTMLElement | SVGElement], triggerCallback: Boolean): js.Array[HTMLElement | SVGElement] = js.native
  def addSelection(
    _nodes: ArrayLike[HTMLElement | SVGElement],
    triggerCallback: Boolean,
    dontAddToSelectables: Boolean
  ): js.Array[HTMLElement | SVGElement] = js.native
  /**
    * Function break: used in callbacks to disable the execution of the upcoming code at the specific moment
    * In contrary to stop():
    * - Event listeners, callback calls and calculation will continue working
    * - Selector won’t display and will not select
    */
  def break(): Unit = js.native
  def callback(selected: js.Array[HTMLElement | SVGElement], event: MouseEvent): Unit = js.native
  def callback(selected: js.Array[HTMLElement | SVGElement], event: TouchEvent): Unit = js.native
  /**
    * Checks if any selectable element is inside selection.
    * @param [force] forces through. Handles first clicks and accessibility. Here is user is clicking directly onto some element at start, (contrary to later hovers) we can assume that he really
    *     wants to select/deselect that item.
    */
  def checkIfInsideSelection(): Boolean = js.native
  def checkIfInsideSelection(force: Boolean): Boolean = js.native
  /**
    * Unselect / Deselect all current selected Nodes
    * @param [triggerCallback] - if callback should be called
    * @return this.selected, should be empty
    */
  def clearSelection(): js.Array[HTMLElement | SVGElement] = js.native
  def clearSelection(triggerCallback: Boolean): js.Array[HTMLElement | SVGElement] = js.native
  def getAreaRect(area: Document_): AnonBottom = js.native
  /**
    * Returns the top/left/bottom/right/width/height
    * values of a node. If Area is document then everything
    * except the sizes will be nulled.
    * @param area
    */
  def getAreaRect(area: typingsJapgolly.std.HTMLElement): AnonBottom = js.native
  def getAreaRect(area: typingsJapgolly.std.SVGElement): AnonBottom = js.native
  /**
    * Returns the last seen position of the cursor/selector
    */
  def getCurrentCursorPosition(): AnonX = js.native
  /**
    * Returns cursor x, y position based on event object
    * Will be relative to an area including the scroll unless advised otherwise
    * @param [event]
    * @param [_area] containing area / this.area if === undefined / document if === false
    * @param [ignoreScroll] if true, the scroll will be ignored
    * @return cursor { x/y }
    */
  def getCursorPos(): AnonX = js.native
  def getCursorPos(event: MouseEvent): AnonX = js.native
  def getCursorPos(event: MouseEvent, _area: typingsJapgolly.std.HTMLElement): AnonX = js.native
  def getCursorPos(event: MouseEvent, _area: typingsJapgolly.std.HTMLElement, ignoreScroll: Boolean): AnonX = js.native
  def getCursorPos(event: MouseEvent, _area: typingsJapgolly.std.SVGElement): AnonX = js.native
  def getCursorPos(event: MouseEvent, _area: typingsJapgolly.std.SVGElement, ignoreScroll: Boolean): AnonX = js.native
  def getCursorPos(event: TouchEvent): AnonX = js.native
  def getCursorPos(event: TouchEvent, _area: typingsJapgolly.std.HTMLElement): AnonX = js.native
  def getCursorPos(event: TouchEvent, _area: typingsJapgolly.std.HTMLElement, ignoreScroll: Boolean): AnonX = js.native
  def getCursorPos(event: TouchEvent, _area: typingsJapgolly.std.SVGElement): AnonX = js.native
  def getCursorPos(event: TouchEvent, _area: typingsJapgolly.std.SVGElement, ignoreScroll: Boolean): AnonX = js.native
  @JSName("getCursorPos")
  def getCursorPos_false(event: MouseEvent, _area: `false`): AnonX = js.native
  @JSName("getCursorPos")
  def getCursorPos_false(event: MouseEvent, _area: `false`, ignoreScroll: Boolean): AnonX = js.native
  @JSName("getCursorPos")
  def getCursorPos_false(event: TouchEvent, _area: `false`): AnonX = js.native
  @JSName("getCursorPos")
  def getCursorPos_false(event: TouchEvent, _area: `false`, ignoreScroll: Boolean): AnonX = js.native
  /**
    * Returns the cursor position difference between start and now
    * If usePreviousCursorDifference is passed,
    * it will output the cursor position difference between the previous selection and now
    * @param [usePreviousCursorDifference]
    */
  def getCursorPositionDifference(): AnonX = js.native
  def getCursorPositionDifference(usePreviousCursorDifference: Boolean): AnonX = js.native
  /**
    * Returns the starting/initial position of the cursor/selector
    */
  def getInitialCursorPosition(): AnonX = js.native
  /**
    * Returns the previous position of the cursor/selector
    */
  def getPreviousCursorPosition(): AnonX = js.native
  /**
    * Returns the current x, y scroll value of a container
    * If container has no scroll it will return 0
    * @param [area]
    * @return scroll X/Y
    */
  def getScroll(): AnonY = js.native
  def getScroll(area: typingsJapgolly.std.HTMLElement): AnonY = js.native
  def getScroll(area: typingsJapgolly.std.SVGElement): AnonY = js.native
  /**
    * Gets all nodes that can be selected
    * @return this.selectables
    */
  def getSelectables(): js.Array[HTMLElement | SVGElement] = js.native
  /**
    * Returns the current selected nodes
    */
  def getSelection(): js.Array[HTMLElement | SVGElement] = js.native
  def isCursorNearEdge(event: js.UndefOr[scala.Nothing], area: typingsJapgolly.std.HTMLElement): `false` | left | right | top | bottom = js.native
  def isCursorNearEdge(event: js.UndefOr[scala.Nothing], area: typingsJapgolly.std.SVGElement): `false` | left | right | top | bottom = js.native
  /**
    * Check if the selector is near an edge of the area
    * @param [event] event object.
    * @param area the area.
    */
  def isCursorNearEdge(event: MouseEvent, area: typingsJapgolly.std.HTMLElement): `false` | left | right | top | bottom = js.native
  def isCursorNearEdge(event: MouseEvent, area: typingsJapgolly.std.SVGElement): `false` | left | right | top | bottom = js.native
  def isCursorNearEdge(event: TouchEvent, area: typingsJapgolly.std.HTMLElement): `false` | left | right | top | bottom = js.native
  def isCursorNearEdge(event: TouchEvent, area: typingsJapgolly.std.SVGElement): `false` | left | right | top | bottom = js.native
  def moveCallback(event: MouseEvent): Unit = js.native
  def moveCallback(event: TouchEvent): Unit = js.native
  def moveStartCallback(event: MouseEvent): Unit = js.native
  def moveStartCallback(event: TouchEvent): Unit = js.native
  def onDragStartBegin(event: MouseEvent): Unit = js.native
  def onDragStartBegin(event: TouchEvent): Unit = js.native
  /**
    * Remove nodes from the nodes that can be selected.
    * @param _nodes – dom nodes
    * @param [removeFromSelection] if elements should also be removed from current selection
    * @return _nodes – the removed node(s)
    */
  def removeSelectables(_nodes: ArrayLike[HTMLElement | SVGElement]): js.Array[HTMLElement | SVGElement] = js.native
  def removeSelectables(_nodes: ArrayLike[HTMLElement | SVGElement], removeFromSelection: Boolean): js.Array[HTMLElement | SVGElement] = js.native
  /**
    * Removes specific nodes from the selection
    * Multiple nodes can be given at once, in contrary to unselect
    * @param _nodes one or multiple nodes
    * @param [triggerCallback] - if callback should be called
    * @param [removeFromSelectables] - if element should be removed from the list of selectable nodes
    * @return all selected nodes
    */
  def removeSelection(_nodes: ArrayLike[HTMLElement | SVGElement]): js.Array[HTMLElement | SVGElement] = js.native
  def removeSelection(_nodes: ArrayLike[HTMLElement | SVGElement], triggerCallback: Boolean): js.Array[HTMLElement | SVGElement] = js.native
  def removeSelection(
    _nodes: ArrayLike[HTMLElement | SVGElement],
    triggerCallback: Boolean,
    removeFromSelectables: Boolean
  ): js.Array[HTMLElement | SVGElement] = js.native
  /**
    * Unbind functions i.e. when mouse click is released
    * @param [event] - The event object.
    * @param [withCallback] - whether or not the callback should be called
    */
  def reset(): Boolean = js.native
  def reset(event: MouseEvent): Boolean = js.native
  def reset(event: MouseEvent, withCallback: Boolean): Boolean = js.native
  def reset(event: TouchEvent): Boolean = js.native
  def reset(event: TouchEvent, withCallback: Boolean): Boolean = js.native
  /**
    * Adds an item to the selection.
    * @param item selected item.
    * @return item
    */
  def select(item: typingsJapgolly.std.HTMLElement): HTMLElement | SVGElement | `false` = js.native
  def select(item: typingsJapgolly.std.SVGElement): HTMLElement | SVGElement | `false` = js.native
  def selectCallback(selected: typingsJapgolly.std.HTMLElement): Unit = js.native
  def selectCallback(selected: typingsJapgolly.std.SVGElement): Unit = js.native
  /**
    * Sets all elements that can be selected.
    * Removes all current selectables (& their respective classes).
    * Adds the new set to the selectables set, thus replacing the original set.
    * @param nodes – dom nodes
    * @param [removeFromSelection] if elements should also be removed from current selection
    * @param [addToSelection] if elements should also be added to current selection
    * @return nodes – the added node(s)
    */
  def setSelectables(nodes: ArrayLike[HTMLElement | SVGElement]): js.Array[HTMLElement | SVGElement] = js.native
  def setSelectables(nodes: ArrayLike[HTMLElement | SVGElement], removeFromSelection: Boolean): js.Array[HTMLElement | SVGElement] = js.native
  def setSelectables(nodes: ArrayLike[HTMLElement | SVGElement], removeFromSelection: Boolean, addToSelection: Boolean): js.Array[HTMLElement | SVGElement] = js.native
  /**
    * Sets the current selected nodes and optionally run the callback
    * By default, adds new elements also to the list of selectables
    * @param _nodes – dom nodes
    * @param [triggerCallback] - if callback should be called
    * @param [dontAddToSelectables] - if element should not be added to the list of selectable nodes
    */
  def setSelection(_nodes: ArrayLike[HTMLElement | SVGElement]): js.Array[HTMLElement | SVGElement] = js.native
  def setSelection(_nodes: ArrayLike[HTMLElement | SVGElement], triggerCallback: Boolean): js.Array[HTMLElement | SVGElement] = js.native
  def setSelection(
    _nodes: ArrayLike[HTMLElement | SVGElement],
    triggerCallback: Boolean,
    dontAddToSelectables: Boolean
  ): js.Array[HTMLElement | SVGElement] = js.native
  /**
    * Starts the functionality. Automatically triggered when created.
    * Also, reset the functionality after a teardown
    */
  def start(): Unit = js.native
  /**
    * Complete function teardown
    * Will teardown/stop the whole functionality
    * @param [remove=true] - if elements should be removed.
    * @param [fromSelection=true] - if elements should also be added/removed to the selection.
    * @param [withCallback] - if elements should also be added/removed to the selection.
    */
  def stop(): Unit = js.native
  def stop(remove: Boolean): Unit = js.native
  def stop(remove: Boolean, fromSelection: Boolean): Unit = js.native
  def stop(remove: Boolean, fromSelection: Boolean, withCallback: Boolean): Unit = js.native
  /**
    * Adds/Removes an item to the selection.
    * If it is already selected = remove, if not = add.
    * @param item – item to select.
    * @return item
    */
  def toggle(item: typingsJapgolly.std.HTMLElement): HTMLElement | SVGElement = js.native
  def toggle(item: typingsJapgolly.std.SVGElement): HTMLElement | SVGElement = js.native
  /**
    * Toggles specific nodes from the selection:
    * If element is not in selection it will be added, if it is already selected, it will be removed.
    * Multiple nodes can be given at once.
    * @param _nodes one or multiple nodes
    * @param [triggerCallback] - if callback should be called
    * @param [special] - if true, it also removes selected elements from possible selectable nodes & don’t add them to selectables if they are not
    * @return all selected nodes
    */
  def toggleSelection(_nodes: ArrayLike[HTMLElement | SVGElement]): js.Array[HTMLElement | SVGElement] = js.native
  def toggleSelection(_nodes: ArrayLike[HTMLElement | SVGElement], triggerCallback: Boolean): js.Array[HTMLElement | SVGElement] = js.native
  def toggleSelection(_nodes: ArrayLike[HTMLElement | SVGElement], triggerCallback: Boolean, special: Boolean): js.Array[HTMLElement | SVGElement] = js.native
  /**
    * Removes an item from the selection.
    * @param item selected item.
    * @return item
    */
  def unselect(item: typingsJapgolly.std.HTMLElement): HTMLElement | SVGElement | `false` = js.native
  def unselect(item: typingsJapgolly.std.SVGElement): HTMLElement | SVGElement | `false` = js.native
  def unselectCallback(selected: typingsJapgolly.std.HTMLElement): Unit = js.native
  def unselectCallback(selected: typingsJapgolly.std.SVGElement): Unit = js.native
}

