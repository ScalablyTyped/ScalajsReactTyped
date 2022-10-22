package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XArray
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XBlob
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XClob
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XRef
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XResultSet
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XResultSetMetaData
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XRowSetListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx.XColumnsSupplier
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx.XDeleteRows
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx.XRowLocate
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Date
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCancellable
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is a client side {@link RowSet} , which use retrieves is data based on a database table, a query or a SQL command or by a row set reader, who mustn't
  * support SQL. The connection of the row set is typically a named {@link DataSource} or a DataAccess component or a previous instantiated connection.
  *
  * Depending on the {@link com.sun.star.sdbc.ResultSetConcurrency} , the {@link RowSet} caches all data or uses an optimized way for retrieving the data,
  * such as, refetching rows by their keys or if provided, by their bookmarks.
  *
  * In addition, it provides events for {@link RowSet} navigation and {@link RowSet} modifications to approve the actions and to react on them.
  * @see com.sun.star.sdb.RowChangeAction
  * @see com.sun.star.sdb.RowChangeEvent
  * @see com.sun.star.sdb.RowsChangeEvent  **Notifications**  A row set is able to be operated in various ways, and additionally it notifies various chang
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XRowUpdate because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XColumnLocate because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XRow because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XResultSetUpdate because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XResultSet because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XResultSetMetaDataSupplier because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XWarningsSupplier because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XCloseable because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.ResultSet because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx.ResultSet because var conflicts: CursorName, FetchDirection, FetchSize, ResultSetConcurrency, ResultSetType. Inlined CanUpdateInsertedRows, IsBookmarkable
- typingsJapgolly.activexLibreoffice.com_.sun.star.sdb.ResultSet because var conflicts: CursorName, FetchDirection, FetchSize, ResultSetConcurrency, ResultSetType. Inlined  */ trait RowSet
  extends StObject
     with typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.RowSet
     with XCompletedExecution
     with XRowSetApproveBroadcaster
     with XResultSetAccess
     with XParametersSupplier
     with XColumnsSupplier
     with XCancellable
     with XRowLocate
     with XDeleteRows {
  
  /**
    * is the command which is currently used.
    * @see com.sun.star.sdb.CommandType
    */
  var ActiveCommand: String
  
  /**
    * is the connection generated by a {@link DataSource} or by a URL. It could also be set from outside. When set from outside the {@link RowSet} is not
    * responsible for the closing of the connection.
    */
  var ActiveConnection: XConnection
  
  /** indicates whether the filter should be applied or not, default is `FALSE` . */
  var ApplyFilter: Boolean
  
  /**
    * returns whether the result set supports updating of newly inserted rows. This may not work, as the result set may contain automatic generated data
    * which is used as key information.
    */
  var CanUpdateInsertedRows: Boolean
  
  /**
    * is the type of the command.
    * @see com.sun.star.sdb.CommandType
    */
  var CommandType: Double
  
  /** additional filter for a row set. */
  var Filter: String
  
  /** additional group by for the row set */
  var GroupBy: String
  
  /** additional having clause for the row set */
  var HavingClause: String
  
  /** indicates whether all results should be discarded or not. */
  var IgnoreResult: Boolean
  
  /** returns if the result set supports bookmark navigation. */
  var IsBookmarkable: Boolean
  
  /** indicates that the current row is modified. */
  var IsModified: Boolean
  
  /** indicates that the current row is going to be inserted to the database. */
  var IsNew: Boolean
  
  /** indicates that all rows of the row set have been counted. */
  var IsRowCountFinal: Boolean
  
  /** is a additional sort order definition for a row set. */
  var Order: String
  
  /**
    * indicates the privileges for insert, update, and delete.
    * @see com.sun.star.sdbcx.Privilege
    */
  var Privileges: Double
  
  /** contains the number of rows accessed in a the data source. */
  var RowCount: Double
  
  /** is the name of the table catalog */
  var UpdateCatalogName: String
  
  /** is the name of the table schema. */
  var UpdateSchemaName: String
  
  /** is the name of the table which should be updated, this is usually used for queries which relate to more than one table. */
  var UpdateTableName: String
}
object RowSet {
  
