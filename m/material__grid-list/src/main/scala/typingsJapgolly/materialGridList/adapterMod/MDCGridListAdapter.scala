package typingsJapgolly.materialGridList.adapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCGridListAdapter extends js.Object {
  def deregisterResizeHandler(handler: EventListener): Unit
  def getNumberOfTiles(): Double
  def getOffsetWidth(): Double
  def getOffsetWidthForTileAtIndex(index: Double): Double
  def registerResizeHandler(handler: EventListener): Unit
  def setStyleForTilesElement(property: String, value: String): Unit
}

object MDCGridListAdapter {
  @scala.inline
  def apply(
    deregisterResizeHandler: EventListener => Callback,
    getNumberOfTiles: CallbackTo[Double],
    getOffsetWidth: CallbackTo[Double],
    getOffsetWidthForTileAtIndex: Double => CallbackTo[Double],
    registerResizeHandler: EventListener => Callback,
    setStyleForTilesElement: (String, String) => Callback
  ): MDCGridListAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deregisterResizeHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => deregisterResizeHandler(t0).runNow()))
    __obj.updateDynamic("getNumberOfTiles")(getNumberOfTiles.toJsFn)
    __obj.updateDynamic("getOffsetWidth")(getOffsetWidth.toJsFn)
    __obj.updateDynamic("getOffsetWidthForTileAtIndex")(js.Any.fromFunction1((t0: scala.Double) => getOffsetWidthForTileAtIndex(t0).runNow()))
    __obj.updateDynamic("registerResizeHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => registerResizeHandler(t0).runNow()))
    __obj.updateDynamic("setStyleForTilesElement")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setStyleForTilesElement(t0, t1).runNow()))
    __obj.asInstanceOf[MDCGridListAdapter]
  }
}

