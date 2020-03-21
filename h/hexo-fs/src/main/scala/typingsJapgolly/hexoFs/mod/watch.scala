package typingsJapgolly.hexoFs.mod

import typingsJapgolly.chokidar.mod.FSWatcher
import typingsJapgolly.chokidar.mod.WatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "watch")
@js.native
object watch extends js.Object {
  def apply(path: String): typingsJapgolly.bluebird.mod.^[FSWatcher] = js.native
  def apply(path: String, options: WatchOptions): typingsJapgolly.bluebird.mod.^[FSWatcher] = js.native
  def apply(
    path: String,
    options: WatchOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[FSWatcher], Unit]
  ): typingsJapgolly.bluebird.mod.^[FSWatcher] = js.native
  def apply(path: js.Array[String]): typingsJapgolly.bluebird.mod.^[FSWatcher] = js.native
  def apply(path: js.Array[String], options: WatchOptions): typingsJapgolly.bluebird.mod.^[FSWatcher] = js.native
  def apply(
    path: js.Array[String],
    options: WatchOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[FSWatcher], Unit]
  ): typingsJapgolly.bluebird.mod.^[FSWatcher] = js.native
}

