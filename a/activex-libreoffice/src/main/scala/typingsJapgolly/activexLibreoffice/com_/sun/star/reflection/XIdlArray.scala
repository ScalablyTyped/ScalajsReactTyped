package typingsJapgolly.activexLibreoffice.com_.sun.star.reflection

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects an IDL sequence and provides dynamic access to instances of that sequence. This interface supports widening conversion when getting or
  * setting elements.
  */
trait XIdlArray
  extends StObject
     with XInterface {
  
  /**
    * Returns element at given index.
    * @param aArray sequence instance
    * @param nIndex index
    * @returns value
    * @throws IllegalArgumentException if the specified object is not a sequence or if the specified object is null
    * @throws ArrayIndexOutOfBoundsException if the specified index argument is negative, or if it is greater than or equal to the length of the specified sequence.
    */
  def get(aArray: Any, nIndex: Double): Any
  
  /**
    * Returns the length of the given sequence.
    * @param array sequence instance
    * @returns length of sequence
    */
  def getLen(array: Any): Double
  
  /**
    * Rellocates the length of the sequence instance.
    * @param array sequence instance
    * @param length new length of sequence
    */
  def realloc(array: js.Array[Any], length: Double): Unit
  
  /**
    * Sets a new value at given index.
    * @param aArray sequence instance
    * @param nIndex index
    * @param aNewValue new value to be set
    * @throws IllegalArgumentException if the specified object is not a sequence or if the specified object is null
    * @throws ArrayIndexOutOfBoundsException if the specified index argument is negative, or if it is greater than or equal to the length of the specified sequence.
    */
  def set(aArray: js.Array[Any], nIndex: Double, aNewValue: Any): Unit
}
object XIdlArray {
  
  inline def apply(
    acquire: Callback,
    get: (Any, Double) => Any,
    getLen: Any => Double,
    queryInterface: `type` => Any,
    realloc: (js.Array[Any], Double) => Callback,
    release: Callback,
    set: (js.Array[Any], Double, Any) => Callback
  ): XIdlArray = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, get = js.Any.fromFunction2(get), getLen = js.Any.fromFunction1(getLen), queryInterface = js.Any.fromFunction1(queryInterface), realloc = js.Any.fromFunction2((t0: js.Array[Any], t1: Double) => (realloc(t0, t1)).runNow()), release = release.toJsFn, set = js.Any.fromFunction3((t0: js.Array[Any], t1: Double, t2: Any) => (set(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[XIdlArray]
  }
  
  extension [Self <: XIdlArray](x: Self) {
    
    inline def setGet(value: (Any, Double) => Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setGetLen(value: Any => Double): Self = StObject.set(x, "getLen", js.Any.fromFunction1(value))
    
    inline def setRealloc(value: (js.Array[Any], Double) => Callback): Self = StObject.set(x, "realloc", js.Any.fromFunction2((t0: js.Array[Any], t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSet(value: (js.Array[Any], Double, Any) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction3((t0: js.Array[Any], t1: Double, t2: Any) => (value(t0, t1, t2)).runNow()))
  }
}
