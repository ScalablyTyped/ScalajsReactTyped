package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlIcon
  extends StObject
     with KmlLink {
  
  /**
    * Gets the height (<gx:h>), in pixels, of the icon.
    */
  def getH(): Double
  
  /**
    * Gets the width (<gx:w>), in pixels, of the icon.
    */
  def getW(): Double
  
  /**
    * Gets the offset from the left (<gx:x>), in pixels, of the icon.
    */
  def getX(): Double
  
  /**
    * Gets the offset from the bottom (<gx:y>), in pixels, of the icon.
    */
  def getY(): Double
  
  /**
    * Specifies the height (<gx:h>), in pixels, of the icon to use.
    */
  def setH(h: Double): Unit
  
  /**
    * Specifies the width (<gx:w>), in pixels, of the icon to use.
    */
  def setW(w: Double): Unit
  
  /**
    * Specifies the icon's offset (<gx:x>), in pixels from the left side of its icon palette, if a palette has been specified in the <href> element.
    */
  def setX(x: Double): Double
  
  /**
    * Specifies the offset (<gx:y>), in pixels from the bottom of its icon palette, if a palette has been specified in the <href> element.
    */
  def setY(y: Double): Unit
}
object KmlIcon {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getH: CallbackTo[Double],
    getHref: CallbackTo[String],
    getId: CallbackTo[String],
    getOwnerDocument: CallbackTo[KmlDocument],
    getParentNode: CallbackTo[KmlObject],
    getRefreshInterval: CallbackTo[Double],
    getRefreshMode: CallbackTo[KmlRefreshModeEnum],
    getType: CallbackTo[String],
    getUrl: CallbackTo[String],
    getViewBoundScale: CallbackTo[Double],
    getViewFormat: CallbackTo[String],
    getViewRefreshMode: CallbackTo[KmlViewRefreshModeEnum],
    getViewRefreshTime: CallbackTo[Double],
    getW: CallbackTo[Double],
    getX: CallbackTo[Double],
    getY: CallbackTo[Double],
    mousedown: KmlMouseEvent => Callback,
    mousemove: KmlMouseEvent => Callback,
    mouseout: KmlMouseEvent => Callback,
    mouseover: KmlMouseEvent => Callback,
    mouseup: KmlMouseEvent => Callback,
    release: Callback,
    setH: Double => Callback,
    setHref: String => Callback,
    setRefreshInterval: Double => Callback,
    setRefreshMode: KmlRefreshModeEnum => Callback,
    setViewBoundScale: Double => Callback,
    setViewFormat: String => Callback,
    setViewRefreshMode: KmlViewRefreshModeEnum => Callback,
    setViewRefreshTime: Double => Callback,
    setW: Double => Callback,
    setX: Double => Double,
    setY: Double => Callback
  ): KmlIcon = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getH = getH.toJsFn, getHref = getHref.toJsFn, getId = getId.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getRefreshInterval = getRefreshInterval.toJsFn, getRefreshMode = getRefreshMode.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, getViewBoundScale = getViewBoundScale.toJsFn, getViewFormat = getViewFormat.toJsFn, getViewRefreshMode = getViewRefreshMode.toJsFn, getViewRefreshTime = getViewRefreshTime.toJsFn, getW = getW.toJsFn, getX = getX.toJsFn, getY = getY.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, setH = js.Any.fromFunction1((t0: Double) => setH(t0).runNow()), setHref = js.Any.fromFunction1((t0: String) => setHref(t0).runNow()), setRefreshInterval = js.Any.fromFunction1((t0: Double) => setRefreshInterval(t0).runNow()), setRefreshMode = js.Any.fromFunction1((t0: KmlRefreshModeEnum) => setRefreshMode(t0).runNow()), setViewBoundScale = js.Any.fromFunction1((t0: Double) => setViewBoundScale(t0).runNow()), setViewFormat = js.Any.fromFunction1((t0: String) => setViewFormat(t0).runNow()), setViewRefreshMode = js.Any.fromFunction1((t0: KmlViewRefreshModeEnum) => setViewRefreshMode(t0).runNow()), setViewRefreshTime = js.Any.fromFunction1((t0: Double) => setViewRefreshTime(t0).runNow()), setW = js.Any.fromFunction1((t0: Double) => setW(t0).runNow()), setX = js.Any.fromFunction1(setX), setY = js.Any.fromFunction1((t0: Double) => setY(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlIcon]
  }
  
  extension [Self <: KmlIcon](x: Self) {
    
    inline def setGetH(value: CallbackTo[Double]): Self = StObject.set(x, "getH", value.toJsFn)
    
    inline def setGetW(value: CallbackTo[Double]): Self = StObject.set(x, "getW", value.toJsFn)
    
    inline def setGetX(value: CallbackTo[Double]): Self = StObject.set(x, "getX", value.toJsFn)
    
    inline def setGetY(value: CallbackTo[Double]): Self = StObject.set(x, "getY", value.toJsFn)
    
    inline def setSetH(value: Double => Callback): Self = StObject.set(x, "setH", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetW(value: Double => Callback): Self = StObject.set(x, "setW", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetX(value: Double => Double): Self = StObject.set(x, "setX", js.Any.fromFunction1(value))
    
    inline def setSetY(value: Double => Callback): Self = StObject.set(x, "setY", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
