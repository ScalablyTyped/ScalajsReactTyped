package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlLink
  extends StObject
     with KmlObject {
  
  /**
    * A URL (either an HTTP address or a local file specification).
    * When the parent of Link is a NetworkLink, href is a KML file.
    * When the parent of Link is a Model, href is a COLLADA file.
    * When the parent of Link is an Overlay, href is an image.
    */
  def getHref(): String
  
  /**
    * Indicates to refresh the file every n seconds.
    */
  def getRefreshInterval(): Double
  
  /**
    * Specifies to use a time-based refresh mode.
    *
    * See also:
    *
    * * GEPlugin.REFRESH_ON_CHANGE
    * * GEPlugin.REFRESH_ON_INTERVAL
    * * GEPlugin.REFRESH_ON_EXPIRE
    */
  def getRefreshMode(): KmlRefreshModeEnum
  
  /**
    * Scales the BBOX parameters before sending them to the server.
    * A value less than 1 specifies to use less than the full view (screen).
    * A value greater than 1 specifies to fetch an area that extends beyond the edges of the current view.
    */
  def getViewBoundScale(): Double
  
  /**
    * Specifies the format of the query string that is appended to the Link's href before the file is fetched.
    * (If the href specifies a local file, this element is ignored.)
    */
  def getViewFormat(): String
  
  /**
    * Specifies how the link is refreshed when the viewport changes.
    *
    * See also:
    *
    * * GEPlugin.VIEW_REFRESH_NEVER
    * * GEPlugin.VIEW_REFRESH_ON_STOP
    * * GEPlugin.VIEW_REFRESH_ON_REGION
    */
  def getViewRefreshMode(): KmlViewRefreshModeEnum
  
  /**
    * Specifies how the link is refreshed when the camera changes.
    */
  def getViewRefreshTime(): Double
  
  /**
    * A URL (either an HTTP address or a local file specification).
    * When the parent of Link is a NetworkLink, href is a KML file.
    * When the parent of Link is a Model, href is a COLLADA file.
    * When the parent of Link is an Overlay, href is an image.
    */
  def setHref(href: String): Unit
  
  /**
    * Indicates to refresh the file every n seconds.
    */
  def setRefreshInterval(refreshInterval: Double): Unit
  
  /**
    * Specifies to use a time-based refresh mode.
    *
    * See also:
    *
    * * GEPlugin.REFRESH_ON_CHANGE
    * * GEPlugin.REFRESH_ON_INTERVAL
    * * GEPlugin.REFRESH_ON_EXPIRE
    */
  def setRefreshMode(refreshMode: KmlRefreshModeEnum): Unit
  
  /**
    * Scales the BBOX parameters before sending them to the server.
    * A value less than 1 specifies to use less than the full view (screen).
    * A value greater than 1 specifies to fetch an area that extends beyond the edges of the current view.
    */
  def setViewBoundScale(viewBoundScale: Double): Unit
  
  /**
    * Specifies the format of the query string that is appended to the Link's href before the file is fetched.
    * (If the href specifies a local file, this element is ignored.)
    */
  def setViewFormat(viewFormat: String): Unit
  
  /**
    * Specifies how the link is refreshed when the viewport changes.
    *
    * See also:
    *
    * * GEPlugin.VIEW_REFRESH_NEVER
    * * GEPlugin.VIEW_REFRESH_ON_STOP
    * * GEPlugin.VIEW_REFRESH_ON_REGION
    */
  def setViewRefreshMode(viewRefreshMode: KmlViewRefreshModeEnum): Unit
  
  /**
    * Specifies how the link is refreshed when the camera changes.
    */
  def setViewRefreshTime(viewRefreshTime: Double): Unit
}
object KmlLink {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
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
    mousedown: KmlMouseEvent => Callback,
    mousemove: KmlMouseEvent => Callback,
    mouseout: KmlMouseEvent => Callback,
    mouseover: KmlMouseEvent => Callback,
    mouseup: KmlMouseEvent => Callback,
    release: Callback,
    setHref: String => Callback,
    setRefreshInterval: Double => Callback,
    setRefreshMode: KmlRefreshModeEnum => Callback,
    setViewBoundScale: Double => Callback,
    setViewFormat: String => Callback,
    setViewRefreshMode: KmlViewRefreshModeEnum => Callback,
    setViewRefreshTime: Double => Callback
  ): KmlLink = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getHref = getHref.toJsFn, getId = getId.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getRefreshInterval = getRefreshInterval.toJsFn, getRefreshMode = getRefreshMode.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, getViewBoundScale = getViewBoundScale.toJsFn, getViewFormat = getViewFormat.toJsFn, getViewRefreshMode = getViewRefreshMode.toJsFn, getViewRefreshTime = getViewRefreshTime.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, setHref = js.Any.fromFunction1((t0: String) => setHref(t0).runNow()), setRefreshInterval = js.Any.fromFunction1((t0: Double) => setRefreshInterval(t0).runNow()), setRefreshMode = js.Any.fromFunction1((t0: KmlRefreshModeEnum) => setRefreshMode(t0).runNow()), setViewBoundScale = js.Any.fromFunction1((t0: Double) => setViewBoundScale(t0).runNow()), setViewFormat = js.Any.fromFunction1((t0: String) => setViewFormat(t0).runNow()), setViewRefreshMode = js.Any.fromFunction1((t0: KmlViewRefreshModeEnum) => setViewRefreshMode(t0).runNow()), setViewRefreshTime = js.Any.fromFunction1((t0: Double) => setViewRefreshTime(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlLink]
  }
  
  extension [Self <: KmlLink](x: Self) {
    
    inline def setGetHref(value: CallbackTo[String]): Self = StObject.set(x, "getHref", value.toJsFn)
    
    inline def setGetRefreshInterval(value: CallbackTo[Double]): Self = StObject.set(x, "getRefreshInterval", value.toJsFn)
    
    inline def setGetRefreshMode(value: CallbackTo[KmlRefreshModeEnum]): Self = StObject.set(x, "getRefreshMode", value.toJsFn)
    
    inline def setGetViewBoundScale(value: CallbackTo[Double]): Self = StObject.set(x, "getViewBoundScale", value.toJsFn)
    
    inline def setGetViewFormat(value: CallbackTo[String]): Self = StObject.set(x, "getViewFormat", value.toJsFn)
    
    inline def setGetViewRefreshMode(value: CallbackTo[KmlViewRefreshModeEnum]): Self = StObject.set(x, "getViewRefreshMode", value.toJsFn)
    
    inline def setGetViewRefreshTime(value: CallbackTo[Double]): Self = StObject.set(x, "getViewRefreshTime", value.toJsFn)
    
    inline def setSetHref(value: String => Callback): Self = StObject.set(x, "setHref", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetRefreshInterval(value: Double => Callback): Self = StObject.set(x, "setRefreshInterval", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetRefreshMode(value: KmlRefreshModeEnum => Callback): Self = StObject.set(x, "setRefreshMode", js.Any.fromFunction1((t0: KmlRefreshModeEnum) => value(t0).runNow()))
    
    inline def setSetViewBoundScale(value: Double => Callback): Self = StObject.set(x, "setViewBoundScale", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetViewFormat(value: String => Callback): Self = StObject.set(x, "setViewFormat", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetViewRefreshMode(value: KmlViewRefreshModeEnum => Callback): Self = StObject.set(x, "setViewRefreshMode", js.Any.fromFunction1((t0: KmlViewRefreshModeEnum) => value(t0).runNow()))
    
    inline def setSetViewRefreshTime(value: Double => Callback): Self = StObject.set(x, "setViewRefreshTime", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
