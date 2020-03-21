package typingsJapgolly.atom.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLStyleElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleManager extends js.Object {
  // Reading Style Elements
  /** Get all loaded style elements. */
  def getStyleElements(): js.Array[HTMLStyleElement]
  // Paths
  /** Get the path of the user style sheet in ~/.atom. */
  def getUserStyleSheetPath(): String
  // Event Subscription
  /** Invoke callback for all current and future style elements. */
  def observeStyleElements(callback: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit]): Disposable
  /** Invoke callback when a style element is added. */
  def onDidAddStyleElement(callback: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit]): Disposable
  /** Invoke callback when a style element is removed. */
  def onDidRemoveStyleElement(callback: js.Function1[/* styleElement */ HTMLStyleElement, Unit]): Disposable
  /** Invoke callback when an existing style element is updated. */
  def onDidUpdateStyleElement(callback: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit]): Disposable
}

object StyleManager {
  @scala.inline
  def apply(
    getStyleElements: CallbackTo[js.Array[HTMLStyleElement]],
    getUserStyleSheetPath: CallbackTo[String],
    observeStyleElements: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit] => CallbackTo[Disposable],
    onDidAddStyleElement: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit] => CallbackTo[Disposable],
    onDidRemoveStyleElement: js.Function1[/* styleElement */ HTMLStyleElement, Unit] => CallbackTo[Disposable],
    onDidUpdateStyleElement: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit] => CallbackTo[Disposable]
  ): StyleManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStyleElements")(getStyleElements.toJsFn)
    __obj.updateDynamic("getUserStyleSheetPath")(getUserStyleSheetPath.toJsFn)
    __obj.updateDynamic("observeStyleElements")(js.Any.fromFunction1((t0: js.Function1[/* styleElement */ typingsJapgolly.atom.mod.StyleElementObservedEvent, scala.Unit]) => observeStyleElements(t0).runNow()))
    __obj.updateDynamic("onDidAddStyleElement")(js.Any.fromFunction1((t0: js.Function1[/* styleElement */ typingsJapgolly.atom.mod.StyleElementObservedEvent, scala.Unit]) => onDidAddStyleElement(t0).runNow()))
    __obj.updateDynamic("onDidRemoveStyleElement")(js.Any.fromFunction1((t0: js.Function1[/* styleElement */ org.scalajs.dom.raw.HTMLStyleElement, scala.Unit]) => onDidRemoveStyleElement(t0).runNow()))
    __obj.updateDynamic("onDidUpdateStyleElement")(js.Any.fromFunction1((t0: js.Function1[/* styleElement */ typingsJapgolly.atom.mod.StyleElementObservedEvent, scala.Unit]) => onDidUpdateStyleElement(t0).runNow()))
    __obj.asInstanceOf[StyleManager]
  }
}

