package typingsJapgolly.multer.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.multer.mod._Global_.Express.Multer.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskStorageOptions extends js.Object {
  /**
    * A string or function that determines the destination path for uploaded
    * files. If a string is passed and the directory does not exist, Multer
    * attempts to create it recursively. If neither a string or a function
    * is passed, the destination defaults to `os.tmpdir()`.
    *
    * @param req The Express `Request` object.
    * @param file Object containing information about the processed file.
    * @param callback Callback to determine the destination path.
    */
  var destination: js.UndefOr[
    String | (js.Function3[
      /* req */ Request_[ParamsDictionary], 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Error | Null, /* destination */ String, Unit], 
      Unit
    ])
  ] = js.undefined
  /**
    * A function that determines the name of the uploaded file. If nothing
    * is passed, Multer will generate a 32 character pseudorandom hex string
    * with no extension.
    *
    * @param req The Express `Request` object.
    * @param file Object containing information about the processed file.
    * @param callback Callback to determine the name of the uploaded file.
    */
  var filename: js.UndefOr[
    js.Function3[
      /* req */ Request_[ParamsDictionary], 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Error | Null, /* filename */ String, Unit], 
      Unit
    ]
  ] = js.undefined
}

object DiskStorageOptions {
  @scala.inline
  def apply(
    destination: String | (js.Function3[
      /* req */ Request_[ParamsDictionary], 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Error | Null, /* destination */ String, Unit], 
      Unit
    ]) = null,
    filename: (/* req */ Request_[ParamsDictionary], /* file */ File, /* callback */ js.Function2[/* error */ js.Error | Null, /* filename */ String, Unit]) => Callback = null
  ): DiskStorageOptions = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: /* file */ typingsJapgolly.multer.mod._Global_.Express.Multer.File, t2: /* callback */ js.Function2[/* error */ js.Error | scala.Null, /* filename */ java.lang.String, scala.Unit]) => filename(t0, t1, t2).runNow()))
    __obj.asInstanceOf[DiskStorageOptions]
  }
}

