package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlColorStyle
  extends StObject
     with KmlObject {
  
  /**
    * Color and opacity (alpha) values.
    */
  def getColor(): KmlColor
  
  /**
    * Specifies which color mode effect to apply to the base color.
    * 
    * See also:
    *
    * * GEPlugin.COLOR_NORMAL
    * * GEPlugin.COLOR_INHERIT
    * * GEPlugin.COLOR_RANDOM
    */
  def getColorMode(): KmlColorModeEnum
  
  /**
    * Specifies which color mode effect to apply to the base color.
    * 
    * See also:
    *
    * * GEPlugin.COLOR_NORMAL
    * * GEPlugin.COLOR_INHERIT
    * * GEPlugin.COLOR_RANDOM
    */
  def setColorMode(colorMode: KmlColorModeEnum): Unit
}
object KmlColorStyle {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getColor: CallbackTo[KmlColor],
    getColorMode: CallbackTo[KmlColorModeEnum],
    getId: CallbackTo[String],
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
    setColorMode: KmlColorModeEnum => Callback
  ): KmlColorStyle = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getColor = getColor.toJsFn, getColorMode = getColorMode.toJsFn, getId = getId.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, setColorMode = js.Any.fromFunction1((t0: KmlColorModeEnum) => setColorMode(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlColorStyle]
  }
  
  extension [Self <: KmlColorStyle](x: Self) {
    
    inline def setGetColor(value: CallbackTo[KmlColor]): Self = StObject.set(x, "getColor", value.toJsFn)
    
    inline def setGetColorMode(value: CallbackTo[KmlColorModeEnum]): Self = StObject.set(x, "getColorMode", value.toJsFn)
    
    inline def setSetColorMode(value: KmlColorModeEnum => Callback): Self = StObject.set(x, "setColorMode", js.Any.fromFunction1((t0: KmlColorModeEnum) => value(t0).runNow()))
  }
}
