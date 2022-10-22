package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a connection (session) with a specific database. Within the context of a {@link Connection} , SQL statements are executed and results are
  * returned.
  *
  * A {@link Connection} 's database is able to provide information describing its tables, its supported SQL grammar, its stored procedures, and the
  * capabilities of this connection. This information is obtained with the com::sun::star::sdbc::XDatabaseMetaData::getMetaData() method.
  * @see com.sun.star.sdbc.XDriverManager
  * @see com.sun.star.sdbc.XStatement
  * @see com.sun.star.sdbc.XDatabaseMetaData
  */
trait XConnection
  extends StObject
     with XCloseable {
  
  /**
    * gets the current auto-commit state.
    * @returns the current state of auto-commit mode.
    * @see setAutoCommit
    * @throws SQLException if a database access error occurs.
    */
  var AutoCommit: Boolean
  
  /**
    * returns the {@link Connection} 's current catalog name.
    * @returns the current catalog name or an empty string.
    * @throws SQLException if a database access error occurs.
    */
  var Catalog: String
  
  /**
    * gets the metadata regarding this connection's database.
    *
    * A {@link Connection} 's database is able to provide information describing its tables, its supported SQL grammar, its stored procedures, the
    * capabilities of this connection, and so on. This information is made available through a DatabaseMetaData object.
    * @returns a DatabaseMetaData object for this {@link Connection} .
    * @throws SQLException if a database access error occurs.
    */
  val MetaData: XDatabaseMetaData
  
  /**
    * gets this {@link Connection} 's current transaction isolation level.
    * @returns the current {@link TransactionIsolation} mode value.
    * @throws SQLException if a database access error occurs.
    */
  var TransactionIsolation: Double
  
  /**
    * gets the type map object associated with this connection. Only drivers which implement the custom type mapping facility will return an object
    * otherwise NULL could be returned.
    *
    * Unless the application has added an entry to the type map, the map returned will be empty.
    * @returns the XNameAccess object associated with this {@link Connection} object.
    * @throws SQLException if a database access error occurs.
    */
  var TypeMap: XNameAccess
  
  /**
    * makes all changes made since the previous commit/rollback permanent and releases any database locks currently held by the {@link Connection} . This
    * method should be used only when auto-commit mode has been disabled.
    * @see setAutoCommit
    * @throws SQLException if a database access error occurs.
    */
  def commit(): Unit
  
  /**
    * creates a new {@link com.sun.star.sdbc.Statement} object for sending SQL statements to the database.
    *
    * SQL statements without parameters are normally executed using {@link Statement} objects. If the same SQL statement is executed many times, it is more
    * efficient to use a {@link com.sun.star.sdbc.PreparedStatement} .
    *
    * Result sets created using the returned {@link Statement} will have forward-only type, and read-only concurrency, by default.
    *
    * Escape processing for the SQL-Statement is enabled, by default.
    * @returns a new {@link Statement} object
    * @throws SQLException if a database access error occurs.
    */
  def createStatement(): XStatement
  
  /**
    * gets the current auto-commit state.
    * @returns the current state of auto-commit mode.
    * @see setAutoCommit
    * @throws SQLException if a database access error occurs.
    */
  def getAutoCommit(): Boolean
  
  /**
    * returns the {@link Connection} 's current catalog name.
    * @returns the current catalog name or an empty string.
    * @throws SQLException if a database access error occurs.
    */
  def getCatalog(): String
  
  /**
    * gets the metadata regarding this connection's database.
    *
    * A {@link Connection} 's database is able to provide information describing its tables, its supported SQL grammar, its stored procedures, the
    * capabilities of this connection, and so on. This information is made available through a DatabaseMetaData object.
    * @returns a DatabaseMetaData object for this {@link Connection} .
    * @throws SQLException if a database access error occurs.
    */
  def getMetaData(): XDatabaseMetaData
  
  /**
    * gets this {@link Connection} 's current transaction isolation level.
    * @returns the current {@link TransactionIsolation} mode value.
    * @throws SQLException if a database access error occurs.
    */
  def getTransactionIsolation(): Double
  
  /**
    * gets the type map object associated with this connection. Only drivers which implement the custom type mapping facility will return an object
    * otherwise NULL could be returned.
    *
    * Unless the application has added an entry to the type map, the map returned will be empty.
    * @returns the XNameAccess object associated with this {@link Connection} object.
    * @throws SQLException if a database access error occurs.
    */
  def getTypeMap(): XNameAccess
  
  /**
    * tests to see if a connection is closed.
    *
    * ** Note: ** A {@link Connection} is automatically closed if no one references it anymore. Certain fatal errors also result in a closed {@link
    * Connection} .
    * @returns `TRUE` if the connection is closed; `FALSE` if it's still open.
    * @throws SQLException if a database access error occurs.
    */
  def isClosed(): Boolean
  
  /**
    * tests to see if the connection is in read-only mode.
    * @returns `TRUE` if connection is read-only and `FALSE` otherwise.
    * @throws SQLException if a database access error occurs.
    */
  def isReadOnly(): Boolean
  
  /**
    * converts the given SQL statement into the system's native SQL grammar. A driver may convert the JDBC SQL grammar into its system's native SQL grammar
    * prior to sending it; this method returns the native form of the statement that the driver would have sent.
    * @param sql a SQL statement that may contain one or more "?" parameter placeholders
    * @returns the native form of this statement
    * @throws SQLException if a database access error occurs.
    */
  def nativeSQL(sql: String): String
  
  /**
    * creates a {@link com.sun.star.sdbc.CallableStatement} object for calling database stored procedures.
    *
    * The {@link CallableStatement} provides methods for setting up its IN and OUT parameters, and methods for executing the call to a stored procedure.
    *
    * ** Note: ** This method is optimized for handling stored procedure call statements. Some drivers may send the call statement to the database when the
    * method `prepareCall` is done; ;  others may wait until the {@link CallableStatement} is executed. This has no direct effect on users; however, it does
    * affect which method throws certain SQLExceptions. Result sets created using the returned {@link CallableStatement} will have forward-only type and
    * read-only concurrency, by default.
    * @param sql a SQL statement that may contain one or more "?" IN parameter placeholders
    * @returns a new {@link PreparedStatement} object containing the pre-compiled statement
    * @throws SQLException if a database access error occurs.
    */
  def prepareCall(sql: String): XPreparedStatement
  
  /**
    * creates a {@link com.sun.star.sdbc.PreparedStatement} object for sending parameterized SQL statements to the database.
    *
    * A SQL statement with or without IN parameters can be pre-compiled and stored in a {@link PreparedStatement} object. This object can then be used to
    * efficiently execute this statement multiple times.
    *
    * ** Note: ** This method is optimized for handling parametric SQL statements that benefit from precompilation. If the driver supports precompilation,
    * the method `prepareStatement` will send the statement to the database for precompilation. Some drivers may not support precompilation. In this case,
    * the statement may not be sent to the database until the {@link com.sun.star.sdbc.PreparedStatement} is executed. This has no direct effect on users;
    * however, it does affect which method throws certain SQLExceptions.
    *
    * Result sets created using the returned {@link PreparedStatement} will have forward-only type and read-only concurrency, by default.
    *
    * Escape processing for the SQL-Statement is enabled, by default.
    * @param sql a SQL statement that may contain one or more "?" IN parameter placeholders
    * @returns a new {@link PreparedStatement} object containing the pre-compiled statement
    * @throws SQLException if a database access error occurs.
    */
  def prepareStatement(sql: String): XPreparedStatement
  
  /**
    * drops all changes made since the previous commit/rollback and releases any database locks currently held by this {@link Connection} . This method
    * should be used only when auto-commit has been disabled.
    * @see setAutoCommit
    * @throws SQLException if a database access error occurs.
    */
  def rollback(): Unit
  
  /**
    * sets this connection's auto-commit mode.
    *
    * If a connection is in auto-commit mode, then all its SQL statements will be executed and committed as individual transactions. Otherwise, its SQL
    * statements are grouped into transactions that are terminated by a call to either the method {@link com.sun.star.sdbc.XConnection.commit()} or the
    * method {@link com.sun.star.sdbc.XConnection.rollback()} . By default, new connections are in auto-commit mode.
    *
    * The commit occurs when the statement completes or the next execute occurs, whichever comes first. In the case of statements returning a {@link
    * ResultSet} , the statement completes when the last row of the {@link ResultSet} has been retrieved or the {@link ResultSet} has been closed. In
    * advanced cases, a single statement may return multiple results as well as output parameter values. In these cases the commit occurs when all results
    * and output parameter values have been retrieved.
    * @param autoCommit `TRUE` enables auto-commit; `FALSE` disables auto-commit.
    * @throws SQLException if a database access error occurs.
    */
  def setAutoCommit(autoCommit: Boolean): Unit
  
  /**
    * sets a catalog name in order to select a subspace of this {@link Connection} 's database in which to work. If the driver does not support catalogs, it
    * will silently ignore this request.
    * @param catalog the name of the catalog.
    * @throws SQLException if a database access error occurs.
    */
  def setCatalog(catalog: String): Unit
  
  /**
    * puts this connection in read-only mode as a hint to enable database optimizations.
    *
    * ** Note: ** This method cannot be called while in the middle of a transaction. Calling setReadOnly with `TRUE` does not necessarily cause writes to be
    * prohibited.
    * @param readOnly `TRUE` enables read-only mode; `FALSE` disables read-only mode.
    * @throws SQLException if a database access error occurs.
    */
  def setReadOnly(readOnly: Boolean): Unit
  
  /**
    * attempts to change the transaction isolation level to the one given.
    *
    * The constants defined in {@link com.sun.star.sdbc.TransactionIsolation} are the possible transaction isolation levels.
    *
    * ** Note: ** This method cannot be called while in the middle of a transaction.
    * @param level one of the {@link TransactionIsolation} values with the exception of NONE; some databases may not support other values.
    * @see com.sun.star.sdbc.XDatabaseMetaData.supportsTransactionIsolationLevel()
    * @throws SQLException if a database access error occurs.
    */
  def setTransactionIsolation(level: Double): Unit
  
  /**
    * installs the given type map as the type map for this connection. The type map will be used for the custom mapping of SQL structured types and distinct
    * types.
    *
    * Only if the driver supports custom type mapping is the setting of a map allowed.
    * @param typeMap set the XNameAccess object associated with this {@link Connection} object.
    * @throws SQLException if a database access error occurs.
    */
  def setTypeMap(typeMap: XNameAccess): Unit
}
object XConnection {
  
