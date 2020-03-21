package typingsJapgolly.tstl.mod

import typingsJapgolly.tstl.generalMod.General
import typingsJapgolly.tstl.ibidirectionaliteratorMod.IBidirectionalIterator
import typingsJapgolly.tstl.ipointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "shift_right")
@js.native
object shiftRight extends js.Object {
  def apply[ForwardIterator /* <: General[IBidirectionalIterator[ValueType[ForwardIterator], ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, n: Double): ForwardIterator = js.native
}

