package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlIconStyle
  extends StObject
     with KmlColorStyle {
  
  /**
    * The direction that icons are set to point, clockwise, and in degrees.
    */
  def getHeading(): Double
  
  /**
    * Specifies the position within the Icon that is anchored to the point specified in the placemark.
    * The x and y values can be specified in three different ways: as pixels, as fractions of the icon, or as inset pixels, which is an offset in pixels from the upper right corner of the icon.
    * The x and y positions can be specified in different ways.
    * For example, x can be in pixels and y can be a fraction.
    * The origin of the coordinate system is in the lower left corner of the icon.
    */
  def getHotSpot(): KmlVec2
  
  /**
    * A custom Icon. In KmlIconStyle, the only child element of KmlIcon is href and href is an HTTP address or a local file specification used to load an icon.
    */
  def getIcon(): KmlIcon
  
  /**
    * Resizes the icon.
    */
  def getScale(): Double
  
  /**
    * The direction that icons are set to point, clockwise, and in degrees.
    */
  def setHeading(heading: Double): Unit
  
  /**
    * A custom Icon. In KmlIconStyle, the only child element of KmlIcon is href and href is an HTTP address or a local file specification used to load an icon.
    */
  def setIcon(icon: KmlIcon): Unit
  
  /**
    * Resizes the icon.
    */
  def setScale(scale: Double): Unit
}
object KmlIconStyle {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getColor: CallbackTo[KmlColor],
    getColorMode: CallbackTo[KmlColorModeEnum],
    getHeading: CallbackTo[Double],
    getHotSpot: CallbackTo[KmlVec2],
    getIcon: CallbackTo[KmlIcon],
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
    setHeading: Double => Callback,
    setIcon: KmlIcon => Callback,
    setScale: Double => Callback
  ): KmlIconStyle = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getColor = getColor.toJsFn, getColorMode = getColorMode.toJsFn, getHeading = getHeading.toJsFn, getHotSpot = getHotSpot.toJsFn, getIcon = getIcon.toJsFn, getId = getId.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getScale = getScale.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, setColorMode = js.Any.fromFunction1((t0: KmlColorModeEnum) => setColorMode(t0).runNow()), setHeading = js.Any.fromFunction1((t0: Double) => setHeading(t0).runNow()), setIcon = js.Any.fromFunction1((t0: KmlIcon) => setIcon(t0).runNow()), setScale = js.Any.fromFunction1((t0: Double) => setScale(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlIconStyle]
  }
  
  extension [Self <: KmlIconStyle](x: Self) {
    
    inline def setGetHeading(value: CallbackTo[Double]): Self = StObject.set(x, "getHeading", value.toJsFn)
    
    inline def setGetHotSpot(value: CallbackTo[KmlVec2]): Self = StObject.set(x, "getHotSpot", value.toJsFn)
    
    inline def setGetIcon(value: CallbackTo[KmlIcon]): Self = StObject.set(x, "getIcon", value.toJsFn)
    
    inline def setGetScale(value: CallbackTo[Double]): Self = StObject.set(x, "getScale", value.toJsFn)
    
    inline def setSetHeading(value: Double => Callback): Self = StObject.set(x, "setHeading", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetIcon(value: KmlIcon => Callback): Self = StObject.set(x, "setIcon", js.Any.fromFunction1((t0: KmlIcon) => value(t0).runNow()))
    
    inline def setSetScale(value: Double => Callback): Self = StObject.set(x, "setScale", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
