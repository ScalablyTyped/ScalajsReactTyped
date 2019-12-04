package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typingsJapgolly.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/auditTime", JSImport.Namespace)
@js.native
object internalOperatorsAuditTimeMod extends js.Object {
  def auditTime[T](duration: Double): MonoTypeOperatorFunction[T] = js.native
  def auditTime[T](duration: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
}

