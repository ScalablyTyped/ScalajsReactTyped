package typingsJapgolly.mongodb.mod

import typingsJapgolly.mongodb.AnonEnd
import typingsJapgolly.mongodb.AnonRevision
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "GridFSBucket")
@js.native
class GridFSBucket protected () extends js.Object {
  def this(db: Db) = this()
  def this(db: Db, options: GridFSBucketOptions) = this()
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/GridFSBucket.html#delete */
  def delete(id: typingsJapgolly.bson.mod.ObjectId): Unit = js.native
  def delete(id: typingsJapgolly.bson.mod.ObjectId, callback: GridFSBucketErrorCallback): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/GridFSBucket.html#drop */
  def drop(): Unit = js.native
  def drop(callback: GridFSBucketErrorCallback): Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/GridFSBucket.html#find */
  def find(): Cursor[_] = js.native
  def find(filter: js.Object): Cursor[_] = js.native
  def find(filter: js.Object, options: GridFSBucketFindOptions): Cursor[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/GridFSBucket.html#openDownloadStream */
  def openDownloadStream(id: typingsJapgolly.bson.mod.ObjectId): GridFSBucketReadStream = js.native
  def openDownloadStream(id: typingsJapgolly.bson.mod.ObjectId, options: AnonEnd): GridFSBucketReadStream = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/GridFSBucket.html#openDownloadStreamByName */
  def openDownloadStreamByName(filename: String): GridFSBucketReadStream = js.native
  def openDownloadStreamByName(filename: String, options: AnonRevision): GridFSBucketReadStream = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/GridFSBucket.html#openUploadStream */
  def openUploadStream(filename: String): GridFSBucketWriteStream = js.native
  def openUploadStream(filename: String, options: GridFSBucketOpenUploadStreamOptions): GridFSBucketWriteStream = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/GridFSBucket.html#openUploadStreamWithId */
  def openUploadStreamWithId(id: GridFSBucketWriteStreamId, filename: String): GridFSBucketWriteStream = js.native
  def openUploadStreamWithId(id: GridFSBucketWriteStreamId, filename: String, options: GridFSBucketOpenUploadStreamOptions): GridFSBucketWriteStream = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/GridFSBucket.html#rename */
  def rename(id: typingsJapgolly.bson.mod.ObjectId, filename: String): Unit = js.native
  def rename(id: typingsJapgolly.bson.mod.ObjectId, filename: String, callback: GridFSBucketErrorCallback): Unit = js.native
}

