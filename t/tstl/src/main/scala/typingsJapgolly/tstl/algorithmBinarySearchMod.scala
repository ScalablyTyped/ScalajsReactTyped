package typingsJapgolly.tstl

import typingsJapgolly.tstl.comparatorMod.Comparator
import typingsJapgolly.tstl.iforwardcontainerMod.IForwardContainer
import typingsJapgolly.tstl.iforwardcontainerMod.IForwardContainer.IteratorType
import typingsJapgolly.tstl.iforwardcontainerMod.IForwardContainer.ValueType
import typingsJapgolly.tstl.pairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/ranges/algorithm/binary_search", JSImport.Namespace)
@js.native
object algorithmBinarySearchMod extends js.Object {
  @JSName("binary_search")
  def binarySearch[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): Boolean = js.native
  @JSName("binary_search")
  def binarySearch[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range], comp: Comparator[ValueType[Range], ValueType[Range]]): Boolean = js.native
  @JSName("equal_range")
  def equalRange[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): Pair[IteratorType[Range], IteratorType[Range]] = js.native
  @JSName("equal_range")
  def equalRange[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range], comp: Comparator[ValueType[Range], ValueType[Range]]): Pair[IteratorType[Range], IteratorType[Range]] = js.native
  @JSName("lower_bound")
  def lowerBound[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): IteratorType[Range] = js.native
  @JSName("lower_bound")
  def lowerBound[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range], comp: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
  @JSName("upper_bound")
  def upperBound[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range]): IteratorType[Range] = js.native
  @JSName("upper_bound")
  def upperBound[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, `val`: ValueType[Range], comp: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
}

