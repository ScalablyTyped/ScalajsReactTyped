package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typingsJapgolly.rxjs.internalTypesMod.SchedulerLike
import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/delay", JSImport.Namespace)
@js.native
object internalOperatorsDelayMod extends js.Object {
  def delay[T](delay: Double): MonoTypeOperatorFunction[T] = js.native
  def delay[T](delay: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  def delay[T](delay: Date): MonoTypeOperatorFunction[T] = js.native
  def delay[T](delay: Date, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
}

