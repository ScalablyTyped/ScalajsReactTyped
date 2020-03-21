package typingsJapgolly.reactBootstrap.collapseMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.reactBootstrap.mod.TransitionCallbacks
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.height
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapseProps
  extends ClassAttributes[Collapse]
     with TransitionCallbacks {
  var dimension: js.UndefOr[height | width | js.Function0[String]] = js.undefined
  var getDimensionValue: js.UndefOr[js.Function2[/* dimension */ Double, /* element */ Element, Double]] = js.undefined
  var in: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var transitionAppear: js.UndefOr[Boolean] = js.undefined
  var unmountOnExit: js.UndefOr[Boolean] = js.undefined
}

object CollapseProps {
  @scala.inline
  def apply(
    dimension: height | width | js.Function0[String] = null,
    getDimensionValue: (/* dimension */ Double, /* element */ Element) => CallbackTo[Double] = null,
    in: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    onEnter: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onEntered: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onEntering: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onExit: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onExited: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onExiting: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    ref: LegacyRef[Collapse] = null,
    timeout: Int | Double = null,
    transitionAppear: js.UndefOr[Boolean] = js.undefined,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined
  ): CollapseProps = {
    val __obj = js.Dynamic.literal()
    if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (getDimensionValue != null) __obj.updateDynamic("getDimensionValue")(js.Any.fromFunction2((t0: /* dimension */ scala.Double, t1: /* element */ japgolly.scalajs.react.raw.React.Element) => getDimensionValue(t0, t1).runNow()))
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onEnter(t0).runNow()))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onEntered(t0).runNow()))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onEntering(t0).runNow()))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onExit(t0).runNow()))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onExited(t0).runNow()))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onExiting(t0).runNow()))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionAppear)) __obj.updateDynamic("transitionAppear")(transitionAppear.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapseProps]
  }
}

