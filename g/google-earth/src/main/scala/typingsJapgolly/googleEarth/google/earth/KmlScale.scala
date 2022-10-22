package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlScale
  extends StObject
     with KmlObject {
  
  /**
    * Indicates the x coordinate.
    */
  def getX(): Double
  
  /**
    * Indicates the y coordinate.
    */
  def getY(): Double
  
  /**
    * Indicates the z coordinate.
    */
  def getZ(): Double
  
  /**
    * Sets the x, y, and z coordinates for a model.
    */
  def set(x: Double, y: Double, z: Double): Unit
  
  /**
    * Indicates the x coordinate.
    */
  def setX(x: Double): Unit
  
  /**
    * Indicates the y coordinate.
    */
  def setY(y: Double): Unit
  
  /**
    * Indicates the z coordinate.
    */
  def setZ(z: Double): Unit
}
object KmlScale {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getId: CallbackTo[String],
    getOwnerDocument: CallbackTo[KmlDocument],
    getParentNode: CallbackTo[KmlObject],
    getType: CallbackTo[String],
    getUrl: CallbackTo[String],
    getX: CallbackTo[Double],
    getY: CallbackTo[Double],
    getZ: CallbackTo[Double],
    mousedown: KmlMouseEvent => Callback,
    mousemove: KmlMouseEvent => Callback,
    mouseout: KmlMouseEvent => Callback,
    mouseover: KmlMouseEvent => Callback,
    mouseup: KmlMouseEvent => Callback,
    release: Callback,
    set: (Double, Double, Double) => Callback,
    setX: Double => Callback,
    setY: Double => Callback,
    setZ: Double => Callback
  ): KmlScale = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getId = getId.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, getX = getX.toJsFn, getY = getY.toJsFn, getZ = getZ.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, set = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (set(t0, t1, t2)).runNow()), setX = js.Any.fromFunction1((t0: Double) => setX(t0).runNow()), setY = js.Any.fromFunction1((t0: Double) => setY(t0).runNow()), setZ = js.Any.fromFunction1((t0: Double) => setZ(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlScale]
  }
  
  extension [Self <: KmlScale](x: Self) {
    
    inline def setGetX(value: CallbackTo[Double]): Self = StObject.set(x, "getX", value.toJsFn)
    
    inline def setGetY(value: CallbackTo[Double]): Self = StObject.set(x, "getY", value.toJsFn)
    
    inline def setGetZ(value: CallbackTo[Double]): Self = StObject.set(x, "getZ", value.toJsFn)
    
    inline def setSet(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetX(value: Double => Callback): Self = StObject.set(x, "setX", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetY(value: Double => Callback): Self = StObject.set(x, "setY", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetZ(value: Double => Callback): Self = StObject.set(x, "setZ", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
