package typingsJapgolly.fsExtraPromiseEs6.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise-es6", "writeJson")
@js.native
object writeJson extends js.Object {
  def apply(file: String, `object`: js.Any): Unit = js.native
  def apply(file: String, `object`: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(file: String, `object`: js.Any, options: OpenOptions): Unit = js.native
  def apply(
    file: String,
    `object`: js.Any,
    options: OpenOptions,
    callback: js.Function1[/* err */ js.Error, Unit]
  ): Unit = js.native
}

