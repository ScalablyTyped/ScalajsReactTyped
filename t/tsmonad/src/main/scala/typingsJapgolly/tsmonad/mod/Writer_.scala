package typingsJapgolly.tsmonad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsmonad", "Writer")
@js.native
class Writer_[S, T] protected ()
  extends typingsJapgolly.tsmonad.writerMod.Writer_[S, T] {
  def this(story: js.Array[S], value: T) = this()
}

/* static members */
@JSImport("tsmonad", "Writer")
@js.native
object Writer_ extends js.Object {
  def tell[S](s: S): typingsJapgolly.tsmonad.writerMod.Writer_[S, Double] = js.native
  def writer[S, T](story: js.Array[S], value: T): typingsJapgolly.tsmonad.writerMod.Writer_[S, T] = js.native
}

