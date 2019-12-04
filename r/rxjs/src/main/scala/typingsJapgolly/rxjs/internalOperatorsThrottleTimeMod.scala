package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalOperatorsThrottleMod.ThrottleConfig
import typingsJapgolly.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typingsJapgolly.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/throttleTime", JSImport.Namespace)
@js.native
object internalOperatorsThrottleTimeMod extends js.Object {
  def throttleTime[T](duration: Double): MonoTypeOperatorFunction[T] = js.native
  def throttleTime[T](duration: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  def throttleTime[T](duration: Double, scheduler: SchedulerLike, config: ThrottleConfig): MonoTypeOperatorFunction[T] = js.native
}

