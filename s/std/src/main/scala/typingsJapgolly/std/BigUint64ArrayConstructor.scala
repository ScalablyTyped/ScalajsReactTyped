package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BigUint64ArrayConstructor
  extends Instantiable0[BigUint64Array]
     with Instantiable2[/* buffer */ ArrayBufferLike, /* byteOffset */ Double, BigUint64Array]
     with Instantiable3[
      /* buffer */ ArrayBufferLike, 
      /* byteOffset */ Double, 
      /* length */ Double, 
      BigUint64Array
    ]
     with Instantiable1[
      (/* buffer */ ArrayBufferLike) | (/* length */ Double) | (/* array */ Iterable[BigInt]), 
      BigUint64Array
    ] {
  /** The size in bytes of each element in the array. */
  val BYTES_PER_ELEMENT: Double = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param arrayLike An array-like or iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  def from(arrayLike: ArrayLike[BigInt]): BigUint64Array = js.native
  def from[U](arrayLike: ArrayLike[U], mapfn: js.Function2[/* v */ U, /* k */ Double, BigInt]): BigUint64Array = js.native
  def from[U](arrayLike: ArrayLike[U], mapfn: js.Function2[/* v */ U, /* k */ Double, BigInt], thisArg: js.Any): BigUint64Array = js.native
  /**
    * Returns a new array from a set of elements.
    * @param items A set of elements to include in the new array object.
    */
  def of(items: BigInt*): BigUint64Array = js.native
}

