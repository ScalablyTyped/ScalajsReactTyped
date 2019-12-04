package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typingsJapgolly.rxjs.internalTypesMod.OperatorFunction
import typingsJapgolly.rxjs.rxjsNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/takeWhile", JSImport.Namespace)
@js.native
object internalOperatorsTakeWhileMod extends js.Object {
  def takeWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): MonoTypeOperatorFunction[T] = js.native
  def takeWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], inclusive: Boolean): MonoTypeOperatorFunction[T] = js.native
  @JSName("takeWhile")
  def takeWhile_TS_T_OperatorFunction[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]): OperatorFunction[T, S] = js.native
  @JSName("takeWhile")
  def takeWhile_false[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean], inclusive: `false`): OperatorFunction[T, S] = js.native
}

