package typingsJapgolly.fsExtraPromise.mod

import typingsJapgolly.fsExtra.mod.EnsureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "ensureDir")
@js.native
object ensureDir extends js.Object {
  def apply(path: String): Unit = js.native
  def apply(path: String, options: Double): Unit = js.native
  def apply(path: String, options: Double, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def apply(path: String, options: EnsureOptions): Unit = js.native
  def apply(path: String, options: EnsureOptions, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

