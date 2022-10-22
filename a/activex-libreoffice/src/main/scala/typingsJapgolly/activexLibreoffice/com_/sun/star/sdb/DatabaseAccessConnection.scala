package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XChild
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XDatabaseMetaData
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XPreparedStatement
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XStatement
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx.DatabaseDefinition
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a component, which supplies and stores additional information related to a certain database connection, such as, DatabaseQueries,
  * FormDocuments, and ReportDocuments. Objects for data definition are supplied as well, for instance, Tables, Views, etc.
  *
  * Implements the service {@link com.sun.star.sdbc.Connection} . It is possible to open more than one connection at the same time, but the method {@link
  * com.sun.star.sdb.DatabaseAccessConnection.dispose()} will close only one of these connections. You have to close all connections in order to close the
  * connection to the database.
  * @deprecated Deprecated
  */
trait DatabaseAccessConnection
  extends StObject
     with typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.Connection
     with DatabaseDefinition
     with XChild
     with XSQLQueryComposerFactory
     with XQueriesSupplier
object DatabaseAccessConnection {
  
  inline def apply(
    AutoCommit: Boolean,
    Catalog: String,
    Groups: XNameAccess,
    MetaData: XDatabaseMetaData,
    Parent: XInterface,
    Queries: XNameAccess,
    Tables: XNameAccess,
    TransactionIsolation: Double,
    TypeMap: XNameAccess,
    Users: XNameAccess,
    Views: XNameAccess,
    Warnings: Any,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    clearWarnings: Callback,
    close: Callback,
    commit: Callback,
    createQueryComposer: CallbackTo[XSQLQueryComposer],
    createStatement: CallbackTo[XStatement],
    dispose: Callback,
    getAutoCommit: CallbackTo[Boolean],
    getCatalog: CallbackTo[String],
    getGroups: CallbackTo[XNameAccess],
    getMetaData: CallbackTo[XDatabaseMetaData],
    getParent: CallbackTo[XInterface],
    getQueries: CallbackTo[XNameAccess],
    getTables: CallbackTo[XNameAccess],
    getTransactionIsolation: CallbackTo[Double],
    getTypeMap: CallbackTo[XNameAccess],
    getUsers: CallbackTo[XNameAccess],
    getViews: CallbackTo[XNameAccess],
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
    setParent: XInterface => Callback,
    setReadOnly: Boolean => Callback,
    setTransactionIsolation: Double => Callback,
    setTypeMap: XNameAccess => Callback
  ): DatabaseAccessConnection = {
    val __obj = js.Dynamic.literal(AutoCommit = AutoCommit.asInstanceOf[js.Any], Catalog = Catalog.asInstanceOf[js.Any], Groups = Groups.asInstanceOf[js.Any], MetaData = MetaData.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Queries = Queries.asInstanceOf[js.Any], Tables = Tables.asInstanceOf[js.Any], TransactionIsolation = TransactionIsolation.asInstanceOf[js.Any], TypeMap = TypeMap.asInstanceOf[js.Any], Users = Users.asInstanceOf[js.Any], Views = Views.asInstanceOf[js.Any], Warnings = Warnings.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), clearWarnings = clearWarnings.toJsFn, close = close.toJsFn, commit = commit.toJsFn, createQueryComposer = createQueryComposer.toJsFn, createStatement = createStatement.toJsFn, dispose = dispose.toJsFn, getAutoCommit = getAutoCommit.toJsFn, getCatalog = getCatalog.toJsFn, getGroups = getGroups.toJsFn, getMetaData = getMetaData.toJsFn, getParent = getParent.toJsFn, getQueries = getQueries.toJsFn, getTables = getTables.toJsFn, getTransactionIsolation = getTransactionIsolation.toJsFn, getTypeMap = getTypeMap.toJsFn, getUsers = getUsers.toJsFn, getViews = getViews.toJsFn, getWarnings = getWarnings.toJsFn, isClosed = isClosed.toJsFn, isReadOnly = isReadOnly.toJsFn, nativeSQL = js.Any.fromFunction1(nativeSQL), prepareCall = js.Any.fromFunction1(prepareCall), prepareStatement = js.Any.fromFunction1(prepareStatement), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), rollback = rollback.toJsFn, setAutoCommit = js.Any.fromFunction1((t0: Boolean) => setAutoCommit(t0).runNow()), setCatalog = js.Any.fromFunction1((t0: String) => setCatalog(t0).runNow()), setParent = js.Any.fromFunction1((t0: XInterface) => setParent(t0).runNow()), setReadOnly = js.Any.fromFunction1((t0: Boolean) => setReadOnly(t0).runNow()), setTransactionIsolation = js.Any.fromFunction1((t0: Double) => setTransactionIsolation(t0).runNow()), setTypeMap = js.Any.fromFunction1((t0: XNameAccess) => setTypeMap(t0).runNow()))
    __obj.asInstanceOf[DatabaseAccessConnection]
  }
}
