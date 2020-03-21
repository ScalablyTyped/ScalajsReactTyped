package typingsJapgolly.serveHandler.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.serveHandler.FnCall
import typingsJapgolly.serveHandler.Typeoflstat
import typingsJapgolly.serveHandler.Typeofreaddir
import typingsJapgolly.serveHandler.Typeofrealpath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  var createReadStream: js.UndefOr[FnCall] = js.undefined
  var lstat: js.UndefOr[Typeoflstat] = js.undefined
  var readdir: js.UndefOr[Typeofreaddir] = js.undefined
  var realpath: js.UndefOr[Typeofrealpath] = js.undefined
  var sendError: js.UndefOr[SendErrorHandler] = js.undefined
}

object Methods {
  @scala.inline
  def apply(
    createReadStream: FnCall = null,
    lstat: Typeoflstat = null,
    readdir: Typeofreaddir = null,
    realpath: Typeofrealpath = null,
    sendError: (/* absolutePath */ js.UndefOr[String], /* response */ js.UndefOr[ServerResponse], /* acceptsJSON */ js.UndefOr[Boolean], /* current */ js.UndefOr[String], /* handlers */ js.UndefOr[Methods], /* config */ js.UndefOr[Config], /* spec */ js.UndefOr[js.Any]) => CallbackTo[js.Promise[Unit]] = null
  ): Methods = {
    val __obj = js.Dynamic.literal()
    if (createReadStream != null) __obj.updateDynamic("createReadStream")(createReadStream.asInstanceOf[js.Any])
    if (lstat != null) __obj.updateDynamic("lstat")(lstat.asInstanceOf[js.Any])
    if (readdir != null) __obj.updateDynamic("readdir")(readdir.asInstanceOf[js.Any])
    if (realpath != null) __obj.updateDynamic("realpath")(realpath.asInstanceOf[js.Any])
    if (sendError != null) __obj.updateDynamic("sendError")(js.Any.fromFunction7((t0: /* absolutePath */ js.UndefOr[java.lang.String], t1: /* response */ js.UndefOr[typingsJapgolly.node.httpMod.ServerResponse], t2: /* acceptsJSON */ js.UndefOr[scala.Boolean], t3: /* current */ js.UndefOr[java.lang.String], t4: /* handlers */ js.UndefOr[typingsJapgolly.serveHandler.mod.Methods], t5: /* config */ js.UndefOr[typingsJapgolly.serveHandler.mod.Config], t6: /* spec */ js.UndefOr[js.Any]) => sendError(t0, t1, t2, t3, t4, t5, t6).runNow()))
    __obj.asInstanceOf[Methods]
  }
}

