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
trait KeyboardControls extends js.Object

object KeyboardControls {
  /**
  		 * Keyboard controls are disabled.
  		 */
  @scala.inline
  def Disable: `1` = this.cast(1)
  /**
  		 * Keyboard controls are enabled.
  		 */
  @scala.inline
  def Enable: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

