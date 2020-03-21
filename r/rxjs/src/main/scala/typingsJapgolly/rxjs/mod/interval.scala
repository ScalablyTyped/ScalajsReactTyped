package typingsJapgolly.rxjs.mod

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "interval")
@js.native
object interval extends js.Object {
  def apply(): Observable[Double] = js.native
  def apply(period: Double): Observable[Double] = js.native
  def apply(period: Double, scheduler: SchedulerLike): Observable[Double] = js.native
}

