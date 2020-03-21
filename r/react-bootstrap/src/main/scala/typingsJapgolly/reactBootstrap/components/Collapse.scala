package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.reactBootstrap.collapseMod.CollapseProps
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.height
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Collapse {
  def apply(
    dimension: height | width | js.Function0[String] = null,
    getDimensionValue: (/* dimension */ Double, /* element */ Element) => CallbackTo[Double] = null,
    in: js.UndefOr[Boolean] = js.undefined,
    onEnter: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onEntered: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onEntering: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onExit: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onExited: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onExiting: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    timeout: Int | Double = null,
    transitionAppear: js.UndefOr[Boolean] = js.undefined,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CollapseProps, typingsJapgolly.reactBootstrap.mod.Collapse, Unit, CollapseProps] = {
    val __obj = js.Dynamic.literal()
  
      if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (getDimensionValue != null) __obj.updateDynamic("getDimensionValue")(js.Any.fromFunction2((t0: /* dimension */ scala.Double, t1: /* element */ japgolly.scalajs.react.raw.React.Element) => getDimensionValue(t0, t1).runNow()))
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onEnter(t0).runNow()))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onEntered(t0).runNow()))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onEntering(t0).runNow()))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onExit(t0).runNow()))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onExited(t0).runNow()))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onExiting(t0).runNow()))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionAppear)) __obj.updateDynamic("transitionAppear")(transitionAppear.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrap.collapseMod.CollapseProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrap.mod.Collapse](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrap.collapseMod.CollapseProps])(children: _*)
  }
  @JSImport("react-bootstrap", "Collapse")
  @js.native
  object componentImport extends js.Object
  
}

