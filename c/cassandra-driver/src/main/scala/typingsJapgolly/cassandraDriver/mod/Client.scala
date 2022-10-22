package typingsJapgolly.cassandraDriver.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cassandraDriver.anon.Params
import typingsJapgolly.cassandraDriver.libDatastaxMod.datastax.graph.GraphResultSet
import typingsJapgolly.cassandraDriver.libMetadataMod.metadata.ClientState
import typingsJapgolly.cassandraDriver.libMetadataMod.metadata.Metadata
import typingsJapgolly.cassandraDriver.libMetricsMod.metrics.ClientMetrics
import typingsJapgolly.cassandraDriver.libTypesMod.types.ResultSet
import typingsJapgolly.cassandraDriver.libTypesMod.types.Row
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver", "Client")
@js.native
open class Client protected () extends EventEmitter {
  def this(options: DseClientOptions) = this()
  
  def batch(queries: js.Array[String | Params]): js.Promise[ResultSet] = js.native
  def batch(queries: js.Array[String | Params], callback: ValueCallback[ResultSet]): Unit = js.native
  def batch(queries: js.Array[String | Params], options: QueryOptions): js.Promise[ResultSet] = js.native
  def batch(queries: js.Array[String | Params], options: QueryOptions, callback: ValueCallback[ResultSet]): Unit = js.native
  
  def connect(): js.Promise[Unit] = js.native
  def connect(callback: EmptyCallback): Unit = js.native
  
  def eachRow(
    query: String,
    params: ArrayOrObject,
    options: QueryOptions,
    rowCallback: js.Function2[/* n */ Double, /* row */ Row, Unit]
  ): Unit = js.native
  def eachRow(
    query: String,
    params: ArrayOrObject,
    options: QueryOptions,
    rowCallback: js.Function2[/* n */ Double, /* row */ Row, Unit],
    callback: ValueCallback[ResultSet]
  ): Unit = js.native
  def eachRow(
    query: String,
    params: ArrayOrObject,
    rowCallback: js.Function2[/* n */ Double, /* row */ Row, Unit]
  ): Unit = js.native
  def eachRow(
    query: String,
    params: ArrayOrObject,
    rowCallback: js.Function2[/* n */ Double, /* row */ Row, Unit],
    callback: ValueCallback[ResultSet]
  ): Unit = js.native
  def eachRow(query: String, rowCallback: js.Function2[/* n */ Double, /* row */ Row, Unit]): Unit = js.native
  
  def execute(query: String): js.Promise[ResultSet] = js.native
  def execute(query: String, callback: ValueCallback[ResultSet]): Unit = js.native
  def execute(query: String, params: Unit, options: QueryOptions): js.Promise[ResultSet] = js.native
  def execute(query: String, params: ArrayOrObject): js.Promise[ResultSet] = js.native
  def execute(query: String, params: ArrayOrObject, callback: ValueCallback[ResultSet]): Unit = js.native
  def execute(query: String, params: ArrayOrObject, options: QueryOptions): js.Promise[ResultSet] = js.native
  def execute(query: String, params: ArrayOrObject, options: QueryOptions, callback: ValueCallback[ResultSet]): Unit = js.native
  
  def executeGraph(traversal: String): js.Promise[GraphResultSet] = js.native
  def executeGraph(traversal: String, callback: ValueCallback[GraphResultSet]): Unit = js.native
  def executeGraph(traversal: String, parameters: StringDictionary[Any]): js.Promise[GraphResultSet] = js.native
  def executeGraph(traversal: String, parameters: StringDictionary[Any], callback: ValueCallback[GraphResultSet]): Unit = js.native
  def executeGraph(traversal: String, parameters: StringDictionary[Any], options: GraphQueryOptions): js.Promise[GraphResultSet] = js.native
  def executeGraph(
    traversal: String,
    parameters: StringDictionary[Any],
    options: GraphQueryOptions,
    callback: ValueCallback[GraphResultSet]
  ): Unit = js.native
  def executeGraph(traversal: String, parameters: Unit, callback: ValueCallback[GraphResultSet]): Unit = js.native
  def executeGraph(traversal: String, parameters: Unit, options: GraphQueryOptions): js.Promise[GraphResultSet] = js.native
  def executeGraph(
    traversal: String,
    parameters: Unit,
    options: GraphQueryOptions,
    callback: ValueCallback[GraphResultSet]
  ): Unit = js.native
  
  def getReplicas(keyspace: String, token: Buffer): js.Array[Host] = js.native
  
  def getState(): ClientState = js.native
  
  var hosts: HostMap = js.native
  
  var keyspace: String = js.native
  
  var metadata: Metadata = js.native
  
  var metrics: ClientMetrics = js.native
  
  def shutdown(): js.Promise[Unit] = js.native
  def shutdown(callback: EmptyCallback): Unit = js.native
  
  def stream(query: String): EventEmitter = js.native
  def stream(query: String, params: Unit, options: Unit, callback: EmptyCallback): EventEmitter = js.native
  def stream(query: String, params: Unit, options: QueryOptions): EventEmitter = js.native
  def stream(query: String, params: Unit, options: QueryOptions, callback: EmptyCallback): EventEmitter = js.native
  def stream(query: String, params: ArrayOrObject): EventEmitter = js.native
  def stream(query: String, params: ArrayOrObject, options: Unit, callback: EmptyCallback): EventEmitter = js.native
  def stream(query: String, params: ArrayOrObject, options: QueryOptions): EventEmitter = js.native
  def stream(query: String, params: ArrayOrObject, options: QueryOptions, callback: EmptyCallback): EventEmitter = js.native
}
