package typingsJapgolly.fsExtraPromiseEs6.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise-es6", "realpath")
@js.native
object realpath extends js.Object {
  def apply(path: String): Unit = js.native
  def apply(
    path: String,
    cache: String,
    callback: js.Function2[/* err */ js.Error, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  def apply(path: String, callback: js.Function2[/* err */ Error, /* resolvedPath */ String, Unit]): Unit = js.native
}

