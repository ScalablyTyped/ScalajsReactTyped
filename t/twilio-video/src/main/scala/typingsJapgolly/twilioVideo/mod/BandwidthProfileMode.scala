package typingsJapgolly.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilioVideo.twilioVideoStrings.grid
  - typingsJapgolly.twilioVideo.twilioVideoStrings.collaboration
  - typingsJapgolly.twilioVideo.twilioVideoStrings.presentation
*/
trait BandwidthProfileMode extends js.Object

object BandwidthProfileMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def collaboration: typingsJapgolly.twilioVideo.twilioVideoStrings.collaboration = this.cast("collaboration")
  @scala.inline
  def grid: typingsJapgolly.twilioVideo.twilioVideoStrings.grid = this.cast("grid")
  @scala.inline
  def presentation: typingsJapgolly.twilioVideo.twilioVideoStrings.presentation = this.cast("presentation")
}

