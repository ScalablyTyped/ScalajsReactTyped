package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlLabelStyle
  extends StObject
     with KmlColorStyle {
  
  /**
    * Resizes the label.
    */
  def getScale(): Double
  
  /**
    * Resizes the label.
    */
  def setScale(scale: Double): Unit
}
object KmlLabelStyle {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getColor: CallbackTo[KmlColor],
    getColorMode: CallbackTo[KmlColorModeEnum],
    getId: CallbackTo[String],
    getOwnerDocument: CallbackTo[KmlDocument],
    getParentNode: CallbackTo[KmlObject],
    getScale: CallbackTo[Double],
    getType: CallbackTo[String],
    getUrl: CallbackTo[String],
    mousedown: KmlMouseEvent => Callback,
    mousemove: KmlMouseEvent => Callback,
    mouseout: KmlMouseEvent => Callback,
    mouseover: KmlMouseEvent => Callback,
    mouseup: KmlMouseEvent => Callback,
    release: Callback,
    setColorMode: KmlColorModeEnum => Callback,
    setScale: Double => Callback
  ): KmlLabelStyle = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getColor = getColor.toJsFn, getColorMode = getColorMode.toJsFn, getId = getId.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getScale = getScale.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, setColorMode = js.Any.fromFunction1((t0: KmlColorModeEnum) => setColorMode(t0).runNow()), setScale = js.Any.fromFunction1((t0: Double) => setScale(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlLabelStyle]
  }
  
  extension [Self <: KmlLabelStyle](x: Self) {
    
    inline def setGetScale(value: CallbackTo[Double]): Self = StObject.set(x, "getScale", value.toJsFn)
    
    inline def setSetScale(value: Double => Callback): Self = StObject.set(x, "setScale", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
