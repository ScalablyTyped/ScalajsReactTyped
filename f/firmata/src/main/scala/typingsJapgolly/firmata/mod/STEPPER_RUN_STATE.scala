package typingsJapgolly.firmata.mod

import typingsJapgolly.firmata.firmataNumbers.`0`
import typingsJapgolly.firmata.firmataNumbers.`1`
import typingsJapgolly.firmata.firmataNumbers.`2`
import typingsJapgolly.firmata.firmataNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L479-L484
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firmata.firmataNumbers.`0`
  - typingsJapgolly.firmata.firmataNumbers.`1`
  - typingsJapgolly.firmata.firmataNumbers.`2`
  - typingsJapgolly.firmata.firmataNumbers.`3`
*/
trait STEPPER_RUN_STATE extends js.Object

object STEPPER_RUN_STATE {
  @scala.inline
  def ACCEL: `1` = this.cast(1)
  @scala.inline
  def DECEL: `2` = this.cast(2)
  @scala.inline
  def RUN: `3` = this.cast(3)
  @scala.inline
  def STOP: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

