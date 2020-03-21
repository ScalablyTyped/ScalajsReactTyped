package typingsJapgolly.youtube.YT

import typingsJapgolly.youtube.youtubeNumbers.`0`
import typingsJapgolly.youtube.youtubeNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.youtube.youtubeNumbers.`0`
  - typingsJapgolly.youtube.youtubeNumbers.`1`
*/
trait RelatedVideos extends js.Object

object RelatedVideos {
  /**
  		 * Hide related videos after playback is complete.
  		 */
  @scala.inline
  def Hide: `0` = this.cast(0)
  /**
  		 * Show related videos after playback is complete.
  		 */
  @scala.inline
  def Show: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

