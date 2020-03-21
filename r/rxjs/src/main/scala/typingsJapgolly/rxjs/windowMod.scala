package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/window", JSImport.Namespace)
@js.native
object windowMod extends js.Object {
  def window[T](windowBoundaries: Observable[_]): OperatorFunction[T, Observable[T]] = js.native
}

