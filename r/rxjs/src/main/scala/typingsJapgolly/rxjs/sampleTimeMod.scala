package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.typesMod.MonoTypeOperatorFunction
import typingsJapgolly.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/sampleTime", JSImport.Namespace)
@js.native
object sampleTimeMod extends js.Object {
  def sampleTime[T](period: Double): MonoTypeOperatorFunction[T] = js.native
  def sampleTime[T](period: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
}

