package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/empty", JSImport.Namespace)
@js.native
object emptyMod extends js.Object {
  @JSName("EMPTY")
  val EMPTY_ : Observable[scala.Nothing] = js.native
  def empty(): Observable[scala.Nothing] = js.native
  def empty(scheduler: SchedulerLike): Observable[scala.Nothing] = js.native
}

