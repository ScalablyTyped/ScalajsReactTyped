package typingsJapgolly.rxjs.rxjsMod

import typingsJapgolly.rxjs.internalTypesMod.SchedulerLike
import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "timer")
@js.native
object timer extends js.Object {
  def apply(): typingsJapgolly.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(dueTime: Double): typingsJapgolly.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(dueTime: Double, periodOrScheduler: Double): typingsJapgolly.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(dueTime: Double, periodOrScheduler: Double, scheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(dueTime: Double, periodOrScheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(dueTime: Double, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(dueTime: Date): typingsJapgolly.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(dueTime: Date, periodOrScheduler: Double): typingsJapgolly.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(dueTime: Date, periodOrScheduler: Double, scheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(dueTime: Date, periodOrScheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(dueTime: Date, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[Double] = js.native
}

