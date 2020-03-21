package typingsJapgolly.datastoreLevel.mod

import typingsJapgolly.abstractLeveldown.mod.AbstractIterator
import typingsJapgolly.abstractLeveldown.mod.AbstractLevelDOWN
import typingsJapgolly.interfaceDatastore.mod.Batch
import typingsJapgolly.interfaceDatastore.mod.Key
import typingsJapgolly.interfaceDatastore.mod.Query
import typingsJapgolly.interfaceDatastore.mod.Result
import typingsJapgolly.levelup.mod.LevelUp
import typingsJapgolly.node.Buffer
import typingsJapgolly.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("datastore-level", JSImport.Default)
@js.native
class defaultCls protected () extends LevelDatastore[Buffer] {
  def this(path: String) = this()
  def this(path: String, options: LevelDatastoreOptions) = this()
  /* CompleteClass */
  override var db: LevelUp[AbstractLevelDOWN[String, Buffer], AbstractIterator[String, Buffer]] = js.native
  /* CompleteClass */
  override def batch(): Batch[Buffer] = js.native
  /* CompleteClass */
  override def close(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def delete(key: Key): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def get(key: Key): js.Promise[Buffer] = js.native
  /* CompleteClass */
  override def has(key: Key): js.Promise[Boolean] = js.native
  /* CompleteClass */
  override def open(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def put(key: Key, `val`: Buffer): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def query(q: Query[Buffer]): AsyncIterable[Result[Buffer]] = js.native
}

