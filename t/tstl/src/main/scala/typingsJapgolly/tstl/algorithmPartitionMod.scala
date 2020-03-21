package typingsJapgolly.tstl

import typingsJapgolly.tstl.ibidirectionalcontainerMod.IBidirectionalContainer
import typingsJapgolly.tstl.ibidirectionalcontainerMod.IBidirectionalContainer.IteratorType
import typingsJapgolly.tstl.iforwardcontainerMod.IForwardContainer
import typingsJapgolly.tstl.iforwardcontainerMod.IForwardContainer.ValueType
import typingsJapgolly.tstl.iforwarditeratorMod.IForwardIterator
import typingsJapgolly.tstl.pairMod.Pair
import typingsJapgolly.tstl.unaryPredicatorMod.UnaryPredicator
import typingsJapgolly.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/ranges/algorithm/partition", JSImport.Namespace)
@js.native
object algorithmPartitionMod extends js.Object {
  @JSName("is_partitioned")
  def isPartitioned[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): Boolean = js.native
  def partition[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, pred: UnaryPredicator[ValueType[Range]]): IteratorType[Range] = js.native
  @JSName("partition_copy")
  def partitionCopy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator1 /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator1]] */, OutputIterator2 /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator2]] */](
    range: Range,
    output_true: OutputIterator1,
    output_false: OutputIterator2,
    pred: UnaryPredicator[ValueType[Range]]
  ): Pair[OutputIterator1, OutputIterator2] = js.native
  @JSName("partition_point")
  def partitionPoint[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): typingsJapgolly.tstl.iforwardcontainerMod.IForwardContainer.IteratorType[Range] = js.native
  @JSName("stable_partition")
  def stablePartition[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, pred: UnaryPredicator[ValueType[Range]]): IteratorType[Range] = js.native
}

