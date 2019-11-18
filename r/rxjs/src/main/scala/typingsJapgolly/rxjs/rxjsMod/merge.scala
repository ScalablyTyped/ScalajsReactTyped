package typingsJapgolly.rxjs.rxjsMod

import typingsJapgolly.rxjs.internalTypesMod.ObservableInput
import typingsJapgolly.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "merge")
@js.native
object merge extends js.Object {
  def apply[T](observables: (Double | ObservableInput[T] | SchedulerLike)*): typingsJapgolly.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T](v1: ObservableInput[T]): typingsJapgolly.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T](v1: ObservableInput[T], concurrent: Double): typingsJapgolly.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T](v1: ObservableInput[T], concurrent: Double, scheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T](v1: ObservableInput[T], scheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2]): typingsJapgolly.rxjs.internalObservableMod.Observable[T | T2] = js.native
  def apply[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2], concurrent: Double): typingsJapgolly.rxjs.internalObservableMod.Observable[T | T2] = js.native
  def apply[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2], concurrent: Double, scheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[T | T2] = js.native
  def apply[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2], scheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[T | T2] = js.native
  def apply[T, T2, T3](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3]): typingsJapgolly.rxjs.internalObservableMod.Observable[T | T2 | T3] = js.native
  def apply[T, T2, T3](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Double): typingsJapgolly.rxjs.internalObservableMod.Observable[T | T2 | T3] = js.native
  def apply[T, T2, T3](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    concurrent: Double,
    scheduler: SchedulerLike
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[T | T2 | T3] = js.native
  def apply[T, T2, T3](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3], scheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[T | T2 | T3] = js.native
  def apply[T, T2, T3, T4](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): typingsJapgolly.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4] = js.native
  def apply[T, T2, T3, T4](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    concurrent: Double
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4] = js.native
  def apply[T, T2, T3, T4](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    concurrent: Double,
    scheduler: SchedulerLike
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4] = js.native
  def apply[T, T2, T3, T4](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    scheduler: SchedulerLike
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4] = js.native
  def apply[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5]
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def apply[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    concurrent: Double
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def apply[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    concurrent: Double,
    scheduler: SchedulerLike
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def apply[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    scheduler: SchedulerLike
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def apply[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  def apply[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    concurrent: Double
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  def apply[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    concurrent: Double,
    scheduler: SchedulerLike
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  def apply[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    scheduler: SchedulerLike
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
}

