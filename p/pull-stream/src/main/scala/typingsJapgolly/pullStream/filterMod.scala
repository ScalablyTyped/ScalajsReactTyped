package typingsJapgolly.pullStream

import typingsJapgolly.pullStream.mod.Through_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/throughs/filter", JSImport.Namespace)
@js.native
object filterMod extends js.Object {
  def apply[InOut](test: js.Function1[/* data */ InOut, Boolean]): Through_[InOut, InOut] = js.native
}

