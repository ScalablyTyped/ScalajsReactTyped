package typingsJapgolly.rxjs.mod

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "range")
@js.native
object range extends js.Object {
  def apply(): Observable[Double] = js.native
  def apply(start: Double): Observable[Double] = js.native
  def apply(start: Double, count: Double): Observable[Double] = js.native
  def apply(start: Double, count: Double, scheduler: SchedulerLike): Observable[Double] = js.native
}

