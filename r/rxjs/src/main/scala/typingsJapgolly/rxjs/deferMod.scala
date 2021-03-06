package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.typesMod.ObservableInput
import typingsJapgolly.rxjs.typesMod.ObservedValueOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/defer", JSImport.Namespace)
@js.native
object deferMod extends js.Object {
  def defer[R /* <: ObservableInput[_] | Unit */](observableFactory: js.Function0[R]): Observable[ObservedValueOf[R]] = js.native
}

