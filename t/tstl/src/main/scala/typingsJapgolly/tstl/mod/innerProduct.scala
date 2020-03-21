package typingsJapgolly.tstl.mod

import typingsJapgolly.tstl.generalMod.General
import typingsJapgolly.tstl.iforwarditeratorMod.IForwardIterator
import typingsJapgolly.tstl.ipointerMod.IPointer.ValueType
import typingsJapgolly.tstl.operationsMod.Operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "inner_product")
@js.native
object innerProduct extends js.Object {
  def apply[InputIterator1 /* <: General[IForwardIterator[ValueType[InputIterator1], InputIterator1]] */, InputIterator2 /* <: General[IForwardIterator[ValueType[InputIterator2], InputIterator2]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    value: ValueType[InputIterator1]
  ): ValueType[InputIterator1] = js.native
  def apply[InputIterator1 /* <: General[IForwardIterator[ValueType[InputIterator1], InputIterator1]] */, InputIterator2 /* <: General[IForwardIterator[ValueType[InputIterator2], InputIterator2]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    value: ValueType[InputIterator1],
    adder: Operator[InputIterator1, InputIterator1]
  ): ValueType[InputIterator1] = js.native
  def apply[InputIterator1 /* <: General[IForwardIterator[ValueType[InputIterator1], InputIterator1]] */, InputIterator2 /* <: General[IForwardIterator[ValueType[InputIterator2], InputIterator2]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    value: ValueType[InputIterator1],
    adder: Operator[InputIterator1, InputIterator1],
    multiplier: Operator[InputIterator1, InputIterator2]
  ): ValueType[InputIterator1] = js.native
}

