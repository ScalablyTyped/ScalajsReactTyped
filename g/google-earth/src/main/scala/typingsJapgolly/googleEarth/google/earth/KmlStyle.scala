package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlStyle
  extends StObject
     with KmlObject {
  
  /**
    * Specifies the drawing style for balloons.
    */
  def getBalloonStyle(): KmlBalloonStyle
  
  /**
    * Specifies how icons for point placemarks are drawn in Google Earth.
    */
  def getIconStyle(): KmlIconStyle
  
  /**
    * Specifies how the name of a feature is drawn in the 3D viewer.
    * A custom color, color mode, and scale for the label (name) can be specified.
    */
  def getLabelStyle(): KmlLabelStyle
  
  /**
    * Specifies the drawing style (color, color mode, and line width) for line geometry.
    * Line geometry includes the outlines of outlined polygons and the extruded tether of Placemark icons (if extrusion is enabled).
    */
  def getLineStyle(): KmlLineStyle
  
  /**
    * Specifies the style for list geometry.
    */
  def getListStyle(): KmlListStyle
  
  /**
    * Specifies the drawing style for polygons, including polygon extrusions (which look like the walls of buildings) and line extrusions (which look like solid fences).
    */
  def getPolyStyle(): KmlPolyStyle
}
object KmlStyle {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getBalloonStyle: CallbackTo[KmlBalloonStyle],
    getIconStyle: CallbackTo[KmlIconStyle],
    getId: CallbackTo[String],
    getLabelStyle: CallbackTo[KmlLabelStyle],
    getLineStyle: CallbackTo[KmlLineStyle],
    getListStyle: CallbackTo[KmlListStyle],
    getOwnerDocument: CallbackTo[KmlDocument],
    getParentNode: CallbackTo[KmlObject],
    getPolyStyle: CallbackTo[KmlPolyStyle],
    getType: CallbackTo[String],
    getUrl: CallbackTo[String],
    mousedown: KmlMouseEvent => Callback,
    mousemove: KmlMouseEvent => Callback,
    mouseout: KmlMouseEvent => Callback,
    mouseover: KmlMouseEvent => Callback,
    mouseup: KmlMouseEvent => Callback,
    release: Callback
  ): KmlStyle = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getBalloonStyle = getBalloonStyle.toJsFn, getIconStyle = getIconStyle.toJsFn, getId = getId.toJsFn, getLabelStyle = getLabelStyle.toJsFn, getLineStyle = getLineStyle.toJsFn, getListStyle = getListStyle.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getPolyStyle = getPolyStyle.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn)
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlStyle]
  }
  
  extension [Self <: KmlStyle](x: Self) {
    
    inline def setGetBalloonStyle(value: CallbackTo[KmlBalloonStyle]): Self = StObject.set(x, "getBalloonStyle", value.toJsFn)
    
    inline def setGetIconStyle(value: CallbackTo[KmlIconStyle]): Self = StObject.set(x, "getIconStyle", value.toJsFn)
    
    inline def setGetLabelStyle(value: CallbackTo[KmlLabelStyle]): Self = StObject.set(x, "getLabelStyle", value.toJsFn)
    
    inline def setGetLineStyle(value: CallbackTo[KmlLineStyle]): Self = StObject.set(x, "getLineStyle", value.toJsFn)
    
    inline def setGetListStyle(value: CallbackTo[KmlListStyle]): Self = StObject.set(x, "getListStyle", value.toJsFn)
    
    inline def setGetPolyStyle(value: CallbackTo[KmlPolyStyle]): Self = StObject.set(x, "getPolyStyle", value.toJsFn)
  }
}
