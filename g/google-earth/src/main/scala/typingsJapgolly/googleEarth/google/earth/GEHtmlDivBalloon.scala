package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GEHtmlDivBalloon
  extends StObject
     with GEHtmlBalloon {
  
  /**
    * An HTMLDivElement to be used as the contents of the balloon.
    * When the balloon is shown, the HTMLDivElement is attached to the balloon element in the web page.
    * You can manipulate this balloon using ordinary HTML DOM techniques.
    */
  def getContentDiv(): HTMLDivElement
  
  /**
    * An HTMLDivElement to be used as the contents of the balloon.
    * When the balloon is shown, the HTMLDivElement is attached to the balloon element in the web page.
    * You can manipulate this balloon using ordinary HTML DOM techniques.
    */
  def setContentDiv(contentDiv: HTMLElement): Unit
}
object GEHtmlDivBalloon {
  
  inline def apply(
    getBackgroundColor: CallbackTo[String],
    getCloseButtonEnabled: CallbackTo[Boolean],
    getContentDiv: CallbackTo[HTMLDivElement],
    getFeature: CallbackTo[KmlFeature],
    getForegroundColor: CallbackTo[String],
    getId: CallbackTo[String],
    getMaxHeight: CallbackTo[Double],
    getMaxWidth: CallbackTo[Double],
    getMinHeight: CallbackTo[Double],
    getMinWidth: CallbackTo[Double],
    setBackgroundColor: String => Callback,
    setCloseButtonEnabled: Boolean => Callback,
    setContentDiv: HTMLElement => Callback,
    setFeature: KmlFeature => Callback,
    setForegroundColor: String => Callback,
    setId: String => Callback,
    setMaxHeight: Double => Callback,
    setMaxWidth: Double => Callback,
    setMinHeight: Double => Callback,
    setMinWidth: Double => Callback
  ): GEHtmlDivBalloon = {
    val __obj = js.Dynamic.literal(getBackgroundColor = getBackgroundColor.toJsFn, getCloseButtonEnabled = getCloseButtonEnabled.toJsFn, getContentDiv = getContentDiv.toJsFn, getFeature = getFeature.toJsFn, getForegroundColor = getForegroundColor.toJsFn, getId = getId.toJsFn, getMaxHeight = getMaxHeight.toJsFn, getMaxWidth = getMaxWidth.toJsFn, getMinHeight = getMinHeight.toJsFn, getMinWidth = getMinWidth.toJsFn, setBackgroundColor = js.Any.fromFunction1((t0: String) => setBackgroundColor(t0).runNow()), setCloseButtonEnabled = js.Any.fromFunction1((t0: Boolean) => setCloseButtonEnabled(t0).runNow()), setContentDiv = js.Any.fromFunction1((t0: HTMLElement) => setContentDiv(t0).runNow()), setFeature = js.Any.fromFunction1((t0: KmlFeature) => setFeature(t0).runNow()), setForegroundColor = js.Any.fromFunction1((t0: String) => setForegroundColor(t0).runNow()), setId = js.Any.fromFunction1((t0: String) => setId(t0).runNow()), setMaxHeight = js.Any.fromFunction1((t0: Double) => setMaxHeight(t0).runNow()), setMaxWidth = js.Any.fromFunction1((t0: Double) => setMaxWidth(t0).runNow()), setMinHeight = js.Any.fromFunction1((t0: Double) => setMinHeight(t0).runNow()), setMinWidth = js.Any.fromFunction1((t0: Double) => setMinWidth(t0).runNow()))
    __obj.asInstanceOf[GEHtmlDivBalloon]
  }
  
  extension [Self <: GEHtmlDivBalloon](x: Self) {
    
    inline def setGetContentDiv(value: CallbackTo[HTMLDivElement]): Self = StObject.set(x, "getContentDiv", value.toJsFn)
    
    inline def setSetContentDiv(value: HTMLElement => Callback): Self = StObject.set(x, "setContentDiv", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
  }
}
