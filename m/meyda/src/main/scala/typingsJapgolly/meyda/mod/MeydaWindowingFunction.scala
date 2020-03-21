package typingsJapgolly.meyda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.meyda.meydaStrings.blackman
  - typingsJapgolly.meyda.meydaStrings.sine
  - typingsJapgolly.meyda.meydaStrings.hanning
  - typingsJapgolly.meyda.meydaStrings.hamming
*/
trait MeydaWindowingFunction extends js.Object

object MeydaWindowingFunction {
  @scala.inline
  def blackman: typingsJapgolly.meyda.meydaStrings.blackman = this.cast("blackman")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hamming: typingsJapgolly.meyda.meydaStrings.hamming = this.cast("hamming")
  @scala.inline
  def hanning: typingsJapgolly.meyda.meydaStrings.hanning = this.cast("hanning")
  @scala.inline
  def sine: typingsJapgolly.meyda.meydaStrings.sine = this.cast("sine")
}

