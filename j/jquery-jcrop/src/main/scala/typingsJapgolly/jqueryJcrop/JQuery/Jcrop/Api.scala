package typingsJapgolly.jqueryJcrop.JQuery.Jcrop

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Api extends js.Object {
  /** Animate selection to new selection, format: [ x,y,x2,y2 ] */
  def animateTo(selection: js.Tuple4[Double, Double, Double, Double]): Unit
  /** Disables Jcrop interactivity */
  def disable(): Unit
  /** Enables Jcrop interactivity */
  def enable(): Unit
  /** Release current selection */
  def release(): Unit
  /** Remove Jcrop entirely */
  def remove(): Unit
  /** Set selection, format: [ x,y,x2,y2 ] */
  def setSelect(selection: js.Tuple4[Double, Double, Double, Double]): Unit
  /** Query current selection values (interface)  */
  def tellScaled(): SelectionInfo
  /** Query current selection values (true size) */
  def tellSelect(): SelectionInfo
}

object Api {
  @scala.inline
  def apply(
    animateTo: js.Tuple4[Double, Double, Double, Double] => Callback,
    disable: Callback,
    enable: Callback,
    release: Callback,
    remove: Callback,
    setSelect: js.Tuple4[Double, Double, Double, Double] => Callback,
    tellScaled: CallbackTo[SelectionInfo],
    tellSelect: CallbackTo[SelectionInfo]
  ): Api = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("animateTo")(js.Any.fromFunction1((t0: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) => animateTo(t0).runNow()))
    __obj.updateDynamic("disable")(disable.toJsFn)
    __obj.updateDynamic("enable")(enable.toJsFn)
    __obj.updateDynamic("release")(release.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.updateDynamic("setSelect")(js.Any.fromFunction1((t0: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) => setSelect(t0).runNow()))
    __obj.updateDynamic("tellScaled")(tellScaled.toJsFn)
    __obj.updateDynamic("tellSelect")(tellSelect.toJsFn)
    __obj.asInstanceOf[Api]
  }
}

