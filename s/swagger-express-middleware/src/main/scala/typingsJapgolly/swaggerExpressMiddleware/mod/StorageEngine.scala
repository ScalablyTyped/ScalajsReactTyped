package typingsJapgolly.swaggerExpressMiddleware.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageEngine extends js.Object {
  def _handleFile(
    req: Request_[ParamsDictionary],
    file: File,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[File], Unit]
  ): Unit
  def _removeFile(req: Request_[ParamsDictionary], file: File, callback: js.Function1[/* error */ js.Error, Unit]): Unit
}

object StorageEngine {
  @scala.inline
  def apply(
    _handleFile: (Request_[ParamsDictionary], File, js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[File], Unit]) => Callback,
    _removeFile: (Request_[ParamsDictionary], File, js.Function1[/* error */ js.Error, Unit]) => Callback
  ): StorageEngine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_handleFile")(js.Any.fromFunction3((t0: typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: typingsJapgolly.swaggerExpressMiddleware.mod.File, t2: js.Function2[
  /* error */ js.UndefOr[js.Any], 
  /* info */ js.UndefOr[typingsJapgolly.swaggerExpressMiddleware.mod.File], 
  scala.Unit]) => _handleFile(t0, t1, t2).runNow()))
    __obj.updateDynamic("_removeFile")(js.Any.fromFunction3((t0: typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: typingsJapgolly.swaggerExpressMiddleware.mod.File, t2: js.Function1[/* error */ js.Error, scala.Unit]) => _removeFile(t0, t1, t2).runNow()))
    __obj.asInstanceOf[StorageEngine]
  }
}

