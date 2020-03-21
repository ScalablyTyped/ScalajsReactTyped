package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/windowCount", JSImport.Namespace)
@js.native
object windowCountMod extends js.Object {
  def windowCount[T](windowSize: Double): OperatorFunction[T, Observable[T]] = js.native
  def windowCount[T](windowSize: Double, startWindowEvery: Double): OperatorFunction[T, Observable[T]] = js.native
}

