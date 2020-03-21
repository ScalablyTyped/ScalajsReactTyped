package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.Document_
import typingsJapgolly.std.WeakSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusableWrapper extends js.Object {
  var eventManager: EventManager
  var listenersCount: WeakSet[HTMLElement]
  var mainElement: HTMLElement
  var rootDocument: Document_
  def focus(): Unit
  def getFocusableElement(): HTMLElement
  def setFocusableElement(element: HTMLElement): Unit
  def useSecondaryElement(): Unit
}

object FocusableWrapper {
  @scala.inline
  def apply(
    eventManager: EventManager,
    focus: Callback,
    getFocusableElement: CallbackTo[HTMLElement],
    listenersCount: WeakSet[HTMLElement],
    mainElement: HTMLElement,
    rootDocument: Document_,
    setFocusableElement: HTMLElement => Callback,
    useSecondaryElement: Callback
  ): FocusableWrapper = {
    val __obj = js.Dynamic.literal(eventManager = eventManager.asInstanceOf[js.Any], listenersCount = listenersCount.asInstanceOf[js.Any], mainElement = mainElement.asInstanceOf[js.Any], rootDocument = rootDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.updateDynamic("getFocusableElement")(getFocusableElement.toJsFn)
    __obj.updateDynamic("setFocusableElement")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => setFocusableElement(t0).runNow()))
    __obj.updateDynamic("useSecondaryElement")(useSecondaryElement.toJsFn)
    __obj.asInstanceOf[FocusableWrapper]
  }
}

