package typingsJapgolly.jupyterlabSharedModels.libApiMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabNbformat.mod.INotebookMetadata
import typingsJapgolly.jupyterlabSharedModels.anon.PartialINotebookMetadata
import typingsJapgolly.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISharedNotebook
  extends StObject
     with ISharedDocument {
  
  /**
    * The list of shared cells in the notebook.
    */
  val cells: js.Array[ISharedCell]
  
  /**
    * The changed signal.
    */
  @JSName("changed")
  val changed_ISharedNotebook: ISignal[this.type, NotebookChange]
  
  /**
    * Remove a cell.
    *
    * @param index: Index of the cell to remove.
    */
  def deleteCell(index: Double): Unit
  
  /**
    * Remove a range of cells.
    *
    * @param from: The start index of the range to remove (inclusive).
    *
    * @param to: The end index of the range to remove (exclusive).
    */
  def deleteCellRange(from: Double, to: Double): Unit
  
  /**
    * Get a shared cell by index.
    *
    * @param index: Cell's position.
    *
    * @returns The requested shared cell.
    */
  def getCell(index: Double): ISharedCell
  
  /**
    * Returns the metadata associated with the notebook.
    *
    * @returns Notebook's metadata.
    */
  def getMetadata(): INotebookMetadata
  
  /**
    * Insert a shared cell into a specific position.
    *
    * @param index: Cell's position.
    *
    * @param cell: Cell to insert.
    */
  def insertCell(index: Double, cell: ISharedCell): Unit
  
  /**
    * Insert a list of shared cells into a specific position.
    *
    * @param index: Position to insert the cells.
    *
    * @param cells: Array of shared cells to insert.
    */
  def insertCells(index: Double, cells: js.Array[ISharedCell]): Unit
  
  /**
    * Move a cell.
    *
    * @param fromIndex: Index of the cell to move.
    *
    * @param toIndex: New position of the cell.
    */
  def moveCell(fromIndex: Double, toIndex: Double): Unit
  
  /**
    * The major version number of the nbformat.
    */
  val nbformat: Double
  
  /**
    * The minor version number of the nbformat.
    */
  val nbformat_minor: Double
  
  /**
    * Sets the metadata associated with the notebook.
    *
    * @param metadata: Notebook's metadata.
    */
  def setMetadata(metadata: INotebookMetadata): Unit
  
  /**
    * Updates the metadata associated with the notebook.
    *
    * @param value: Metadata's attribute to update.
    */
  def updateMetadata(value: PartialINotebookMetadata): Unit
}
object ISharedNotebook {
  
  inline def apply(
    canRedo: CallbackTo[Boolean],
    canUndo: CallbackTo[Boolean],
    cells: js.Array[ISharedCell],
    changed: ISignal[ISharedNotebook, NotebookChange],
    clearUndoHistory: Callback,
    deleteCell: Double => Callback,
    deleteCellRange: (Double, Double) => Callback,
    dirty: Boolean,
    dispose: Callback,
    getCell: Double => ISharedCell,
    getMetadata: CallbackTo[INotebookMetadata],
    insertCell: (Double, ISharedCell) => Callback,
    insertCells: (Double, js.Array[ISharedCell]) => Callback,
    isDisposed: Boolean,
    moveCell: (Double, Double) => Callback,
    nbformat: Double,
    nbformat_minor: Double,
    redo: Callback,
    setMetadata: INotebookMetadata => Callback,
    transact: js.Function0[Unit] => Callback,
    undo: Callback,
    updateMetadata: PartialINotebookMetadata => Callback
  ): ISharedNotebook = {
    val __obj = js.Dynamic.literal(canRedo = canRedo.toJsFn, canUndo = canUndo.toJsFn, cells = cells.asInstanceOf[js.Any], changed = changed.asInstanceOf[js.Any], clearUndoHistory = clearUndoHistory.toJsFn, deleteCell = js.Any.fromFunction1((t0: Double) => deleteCell(t0).runNow()), deleteCellRange = js.Any.fromFunction2((t0: Double, t1: Double) => (deleteCellRange(t0, t1)).runNow()), dirty = dirty.asInstanceOf[js.Any], dispose = dispose.toJsFn, getCell = js.Any.fromFunction1(getCell), getMetadata = getMetadata.toJsFn, insertCell = js.Any.fromFunction2((t0: Double, t1: ISharedCell) => (insertCell(t0, t1)).runNow()), insertCells = js.Any.fromFunction2((t0: Double, t1: js.Array[ISharedCell]) => (insertCells(t0, t1)).runNow()), isDisposed = isDisposed.asInstanceOf[js.Any], moveCell = js.Any.fromFunction2((t0: Double, t1: Double) => (moveCell(t0, t1)).runNow()), nbformat = nbformat.asInstanceOf[js.Any], nbformat_minor = nbformat_minor.asInstanceOf[js.Any], redo = redo.toJsFn, setMetadata = js.Any.fromFunction1((t0: INotebookMetadata) => setMetadata(t0).runNow()), transact = js.Any.fromFunction1((t0: js.Function0[Unit]) => transact(t0).runNow()), undo = undo.toJsFn, updateMetadata = js.Any.fromFunction1((t0: PartialINotebookMetadata) => updateMetadata(t0).runNow()))
    __obj.asInstanceOf[ISharedNotebook]
  }
  
