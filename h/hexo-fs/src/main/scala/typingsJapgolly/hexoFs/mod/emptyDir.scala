package typingsJapgolly.hexoFs.mod

import typingsJapgolly.hexoFs.DirectoryOptionsexcludeAr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "emptyDir")
@js.native
object emptyDir extends js.Object {
  def apply(path: String): typingsJapgolly.bluebird.mod.^[String | js.Array[String]] = js.native
  def apply(
    path: String,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String | js.Array[String]], Unit]
  ): typingsJapgolly.bluebird.mod.^[String | js.Array[String]] = js.native
  def apply(path: String, options: DirectoryOptionsexcludeAr): typingsJapgolly.bluebird.mod.^[String | js.Array[String]] = js.native
  def apply(
    path: String,
    options: DirectoryOptionsexcludeAr,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String | js.Array[String]], Unit]
  ): typingsJapgolly.bluebird.mod.^[String | js.Array[String]] = js.native
}

