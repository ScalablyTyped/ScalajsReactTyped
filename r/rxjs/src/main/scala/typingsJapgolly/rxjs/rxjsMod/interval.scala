package typingsJapgolly.rxjs.rxjsMod

import typingsJapgolly.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "interval")
@js.native
object interval extends js.Object {
  def apply(): typingsJapgolly.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(period: Double): typingsJapgolly.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(period: Double, scheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[Double] = js.native
}

