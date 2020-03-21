package typingsJapgolly.koaMulter.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.koaMulter.AnonFieldNameSize
import typingsJapgolly.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** The destination directory for the uploaded files. */
  var dest: js.UndefOr[String] = js.undefined
  /** A function to control which files to upload and which to skip. */
  var fileFilter: js.UndefOr[
    js.Function3[
      /* req */ IncomingMessage, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Error | Null, /* acceptFile */ Boolean, Unit], 
      Unit
    ]
  ] = js.undefined
  /**
    * An object specifying the size limits of the following optional properties. This object is passed to busboy
    * directly, and the details of properties can be found on https://github.com/mscdex/busboy#busboy-methods
    */
  var limits: js.UndefOr[AnonFieldNameSize] = js.undefined
  /** The storage engine to use for uploaded files. */
  var storage: js.UndefOr[StorageEngine] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dest: String = null,
    fileFilter: (/* req */ IncomingMessage, /* file */ File, /* callback */ js.Function2[/* error */ js.Error | Null, /* acceptFile */ Boolean, Unit]) => Callback = null,
    limits: AnonFieldNameSize = null,
    storage: StorageEngine = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (dest != null) __obj.updateDynamic("dest")(dest.asInstanceOf[js.Any])
    if (fileFilter != null) __obj.updateDynamic("fileFilter")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.node.httpMod.IncomingMessage, t1: /* file */ typingsJapgolly.koaMulter.mod.File, t2: /* callback */ js.Function2[/* error */ js.Error | scala.Null, /* acceptFile */ scala.Boolean, scala.Unit]) => fileFilter(t0, t1, t2).runNow()))
    if (limits != null) __obj.updateDynamic("limits")(limits.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

