package typingsJapgolly.datastoreCore.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.datastoreCore.mod.shard.Shard
import typingsJapgolly.interfaceDatastore.mod.Datastore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShardingDatastore[Value] extends Datastore[Value] {
  var child: KeytransformDatastore[Value]
  var shard: Shard
}

@JSImport("datastore-core", "ShardingDatastore")
@js.native
object ShardingDatastore extends TopLevel[ShardingDatastoreConstructor]

