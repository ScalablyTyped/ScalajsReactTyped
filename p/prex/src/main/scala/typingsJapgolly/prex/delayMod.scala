package typingsJapgolly.prex

import typingsJapgolly.esfxCancelable.distMod.Cancelable
import typingsJapgolly.prex.cancellationMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/delay", JSImport.Namespace)
@js.native
object delayMod extends js.Object {
  def delay(msec: Double): js.Promise[Unit] = js.native
  def delay(token: Cancelable, msec: Double): js.Promise[Unit] = js.native
  def delay(token: CancellationToken, msec: Double): js.Promise[Unit] = js.native
  def delay[T](msec: Double, value: T): js.Promise[T] = js.native
  def delay[T](msec: Double, value: js.Thenable[T]): js.Promise[T] = js.native
  def delay[T](token: Cancelable, msec: Double, value: T): js.Promise[T] = js.native
  def delay[T](token: Cancelable, msec: Double, value: js.Thenable[T]): js.Promise[T] = js.native
  def delay[T](token: CancellationToken, msec: Double, value: T): js.Promise[T] = js.native
  def delay[T](token: CancellationToken, msec: Double, value: js.Thenable[T]): js.Promise[T] = js.native
}

