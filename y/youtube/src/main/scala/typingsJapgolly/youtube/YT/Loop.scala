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
trait Loop extends js.Object

object Loop {
  /**
  		 * Video or playlist will be played over and over again.
  		 */
  @scala.inline
  def Loop: `1` = this.cast(1)
  /**
  		 * Video or playlist will be played only once.
  		 */
  @scala.inline
  def SinglePlay: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

