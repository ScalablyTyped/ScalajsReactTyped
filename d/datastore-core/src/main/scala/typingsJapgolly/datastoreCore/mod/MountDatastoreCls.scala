package typingsJapgolly.datastoreCore.mod

import typingsJapgolly.interfaceDatastore.mod.Batch
import typingsJapgolly.interfaceDatastore.mod.Key
import typingsJapgolly.interfaceDatastore.mod.Query
import typingsJapgolly.interfaceDatastore.mod.Result
import typingsJapgolly.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("datastore-core", "MountDatastore")
@js.native
class MountDatastoreCls protected () extends MountDatastore {
  def this(mounts: js.Array[Mount[_]]) = this()
  /* CompleteClass */
  override var mounts: js.Array[Mount[_]] = js.native
  /* CompleteClass */
  override def batch(): Batch[js.Any] = js.native
  /* CompleteClass */
  override def close(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def delete(key: Key): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def get(key: Key): js.Promise[js.Any] = js.native
  /* CompleteClass */
  override def has(key: Key): js.Promise[Boolean] = js.native
  /* CompleteClass */
  override def open(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def put(key: Key, `val`: js.Any): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def query(q: Query[js.Any]): AsyncIterable[Result[js.Any]] = js.native
}

