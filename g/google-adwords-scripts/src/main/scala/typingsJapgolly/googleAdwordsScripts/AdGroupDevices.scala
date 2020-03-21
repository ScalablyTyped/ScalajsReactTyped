package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdGroupDevices extends js.Object {
  def clearDesktopBidModifier(): Unit
  def clearMobileBidModifier(): Unit
  def clearTabletBidModifier(): Unit
  def getDesktopBidModifier(): Double
  def getMobileBidModifier(): Double
  def getTabletBidModifier(): Double
  def setDesktopBidModifier(modifier: Double): Unit
  def setMobileBidModifier(modifier: Double): Unit
  def setTabletBidModifier(modifier: Double): Unit
}

object AdGroupDevices {
  @scala.inline
  def apply(
    clearDesktopBidModifier: Callback,
    clearMobileBidModifier: Callback,
    clearTabletBidModifier: Callback,
    getDesktopBidModifier: CallbackTo[Double],
    getMobileBidModifier: CallbackTo[Double],
    getTabletBidModifier: CallbackTo[Double],
    setDesktopBidModifier: Double => Callback,
    setMobileBidModifier: Double => Callback,
    setTabletBidModifier: Double => Callback
  ): AdGroupDevices = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearDesktopBidModifier")(clearDesktopBidModifier.toJsFn)
    __obj.updateDynamic("clearMobileBidModifier")(clearMobileBidModifier.toJsFn)
    __obj.updateDynamic("clearTabletBidModifier")(clearTabletBidModifier.toJsFn)
    __obj.updateDynamic("getDesktopBidModifier")(getDesktopBidModifier.toJsFn)
    __obj.updateDynamic("getMobileBidModifier")(getMobileBidModifier.toJsFn)
    __obj.updateDynamic("getTabletBidModifier")(getTabletBidModifier.toJsFn)
    __obj.updateDynamic("setDesktopBidModifier")(js.Any.fromFunction1((t0: scala.Double) => setDesktopBidModifier(t0).runNow()))
    __obj.updateDynamic("setMobileBidModifier")(js.Any.fromFunction1((t0: scala.Double) => setMobileBidModifier(t0).runNow()))
    __obj.updateDynamic("setTabletBidModifier")(js.Any.fromFunction1((t0: scala.Double) => setTabletBidModifier(t0).runNow()))
    __obj.asInstanceOf[AdGroupDevices]
  }
}

