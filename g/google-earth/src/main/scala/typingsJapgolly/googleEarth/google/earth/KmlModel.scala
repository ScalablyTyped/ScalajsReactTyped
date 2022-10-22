package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlModel
  extends StObject
     with KmlAltitudeGeometry {
  
  /**
    * Returns the link of the collada model.
    */
  def getLink(): KmlLink
  
  /**
    * Specifies the exact coordinates of the Model's origin in latitude, longitude, and altitude.
    * Latitude and longitude measurements are standard lat-lon projection with WGS84 datum.
    * Altitude is distance above the earth's surface, in meters, and is interpreted according to altitudeMode.
    */
  def getLocation(): KmlLocation
  
  /**
    * Describes rotation of a 3D model's coordinate system to position the object in Google Earth.
    */
  def getOrientation(): KmlOrientation
  
  /**
    * Scales a model along the x, y, and z axes in the model's coordinate space
    */
  def getScale(): KmlScale
  
  /**
    * Sets the link of the collada model.
    */
  def setLink(link: KmlLink): Unit
  
  /**
    * Specifies the exact coordinates of the Model's origin in latitude, longitude, and altitude.
    * Latitude and longitude measurements are standard lat-lon projection with WGS84 datum.
    * Altitude is distance above the earth's surface, in meters, and is interpreted according to altitudeMode.
    */
  def setLocation(location: KmlLocation): Unit
  
  /**
    * Describes rotation of a 3D model's coordinate system to position the object in Google Earth.
    */
  def setOrientation(orientation: KmlOrientation): Unit
  
  /**
    * Scales a model along the x, y, and z axes in the model's coordinate space
    */
  def setScale(scale: KmlScale): Unit
}
object KmlModel {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getAltitudeMode: CallbackTo[KmlAltitudeModeEnum],
    getId: CallbackTo[String],
    getLink: CallbackTo[KmlLink],
    getLocation: CallbackTo[KmlLocation],
    getOrientation: CallbackTo[KmlOrientation],
    getOwnerDocument: CallbackTo[KmlDocument],
    getParentNode: CallbackTo[KmlObject],
    getScale: CallbackTo[KmlScale],
    getType: CallbackTo[String],
    getUrl: CallbackTo[String],
    mousedown: KmlMouseEvent => Callback,
    mousemove: KmlMouseEvent => Callback,
    mouseout: KmlMouseEvent => Callback,
    mouseover: KmlMouseEvent => Callback,
    mouseup: KmlMouseEvent => Callback,
    release: Callback,
    setAltitudeMode: KmlAltitudeModeEnum => Callback,
    setLink: KmlLink => Callback,
    setLocation: KmlLocation => Callback,
    setOrientation: KmlOrientation => Callback,
    setScale: KmlScale => Callback
  ): KmlModel = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getAltitudeMode = getAltitudeMode.toJsFn, getId = getId.toJsFn, getLink = getLink.toJsFn, getLocation = getLocation.toJsFn, getOrientation = getOrientation.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getScale = getScale.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, setAltitudeMode = js.Any.fromFunction1((t0: KmlAltitudeModeEnum) => setAltitudeMode(t0).runNow()), setLink = js.Any.fromFunction1((t0: KmlLink) => setLink(t0).runNow()), setLocation = js.Any.fromFunction1((t0: KmlLocation) => setLocation(t0).runNow()), setOrientation = js.Any.fromFunction1((t0: KmlOrientation) => setOrientation(t0).runNow()), setScale = js.Any.fromFunction1((t0: KmlScale) => setScale(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlModel]
  }
  
  extension [Self <: KmlModel](x: Self) {
    
    inline def setGetLink(value: CallbackTo[KmlLink]): Self = StObject.set(x, "getLink", value.toJsFn)
    
    inline def setGetLocation(value: CallbackTo[KmlLocation]): Self = StObject.set(x, "getLocation", value.toJsFn)
    
    inline def setGetOrientation(value: CallbackTo[KmlOrientation]): Self = StObject.set(x, "getOrientation", value.toJsFn)
    
    inline def setGetScale(value: CallbackTo[KmlScale]): Self = StObject.set(x, "getScale", value.toJsFn)
    
    inline def setSetLink(value: KmlLink => Callback): Self = StObject.set(x, "setLink", js.Any.fromFunction1((t0: KmlLink) => value(t0).runNow()))
    
    inline def setSetLocation(value: KmlLocation => Callback): Self = StObject.set(x, "setLocation", js.Any.fromFunction1((t0: KmlLocation) => value(t0).runNow()))
    
    inline def setSetOrientation(value: KmlOrientation => Callback): Self = StObject.set(x, "setOrientation", js.Any.fromFunction1((t0: KmlOrientation) => value(t0).runNow()))
    
    inline def setSetScale(value: KmlScale => Callback): Self = StObject.set(x, "setScale", js.Any.fromFunction1((t0: KmlScale) => value(t0).runNow()))
  }
}
