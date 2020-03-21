package typingsJapgolly.webcola.mod

import typingsJapgolly.webcola.linklengthsMod.LinkAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "stronglyConnectedComponents")
@js.native
object stronglyConnectedComponents extends js.Object {
  def apply[Link](numVertices: Double, edges: js.Array[Link], la: LinkAccessor[Link]): js.Array[js.Array[Double]] = js.native
}

