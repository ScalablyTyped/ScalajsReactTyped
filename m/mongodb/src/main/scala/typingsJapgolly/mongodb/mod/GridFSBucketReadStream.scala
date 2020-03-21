package typingsJapgolly.mongodb.mod

import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "GridFSBucketReadStream")
@js.native
class GridFSBucketReadStream protected () extends Readable {
  def this(chunks: Collection[_], files: Collection[_], readPreference: js.Object, filter: js.Object) = this()
  def this(
    chunks: Collection[_],
    files: Collection[_],
    readPreference: js.Object,
    filter: js.Object,
    options: GridFSBucketReadStreamOptions
  ) = this()
  var id: typingsJapgolly.bson.mod.ObjectId = js.native
}

