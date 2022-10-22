package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * enhances the functionality of a result set. It allows implementation of a special behavior for a result set and notifies an application on certain row
  * set events such as a change in its value.
  *
  * The {@link XRowSet} interface is unique in that it is intended to be a software layer on top of an SDBC driver. Implementations of the {@link RowSet}
  * interface can be provided by anyone.
  */
trait XRowSet
  extends StObject
     with XResultSet {
  
  /**
    * adds the specified listener to receive the events "cursorMoved", "rowChanged", and "rowSetChanged".
    * @param listener the listener which should be registered
    */
  def addRowSetListener(listener: XRowSetListener): Unit
  
  /**
    * populates a row set with data. The description of the data source and other important information for filling the row set with data.
    * @throws SQLException if a database access error occurs.
    */
  def execute(): Unit
  
  /**
    * removes the specified listener.
    * @param listener the listener which should be registered
    */
  def removeRowSetListener(listener: XRowSetListener): Unit
}
object XRowSet {
  
  inline def apply(
    Row: Double,
    Statement: XInterface,
    absolute: Double => Boolean,
    acquire: Callback,
    addRowSetListener: XRowSetListener => Callback,
    afterLast: Callback,
    beforeFirst: Callback,
    execute: Callback,
    first: CallbackTo[Boolean],
    getRow: CallbackTo[Double],
    getStatement: CallbackTo[XInterface],
    isAfterLast: CallbackTo[Boolean],
    isBeforeFirst: CallbackTo[Boolean],
    isFirst: CallbackTo[Boolean],
    isLast: CallbackTo[Boolean],
    last: CallbackTo[Boolean],
    next: CallbackTo[Boolean],
    previous: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    refreshRow: Callback,
    relative: Double => Boolean,
    release: Callback,
    removeRowSetListener: XRowSetListener => Callback,
    rowDeleted: CallbackTo[Boolean],
    rowInserted: CallbackTo[Boolean],
    rowUpdated: CallbackTo[Boolean]
  ): XRowSet = {
    val __obj = js.Dynamic.literal(Row = Row.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any], absolute = js.Any.fromFunction1(absolute), acquire = acquire.toJsFn, addRowSetListener = js.Any.fromFunction1((t0: XRowSetListener) => addRowSetListener(t0).runNow()), afterLast = afterLast.toJsFn, beforeFirst = beforeFirst.toJsFn, execute = execute.toJsFn, first = first.toJsFn, getRow = getRow.toJsFn, getStatement = getStatement.toJsFn, isAfterLast = isAfterLast.toJsFn, isBeforeFirst = isBeforeFirst.toJsFn, isFirst = isFirst.toJsFn, isLast = isLast.toJsFn, last = last.toJsFn, next = next.toJsFn, previous = previous.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), refreshRow = refreshRow.toJsFn, relative = js.Any.fromFunction1(relative), release = release.toJsFn, removeRowSetListener = js.Any.fromFunction1((t0: XRowSetListener) => removeRowSetListener(t0).runNow()), rowDeleted = rowDeleted.toJsFn, rowInserted = rowInserted.toJsFn, rowUpdated = rowUpdated.toJsFn)
    __obj.asInstanceOf[XRowSet]
  }
  
  extension [Self <: XRowSet](x: Self) {
    
    inline def setAddRowSetListener(value: XRowSetListener => Callback): Self = StObject.set(x, "addRowSetListener", js.Any.fromFunction1((t0: XRowSetListener) => value(t0).runNow()))
    
    inline def setExecute(value: Callback): Self = StObject.set(x, "execute", value.toJsFn)
    
    inline def setRemoveRowSetListener(value: XRowSetListener => Callback): Self = StObject.set(x, "removeRowSetListener", js.Any.fromFunction1((t0: XRowSetListener) => value(t0).runNow()))
  }
}
