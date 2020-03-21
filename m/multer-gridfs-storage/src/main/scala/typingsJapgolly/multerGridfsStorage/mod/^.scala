package typingsJapgolly.multerGridfsStorage.mod

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.multer.PartialFile
import typingsJapgolly.multer.mod._Global_.Express.Multer.File
import typingsJapgolly.multerGridfsStorage.AnonFilename
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("multer-gridfs-storage", JSImport.Namespace)
@js.native
class ^ protected () extends MulterGridfsStorage {
  def this(configuration: DbStorageOptions) = this()
  def this(configuration: UrlStorageOptions) = this()
  /**
    * Store the file described by `file`, then invoke the callback with
    * information about the stored file.
    *
    * File contents are available as a stream via `file.stream`. Information
    * passed to the callback will be merged with `file` for subsequent
    * middleware.
    *
    * @param req The Express `Request` object.
    * @param file Object with `stream`, `fieldname`, `originalname`, `encoding`, and `mimetype` defined.
    * @param callback Callback to specify file information.
    */
  /* CompleteClass */
  override def _handleFile(
    req: Request_[ParamsDictionary],
    file: File,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[PartialFile], Unit]
  ): Unit = js.native
  /**
    * Remove the file described by `file`, then invoke the callback with.
    *
    * `file` contains all the properties available to `_handleFile`, as
    * well as those returned by `_handleFile`.
    *
    * @param req The Express `Request` object.
    * @param file Object containing information about the processed file.
    * @param callback Callback to indicate completion.
    */
  /* CompleteClass */
  override def _removeFile(req: Request_[ParamsDictionary], file: File, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
}

@JSImport("multer-gridfs-storage", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var cache: Cache = js.native
  def generateBytes(): js.Promise[AnonFilename] = js.native
}

