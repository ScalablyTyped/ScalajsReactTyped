package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

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
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XArray
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XBlob
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XClob
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XRef
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XResultSet
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XResultSetMetaData
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx.XColumnsSupplier
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Date
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a procedure call. The service differs only in the access of the columns and parameters to the service {@link
  * com.sun.star.sdbc.CallableStatement} .
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XMultipleResults because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XWarningsSupplier because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XPreparedBatchExecution because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XParameters because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XResultSetMetaDataSupplier because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XPreparedStatement because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCancellable because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XCloseable because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.PreparedStatement because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.sdb.PreparedStatement because var conflicts: CursorName, FetchDirection, FetchSize, MaxFieldSize, MaxRows, QueryTimeOut, ResultSetConcurrency, ResultSetType. Inlined  */ trait CallableStatement
  extends StObject
     with typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.CallableStatement
     with XColumnsSupplier
object CallableStatement {
  
  inline def apply(
    Columns: XNameAccess,
    Connection: XConnection,
    CursorName: String,
    FetchDirection: Double,
    FetchSize: Double,
    MaxFieldSize: Double,
    MaxRows: Double,
    MetaData: XResultSetMetaData,
    MoreResults: Boolean,
    PropertySetInfo: XPropertySetInfo,
    QueryTimeOut: Double,
    ResultSet: XResultSet,
    ResultSetConcurrency: Double,
    ResultSetType: Double,
    UpdateCount: Double,
    Warnings: Any,
    acquire: Callback,
    addBatch: Callback,
    addEventListener: XEventListener => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    cancel: Callback,
    clearBatch: Callback,
    clearParameters: Callback,
    clearWarnings: Callback,
    close: Callback,
    dispose: Callback,
    execute: CallbackTo[Boolean],
    executeBatch: CallbackTo[SafeArray[Double]],
    executeQuery: CallbackTo[XResultSet],
    executeUpdate: CallbackTo[Double],
    getArray: Double => XArray,
    getBinaryStream: Double => XInputStream,
    getBlob: Double => XBlob,
    getBoolean: Double => Boolean,
    getByte: Double => Double,
    getBytes: Double => SafeArray[Double],
    getCharacterStream: Double => XInputStream,
    getClob: Double => XClob,
    getColumns: CallbackTo[XNameAccess],
    getConnection: CallbackTo[XConnection],
    getDate: Double => Date,
    getDouble: Double => Double,
    getFloat: Double => Double,
    getInt: Double => Double,
    getLong: Double => Double,
    getMetaData: CallbackTo[XResultSetMetaData],
    getMoreResults: CallbackTo[Boolean],
    getObject: (Double, XNameAccess) => Any,
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getRef: Double => XRef,
    getResultSet: CallbackTo[XResultSet],
    getShort: Double => Double,
    getString: Double => String,
    getTime: Double => Time,
    getTimestamp: Double => DateTime,
    getUpdateCount: CallbackTo[Double],
    getWarnings: CallbackTo[Any],
    queryInterface: `type` => Any,
    registerNumericOutParameter: (Double, Double, Double) => Callback,
    registerOutParameter: (Double, Double, String) => Callback,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
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
    wasNull: CallbackTo[Boolean]
  ): CallableStatement = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], Connection = Connection.asInstanceOf[js.Any], CursorName = CursorName.asInstanceOf[js.Any], FetchDirection = FetchDirection.asInstanceOf[js.Any], FetchSize = FetchSize.asInstanceOf[js.Any], MaxFieldSize = MaxFieldSize.asInstanceOf[js.Any], MaxRows = MaxRows.asInstanceOf[js.Any], MetaData = MetaData.asInstanceOf[js.Any], MoreResults = MoreResults.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], QueryTimeOut = QueryTimeOut.asInstanceOf[js.Any], ResultSet = ResultSet.asInstanceOf[js.Any], ResultSetConcurrency = ResultSetConcurrency.asInstanceOf[js.Any], ResultSetType = ResultSetType.asInstanceOf[js.Any], UpdateCount = UpdateCount.asInstanceOf[js.Any], Warnings = Warnings.asInstanceOf[js.Any], acquire = acquire.toJsFn, addBatch = addBatch.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), cancel = cancel.toJsFn, clearBatch = clearBatch.toJsFn, clearParameters = clearParameters.toJsFn, clearWarnings = clearWarnings.toJsFn, close = close.toJsFn, dispose = dispose.toJsFn, execute = execute.toJsFn, executeBatch = executeBatch.toJsFn, executeQuery = executeQuery.toJsFn, executeUpdate = executeUpdate.toJsFn, getArray = js.Any.fromFunction1(getArray), getBinaryStream = js.Any.fromFunction1(getBinaryStream), getBlob = js.Any.fromFunction1(getBlob), getBoolean = js.Any.fromFunction1(getBoolean), getByte = js.Any.fromFunction1(getByte), getBytes = js.Any.fromFunction1(getBytes), getCharacterStream = js.Any.fromFunction1(getCharacterStream), getClob = js.Any.fromFunction1(getClob), getColumns = getColumns.toJsFn, getConnection = getConnection.toJsFn, getDate = js.Any.fromFunction1(getDate), getDouble = js.Any.fromFunction1(getDouble), getFloat = js.Any.fromFunction1(getFloat), getInt = js.Any.fromFunction1(getInt), getLong = js.Any.fromFunction1(getLong), getMetaData = getMetaData.toJsFn, getMoreResults = getMoreResults.toJsFn, getObject = js.Any.fromFunction2(getObject), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRef = js.Any.fromFunction1(getRef), getResultSet = getResultSet.toJsFn, getShort = js.Any.fromFunction1(getShort), getString = js.Any.fromFunction1(getString), getTime = js.Any.fromFunction1(getTime), getTimestamp = js.Any.fromFunction1(getTimestamp), getUpdateCount = getUpdateCount.toJsFn, getWarnings = getWarnings.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), registerNumericOutParameter = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (registerNumericOutParameter(t0, t1, t2)).runNow()), registerOutParameter = js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (registerOutParameter(t0, t1, t2)).runNow()), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setArray = js.Any.fromFunction2((t0: Double, t1: XArray) => (setArray(t0, t1)).runNow()), setBinaryStream = js.Any.fromFunction3((t0: Double, t1: XInputStream, t2: Double) => (setBinaryStream(t0, t1, t2)).runNow()), setBlob = js.Any.fromFunction2((t0: Double, t1: XBlob) => (setBlob(t0, t1)).runNow()), setBoolean = js.Any.fromFunction2((t0: Double, t1: Boolean) => (setBoolean(t0, t1)).runNow()), setByte = js.Any.fromFunction2((t0: Double, t1: Double) => (setByte(t0, t1)).runNow()), setBytes = js.Any.fromFunction2((t0: Double, t1: SeqEquiv[Double]) => (setBytes(t0, t1)).runNow()), setCharacterStream = js.Any.fromFunction3((t0: Double, t1: XInputStream, t2: Double) => (setCharacterStream(t0, t1, t2)).runNow()), setClob = js.Any.fromFunction2((t0: Double, t1: XClob) => (setClob(t0, t1)).runNow()), setDate = js.Any.fromFunction2((t0: Double, t1: Date) => (setDate(t0, t1)).runNow()), setDouble = js.Any.fromFunction2((t0: Double, t1: Double) => (setDouble(t0, t1)).runNow()), setFloat = js.Any.fromFunction2((t0: Double, t1: Double) => (setFloat(t0, t1)).runNow()), setInt = js.Any.fromFunction2((t0: Double, t1: Double) => (setInt(t0, t1)).runNow()), setLong = js.Any.fromFunction2((t0: Double, t1: Double) => (setLong(t0, t1)).runNow()), setNull = js.Any.fromFunction2((t0: Double, t1: Double) => (setNull(t0, t1)).runNow()), setObject = js.Any.fromFunction2((t0: Double, t1: Any) => (setObject(t0, t1)).runNow()), setObjectNull = js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (setObjectNull(t0, t1, t2)).runNow()), setObjectWithInfo = js.Any.fromFunction4((t0: Double, t1: Any, t2: Double, t3: Double) => (setObjectWithInfo(t0, t1, t2, t3)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setRef = js.Any.fromFunction2((t0: Double, t1: XRef) => (setRef(t0, t1)).runNow()), setShort = js.Any.fromFunction2((t0: Double, t1: Double) => (setShort(t0, t1)).runNow()), setString = js.Any.fromFunction2((t0: Double, t1: String) => (setString(t0, t1)).runNow()), setTime = js.Any.fromFunction2((t0: Double, t1: Time) => (setTime(t0, t1)).runNow()), setTimestamp = js.Any.fromFunction2((t0: Double, t1: DateTime) => (setTimestamp(t0, t1)).runNow()), wasNull = wasNull.toJsFn)
    __obj.asInstanceOf[CallableStatement]
  }
}
