package typingsJapgolly.tsmonad.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsmonad", "Maybe")
@js.native
class Maybe_[T] protected ()
  extends typingsJapgolly.tsmonad.maybeMod.Maybe_[T] {
  def this(`type`: typingsJapgolly.tsmonad.maybeMod.MaybeType) = this()
  def this(`type`: typingsJapgolly.tsmonad.maybeMod.MaybeType, value: T) = this()
}

/* static members */
@JSImport("tsmonad", "Maybe")
@js.native
object Maybe_ extends js.Object {
  def all(t: StringDictionary[typingsJapgolly.tsmonad.maybeMod.Maybe_[_]]): typingsJapgolly.tsmonad.maybeMod.Maybe_[StringDictionary[_]] = js.native
  def isJust[T](t: typingsJapgolly.tsmonad.maybeMod.Maybe_[T]): Boolean = js.native
  def isNothing[T](t: typingsJapgolly.tsmonad.maybeMod.Maybe_[T]): Boolean = js.native
  def just[T](t: T): typingsJapgolly.tsmonad.maybeMod.Maybe_[T] = js.native
  def maybe[T](): typingsJapgolly.tsmonad.maybeMod.Maybe_[T] = js.native
  def maybe[T](t: T): typingsJapgolly.tsmonad.maybeMod.Maybe_[T] = js.native
  def nothing[T](): typingsJapgolly.tsmonad.maybeMod.Maybe_[T] = js.native
  def sequence[T](t: StringDictionary[typingsJapgolly.tsmonad.maybeMod.Maybe_[T]]): typingsJapgolly.tsmonad.maybeMod.Maybe_[StringDictionary[T]] = js.native
}

