package typingsJapgolly.tstl

import typingsJapgolly.tstl.backInsertIteratorMod.BackInsertIterator
import typingsJapgolly.tstl.backInsertIteratorMod.BackInsertIterator.SourceType
import typingsJapgolly.tstl.frontInsertIteratorMod.FrontInsertIterator
import typingsJapgolly.tstl.frontInsertIteratorMod.FrontInsertIterator.ValueType
import typingsJapgolly.tstl.ibidirectionalcontainerMod.IBidirectionalContainer
import typingsJapgolly.tstl.ibidirectionalcontainerMod.IBidirectionalContainer.ReverseIteratorType
import typingsJapgolly.tstl.iforwardcontainerMod.IForwardContainer
import typingsJapgolly.tstl.iforwardcontainerMod.IForwardContainer.IteratorType
import typingsJapgolly.tstl.iforwarditeratorMod.IForwardIterator
import typingsJapgolly.tstl.iinsertMod.IInsert
import typingsJapgolly.tstl.insertIteratorMod.InsertIterator
import typingsJapgolly.tstl.ipushbackMod.IPushBack
import typingsJapgolly.tstl.ipushfrontMod.IPushFront
import typingsJapgolly.tstl.ireversableiteratorMod.IReversableIterator
import typingsJapgolly.tstl.ireverseiteratorMod.IReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/factory", JSImport.Namespace)
@js.native
object factoryMod extends js.Object {
  @JSName("back_inserter")
  def backInserter[Source /* <: js.Array[_] | IPushBack[_] */](source: Source): BackInsertIterator[SourceType[Source]] = js.native
  def begin[Container /* <: js.Array[_] | IForwardContainer[_] */](container: Container): IteratorType[Container] = js.native
  def end[Container /* <: js.Array[_] | IForwardContainer[_] */](container: Container): IteratorType[Container] = js.native
  @JSName("front_inserter")
  def frontInserter[Source /* <: IPushFront[ValueType[Source]] */](source: Source): FrontInsertIterator[Source] = js.native
  def inserter[Container /* <: IInsert[Iterator] */, Iterator /* <: IForwardIterator[typingsJapgolly.tstl.ipointerMod.IPointer.ValueType[Iterator], Iterator] */](container: Container, it: Iterator): InsertIterator[Container, Iterator] = js.native
  @JSName("make_reverse_iterator")
  def makeReverseIterator[IteratorT /* <: IReversableIterator[typingsJapgolly.tstl.ipointerMod.IPointer.ValueType[IteratorT], IteratorT, ReverseT] */, ReverseT /* <: IReverseIterator[typingsJapgolly.tstl.ipointerMod.IPointer.ValueType[IteratorT], IteratorT, ReverseT] */](it: IteratorT): ReverseT = js.native
  def rbegin[Container /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](container: Container): ReverseIteratorType[Container] = js.native
  def rend[Container /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](container: Container): ReverseIteratorType[Container] = js.native
}

