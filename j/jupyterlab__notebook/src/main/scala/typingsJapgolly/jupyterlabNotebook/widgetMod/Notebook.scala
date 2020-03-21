package typingsJapgolly.jupyterlabNotebook.widgetMod

import typingsJapgolly.jupyterlabCells.mod.Cell
import typingsJapgolly.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typingsJapgolly.jupyterlabNotebook.AnonAnchor
import typingsJapgolly.jupyterlabNotebook.widgetMod.Notebook.IOptions
import typingsJapgolly.phosphorSignaling.mod.ISignal
import typingsJapgolly.phosphorWidgets.mod.Widget.ResizeMessage
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook/lib/widget", "Notebook")
@js.native
class Notebook protected () extends StaticNotebook {
  /**
    * Construct a notebook widget.
    */
  def this(options: IOptions) = this()
  var _activeCell: js.Any = js.native
  var _activeCellChanged: js.Any = js.native
  var _activeCellIndex: js.Any = js.native
  var _cellLayoutStateCache: js.UndefOr[js.Any] = js.native
  var _checkCacheOnNextResize: js.Any = js.native
  var _drag: js.Any = js.native
  var _dragData: js.Any = js.native
  /**
    * Ensure that the notebook has proper focus.
    */
  var _ensureFocus: js.Any = js.native
  /**
    * Handle `contextmenu` event.
    */
  var _evtContextMenuCapture: js.Any = js.native
  /**
    * Handle `dblclick` events for the widget.
    */
  var _evtDblClick: js.Any = js.native
  /**
    * Handle the `'mousemove'` event for the widget.
    */
  var _evtDocumentMousemove: js.Any = js.native
  /**
    * Handle the `'mouseup'` event on the document.
    */
  var _evtDocumentMouseup: js.Any = js.native
  /**
    * Handle the `'p-dragenter'` event for the widget.
    */
  var _evtDragEnter: js.Any = js.native
  /**
    * Handle the `'p-dragleave'` event for the widget.
    */
  var _evtDragLeave: js.Any = js.native
  /**
    * Handle the `'p-dragover'` event for the widget.
    */
  var _evtDragOver: js.Any = js.native
  /**
    * Handle the `'p-drop'` event for the widget.
    */
  var _evtDrop: js.Any = js.native
  /**
    * Handle `focus` events for the widget.
    */
  var _evtFocusIn: js.Any = js.native
  /**
    * Handle `focusout` events for the notebook.
    */
  var _evtFocusOut: js.Any = js.native
  /**
    * Handle `mousedown` events for the widget.
    */
  var _evtMouseDown: js.Any = js.native
  /**
    * Handle `mousedown` event in the capture phase for the widget.
    */
  var _evtMouseDownCapture: js.Any = js.native
  /**
    * Find the cell index containing the target html element.
    *
    * #### Notes
    * Returns -1 if the cell is not found.
    */
  var _findCell: js.Any = js.native
  var _fragment: js.Any = js.native
  var _mode: js.Any = js.native
  var _mouseMode: js.Any = js.native
  /**
    * Handle edge request signals from cells.
    */
  var _onEdgeRequest: js.Any = js.native
  var _selectionChanged: js.Any = js.native
  /**
    * Start a drag event.
    */
  var _startDrag: js.Any = js.native
  var _stateChanged: js.Any = js.native
  /**
    * Remove selections from inactive cells to avoid
    * spurious cursors.
    */
  var _trimSelections: js.Any = js.native
  /**
    * Get the active cell widget.
    *
    * #### Notes
    * This is a cell or `null` if there is no active cell.
    */
  val activeCell: Cell | Null = js.native
  /**
    * A signal emitted when the active cell changes.
    *
    * #### Notes
    * This can be due to the active index changing or the
    * cell at the active index changing.
    */
  val activeCellChanged: ISignal[this.type, Cell] = js.native
  /**
    * The active cell index of the notebook.
    *
    * #### Notes
    * The index will be clamped to the bounds of the notebook cells.
    */
  var activeCellIndex: Double = js.native
  /**
    * The interactivity mode of the notebook.
    */
  var mode: NotebookMode = js.native
  /**
    * A signal emitted when the selection state of the notebook changes.
    */
  val selectionChanged: ISignal[this.type, Unit] = js.native
  /**
    * A signal emitted when the state of the notebook changes.
    */
  val stateChanged: ISignal[this.type, IChangedArgs[_, String]] = js.native
  /**
    * Deselect a cell widget.
    *
    * #### Notes
    * It is a no-op if the value does not change.
    * It will emit the `selectionChanged` signal.
    */
  def deselect(widget: Cell): Unit = js.native
  /**
    * Deselect all of the cells.
    */
  def deselectAll(): Unit = js.native
  /**
    * Move the head of an existing contiguous selection to extend the selection.
    *
    * @param index - The new head of the existing selection.
    *
    * #### Notes
    * If there is no existing selection, the active cell is considered an
    * existing one-cell selection.
    *
    * If the new selection is a single cell, that cell becomes the active cell
    * and all cells are deselected.
    *
    * There is no change if there are no cells (i.e., activeCellIndex is -1).
    */
  def extendContiguousSelectionTo(index: Double): Unit = js.native
  /**
    * Get the head and anchor of a contiguous cell selection.
    *
    * The head of a contiguous selection is always the active cell.
    *
    * If there are no cells selected, `{head: null, anchor: null}` is returned.
    *
    * Throws an error if the currently selected cells do not form a contiguous
    * selection.
    */
  def getContiguousSelection(): AnonAnchor = js.native
  /**
    * Handle the DOM events for the widget.
    *
    * @param event - The DOM event sent to the widget.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the notebook panel's node. It should
    * not be called directly by user code.
    */
  def handleEvent(event: Event_): Unit = js.native
  /**
    * Whether a cell is selected.
    */
  def isSelected(widget: Cell): Boolean = js.native
  /**
    * Whether a cell is selected or is the active cell.
    */
  def isSelectedOrActive(widget: Cell): Boolean = js.native
  /**
    * A message handler invoked on a `'resize'` message.
    */
  /* protected */ def onResize(msg: ResizeMessage): Unit = js.native
  /**
    * Scroll so that the given position is centered.
    *
    * @param position - The vertical position in the notebook widget.
    *
    * @param threshold - An optional threshold for the scroll (0-50, defaults to
    * 25).
    *
    * #### Notes
    * If the position is within the threshold percentage of the widget height,
    * measured from the center of the widget, the scroll position will not be
    * changed. A threshold of 0 means we will always scroll so the position is
    * centered, and a threshold of 50 means scrolling only happens if position is
    * outside the current window.
    */
  def scrollToPosition(position: Double): Unit = js.native
  def scrollToPosition(position: Double, threshold: Double): Unit = js.native
  /**
    * Select a cell widget.
    *
    * #### Notes
    * It is a no-op if the value does not change.
    * It will emit the `selectionChanged` signal.
    */
  def select(widget: Cell): Unit = js.native
  /**
    * Set URI fragment identifier.
    */
  def setFragment(fragment: String): Unit = js.native
}

@JSImport("@jupyterlab/notebook/lib/widget", "Notebook")
@js.native
object Notebook extends js.Object {
  /**
    * The default implementation of a notebook content factory..
    *
    * #### Notes
    * Override methods on this class to customize the default notebook factory
    * methods that create notebook content.
    */
  @js.native
  class ContentFactory ()
    extends typingsJapgolly.jupyterlabNotebook.widgetMod.StaticNotebook.ContentFactory
  
  val defaultContentFactory: IContentFactory = js.native
  /**
    * A namespace for the notebook content factory.
    */
  @js.native
  object ContentFactory extends js.Object {
    /**
      * An options object for initializing a notebook content factory.
      */
    type IOptions = typingsJapgolly.jupyterlabNotebook.widgetMod.StaticNotebook.ContentFactory.IOptions
  }
  
  /**
    * The content factory for the notebook widget.
    */
  type IContentFactory = typingsJapgolly.jupyterlabNotebook.widgetMod.StaticNotebook.IContentFactory
  /**
    * An options object for initializing a notebook widget.
    */
  type IOptions = typingsJapgolly.jupyterlabNotebook.widgetMod.StaticNotebook.IOptions
}

