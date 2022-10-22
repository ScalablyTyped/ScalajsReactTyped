package typingsJapgolly.sqlite

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.sqlite.sqliteStrings.busyTimeout
import typingsJapgolly.sqlite.sqliteStrings.close
import typingsJapgolly.sqlite.sqliteStrings.error
import typingsJapgolly.sqlite.sqliteStrings.open
import typingsJapgolly.sqlite.sqliteStrings.profile
import typingsJapgolly.sqlite.sqliteStrings.trace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqlite3Mod {
  
  @JSImport("sqlite3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sqlite3", "Database")
  @js.native
  open class Database protected () extends EventEmitter {
    def this(filename: String) = this()
    def this(filename: String, callback: js.Function1[/* err */ js.Error | Null, Unit]) = this()
    def this(filename: String, mode: Double) = this()
    def this(filename: String, mode: Double, callback: js.Function1[/* err */ js.Error | Null, Unit]) = this()
    def this(filename: String, mode: Unit, callback: js.Function1[/* err */ js.Error | Null, Unit]) = this()
    
    def all(sql: String): this.type = js.native
    def all(
      sql: String,
      callback: js.ThisFunction2[/* this */ Statement, /* err */ js.Error | Null, /* rows */ js.Array[Any], Unit]
    ): this.type = js.native
    def all(sql: String, params: Any*): this.type = js.native
    def all(sql: String, params: Any): this.type = js.native
    def all(
      sql: String,
      params: Any,
      callback: js.ThisFunction2[/* this */ Statement, /* err */ js.Error | Null, /* rows */ js.Array[Any], Unit]
    ): this.type = js.native
    
    def close(): Unit = js.native
    def close(callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    
    @JSName("configure")
    def configure_busyTimeout(option: busyTimeout, value: Double): Unit = js.native
    
    def each(sql: String): this.type = js.native
    def each(
      sql: String,
      callback: js.ThisFunction2[/* this */ Statement, /* err */ js.Error | Null, /* row */ Any, Unit]
    ): this.type = js.native
    def each(
      sql: String,
      callback: js.ThisFunction2[/* this */ Statement, /* err */ js.Error | Null, /* row */ Any, Unit],
      complete: js.Function2[/* err */ js.Error | Null, /* count */ Double, Unit]
    ): this.type = js.native
    def each(
      sql: String,
      callback: Unit,
      complete: js.Function2[/* err */ js.Error | Null, /* count */ Double, Unit]
    ): this.type = js.native
    def each(sql: String, params: Any*): this.type = js.native
    def each(sql: String, params: Any): this.type = js.native
    def each(
      sql: String,
      params: Any,
      callback: js.ThisFunction2[/* this */ Statement, /* err */ js.Error | Null, /* row */ Any, Unit]
    ): this.type = js.native
    def each(
      sql: String,
      params: Any,
      callback: js.ThisFunction2[/* this */ Statement, /* err */ js.Error | Null, /* row */ Any, Unit],
      complete: js.Function2[/* err */ js.Error | Null, /* count */ Double, Unit]
    ): this.type = js.native
    def each(
      sql: String,
      params: Any,
      callback: Unit,
      complete: js.Function2[/* err */ js.Error | Null, /* count */ Double, Unit]
    ): this.type = js.native
    
    def exec(sql: String): this.type = js.native
    def exec(sql: String, callback: js.ThisFunction1[/* this */ Statement, /* err */ js.Error | Null, Unit]): this.type = js.native
    
    def get(sql: String): this.type = js.native
    def get(
      sql: String,
      callback: js.ThisFunction2[/* this */ Statement, /* err */ js.Error | Null, /* row */ Any, Unit]
    ): this.type = js.native
    def get(sql: String, params: Any*): this.type = js.native
    def get(sql: String, params: Any): this.type = js.native
    def get(
      sql: String,
      params: Any,
      callback: js.ThisFunction2[/* this */ Statement, /* err */ js.Error | Null, /* row */ Any, Unit]
    ): this.type = js.native
    
    def interrupt(): Unit = js.native
    
    def loadExtension(path: String): Unit = js.native
    def loadExtension(path: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    
    def on(event: open | close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_profile(event: profile, listener: js.Function2[/* sql */ String, /* time */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_trace(event: trace, listener: js.Function1[/* sql */ String, Unit]): this.type = js.native
    
    def parallelize(): Unit = js.native
    def parallelize(callback: js.Function0[Unit]): Unit = js.native
    
    def prepare(sql: String): Statement = js.native
    def prepare(sql: String, callback: js.ThisFunction1[/* this */ Statement, /* err */ js.Error | Null, Unit]): Statement = js.native
    def prepare(sql: String, params: Any*): Statement = js.native
    def prepare(sql: String, params: Any): Statement = js.native
    def prepare(
      sql: String,
      params: Any,
      callback: js.ThisFunction1[/* this */ Statement, /* err */ js.Error | Null, Unit]
    ): Statement = js.native
    
    def run(sql: String): this.type = js.native
    def run(sql: String, callback: js.ThisFunction1[/* this */ RunResult, /* err */ js.Error | Null, Unit]): this.type = js.native
    def run(sql: String, params: Any*): this.type = js.native
    def run(sql: String, params: Any): this.type = js.native
    def run(
      sql: String,
      params: Any,
      callback: js.ThisFunction1[/* this */ RunResult, /* err */ js.Error | Null, Unit]
    ): this.type = js.native
    
    def serialize(): Unit = js.native
    def serialize(callback: js.Function0[Unit]): Unit = js.native
  }
  
  @JSImport("sqlite3", "OPEN_CREATE")
  @js.native
  val OPEN_CREATE: Double = js.native
  
  @JSImport("sqlite3", "OPEN_PRIVATECACHE")
  @js.native
  val OPEN_PRIVATECACHE: Double = js.native
  
  @JSImport("sqlite3", "OPEN_READONLY")
  @js.native
  val OPEN_READONLY: Double = js.native
  
  @JSImport("sqlite3", "OPEN_READWRITE")
  @js.native
  val OPEN_READWRITE: Double = js.native
  
  @JSImport("sqlite3", "OPEN_SHAREDCACHE")
  @js.native
  val OPEN_SHAREDCACHE: Double = js.native
  
  @JSImport("sqlite3", "OPEN_URI")
  @js.native
  val OPEN_URI: Double = js.native
  
  @JSImport("sqlite3", "Statement")
  @js.native
  open class Statement () extends StObject {
    
    def all(): this.type = js.native
    def all(callback: js.Function2[/* err */ js.Error | Null, /* rows */ js.Array[Any], Unit]): this.type = js.native
    def all(params: Any*): this.type = js.native
    def all(params: Any): this.type = js.native
    def all(
      params: Any,
      callback: js.ThisFunction2[/* this */ RunResult, /* err */ js.Error | Null, /* rows */ js.Array[Any], Unit]
    ): this.type = js.native
    
    def bind(): this.type = js.native
    def bind(callback: js.Function1[/* err */ js.Error | Null, Unit]): this.type = js.native
    def bind(params: Any*): this.type = js.native
    
    def each(): this.type = js.native
    def each(callback: js.Function2[/* err */ js.Error | Null, /* row */ Any, Unit]): this.type = js.native
    def each(
      callback: js.Function2[/* err */ js.Error | Null, /* row */ Any, Unit],
      complete: js.Function2[/* err */ js.Error | Null, /* count */ Double, Unit]
    ): this.type = js.native
    def each(callback: Unit, complete: js.Function2[/* err */ js.Error | Null, /* count */ Double, Unit]): this.type = js.native
    def each(params: Any*): this.type = js.native
    def each(params: Any): this.type = js.native
    def each(
      params: Any,
      callback: js.ThisFunction2[/* this */ RunResult, /* err */ js.Error | Null, /* row */ Any, Unit]
    ): this.type = js.native
    def each(
      params: Any,
      callback: js.ThisFunction2[/* this */ RunResult, /* err */ js.Error | Null, /* row */ Any, Unit],
      complete: js.Function2[/* err */ js.Error | Null, /* count */ Double, Unit]
    ): this.type = js.native
    def each(
      params: Any,
      callback: Unit,
      complete: js.Function2[/* err */ js.Error | Null, /* count */ Double, Unit]
    ): this.type = js.native
    
    def finalize(callback: js.Function1[/* err */ js.Error, Unit]): Database = js.native
    
    def get(): this.type = js.native
    def get(callback: js.Function2[/* err */ js.Error | Null, /* row */ js.UndefOr[Any], Unit]): this.type = js.native
    def get(params: Any*): this.type = js.native
    def get(params: Any): this.type = js.native
    def get(
      params: Any,
      callback: js.ThisFunction2[/* this */ RunResult, /* err */ js.Error | Null, /* row */ js.UndefOr[Any], Unit]
    ): this.type = js.native
    
    def reset(): this.type = js.native
    def reset(callback: js.Function1[/* err */ Null, Unit]): this.type = js.native
    
    def run(): this.type = js.native
    def run(callback: js.Function1[/* err */ js.Error | Null, Unit]): this.type = js.native
    def run(params: Any*): this.type = js.native
    def run(params: Any): this.type = js.native
    def run(params: Any, callback: js.ThisFunction1[/* this */ RunResult, /* err */ js.Error | Null, Unit]): this.type = js.native
  }
  
  object cached {
    
    @JSImport("sqlite3", "cached")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Database(filename: String): typingsJapgolly.sqlite.sqlite3Mod.Database = ^.asInstanceOf[js.Dynamic].applyDynamic("Database")(filename.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sqlite.sqlite3Mod.Database]
    inline def Database(
      filename: String,
      callback: js.ThisFunction1[
          /* this */ typingsJapgolly.sqlite.sqlite3Mod.Database, 
          /* err */ js.Error | Null, 
          Unit
        ]
    ): typingsJapgolly.sqlite.sqlite3Mod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("Database")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sqlite.sqlite3Mod.Database]
    inline def Database(filename: String, mode: Double): typingsJapgolly.sqlite.sqlite3Mod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("Database")(filename.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sqlite.sqlite3Mod.Database]
    inline def Database(
      filename: String,
      mode: Double,
      callback: js.ThisFunction1[
          /* this */ typingsJapgolly.sqlite.sqlite3Mod.Database, 
          /* err */ js.Error | Null, 
          Unit
        ]
    ): typingsJapgolly.sqlite.sqlite3Mod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("Database")(filename.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sqlite.sqlite3Mod.Database]
    inline def Database(
      filename: String,
      mode: Unit,
      callback: js.ThisFunction1[
          /* this */ typingsJapgolly.sqlite.sqlite3Mod.Database, 
          /* err */ js.Error | Null, 
          Unit
        ]
    ): typingsJapgolly.sqlite.sqlite3Mod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("Database")(filename.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sqlite.sqlite3Mod.Database]
  }
  
  inline def verbose(): sqlite3 = ^.asInstanceOf[js.Dynamic].applyDynamic("verbose")().asInstanceOf[sqlite3]
  
  @js.native
  trait RunResult extends Statement {
    
    var changes: Double = js.native
    
    var lastID: Double = js.native
  }
  
  trait sqlite3 extends StObject {
    
    var Database: Instantiable2[
        /* filename */ String, 
        /* callback */ js.UndefOr[js.Function1[/* err */ js.Error | Null, Unit]], 
        typingsJapgolly.sqlite.sqlite3Mod.Database
      ]
    
    var OPEN_CREATE: Double
    
    var OPEN_PRIVATECACHE: Double
    
    var OPEN_READONLY: Double
    
    var OPEN_READWRITE: Double
    
    var OPEN_SHAREDCACHE: Double
    
    var OPEN_URI: Double
    
    var RunResult: typingsJapgolly.sqlite.sqlite3Mod.RunResult
    
    var Statement: Instantiable0[typingsJapgolly.sqlite.sqlite3Mod.Statement]
    
    var cached: typingsJapgolly.sqlite.anon.Database
    
    def verbose(): this.type
  }
  object sqlite3 {
    
    inline def apply(
      Database: Instantiable2[
          /* filename */ String, 
          /* callback */ js.UndefOr[js.Function1[/* err */ js.Error | Null, Unit]], 
          Database
        ],
      OPEN_CREATE: Double,
      OPEN_PRIVATECACHE: Double,
      OPEN_READONLY: Double,
      OPEN_READWRITE: Double,
      OPEN_SHAREDCACHE: Double,
      OPEN_URI: Double,
      RunResult: RunResult,
      Statement: Instantiable0[Statement],
      cached: typingsJapgolly.sqlite.anon.Database,
      verbose: CallbackTo[sqlite3]
    ): sqlite3 = {
      val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], OPEN_CREATE = OPEN_CREATE.asInstanceOf[js.Any], OPEN_PRIVATECACHE = OPEN_PRIVATECACHE.asInstanceOf[js.Any], OPEN_READONLY = OPEN_READONLY.asInstanceOf[js.Any], OPEN_READWRITE = OPEN_READWRITE.asInstanceOf[js.Any], OPEN_SHAREDCACHE = OPEN_SHAREDCACHE.asInstanceOf[js.Any], OPEN_URI = OPEN_URI.asInstanceOf[js.Any], RunResult = RunResult.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any], cached = cached.asInstanceOf[js.Any], verbose = verbose.toJsFn)
      __obj.asInstanceOf[sqlite3]
    }
    
    extension [Self <: sqlite3](x: Self) {
      
      inline def setCached(value: typingsJapgolly.sqlite.anon.Database): Self = StObject.set(x, "cached", value.asInstanceOf[js.Any])
      
      inline def setDatabase(
        value: Instantiable2[
              /* filename */ String, 
              /* callback */ js.UndefOr[js.Function1[/* err */ js.Error | Null, Unit]], 
              Database
            ]
      ): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
      
      inline def setOPEN_CREATE(value: Double): Self = StObject.set(x, "OPEN_CREATE", value.asInstanceOf[js.Any])
      
      inline def setOPEN_PRIVATECACHE(value: Double): Self = StObject.set(x, "OPEN_PRIVATECACHE", value.asInstanceOf[js.Any])
      
      inline def setOPEN_READONLY(value: Double): Self = StObject.set(x, "OPEN_READONLY", value.asInstanceOf[js.Any])
      
      inline def setOPEN_READWRITE(value: Double): Self = StObject.set(x, "OPEN_READWRITE", value.asInstanceOf[js.Any])
      
      inline def setOPEN_SHAREDCACHE(value: Double): Self = StObject.set(x, "OPEN_SHAREDCACHE", value.asInstanceOf[js.Any])
      
      inline def setOPEN_URI(value: Double): Self = StObject.set(x, "OPEN_URI", value.asInstanceOf[js.Any])
      
      inline def setRunResult(value: RunResult): Self = StObject.set(x, "RunResult", value.asInstanceOf[js.Any])
      
      inline def setStatement(value: Instantiable0[Statement]): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: CallbackTo[sqlite3]): Self = StObject.set(x, "verbose", value.toJsFn)
    }
  }
}
