package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlOrientation
  extends StObject
     with KmlObject {
  
  /**
    * Rotation about the z axis (normal to the Earth's surface).
    * A value of 0 (the default) equals North.
    * A positive rotation is clockwise around the z axis and specified in degrees from 0 to 360.
    */
  def getHeading(): Double
  
  /**
    * Rotation about the y axis.
    * A positive rotation is clockwise around the y axis and specified in degrees from 0 to 360.
    */
  def getRoll(): Double
  
  /**
    * Rotation about the x axis.
    * A positive rotation is clockwise around the x axis and specified in degrees from 0 to 360.
    */
  def getTilt(): Double
  
  /**
    * Sets the heading, tilt, and roll of a model.
    */
  def set(heading: Double, tilt: Double, roll: Double): Unit
  
  /**
    * Rotation about the z axis (normal to the Earth's surface).
    * A value of 0 (the default) equals North.
    * A positive rotation is clockwise around the z axis and specified in degrees from 0 to 360.
    */
  def setHeading(heading: Double): Unit
  
  /**
    * Rotation about the y axis.
    * A positive rotation is clockwise around the y axis and specified in degrees from 0 to 360.
    */
  def setRoll(roll: Double): Unit
  
  /**
    * Rotation about the x axis.
    * A positive rotation is clockwise around the x axis and specified in degrees from 0 to 360.
    */
  def setTilt(tilt: Double): Unit
}
object KmlOrientation {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getHeading: CallbackTo[Double],
    getId: CallbackTo[String],
    getOwnerDocument: CallbackTo[KmlDocument],
    getParentNode: CallbackTo[KmlObject],
    getRoll: CallbackTo[Double],
    getTilt: CallbackTo[Double],
    getType: CallbackTo[String],
    getUrl: CallbackTo[String],
    mousedown: KmlMouseEvent => Callback,
    mousemove: KmlMouseEvent => Callback,
    mouseout: KmlMouseEvent => Callback,
    mouseover: KmlMouseEvent => Callback,
    mouseup: KmlMouseEvent => Callback,
    release: Callback,
    set: (Double, Double, Double) => Callback,
    setHeading: Double => Callback,
    setRoll: Double => Callback,
    setTilt: Double => Callback
  ): KmlOrientation = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getHeading = getHeading.toJsFn, getId = getId.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getRoll = getRoll.toJsFn, getTilt = getTilt.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, set = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (set(t0, t1, t2)).runNow()), setHeading = js.Any.fromFunction1((t0: Double) => setHeading(t0).runNow()), setRoll = js.Any.fromFunction1((t0: Double) => setRoll(t0).runNow()), setTilt = js.Any.fromFunction1((t0: Double) => setTilt(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlOrientation]
  }
  
  extension [Self <: KmlOrientation](x: Self) {
    
    inline def setGetHeading(value: CallbackTo[Double]): Self = StObject.set(x, "getHeading", value.toJsFn)
    
    inline def setGetRoll(value: CallbackTo[Double]): Self = StObject.set(x, "getRoll", value.toJsFn)
    
    inline def setGetTilt(value: CallbackTo[Double]): Self = StObject.set(x, "getTilt", value.toJsFn)
    
    inline def setSet(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetHeading(value: Double => Callback): Self = StObject.set(x, "setHeading", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetRoll(value: Double => Callback): Self = StObject.set(x, "setRoll", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetTilt(value: Double => Callback): Self = StObject.set(x, "setTilt", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
