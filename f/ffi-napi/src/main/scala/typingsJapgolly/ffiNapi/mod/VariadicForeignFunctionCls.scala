package typingsJapgolly.ffiNapi.mod

import typingsJapgolly.ffiNapi.Buffer
import typingsJapgolly.refNapi.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ffi-napi", "VariadicForeignFunction")
@js.native
class VariadicForeignFunctionCls protected () extends VariadicForeignFunction {
  def this(ptr: Buffer, ret: String, fixedArgs: js.Array[_]) = this()
  def this(ptr: Buffer, ret: Type, fixedArgs: js.Array[_]) = this()
  def this(ptr: Buffer, ret: String, fixedArgs: js.Array[_], abi: Double) = this()
  def this(ptr: Buffer, ret: Type, fixedArgs: js.Array[_], abi: Double) = this()
}

