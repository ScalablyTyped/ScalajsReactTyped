package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlExtrudableGeometry
  extends StObject
     with KmlAltitudeGeometry {
  
  /**
    * Specifies whether to connect the geometry to the ground.
    */
  def getExtrude(): Boolean
  
  /**
    * Specifies whether to allow the geometry to follow the terrain elevation.
    */
  def getTessellate(): Boolean
  
  /**
    * Specifies whether to connect the geometry to the ground.
    */
  def setExtrude(extrude: Boolean): Unit
  
  /**
    * Specifies whether to allow the geometry to follow the terrain elevation.
    */
  def setTessellate(tessellate: Boolean): Unit
}
object KmlExtrudableGeometry {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getAltitudeMode: CallbackTo[KmlAltitudeModeEnum],
    getExtrude: CallbackTo[Boolean],
    getId: CallbackTo[String],
    getOwnerDocument: CallbackTo[KmlDocument],
    getParentNode: CallbackTo[KmlObject],
    getTessellate: CallbackTo[Boolean],
    getType: CallbackTo[String],
    getUrl: CallbackTo[String],
    mousedown: KmlMouseEvent => Callback,
    mousemove: KmlMouseEvent => Callback,
    mouseout: KmlMouseEvent => Callback,
    mouseover: KmlMouseEvent => Callback,
    mouseup: KmlMouseEvent => Callback,
    release: Callback,
    setAltitudeMode: KmlAltitudeModeEnum => Callback,
    setExtrude: Boolean => Callback,
    setTessellate: Boolean => Callback
  ): KmlExtrudableGeometry = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getAltitudeMode = getAltitudeMode.toJsFn, getExtrude = getExtrude.toJsFn, getId = getId.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getTessellate = getTessellate.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, setAltitudeMode = js.Any.fromFunction1((t0: KmlAltitudeModeEnum) => setAltitudeMode(t0).runNow()), setExtrude = js.Any.fromFunction1((t0: Boolean) => setExtrude(t0).runNow()), setTessellate = js.Any.fromFunction1((t0: Boolean) => setTessellate(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlExtrudableGeometry]
  }
  
  extension [Self <: KmlExtrudableGeometry](x: Self) {
    
    inline def setGetExtrude(value: CallbackTo[Boolean]): Self = StObject.set(x, "getExtrude", value.toJsFn)
    
    inline def setGetTessellate(value: CallbackTo[Boolean]): Self = StObject.set(x, "getTessellate", value.toJsFn)
    
    inline def setSetExtrude(value: Boolean => Callback): Self = StObject.set(x, "setExtrude", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetTessellate(value: Boolean => Callback): Self = StObject.set(x, "setTessellate", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
