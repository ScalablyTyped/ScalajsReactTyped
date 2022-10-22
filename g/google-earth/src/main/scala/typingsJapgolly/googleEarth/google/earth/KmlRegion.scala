package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlRegion
  extends StObject
     with KmlObject {
  
  /**
    * A bounding box that describes an area of interest defined by geographic coordinates and altitudes.
    */
  def getLatLonAltBox(): KmlLatLonAltBox
  
  /**
    * LOD is an abbreviation for Level of Detail.
    * Lod describes the size of the projected region on the screen that is required in order for the region to be considered "active.
    * " Also specifies the size of the pixel ramp used for fading in (from transparent to opaque) and fading out (from opaque to transparent).
    */
  def getLod(): KmlLod
  
  /**
    * Sets the latLonAltBox and lod for the region.
    */
  def set(latLonAltBox: KmlLatLonAltBox, lod: KmlLod): Unit
  
  /**
    * A bounding box that describes an area of interest defined by geographic coordinates and altitudes.
    */
  def setLatLonAltBox(latLonAltBox: KmlLatLonAltBox): Unit
  
  /**
    * LOD is an abbreviation for Level of Detail.
    * Lod describes the size of the projected region on the screen that is required in order for the region to be considered "active.
    * " Also specifies the size of the pixel ramp used for fading in (from transparent to opaque) and fading out (from opaque to transparent).
    */
  def setLod(lod: KmlLod): Unit
}
object KmlRegion {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getId: CallbackTo[String],
    getLatLonAltBox: CallbackTo[KmlLatLonAltBox],
    getLod: CallbackTo[KmlLod],
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
    set: (KmlLatLonAltBox, KmlLod) => Callback,
    setLatLonAltBox: KmlLatLonAltBox => Callback,
    setLod: KmlLod => Callback
  ): KmlRegion = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getId = getId.toJsFn, getLatLonAltBox = getLatLonAltBox.toJsFn, getLod = getLod.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, set = js.Any.fromFunction2((t0: KmlLatLonAltBox, t1: KmlLod) => (set(t0, t1)).runNow()), setLatLonAltBox = js.Any.fromFunction1((t0: KmlLatLonAltBox) => setLatLonAltBox(t0).runNow()), setLod = js.Any.fromFunction1((t0: KmlLod) => setLod(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlRegion]
  }
  
  extension [Self <: KmlRegion](x: Self) {
    
    inline def setGetLatLonAltBox(value: CallbackTo[KmlLatLonAltBox]): Self = StObject.set(x, "getLatLonAltBox", value.toJsFn)
    
    inline def setGetLod(value: CallbackTo[KmlLod]): Self = StObject.set(x, "getLod", value.toJsFn)
    
    inline def setSet(value: (KmlLatLonAltBox, KmlLod) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: KmlLatLonAltBox, t1: KmlLod) => (value(t0, t1)).runNow()))
    
    inline def setSetLatLonAltBox(value: KmlLatLonAltBox => Callback): Self = StObject.set(x, "setLatLonAltBox", js.Any.fromFunction1((t0: KmlLatLonAltBox) => value(t0).runNow()))
    
    inline def setSetLod(value: KmlLod => Callback): Self = StObject.set(x, "setLod", js.Any.fromFunction1((t0: KmlLod) => value(t0).runNow()))
  }
}
