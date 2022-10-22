package typingsJapgolly.ibmDb

import typingsJapgolly.ibmDb.anon.Outparams
import typingsJapgolly.ibmDb.anon.Params
import typingsJapgolly.ibmDb.ibmDbBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ibm_db", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Database]
  inline def default(options: Options): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Database]
  
  @JSImport("ibm_db", "Database")
  @js.native
  open class Database ()
    extends StObject
       with Options {
    def this(options: Options) = this()
    
    def beginTransaction(): js.Promise[Unit] = js.native
    // TODO: add types from stream
    def beginTransaction(cb: js.Function2[/* err */ js.Error, /* res */ Any, Unit]): Unit = js.native
    
    def beginTransactionSync(): Database = js.native
    
    def close(): js.Promise[js.UndefOr[js.Error]] = js.native
    def close(cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): `false` = js.native
    
    def closeSync(): Boolean = js.native
    
    def columns(
      catalog: String,
      schema: String,
      table: String,
      column: String,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def columns(
      catalog: String,
      schema: String,
      table: String,
      column: Null,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def columns(
      catalog: String,
      schema: String,
      table: Null,
      column: String,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def columns(
      catalog: String,
      schema: String,
      table: Null,
      column: Null,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def columns(
      catalog: String,
      schema: Null,
      table: String,
      column: String,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def columns(
      catalog: String,
      schema: Null,
      table: String,
      column: Null,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def columns(
      catalog: String,
      schema: Null,
      table: Null,
      column: String,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def columns(
      catalog: String,
      schema: Null,
      table: Null,
      column: Null,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def columns(
      catalog: Null,
      schema: String,
      table: String,
      column: String,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def columns(
      catalog: Null,
      schema: String,
      table: String,
      column: Null,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def columns(
      catalog: Null,
      schema: String,
      table: Null,
      column: String,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def columns(
      catalog: Null,
      schema: String,
      table: Null,
      column: Null,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def columns(
      catalog: Null,
      schema: Null,
      table: String,
      column: String,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def columns(
      catalog: Null,
      schema: Null,
      table: String,
      column: Null,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def columns(
      catalog: Null,
      schema: Null,
      table: Null,
      column: String,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def columns(
      catalog: Null,
      schema: Null,
      table: Null,
      column: Null,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    
    def commitTransaction(): js.Promise[Unit] = js.native
    def commitTransaction(cb: js.Function2[/* err */ js.Error, /* res */ Any, Unit]): Unit = js.native
    
    def commitTransactionSync(): Database = js.native
    
    var conn: js.UndefOr[ODBCConnection] = js.native
    
    @JSName("connectTimeout")
    var connectTimeout_Database: Double | Null = js.native
    
    @JSName("connected")
    var connected_Database: Boolean = js.native
    
    def describe(obj: DescribeObject, cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]): Unit = js.native
    
    def endTransaction(): js.Promise[Unit] = js.native
    def endTransaction(rollback: Boolean, cb: js.Function2[/* foo */ Any, /* bar */ Any, Any]): Any = js.native
    
    def endTransactionSync(rollback: Boolean): Database = js.native
    
    @JSName("fetchMode")
    var fetchMode_Database: Double | Null = js.native
    
    // TODO: add types from stream
    def fetchStreamingResults(results: Any, stream: Any): Any = js.native
    
    @JSName("odbc")
    var odbc_Database: ODBC = js.native
    
    def open(connStr: String): js.Promise[ODBCConnection] = js.native
    def open(connStr: String, cb: js.Function2[/* err */ js.Error, /* conn */ js.UndefOr[ODBCConnection], Unit]): Unit = js.native
    def open(connStr: ConnStr): js.Promise[ODBCConnection] = js.native
    def open(
      connStr: ConnStr,
      cb: js.Function2[/* err */ js.Error, /* conn */ js.UndefOr[ODBCConnection], Unit]
    ): Unit = js.native
    
    def openSync(connStr: String): Boolean = js.native
    def openSync(connStr: ConnStr): Boolean = js.native
    
    def prepare(sql: String): js.Promise[ODBCStatement] = js.native
    def prepare(sql: String, cb: js.Function2[/* err */ js.Error, /* stmt */ ODBCStatement, Unit]): Unit = js.native
    
    def prepareSync(sql: String): ODBCStatement = js.native
    
    def query(query: String): js.Promise[js.Array[Any]] = js.native
    def query(query: String, cb: js.Function2[/* err */ js.Error, /* res */ js.Array[Any], Unit]): Unit = js.native
    def query(query: String, params: js.Array[Any]): js.Promise[js.Array[Any]] = js.native
    def query(
      query: String,
      params: js.Array[Any],
      cb: js.Function2[/* err */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def query(query: Params): js.Promise[js.Array[Any]] = js.native
    def query(query: Params, cb: js.Function2[/* err */ js.Error, /* res */ js.Array[Any], Unit]): Unit = js.native
    def query(query: Params, params: js.Array[Any]): js.Promise[js.Array[Any]] = js.native
    
    def queryResult(query: String): js.Promise[ODBCResult] = js.native
    def queryResult(query: String, cb: js.Function2[/* err */ js.Error, /* res */ ODBCResult, Unit]): Unit = js.native
    def queryResult(query: String, params: js.Array[Any]): js.Promise[ODBCResult] = js.native
    def queryResult(
      query: String,
      params: js.Array[Any],
      cb: js.Function2[/* err */ js.Error, /* res */ ODBCResult, Unit]
    ): Unit = js.native
    def queryResult(query: Params, cb: js.Function2[/* err */ js.Error, /* res */ ODBCResult, Unit]): Unit = js.native
    
    def queryResultSync(query: String): ODBCResult = js.native
    def queryResultSync(query: String, params: js.Array[Any]): ODBCResult = js.native
    def queryResultSync(query: Params): ODBCResult = js.native
    def queryResultSync(query: Params, params: js.Array[Any]): ODBCResult = js.native
    
    def queryStream(sql: String, params: js.Array[Any]): Any = js.native
    
    def querySync(query: String): js.Array[Any] = js.native
    def querySync(query: String, params: js.Array[Any]): js.Array[Any] = js.native
    def querySync(query: Params): js.Array[Any] = js.native
    def querySync(query: Params, params: js.Array[Any]): js.Array[Any] = js.native
    
    @JSName("queue")
    var queue_Database: SimpleQueue | js.Array[Any] = js.native
    
    def rollbackTransaction(): js.Promise[Unit] = js.native
    def rollbackTransaction(cb: js.Function2[/* err */ js.Error, /* res */ Any, Unit]): Unit = js.native
    
    def rollbackTransactionSync(): Database = js.native
    
    def setIsolationLevel(isolationLevel: Double): Boolean = js.native
    
    def tables(
      catalog: String,
      schema: String,
      table: String,
      `type`: String,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def tables(
      catalog: String,
      schema: String,
      table: String,
      `type`: Null,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def tables(
      catalog: String,
      schema: String,
      table: Null,
      `type`: String,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def tables(
      catalog: String,
      schema: String,
      table: Null,
      `type`: Null,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def tables(
      catalog: String,
      schema: Null,
      table: String,
      `type`: String,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def tables(
      catalog: String,
      schema: Null,
      table: String,
      `type`: Null,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def tables(
      catalog: String,
      schema: Null,
      table: Null,
      `type`: String,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def tables(
      catalog: String,
      schema: Null,
      table: Null,
      `type`: Null,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def tables(
      catalog: Null,
      schema: String,
      table: String,
      `type`: String,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def tables(
      catalog: Null,
      schema: String,
      table: String,
      `type`: Null,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def tables(
      catalog: Null,
      schema: String,
      table: Null,
      `type`: String,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def tables(
      catalog: Null,
      schema: String,
      table: Null,
      `type`: Null,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def tables(
      catalog: Null,
      schema: Null,
      table: String,
      `type`: String,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def tables(
      catalog: Null,
      schema: Null,
      table: String,
      `type`: Null,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def tables(
      catalog: Null,
      schema: Null,
      table: Null,
      `type`: String,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
    def tables(
      catalog: Null,
      schema: Null,
      table: Null,
      `type`: Null,
      cb: js.Function2[/* error */ js.Error, /* res */ js.Array[Any], Unit]
    ): Unit = js.native
  }
  
  @JSImport("ibm_db", "FETCH_ARRAY")
  @js.native
  def FETCH_ARRAY: String = js.native
  inline def FETCH_ARRAY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FETCH_ARRAY")(x.asInstanceOf[js.Any])
  
  @JSImport("ibm_db", "FETCH_OBJECT")
  @js.native
  def FETCH_OBJECT: String = js.native
  inline def FETCH_OBJECT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FETCH_OBJECT")(x.asInstanceOf[js.Any])
  
  @JSImport("ibm_db", "ODBC")
  @js.native
  open class ODBC () extends StObject {
    
    var FETCH_ARRAY: js.UndefOr[String] = js.native
    
    var FETCH_OBJECT: js.UndefOr[String] = js.native
    
    var SQL_DESTROY: js.UndefOr[String] = js.native
    
    var SQL_DROP: js.UndefOr[String] = js.native
    
    var SQL_RESET_PARAMS: js.UndefOr[String] = js.native
    
    var SQL_UNBIND: js.UndefOr[String] = js.native
    
    var SQSQL_CLOSE: js.UndefOr[String] = js.native
  }
  
  @JSImport("ibm_db", "ODBCConnection")
  @js.native
  open class ODBCConnection () extends StObject {
    
    var connectTimeout: Double = js.native
    
    var connected: Boolean = js.native
    
    var loginTimeout: Double = js.native
    
    var systemNaming: Boolean = js.native
  }
  
  @JSImport("ibm_db", "ODBCResult")
  @js.native
  open class ODBCResult () extends StObject {
    
    def closeSync(): Unit = js.native
    
    def fetchAll(
      option: js.Object,
      cb: js.Function3[
          /* err */ js.Error, 
          /* data */ js.Array[Any], 
          /* noOfColumns */ js.UndefOr[Double], 
          Unit
        ]
    ): Unit = js.native
    
    def fetchAllSync(): js.Array[Any] = js.native
    
    var fetchMode: Double = js.native
    
    def fetchSync(): js.Array[Any] = js.native
    
    def getColumnMetadataSync(): js.Array[Any] = js.native
    
    def moreResultsSync(): js.Array[Any] = js.native
  }
  
  @JSImport("ibm_db", "ODBCStatement")
  @js.native
  open class ODBCStatement () extends StObject {
    
    def _bind(params: js.Array[Any], cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def _bindSync(ary: js.Array[Any]): Unit = js.native
    
    // TODO: type of outparams is unknown
    def _execute(cb: js.Function2[/* err */ js.Error, /* result */ js.Array[Any], Unit]): Unit = js.native
    
    def _executeDirect(sql: String, cb: js.Function2[/* err */ js.Error, /* result */ js.Array[Any], Unit]): Unit = js.native
    
    // _executeDirectSync // TODO: Add missing piece
    def _executeNonQuery(cb: js.Function2[/* err */ js.Error, /* res */ js.Array[Any], Unit]): Unit = js.native
    
    def _executeSync(): ODBCResult = js.native
    def _executeSync(params: js.Array[Any]): ODBCResult = js.native
    
    // _executeNonQuerySync // TODO: Add missing piece
    def _prepare(sql: String, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def bind(ary: js.Array[Any], cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    var bindQueue: SimpleQueue = js.native
    
    def bindSync(ary: js.Array[Any]): Unit = js.native
    
    // TODO: type of outparams is unknown
    def execute(cb: js.Function3[/* err */ js.Error, /* result */ js.Array[Any], /* outparams */ Any, Unit]): Unit = js.native
    def execute(params: js.Array[Any]): js.Promise[Outparams] = js.native
    def execute(
      params: js.Array[Any],
      cb: js.Function3[/* err */ js.Error, /* result */ js.Array[Any], /* outparams */ Any, Unit]
    ): Unit = js.native
    
    def executeDirect(sql: String, cb: js.Function2[/* err */ js.Error, /* result */ js.Array[Any], Unit]): Unit = js.native
    
    def executeNonQuery(): js.Promise[Unit] = js.native
    def executeNonQuery(cb: js.Function2[/* err */ js.Error, /* res */ js.Array[Any], Unit]): Unit = js.native
    def executeNonQuery(params: js.Array[Any]): js.Promise[Unit] = js.native
    def executeNonQuery(params: js.Array[Any], cb: js.Function2[/* err */ js.Error, /* res */ js.Array[Any], Unit]): Unit = js.native
    
    def executeNonQuerySync(): Double = js.native
    def executeNonQuerySync(params: js.Array[Any]): Double = js.native
    
    def executeSync(): ODBCResult = js.native
    def executeSync(params: js.Array[Any]): ODBCResult = js.native
    
    def prepare(sql: String, cb: js.Function2[/* err */ js.Error, /* result */ js.Array[Any], Unit]): Unit = js.native
    
    var queue: SimpleQueue = js.native
  }
  
  @JSImport("ibm_db", "Pool")
  @js.native
  open class Pool ()
    extends StObject
       with PoolOptions {
    def this(options: PoolOptions) = this()
    
    var availablePool: js.Object = js.native
    
    def cleanup(connStr: String): Boolean = js.native
    
    def close(cb: js.Function2[/* foo */ Any, /* bar */ Any, Any]): Unit = js.native
    
    var index: Double = js.native
    
    def init(count: Double, connStr: String): Boolean = js.native
    
    var odbc: ODBC = js.native
    
    def open(connStr: String, cb: js.Function2[/* err */ js.Error, /* db */ Database, Unit]): Unit = js.native
    
    def openSync(connStr: String): Database = js.native
    
    var options: PoolOptions = js.native
    
    var poolsize: Double = js.native
    
    def setConnectTimeout(timeout: Double): Boolean = js.native
    
    def setMaxPoolSize(count: Double): Boolean = js.native
    
    var usedPool: js.Object = js.native
  }
  
  @JSImport("ibm_db", "SQL_DESTROY")
  @js.native
  def SQL_DESTROY: String = js.native
  inline def SQL_DESTROY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SQL_DESTROY")(x.asInstanceOf[js.Any])
  
  @JSImport("ibm_db", "SQL_DROP")
  @js.native
  def SQL_DROP: String = js.native
  inline def SQL_DROP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SQL_DROP")(x.asInstanceOf[js.Any])
  
  @JSImport("ibm_db", "SQL_RESET_PARAMS")
  @js.native
  def SQL_RESET_PARAMS: String = js.native
  inline def SQL_RESET_PARAMS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SQL_RESET_PARAMS")(x.asInstanceOf[js.Any])
  
  @JSImport("ibm_db", "SQL_UNBIND")
  @js.native
  def SQL_UNBIND: String = js.native
  inline def SQL_UNBIND_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SQL_UNBIND")(x.asInstanceOf[js.Any])
  
  @JSImport("ibm_db", "SQSQL_CLOSE")
  @js.native
  def SQSQL_CLOSE: String = js.native
  inline def SQSQL_CLOSE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SQSQL_CLOSE")(x.asInstanceOf[js.Any])
  
  @JSImport("ibm_db", "SimpleQueue")
  @js.native
  open class SimpleQueue () extends StObject {
    
    var executing: Boolean = js.native
    
    var fifo: js.Array[Any] = js.native
    
    def maybeNext(): Unit = js.native
    
    def next(): Unit = js.native
    
    def push(fn: js.Function2[/* foo */ Any, /* bar */ Any, Unit]): Unit = js.native
  }
  
  inline def close(db: Database): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(db.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def debug(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getElapsedTime(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getElapsedTime")().asInstanceOf[String]
  
  inline def open(connStr: String): js.Promise[Database] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(connStr.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Database]]
  inline def open(connStr: String, cb: js.Function2[/* err */ js.Error, /* db */ Database, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(connStr.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def open(connStr: String, options: Options): js.Promise[Database] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(connStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Database]]
  inline def open(connStr: String, options: Options, cb: js.Function2[/* err */ js.Error, /* db */ Database, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(connStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def open(connStr: ConnStr): js.Promise[Database] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(connStr.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Database]]
  inline def open(connStr: ConnStr, cb: js.Function2[/* err */ js.Error, /* db */ Database, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(connStr.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def open(connStr: ConnStr, options: Options): js.Promise[Database] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(connStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Database]]
  inline def open(connStr: ConnStr, options: Options, cb: js.Function2[/* err */ js.Error, /* db */ Database, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(connStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def openSync(connStr: String): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(connStr.asInstanceOf[js.Any]).asInstanceOf[Database]
  inline def openSync(connStr: String, options: Options): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(connStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Database]
  inline def openSync(connStr: ConnStr): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(connStr.asInstanceOf[js.Any]).asInstanceOf[Database]
  inline def openSync(connStr: ConnStr, options: Options): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(connStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Database]
  
  trait ConnStr extends StObject {
    
    var DATABASE: String
    
    var HOSTNAME: String
    
    var PORT: Double | String
    
    var PROTOCOL: String
    
    var PWD: String
    
    var UID: String
  }
  object ConnStr {
    
    inline def apply(
      DATABASE: String,
      HOSTNAME: String,
      PORT: Double | String,
      PROTOCOL: String,
      PWD: String,
      UID: String
    ): ConnStr = {
      val __obj = js.Dynamic.literal(DATABASE = DATABASE.asInstanceOf[js.Any], HOSTNAME = HOSTNAME.asInstanceOf[js.Any], PORT = PORT.asInstanceOf[js.Any], PROTOCOL = PROTOCOL.asInstanceOf[js.Any], PWD = PWD.asInstanceOf[js.Any], UID = UID.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnStr]
    }
    
    extension [Self <: ConnStr](x: Self) {
      
      inline def setDATABASE(value: String): Self = StObject.set(x, "DATABASE", value.asInstanceOf[js.Any])
      
      inline def setHOSTNAME(value: String): Self = StObject.set(x, "HOSTNAME", value.asInstanceOf[js.Any])
      
      inline def setPORT(value: Double | String): Self = StObject.set(x, "PORT", value.asInstanceOf[js.Any])
      
      inline def setPROTOCOL(value: String): Self = StObject.set(x, "PROTOCOL", value.asInstanceOf[js.Any])
      
      inline def setPWD(value: String): Self = StObject.set(x, "PWD", value.asInstanceOf[js.Any])
      
      inline def setUID(value: String): Self = StObject.set(x, "UID", value.asInstanceOf[js.Any])
    }
  }
  
  trait DescribeObject extends StObject {
    
    var column: js.UndefOr[String] = js.undefined
    
    var database: String
    
    var schema: js.UndefOr[String] = js.undefined
    
    var table: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DescribeObject {
    
    inline def apply(database: String): DescribeObject = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeObject]
    }
    
    extension [Self <: DescribeObject](x: Self) {
      
      inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var connectTimeout: js.UndefOr[Double | Null] = js.undefined
    
    var connected: js.UndefOr[Boolean] = js.undefined
    
    var fetchMode: js.UndefOr[Double | Null] = js.undefined
    
    var odbc: js.UndefOr[ODBC] = js.undefined
    
    var queue: js.UndefOr[SimpleQueue | js.Array[Any]] = js.undefined
    
    var systemNaming: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectTimeoutNull: Self = StObject.set(x, "connectTimeout", null)
      
      inline def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      inline def setConnectedUndefined: Self = StObject.set(x, "connected", js.undefined)
      
      inline def setFetchMode(value: Double): Self = StObject.set(x, "fetchMode", value.asInstanceOf[js.Any])
      
      inline def setFetchModeNull: Self = StObject.set(x, "fetchMode", null)
      
      inline def setFetchModeUndefined: Self = StObject.set(x, "fetchMode", js.undefined)
      
      inline def setOdbc(value: ODBC): Self = StObject.set(x, "odbc", value.asInstanceOf[js.Any])
      
      inline def setOdbcUndefined: Self = StObject.set(x, "odbc", js.undefined)
      
      inline def setQueue(value: SimpleQueue | js.Array[Any]): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
      
      inline def setQueueVarargs(value: Any*): Self = StObject.set(x, "queue", js.Array(value*))
      
      inline def setSystemNaming(value: Boolean): Self = StObject.set(x, "systemNaming", value.asInstanceOf[js.Any])
      
      inline def setSystemNamingUndefined: Self = StObject.set(x, "systemNaming", js.undefined)
    }
  }
  
  trait PoolOptions extends StObject {
    
    var autoCleanIdle: js.UndefOr[Boolean] = js.undefined
    
    var connectTimeout: js.UndefOr[Double] = js.undefined
    
    var idleTimeout: js.UndefOr[Double] = js.undefined
    
    var maxPoolSize: js.UndefOr[Double] = js.undefined
    
    var systemNaming: js.UndefOr[Any] = js.undefined
  }
  object PoolOptions {
    
    inline def apply(): PoolOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PoolOptions]
    }
    
    extension [Self <: PoolOptions](x: Self) {
      
      inline def setAutoCleanIdle(value: Boolean): Self = StObject.set(x, "autoCleanIdle", value.asInstanceOf[js.Any])
      
      inline def setAutoCleanIdleUndefined: Self = StObject.set(x, "autoCleanIdle", js.undefined)
      
      inline def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      inline def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
      
      inline def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
      
      inline def setMaxPoolSize(value: Double): Self = StObject.set(x, "maxPoolSize", value.asInstanceOf[js.Any])
      
      inline def setMaxPoolSizeUndefined: Self = StObject.set(x, "maxPoolSize", js.undefined)
      
      inline def setSystemNaming(value: Any): Self = StObject.set(x, "systemNaming", value.asInstanceOf[js.Any])
      
      inline def setSystemNamingUndefined: Self = StObject.set(x, "systemNaming", js.undefined)
    }
  }
}
