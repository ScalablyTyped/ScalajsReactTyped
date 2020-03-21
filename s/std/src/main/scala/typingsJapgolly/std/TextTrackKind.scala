package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.captions
  - typingsJapgolly.std.stdStrings.chapters
  - typingsJapgolly.std.stdStrings.descriptions
  - typingsJapgolly.std.stdStrings.metadata
  - typingsJapgolly.std.stdStrings.subtitles
*/
trait TextTrackKind extends js.Object

object TextTrackKind {
  @scala.inline
  def captions: typingsJapgolly.std.stdStrings.captions = this.cast("captions")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chapters: typingsJapgolly.std.stdStrings.chapters = this.cast("chapters")
  @scala.inline
  def descriptions: typingsJapgolly.std.stdStrings.descriptions = this.cast("descriptions")
  @scala.inline
  def metadata: typingsJapgolly.std.stdStrings.metadata = this.cast("metadata")
  @scala.inline
  def subtitles: typingsJapgolly.std.stdStrings.subtitles = this.cast("subtitles")
}

