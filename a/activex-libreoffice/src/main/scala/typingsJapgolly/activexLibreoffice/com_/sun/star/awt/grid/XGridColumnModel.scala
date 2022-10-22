package typingsJapgolly.activexLibreoffice.com_.sun.star.awt.grid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XContainerListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCloneable
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instance of this interface is used by the {@link UnoControlGrid} to retrieve the column structure that is displayed in the actual control.
  *
  * If you do not need your own model implementation, you can also use the {@link DefaultGridColumnModel} .
  * @since OOo 3.3
  */
trait XGridColumnModel
  extends StObject
     with XComponent
     with XContainer
     with XCloneable {
  
  /**
    * Returns the number of columns.
    * @returns the number of columns.
    */
  val ColumnCount: Double
  
  /**
    * Returns all columns of the model.
    * @returns all columns associated with the model in a sequence of {@link XGridColumn} .
    */
  val Columns: SafeArray[XGridColumn]
  
  /**
    * Adds a column to the model.
    *
    * You should use the {@link createColumn()} member to create a new column. This gives implementations of the `XGridColumnModel` interface the
    * possibility to provide own column implementations which extend the basic {@link GridColumn} type.
    *
    * As soon as the column has been inserted into the model, the model takes ownership of it. This means when the column is removed, or when the column
    * model is disposed, the grid column is disposed as well.
    * @param column the column to add to the model.
    * @returns the index of new created column.
    * @throws com::sun::star::lang::IllegalArgumentException if the given column is not a valid element for the column container, or if it is `NULL` .
    */
  def addColumn(column: XGridColumn): Double
  
  /**
    * creates a new column for use with the column model.
    *
    * The newly created column is not yet inserted into the column container, you need to call {@link addColumn()} after you initialized the column object.
    */
  def createColumn(): XGridColumn
  
  /**
    * Returns a specific column.
    * @param index the position of the requested column.
    * @returns the requested column.
    */
  def getColumn(index: Double): XGridColumn
  
  /**
    * Returns the number of columns.
    * @returns the number of columns.
    */
  def getColumnCount(): Double
  
  /**
    * Returns all columns of the model.
    * @returns all columns associated with the model in a sequence of {@link XGridColumn} .
    */
  def getColumns(): SafeArray[XGridColumn]
  
  /**
    * removes a column from the model
    *
    * The column object will be disposed upon removal.
    * @param ColumnIndex denotes the index of the column to remove
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `ColumnIndex` does not denote a valid column index.
    */
  def removeColumn(ColumnIndex: Double): Unit
  
  /**
    * Fills the model with the given number of default columns
    *
    * Existing columns will be removed before adding new columns. Listeners at the column model will be notified one {@link
    * com.sun.star.container.XContainerListener.elementRemoved()} event for each removed column, and one {@link
    * com.sun.star.container.XContainerListener.elementInserted()} event for each insertion.
    * @param elements the number of default columns that should be set.
    */
  def setDefaultColumns(elements: Double): Unit
}
object XGridColumnModel {
  
  inline def apply(
    ColumnCount: Double,
    Columns: SafeArray[XGridColumn],
    acquire: Callback,
    addColumn: XGridColumn => Double,
    addContainerListener: XContainerListener => Callback,
    addEventListener: XEventListener => Callback,
    createClone: CallbackTo[XCloneable],
    createColumn: CallbackTo[XGridColumn],
    dispose: Callback,
    getColumn: Double => XGridColumn,
    getColumnCount: CallbackTo[Double],
    getColumns: CallbackTo[SafeArray[XGridColumn]],
    queryInterface: `type` => Any,
    release: Callback,
    removeColumn: Double => Callback,
    removeContainerListener: XContainerListener => Callback,
    removeEventListener: XEventListener => Callback,
    setDefaultColumns: Double => Callback
  ): XGridColumnModel = {
    val __obj = js.Dynamic.literal(ColumnCount = ColumnCount.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], acquire = acquire.toJsFn, addColumn = js.Any.fromFunction1(addColumn), addContainerListener = js.Any.fromFunction1((t0: XContainerListener) => addContainerListener(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), createClone = createClone.toJsFn, createColumn = createColumn.toJsFn, dispose = dispose.toJsFn, getColumn = js.Any.fromFunction1(getColumn), getColumnCount = getColumnCount.toJsFn, getColumns = getColumns.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeColumn = js.Any.fromFunction1((t0: Double) => removeColumn(t0).runNow()), removeContainerListener = js.Any.fromFunction1((t0: XContainerListener) => removeContainerListener(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), setDefaultColumns = js.Any.fromFunction1((t0: Double) => setDefaultColumns(t0).runNow()))
    __obj.asInstanceOf[XGridColumnModel]
  }
  
  extension [Self <: XGridColumnModel](x: Self) {
    
    inline def setAddColumn(value: XGridColumn => Double): Self = StObject.set(x, "addColumn", js.Any.fromFunction1(value))
    
    inline def setColumnCount(value: Double): Self = StObject.set(x, "ColumnCount", value.asInstanceOf[js.Any])
    
    inline def setColumns(value: SafeArray[XGridColumn]): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setCreateColumn(value: CallbackTo[XGridColumn]): Self = StObject.set(x, "createColumn", value.toJsFn)
    
    inline def setGetColumn(value: Double => XGridColumn): Self = StObject.set(x, "getColumn", js.Any.fromFunction1(value))
    
    inline def setGetColumnCount(value: CallbackTo[Double]): Self = StObject.set(x, "getColumnCount", value.toJsFn)
    
    inline def setGetColumns(value: CallbackTo[SafeArray[XGridColumn]]): Self = StObject.set(x, "getColumns", value.toJsFn)
    
    inline def setRemoveColumn(value: Double => Callback): Self = StObject.set(x, "removeColumn", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetDefaultColumns(value: Double => Callback): Self = StObject.set(x, "setDefaultColumns", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
