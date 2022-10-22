package typingsJapgolly.fridaGum.global

import typingsJapgolly.fridaGum.GetNativeCallbackArgumentValue
import typingsJapgolly.fridaGum.GetNativeCallbackReturnValue
import typingsJapgolly.fridaGum.NativeABI
import typingsJapgolly.fridaGum.NativeCallbackArgumentType
import typingsJapgolly.fridaGum.NativeCallbackImplementation
import typingsJapgolly.fridaGum.NativeCallbackReturnType
import typingsJapgolly.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("NativeCallback")
@js.native
open class NativeCallback[RetType /* <: NativeCallbackReturnType */, ArgTypes /* <: js.Array[Any | NativeCallbackArgumentType] */] protected ()
  extends StObject
     with typingsJapgolly.fridaGum.NativePointer {
  def this(
    func: NativeCallbackImplementation[
        GetNativeCallbackReturnValue[RetType], 
        Extract[GetNativeCallbackArgumentValue[ArgTypes], js.Array[Any]]
      ],
    retType: RetType,
    argTypes: ArgTypes
  ) = this()
  def this(
    func: NativeCallbackImplementation[
        GetNativeCallbackReturnValue[RetType], 
        Extract[GetNativeCallbackArgumentValue[ArgTypes], js.Array[Any]]
      ],
    retType: RetType,
    argTypes: ArgTypes,
    abi: NativeABI
  ) = this()
}
