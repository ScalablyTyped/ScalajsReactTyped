package typingsJapgolly.coreDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #############################################################################################
// Array - https://github.com/zloirock/core-js/#array
// Modules: core.array.turn
// #############################################################################################
@js.native
trait Array[T] extends js.Object {
  /**
    * Non-standard.
    */
  def turn(
    callbackfn: js.Function4[/* memo */ Array[T], /* value */ T, /* index */ Double, /* array */ Array[T], Unit]
  ): Array[T] = js.native
  def turn(
    callbackfn: js.Function4[/* memo */ Array[T], /* value */ T, /* index */ Double, /* array */ Array[T], Unit],
    memo: Array[T]
  ): Array[T] = js.native
  def turn[U](
    callbackfn: js.Function4[/* memo */ U, /* value */ T, /* index */ Double, /* array */ Array[T], Unit],
    memo: U
  ): U = js.native
  /**
    * Non-standard.
    */
  @JSName("turn")
  def turn_U_U[U](
    callbackfn: js.Function4[/* memo */ U, /* value */ T, /* index */ Double, /* array */ Array[T], Unit]
  ): U = js.native
}

