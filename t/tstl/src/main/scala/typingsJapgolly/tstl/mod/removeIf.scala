package typingsJapgolly.tstl.mod

import typingsJapgolly.tstl.generalMod.General
import typingsJapgolly.tstl.iforwarditeratorMod.IForwardIterator
import typingsJapgolly.tstl.ipointerMod.IPointer.ValueType
import typingsJapgolly.tstl.unaryPredicatorMod.UnaryPredicator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "remove_if")
@js.native
object removeIf extends js.Object {
  def apply[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](first: InputIterator, last: InputIterator, pred: UnaryPredicator[ValueType[InputIterator]]): InputIterator = js.native
}

