package typingsJapgolly.rcMenu

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-menu/lib/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  val menuAllProps: js.Array[String] = js.native
  def getKeyFromChildrenIndex(child: Element, menuEventKey: Key, index: Double): Key = js.native
  def getMenuIdFromSubMenuEventKey(eventKey: String): Key = js.native
  def getWidth(elem: HTMLElement): Double = js.native
  def isMobileDevice(): Boolean = js.native
  def loopMenuItem(children: Node, cb: js.Function2[/* node */ Element, /* index */ Double, Unit]): Unit = js.native
  def loopMenuItemRecursively(children: Node, keys: js.Array[String], ret: AnonFind): Unit = js.native
  def noop(): Unit = js.native
  def setStyle(
    elem: HTMLElement,
    styleProperty: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 759 */ js.Any,
    value: String
  ): Unit = js.native
  def setStyle(
    elem: HTMLElement,
    styleProperty: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 759 */ js.Any,
    value: Double
  ): Unit = js.native
}

