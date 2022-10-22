package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlStyleMap
  extends StObject
     with KmlObject {
  
  /**
    * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  def getHighlightStyle(): KmlStyle
  
  /**
    * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  def getHighlightStyleUrl(): String
  
  /**
    * Defines a normal style for a placemark.
    */
  def getNormalStyle(): KmlStyle
  
  /**
    * Defines a normal style for a placemark.
    */
  def getNormalStyleUrl(): String
  
  /**
    * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  def setHighlightStyle(highlightStyle: KmlStyle): Unit
  
  /**
    * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  def setHighlightStyleUrl(highlightStyleUrl: String): Unit
  
  /**
    * Defines a normal style for a placemark.
    */
  def setNormalStyle(normalStyle: KmlStyle): Unit
  
  /**
    * Defines a normal style for a placemark.
    */
  def setNormalStyleUrl(normalStyleUrl: String): Unit
  
  /**
    * Sets both placemark styles.
    */
  def setStyle(normalStyle: KmlStyle, highlightStyle: KmlStyle): Unit
  
  /**
    * Sets both URLs for the placemark style.
    */
  def setUrl(normalStyleUrl: String, highlightStyleUrl: String): Unit
}
object KmlStyleMap {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getHighlightStyle: CallbackTo[KmlStyle],
    getHighlightStyleUrl: CallbackTo[String],
    getId: CallbackTo[String],
    getNormalStyle: CallbackTo[KmlStyle],
    getNormalStyleUrl: CallbackTo[String],
    getOwnerDocument: CallbackTo[KmlDocument],
    getParentNode: CallbackTo[KmlObject],
    getType: CallbackTo[String],
    getUrl: CallbackTo[String],
    mousedown: KmlMouseEvent => Callback,
    mousemove: KmlMouseEvent => Callback,
    mouseout: KmlMouseEvent => Callback,
    mouseover: KmlMouseEvent => Callback,
    mouseup: KmlMouseEvent => Callback,
    release: Callback,
    setHighlightStyle: KmlStyle => Callback,
    setHighlightStyleUrl: String => Callback,
    setNormalStyle: KmlStyle => Callback,
    setNormalStyleUrl: String => Callback,
    setStyle: (KmlStyle, KmlStyle) => Callback,
    setUrl: (String, String) => Callback
  ): KmlStyleMap = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getHighlightStyle = getHighlightStyle.toJsFn, getHighlightStyleUrl = getHighlightStyleUrl.toJsFn, getId = getId.toJsFn, getNormalStyle = getNormalStyle.toJsFn, getNormalStyleUrl = getNormalStyleUrl.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, setHighlightStyle = js.Any.fromFunction1((t0: KmlStyle) => setHighlightStyle(t0).runNow()), setHighlightStyleUrl = js.Any.fromFunction1((t0: String) => setHighlightStyleUrl(t0).runNow()), setNormalStyle = js.Any.fromFunction1((t0: KmlStyle) => setNormalStyle(t0).runNow()), setNormalStyleUrl = js.Any.fromFunction1((t0: String) => setNormalStyleUrl(t0).runNow()), setStyle = js.Any.fromFunction2((t0: KmlStyle, t1: KmlStyle) => (setStyle(t0, t1)).runNow()), setUrl = js.Any.fromFunction2((t0: String, t1: String) => (setUrl(t0, t1)).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlStyleMap]
  }
  
  extension [Self <: KmlStyleMap](x: Self) {
    
    inline def setGetHighlightStyle(value: CallbackTo[KmlStyle]): Self = StObject.set(x, "getHighlightStyle", value.toJsFn)
    
    inline def setGetHighlightStyleUrl(value: CallbackTo[String]): Self = StObject.set(x, "getHighlightStyleUrl", value.toJsFn)
    
    inline def setGetNormalStyle(value: CallbackTo[KmlStyle]): Self = StObject.set(x, "getNormalStyle", value.toJsFn)
    
    inline def setGetNormalStyleUrl(value: CallbackTo[String]): Self = StObject.set(x, "getNormalStyleUrl", value.toJsFn)
    
    inline def setSetHighlightStyle(value: KmlStyle => Callback): Self = StObject.set(x, "setHighlightStyle", js.Any.fromFunction1((t0: KmlStyle) => value(t0).runNow()))
    
    inline def setSetHighlightStyleUrl(value: String => Callback): Self = StObject.set(x, "setHighlightStyleUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetNormalStyle(value: KmlStyle => Callback): Self = StObject.set(x, "setNormalStyle", js.Any.fromFunction1((t0: KmlStyle) => value(t0).runNow()))
    
    inline def setSetNormalStyleUrl(value: String => Callback): Self = StObject.set(x, "setNormalStyleUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetStyle(value: (KmlStyle, KmlStyle) => Callback): Self = StObject.set(x, "setStyle", js.Any.fromFunction2((t0: KmlStyle, t1: KmlStyle) => (value(t0, t1)).runNow()))
    
    inline def setSetUrl(value: (String, String) => Callback): Self = StObject.set(x, "setUrl", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
