package typingsJapgolly.hexoFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "copyDir")
@js.native
object copyDir extends js.Object {
  def apply(src: String, dest: String): typingsJapgolly.bluebird.mod.^[js.Array[String]] = js.native
  def apply(
    src: String,
    dest: String,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typingsJapgolly.bluebird.mod.^[js.Array[String]] = js.native
  def apply(src: String, dest: String, options: DirectoryOptions): typingsJapgolly.bluebird.mod.^[js.Array[String]] = js.native
  def apply(
    src: String,
    dest: String,
    options: DirectoryOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[js.Array[String]], Unit]
  ): typingsJapgolly.bluebird.mod.^[js.Array[String]] = js.native
}

