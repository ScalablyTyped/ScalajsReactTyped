package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/bufferCount", JSImport.Namespace)
@js.native
object bufferCountMod extends js.Object {
  def bufferCount[T](bufferSize: Double): OperatorFunction[T, js.Array[T]] = js.native
  def bufferCount[T](bufferSize: Double, startBufferEvery: Double): OperatorFunction[T, js.Array[T]] = js.native
}

