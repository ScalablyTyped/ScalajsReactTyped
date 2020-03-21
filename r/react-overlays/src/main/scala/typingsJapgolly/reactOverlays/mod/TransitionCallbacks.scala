package typingsJapgolly.reactOverlays.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionCallbacks extends js.Object {
  /**
    * Callback fired before the Overlay transitions in
    */
  var onEnter: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.undefined
  /**
    * Callback fired after the Overlay finishes transitioning in
    */
  var onEntered: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.undefined
  /**
    * Callback fired as the Overlay begins to transition in
    */
  var onEntering: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.undefined
  /**
    * Callback fired right before the Overlay transitions out
    */
  var onExit: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.undefined
  /**
    * Callback fired after the Overlay finishes transitioning out
    */
  var onExited: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.undefined
  /**
    * Callback fired as the Overlay begins to transition out
    */
  var onExiting: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.undefined
}

object TransitionCallbacks {
  @scala.inline
  def apply(
    onEnter: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onEntered: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onEntering: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onExit: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onExited: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onExiting: /* node */ HTMLElement => CallbackTo[js.Any] = null
  ): TransitionCallbacks = {
    val __obj = js.Dynamic.literal()
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onEnter(t0).runNow()))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onEntered(t0).runNow()))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onEntering(t0).runNow()))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onExit(t0).runNow()))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onExited(t0).runNow()))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onExiting(t0).runNow()))
    __obj.asInstanceOf[TransitionCallbacks]
  }
}

