package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Date
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is a client side {@link ResultSet} , which combines the characteristics of a {@link com.sun.star.sdbc.Statement} and a {@link
  * com.sun.star.sdbc.ResultSet} .
  *
  * It acts like a typical bean. Before you use the {@link RowSet} , you have to specify a set of properties like a DataSource and a Command and other
  * properties known of {@link Statement} . ;  Afterwards, you can populate the {@link RowSet} by its execute method to fill the set with data.
  *
  * On the one hand, a {@link RowSet} can be used as a short cut to retrieve the data of a DataSource. You don't have to establish a connection, create a
  * {@link Statement} , and then create a {@link ResultSet} . On the other hand, a row set can be used to implement capabilities for a result set, which
  * are not supported by a driver result set, like caching strategies or update capabilities.
  */
trait RowSet
  extends StObject
     with ResultSet
     with XRowSet
     with XParameters {
  
  /** is the command which should be executed. */
  var Command: String
  
  /**
    * is the name of a named datasource to use.
    * @see com.sun.star.sdbc:XDataSource
    */
  var DataSourceName: String
  
  /**
    * returns if escape processing is on or off. If escape scanning is on (the default), the driver will do escape substitution before sending the SQL to
    * the database. This is only evaluated, if the CommandType is COMMAND.
    */
  var EscapeProcessing: Boolean
  
  /**
    * returns the maximum number of bytes allowed for any column value.
    *
    * This limit is the maximum number of bytes that can be returned for any column value. The limit applies only to {@link
    * com.sun.star.sdbc.DataType.BINARY} , {@link com.sun.star.sdbc.DataType.VARBINARY} , {@link com.sun.star.sdbc.DataType.LONGVARBINARY} , {@link
    * com.sun.star.sdbc.DataType.CHAR} , {@link com.sun.star.sdbc.DataType.VARCHAR} , and {@link com.sun.star.sdbc.DataType.LONGVARCHAR} columns. If the
    * limit is exceeded, the excess data is silently discarded. ;  There is no limitation, if set to zero.
    */
  var MaxFieldSize: Double
  
  /**
    * retrieves the maximum number of rows that a {@link ResultSet} can contain. If the limit is exceeded, the excess rows are silently dropped. ;  There is
    * no limitation, if set to zero.
    */
  var MaxRows: Double
  
  /** determines the user for whom to open the connection. */
  var Password: String
  
  /**
    * retrieves the number of seconds the driver will wait for a {@link Statement} to execute. If the limit is exceeded, a {@link
    * com.sun.star.sdbc.SQLException} is thrown. There is no limitation, if set to zero.
    */
  var QueryTimeOut: Double
  
  /**
    * indicates the transaction isolation level, which should be used for the connection.
    * @see com.sun.star.sdbc.TransactionIsolation
    */
  var TransactionIsolation: Double
  
  /** is the type map that will be used for the custom mapping of SQL structured types and distinct types. */
  var TypeMap: XNameAccess
  
  /** is the connection URL. Could be used instead of the DataSourceName. */
  var URL: String
  
  /** determines the user for whom to open the connection. */
  var User: String
}
object RowSet {
  
