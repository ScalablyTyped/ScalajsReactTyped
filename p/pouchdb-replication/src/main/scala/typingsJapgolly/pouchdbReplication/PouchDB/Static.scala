package typingsJapgolly.pouchdbReplication.PouchDB

import typingsJapgolly.pouchdbCore.PouchDB.Core.Callback
import typingsJapgolly.pouchdbReplication.PouchDB.Replication.ReplicateOptions
import typingsJapgolly.pouchdbReplication.PouchDB.Replication.ReplicationResultComplete
import typingsJapgolly.pouchdbReplication.PouchDB.Replication.Sync
import typingsJapgolly.pouchdbReplication.PouchDB.Replication.SyncOptions
import typingsJapgolly.pouchdbReplication.PouchDB.Replication.SyncResultComplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  /**
    * Replicate data from source to target. Both the source and target can be a PouchDB instance or a string
    * representing a CouchDB database URL or the name of a local PouchDB database. If options.live is true,
    * then this will track future changes and also replicate them automatically.
    * This method returns an object with the method cancel(), which you call if you want to cancel live replication.
    */
  def replicate[Content](source: String, target: String): typingsJapgolly.pouchdbReplication.PouchDB.Replication.Replication[Content] = js.native
  def replicate[Content](source: String, target: String, options: ReplicateOptions): typingsJapgolly.pouchdbReplication.PouchDB.Replication.Replication[Content] = js.native
  def replicate[Content](
    source: String,
    target: String,
    options: ReplicateOptions,
    callback: Callback[ReplicationResultComplete[Content]]
  ): typingsJapgolly.pouchdbReplication.PouchDB.Replication.Replication[Content] = js.native
  def replicate[Content](source: String, target: Database[Content]): typingsJapgolly.pouchdbReplication.PouchDB.Replication.Replication[Content] = js.native
  def replicate[Content](source: String, target: Database[Content], options: ReplicateOptions): typingsJapgolly.pouchdbReplication.PouchDB.Replication.Replication[Content] = js.native
  def replicate[Content](
    source: String,
    target: Database[Content],
    options: ReplicateOptions,
    callback: Callback[ReplicationResultComplete[Content]]
  ): typingsJapgolly.pouchdbReplication.PouchDB.Replication.Replication[Content] = js.native
  def replicate[Content](source: Database[Content], target: String): typingsJapgolly.pouchdbReplication.PouchDB.Replication.Replication[Content] = js.native
  def replicate[Content](source: Database[Content], target: String, options: ReplicateOptions): typingsJapgolly.pouchdbReplication.PouchDB.Replication.Replication[Content] = js.native
  def replicate[Content](
    source: Database[Content],
    target: String,
    options: ReplicateOptions,
    callback: Callback[ReplicationResultComplete[Content]]
  ): typingsJapgolly.pouchdbReplication.PouchDB.Replication.Replication[Content] = js.native
  def replicate[Content](source: Database[Content], target: Database[Content]): typingsJapgolly.pouchdbReplication.PouchDB.Replication.Replication[Content] = js.native
  def replicate[Content](source: Database[Content], target: Database[Content], options: ReplicateOptions): typingsJapgolly.pouchdbReplication.PouchDB.Replication.Replication[Content] = js.native
  def replicate[Content](
    source: Database[Content],
    target: Database[Content],
    options: ReplicateOptions,
    callback: Callback[ReplicationResultComplete[Content]]
  ): typingsJapgolly.pouchdbReplication.PouchDB.Replication.Replication[Content] = js.native
  /**
    * Sync data from src to target and target to src. This is a convenience method for bidirectional data replication.
    *
    * In other words, this code:
    * `PouchDB.replicate('mydb', 'http://localhost:5984/mydb')`;
    * `PouchDB.replicate('http://localhost:5984/mydb', 'mydb')`;
    * is equivalent to this code:
    * `PouchDB.sync('mydb', 'http://localhost:5984/mydb')`;
    */
  def sync[Content](source: String, target: String): Sync[Content] = js.native
  def sync[Content](source: String, target: String, options: SyncOptions): Sync[Content] = js.native
  def sync[Content](
    source: String,
    target: String,
    options: SyncOptions,
    callback: Callback[SyncResultComplete[Content]]
  ): Sync[Content] = js.native
  def sync[Content](source: String, target: Database[Content]): Sync[Content] = js.native
  def sync[Content](source: String, target: Database[Content], options: SyncOptions): Sync[Content] = js.native
  def sync[Content](
    source: String,
    target: Database[Content],
    options: SyncOptions,
    callback: Callback[SyncResultComplete[Content]]
  ): Sync[Content] = js.native
  def sync[Content](source: Database[Content], target: String): Sync[Content] = js.native
  def sync[Content](source: Database[Content], target: String, options: SyncOptions): Sync[Content] = js.native
  def sync[Content](
    source: Database[Content],
    target: String,
    options: SyncOptions,
    callback: Callback[SyncResultComplete[Content]]
  ): Sync[Content] = js.native
  def sync[Content](source: Database[Content], target: Database[Content]): Sync[Content] = js.native
  def sync[Content](source: Database[Content], target: Database[Content], options: SyncOptions): Sync[Content] = js.native
  def sync[Content](
    source: Database[Content],
    target: Database[Content],
    options: SyncOptions,
    callback: Callback[SyncResultComplete[Content]]
  ): Sync[Content] = js.native
}

