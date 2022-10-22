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
  * represents a precompiled SQL statement. The service differs only in the access of the columns and parameters to the service {@link
  * com.sun.star.sdbc.PreparedStatement} .
  */
trait PreparedStatement
  extends StObject
     with typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.PreparedStatement
     with XColumnsSupplier
object PreparedStatement {
  
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
    getColumns: CallbackTo[XNameAccess],
    getConnection: CallbackTo[XConnection],
    getMetaData: CallbackTo[XResultSetMetaData],
    getMoreResults: CallbackTo[Boolean],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getResultSet: CallbackTo[XResultSet],
    getUpdateCount: CallbackTo[Double],
    getWarnings: CallbackTo[Any],
    queryInterface: `type` => Any,
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
    setTimestamp: (Double, DateTime) => Callback
  ): PreparedStatement = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], Connection = Connection.asInstanceOf[js.Any], CursorName = CursorName.asInstanceOf[js.Any], FetchDirection = FetchDirection.asInstanceOf[js.Any], FetchSize = FetchSize.asInstanceOf[js.Any], MaxFieldSize = MaxFieldSize.asInstanceOf[js.Any], MaxRows = MaxRows.asInstanceOf[js.Any], MetaData = MetaData.asInstanceOf[js.Any], MoreResults = MoreResults.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], QueryTimeOut = QueryTimeOut.asInstanceOf[js.Any], ResultSet = ResultSet.asInstanceOf[js.Any], ResultSetConcurrency = ResultSetConcurrency.asInstanceOf[js.Any], ResultSetType = ResultSetType.asInstanceOf[js.Any], UpdateCount = UpdateCount.asInstanceOf[js.Any], Warnings = Warnings.asInstanceOf[js.Any], acquire = acquire.toJsFn, addBatch = addBatch.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), cancel = cancel.toJsFn, clearBatch = clearBatch.toJsFn, clearParameters = clearParameters.toJsFn, clearWarnings = clearWarnings.toJsFn, close = close.toJsFn, dispose = dispose.toJsFn, execute = execute.toJsFn, executeBatch = executeBatch.toJsFn, executeQuery = executeQuery.toJsFn, executeUpdate = executeUpdate.toJsFn, getColumns = getColumns.toJsFn, getConnection = getConnection.toJsFn, getMetaData = getMetaData.toJsFn, getMoreResults = getMoreResults.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getResultSet = getResultSet.toJsFn, getUpdateCount = getUpdateCount.toJsFn, getWarnings = getWarnings.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setArray = js.Any.fromFunction2((t0: Double, t1: XArray) => (setArray(t0, t1)).runNow()), setBinaryStream = js.Any.fromFunction3((t0: Double, t1: XInputStream, t2: Double) => (setBinaryStream(t0, t1, t2)).runNow()), setBlob = js.Any.fromFunction2((t0: Double, t1: XBlob) => (setBlob(t0, t1)).runNow()), setBoolean = js.Any.fromFunction2((t0: Double, t1: Boolean) => (setBoolean(t0, t1)).runNow()), setByte = js.Any.fromFunction2((t0: Double, t1: Double) => (setByte(t0, t1)).runNow()), setBytes = js.Any.fromFunction2((t0: Double, t1: SeqEquiv[Double]) => (setBytes(t0, t1)).runNow()), setCharacterStream = js.Any.fromFunction3((t0: Double, t1: XInputStream, t2: Double) => (setCharacterStream(t0, t1, t2)).runNow()), setClob = js.Any.fromFunction2((t0: Double, t1: XClob) => (setClob(t0, t1)).runNow()), setDate = js.Any.fromFunction2((t0: Double, t1: Date) => (setDate(t0, t1)).runNow()), setDouble = js.Any.fromFunction2((t0: Double, t1: Double) => (setDouble(t0, t1)).runNow()), setFloat = js.Any.fromFunction2((t0: Double, t1: Double) => (setFloat(t0, t1)).runNow()), setInt = js.Any.fromFunction2((t0: Double, t1: Double) => (setInt(t0, t1)).runNow()), setLong = js.Any.fromFunction2((t0: Double, t1: Double) => (setLong(t0, t1)).runNow()), setNull = js.Any.fromFunction2((t0: Double, t1: Double) => (setNull(t0, t1)).runNow()), setObject = js.Any.fromFunction2((t0: Double, t1: Any) => (setObject(t0, t1)).runNow()), setObjectNull = js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (setObjectNull(t0, t1, t2)).runNow()), setObjectWithInfo = js.Any.fromFunction4((t0: Double, t1: Any, t2: Double, t3: Double) => (setObjectWithInfo(t0, t1, t2, t3)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setRef = js.Any.fromFunction2((t0: Double, t1: XRef) => (setRef(t0, t1)).runNow()), setShort = js.Any.fromFunction2((t0: Double, t1: Double) => (setShort(t0, t1)).runNow()), setString = js.Any.fromFunction2((t0: Double, t1: String) => (setString(t0, t1)).runNow()), setTime = js.Any.fromFunction2((t0: Double, t1: Time) => (setTime(t0, t1)).runNow()), setTimestamp = js.Any.fromFunction2((t0: Double, t1: DateTime) => (setTimestamp(t0, t1)).runNow()))
    __obj.asInstanceOf[PreparedStatement]
  }
}
