package typingsJapgolly.browserSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.browserSync.browserSyncStrings.add
  - typingsJapgolly.browserSync.browserSyncStrings.change
  - typingsJapgolly.browserSync.browserSyncStrings.unlink
  - typingsJapgolly.browserSync.browserSyncStrings.addDir
  - typingsJapgolly.browserSync.browserSyncStrings.unlinkDir
*/
trait WatchEvents extends js.Object

object WatchEvents {
  @scala.inline
  def add: typingsJapgolly.browserSync.browserSyncStrings.add = this.cast("add")
  @scala.inline
  def addDir: typingsJapgolly.browserSync.browserSyncStrings.addDir = this.cast("addDir")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typingsJapgolly.browserSync.browserSyncStrings.change = this.cast("change")
  @scala.inline
  def unlink: typingsJapgolly.browserSync.browserSyncStrings.unlink = this.cast("unlink")
  @scala.inline
  def unlinkDir: typingsJapgolly.browserSync.browserSyncStrings.unlinkDir = this.cast("unlinkDir")
}

