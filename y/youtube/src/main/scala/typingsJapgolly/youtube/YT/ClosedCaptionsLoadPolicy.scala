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
trait ClosedCaptionsLoadPolicy extends js.Object

object ClosedCaptionsLoadPolicy {
  /**
  		 * For closed captions to be shown.
  		 */
  @scala.inline
  def ForceOn: `1` = this.cast(1)
  /**
  		 * Defaults to the user's preferences.
  		 */
  @scala.inline
  def UserDefault: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

