package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Starting point for device-dependent ad group configurations. */
trait AdGroupDevices extends StObject {
  
  /** Clears the desktop bid modifier for this ad group. */
  def clearDesktopBidModifier(): Unit
  
  /** Clears the mobile bid modifier for this ad group. */
  def clearMobileBidModifier(): Unit
  
  /** Clears the tablet bid modifier for this ad group. */
  def clearTabletBidModifier(): Unit
  
  /** Returns the desktop bid modifier for this ad group. */
  def getDesktopBidModifier(): Double
  
  /** Returns the mobile bid modifier for this ad group. */
  def getMobileBidModifier(): Double
  
  /** Returns the tablet bid modifier for this ad group. */
  def getTabletBidModifier(): Double
  
  /** Sets the desktop bid modifier for this ad group to the specified value. */
  def setDesktopBidModifier(modifier: Double): Unit
  
  /** Sets the mobile bid modifier for this ad group to the specified value. */
  def setMobileBidModifier(modifier: Double): Unit
  
  /** Sets the tablet bid modifier for this ad group to the specified value. */
  def setTabletBidModifier(modifier: Double): Unit
}
object AdGroupDevices {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(clearDesktopBidModifier = clearDesktopBidModifier.toJsFn, clearMobileBidModifier = clearMobileBidModifier.toJsFn, clearTabletBidModifier = clearTabletBidModifier.toJsFn, getDesktopBidModifier = getDesktopBidModifier.toJsFn, getMobileBidModifier = getMobileBidModifier.toJsFn, getTabletBidModifier = getTabletBidModifier.toJsFn, setDesktopBidModifier = js.Any.fromFunction1((t0: Double) => setDesktopBidModifier(t0).runNow()), setMobileBidModifier = js.Any.fromFunction1((t0: Double) => setMobileBidModifier(t0).runNow()), setTabletBidModifier = js.Any.fromFunction1((t0: Double) => setTabletBidModifier(t0).runNow()))
    __obj.asInstanceOf[AdGroupDevices]
  }
  
  extension [Self <: AdGroupDevices](x: Self) {
    
    inline def setClearDesktopBidModifier(value: Callback): Self = StObject.set(x, "clearDesktopBidModifier", value.toJsFn)
    
    inline def setClearMobileBidModifier(value: Callback): Self = StObject.set(x, "clearMobileBidModifier", value.toJsFn)
    
    inline def setClearTabletBidModifier(value: Callback): Self = StObject.set(x, "clearTabletBidModifier", value.toJsFn)
    
    inline def setGetDesktopBidModifier(value: CallbackTo[Double]): Self = StObject.set(x, "getDesktopBidModifier", value.toJsFn)
    
    inline def setGetMobileBidModifier(value: CallbackTo[Double]): Self = StObject.set(x, "getMobileBidModifier", value.toJsFn)
    
    inline def setGetTabletBidModifier(value: CallbackTo[Double]): Self = StObject.set(x, "getTabletBidModifier", value.toJsFn)
    
    inline def setSetDesktopBidModifier(value: Double => Callback): Self = StObject.set(x, "setDesktopBidModifier", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMobileBidModifier(value: Double => Callback): Self = StObject.set(x, "setMobileBidModifier", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetTabletBidModifier(value: Double => Callback): Self = StObject.set(x, "setTabletBidModifier", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
