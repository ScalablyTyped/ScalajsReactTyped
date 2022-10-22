package typingsJapgolly.minappEnv

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayConstructor
  extends StObject
     with Instantiable0[Array[Any]]
     with Instantiable1[
      (/* arrayLength */ Double) | (/* items (repeated) */ js.Object), 
      Array[Any | js.Object]
    ] {
  
  def apply(): Array[Any] = js.native
  def apply(arrayLength: Double): Array[Any] = js.native
  def apply[T](items: T*): Array[T] = js.native
  
  /**
    * Creates an array from an array-like object.
    * @param arrayLike An array-like object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  def from[T, U](arrayLike: ArrayLike[T]): Array[U] = js.native
  def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): Array[U] = js.native
  def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: Any): Array[U] = js.native
  def from[T, U](arrayLike: ArrayLike[T], mapfn: Unit, thisArg: Any): Array[U] = js.native
  /**
    * Creates an array from an iterable object.
    * @param iterable An iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  def from[T, U](iterable: Iterable[T]): Array[U] = js.native
  def from[T, U](iterable: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): Array[U] = js.native
  def from[T, U](iterable: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: Any): Array[U] = js.native
  def from[T, U](iterable: Iterable[T], mapfn: Unit, thisArg: Any): Array[U] = js.native
  
  def isArray(arg: Any): /* is minapp-env.Array<any> */ scala.Boolean = js.native
  
  /**
    * Returns a new array from a set of elements.
    * @param items A set of elements to include in the new array object.
    */
  def of[T](items: T*): Array[T] = js.native
}
