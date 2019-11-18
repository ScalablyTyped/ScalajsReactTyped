package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.sine
  - typings.std.stdStrings.square
  - typings.std.stdStrings.sawtooth
  - typings.std.stdStrings.triangle
  - typings.std.stdStrings.custom
*/
trait OscillatorType extends js.Object

object OscillatorType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def custom: typingsJapgolly.std.stdStrings.custom = this.cast("custom")
  @scala.inline
  def sawtooth: typingsJapgolly.std.stdStrings.sawtooth = this.cast("sawtooth")
  @scala.inline
  def sine: typingsJapgolly.std.stdStrings.sine = this.cast("sine")
  @scala.inline
  def square: typingsJapgolly.std.stdStrings.square = this.cast("square")
  @scala.inline
  def triangle: typingsJapgolly.std.stdStrings.triangle = this.cast("triangle")
}

