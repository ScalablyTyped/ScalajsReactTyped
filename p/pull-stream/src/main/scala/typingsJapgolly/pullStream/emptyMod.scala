package typingsJapgolly.pullStream

import typingsJapgolly.pullStream.mod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/sources/empty", JSImport.Namespace)
@js.native
object emptyMod extends js.Object {
  /**
    * Create a stream with no contents (it just ends immediately).
    */
  def apply(): Source[scala.Nothing] = js.native
}

