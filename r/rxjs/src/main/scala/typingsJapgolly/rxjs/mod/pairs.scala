package typingsJapgolly.rxjs.mod

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "pairs")
@js.native
object pairs extends js.Object {
  def apply[T](obj: js.Object): Observable[js.Tuple2[String, T]] = js.native
  def apply[T](obj: js.Object, scheduler: SchedulerLike): Observable[js.Tuple2[String, T]] = js.native
}

