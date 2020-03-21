package typingsJapgolly.pouchdbReplication

import typingsJapgolly.pouchdbCore.PouchDB.Core.Callback
import typingsJapgolly.pouchdbReplication.PouchDB.Database
import typingsJapgolly.pouchdbReplication.PouchDB.Replication.ReplicateOptions
import typingsJapgolly.pouchdbReplication.PouchDB.Replication.Replication
import typingsJapgolly.pouchdbReplication.PouchDB.Replication.ReplicationResultComplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFrom extends js.Object {
  /**
    * Replicate data from `source`. Both the source and target can be a PouchDB instance
    * or a string representing a CouchDB database URL or the name of a local PouchDB database.
    * If options.live is true, then this will track future changes and also replicate them automatically.
    * This method returns an object with the method cancel(), which you call if you want to cancel live replication.
    */
  def from[Content](source: String): Replication[Content] = js.native
  def from[Content](source: String, options: ReplicateOptions): Replication[Content] = js.native
  def from[Content](source: String, options: ReplicateOptions, callback: Callback[ReplicationResultComplete[Content]]): Replication[Content] = js.native
  def from[Content](source: Database[Content]): Replication[Content] = js.native
  def from[Content](source: Database[Content], options: ReplicateOptions): Replication[Content] = js.native
  def from[Content](
    source: Database[Content],
    options: ReplicateOptions,
    callback: Callback[ReplicationResultComplete[Content]]
  ): Replication[Content] = js.native
  /**
    * Replicate data to `target`. Both the source and target can be a PouchDB instance
    * or a string representing a CouchDB database URL or the name of a local PouchDB database.
    * If options.live is true, then this will track future changes and also replicate them automatically.
    * This method returns an object with the method cancel(), which you call if you want to cancel live replication.
    */
  def to[Content](target: String): Replication[Content] = js.native
  def to[Content](target: String, options: ReplicateOptions): Replication[Content] = js.native
  def to[Content](target: String, options: ReplicateOptions, callback: Callback[ReplicationResultComplete[Content]]): Replication[Content] = js.native
  def to[Content](target: Database[Content]): Replication[Content] = js.native
  def to[Content](target: Database[Content], options: ReplicateOptions): Replication[Content] = js.native
  def to[Content](
    target: Database[Content],
    options: ReplicateOptions,
    callback: Callback[ReplicationResultComplete[Content]]
  ): Replication[Content] = js.native
}

