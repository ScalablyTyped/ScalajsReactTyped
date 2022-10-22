package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GEHtmlBalloon
  extends StObject
     with GEAbstractBalloon {
  
  /**
    * The background color of the balloon.
    * This must be set using the HTML hex format #RRGGBB.
    * If not set, the default is interpreted as #FFFFFF.
    */
  def getBackgroundColor(): String
  
  /**
    * The color of the text in the balloon.
    * This must be set using the HTML hex format #RRGGBB.
    * If not set, it is interpreted as #000000.
    */
  def getForegroundColor(): String
  
  /**
    * The background color of the balloon.
    * This must be set using the HTML hex format #RRGGBB.
    * If not set, the default is interpreted as #FFFFFF.
    */
  def setBackgroundColor(backgroundColor: String): Unit
  
  /**
    * The color of the text in the balloon.
    * This must be set using the HTML hex format #RRGGBB.
    * If not set, it is interpreted as #000000.
    */
  def setForegroundColor(foregroundColor: String): Unit
}
object GEHtmlBalloon {
  
  inline def apply(
    getBackgroundColor: CallbackTo[String],
    getCloseButtonEnabled: CallbackTo[Boolean],
    getFeature: CallbackTo[KmlFeature],
    getForegroundColor: CallbackTo[String],
    getId: CallbackTo[String],
    getMaxHeight: CallbackTo[Double],
    getMaxWidth: CallbackTo[Double],
    getMinHeight: CallbackTo[Double],
    getMinWidth: CallbackTo[Double],
    setBackgroundColor: String => Callback,
    setCloseButtonEnabled: Boolean => Callback,
    setFeature: KmlFeature => Callback,
    setForegroundColor: String => Callback,
    setId: String => Callback,
    setMaxHeight: Double => Callback,
    setMaxWidth: Double => Callback,
    setMinHeight: Double => Callback,
    setMinWidth: Double => Callback
  ): GEHtmlBalloon = {
    val __obj = js.Dynamic.literal(getBackgroundColor = getBackgroundColor.toJsFn, getCloseButtonEnabled = getCloseButtonEnabled.toJsFn, getFeature = getFeature.toJsFn, getForegroundColor = getForegroundColor.toJsFn, getId = getId.toJsFn, getMaxHeight = getMaxHeight.toJsFn, getMaxWidth = getMaxWidth.toJsFn, getMinHeight = getMinHeight.toJsFn, getMinWidth = getMinWidth.toJsFn, setBackgroundColor = js.Any.fromFunction1((t0: String) => setBackgroundColor(t0).runNow()), setCloseButtonEnabled = js.Any.fromFunction1((t0: Boolean) => setCloseButtonEnabled(t0).runNow()), setFeature = js.Any.fromFunction1((t0: KmlFeature) => setFeature(t0).runNow()), setForegroundColor = js.Any.fromFunction1((t0: String) => setForegroundColor(t0).runNow()), setId = js.Any.fromFunction1((t0: String) => setId(t0).runNow()), setMaxHeight = js.Any.fromFunction1((t0: Double) => setMaxHeight(t0).runNow()), setMaxWidth = js.Any.fromFunction1((t0: Double) => setMaxWidth(t0).runNow()), setMinHeight = js.Any.fromFunction1((t0: Double) => setMinHeight(t0).runNow()), setMinWidth = js.Any.fromFunction1((t0: Double) => setMinWidth(t0).runNow()))
    __obj.asInstanceOf[GEHtmlBalloon]
  }
  
  extension [Self <: GEHtmlBalloon](x: Self) {
    
    inline def setGetBackgroundColor(value: CallbackTo[String]): Self = StObject.set(x, "getBackgroundColor", value.toJsFn)
    
    inline def setGetForegroundColor(value: CallbackTo[String]): Self = StObject.set(x, "getForegroundColor", value.toJsFn)
    
    inline def setSetBackgroundColor(value: String => Callback): Self = StObject.set(x, "setBackgroundColor", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetForegroundColor(value: String => Callback): Self = StObject.set(x, "setForegroundColor", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
