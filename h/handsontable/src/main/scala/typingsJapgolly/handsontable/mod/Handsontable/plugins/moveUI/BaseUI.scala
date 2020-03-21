package typingsJapgolly.handsontable.mod.Handsontable.plugins.moveUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseUI extends js.Object {
  var hot: Core
  var state: Double
  def appendTo(wrapper: HTMLElement): Unit
  def build(): Unit
  def destroy(): Unit
  def getOffset(): js.Object
  def getPosition(): js.Object
  def getSize(): js.Object
  def isAppended(): Boolean
  def isBuilt(): Boolean
  def setOffset(top: Double, left: Double): Unit
  def setPosition(top: Double, left: Double): Unit
  def setSize(width: Double, height: Double): Unit
}

object BaseUI {
  @scala.inline
  def apply(
    appendTo: HTMLElement => Callback,
    build: Callback,
    destroy: Callback,
    getOffset: CallbackTo[js.Object],
    getPosition: CallbackTo[js.Object],
    getSize: CallbackTo[js.Object],
    hot: Core,
    isAppended: CallbackTo[Boolean],
    isBuilt: CallbackTo[Boolean],
    setOffset: (Double, Double) => Callback,
    setPosition: (Double, Double) => Callback,
    setSize: (Double, Double) => Callback,
    state: Double
  ): BaseUI = {
    val __obj = js.Dynamic.literal(hot = hot.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("appendTo")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => appendTo(t0).runNow()))
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("getOffset")(getOffset.toJsFn)
    __obj.updateDynamic("getPosition")(getPosition.toJsFn)
    __obj.updateDynamic("getSize")(getSize.toJsFn)
    __obj.updateDynamic("isAppended")(isAppended.toJsFn)
    __obj.updateDynamic("isBuilt")(isBuilt.toJsFn)
    __obj.updateDynamic("setOffset")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => setOffset(t0, t1).runNow()))
    __obj.updateDynamic("setPosition")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => setPosition(t0, t1).runNow()))
    __obj.updateDynamic("setSize")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => setSize(t0, t1).runNow()))
    __obj.asInstanceOf[BaseUI]
  }
}

