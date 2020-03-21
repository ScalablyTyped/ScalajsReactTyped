package typingsJapgolly.reactGamepad.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactGamepad.mod.Axis
import typingsJapgolly.reactGamepad.mod.Button
import typingsJapgolly.reactGamepad.mod.Layout
import typingsJapgolly.reactGamepad.mod.Props
import typingsJapgolly.reactGamepad.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactGamepad {
  def apply(
    deadZone: Int | Double = null,
    gamepadIndex: Int | Double = null,
    layout: Layout = null,
    onA: js.UndefOr[Callback] = js.undefined,
    onAxisChange: (/* axisName */ Axis, /* value */ Double, /* previousValue */ Double) => Callback = null,
    onB: js.UndefOr[Callback] = js.undefined,
    onButtonChange: (/* buttonName */ Button, /* pressed */ Boolean) => Callback = null,
    onButtonDown: /* buttonName */ Button => Callback = null,
    onButtonUp: /* buttonName */ Button => Callback = null,
    onConnect: /* gamepadIndex */ Double => Callback = null,
    onDisconnect: /* gamepadIndex */ Double => Callback = null,
    onDown: js.UndefOr[Callback] = js.undefined,
    onLB: js.UndefOr[Callback] = js.undefined,
    onLS: js.UndefOr[Callback] = js.undefined,
    onLT: js.UndefOr[Callback] = js.undefined,
    onLeft: js.UndefOr[Callback] = js.undefined,
    onRB: js.UndefOr[Callback] = js.undefined,
    onRS: js.UndefOr[Callback] = js.undefined,
    onRT: js.UndefOr[Callback] = js.undefined,
    onRight: js.UndefOr[Callback] = js.undefined,
    onUp: js.UndefOr[Callback] = js.undefined,
    onX: js.UndefOr[Callback] = js.undefined,
    onY: js.UndefOr[Callback] = js.undefined,
    stickThreshold: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      if (deadZone != null) __obj.updateDynamic("deadZone")(deadZone.asInstanceOf[js.Any])
    if (gamepadIndex != null) __obj.updateDynamic("gamepadIndex")(gamepadIndex.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    onA.foreach(p => __obj.updateDynamic("onA")(p.toJsFn))
    if (onAxisChange != null) __obj.updateDynamic("onAxisChange")(js.Any.fromFunction3((t0: /* axisName */ typingsJapgolly.reactGamepad.mod.Axis, t1: /* value */ scala.Double, t2: /* previousValue */ scala.Double) => onAxisChange(t0, t1, t2).runNow()))
    onB.foreach(p => __obj.updateDynamic("onB")(p.toJsFn))
    if (onButtonChange != null) __obj.updateDynamic("onButtonChange")(js.Any.fromFunction2((t0: /* buttonName */ typingsJapgolly.reactGamepad.mod.Button, t1: /* pressed */ scala.Boolean) => onButtonChange(t0, t1).runNow()))
    if (onButtonDown != null) __obj.updateDynamic("onButtonDown")(js.Any.fromFunction1((t0: /* buttonName */ typingsJapgolly.reactGamepad.mod.Button) => onButtonDown(t0).runNow()))
    if (onButtonUp != null) __obj.updateDynamic("onButtonUp")(js.Any.fromFunction1((t0: /* buttonName */ typingsJapgolly.reactGamepad.mod.Button) => onButtonUp(t0).runNow()))
    if (onConnect != null) __obj.updateDynamic("onConnect")(js.Any.fromFunction1((t0: /* gamepadIndex */ scala.Double) => onConnect(t0).runNow()))
    if (onDisconnect != null) __obj.updateDynamic("onDisconnect")(js.Any.fromFunction1((t0: /* gamepadIndex */ scala.Double) => onDisconnect(t0).runNow()))
    onDown.foreach(p => __obj.updateDynamic("onDown")(p.toJsFn))
    onLB.foreach(p => __obj.updateDynamic("onLB")(p.toJsFn))
    onLS.foreach(p => __obj.updateDynamic("onLS")(p.toJsFn))
    onLT.foreach(p => __obj.updateDynamic("onLT")(p.toJsFn))
    onLeft.foreach(p => __obj.updateDynamic("onLeft")(p.toJsFn))
    onRB.foreach(p => __obj.updateDynamic("onRB")(p.toJsFn))
    onRS.foreach(p => __obj.updateDynamic("onRS")(p.toJsFn))
    onRT.foreach(p => __obj.updateDynamic("onRT")(p.toJsFn))
    onRight.foreach(p => __obj.updateDynamic("onRight")(p.toJsFn))
    onUp.foreach(p => __obj.updateDynamic("onUp")(p.toJsFn))
    onX.foreach(p => __obj.updateDynamic("onX")(p.toJsFn))
    onY.foreach(p => __obj.updateDynamic("onY")(p.toJsFn))
    if (stickThreshold != null) __obj.updateDynamic("stickThreshold")(stickThreshold.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactGamepad.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactGamepad.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactGamepad.mod.Props])(children: _*)
  }
  @JSImport("react-gamepad", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

