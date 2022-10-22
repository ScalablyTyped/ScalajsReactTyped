package typingsJapgolly.mysql2

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.mysql2.mysql2Strings.acquire
import typingsJapgolly.mysql2.mysql2Strings.connection
import typingsJapgolly.mysql2.mysql2Strings.enqueue
import typingsJapgolly.mysql2.mysql2Strings.release
import typingsJapgolly.mysql2.typingsMysqlLibConnectionMod.ConnectionOptions
import typingsJapgolly.mysql2.typingsMysqlLibPoolClusterMod.PoolClusterOptions
import typingsJapgolly.mysql2.typingsMysqlLibPoolMod.PoolOptions
import typingsJapgolly.mysql2.typingsMysqlLibProtocolPacketsFieldPacketMod.FieldPacket
import typingsJapgolly.mysql2.typingsMysqlLibProtocolPacketsOkPacketMod.OkPacket
import typingsJapgolly.mysql2.typingsMysqlLibProtocolPacketsResultSetHeaderMod.ResultSetHeader
import typingsJapgolly.mysql2.typingsMysqlLibProtocolPacketsRowDataPacketMod.RowDataPacket
import typingsJapgolly.mysql2.typingsMysqlLibProtocolSequencesQueryMod.QueryOptions
import typingsJapgolly.mysql2.typingsMysqlMod.PoolCluster
import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promiseMod {
  
  @JSImport("mysql2/promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createConnection(config: ConnectionOptions): typingsJapgolly.mysql2.typingsMysqlMod.Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(config.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mysql2.typingsMysqlMod.Connection]
  inline def createConnection(connectionUri: String): typingsJapgolly.mysql2.typingsMysqlMod.Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(connectionUri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mysql2.typingsMysqlMod.Connection]
  
  inline def createConnection_Promise(config: ConnectionOptions): js.Promise[typingsJapgolly.mysql2.typingsMysqlMod.Connection] = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.mysql2.typingsMysqlMod.Connection]]
  inline def createConnection_Promise(connectionUri: String): js.Promise[typingsJapgolly.mysql2.typingsMysqlMod.Connection] = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(connectionUri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.mysql2.typingsMysqlMod.Connection]]
  
  inline def createPool(config: PoolOptions): typingsJapgolly.mysql2.typingsMysqlMod.Pool = ^.asInstanceOf[js.Dynamic].applyDynamic("createPool")(config.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mysql2.typingsMysqlMod.Pool]
  
  inline def createPoolCluster(): PoolCluster = ^.asInstanceOf[js.Dynamic].applyDynamic("createPoolCluster")().asInstanceOf[PoolCluster]
  inline def createPoolCluster(config: PoolClusterOptions): PoolCluster = ^.asInstanceOf[js.Dynamic].applyDynamic("createPoolCluster")(config.asInstanceOf[js.Any]).asInstanceOf[PoolCluster]
  
  inline def escape(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def format(sql: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(sql: String, values: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(sql: String, values: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @js.native
  trait Connection extends EventEmitter {
    
    def beginTransaction(): js.Promise[Unit] = js.native
    
    def changeUser(options: ConnectionOptions): js.Promise[Unit] = js.native
    
    def commit(): js.Promise[Unit] = js.native
    
    var config: ConnectionOptions = js.native
    
    def connect(): js.Promise[Unit] = js.native
    
    def destroy(): Unit = js.native
    
    def end(): js.Promise[Unit] = js.native
    def end(options: Any): js.Promise[Unit] = js.native
    
    def escape(value: Any): String = js.native
    
    def escapeId(value: String): String = js.native
    def escapeId(values: js.Array[String]): String = js.native
    
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Array[Any]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: StringDictionary[Any]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: Any): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Array[Any]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: StringDictionary[Any]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: Any): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    
    def format(sql: String): String = js.native
    def format(sql: String, values: js.Array[Any]): String = js.native
    def format(sql: String, values: StringDictionary[Any]): String = js.native
    def format(sql: String, values: Any): String = js.native
    
    def pause(): Unit = js.native
    
    def ping(): js.Promise[Unit] = js.native
    
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Array[Any]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: StringDictionary[Any]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: Any): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Array[Any]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: StringDictionary[Any]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: Any): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    
    def resume(): Unit = js.native
    
    def rollback(): js.Promise[Unit] = js.native
    
    var threadId: Double = js.native
    
    def unprepare(sql: String): Unit = js.native
  }
  
  @js.native
  trait Pool extends EventEmitter {
    
    def end(): js.Promise[Unit] = js.native
    
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Array[Any]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: StringDictionary[Any]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: Any): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Array[Any]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: StringDictionary[Any]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: Any): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    
    def getConnection(): js.Promise[typingsJapgolly.mysql2.typingsMysqlMod.PoolConnection] = js.native
    
    @JSName("on")
    def on_acquire(
      event: acquire,
      listener: js.Function1[/* connection */ typingsJapgolly.mysql2.typingsMysqlMod.PoolConnection, Any]
    ): this.type = js.native
    @JSName("on")
    def on_connection(
      event: connection,
      listener: js.Function1[/* connection */ typingsJapgolly.mysql2.typingsMysqlMod.PoolConnection, Any]
    ): this.type = js.native
    @JSName("on")
    def on_enqueue(event: enqueue, listener: js.Function0[Any]): this.type = js.native
    @JSName("on")
    def on_release(
      event: release,
      listener: js.Function1[/* connection */ typingsJapgolly.mysql2.typingsMysqlMod.PoolConnection, Any]
    ): this.type = js.native
    
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Array[Any]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: StringDictionary[Any]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: Any): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Array[Any]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: StringDictionary[Any]): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: Any): js.Promise[js.Tuple2[T, js.Array[FieldPacket]]] = js.native
  }
  
  @js.native
  trait PoolConnection
    extends typingsJapgolly.mysql2.typingsMysqlLibConnectionMod.^ {
    
    def release(): Unit = js.native
  }
}
