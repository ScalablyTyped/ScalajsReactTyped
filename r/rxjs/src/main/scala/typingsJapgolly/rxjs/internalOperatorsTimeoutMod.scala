package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typingsJapgolly.rxjs.internalTypesMod.SchedulerLike
import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/timeout", JSImport.Namespace)
@js.native
object internalOperatorsTimeoutMod extends js.Object {
  def timeout[T](due: Double): MonoTypeOperatorFunction[T] = js.native
  def timeout[T](due: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  def timeout[T](due: Date): MonoTypeOperatorFunction[T] = js.native
  def timeout[T](due: Date, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
}

