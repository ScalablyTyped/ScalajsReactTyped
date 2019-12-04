package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/first", JSImport.Namespace)
@js.native
object internalOperatorsFirstMod extends js.Object {
  def first[T, D](): OperatorFunction[T, T | D] = js.native
  def first[T, D](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, T | D] = js.native
  def first[T, D](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    defaultValue: D
  ): OperatorFunction[T, T | D] = js.native
  def first[T, D](predicate: Null, defaultValue: D): OperatorFunction[T, T | D] = js.native
  @JSName("first")
  def first_TS_T[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean]
  ): OperatorFunction[T, S] = js.native
  @JSName("first")
  def first_TS_T[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean],
    defaultValue: S
  ): OperatorFunction[T, S] = js.native
}

