package typingsJapgolly.multer.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.multer.AnonFieldNameSize
import typingsJapgolly.multer.mod._Global_.Express.Multer.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for initializing a Multer instance. */
trait Options extends js.Object {
  /**
    * The destination directory for uploaded files. If `storage` is not set
    * and `dest` is, Multer will create a `DiskStorage` instance configured
    * to store files at `dest` with random filenames.
    *
    * Ignored if `storage` is set.
    */
  var dest: js.UndefOr[String] = js.undefined
  /**
    * Optional function to control which files are uploaded. This is called
    * for every file that is processed.
    *
    * @param req The Express `Request` object.
    * @param file Object containing information about the processed file.
    * @param callback  a function to control which files should be uploaded and which should be skipped.
    */
  var fileFilter: js.UndefOr[
    js.Function3[
      /* req */ Request_[ParamsDictionary], 
      /* file */ File, 
      /* callback */ FileFilterCallback, 
      Unit
    ]
  ] = js.undefined
  /**
    * An object specifying various limits on incoming data. This object is
    * passed to Busboy directly, and the details of properties can be found
    * at https://github.com/mscdex/busboy#busboy-methods.
    */
  var limits: js.UndefOr[AnonFieldNameSize] = js.undefined
  /** Preserve the full path of the original filename rather than the basename. (Default: false) */
  var preservePath: js.UndefOr[Boolean] = js.undefined
  /**
    * A `StorageEngine` responsible for processing files uploaded via Multer.
    * Takes precedence over `dest`.
    */
  var storage: js.UndefOr[StorageEngine] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dest: String = null,
    fileFilter: (/* req */ Request_[ParamsDictionary], /* file */ File, /* callback */ FileFilterCallback) => Callback = null,
    limits: AnonFieldNameSize = null,
    preservePath: js.UndefOr[Boolean] = js.undefined,
    storage: StorageEngine = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (dest != null) __obj.updateDynamic("dest")(dest.asInstanceOf[js.Any])
    if (fileFilter != null) __obj.updateDynamic("fileFilter")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: /* file */ typingsJapgolly.multer.mod._Global_.Express.Multer.File, t2: /* callback */ typingsJapgolly.multer.mod.FileFilterCallback) => fileFilter(t0, t1, t2).runNow()))
    if (limits != null) __obj.updateDynamic("limits")(limits.asInstanceOf[js.Any])
    if (!js.isUndefined(preservePath)) __obj.updateDynamic("preservePath")(preservePath.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

