package typingsJapgolly.tsmonad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsmonad", "writer")
@js.native
object writer extends js.Object {
  def apply[S, T](story: js.Array[S], value: T): typingsJapgolly.tsmonad.writerMod.Writer_[S, T] = js.native
}

