package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlPolyStyle
  extends StObject
     with KmlColorStyle {
  
  /**
    * Specifies whether or not to fill the polygon. Possible values 1 (fill) and 0 (no fill).
    */
  def getFill(): Boolean
  
  /**
    * Specifies whether to outline the polygon. Polygon outlines use the current KmlLineStyle.
    */
  def getOutline(): Boolean
  
  /**
    * Specifies whether or not to fill the polygon. Possible values 1 (fill) and 0 (no fill).
    */
  def setFill(fill: Boolean): Unit
  
  /**
    * Specifies whether to outline the polygon. Polygon outlines use the current KmlLineStyle.
    */
  def setOutline(outline: Boolean): Unit
}
object KmlPolyStyle {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getColor: CallbackTo[KmlColor],
    getColorMode: CallbackTo[KmlColorModeEnum],
    getFill: CallbackTo[Boolean],
    getId: CallbackTo[String],
    getOutline: CallbackTo[Boolean],
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
    setColorMode: KmlColorModeEnum => Callback,
    setFill: Boolean => Callback,
    setOutline: Boolean => Callback
  ): KmlPolyStyle = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getColor = getColor.toJsFn, getColorMode = getColorMode.toJsFn, getFill = getFill.toJsFn, getId = getId.toJsFn, getOutline = getOutline.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, setColorMode = js.Any.fromFunction1((t0: KmlColorModeEnum) => setColorMode(t0).runNow()), setFill = js.Any.fromFunction1((t0: Boolean) => setFill(t0).runNow()), setOutline = js.Any.fromFunction1((t0: Boolean) => setOutline(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlPolyStyle]
  }
  
  extension [Self <: KmlPolyStyle](x: Self) {
    
    inline def setGetFill(value: CallbackTo[Boolean]): Self = StObject.set(x, "getFill", value.toJsFn)
    
    inline def setGetOutline(value: CallbackTo[Boolean]): Self = StObject.set(x, "getOutline", value.toJsFn)
    
    inline def setSetFill(value: Boolean => Callback): Self = StObject.set(x, "setFill", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetOutline(value: Boolean => Callback): Self = StObject.set(x, "setOutline", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
