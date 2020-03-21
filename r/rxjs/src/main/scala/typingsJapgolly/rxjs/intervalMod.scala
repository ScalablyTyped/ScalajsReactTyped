package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/interval", JSImport.Namespace)
@js.native
object intervalMod extends js.Object {
  def interval(): Observable[Double] = js.native
  def interval(period: Double): Observable[Double] = js.native
  def interval(period: Double, scheduler: SchedulerLike): Observable[Double] = js.native
}

