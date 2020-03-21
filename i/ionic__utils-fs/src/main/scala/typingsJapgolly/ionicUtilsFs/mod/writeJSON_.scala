package typingsJapgolly.ionicUtilsFs.mod

import typingsJapgolly.fsExtra.mod.WriteOptions
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", "writeJSON")
@js.native
object writeJSON_ extends js.Object {
  def apply(file: String, `object`: js.Any): js.Promise[Unit] = js.native
  def apply(file: String, `object`: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(file: String, `object`: js.Any, options: WriteOptions): js.Promise[Unit] = js.native
  def apply(
    file: String,
    `object`: js.Any,
    options: WriteOptions,
    callback: js.Function1[/* err */ js.Error, Unit]
  ): Unit = js.native
}

