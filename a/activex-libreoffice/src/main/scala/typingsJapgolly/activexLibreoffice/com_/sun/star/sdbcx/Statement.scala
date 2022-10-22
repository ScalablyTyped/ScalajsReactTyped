package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XResultSet
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * extends the definition of the service {@link com.sun.star.sdbc.Statement} with a flag for the usage of bookmarks.
  * @see ResultSet
  * @see XRowLocate
  */
trait Statement
  extends StObject
     with typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.Statement {
  
  /** returns `TRUE` if a result set should allow navigation with bookmarks or not. The default is `FALSE` . */
  var UseBookmarks: Boolean
}
object Statement {
  
  inline def apply(
    Connection: XConnection,
    CursorName: String,
    EscapeProcessing: Boolean,
    FetchDirection: Double,
    FetchSize: Double,
    MaxFieldSize: Double,
    MaxRows: Double,
    MoreResults: Boolean,
    PropertySetInfo: XPropertySetInfo,
    QueryTimeOut: Double,
    ResultSet: XResultSet,
    ResultSetConcurrency: Double,
    ResultSetType: Double,
    UpdateCount: Double,
    UseBookmarks: Boolean,
    Warnings: Any,
    acquire: Callback,
    addBatch: String => Callback,
    addEventListener: XEventListener => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    cancel: Callback,
    clearBatch: Callback,
    clearWarnings: Callback,
    close: Callback,
    dispose: Callback,
    execute: String => Boolean,
    executeBatch: CallbackTo[SafeArray[Double]],
    executeQuery: String => XResultSet,
    executeUpdate: String => Double,
    getConnection: CallbackTo[XConnection],
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
    setPropertyValue: (String, Any) => Callback
  ): Statement = {
    val __obj = js.Dynamic.literal(Connection = Connection.asInstanceOf[js.Any], CursorName = CursorName.asInstanceOf[js.Any], EscapeProcessing = EscapeProcessing.asInstanceOf[js.Any], FetchDirection = FetchDirection.asInstanceOf[js.Any], FetchSize = FetchSize.asInstanceOf[js.Any], MaxFieldSize = MaxFieldSize.asInstanceOf[js.Any], MaxRows = MaxRows.asInstanceOf[js.Any], MoreResults = MoreResults.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], QueryTimeOut = QueryTimeOut.asInstanceOf[js.Any], ResultSet = ResultSet.asInstanceOf[js.Any], ResultSetConcurrency = ResultSetConcurrency.asInstanceOf[js.Any], ResultSetType = ResultSetType.asInstanceOf[js.Any], UpdateCount = UpdateCount.asInstanceOf[js.Any], UseBookmarks = UseBookmarks.asInstanceOf[js.Any], Warnings = Warnings.asInstanceOf[js.Any], acquire = acquire.toJsFn, addBatch = js.Any.fromFunction1((t0: String) => addBatch(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), cancel = cancel.toJsFn, clearBatch = clearBatch.toJsFn, clearWarnings = clearWarnings.toJsFn, close = close.toJsFn, dispose = dispose.toJsFn, execute = js.Any.fromFunction1(execute), executeBatch = executeBatch.toJsFn, executeQuery = js.Any.fromFunction1(executeQuery), executeUpdate = js.Any.fromFunction1(executeUpdate), getConnection = getConnection.toJsFn, getMoreResults = getMoreResults.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getResultSet = getResultSet.toJsFn, getUpdateCount = getUpdateCount.toJsFn, getWarnings = getWarnings.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[Statement]
  }
  
  extension [Self <: Statement](x: Self) {
    
    inline def setUseBookmarks(value: Boolean): Self = StObject.set(x, "UseBookmarks", value.asInstanceOf[js.Any])
  }
}
