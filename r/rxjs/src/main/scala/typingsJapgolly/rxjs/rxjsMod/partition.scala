package typingsJapgolly.rxjs.rxjsMod

import typingsJapgolly.rxjs.internalTypesMod.ObservableInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "partition")
@js.native
object partition extends js.Object {
  def apply[T](source: ObservableInput[T], predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.Tuple2[
    typingsJapgolly.rxjs.internalObservableMod.Observable[T], 
    typingsJapgolly.rxjs.internalObservableMod.Observable[T]
  ] = js.native
  def apply[T](
    source: ObservableInput[T],
    predicate: js.Function2[/* value */ T, /* index */ Double, Boolean],
    thisArg: js.Any
  ): js.Tuple2[
    typingsJapgolly.rxjs.internalObservableMod.Observable[T], 
    typingsJapgolly.rxjs.internalObservableMod.Observable[T]
  ] = js.native
}