  inline def apply(
    ActiveCommand: String,
    ActiveConnection: XConnection,
    ApplyFilter: Boolean,
    Bookmark: Any,
    CanUpdateInsertedRows: Boolean,
    Columns: XNameAccess,
    Command: String,
    CommandType: Double,
    CursorName: String,
    DataSourceName: String,
    EscapeProcessing: Boolean,
    FetchDirection: Double,
    FetchSize: Double,
    Filter: String,
    GroupBy: String,
    HavingClause: String,
    IgnoreResult: Boolean,
    IsBookmarkable: Boolean,
    IsModified: Boolean,
    IsNew: Boolean,
    IsRowCountFinal: Boolean,
    MaxFieldSize: Double,
    MaxRows: Double,
    MetaData: XResultSetMetaData,
    Order: String,
    Parameters: XIndexAccess,
    Password: String,
    Privileges: Double,
    PropertySetInfo: XPropertySetInfo,
    QueryTimeOut: Double,
    ResultSetConcurrency: Double,
    ResultSetType: Double,
    Row: Double,
    RowCount: Double,
    Statement: XInterface,
    TransactionIsolation: Double,
    TypeMap: XNameAccess,
    URL: String,
    UpdateCatalogName: String,
    UpdateSchemaName: String,
    UpdateTableName: String,
    User: String,
    Warnings: Any,
    absolute: Double => Boolean,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addRowSetApproveListener: XRowSetApproveListener => Callback,
    addRowSetListener: XRowSetListener => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    afterLast: Callback,
    beforeFirst: Callback,
    cancel: Callback,
    cancelRowUpdates: Callback,
    clearParameters: Callback,
    clearWarnings: Callback,
    close: Callback,
    compareBookmarks: (Any, Any) => Double,
    createResultSet: CallbackTo[XResultSet],
    deleteRow: Callback,
    deleteRows: SeqEquiv[Any] => SafeArray[Double],
    dispose: Callback,
    execute: Callback,
    executeWithCompletion: XInteractionHandler => Callback,
    findColumn: String => Double,
    first: CallbackTo[Boolean],
    getArray: Double => XArray,
    getBinaryStream: Double => XInputStream,
    getBlob: Double => XBlob,
    getBookmark: CallbackTo[Any],
    getBoolean: Double => Boolean,
    getByte: Double => Double,
    getBytes: Double => SafeArray[Double],
    getCharacterStream: Double => XInputStream,
    getClob: Double => XClob,
    getColumns: CallbackTo[XNameAccess],
    getDate: Double => Date,
    getDouble: Double => Double,
    getFloat: Double => Double,
    getInt: Double => Double,
    getLong: Double => Double,
    getMetaData: CallbackTo[XResultSetMetaData],
    getObject: (Double, XNameAccess) => Any,
    getParameters: CallbackTo[XIndexAccess],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getRef: Double => XRef,
    getRow: CallbackTo[Double],
    getShort: Double => Double,
    getStatement: CallbackTo[XInterface],
    getString: Double => String,
    getTime: Double => Time,
    getTimestamp: Double => DateTime,
    getWarnings: CallbackTo[Any],
    hasOrderedBookmarks: CallbackTo[Boolean],
    hashBookmark: Any => Double,
    insertRow: Callback,
    isAfterLast: CallbackTo[Boolean],
    isBeforeFirst: CallbackTo[Boolean],
    isFirst: CallbackTo[Boolean],
    isLast: CallbackTo[Boolean],
    last: CallbackTo[Boolean],
    moveRelativeToBookmark: (Any, Double) => Boolean,
    moveToBookmark: Any => Boolean,
    moveToCurrentRow: Callback,
    moveToInsertRow: Callback,
    next: CallbackTo[Boolean],
    previous: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    refreshRow: Callback,
    relative: Double => Boolean,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeRowSetApproveListener: XRowSetApproveListener => Callback,
    removeRowSetListener: XRowSetListener => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    rowDeleted: CallbackTo[Boolean],
    rowInserted: CallbackTo[Boolean],
    rowUpdated: CallbackTo[Boolean],
    setArray: (Double, XArray) => Callback,
    setBinaryStream: (Double, XInputStream, Double) => Callback,
    setBlob: (Double, XBlob) => Callback,
    setBoolean: (Double, Boolean) => Callback,
    setByte: (Double, Double) => Callback,
    setBytes: (Double, SeqEquiv[Double]) => Callback,
    setCharacterStream: (Double, XInputStream, Double) => Callback,
    setClob: (Double, XClob) => Callback,
    setDate: (Double, Date) => Callback,
    setDouble: (Double, Double) => Callback,
    setFloat: (Double, Double) => Callback,
    setInt: (Double, Double) => Callback,
    setLong: (Double, Double) => Callback,
    setNull: (Double, Double) => Callback,
    setObject: (Double, Any) => Callback,
    setObjectNull: (Double, Double, String) => Callback,
    setObjectWithInfo: (Double, Any, Double, Double) => Callback,
    setPropertyValue: (String, Any) => Callback,
    setRef: (Double, XRef) => Callback,
    setShort: (Double, Double) => Callback,
    setString: (Double, String) => Callback,
    setTime: (Double, Time) => Callback,
    setTimestamp: (Double, DateTime) => Callback,
    updateBinaryStream: (Double, XInputStream, Double) => Callback,
    updateBoolean: (Double, Boolean) => Callback,
    updateByte: (Double, Double) => Callback,
    updateBytes: (Double, SeqEquiv[Double]) => Callback,
    updateCharacterStream: (Double, XInputStream, Double) => Callback,
    updateDate: (Double, Date) => Callback,
    updateDouble: (Double, Double) => Callback,
    updateFloat: (Double, Double) => Callback,
    updateInt: (Double, Double) => Callback,
    updateLong: (Double, Double) => Callback,
    updateNull: Double => Callback,
    updateNumericObject: (Double, Any, Double) => Callback,
    updateObject: (Double, Any) => Callback,
    updateRow: Callback,
    updateShort: (Double, Double) => Callback,
    updateString: (Double, String) => Callback,
    updateTime: (Double, Time) => Callback,
    updateTimestamp: (Double, DateTime) => Callback,
    wasNull: CallbackTo[Boolean]
  ): RowSet = {
    val __obj = js.Dynamic.literal(ActiveCommand = ActiveCommand.asInstanceOf[js.Any], ActiveConnection = ActiveConnection.asInstanceOf[js.Any], ApplyFilter = ApplyFilter.asInstanceOf[js.Any], Bookmark = Bookmark.asInstanceOf[js.Any], CanUpdateInsertedRows = CanUpdateInsertedRows.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any], CommandType = CommandType.asInstanceOf[js.Any], CursorName = CursorName.asInstanceOf[js.Any], DataSourceName = DataSourceName.asInstanceOf[js.Any], EscapeProcessing = EscapeProcessing.asInstanceOf[js.Any], FetchDirection = FetchDirection.asInstanceOf[js.Any], FetchSize = FetchSize.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], GroupBy = GroupBy.asInstanceOf[js.Any], HavingClause = HavingClause.asInstanceOf[js.Any], IgnoreResult = IgnoreResult.asInstanceOf[js.Any], IsBookmarkable = IsBookmarkable.asInstanceOf[js.Any], IsModified = IsModified.asInstanceOf[js.Any], IsNew = IsNew.asInstanceOf[js.Any], IsRowCountFinal = IsRowCountFinal.asInstanceOf[js.Any], MaxFieldSize = MaxFieldSize.asInstanceOf[js.Any], MaxRows = MaxRows.asInstanceOf[js.Any], MetaData = MetaData.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], Privileges = Privileges.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], QueryTimeOut = QueryTimeOut.asInstanceOf[js.Any], ResultSetConcurrency = ResultSetConcurrency.asInstanceOf[js.Any], ResultSetType = ResultSetType.asInstanceOf[js.Any], Row = Row.asInstanceOf[js.Any], RowCount = RowCount.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any], TransactionIsolation = TransactionIsolation.asInstanceOf[js.Any], TypeMap = TypeMap.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], UpdateCatalogName = UpdateCatalogName.asInstanceOf[js.Any], UpdateSchemaName = UpdateSchemaName.asInstanceOf[js.Any], UpdateTableName = UpdateTableName.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any], Warnings = Warnings.asInstanceOf[js.Any], absolute = js.Any.fromFunction1(absolute), acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addRowSetApproveListener = js.Any.fromFunction1((t0: XRowSetApproveListener) => addRowSetApproveListener(t0).runNow()), addRowSetListener = js.Any.fromFunction1((t0: XRowSetListener) => addRowSetListener(t0).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), afterLast = afterLast.toJsFn, beforeFirst = beforeFirst.toJsFn, cancel = cancel.toJsFn, cancelRowUpdates = cancelRowUpdates.toJsFn, clearParameters = clearParameters.toJsFn, clearWarnings = clearWarnings.toJsFn, close = close.toJsFn, compareBookmarks = js.Any.fromFunction2(compareBookmarks), createResultSet = createResultSet.toJsFn, deleteRow = deleteRow.toJsFn, deleteRows = js.Any.fromFunction1(deleteRows), dispose = dispose.toJsFn, execute = execute.toJsFn, executeWithCompletion = js.Any.fromFunction1((t0: XInteractionHandler) => executeWithCompletion(t0).runNow()), findColumn = js.Any.fromFunction1(findColumn), first = first.toJsFn, getArray = js.Any.fromFunction1(getArray), getBinaryStream = js.Any.fromFunction1(getBinaryStream), getBlob = js.Any.fromFunction1(getBlob), getBookmark = getBookmark.toJsFn, getBoolean = js.Any.fromFunction1(getBoolean), getByte = js.Any.fromFunction1(getByte), getBytes = js.Any.fromFunction1(getBytes), getCharacterStream = js.Any.fromFunction1(getCharacterStream), getClob = js.Any.fromFunction1(getClob), getColumns = getColumns.toJsFn, getDate = js.Any.fromFunction1(getDate), getDouble = js.Any.fromFunction1(getDouble), getFloat = js.Any.fromFunction1(getFloat), getInt = js.Any.fromFunction1(getInt), getLong = js.Any.fromFunction1(getLong), getMetaData = getMetaData.toJsFn, getObject = js.Any.fromFunction2(getObject), getParameters = getParameters.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRef = js.Any.fromFunction1(getRef), getRow = getRow.toJsFn, getShort = js.Any.fromFunction1(getShort), getStatement = getStatement.toJsFn, getString = js.Any.fromFunction1(getString), getTime = js.Any.fromFunction1(getTime), getTimestamp = js.Any.fromFunction1(getTimestamp), getWarnings = getWarnings.toJsFn, hasOrderedBookmarks = hasOrderedBookmarks.toJsFn, hashBookmark = js.Any.fromFunction1(hashBookmark), insertRow = insertRow.toJsFn, isAfterLast = isAfterLast.toJsFn, isBeforeFirst = isBeforeFirst.toJsFn, isFirst = isFirst.toJsFn, isLast = isLast.toJsFn, last = last.toJsFn, moveRelativeToBookmark = js.Any.fromFunction2(moveRelativeToBookmark), moveToBookmark = js.Any.fromFunction1(moveToBookmark), moveToCurrentRow = moveToCurrentRow.toJsFn, moveToInsertRow = moveToInsertRow.toJsFn, next = next.toJsFn, previous = previous.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), refreshRow = refreshRow.toJsFn, relative = js.Any.fromFunction1(relative), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeRowSetApproveListener = js.Any.fromFunction1((t0: XRowSetApproveListener) => removeRowSetApproveListener(t0).runNow()), removeRowSetListener = js.Any.fromFunction1((t0: XRowSetListener) => removeRowSetListener(t0).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), rowDeleted = rowDeleted.toJsFn, rowInserted = rowInserted.toJsFn, rowUpdated = rowUpdated.toJsFn, setArray = js.Any.fromFunction2((t0: Double, t1: XArray) => (setArray(t0, t1)).runNow()), setBinaryStream = js.Any.fromFunction3((t0: Double, t1: XInputStream, t2: Double) => (setBinaryStream(t0, t1, t2)).runNow()), setBlob = js.Any.fromFunction2((t0: Double, t1: XBlob) => (setBlob(t0, t1)).runNow()), setBoolean = js.Any.fromFunction2((t0: Double, t1: Boolean) => (setBoolean(t0, t1)).runNow()), setByte = js.Any.fromFunction2((t0: Double, t1: Double) => (setByte(t0, t1)).runNow()), setBytes = js.Any.fromFunction2((t0: Double, t1: SeqEquiv[Double]) => (setBytes(t0, t1)).runNow()), setCharacterStream = js.Any.fromFunction3((t0: Double, t1: XInputStream, t2: Double) => (setCharacterStream(t0, t1, t2)).runNow()), setClob = js.Any.fromFunction2((t0: Double, t1: XClob) => (setClob(t0, t1)).runNow()), setDate = js.Any.fromFunction2((t0: Double, t1: Date) => (setDate(t0, t1)).runNow()), setDouble = js.Any.fromFunction2((t0: Double, t1: Double) => (setDouble(t0, t1)).runNow()), setFloat = js.Any.fromFunction2((t0: Double, t1: Double) => (setFloat(t0, t1)).runNow()), setInt = js.Any.fromFunction2((t0: Double, t1: Double) => (setInt(t0, t1)).runNow()), setLong = js.Any.fromFunction2((t0: Double, t1: Double) => (setLong(t0, t1)).runNow()), setNull = js.Any.fromFunction2((t0: Double, t1: Double) => (setNull(t0, t1)).runNow()), setObject = js.Any.fromFunction2((t0: Double, t1: Any) => (setObject(t0, t1)).runNow()), setObjectNull = js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (setObjectNull(t0, t1, t2)).runNow()), setObjectWithInfo = js.Any.fromFunction4((t0: Double, t1: Any, t2: Double, t3: Double) => (setObjectWithInfo(t0, t1, t2, t3)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setRef = js.Any.fromFunction2((t0: Double, t1: XRef) => (setRef(t0, t1)).runNow()), setShort = js.Any.fromFunction2((t0: Double, t1: Double) => (setShort(t0, t1)).runNow()), setString = js.Any.fromFunction2((t0: Double, t1: String) => (setString(t0, t1)).runNow()), setTime = js.Any.fromFunction2((t0: Double, t1: Time) => (setTime(t0, t1)).runNow()), setTimestamp = js.Any.fromFunction2((t0: Double, t1: DateTime) => (setTimestamp(t0, t1)).runNow()), updateBinaryStream = js.Any.fromFunction3((t0: Double, t1: XInputStream, t2: Double) => (updateBinaryStream(t0, t1, t2)).runNow()), updateBoolean = js.Any.fromFunction2((t0: Double, t1: Boolean) => (updateBoolean(t0, t1)).runNow()), updateByte = js.Any.fromFunction2((t0: Double, t1: Double) => (updateByte(t0, t1)).runNow()), updateBytes = js.Any.fromFunction2((t0: Double, t1: SeqEquiv[Double]) => (updateBytes(t0, t1)).runNow()), updateCharacterStream = js.Any.fromFunction3((t0: Double, t1: XInputStream, t2: Double) => (updateCharacterStream(t0, t1, t2)).runNow()), updateDate = js.Any.fromFunction2((t0: Double, t1: Date) => (updateDate(t0, t1)).runNow()), updateDouble = js.Any.fromFunction2((t0: Double, t1: Double) => (updateDouble(t0, t1)).runNow()), updateFloat = js.Any.fromFunction2((t0: Double, t1: Double) => (updateFloat(t0, t1)).runNow()), updateInt = js.Any.fromFunction2((t0: Double, t1: Double) => (updateInt(t0, t1)).runNow()), updateLong = js.Any.fromFunction2((t0: Double, t1: Double) => (updateLong(t0, t1)).runNow()), updateNull = js.Any.fromFunction1((t0: Double) => updateNull(t0).runNow()), updateNumericObject = js.Any.fromFunction3((t0: Double, t1: Any, t2: Double) => (updateNumericObject(t0, t1, t2)).runNow()), updateObject = js.Any.fromFunction2((t0: Double, t1: Any) => (updateObject(t0, t1)).runNow()), updateRow = updateRow.toJsFn, updateShort = js.Any.fromFunction2((t0: Double, t1: Double) => (updateShort(t0, t1)).runNow()), updateString = js.Any.fromFunction2((t0: Double, t1: String) => (updateString(t0, t1)).runNow()), updateTime = js.Any.fromFunction2((t0: Double, t1: Time) => (updateTime(t0, t1)).runNow()), updateTimestamp = js.Any.fromFunction2((t0: Double, t1: DateTime) => (updateTimestamp(t0, t1)).runNow()), wasNull = wasNull.toJsFn)
    __obj.asInstanceOf[RowSet]
  }
  
  extension [Self <: RowSet](x: Self) {
    
    inline def setActiveCommand(value: String): Self = StObject.set(x, "ActiveCommand", value.asInstanceOf[js.Any])
    
    inline def setActiveConnection(value: XConnection): Self = StObject.set(x, "ActiveConnection", value.asInstanceOf[js.Any])
    
    inline def setApplyFilter(value: Boolean): Self = StObject.set(x, "ApplyFilter", value.asInstanceOf[js.Any])
    
    inline def setCanUpdateInsertedRows(value: Boolean): Self = StObject.set(x, "CanUpdateInsertedRows", value.asInstanceOf[js.Any])
    
    inline def setCommandType(value: Double): Self = StObject.set(x, "CommandType", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setGroupBy(value: String): Self = StObject.set(x, "GroupBy", value.asInstanceOf[js.Any])
    
    inline def setHavingClause(value: String): Self = StObject.set(x, "HavingClause", value.asInstanceOf[js.Any])
    
    inline def setIgnoreResult(value: Boolean): Self = StObject.set(x, "IgnoreResult", value.asInstanceOf[js.Any])
    
    inline def setIsBookmarkable(value: Boolean): Self = StObject.set(x, "IsBookmarkable", value.asInstanceOf[js.Any])
    
    inline def setIsModified(value: Boolean): Self = StObject.set(x, "IsModified", value.asInstanceOf[js.Any])
    
    inline def setIsNew(value: Boolean): Self = StObject.set(x, "IsNew", value.asInstanceOf[js.Any])
    
    inline def setIsRowCountFinal(value: Boolean): Self = StObject.set(x, "IsRowCountFinal", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: String): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    inline def setPrivileges(value: Double): Self = StObject.set(x, "Privileges", value.asInstanceOf[js.Any])
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "RowCount", value.asInstanceOf[js.Any])
    
    inline def setUpdateCatalogName(value: String): Self = StObject.set(x, "UpdateCatalogName", value.asInstanceOf[js.Any])
    
    inline def setUpdateSchemaName(value: String): Self = StObject.set(x, "UpdateSchemaName", value.asInstanceOf[js.Any])
    
    inline def setUpdateTableName(value: String): Self = StObject.set(x, "UpdateTableName", value.asInstanceOf[js.Any])
  }
}