  inline def apply(
    AutoCommit: Boolean,
    Catalog: String,
    MetaData: XDatabaseMetaData,
    TransactionIsolation: Double,
    TypeMap: XNameAccess,
    acquire: Callback,
    close: Callback,
    commit: Callback,
    createStatement: CallbackTo[XStatement],
    getAutoCommit: CallbackTo[Boolean],
    getCatalog: CallbackTo[String],
    getMetaData: CallbackTo[XDatabaseMetaData],
    getTransactionIsolation: CallbackTo[Double],
    getTypeMap: CallbackTo[XNameAccess],
    isClosed: CallbackTo[Boolean],
    isReadOnly: CallbackTo[Boolean],
    nativeSQL: String => String,
    prepareCall: String => XPreparedStatement,
    prepareStatement: String => XPreparedStatement,
    queryInterface: `type` => Any,
    release: Callback,
    rollback: Callback,
    setAutoCommit: Boolean => Callback,
    setCatalog: String => Callback,
    setReadOnly: Boolean => Callback,
    setTransactionIsolation: Double => Callback,
    setTypeMap: XNameAccess => Callback
  ): XConnection = {
    val __obj = js.Dynamic.literal(AutoCommit = AutoCommit.asInstanceOf[js.Any], Catalog = Catalog.asInstanceOf[js.Any], MetaData = MetaData.asInstanceOf[js.Any], TransactionIsolation = TransactionIsolation.asInstanceOf[js.Any], TypeMap = TypeMap.asInstanceOf[js.Any], acquire = acquire.toJsFn, close = close.toJsFn, commit = commit.toJsFn, createStatement = createStatement.toJsFn, getAutoCommit = getAutoCommit.toJsFn, getCatalog = getCatalog.toJsFn, getMetaData = getMetaData.toJsFn, getTransactionIsolation = getTransactionIsolation.toJsFn, getTypeMap = getTypeMap.toJsFn, isClosed = isClosed.toJsFn, isReadOnly = isReadOnly.toJsFn, nativeSQL = js.Any.fromFunction1(nativeSQL), prepareCall = js.Any.fromFunction1(prepareCall), prepareStatement = js.Any.fromFunction1(prepareStatement), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, rollback = rollback.toJsFn, setAutoCommit = js.Any.fromFunction1((t0: Boolean) => setAutoCommit(t0).runNow()), setCatalog = js.Any.fromFunction1((t0: String) => setCatalog(t0).runNow()), setReadOnly = js.Any.fromFunction1((t0: Boolean) => setReadOnly(t0).runNow()), setTransactionIsolation = js.Any.fromFunction1((t0: Double) => setTransactionIsolation(t0).runNow()), setTypeMap = js.Any.fromFunction1((t0: XNameAccess) => setTypeMap(t0).runNow()))
    __obj.asInstanceOf[XConnection]
  }
  
