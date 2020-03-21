package typingsJapgolly.gridfsStream.mod

import typingsJapgolly.gridfsStream.mod.GridFSStream.Options
import typingsJapgolly.gridfsStream.mod.GridFSStream.ReadStream
import typingsJapgolly.gridfsStream.mod.GridFSStream.WriteStream
import typingsJapgolly.mongodb.mod.Collection
import typingsJapgolly.mongodb.mod.DefaultSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gridfs-stream", "Grid")
@js.native
class Grid () extends js.Object {
  var curCol: String = js.native
  var files: Collection[DefaultSchema] = js.native
  def collection(): Collection[DefaultSchema] = js.native
  def collection(name: String): Collection[DefaultSchema] = js.native
  def createReadStream(): ReadStream = js.native
  def createReadStream(options: String): ReadStream = js.native
  def createReadStream(options: Options): ReadStream = js.native
  def createWriteStream(): WriteStream = js.native
  def createWriteStream(options: String): WriteStream = js.native
  def createWriteStream(options: Options): WriteStream = js.native
  def exist(options: Options, callback: js.Function2[/* err */ js.Error, /* found */ Boolean, Unit]): Unit = js.native
  def findOne(options: Options, callback: js.Function2[/* err */ js.Error, /* record */ js.Any, Unit]): Unit = js.native
  def remove(options: Options, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

