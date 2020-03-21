package typingsJapgolly.tstl.mod

import typingsJapgolly.tstl.iforwarditeratorMod.IForwardIterator
import typingsJapgolly.tstl.iinsertMod.IInsert
import typingsJapgolly.tstl.ipointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "inserter")
@js.native
object inserter extends js.Object {
  def apply[Container /* <: IInsert[Iterator] */, Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */](container: Container, it: Iterator): typingsJapgolly.tstl.insertIteratorMod.InsertIterator[Container, Iterator] = js.native
}

