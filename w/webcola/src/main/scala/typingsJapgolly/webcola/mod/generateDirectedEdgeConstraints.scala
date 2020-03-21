package typingsJapgolly.webcola.mod

import typingsJapgolly.webcola.linklengthsMod.IConstraint
import typingsJapgolly.webcola.linklengthsMod.LinkSepAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "generateDirectedEdgeConstraints")
@js.native
object generateDirectedEdgeConstraints extends js.Object {
  def apply[Link](n: Double, links: js.Array[Link], axis: String, la: LinkSepAccessor[Link]): js.Array[IConstraint] = js.native
}

