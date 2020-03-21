package typingsJapgolly.randomJs

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.std.ArrayBufferLike
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.Int32ArrayConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/utils/Int32Array", JSImport.Namespace)
@js.native
object int32ArrayMod extends js.Object {
  @js.native
  class Int32Array ()
    extends typingsJapgolly.std.Int32Array {
    def this(arrayOrArrayBuffer: ArrayBufferLike) = this()
    def this(arrayOrArrayBuffer: ArrayLike[Double]) = this()
    def this(elements: js.Iterable[Double]) = this()
    def this(length: Double) = this()
    def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
    def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
  }
  
  @js.native
  object Int32Array extends TopLevel[Int32ArrayConstructor]
  
}

