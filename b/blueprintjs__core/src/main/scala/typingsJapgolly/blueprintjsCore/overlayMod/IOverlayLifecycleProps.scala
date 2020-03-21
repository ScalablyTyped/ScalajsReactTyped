package typingsJapgolly.blueprintjsCore.overlayMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOverlayLifecycleProps extends js.Object {
  /**
    * Lifecycle method invoked just after the CSS _close_ transition ends but
    * before the child has been removed from the DOM. Receives the DOM element
    * of the child being closed.
    */
  var onClosed: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  /**
    * Lifecycle method invoked just before the CSS _close_ transition begins on
    * a child. Receives the DOM element of the child being closed.
    */
  var onClosing: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  /**
    * Lifecycle method invoked just after the CSS _open_ transition ends.
    * Receives the DOM element of the child being opened.
    */
  var onOpened: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  /**
    * Lifecycle method invoked just after mounting the child in the DOM but
    * just before the CSS _open_ transition begins. Receives the DOM element of
    * the child being opened.
    */
  var onOpening: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
}

object IOverlayLifecycleProps {
  @scala.inline
  def apply(
    onClosed: /* node */ HTMLElement => Callback = null,
    onClosing: /* node */ HTMLElement => Callback = null,
    onOpened: /* node */ HTMLElement => Callback = null,
    onOpening: /* node */ HTMLElement => Callback = null
  ): IOverlayLifecycleProps = {
    val __obj = js.Dynamic.literal()
    if (onClosed != null) __obj.updateDynamic("onClosed")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onClosed(t0).runNow()))
    if (onClosing != null) __obj.updateDynamic("onClosing")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onClosing(t0).runNow()))
    if (onOpened != null) __obj.updateDynamic("onOpened")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onOpened(t0).runNow()))
    if (onOpening != null) __obj.updateDynamic("onOpening")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onOpening(t0).runNow()))
    __obj.asInstanceOf[IOverlayLifecycleProps]
  }
}

