package typingsJapgolly.ffi.mod

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typingsJapgolly.ffi.Buffer
import typingsJapgolly.ref.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariadicForeignFunction extends js.Object {
  /**
    * Return type as a property of the function generator to
    * allow for monkey patching the return value in the very rare case where the
    * return type is variadic as well
    */
  var returnType: js.Any = js.native
  /**
    * What gets returned is another function that needs to be invoked with the rest
    * of the variadic types that are being invoked from the function.
    */
  def apply(args: js.Any*): ForeignFunction = js.native
}

@JSImport("ffi", "VariadicForeignFunction")
@js.native
object VariadicForeignFunction
  extends Instantiable3[
      /* ptr */ Buffer, 
      (/* ret */ String) | (/* ret */ Type), 
      /* fixedArgs */ js.Array[js.Any], 
      VariadicForeignFunction
    ]
     with Instantiable4[
      /* ptr */ Buffer, 
      (/* ret */ String) | (/* ret */ Type), 
      /* fixedArgs */ js.Array[js.Any], 
      /* abi */ Double, 
      VariadicForeignFunction
    ] {
  def apply(ptr: Buffer, ret: String, fixedArgs: js.Array[_]): VariadicForeignFunction = js.native
  def apply(ptr: Buffer, ret: String, fixedArgs: js.Array[_], abi: Double): VariadicForeignFunction = js.native
  def apply(ptr: Buffer, ret: Type, fixedArgs: js.Array[_]): VariadicForeignFunction = js.native
  def apply(ptr: Buffer, ret: Type, fixedArgs: js.Array[_], abi: Double): VariadicForeignFunction = js.native
}

