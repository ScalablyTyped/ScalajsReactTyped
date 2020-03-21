package typingsJapgolly.reactGamepad.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * Threshold below which the axis values will be rounded to 0.0 Default: 0.08
    */
  var deadZone: js.UndefOr[Double] = js.undefined
  /**
    * The index of the gamepad to use, from 0 to 4 Default: 0
    */
  var gamepadIndex: js.UndefOr[Double] = js.undefined
  /**
    * Layout to use, from Gamepad.layouts. For now, only Gamepad.layouts.XBOX exists Default: Gamepad.layouts.XBOX
    */
  var layout: js.UndefOr[Layout] = js.undefined
  /**
    * triggered when the A button is pressed.
    */
  var onA: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * triggered when an axis is changed.
    */
  var onAxisChange: js.UndefOr[
    js.Function3[/* axisName */ Axis, /* value */ Double, /* previousValue */ Double, Unit]
  ] = js.undefined
  /**
    * triggered when the B button is pressed.
    */
  var onB: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * triggered when a button is pushed or released.
    */
  var onButtonChange: js.UndefOr[js.Function2[/* buttonName */ Button, /* pressed */ Boolean, Unit]] = js.undefined
  /**
    * triggered when a button is pushed.
    */
  var onButtonDown: js.UndefOr[js.Function1[/* buttonName */ Button, Unit]] = js.undefined
  /**
    * triggered when a button is released.
    */
  var onButtonUp: js.UndefOr[js.Function1[/* buttonName */ Button, Unit]] = js.undefined
  /**
    * triggered when the gamepad connects. Will be Triggered at least once after the Gamepad component is mounted.
    */
  var onConnect: js.UndefOr[js.Function1[/* gamepadIndex */ Double, Unit]] = js.undefined
  /**
    * triggered when the gamepad disconnects.
    */
  var onDisconnect: js.UndefOr[js.Function1[/* gamepadIndex */ Double, Unit]] = js.undefined
  /**
    * Triggered when the D Pad Down button is pressed or the Left Stick is pushed down (above stickThreshold).
    */
  var onDown: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Triggered when the LB button is pressed.
    */
  var onLB: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Triggered when the LS button is pressed.
    */
  var onLS: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Triggered when the LT button is pressed.
    */
  var onLT: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Triggered when the D Pad Left button is pressed or the Left Stick is pushed left (above stickThreshold).
    */
  var onLeft: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Triggered when the RB button is pressed.
    */
  var onRB: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Triggered when the RS button is pressed.
    */
  var onRS: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Triggered when the RT button is pressed.
    */
  var onRT: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Triggered when the D Pad Right button is pressed or the Left Stick is pushed right (above stickThreshold).
    */
  var onRight: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Triggered when the D Pad Up button is pressed or the Left Stick is pushed up (above stickThreshold).
    */
  var onUp: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * triggered when the X button is pressed.
    */
  var onX: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Triggered when the Y button is pressed.
    */
  var onY: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Threshold above which onUp, onDown,onLeft,onRight are Triggered for the left stick Default: 0.75
    */
  var stickThreshold: js.UndefOr[Double] = js.undefined
}

object Props {
  @scala.inline
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
    stickThreshold: Int | Double = null
  ): Props = {
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
    __obj.asInstanceOf[Props]
  }
}

