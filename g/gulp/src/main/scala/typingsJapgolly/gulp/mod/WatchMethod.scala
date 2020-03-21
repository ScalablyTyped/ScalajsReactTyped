package typingsJapgolly.gulp.mod

import typingsJapgolly.node.fsMod.FSWatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchMethod extends js.Object {
  def apply(globs: Globs): FSWatcher = js.native
  def apply(globs: Globs, fn: typingsJapgolly.undertaker.mod.TaskFunction): FSWatcher = js.native
  def apply(globs: Globs, opts: WatchOptions): FSWatcher = js.native
  def apply(globs: Globs, opts: WatchOptions, fn: typingsJapgolly.undertaker.mod.TaskFunction): FSWatcher = js.native
}

