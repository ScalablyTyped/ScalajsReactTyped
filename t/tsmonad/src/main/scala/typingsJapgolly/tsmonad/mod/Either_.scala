package typingsJapgolly.tsmonad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsmonad", "Either")
@js.native
class Either_[L, R] protected ()
  extends typingsJapgolly.tsmonad.eitherMod.Either_[L, R] {
  def this(`type`: typingsJapgolly.tsmonad.eitherMod.EitherType) = this()
  def this(`type`: typingsJapgolly.tsmonad.eitherMod.EitherType, l: L) = this()
  def this(`type`: typingsJapgolly.tsmonad.eitherMod.EitherType, l: L, r: R) = this()
}

/* static members */
@JSImport("tsmonad", "Either")
@js.native
object Either_ extends js.Object {
  def left[L, R](l: L): typingsJapgolly.tsmonad.eitherMod.Either_[L, R] = js.native
  def right[L, R](r: R): typingsJapgolly.tsmonad.eitherMod.Either_[L, R] = js.native
}

