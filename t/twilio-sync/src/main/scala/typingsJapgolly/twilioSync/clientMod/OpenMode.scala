package typingsJapgolly.twilioSync.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilioSync.twilioSyncStrings.open_or_create
  - typingsJapgolly.twilioSync.twilioSyncStrings.open_existing
  - typingsJapgolly.twilioSync.twilioSyncStrings.create_new
*/
trait OpenMode extends js.Object

object OpenMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create_new: typingsJapgolly.twilioSync.twilioSyncStrings.create_new = this.cast("create_new")
  @scala.inline
  def open_existing: typingsJapgolly.twilioSync.twilioSyncStrings.open_existing = this.cast("open_existing")
  @scala.inline
  def open_or_create: typingsJapgolly.twilioSync.twilioSyncStrings.open_or_create = this.cast("open_or_create")
}

