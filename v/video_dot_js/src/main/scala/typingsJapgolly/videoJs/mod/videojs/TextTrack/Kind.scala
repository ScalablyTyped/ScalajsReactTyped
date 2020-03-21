package typingsJapgolly.videoJs.mod.videojs.TextTrack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.videoJs.videoJsStrings.subtitles
  - typingsJapgolly.videoJs.videoJsStrings.captions
  - typingsJapgolly.videoJs.videoJsStrings.descriptions
  - typingsJapgolly.videoJs.videoJsStrings.chapters
  - typingsJapgolly.videoJs.videoJsStrings.metadata
*/
trait Kind extends js.Object

object Kind {
  @scala.inline
  def captions: typingsJapgolly.videoJs.videoJsStrings.captions = this.cast("captions")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chapters: typingsJapgolly.videoJs.videoJsStrings.chapters = this.cast("chapters")
  @scala.inline
  def descriptions: typingsJapgolly.videoJs.videoJsStrings.descriptions = this.cast("descriptions")
  @scala.inline
  def metadata: typingsJapgolly.videoJs.videoJsStrings.metadata = this.cast("metadata")
  @scala.inline
  def subtitles: typingsJapgolly.videoJs.videoJsStrings.subtitles = this.cast("subtitles")
}