  /**
    * The options used to initialize a a ISharedNotebook
    */
  trait IOptions extends StObject {
    
    /**
      * Wether the the undo/redo logic should be
      * considered on the full document across all cells.
      */
    var disableDocumentWideUndoRedo: Boolean
  }
  object IOptions {
    
    inline def apply(disableDocumentWideUndoRedo: Boolean): IOptions = {
      val __obj = js.Dynamic.literal(disableDocumentWideUndoRedo = disableDocumentWideUndoRedo.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setDisableDocumentWideUndoRedo(value: Boolean): Self = StObject.set(x, "disableDocumentWideUndoRedo", value.asInstanceOf[js.Any])
    }
  }
  
  extension [Self <: ISharedNotebook](x: Self) {
    
    inline def setCells(value: js.Array[ISharedCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsVarargs(value: ISharedCell*): Self = StObject.set(x, "cells", js.Array(value*))
    
    inline def setChanged(value: ISignal[ISharedNotebook, NotebookChange]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    inline def setDeleteCell(value: Double => Callback): Self = StObject.set(x, "deleteCell", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setDeleteCellRange(value: (Double, Double) => Callback): Self = StObject.set(x, "deleteCellRange", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setGetCell(value: Double => ISharedCell): Self = StObject.set(x, "getCell", js.Any.fromFunction1(value))
    
    inline def setGetMetadata(value: CallbackTo[INotebookMetadata]): Self = StObject.set(x, "getMetadata", value.toJsFn)
    
    inline def setInsertCell(value: (Double, ISharedCell) => Callback): Self = StObject.set(x, "insertCell", js.Any.fromFunction2((t0: Double, t1: ISharedCell) => (value(t0, t1)).runNow()))
    
    inline def setInsertCells(value: (Double, js.Array[ISharedCell]) => Callback): Self = StObject.set(x, "insertCells", js.Any.fromFunction2((t0: Double, t1: js.Array[ISharedCell]) => (value(t0, t1)).runNow()))
    
    inline def setMoveCell(value: (Double, Double) => Callback): Self = StObject.set(x, "moveCell", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setNbformat(value: Double): Self = StObject.set(x, "nbformat", value.asInstanceOf[js.Any])
    
    inline def setNbformat_minor(value: Double): Self = StObject.set(x, "nbformat_minor", value.asInstanceOf[js.Any])
    
    inline def setSetMetadata(value: INotebookMetadata => Callback): Self = StObject.set(x, "setMetadata", js.Any.fromFunction1((t0: INotebookMetadata) => value(t0).runNow()))
    
    inline def setUpdateMetadata(value: PartialINotebookMetadata => Callback): Self = StObject.set(x, "updateMetadata", js.Any.fromFunction1((t0: PartialINotebookMetadata) => value(t0).runNow()))
  }
}
