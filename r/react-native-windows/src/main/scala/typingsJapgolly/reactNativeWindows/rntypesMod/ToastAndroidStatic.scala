package typingsJapgolly.reactNativeWindows.rntypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastAndroidStatic extends StObject {
  
  var BOTTOM: Double
  
  var CENTER: Double
  
  var LONG: Double
  
  // Toast duration constants
  var SHORT: Double
  
  // Toast gravity constants
  var TOP: Double
  
  /**
    * String message: A string with the text to toast
    * int duration: The duration of the toast.
    * May be ToastAndroid.SHORT or ToastAndroid.LONG
    */
  def show(message: String, duration: Double): Unit
  
  /** `gravity` may be ToastAndroid.TOP, ToastAndroid.BOTTOM, ToastAndroid.CENTER */
  def showWithGravity(message: String, duration: Double, gravity: Double): Unit
  
  def showWithGravityAndOffset(message: String, duration: Double, gravity: Double, xOffset: Double, yOffset: Double): Unit
}
object ToastAndroidStatic {
  
  inline def apply(
    BOTTOM: Double,
    CENTER: Double,
    LONG: Double,
    SHORT: Double,
    TOP: Double,
    show: (String, Double) => Callback,
    showWithGravity: (String, Double, Double) => Callback,
    showWithGravityAndOffset: (String, Double, Double, Double, Double) => Callback
  ): ToastAndroidStatic = {
    val __obj = js.Dynamic.literal(BOTTOM = BOTTOM.asInstanceOf[js.Any], CENTER = CENTER.asInstanceOf[js.Any], LONG = LONG.asInstanceOf[js.Any], SHORT = SHORT.asInstanceOf[js.Any], TOP = TOP.asInstanceOf[js.Any], show = js.Any.fromFunction2((t0: String, t1: Double) => (show(t0, t1)).runNow()), showWithGravity = js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (showWithGravity(t0, t1, t2)).runNow()), showWithGravityAndOffset = js.Any.fromFunction5((t0: String, t1: Double, t2: Double, t3: Double, t4: Double) => (showWithGravityAndOffset(t0, t1, t2, t3, t4)).runNow()))
    __obj.asInstanceOf[ToastAndroidStatic]
  }
  
  extension [Self <: ToastAndroidStatic](x: Self) {
    
    inline def setBOTTOM(value: Double): Self = StObject.set(x, "BOTTOM", value.asInstanceOf[js.Any])
    
    inline def setCENTER(value: Double): Self = StObject.set(x, "CENTER", value.asInstanceOf[js.Any])
    
    inline def setLONG(value: Double): Self = StObject.set(x, "LONG", value.asInstanceOf[js.Any])
    
    inline def setSHORT(value: Double): Self = StObject.set(x, "SHORT", value.asInstanceOf[js.Any])
    
    inline def setShow(value: (String, Double) => Callback): Self = StObject.set(x, "show", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setShowWithGravity(value: (String, Double, Double) => Callback): Self = StObject.set(x, "showWithGravity", js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setShowWithGravityAndOffset(value: (String, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "showWithGravityAndOffset", js.Any.fromFunction5((t0: String, t1: Double, t2: Double, t3: Double, t4: Double) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setTOP(value: Double): Self = StObject.set(x, "TOP", value.asInstanceOf[js.Any])
  }
}
