package typingsJapgolly.mobservable.mod

import typingsJapgolly.mobservable.interfacesMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable", "autorunAsync")
@js.native
object autorunAsync extends js.Object {
  def apply(func: Lambda): Lambda = js.native
  def apply(func: Lambda, delay: Double): Lambda = js.native
  def apply(func: Lambda, delay: Double, scope: js.Any): Lambda = js.native
  def apply[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit]): Lambda = js.native
  def apply[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit], delay: Double): Lambda = js.native
  def apply[T](
    view: js.Function0[T],
    effect: js.Function1[/* latestValue */ T, Unit],
    delay: Double,
    scope: js.Any
  ): Lambda = js.native
}

