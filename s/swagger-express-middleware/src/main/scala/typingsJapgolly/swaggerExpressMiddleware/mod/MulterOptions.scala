package typingsJapgolly.swaggerExpressMiddleware.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.swaggerExpressMiddleware.AnonFieldNameSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MulterOptions extends js.Object {
  /** The destination directory for the uploaded files. */
  var dest: js.UndefOr[String] = js.undefined
  /** A function to control which files to upload and which to skip. */
  var fileFilter: js.UndefOr[
    js.Function3[
      /* req */ Request_[ParamsDictionary], 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Error, /* acceptFile */ Boolean, Unit], 
      Unit
    ]
  ] = js.undefined
  /** An object specifying the size limits of the following optional properties. This object is passed to busboy directly, and the details of properties can be found on https://github.com/mscdex/busboy#busboy-methods */
  var limits: js.UndefOr[AnonFieldNameSize] = js.undefined
  /** The storage engine to use for uploaded files. */
  var storage: js.UndefOr[StorageEngine] = js.undefined
}

object MulterOptions {
  @scala.inline
  def apply(
    dest: String = null,
    fileFilter: (/* req */ Request_[ParamsDictionary], /* file */ File, /* callback */ js.Function2[/* error */ js.Error, /* acceptFile */ Boolean, Unit]) => Callback = null,
    limits: AnonFieldNameSize = null,
    storage: StorageEngine = null
  ): MulterOptions = {
    val __obj = js.Dynamic.literal()
    if (dest != null) __obj.updateDynamic("dest")(dest.asInstanceOf[js.Any])
    if (fileFilter != null) __obj.updateDynamic("fileFilter")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: /* file */ typingsJapgolly.swaggerExpressMiddleware.mod.File, t2: /* callback */ js.Function2[/* error */ js.Error, /* acceptFile */ scala.Boolean, scala.Unit]) => fileFilter(t0, t1, t2).runNow()))
    if (limits != null) __obj.updateDynamic("limits")(limits.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MulterOptions]
  }
}

