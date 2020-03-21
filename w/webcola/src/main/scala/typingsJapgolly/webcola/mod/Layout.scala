package typingsJapgolly.webcola.mod

import typingsJapgolly.webcola.AnonX
import typingsJapgolly.webcola.layoutMod.Group
import typingsJapgolly.webcola.layoutMod.Link
import typingsJapgolly.webcola.layoutMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "Layout")
@js.native
class Layout ()
  extends typingsJapgolly.webcola.layoutMod.Layout

/* static members */
@JSImport("webcola", "Layout")
@js.native
object Layout extends js.Object {
  var stopNode: js.Any = js.native
  var storeOffset: js.Any = js.native
  def drag(d: Group, position: AnonX): Unit = js.native
  def drag(d: Node, position: AnonX): Unit = js.native
  def dragEnd(d: js.Any): Unit = js.native
  def dragOrigin(d: Group): AnonX = js.native
  def dragOrigin(d: Node): AnonX = js.native
  def dragStart(d: Group): Unit = js.native
  def dragStart(d: Node): Unit = js.native
  def getSourceIndex(e: Link[Node | Double]): Double = js.native
  def getTargetIndex(e: Link[Node | Double]): Double = js.native
  def linkId(e: Link[Node | Double]): String = js.native
  def mouseOut(d: js.Any): Unit = js.native
  def mouseOver(d: js.Any): Unit = js.native
  def setLinkLength(link: Link[Node | Double], length: Double): Unit = js.native
}

