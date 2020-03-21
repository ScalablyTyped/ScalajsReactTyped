package typingsJapgolly.atom.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gutter extends js.Object {
  /**
    *  Add a decoration that tracks a DisplayMarker. When the marker moves, is
    *  invalidated, or is destroyed, the decoration will be updated to reflect
    *  the marker's state.
    */
  def decorateMarker(marker: DisplayMarker, decorationParams: DecorationOptions): Decoration
  // Gutter Destruction
  /** Destroys the gutter. */
  def destroy(): Unit
  // Visibility
  /** Hide the gutter. */
  def hide(): Unit
  /** Determine whether the gutter is visible. */
  def isVisible(): Boolean
  // Event Subscription
  /** Calls your callback when the gutter's visibility changes. */
  def onDidChangeVisible(callback: js.Function1[/* gutter */ this.type, Unit]): Disposable
  /** Calls your callback when the gutter is destroyed. */
  def onDidDestroy(callback: js.Function0[Unit]): Disposable
  /** Show the gutter. */
  def show(): Unit
}

object Gutter {
  @scala.inline
  def apply(
    decorateMarker: (DisplayMarker, DecorationOptions) => CallbackTo[Decoration],
    destroy: Callback,
    hide: Callback,
    isVisible: CallbackTo[Boolean],
    onDidChangeVisible: js.Function1[Gutter, Unit] => CallbackTo[Disposable],
    onDidDestroy: js.Function0[Unit] => CallbackTo[Disposable],
    show: Callback
  ): Gutter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decorateMarker")(js.Any.fromFunction2((t0: typingsJapgolly.atom.mod.DisplayMarker, t1: typingsJapgolly.atom.mod.DecorationOptions) => decorateMarker(t0, t1).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("isVisible")(isVisible.toJsFn)
    __obj.updateDynamic("onDidChangeVisible")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.atom.mod.Gutter, scala.Unit]) => onDidChangeVisible(t0).runNow()))
    __obj.updateDynamic("onDidDestroy")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => onDidDestroy(t0).runNow()))
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.asInstanceOf[Gutter]
  }
}

