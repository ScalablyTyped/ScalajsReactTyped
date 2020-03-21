package typingsJapgolly.tstl.mod

import typingsJapgolly.tstl.generalMod.General
import typingsJapgolly.tstl.ipointerMod.IPointer.ValueType
import typingsJapgolly.tstl.irandomaccessiteratorMod.IRandomAccessIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "shuffle")
@js.native
object shuffle extends js.Object {
  def apply[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
}

