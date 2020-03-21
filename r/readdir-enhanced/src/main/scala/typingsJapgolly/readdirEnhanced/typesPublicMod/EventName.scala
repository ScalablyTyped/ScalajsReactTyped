package typingsJapgolly.readdirEnhanced.typesPublicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.readdirEnhanced.readdirEnhancedStrings.error
  - typingsJapgolly.readdirEnhanced.readdirEnhancedStrings.file
  - typingsJapgolly.readdirEnhanced.readdirEnhancedStrings.directory
  - typingsJapgolly.readdirEnhanced.readdirEnhancedStrings.symlink
*/
trait EventName extends js.Object

object EventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def directory: typingsJapgolly.readdirEnhanced.readdirEnhancedStrings.directory = this.cast("directory")
  @scala.inline
  def error: typingsJapgolly.readdirEnhanced.readdirEnhancedStrings.error = this.cast("error")
  @scala.inline
  def file: typingsJapgolly.readdirEnhanced.readdirEnhancedStrings.file = this.cast("file")
  @scala.inline
  def symlink: typingsJapgolly.readdirEnhanced.readdirEnhancedStrings.symlink = this.cast("symlink")
}

