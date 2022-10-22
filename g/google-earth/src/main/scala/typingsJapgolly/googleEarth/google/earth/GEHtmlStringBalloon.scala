package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GEHtmlStringBalloon
  extends StObject
     with GEHtmlBalloon {
  
  /**
    * You can include any HTML using the contentString property.
    * When the balloon is visible, the content specified in contentString property,
    * is inserted directly into the balloon element in the web page.
    */
  def getContentString(): String
  
  /**
    * You can include any HTML using the contentString property.
    * When the balloon is visible, the content specified in contentString property,
    * is inserted directly into the balloon element in the web page.
    */
  def setContentString(contentString: String): Unit
}
object GEHtmlStringBalloon {
  
  inline def apply(
    getBackgroundColor: CallbackTo[String],
    getCloseButtonEnabled: CallbackTo[Boolean],
    getContentString: CallbackTo[String],
    getFeature: CallbackTo[KmlFeature],
    getForegroundColor: CallbackTo[String],
    getId: CallbackTo[String],
    getMaxHeight: CallbackTo[Double],
    getMaxWidth: CallbackTo[Double],
    getMinHeight: CallbackTo[Double],
    getMinWidth: CallbackTo[Double],
    setBackgroundColor: String => Callback,
    setCloseButtonEnabled: Boolean => Callback,
    setContentString: String => Callback,
    setFeature: KmlFeature => Callback,
    setForegroundColor: String => Callback,
    setId: String => Callback,
    setMaxHeight: Double => Callback,
    setMaxWidth: Double => Callback,
    setMinHeight: Double => Callback,
    setMinWidth: Double => Callback
  ): GEHtmlStringBalloon = {
    val __obj = js.Dynamic.literal(getBackgroundColor = getBackgroundColor.toJsFn, getCloseButtonEnabled = getCloseButtonEnabled.toJsFn, getContentString = getContentString.toJsFn, getFeature = getFeature.toJsFn, getForegroundColor = getForegroundColor.toJsFn, getId = getId.toJsFn, getMaxHeight = getMaxHeight.toJsFn, getMaxWidth = getMaxWidth.toJsFn, getMinHeight = getMinHeight.toJsFn, getMinWidth = getMinWidth.toJsFn, setBackgroundColor = js.Any.fromFunction1((t0: String) => setBackgroundColor(t0).runNow()), setCloseButtonEnabled = js.Any.fromFunction1((t0: Boolean) => setCloseButtonEnabled(t0).runNow()), setContentString = js.Any.fromFunction1((t0: String) => setContentString(t0).runNow()), setFeature = js.Any.fromFunction1((t0: KmlFeature) => setFeature(t0).runNow()), setForegroundColor = js.Any.fromFunction1((t0: String) => setForegroundColor(t0).runNow()), setId = js.Any.fromFunction1((t0: String) => setId(t0).runNow()), setMaxHeight = js.Any.fromFunction1((t0: Double) => setMaxHeight(t0).runNow()), setMaxWidth = js.Any.fromFunction1((t0: Double) => setMaxWidth(t0).runNow()), setMinHeight = js.Any.fromFunction1((t0: Double) => setMinHeight(t0).runNow()), setMinWidth = js.Any.fromFunction1((t0: Double) => setMinWidth(t0).runNow()))
    __obj.asInstanceOf[GEHtmlStringBalloon]
  }
  
  extension [Self <: GEHtmlStringBalloon](x: Self) {
    
    inline def setGetContentString(value: CallbackTo[String]): Self = StObject.set(x, "getContentString", value.toJsFn)
    
    inline def setSetContentString(value: String => Callback): Self = StObject.set(x, "setContentString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
