package typingsJapgolly.uploadcare

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.fsMod.ReadStream
import typingsJapgolly.uploadcare.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromUrl extends js.Object {
  def fromUrl(url: String, options: AnonStore, callback: js.Function2[/* err */ js.Error, /* res */ File, Unit]): Unit
  def upload(
    readStream: ReadStream,
    options: AnonStore,
    callback: js.Function2[/* err */ js.Error, /* res */ AnonFile, Unit]
  ): Unit
}

object AnonFromUrl {
  @scala.inline
  def apply(
    fromUrl: (String, AnonStore, js.Function2[/* err */ js.Error, /* res */ File, Unit]) => Callback,
    upload: (ReadStream, AnonStore, js.Function2[/* err */ js.Error, /* res */ AnonFile, Unit]) => Callback
  ): AnonFromUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromUrl")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.uploadcare.AnonStore, t2: js.Function2[/* err */ js.Error, /* res */ typingsJapgolly.uploadcare.mod.File, scala.Unit]) => fromUrl(t0, t1, t2).runNow()))
    __obj.updateDynamic("upload")(js.Any.fromFunction3((t0: typingsJapgolly.node.fsMod.ReadStream, t1: typingsJapgolly.uploadcare.AnonStore, t2: js.Function2[/* err */ js.Error, /* res */ typingsJapgolly.uploadcare.AnonFile, scala.Unit]) => upload(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonFromUrl]
  }
}

