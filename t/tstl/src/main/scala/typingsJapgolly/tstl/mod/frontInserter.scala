package typingsJapgolly.tstl.mod

import typingsJapgolly.tstl.frontInsertIteratorMod.FrontInsertIterator.ValueType
import typingsJapgolly.tstl.ipushfrontMod.IPushFront
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "front_inserter")
@js.native
object frontInserter extends js.Object {
  def apply[Source /* <: IPushFront[ValueType[Source]] */](source: Source): typingsJapgolly.tstl.frontInsertIteratorMod.FrontInsertIterator[Source] = js.native
}

