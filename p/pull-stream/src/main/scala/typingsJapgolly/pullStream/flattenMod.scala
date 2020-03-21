package typingsJapgolly.pullStream

import typingsJapgolly.pullStream.mod.Source
import typingsJapgolly.pullStream.mod.Through_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/throughs/flatten", JSImport.Namespace)
@js.native
object flattenMod extends js.Object {
  /**
    * Turn a stream of streams or a stream of arrays into a stream of their items, (undoes group).
    */
  def apply[Out](): Through_[js.Array[Out | Source[Out] | (Through_[_, Out])], Out] = js.native
}

