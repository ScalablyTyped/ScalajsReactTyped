package typingsJapgolly.doublearray.doublearray

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoubleArrayBuilder extends js.Object {
  var bc: BaseAndCheck = js.native
  var keys: js.Array[KeyValue] = js.native
  def append(key: String, record: Double): DoubleArrayBuilder = js.native
  def build(): DoubleArray = js.native
  def build(keys: js.Array[KeyValue]): DoubleArray = js.native
  def build(keys: js.Array[KeyValue], sorted: Boolean): DoubleArray = js.native
  def findAllocatableBase(children_info: scala.scalajs.js.typedarray.Int32Array): Double = js.native
  def getChildrenInfo(position: Double, start: Double, length: Double): scala.scalajs.js.typedarray.Int32Array = js.native
  def isUnusedNode(index: Double): Boolean = js.native
  def setBC(parent_id: Double, children_info: scala.scalajs.js.typedarray.Int32Array, _base: Double): Unit = js.native
}

