package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.lowpass
  - typings.std.stdStrings.highpass
  - typings.std.stdStrings.bandpass
  - typings.std.stdStrings.lowshelf
  - typings.std.stdStrings.highshelf
  - typings.std.stdStrings.peaking
  - typings.std.stdStrings.notch
  - typings.std.stdStrings.allpass
*/
trait BiquadFilterType extends js.Object

object BiquadFilterType {
  @scala.inline
  def allpass: typingsJapgolly.std.stdStrings.allpass = this.cast("allpass")
  @scala.inline
  def bandpass: typingsJapgolly.std.stdStrings.bandpass = this.cast("bandpass")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def highpass: typingsJapgolly.std.stdStrings.highpass = this.cast("highpass")
  @scala.inline
  def highshelf: typingsJapgolly.std.stdStrings.highshelf = this.cast("highshelf")
  @scala.inline
  def lowpass: typingsJapgolly.std.stdStrings.lowpass = this.cast("lowpass")
  @scala.inline
  def lowshelf: typingsJapgolly.std.stdStrings.lowshelf = this.cast("lowshelf")
  @scala.inline
  def notch: typingsJapgolly.std.stdStrings.notch = this.cast("notch")
  @scala.inline
  def peaking: typingsJapgolly.std.stdStrings.peaking = this.cast("peaking")
}

