package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlCoordArray extends StObject {
  
  /**
    * Clears all of the elements in the array
    */
  def clear(): Unit
  
  /**
    * Returns the coordinates at the given index.
    */
  def get(index: Double): KmlCoord
  
  /**
    * Specifies the length of the index array.
    */
  def getLength(): Double
  
  /**
    * Deletes the last element of an array, decrements the array length, and returns the value that is removed.
    */
  def pop(): KmlCoord
  
  /**
    * Appends one or more new elements to the end of an array and returns the new length of the array.
    */
  def push(coordOrList: KmlCoord): Unit
  
  /**
    * Appends one or more new elements to the end of an array and returns the new length of the array.
    */
  def pushLatLngAlt(latitude: Double, longitude: Double, altitude: Double): Unit
  
  /**
    * Reverses the order of the elements in the array.
    */
  def reverse(): Unit
  
  /**
    * Sets the coordinates at the given index..
    */
  def set(index: Double, coord: KmlCoord): Unit
  
  /**
    * Sets the latitude, longitude, and altitude.
    */
  def setLatLngAlt(index: Double, latitude: Double, longitude: Double, altitude: Double): Unit
  
  /**
    * Removes and returns the first element of the array.
    */
  def shift(): KmlCoord
  
  /**
    * Adds an element or elements to the beginning of an array.
    */
  def unshift(coordOrList: KmlCoord): Double
  
  /**
    * Adds an element or elements to the beginning of an array.
    */
  def unshiftLatLngAlt(latitude: Double, longitude: Double, altitude: Double): Unit
}
object KmlCoordArray {
  
  inline def apply(
    clear: Callback,
    get: Double => KmlCoord,
    getLength: CallbackTo[Double],
    pop: CallbackTo[KmlCoord],
    push: KmlCoord => Callback,
    pushLatLngAlt: (Double, Double, Double) => Callback,
    reverse: Callback,
    set: (Double, KmlCoord) => Callback,
    setLatLngAlt: (Double, Double, Double, Double) => Callback,
    shift: CallbackTo[KmlCoord],
    unshift: KmlCoord => Double,
    unshiftLatLngAlt: (Double, Double, Double) => Callback
  ): KmlCoordArray = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, get = js.Any.fromFunction1(get), getLength = getLength.toJsFn, pop = pop.toJsFn, push = js.Any.fromFunction1((t0: KmlCoord) => push(t0).runNow()), pushLatLngAlt = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (pushLatLngAlt(t0, t1, t2)).runNow()), reverse = reverse.toJsFn, set = js.Any.fromFunction2((t0: Double, t1: KmlCoord) => (set(t0, t1)).runNow()), setLatLngAlt = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (setLatLngAlt(t0, t1, t2, t3)).runNow()), shift = shift.toJsFn, unshift = js.Any.fromFunction1(unshift), unshiftLatLngAlt = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (unshiftLatLngAlt(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[KmlCoordArray]
  }
  
  extension [Self <: KmlCoordArray](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setGet(value: Double => KmlCoord): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
    
    inline def setPop(value: CallbackTo[KmlCoord]): Self = StObject.set(x, "pop", value.toJsFn)
    
    inline def setPush(value: KmlCoord => Callback): Self = StObject.set(x, "push", js.Any.fromFunction1((t0: KmlCoord) => value(t0).runNow()))
    
    inline def setPushLatLngAlt(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "pushLatLngAlt", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setReverse(value: Callback): Self = StObject.set(x, "reverse", value.toJsFn)
    
    inline def setSet(value: (Double, KmlCoord) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: Double, t1: KmlCoord) => (value(t0, t1)).runNow()))
    
    inline def setSetLatLngAlt(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "setLatLngAlt", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setShift(value: CallbackTo[KmlCoord]): Self = StObject.set(x, "shift", value.toJsFn)
    
    inline def setUnshift(value: KmlCoord => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
    
    inline def setUnshiftLatLngAlt(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "unshiftLatLngAlt", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
  }
}
