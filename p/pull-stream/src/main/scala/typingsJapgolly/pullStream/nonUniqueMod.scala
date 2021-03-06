package typingsJapgolly.pullStream

import typingsJapgolly.pullStream.mod.Through_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/throughs/non-unique", JSImport.Namespace)
@js.native
object nonUniqueMod extends js.Object {
  /**
    * Filter unique items -- get the duplicates. The inverse of `unique`.
    */
  def apply[InOut](): Through_[InOut, InOut] = js.native
  def apply[InOut](prop: String): Through_[InOut, InOut] = js.native
  def apply[InOut](prop: js.Function1[/* data */ InOut, _]): Through_[InOut, InOut] = js.native
}

