package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.typesMod.MonoTypeOperatorFunction
import typingsJapgolly.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/auditTime", JSImport.Namespace)
@js.native
object auditTimeMod extends js.Object {
  def auditTime[T](duration: Double): MonoTypeOperatorFunction[T] = js.native
  def auditTime[T](duration: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
}

