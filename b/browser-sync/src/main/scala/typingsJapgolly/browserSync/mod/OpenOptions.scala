package typingsJapgolly.browserSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.browserSync.browserSyncStrings.local
  - typingsJapgolly.browserSync.browserSyncStrings.external
  - typingsJapgolly.browserSync.browserSyncStrings.ui
  - typingsJapgolly.browserSync.browserSyncStrings.`ui-external`
  - typingsJapgolly.browserSync.browserSyncStrings.tunnel
*/
trait OpenOptions extends js.Object

object OpenOptions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def external: typingsJapgolly.browserSync.browserSyncStrings.external = this.cast("external")
  @scala.inline
  def local: typingsJapgolly.browserSync.browserSyncStrings.local = this.cast("local")
  @scala.inline
  def tunnel: typingsJapgolly.browserSync.browserSyncStrings.tunnel = this.cast("tunnel")
  @scala.inline
  def ui: typingsJapgolly.browserSync.browserSyncStrings.ui = this.cast("ui")
  @scala.inline
  def `ui-external`: typingsJapgolly.browserSync.browserSyncStrings.`ui-external` = this.cast("ui-external")
}

