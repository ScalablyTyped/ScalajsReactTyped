package typingsJapgolly.atom.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Panel[T] extends js.Object {
  /** Whether or not the Panel is visible. */
  val visible: Boolean
  // Construction and Destruction
  /** Destroy and remove this panel from the UI. */
  def destroy(): Unit
  // Panel Details
  /** Returns the panel's item. */
  def getItem(): T
  /** Returns a number indicating this panel's priority. */
  def getPriority(): Double
  /** Hide this panel. */
  def hide(): Unit
  /** Returns a boolean true when the panel is visible. */
  def isVisible(): Boolean
  // Event Subscription
  /** Invoke the given callback when the pane hidden or shown. */
  def onDidChangeVisible(callback: js.Function1[/* visible */ Boolean, Unit]): Disposable
  /** Invoke the given callback when the pane is destroyed. */
  def onDidDestroy(callback: js.Function1[/* panel */ Panel[T], Unit]): Disposable
  /** Show this panel. */
  def show(): Unit
}

object Panel {
  @scala.inline
  def apply[T](
    destroy: Callback,
    getItem: CallbackTo[T],
    getPriority: CallbackTo[Double],
    hide: Callback,
    isVisible: CallbackTo[Boolean],
    onDidChangeVisible: js.Function1[/* visible */ Boolean, Unit] => CallbackTo[Disposable],
    onDidDestroy: js.Function1[/* panel */ Panel[T], Unit] => CallbackTo[Disposable],
    show: Callback,
    visible: Boolean
  ): Panel[T] = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("getItem")(getItem.toJsFn)
    __obj.updateDynamic("getPriority")(getPriority.toJsFn)
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("isVisible")(isVisible.toJsFn)
    __obj.updateDynamic("onDidChangeVisible")(js.Any.fromFunction1((t0: js.Function1[/* visible */ scala.Boolean, scala.Unit]) => onDidChangeVisible(t0).runNow()))
    __obj.updateDynamic("onDidDestroy")(js.Any.fromFunction1((t0: js.Function1[/* panel */ typingsJapgolly.atom.mod.Panel[T], scala.Unit]) => onDidDestroy(t0).runNow()))
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.asInstanceOf[Panel[T]]
  }
}

