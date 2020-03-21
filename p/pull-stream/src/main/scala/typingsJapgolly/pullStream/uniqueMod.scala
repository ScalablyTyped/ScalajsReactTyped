package typingsJapgolly.pullStream

import typingsJapgolly.pullStream.mod.Through_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/throughs/unique", JSImport.Namespace)
@js.native
object uniqueMod extends js.Object {
  /**
    * Filter items that have a repeated value for `prop()`, by default, `prop = function (it) {return it }`, if `prop` is a string, it will filter nodes which have repeated values for that property.
    */
  def apply[InOut](): Through_[InOut, InOut] = js.native
  def apply[InOut](prop: String): Through_[InOut, InOut] = js.native
  def apply[InOut](prop: js.Function1[/* data */ InOut, _]): Through_[InOut, InOut] = js.native
}

