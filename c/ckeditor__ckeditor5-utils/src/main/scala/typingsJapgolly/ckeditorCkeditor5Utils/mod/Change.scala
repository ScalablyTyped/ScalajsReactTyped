package typingsJapgolly.ckeditorCkeditor5Utils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.equal
  - typingsJapgolly.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.insert
  - typingsJapgolly.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.delete
*/
trait Change extends js.Object

object Change {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typingsJapgolly.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.delete = this.cast("delete")
  @scala.inline
  def equal: typingsJapgolly.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.equal = this.cast("equal")
  @scala.inline
  def insert: typingsJapgolly.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.insert = this.cast("insert")
}

