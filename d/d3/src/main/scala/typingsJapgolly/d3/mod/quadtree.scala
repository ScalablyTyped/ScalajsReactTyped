package typingsJapgolly.d3.mod

import typingsJapgolly.d3Quadtree.mod.Quadtree_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "quadtree")
@js.native
object quadtree extends js.Object {
  def apply[T](): Quadtree_[T] = js.native
  def apply[T](data: js.Array[T]): Quadtree_[T] = js.native
  def apply[T](data: js.Array[T], x: js.Function1[/* d */ T, Double]): Quadtree_[T] = js.native
  def apply[T](data: js.Array[T], x: js.Function1[/* d */ T, Double], y: js.Function1[/* d */ T, Double]): Quadtree_[T] = js.native
}

