package typingsJapgolly.videoJs.mod.videojs.AudioTrack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All possible `AudioTrackKind`s
  *
  * @see https://html.spec.whatwg.org/multipage/embedded-content.html#dom-audiotrack-kind
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.videoJs.videoJsStrings.alternative
  - typingsJapgolly.videoJs.videoJsStrings.descriptions
  - typingsJapgolly.videoJs.videoJsStrings.main
  - typingsJapgolly.videoJs.videoJsStrings.`main-desc`
  - typingsJapgolly.videoJs.videoJsStrings.translation
  - typingsJapgolly.videoJs.videoJsStrings.commentary
*/
trait Kind extends js.Object

object Kind {
  @scala.inline
  def alternative: typingsJapgolly.videoJs.videoJsStrings.alternative = this.cast("alternative")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def commentary: typingsJapgolly.videoJs.videoJsStrings.commentary = this.cast("commentary")
  @scala.inline
  def descriptions: typingsJapgolly.videoJs.videoJsStrings.descriptions = this.cast("descriptions")
  @scala.inline
  def main: typingsJapgolly.videoJs.videoJsStrings.main = this.cast("main")
  @scala.inline
  def `main-desc`: typingsJapgolly.videoJs.videoJsStrings.`main-desc` = this.cast("main-desc")
  @scala.inline
  def translation: typingsJapgolly.videoJs.videoJsStrings.translation = this.cast("translation")
}

