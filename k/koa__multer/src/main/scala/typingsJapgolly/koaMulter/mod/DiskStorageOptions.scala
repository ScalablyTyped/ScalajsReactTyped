package typingsJapgolly.koaMulter.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskStorageOptions extends js.Object {
  /** A function used to determine within which folder the uploaded files should be stored. Defaults to the system's default temporary directory. */
  var destination: js.UndefOr[
    String | (js.Function3[
      /* req */ IncomingMessage, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Error | Null, /* destination */ String, Unit], 
      Unit
    ])
  ] = js.undefined
  /** A function used to determine what the file should be named inside the folder. Defaults to a random name with no file extension. */
  var filename: js.UndefOr[
    js.Function3[
      /* req */ IncomingMessage, 
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
      /* req */ IncomingMessage, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Error | Null, /* destination */ String, Unit], 
      Unit
    ]) = null,
    filename: (/* req */ IncomingMessage, /* file */ File, /* callback */ js.Function2[/* error */ js.Error | Null, /* filename */ String, Unit]) => Callback = null
  ): DiskStorageOptions = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.node.httpMod.IncomingMessage, t1: /* file */ typingsJapgolly.koaMulter.mod.File, t2: /* callback */ js.Function2[/* error */ js.Error | scala.Null, /* filename */ java.lang.String, scala.Unit]) => filename(t0, t1, t2).runNow()))
    __obj.asInstanceOf[DiskStorageOptions]
  }
}

