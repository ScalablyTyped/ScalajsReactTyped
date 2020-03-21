package typingsJapgolly.fileSize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fileSize.fileSizeStrings.si
  - typingsJapgolly.fileSize.fileSizeStrings.iec
  - typingsJapgolly.fileSize.fileSizeStrings.jedec
*/
trait Spec extends js.Object

object Spec {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def iec: typingsJapgolly.fileSize.fileSizeStrings.iec = this.cast("iec")
  @scala.inline
  def jedec: typingsJapgolly.fileSize.fileSizeStrings.jedec = this.cast("jedec")
  @scala.inline
  def si: typingsJapgolly.fileSize.fileSizeStrings.si = this.cast("si")
}

