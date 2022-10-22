package typingsJapgolly.sharedb

import typingsJapgolly.sharedb.anon.`0`
import typingsJapgolly.sharedb.libAgentMod.^
import typingsJapgolly.sharedb.libSharedbMod.ConnectionEventMap
import typingsJapgolly.sharedb.libSharedbMod.Logger
import typingsJapgolly.sharedb.libSharedbMod.Socket
import typingsJapgolly.sharedb.libSharedbMod.TypedEmitter
import typingsJapgolly.sharedb.libSharedbMod.Types
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClientMod {
  
  @JSImport("sharedb/lib/client", "Connection")
  @js.native
  open class Connection protected () extends TypedEmitter[ConnectionEventMap] {
    def this(ws: Socket) = this()
    
    // This direct reference from connection to agent is not used internal to
    // ShareDB, but it is handy for server-side only user code that may cache
    // state on the agent and read it in middleware
    var agent: ^[Any] | Null = js.native
    
    val canSend: Boolean = js.native
    
    def close(): Unit = js.native
    
    var collections: Record[String, Record[String, Doc[Any]]] = js.native
    
    def createFetchQuery[T](collectionName: String, query: Any): Query[T] = js.native
    def createFetchQuery[T](
      collectionName: String,
      query: Any,
      options: Null,
      callback: js.Function2[/* err */ Error, /* results */ js.Array[Doc[T]], Unit]
    ): Query[T] = js.native
    def createFetchQuery[T](
      collectionName: String,
      query: Any,
      options: Unit,
      callback: js.Function2[/* err */ Error, /* results */ js.Array[Doc[T]], Unit]
    ): Query[T] = js.native
    def createFetchQuery[T](collectionName: String, query: Any, options: `0`[T]): Query[T] = js.native
    def createFetchQuery[T](
      collectionName: String,
      query: Any,
      options: `0`[T],
      callback: js.Function2[/* err */ Error, /* results */ js.Array[Doc[T]], Unit]
    ): Query[T] = js.native
    
    def createSubscribeQuery[T](collectionName: String, query: Any): Query[T] = js.native
    def createSubscribeQuery[T](
      collectionName: String,
      query: Any,
      options: Null,
      callback: js.Function2[/* err */ Error, /* results */ js.Array[Doc[T]], Unit]
    ): Query[T] = js.native
    def createSubscribeQuery[T](
      collectionName: String,
      query: Any,
      options: Unit,
      callback: js.Function2[/* err */ Error, /* results */ js.Array[Doc[T]], Unit]
    ): Query[T] = js.native
    def createSubscribeQuery[T](collectionName: String, query: Any, options: `0`[T]): Query[T] = js.native
    def createSubscribeQuery[T](
      collectionName: String,
      query: Any,
      options: `0`[T],
      callback: js.Function2[/* err */ Error, /* results */ js.Array[Doc[T]], Unit]
    ): Query[T] = js.native
    
    var debug: Boolean = js.native
    
    def fetchSnapshot(
      collection: String,
      id: String,
      version: Double,
      callback: js.Function2[
          /* error */ Error, 
          /* snapshot */ typingsJapgolly.sharedb.libSharedbMod.Snapshot[Any], 
          Unit
        ]
    ): Unit = js.native
    
    def fetchSnapshotByTimestamp(
      collection: String,
      id: String,
      timestamp: Double,
      callback: js.Function2[
          /* error */ Error, 
          /* snapshot */ typingsJapgolly.sharedb.libSharedbMod.Snapshot[Any], 
          Unit
        ]
    ): Unit = js.native
    
    def get(collectionName: String, documentID: String): Doc[Any] = js.native
    
    def getDocPresence(collection: String, id: String): Presence[Any] = js.native
    
    def getPresence(channel: String): Presence[Any] = js.native
    
    /**
      * Returns whether anything in this client is either:
      * - In-flight, waiting on a response from the server
      * - Pending (locally queued)
      */
    def hasPending(): Boolean = js.native
    
    var id: String | Null = js.native
    
    // Equals agent.src on the server
    var nextQueryId: Double = js.native
    
    var nextSnapshotRequestId: Double = js.native
    
    def ping(): Unit = js.native
    
    var queries: Record[String, Query[Any]] = js.native
    
    /**
      * Manually send a JSON-serializable message to the server.
      *
      * WARNING - This is mostly for internal use within sharedb.
      *
      * Prefer to use methods like `Doc#submitOp`, `Doc#subscribe`, `Connection#createFetchQuery`,
      * etc., which will manage the necessary message exchanges.
      */
    def send(message: Record[String, Any]): Unit = js.native
    
    var seq: Double = js.native
    
    var state: String = js.native
    
    /**
      * Invokes the callback once nothing on this client is in-flight or pending.
      *
      * @see hasPending
      */
    def whenNothingPending(callback: js.Function0[Unit]): Unit = js.native
  }
  
  @JSImport("sharedb/lib/client", "logger")
  @js.native
  val logger: Logger = js.native
  
  @JSImport("sharedb/lib/client", "types")
  @js.native
  val types: Types = js.native
  
  type AddNumOp = typingsJapgolly.sharedb.libSharedbMod.AddNumOp
  
  type Doc[T] = typingsJapgolly.sharedb.libSharedbMod.Doc[T]
  
  type Error = typingsJapgolly.sharedb.libSharedbMod.Error
  
  type ListDeleteOp = typingsJapgolly.sharedb.libSharedbMod.ListDeleteOp
  
  type ListInsertOp = typingsJapgolly.sharedb.libSharedbMod.ListInsertOp
  
  type ListMoveOp = typingsJapgolly.sharedb.libSharedbMod.ListMoveOp
  
  type ListReplaceOp = typingsJapgolly.sharedb.libSharedbMod.ListReplaceOp
  
  type LocalPresence[T] = typingsJapgolly.sharedb.libSharedbMod.LocalPresence[T]
  
  type ObjectDeleteOp = typingsJapgolly.sharedb.libSharedbMod.ObjectDeleteOp
  
  type ObjectInsertOp = typingsJapgolly.sharedb.libSharedbMod.ObjectInsertOp
  
  type ObjectReplaceOp = typingsJapgolly.sharedb.libSharedbMod.ObjectReplaceOp
  
  type Op = typingsJapgolly.sharedb.libSharedbMod.Op
  
  type Path = typingsJapgolly.sharedb.libSharedbMod.Path
  
  type Presence[T] = typingsJapgolly.sharedb.libSharedbMod.Presence[T]
  
  type Query[T] = typingsJapgolly.sharedb.libSharedbMod.Query[T]
  
  type ShareDBSourceOptions = typingsJapgolly.sharedb.libSharedbMod.ShareDBSourceOptions
  
  type Snapshot[T] = typingsJapgolly.sharedb.libSharedbMod.Snapshot[T]
  
  type StringDeleteOp = typingsJapgolly.sharedb.libSharedbMod.StringDeleteOp
  
  type StringInsertOp = typingsJapgolly.sharedb.libSharedbMod.StringInsertOp
  
  type SubtypeOp = typingsJapgolly.sharedb.libSharedbMod.SubtypeOp
}
