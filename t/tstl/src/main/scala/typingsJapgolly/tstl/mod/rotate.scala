package typingsJapgolly.tstl.mod

import typingsJapgolly.tstl.generalMod.General
import typingsJapgolly.tstl.iforwarditeratorMod.IForwardIterator
import typingsJapgolly.tstl.ipointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "rotate")
@js.native
object rotate extends js.Object {
  def apply[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](first: InputIterator, middle: InputIterator, last: InputIterator): InputIterator = js.native
}

