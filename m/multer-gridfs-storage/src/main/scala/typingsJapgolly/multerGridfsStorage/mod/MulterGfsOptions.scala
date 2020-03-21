package typingsJapgolly.multerGridfsStorage.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.Request
import typingsJapgolly.multerGridfsStorage.mod._Global_.Express.Multer.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MulterGfsOptions extends js.Object {
  var file: js.UndefOr[js.Function2[/* req */ Request, /* file */ File, _]] = js.undefined
}

object MulterGfsOptions {
  @scala.inline
  def apply(file: (/* req */ Request, /* file */ File) => CallbackTo[js.Any] = null): MulterGfsOptions = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(js.Any.fromFunction2((t0: /* req */ org.scalajs.dom.experimental.Request, t1: /* file */ typingsJapgolly.multerGridfsStorage.mod._Global_.Express.Multer.File) => file(t0, t1).runNow()))
    __obj.asInstanceOf[MulterGfsOptions]
  }
}

