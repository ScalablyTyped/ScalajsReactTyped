package typingsJapgolly.pouchdbReplication.PouchDB.Replication

import typingsJapgolly.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sync[Content /* <: js.Object */]
  extends ReplicationEventEmitter[Content, SyncResult[Content], SyncResultComplete[Content]]
     with Promise[SyncResultComplete[Content]]

