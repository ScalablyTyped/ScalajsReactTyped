package typingsJapgolly.hexoFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "appendFile")
@js.native
object appendFile extends js.Object {
  def apply(path: String, data: js.Any): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def apply(path: String, data: js.Any, callback: js.Function1[/* err */ js.Any, Unit]): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def apply(path: String, data: js.Any, options: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def apply(path: String, data: js.Any, options: String, callback: js.Function1[/* err */ js.Any, Unit]): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def apply(path: String, data: js.Any, options: AppendFileOptions): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def apply(
    path: String,
    data: js.Any,
    options: AppendFileOptions,
    callback: js.Function1[/* err */ js.Any, Unit]
  ): typingsJapgolly.bluebird.mod.^[Unit] = js.native
}

