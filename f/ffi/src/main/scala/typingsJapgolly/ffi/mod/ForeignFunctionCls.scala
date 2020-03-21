package typingsJapgolly.ffi.mod

import typingsJapgolly.ffi.Buffer
import typingsJapgolly.ref.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ffi", "ForeignFunction")
@js.native
class ForeignFunctionCls protected () extends ForeignFunction {
  def this(ptr: Buffer, retType: String, argTypes: js.Array[_]) = this()
  def this(ptr: Buffer, retType: Type, argTypes: js.Array[_]) = this()
  def this(ptr: Buffer, retType: String, argTypes: js.Array[_], abi: Double) = this()
  def this(ptr: Buffer, retType: Type, argTypes: js.Array[_], abi: Double) = this()
}

