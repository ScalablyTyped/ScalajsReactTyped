package typingsJapgolly.tstl

import typingsJapgolly.tstl.comparatorMod.Comparator
import typingsJapgolly.tstl.ibidirectionalcontainerMod.IBidirectionalContainer
import typingsJapgolly.tstl.ibidirectionalcontainerMod.IBidirectionalContainer.IteratorType
import typingsJapgolly.tstl.iforwardcontainerMod.IForwardContainer
import typingsJapgolly.tstl.iforwardcontainerMod.IForwardContainer.ValueType
import typingsJapgolly.tstl.iforwarditeratorMod.IForwardIterator
import typingsJapgolly.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/ranges/algorithm/merge", JSImport.Namespace)
@js.native
object algorithmMergeMod extends js.Object {
  def includes[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): Boolean = js.native
  def includes[Range1 /* <: js.Array[_] | IForwardContainer[_] */](
    range1: Range1,
    range2: js.Array[ValueType[Range1]],
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): Boolean = js.native
  def includes[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): Boolean = js.native
  def includes[Range1 /* <: js.Array[_] | IForwardContainer[_] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): Boolean = js.native
  @JSName("inplace_merge")
  def inplaceMerge[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, middle: IteratorType[Range]): Unit = js.native
  @JSName("inplace_merge")
  def inplaceMerge[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, middle: IteratorType[Range], comp: Comparator[ValueType[Range], ValueType[Range]]): Unit = js.native
  def merge[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](range1: Range1, range2: js.Array[ValueType[Range1]], output: OutputIterator): OutputIterator = js.native
  def merge[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: js.Array[ValueType[Range1]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  def merge[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator
  ): OutputIterator = js.native
  def merge[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  @JSName("set_difference")
  def setDifference[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](range1: Range1, range2: js.Array[ValueType[Range1]], output: OutputIterator): OutputIterator = js.native
  @JSName("set_difference")
  def setDifference[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: js.Array[ValueType[Range1]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  @JSName("set_difference")
  def setDifference[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator
  ): OutputIterator = js.native
  @JSName("set_difference")
  def setDifference[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  @JSName("set_intersection")
  def setIntersection[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](range1: Range1, range2: js.Array[ValueType[Range1]], output: OutputIterator): OutputIterator = js.native
  @JSName("set_intersection")
  def setIntersection[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: js.Array[ValueType[Range1]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  @JSName("set_intersection")
  def setIntersection[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator
  ): OutputIterator = js.native
  @JSName("set_intersection")
  def setIntersection[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  @JSName("set_symmetric_difference")
  def setSymmetricDifference[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](range1: Range1, range2: js.Array[ValueType[Range1]], output: OutputIterator): OutputIterator = js.native
  @JSName("set_symmetric_difference")
  def setSymmetricDifference[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: js.Array[ValueType[Range1]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  @JSName("set_symmetric_difference")
  def setSymmetricDifference[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator
  ): OutputIterator = js.native
  @JSName("set_symmetric_difference")
  def setSymmetricDifference[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  @JSName("set_union")
  def setUnion[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](range1: Range1, range2: js.Array[ValueType[Range1]], output: OutputIterator): OutputIterator = js.native
  @JSName("set_union")
  def setUnion[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: js.Array[ValueType[Range1]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
  @JSName("set_union")
  def setUnion[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator
  ): OutputIterator = js.native
  @JSName("set_union")
  def setUnion[Range1 /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[Range1], OutputIterator]] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    output: OutputIterator,
    comp: Comparator[ValueType[Range1], ValueType[Range1]]
  ): OutputIterator = js.native
}

