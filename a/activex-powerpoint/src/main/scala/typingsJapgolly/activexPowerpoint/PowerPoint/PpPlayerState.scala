package typingsJapgolly.activexPowerpoint.PowerPoint

import typingsJapgolly.activexPowerpoint.activexPowerpointNumbers.`0`
import typingsJapgolly.activexPowerpoint.activexPowerpointNumbers.`1`
import typingsJapgolly.activexPowerpoint.activexPowerpointNumbers.`2`
import typingsJapgolly.activexPowerpoint.activexPowerpointNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexPowerpoint.activexPowerpointNumbers.`3`
  - typingsJapgolly.activexPowerpoint.activexPowerpointNumbers.`1`
  - typingsJapgolly.activexPowerpoint.activexPowerpointNumbers.`0`
  - typingsJapgolly.activexPowerpoint.activexPowerpointNumbers.`2`
*/
trait PpPlayerState extends js.Object

object PpPlayerState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ppNotReady: `3` = this.cast(3)
  @scala.inline
  def ppPaused: `1` = this.cast(1)
  @scala.inline
  def ppPlaying: `0` = this.cast(0)
  @scala.inline
  def ppStopped: `2` = this.cast(2)
}

