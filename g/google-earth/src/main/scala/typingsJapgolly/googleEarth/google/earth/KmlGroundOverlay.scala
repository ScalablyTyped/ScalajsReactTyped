package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlGroundOverlay
  extends StObject
     with KmlOverlay {
  
  /**
    * Specifies the distance above the earth's surface.
    */
  def getAltitude(): Double
  
  /**
    * Specifies how the altitude property is interpreted.
    *
    * See also:
    *
    * * GEPlugin.ALTITUDE_CLAMP_TO_GROUND
    * * GEPlugin.ALTITUDE_ABSOLUTE
    * * GEPlugin.ALTITUDE_CLAMP_TO_SEA_FLOOR
    */
  def getAltitudeMode(): KmlAltitudeModeEnum
  
  /**
    * The bounding box of the ground overlay.
    */
  def getLatLonBox(): KmlLatLonBox
  
  /**
    * Specifies the distance above the earth's surface.
    */
  def setAltitude(altitude: Double): Unit
  
  /**
    * Specifies how the altitude property is interpreted.
    *
    * See also:
    *
    * * GEPlugin.ALTITUDE_CLAMP_TO_GROUND
    * * GEPlugin.ALTITUDE_ABSOLUTE
    * * GEPlugin.ALTITUDE_CLAMP_TO_SEA_FLOOR
    */
  def setAltitudeMode(altitudeMode: KmlAltitudeModeEnum): Unit
  
  /**
    * The bounding box of the ground overlay.
    */
  def setLatLonBox(latLonBox: KmlLatLonBox): Unit
}
object KmlGroundOverlay {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getAbstractView: CallbackTo[KmlAbstractView],
    getAddress: CallbackTo[String],
    getAltitude: CallbackTo[Double],
    getAltitudeMode: CallbackTo[KmlAltitudeModeEnum],
    getBalloonHtml: CallbackTo[String],
    getBalloonHtmlUnsafe: CallbackTo[String],
    getColor: CallbackTo[KmlColor],
    getComputedStyle: CallbackTo[KmlStyle],
    getDescription: CallbackTo[String],
    getDrawOrder: CallbackTo[Double],
    getIcon: CallbackTo[KmlIcon],
    getId: CallbackTo[String],
    getKml: CallbackTo[String],
    getLatLonBox: CallbackTo[KmlLatLonBox],
    getName: CallbackTo[String],
    getNextSibling: CallbackTo[KmlFeature],
    getOpacity: CallbackTo[Double],
    getOpen: CallbackTo[Boolean],
    getOwnerDocument: CallbackTo[KmlDocument],
    getParentNode: CallbackTo[KmlObject],
    getPreviousSibling: CallbackTo[KmlFeature],
    getRegion: CallbackTo[KmlRegion],
    getSnippet: CallbackTo[String],
    getStyleSelector: CallbackTo[KmlStyleSelector],
    getStyleUrl: CallbackTo[String],
    getTimePrimitive: CallbackTo[KmlTimePrimitive],
    getType: CallbackTo[String],
    getUrl: CallbackTo[String],
    getVisibility: CallbackTo[Boolean],
    mousedown: KmlMouseEvent => Callback,
    mousemove: KmlMouseEvent => Callback,
    mouseout: KmlMouseEvent => Callback,
    mouseover: KmlMouseEvent => Callback,
    mouseup: KmlMouseEvent => Callback,
    release: Callback,
    setAbstractView: KmlAbstractView => Callback,
    setAddress: String => Callback,
    setAltitude: Double => Callback,
    setAltitudeMode: KmlAltitudeModeEnum => Callback,
    setDescription: String => Callback,
    setDrawOrder: Double => Callback,
    setIcon: KmlIcon => Callback,
    setLatLonBox: KmlLatLonBox => Callback,
    setName: String => Callback,
    setOpacity: Double => Callback,
    setOpen: Boolean => Callback,
    setRegion: KmlRegion => Callback,
    setSnippet: String => Callback,
    setStyleSelector: KmlStyleSelector => Callback,
    setStyleUrl: String => Callback,
    setTimePrimitive: KmlTimePrimitive => Callback,
    setVisibility: Boolean => Callback
  ): KmlGroundOverlay = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getAbstractView = getAbstractView.toJsFn, getAddress = getAddress.toJsFn, getAltitude = getAltitude.toJsFn, getAltitudeMode = getAltitudeMode.toJsFn, getBalloonHtml = getBalloonHtml.toJsFn, getBalloonHtmlUnsafe = getBalloonHtmlUnsafe.toJsFn, getColor = getColor.toJsFn, getComputedStyle = getComputedStyle.toJsFn, getDescription = getDescription.toJsFn, getDrawOrder = getDrawOrder.toJsFn, getIcon = getIcon.toJsFn, getId = getId.toJsFn, getKml = getKml.toJsFn, getLatLonBox = getLatLonBox.toJsFn, getName = getName.toJsFn, getNextSibling = getNextSibling.toJsFn, getOpacity = getOpacity.toJsFn, getOpen = getOpen.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getPreviousSibling = getPreviousSibling.toJsFn, getRegion = getRegion.toJsFn, getSnippet = getSnippet.toJsFn, getStyleSelector = getStyleSelector.toJsFn, getStyleUrl = getStyleUrl.toJsFn, getTimePrimitive = getTimePrimitive.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, getVisibility = getVisibility.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, setAbstractView = js.Any.fromFunction1((t0: KmlAbstractView) => setAbstractView(t0).runNow()), setAddress = js.Any.fromFunction1((t0: String) => setAddress(t0).runNow()), setAltitude = js.Any.fromFunction1((t0: Double) => setAltitude(t0).runNow()), setAltitudeMode = js.Any.fromFunction1((t0: KmlAltitudeModeEnum) => setAltitudeMode(t0).runNow()), setDescription = js.Any.fromFunction1((t0: String) => setDescription(t0).runNow()), setDrawOrder = js.Any.fromFunction1((t0: Double) => setDrawOrder(t0).runNow()), setIcon = js.Any.fromFunction1((t0: KmlIcon) => setIcon(t0).runNow()), setLatLonBox = js.Any.fromFunction1((t0: KmlLatLonBox) => setLatLonBox(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setOpacity = js.Any.fromFunction1((t0: Double) => setOpacity(t0).runNow()), setOpen = js.Any.fromFunction1((t0: Boolean) => setOpen(t0).runNow()), setRegion = js.Any.fromFunction1((t0: KmlRegion) => setRegion(t0).runNow()), setSnippet = js.Any.fromFunction1((t0: String) => setSnippet(t0).runNow()), setStyleSelector = js.Any.fromFunction1((t0: KmlStyleSelector) => setStyleSelector(t0).runNow()), setStyleUrl = js.Any.fromFunction1((t0: String) => setStyleUrl(t0).runNow()), setTimePrimitive = js.Any.fromFunction1((t0: KmlTimePrimitive) => setTimePrimitive(t0).runNow()), setVisibility = js.Any.fromFunction1((t0: Boolean) => setVisibility(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlGroundOverlay]
  }
  
  extension [Self <: KmlGroundOverlay](x: Self) {
    
    inline def setGetAltitude(value: CallbackTo[Double]): Self = StObject.set(x, "getAltitude", value.toJsFn)
    
    inline def setGetAltitudeMode(value: CallbackTo[KmlAltitudeModeEnum]): Self = StObject.set(x, "getAltitudeMode", value.toJsFn)
    
    inline def setGetLatLonBox(value: CallbackTo[KmlLatLonBox]): Self = StObject.set(x, "getLatLonBox", value.toJsFn)
    
    inline def setSetAltitude(value: Double => Callback): Self = StObject.set(x, "setAltitude", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetAltitudeMode(value: KmlAltitudeModeEnum => Callback): Self = StObject.set(x, "setAltitudeMode", js.Any.fromFunction1((t0: KmlAltitudeModeEnum) => value(t0).runNow()))
    
    inline def setSetLatLonBox(value: KmlLatLonBox => Callback): Self = StObject.set(x, "setLatLonBox", js.Any.fromFunction1((t0: KmlLatLonBox) => value(t0).runNow()))
  }
}
