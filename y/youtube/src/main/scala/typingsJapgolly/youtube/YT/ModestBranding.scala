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
trait ModestBranding extends js.Object

object ModestBranding {
  /**
  		 * Player will contain full YouTube branding.
  		 */
  @scala.inline
  def Full: `0` = this.cast(0)
  /**
  		 * YouTube logo will not display in the control bar.
  		 */
  @scala.inline
  def Modest: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