  inline def apply(
    Command: String,
    CursorName: String,
    DataSourceName: String,
    EscapeProcessing: Boolean,
    FetchDirection: Double,
    FetchSize: Double,
    MaxFieldSize: Double,
    MaxRows: Double,
    MetaData: XResultSetMetaData,
    Password: String,
    PropertySetInfo: XPropertySetInfo,
    QueryTimeOut: Double,
    ResultSetConcurrency: Double,
    ResultSetType: Double,
    Row: Double,
    Statement: XInterface,
    TransactionIsolation: Double,
    TypeMap: XNameAccess,
    URL: String,
    User: String,
    Warnings: Any,
    absolute: Double => Boolean,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addRowSetListener: XRowSetListener => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    afterLast: Callback,
    beforeFirst: Callback,
    cancelRowUpdates: Callback,
    clearParameters: Callback,
    clearWarnings: Callback,
    close: Callback,
    deleteRow: Callback,
    dispose: Callback,
    execute: Callback,
    findColumn: String => Double,
    first: CallbackTo[Boolean],
    getArray: Double => XArray,
    getBinaryStream: Double => XInputStream,
    getBlob: Double => XBlob,
    getBoolean: Double => Boolean,
    getByte: Double => Double,
    getBytes: Double => SafeArray[Double],
    getCharacterStream: Double => XInputStream,
    getClob: Double => XClob,
    getDate: Double => Date,
    getDouble: Double => Double,
    getFloat: Double => Double,
    getInt: Double => Double,
    getLong: Double => Double,
    getMetaData: CallbackTo[XResultSetMetaData],
    getObject: (Double, XNameAccess) => Any,
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
    insertRow: Callback,
    isAfterLast: CallbackTo[Boolean],
    isBeforeFirst: CallbackTo[Boolean],
    isFirst: CallbackTo[Boolean],
    isLast: CallbackTo[Boolean],
    last: CallbackTo[Boolean],
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
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], CursorName = CursorName.asInstanceOf[js.Any], DataSourceName = DataSourceName.asInstanceOf[js.Any], EscapeProcessing = EscapeProcessing.asInstanceOf[js.Any], FetchDirection = FetchDirection.asInstanceOf[js.Any], FetchSize = FetchSize.asInstanceOf[js.Any], MaxFieldSize = MaxFieldSize.asInstanceOf[js.Any], MaxRows = MaxRows.asInstanceOf[js.Any], MetaData = MetaData.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], QueryTimeOut = QueryTimeOut.asInstanceOf[js.Any], ResultSetConcurrency = ResultSetConcurrency.asInstanceOf[js.Any], ResultSetType = ResultSetType.asInstanceOf[js.Any], Row = Row.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any], TransactionIsolation = TransactionIsolation.asInstanceOf[js.Any], TypeMap = TypeMap.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any], Warnings = Warnings.asInstanceOf[js.Any], absolute = js.Any.fromFunction1(absolute), acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addRowSetListener = js.Any.fromFunction1((t0: XRowSetListener) => addRowSetListener(t0).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), afterLast = afterLast.toJsFn, beforeFirst = beforeFirst.toJsFn, cancelRowUpdates = cancelRowUpdates.toJsFn, clearParameters = clearParameters.toJsFn, clearWarnings = clearWarnings.toJsFn, close = close.toJsFn, deleteRow = deleteRow.toJsFn, dispose = dispose.toJsFn, execute = execute.toJsFn, findColumn = js.Any.fromFunction1(findColumn), first = first.toJsFn, getArray = js.Any.fromFunction1(getArray), getBinaryStream = js.Any.fromFunction1(getBinaryStream), getBlob = js.Any.fromFunction1(getBlob), getBoolean = js.Any.fromFunction1(getBoolean), getByte = js.Any.fromFunction1(getByte), getBytes = js.Any.fromFunction1(getBytes), getCharacterStream = js.Any.fromFunction1(getCharacterStream), getClob = js.Any.fromFunction1(getClob), getDate = js.Any.fromFunction1(getDate), getDouble = js.Any.fromFunction1(getDouble), getFloat = js.Any.fromFunction1(getFloat), getInt = js.Any.fromFunction1(getInt), getLong = js.Any.fromFunction1(getLong), getMetaData = getMetaData.toJsFn, getObject = js.Any.fromFunction2(getObject), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRef = js.Any.fromFunction1(getRef), getRow = getRow.toJsFn, getShort = js.Any.fromFunction1(getShort), getStatement = getStatement.toJsFn, getString = js.Any.fromFunction1(getString), getTime = js.Any.fromFunction1(getTime), getTimestamp = js.Any.fromFunction1(getTimestamp), getWarnings = getWarnings.toJsFn, insertRow = insertRow.toJsFn, isAfterLast = isAfterLast.toJsFn, isBeforeFirst = isBeforeFirst.toJsFn, isFirst = isFirst.toJsFn, isLast = isLast.toJsFn, last = last.toJsFn, moveToCurrentRow = moveToCurrentRow.toJsFn, moveToInsertRow = moveToInsertRow.toJsFn, next = next.toJsFn, previous = previous.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), refreshRow = refreshRow.toJsFn, relative = js.Any.fromFunction1(relative), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeRowSetListener = js.Any.fromFunction1((t0: XRowSetListener) => removeRowSetListener(t0).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), rowDeleted = rowDeleted.toJsFn, rowInserted = rowInserted.toJsFn, rowUpdated = rowUpdated.toJsFn, setArray = js.Any.fromFunction2((t0: Double, t1: XArray) => (setArray(t0, t1)).runNow()), setBinaryStream = js.Any.fromFunction3((t0: Double, t1: XInputStream, t2: Double) => (setBinaryStream(t0, t1, t2)).runNow()), setBlob = js.Any.fromFunction2((t0: Double, t1: XBlob) => (setBlob(t0, t1)).runNow()), setBoolean = js.Any.fromFunction2((t0: Double, t1: Boolean) => (setBoolean(t0, t1)).runNow()), setByte = js.Any.fromFunction2((t0: Double, t1: Double) => (setByte(t0, t1)).runNow()), setBytes = js.Any.fromFunction2((t0: Double, t1: SeqEquiv[Double]) => (setBytes(t0, t1)).runNow()), setCharacterStream = js.Any.fromFunction3((t0: Double, t1: XInputStream, t2: Double) => (setCharacterStream(t0, t1, t2)).runNow()), setClob = js.Any.fromFunction2((t0: Double, t1: XClob) => (setClob(t0, t1)).runNow()), setDate = js.Any.fromFunction2((t0: Double, t1: Date) => (setDate(t0, t1)).runNow()), setDouble = js.Any.fromFunction2((t0: Double, t1: Double) => (setDouble(t0, t1)).runNow()), setFloat = js.Any.fromFunction2((t0: Double, t1: Double) => (setFloat(t0, t1)).runNow()), setInt = js.Any.fromFunction2((t0: Double, t1: Double) => (setInt(t0, t1)).runNow()), setLong = js.Any.fromFunction2((t0: Double, t1: Double) => (setLong(t0, t1)).runNow()), setNull = js.Any.fromFunction2((t0: Double, t1: Double) => (setNull(t0, t1)).runNow()), setObject = js.Any.fromFunction2((t0: Double, t1: Any) => (setObject(t0, t1)).runNow()), setObjectNull = js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (setObjectNull(t0, t1, t2)).runNow()), setObjectWithInfo = js.Any.fromFunction4((t0: Double, t1: Any, t2: Double, t3: Double) => (setObjectWithInfo(t0, t1, t2, t3)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setRef = js.Any.fromFunction2((t0: Double, t1: XRef) => (setRef(t0, t1)).runNow()), setShort = js.Any.fromFunction2((t0: Double, t1: Double) => (setShort(t0, t1)).runNow()), setString = js.Any.fromFunction2((t0: Double, t1: String) => (setString(t0, t1)).runNow()), setTime = js.Any.fromFunction2((t0: Double, t1: Time) => (setTime(t0, t1)).runNow()), setTimestamp = js.Any.fromFunction2((t0: Double, t1: DateTime) => (setTimestamp(t0, t1)).runNow()), updateBinaryStream = js.Any.fromFunction3((t0: Double, t1: XInputStream, t2: Double) => (updateBinaryStream(t0, t1, t2)).runNow()), updateBoolean = js.Any.fromFunction2((t0: Double, t1: Boolean) => (updateBoolean(t0, t1)).runNow()), updateByte = js.Any.fromFunction2((t0: Double, t1: Double) => (updateByte(t0, t1)).runNow()), updateBytes = js.Any.fromFunction2((t0: Double, t1: SeqEquiv[Double]) => (updateBytes(t0, t1)).runNow()), updateCharacterStream = js.Any.fromFunction3((t0: Double, t1: XInputStream, t2: Double) => (updateCharacterStream(t0, t1, t2)).runNow()), updateDate = js.Any.fromFunction2((t0: Double, t1: Date) => (updateDate(t0, t1)).runNow()), updateDouble = js.Any.fromFunction2((t0: Double, t1: Double) => (updateDouble(t0, t1)).runNow()), updateFloat = js.Any.fromFunction2((t0: Double, t1: Double) => (updateFloat(t0, t1)).runNow()), updateInt = js.Any.fromFunction2((t0: Double, t1: Double) => (updateInt(t0, t1)).runNow()), updateLong = js.Any.fromFunction2((t0: Double, t1: Double) => (updateLong(t0, t1)).runNow()), updateNull = js.Any.fromFunction1((t0: Double) => updateNull(t0).runNow()), updateNumericObject = js.Any.fromFunction3((t0: Double, t1: Any, t2: Double) => (updateNumericObject(t0, t1, t2)).runNow()), updateObject = js.Any.fromFunction2((t0: Double, t1: Any) => (updateObject(t0, t1)).runNow()), updateRow = updateRow.toJsFn, updateShort = js.Any.fromFunction2((t0: Double, t1: Double) => (updateShort(t0, t1)).runNow()), updateString = js.Any.fromFunction2((t0: Double, t1: String) => (updateString(t0, t1)).runNow()), updateTime = js.Any.fromFunction2((t0: Double, t1: Time) => (updateTime(t0, t1)).runNow()), updateTimestamp = js.Any.fromFunction2((t0: Double, t1: DateTime) => (updateTimestamp(t0, t1)).runNow()), wasNull = wasNull.toJsFn)
    __obj.asInstanceOf[RowSet]
  }
  
  extension [Self <: RowSet](x: Self) {
    
    inline def setCommand(value: String): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    inline def setDataSourceName(value: String): Self = StObject.set(x, "DataSourceName", value.asInstanceOf[js.Any])
    
    inline def setEscapeProcessing(value: Boolean): Self = StObject.set(x, "EscapeProcessing", value.asInstanceOf[js.Any])
    
    inline def setMaxFieldSize(value: Double): Self = StObject.set(x, "MaxFieldSize", value.asInstanceOf[js.Any])
    
    inline def setMaxRows(value: Double): Self = StObject.set(x, "MaxRows", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setQueryTimeOut(value: Double): Self = StObject.set(x, "QueryTimeOut", value.asInstanceOf[js.Any])
    
    inline def setTransactionIsolation(value: Double): Self = StObject.set(x, "TransactionIsolation", value.asInstanceOf[js.Any])
    
    inline def setTypeMap(value: XNameAccess): Self = StObject.set(x, "TypeMap", value.asInstanceOf[js.Any])
    
    inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
  }
}
