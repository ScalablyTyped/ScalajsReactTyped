package typingsJapgolly.promisePg

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.eventsMod.EventEmitterOptions
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Writable
import typingsJapgolly.pg.anon.TypeofPg
import typingsJapgolly.pg.mod.ConnectionConfig
import typingsJapgolly.pg.mod.Defaults_
import typingsJapgolly.pg.mod.PoolConfig
import typingsJapgolly.pg.mod.QueryResultRow
import typingsJapgolly.pgProtocol.distMessagesMod.MessageName
import typingsJapgolly.pgTypes.mod.TypeId
import typingsJapgolly.pgTypes.mod.TypeParser
import typingsJapgolly.promisePg.promisePgStrings.binary
import typingsJapgolly.promisePg.promisePgStrings.drain
import typingsJapgolly.promisePg.promisePgStrings.error
import typingsJapgolly.promisePg.promisePgStrings.notice
import typingsJapgolly.promisePg.promisePgStrings.notification
import typingsJapgolly.promisePg.promisePgStrings.text
import typingsJapgolly.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-pg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("promise-pg", "Client")
  @js.native
  open class Client protected () extends StObject {
    def this(config: ClientConfig) = this()
    def this(connection: String) = this()
    
    def connect(): Promise[Unit] = js.native
    
    def copyFrom(queryText: String): Writable = js.native
    
    def copyTo(queryText: String): Readable = js.native
    
    def end(): Promise[Unit] = js.native
    
    def on(event: String, listener: js.Function): Client = js.native
    @JSName("on")
    def on_drain(event: drain, listener: js.Function0[Unit]): Client = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): Client = js.native
    @JSName("on")
    def on_notice(event: notice, listener: js.Function1[/* message */ Any, Unit]): Client = js.native
    @JSName("on")
    def on_notification(event: notification, listener: js.Function1[/* message */ Any, Unit]): Client = js.native
    
    def pauseDrain(): Unit = js.native
    
    def query(config: QueryConfig): Query = js.native
    def query(queryText: String): Query = js.native
    def query(queryText: String, values: js.Array[Any]): Query = js.native
    
    var raw: typingsJapgolly.pg.mod.Client = js.native
    
    def resumeDrain(): Unit = js.native
    
    def transaction(task: js.Function0[Promise[Any]]): Promise[Any] = js.native
  }
  
  @JSImport("promise-pg", "Query")
  @js.native
  open class Query ()
    extends typingsJapgolly.pg.mod.Query[Any, Any] {
    def this(queryTextOrConfig: String) = this()
    def this(queryTextOrConfig: typingsJapgolly.pg.mod.QueryConfig[Any]) = this()
    def this(queryTextOrConfig: String, values: Any) = this()
    def this(queryTextOrConfig: Unit, values: Any) = this()
    def this(queryTextOrConfig: typingsJapgolly.pg.mod.QueryConfig[Any], values: Any) = this()
    
    var promise: Promise[QueryResult] = js.native
  }
  
  inline def connect(connection: String): Promise[Client] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(connection.asInstanceOf[js.Any]).asInstanceOf[Promise[Client]]
  inline def connect(connection: typingsJapgolly.pg.mod.ClientConfig): Promise[Client] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(connection.asInstanceOf[js.Any]).asInstanceOf[Promise[Client]]
  
  inline def end(): Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("end")().asInstanceOf[Promise[Unit]]
  
  object raw {
    
    @JSImport("promise-pg", "raw.Client")
    @js.native
    open class Client ()
      extends typingsJapgolly.pg.mod.Client {
      def this(config: String) = this()
      def this(config: typingsJapgolly.pg.mod.ClientConfig) = this()
    }
    
    @JSImport("promise-pg", "raw.ClientBase")
    @js.native
    open class ClientBase ()
      extends typingsJapgolly.pg.mod.ClientBase {
      def this(config: String) = this()
      def this(config: typingsJapgolly.pg.mod.ClientConfig) = this()
    }
    
    @JSImport("promise-pg", "raw.Connection")
    @js.native
    open class Connection ()
      extends typingsJapgolly.pg.mod.Connection {
      def this(config: ConnectionConfig) = this()
    }
    
    @JSImport("promise-pg", "raw.DatabaseError")
    @js.native
    open class DatabaseError protected ()
      extends typingsJapgolly.pg.mod.DatabaseError {
      def this(message: String, length: Double, name: MessageName) = this()
    }
    
    @JSImport("promise-pg", "raw.Events")
    @js.native
    open class Events ()
      extends typingsJapgolly.pg.mod.Events {
      def this(options: EventEmitterOptions) = this()
    }
    
    @JSImport("promise-pg", "raw.Pool")
    @js.native
    /**
      * Every field of the config object is entirely optional.
      * The config passed to the pool is also passed to every client
      * instance within the pool when the pool creates that client.
      */
    open class Pool ()
      extends typingsJapgolly.pg.mod.Pool {
      def this(config: PoolConfig) = this()
    }
    
    @JSImport("promise-pg", "raw.Query")
    @js.native
    open class Query[R /* <: QueryResultRow */, I /* <: js.Array[Any] */] ()
      extends typingsJapgolly.pg.mod.Query[R, I] {
      def this(queryTextOrConfig: String) = this()
      def this(queryTextOrConfig: typingsJapgolly.pg.mod.QueryConfig[I]) = this()
      def this(queryTextOrConfig: String, values: I) = this()
      def this(queryTextOrConfig: Unit, values: I) = this()
      def this(queryTextOrConfig: typingsJapgolly.pg.mod.QueryConfig[I], values: I) = this()
    }
    
    @JSImport("promise-pg", "raw.defaults")
    @js.native
    val defaults: Defaults_ & typingsJapgolly.pg.mod.ClientConfig = js.native
    
    @JSImport("promise-pg", "raw.native")
    @js.native
    val native: TypeofPg | Null = js.native
    
    object types {
      
      @JSImport("promise-pg", "raw.types")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getTypeParser[T](oid: Double): TypeParser[String, T | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParser")(oid.asInstanceOf[js.Any]).asInstanceOf[TypeParser[String, T | String]]
      inline def getTypeParser[T](oid: TypeId): TypeParser[String, T | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParser")(oid.asInstanceOf[js.Any]).asInstanceOf[TypeParser[String, T | String]]
      
      inline def getTypeParser_binary[T](oid: Double, format: binary): TypeParser[Buffer, T | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParser")(oid.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[TypeParser[Buffer, T | String]]
      inline def getTypeParser_binary[T](oid: TypeId, format: binary): TypeParser[Buffer, T | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParser")(oid.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[TypeParser[Buffer, T | String]]
      
      inline def getTypeParser_text[T](oid: Double, format: text): TypeParser[String, T | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParser")(oid.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[TypeParser[String, T | String]]
      inline def getTypeParser_text[T](oid: TypeId, format: text): TypeParser[String, T | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParser")(oid.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[TypeParser[String, T | String]]
      
      inline def setTypeParser[T](oid: Double, parseFn: TypeParser[String, T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTypeParser")(oid.asInstanceOf[js.Any], parseFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def setTypeParser[T](oid: TypeId, parseFn: TypeParser[String, T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTypeParser")(oid.asInstanceOf[js.Any], parseFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def setTypeParser_binary[T](oid: Double, format: binary, parseFn: TypeParser[Buffer, T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTypeParser")(oid.asInstanceOf[js.Any], format.asInstanceOf[js.Any], parseFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def setTypeParser_binary[T](oid: TypeId, format: binary, parseFn: TypeParser[Buffer, T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTypeParser")(oid.asInstanceOf[js.Any], format.asInstanceOf[js.Any], parseFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def setTypeParser_text[T](oid: Double, format: text, parseFn: TypeParser[String, T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTypeParser")(oid.asInstanceOf[js.Any], format.asInstanceOf[js.Any], parseFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def setTypeParser_text[T](oid: TypeId, format: text, parseFn: TypeParser[String, T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTypeParser")(oid.asInstanceOf[js.Any], format.asInstanceOf[js.Any], parseFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
  
  type ClientConfig = typingsJapgolly.pg.mod.ClientConfig
  
  trait QueryConfig
    extends StObject
       with typingsJapgolly.pg.mod.QueryConfig[js.Array[Any]] {
    
    var buffer: js.UndefOr[Boolean] = js.undefined
  }
  object QueryConfig {
    
    inline def apply(text: String): QueryConfig = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryConfig]
    }
    
    extension [Self <: QueryConfig](x: Self) {
      
      inline def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    }
  }
  
  type QueryResult = typingsJapgolly.pg.mod.QueryResult[Any]
  
  type ResultBuilder = typingsJapgolly.pg.mod.ResultBuilder[Any]
}
