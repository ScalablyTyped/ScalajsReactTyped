package typingsJapgolly.tstl.mod

import typingsJapgolly.tstl.iforwarditeratorMod.IForwardIterator
import typingsJapgolly.tstl.ipointerMod.IPointer.ValueType
import typingsJapgolly.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "generate_n")
@js.native
object generateN extends js.Object {
  def apply[ForwardIterator /* <: Writeonly[IForwardIterator[ValueType[ForwardIterator], ForwardIterator]] */](first: ForwardIterator, n: Double, gen: js.Function0[ValueType[ForwardIterator]]): ForwardIterator = js.native
}