  extension [Self <: XConnection](x: Self) {
    
    inline def setAutoCommit(value: Boolean): Self = StObject.set(x, "AutoCommit", value.asInstanceOf[js.Any])
    
    inline def setCatalog(value: String): Self = StObject.set(x, "Catalog", value.asInstanceOf[js.Any])
    
    inline def setCommit(value: Callback): Self = StObject.set(x, "commit", value.toJsFn)
    
    inline def setCreateStatement(value: CallbackTo[XStatement]): Self = StObject.set(x, "createStatement", value.toJsFn)
    
    inline def setGetAutoCommit(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAutoCommit", value.toJsFn)
    
    inline def setGetCatalog(value: CallbackTo[String]): Self = StObject.set(x, "getCatalog", value.toJsFn)
    
    inline def setGetMetaData(value: CallbackTo[XDatabaseMetaData]): Self = StObject.set(x, "getMetaData", value.toJsFn)
    
    inline def setGetTransactionIsolation(value: CallbackTo[Double]): Self = StObject.set(x, "getTransactionIsolation", value.toJsFn)
    
    inline def setGetTypeMap(value: CallbackTo[XNameAccess]): Self = StObject.set(x, "getTypeMap", value.toJsFn)
    
    inline def setIsClosed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isClosed", value.toJsFn)
    
    inline def setIsReadOnly(value: CallbackTo[Boolean]): Self = StObject.set(x, "isReadOnly", value.toJsFn)
    
    inline def setMetaData(value: XDatabaseMetaData): Self = StObject.set(x, "MetaData", value.asInstanceOf[js.Any])
    
    inline def setNativeSQL(value: String => String): Self = StObject.set(x, "nativeSQL", js.Any.fromFunction1(value))
    
    inline def setPrepareCall(value: String => XPreparedStatement): Self = StObject.set(x, "prepareCall", js.Any.fromFunction1(value))
    
    inline def setPrepareStatement(value: String => XPreparedStatement): Self = StObject.set(x, "prepareStatement", js.Any.fromFunction1(value))
    
    inline def setRollback(value: Callback): Self = StObject.set(x, "rollback", value.toJsFn)
    
    inline def setSetAutoCommit(value: Boolean => Callback): Self = StObject.set(x, "setAutoCommit", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetCatalog(value: String => Callback): Self = StObject.set(x, "setCatalog", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetReadOnly(value: Boolean => Callback): Self = StObject.set(x, "setReadOnly", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetTransactionIsolation(value: Double => Callback): Self = StObject.set(x, "setTransactionIsolation", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetTypeMap(value: XNameAccess => Callback): Self = StObject.set(x, "setTypeMap", js.Any.fromFunction1((t0: XNameAccess) => value(t0).runNow()))
    
    inline def setTransactionIsolation(value: Double): Self = StObject.set(x, "TransactionIsolation", value.asInstanceOf[js.Any])
    
    inline def setTypeMap(value: XNameAccess): Self = StObject.set(x, "TypeMap", value.asInstanceOf[js.Any])
  }
}
