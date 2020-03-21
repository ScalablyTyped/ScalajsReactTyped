package typingsJapgolly.youtube.YT

import typingsJapgolly.youtube.youtubeNumbers.`0`
import typingsJapgolly.youtube.youtubeNumbers.`1`
import typingsJapgolly.youtube.youtubeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.youtube.youtubeNumbers.`0`
  - typingsJapgolly.youtube.youtubeNumbers.`1`
  - typingsJapgolly.youtube.youtubeNumbers.`2`
*/
trait AutoHide extends js.Object

object AutoHide {
  /**
  		 * Controls are visible throughout the video
  		 */
  @scala.inline
  def AlwaysVisible: `0` = this.cast(0)
  /**
  		 * Progress bar and player controls slide out of view after a couple of seconds.
  		 */
  @scala.inline
  def HideAllControls: `1` = this.cast(1)
  /**
  		 * Progress bar fades out while the player controls remain visible.
  		 */
  @scala.inline
  def HideProgressBar: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

