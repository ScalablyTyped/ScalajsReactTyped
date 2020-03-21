package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/throwError", JSImport.Namespace)
@js.native
object throwErrorMod extends js.Object {
  def throwError(error: js.Any): Observable[scala.Nothing] = js.native
  def throwError(error: js.Any, scheduler: SchedulerLike): Observable[scala.Nothing] = js.native
}

