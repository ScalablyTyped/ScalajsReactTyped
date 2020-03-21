package typingsJapgolly.nodeHueApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeHueApi.nodeHueApiStrings.idle
  - typingsJapgolly.nodeHueApi.nodeHueApiStrings.startmigration
  - typingsJapgolly.nodeHueApi.nodeHueApiStrings.fileready_disabled
  - typingsJapgolly.nodeHueApi.nodeHueApiStrings.prepare_restore
  - typingsJapgolly.nodeHueApi.nodeHueApiStrings.restoring
*/
trait BackupStatus extends js.Object

object BackupStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fileready_disabled: typingsJapgolly.nodeHueApi.nodeHueApiStrings.fileready_disabled = this.cast("fileready_disabled")
  @scala.inline
  def idle: typingsJapgolly.nodeHueApi.nodeHueApiStrings.idle = this.cast("idle")
  @scala.inline
  def prepare_restore: typingsJapgolly.nodeHueApi.nodeHueApiStrings.prepare_restore = this.cast("prepare_restore")
  @scala.inline
  def restoring: typingsJapgolly.nodeHueApi.nodeHueApiStrings.restoring = this.cast("restoring")
  @scala.inline
  def startmigration: typingsJapgolly.nodeHueApi.nodeHueApiStrings.startmigration = this.cast("startmigration")
}

