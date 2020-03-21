package typingsJapgolly.cassandraDriver.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cassandraDriver.AnonQuery
import typingsJapgolly.cassandraDriver.datastaxMod.datastax.graph.GraphResultSet
import typingsJapgolly.cassandraDriver.metadataMod.metadata.ClientState
import typingsJapgolly.cassandraDriver.metadataMod.metadata.Metadata
import typingsJapgolly.cassandraDriver.metricsMod.metrics.ClientMetrics
import typingsJapgolly.cassandraDriver.typesMod.types.ResultSet
import typingsJapgolly.cassandraDriver.typesMod.types.Row
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "Client")
@js.native
class Client protected () extends EventEmitter {
  def this(options: DseClientOptions) = this()
  var hosts: HostMap = js.native
  var keyspace: String = js.native
  var metadata: Metadata = js.native
  var metrics: ClientMetrics = js.native
  def batch(queries: js.Array[String | AnonQuery]): js.Promise[ResultSet] = js.native
  def batch(queries: js.Array[String | AnonQuery], callback: ValueCallback[ResultSet]): Unit = js.native
  def batch(queries: js.Array[String | AnonQuery], options: QueryOptions): js.Promise[ResultSet] = js.native
  def batch(queries: js.Array[String | AnonQuery], options: QueryOptions, callback: ValueCallback[ResultSet]): Unit = js.native
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
  def execute(query: String, params: ArrayOrObject): js.Promise[ResultSet] = js.native
  def execute(query: String, params: ArrayOrObject, callback: ValueCallback[ResultSet]): Unit = js.native
  def execute(query: String, params: ArrayOrObject, options: QueryOptions): js.Promise[ResultSet] = js.native
  def execute(query: String, params: ArrayOrObject, options: QueryOptions, callback: ValueCallback[ResultSet]): Unit = js.native
  def executeGraph(traversal: String): js.Promise[GraphResultSet] = js.native
  def executeGraph(traversal: String, callback: ValueCallback[GraphResultSet]): Unit = js.native
  def executeGraph(traversal: String, parameters: js.UndefOr[scala.Nothing], callback: ValueCallback[GraphResultSet]): Unit = js.native
  def executeGraph(
    traversal: String,
    parameters: js.UndefOr[scala.Nothing],
    options: GraphQueryOptions,
    callback: ValueCallback[GraphResultSet]
  ): Unit = js.native
  def executeGraph(traversal: String, parameters: StringDictionary[js.Any]): js.Promise[GraphResultSet] = js.native
  def executeGraph(traversal: String, parameters: StringDictionary[js.Any], callback: ValueCallback[GraphResultSet]): Unit = js.native
  def executeGraph(traversal: String, parameters: StringDictionary[js.Any], options: GraphQueryOptions): js.Promise[GraphResultSet] = js.native
  def executeGraph(
    traversal: String,
    parameters: StringDictionary[js.Any],
    options: GraphQueryOptions,
    callback: ValueCallback[GraphResultSet]
  ): Unit = js.native
  def getReplicas(keyspace: String, token: Buffer): js.Array[Host] = js.native
  def getState(): ClientState = js.native
  def shutdown(): js.Promise[Unit] = js.native
  def shutdown(callback: EmptyCallback): Unit = js.native
  def stream(query: String): EventEmitter = js.native
  def stream(query: String, params: ArrayOrObject): EventEmitter = js.native
  def stream(query: String, params: ArrayOrObject, options: QueryOptions): EventEmitter = js.native
  def stream(query: String, params: ArrayOrObject, options: QueryOptions, callback: EmptyCallback): EventEmitter = js.native
}

