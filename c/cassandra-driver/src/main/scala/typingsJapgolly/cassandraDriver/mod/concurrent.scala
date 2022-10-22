package typingsJapgolly.cassandraDriver.mod

import typingsJapgolly.cassandraDriver.anon.Query
import typingsJapgolly.cassandraDriver.libConcurrentMod.concurrent.Options
import typingsJapgolly.cassandraDriver.libConcurrentMod.concurrent.ResultSetGroup
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concurrent {
  
  @JSImport("cassandra-driver", "concurrent")
  @js.native
  val ^ : js.Any = js.native
  
  inline def executeConcurrent(client: Client, queries: js.Array[Query]): js.Promise[ResultSetGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeConcurrent")(client.asInstanceOf[js.Any], queries.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultSetGroup]]
  inline def executeConcurrent(client: Client, queries: js.Array[Query], options: Options): js.Promise[ResultSetGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeConcurrent")(client.asInstanceOf[js.Any], queries.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultSetGroup]]
  inline def executeConcurrent(client: Client, query: String, parameters: js.Array[js.Array[Any]]): js.Promise[ResultSetGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeConcurrent")(client.asInstanceOf[js.Any], query.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultSetGroup]]
  inline def executeConcurrent(client: Client, query: String, parameters: js.Array[js.Array[Any]], options: Options): js.Promise[ResultSetGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeConcurrent")(client.asInstanceOf[js.Any], query.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultSetGroup]]
  inline def executeConcurrent(client: Client, query: String, parameters: Readable): js.Promise[ResultSetGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeConcurrent")(client.asInstanceOf[js.Any], query.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultSetGroup]]
  inline def executeConcurrent(client: Client, query: String, parameters: Readable, options: Options): js.Promise[ResultSetGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeConcurrent")(client.asInstanceOf[js.Any], query.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultSetGroup]]
}
