package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a connection (session) with a specific database. Within the context of a {@link Connection} , SQL statements are executed and results are
  * returned.
  *
  * A {@link Connection} 's database is able to provide information describing its tables, its supported SQL grammar, its stored procedures, and the
  * capabilities of this connection. This information is obtained with the {@link com.sun.star.sdbc.XConnection.getMetaData()} method.
  *
  * ** Note: ** By default the {@link Connection} automatically commits changes after executing each statement. If auto commit has been disabled, an
  * explicit commit must be done or database changes will not be saved.
  * @see com.sun.star.sdbc.XStatement
  * @see com.sun.star.sdbc.XResultSet
  * @see com.sun.star.sdbc.XDatabaseMetaData
  */
trait Connection
  extends StObject
     with XComponent
     with XConnection
     with XWarningsSupplier
object Connection {
  
  inline def apply(
    AutoCommit: Boolean,
    Catalog: String,
    MetaData: XDatabaseMetaData,
    TransactionIsolation: Double,
    TypeMap: XNameAccess,
    Warnings: Any,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    clearWarnings: Callback,
    close: Callback,
    commit: Callback,
    createStatement: CallbackTo[XStatement],
    dispose: Callback,
    getAutoCommit: CallbackTo[Boolean],
    getCatalog: CallbackTo[String],
    getMetaData: CallbackTo[XDatabaseMetaData],
    getTransactionIsolation: CallbackTo[Double],
    getTypeMap: CallbackTo[XNameAccess],
    getWarnings: CallbackTo[Any],
    isClosed: CallbackTo[Boolean],
    isReadOnly: CallbackTo[Boolean],
    nativeSQL: String => String,
    prepareCall: String => XPreparedStatement,
    prepareStatement: String => XPreparedStatement,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    rollback: Callback,
    setAutoCommit: Boolean => Callback,
    setCatalog: String => Callback,
    setReadOnly: Boolean => Callback,
    setTransactionIsolation: Double => Callback,
    setTypeMap: XNameAccess => Callback
  ): Connection = {
    val __obj = js.Dynamic.literal(AutoCommit = AutoCommit.asInstanceOf[js.Any], Catalog = Catalog.asInstanceOf[js.Any], MetaData = MetaData.asInstanceOf[js.Any], TransactionIsolation = TransactionIsolation.asInstanceOf[js.Any], TypeMap = TypeMap.asInstanceOf[js.Any], Warnings = Warnings.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), clearWarnings = clearWarnings.toJsFn, close = close.toJsFn, commit = commit.toJsFn, createStatement = createStatement.toJsFn, dispose = dispose.toJsFn, getAutoCommit = getAutoCommit.toJsFn, getCatalog = getCatalog.toJsFn, getMetaData = getMetaData.toJsFn, getTransactionIsolation = getTransactionIsolation.toJsFn, getTypeMap = getTypeMap.toJsFn, getWarnings = getWarnings.toJsFn, isClosed = isClosed.toJsFn, isReadOnly = isReadOnly.toJsFn, nativeSQL = js.Any.fromFunction1(nativeSQL), prepareCall = js.Any.fromFunction1(prepareCall), prepareStatement = js.Any.fromFunction1(prepareStatement), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), rollback = rollback.toJsFn, setAutoCommit = js.Any.fromFunction1((t0: Boolean) => setAutoCommit(t0).runNow()), setCatalog = js.Any.fromFunction1((t0: String) => setCatalog(t0).runNow()), setReadOnly = js.Any.fromFunction1((t0: Boolean) => setReadOnly(t0).runNow()), setTransactionIsolation = js.Any.fromFunction1((t0: Double) => setTransactionIsolation(t0).runNow()), setTypeMap = js.Any.fromFunction1((t0: XNameAccess) => setTypeMap(t0).runNow()))
    __obj.asInstanceOf[Connection]
  }
}
