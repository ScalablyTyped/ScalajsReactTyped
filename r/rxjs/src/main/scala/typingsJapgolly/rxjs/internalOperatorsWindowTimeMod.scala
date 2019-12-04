package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.internalTypesMod.OperatorFunction
import typingsJapgolly.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/windowTime", JSImport.Namespace)
@js.native
object internalOperatorsWindowTimeMod extends js.Object {
  def windowTime[T](windowTimeSpan: Double): OperatorFunction[T, Observable[T]] = js.native
  def windowTime[T](windowTimeSpan: Double, scheduler: SchedulerLike): OperatorFunction[T, Observable[T]] = js.native
  def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double): OperatorFunction[T, Observable[T]] = js.native
  def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double, maxWindowSize: Double): OperatorFunction[T, Observable[T]] = js.native
  def windowTime[T](
    windowTimeSpan: Double,
    windowCreationInterval: Double,
    maxWindowSize: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, Observable[T]] = js.native
  def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double, scheduler: SchedulerLike): OperatorFunction[T, Observable[T]] = js.native
}

