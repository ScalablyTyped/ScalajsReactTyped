package typingsJapgolly.flatpickr

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.flatpickr.globalsMod._Global_.HTMLElement
import typingsJapgolly.std.Event_
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flatpickr/dist/utils/dom", JSImport.Namespace)
@js.native
object domMod extends js.Object {
  def clearNode(node: HTMLElement): Unit = js.native
  def createElement[T /* <: HTMLElement */](
    tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any,
    className: String
  ): T = js.native
  def createElement[T /* <: HTMLElement */](
    tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any,
    className: String,
    content: String
  ): T = js.native
  def createNumberInput(inputClassName: String): HTMLDivElement = js.native
  def createNumberInput(inputClassName: String, opts: Record[String, _]): HTMLDivElement = js.native
  def findParent(node: Element, condition: js.Function1[/* n */ Element, Boolean]): js.UndefOr[Element] = js.native
  def getEventTarget(event: Event_): EventTarget | Null = js.native
  def toggleClass(elem: HTMLElement, className: String, bool: Boolean): Unit = js.native
}

