package typingsJapgolly.handsontable.mod.Handsontable

import org.scalajs.dom.raw.CSSRule
import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLIFrameElement
import typingsJapgolly.handsontable.mod.Handsontable.wot.OverlayType
import typingsJapgolly.std.Document_
import typingsJapgolly.std.Event_
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dom extends js.Object {
  var HTML_CHARACTERS: js.RegExp = js.native
  def addClass(element: HTMLElement, className: String): Unit = js.native
  def addClass(element: HTMLElement, className: js.Array[_]): Unit = js.native
  def addEvent(element: HTMLElement, event: String, callback: js.Function1[/* event */ Event_, Unit]): Unit = js.native
  def clearTextSelection(): Unit = js.native
  def clearTextSelection(rootWindow: Window_): Unit = js.native
  def closest(element: HTMLElement, nodes: js.Array[_]): HTMLElement | Unit = js.native
  def closest(element: HTMLElement, nodes: js.Array[_], until: HTMLElement): HTMLElement | Unit = js.native
  def closestDown(element: HTMLElement, nodes: js.Array[_]): HTMLElement | Unit = js.native
  def closestDown(element: HTMLElement, nodes: js.Array[_], until: HTMLElement): HTMLElement | Unit = js.native
  def empty(element: HTMLElement): Unit = js.native
  def fastInnerHTML(element: HTMLElement, content: String): Unit = js.native
  def fastInnerText(element: HTMLElement, content: String): Unit = js.native
  def getCaretPosition(el: HTMLElement): Double = js.native
  def getComputedStyle(element: HTMLElement): CSSStyleDeclaration | js.Object = js.native
  def getComputedStyle(element: HTMLElement, rootWindow: Window_): CSSStyleDeclaration | js.Object = js.native
  def getCssTransform(element: HTMLElement): Double | Unit = js.native
  def getFrameElement(frame: Window_): HTMLIFrameElement | Null = js.native
  def getParent(element: HTMLElement): HTMLElement | Unit = js.native
  def getParent(element: HTMLElement, level: Double): HTMLElement | Unit = js.native
  def getParentWindow(frame: Window_): Window_ | Null = js.native
  def getScrollLeft(element: HTMLElement): Double = js.native
  def getScrollLeft(element: HTMLElement, rootWindow: Window_): Double = js.native
  def getScrollTop(element: HTMLElement): Double = js.native
  def getScrollTop(element: HTMLElement, rootWindow: Window_): Double = js.native
  def getScrollableElement(element: HTMLElement): HTMLElement = js.native
  def getScrollbarWidth(): Double = js.native
  def getScrollbarWidth(rootDocument: Document_): Double = js.native
  def getSelectionEndPosition(el: HTMLElement): Double = js.native
  def getSelectionText(): String = js.native
  def getSelectionText(rootWindow: Window_): String = js.native
  def getStyle(element: HTMLElement, prop: String): String = js.native
  def getStyle(element: HTMLElement, prop: String, rootWindow: Window_): String = js.native
  def getTrimmingContainer(base: HTMLElement): HTMLElement = js.native
  def getWindowScrollLeft(): Double = js.native
  def getWindowScrollLeft(rootWindow: Window_): Double = js.native
  def getWindowScrollTop(): Double = js.native
  def getWindowScrollTop(rootWindow: Window_): Double = js.native
  def hasAccessToParentWindow(frame: Window_): Boolean = js.native
  def hasClass(element: HTMLElement, className: String): Boolean = js.native
  def hasHorizontalScrollbar(element: HTMLElement): Boolean = js.native
  def hasVerticalScrollbar(element: HTMLElement): Boolean = js.native
  def index(element: Element): Double = js.native
  def innerHeight(element: HTMLElement): Double = js.native
  def innerWidth(element: HTMLElement): Double = js.native
  def isChildOf(child: HTMLElement, parent: String): Boolean = js.native
  def isChildOf(child: HTMLElement, parent: js.Object): Boolean = js.native
  def isChildOfWebComponentTable(element: Element): Boolean = js.native
  def isImmediatePropagationStopped(event: Event_): Boolean = js.native
  def isInput(element: HTMLElement): Boolean = js.native
  def isLeftClick(event: Event_): Boolean = js.native
  def isOutsideInput(element: HTMLElement): Boolean = js.native
  def isRightClick(event: Event_): Boolean = js.native
  def isVisible(elem: HTMLElement): Boolean = js.native
  def matchesCSSRules(elem: HTMLElement, rule: CSSRule): Boolean = js.native
  def offset(elem: HTMLElement): js.Object = js.native
  def outerHeight(elem: HTMLElement): Double = js.native
  def outerWidth(element: HTMLElement): Double = js.native
  def overlayContainsElement(overlayType: OverlayType, element: HTMLElement, root: HTMLElement): Boolean = js.native
  def pageX(event: Event_): Double = js.native
  def pageY(event: Event_): Double = js.native
  def polymerUnwrap(element: HTMLElement): js.Any | Unit = js.native
  def polymerWrap(element: HTMLElement): js.Any | Unit = js.native
  def removeClass(element: HTMLElement, className: String): Unit = js.native
  def removeClass(element: HTMLElement, className: js.Array[_]): Unit = js.native
  def removeEvent(element: HTMLElement, event: String, callback: js.Function0[Unit]): Unit = js.native
  def removeTextNodes(element: HTMLElement, parent: HTMLElement): Unit = js.native
  def resetCssTransform(element: HTMLElement): Unit = js.native
  def setCaretPosition(element: HTMLElement, pos: Double, endPos: Double): Unit = js.native
  def setOverlayPosition(overlayElem: HTMLElement, left: Double, top: Double): Unit = js.native
  def stopImmediatePropagation(event: Event_): Unit = js.native
  def stopPropagation(event: Event_): Unit = js.native
}

