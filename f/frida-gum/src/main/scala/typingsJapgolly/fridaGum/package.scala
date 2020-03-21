package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fridaGum {
  type AnyFunction = js.Function1[/* repeated */ js.Any, js.Any]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fridaGum.Arm64Register
    - scala.Double
    - typingsJapgolly.fridaGum.UInt64_
    - typingsJapgolly.fridaGum.Int64_
    - typingsJapgolly.fridaGum.NativePointerValue
  */
  type Arm64CallArgument = typingsJapgolly.fridaGum._Arm64CallArgument | scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fridaGum.ArmRegister
    - scala.Double
    - typingsJapgolly.fridaGum.UInt64_
    - typingsJapgolly.fridaGum.Int64_
    - typingsJapgolly.fridaGum.NativePointerValue
  */
  type ArmCallArgument = typingsJapgolly.fridaGum._ArmCallArgument | scala.Double
  type ArmSystemRegister = typingsJapgolly.fridaGum.fridaGumStrings.`apsr-nzcvq`
  type CSymbols = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.fridaGum.NativePointerValue]
  type EnumerateAction = typingsJapgolly.fridaGum.fridaGumStrings.stop
  type ExceptionHandlerCallback = js.Function1[
    /* exception */ typingsJapgolly.fridaGum.ExceptionDetails, 
    scala.Boolean | scala.Unit
  ]
  /**
    * Opaque ID returned by `setImmediate()`. Pass it to `clearImmediate()` to cancel a pending `setImmediate()`.
    */
  type ImmediateId = scala.Double
  /**
    * Callback to invoke when an instruction is about to be executed.
    */
  type InstructionProbeCallback = js.ThisFunction1[
    /* this */ typingsJapgolly.fridaGum.InvocationContext, 
    /* args */ typingsJapgolly.fridaGum.InvocationArguments, 
    scala.Unit
  ]
  /**
    * Opaque ID returned by `setInterval()`. Pass it to `clearInterval()` to cancel a pending `setInterval()`.
    */
  type IntervalId = scala.Double
  /**
    * Virtual array providing access to the argument list. Agnostic to the number of arguments and their types.
    */
  type InvocationArguments = js.Array[typingsJapgolly.fridaGum.NativePointer]
  type MemoryPatchApplyCallback = js.Function1[/* code */ typingsJapgolly.fridaGum.NativePointer, scala.Unit]
  type MessageCallback = js.Function2[
    /* message */ js.Any, 
    /* data */ typingsJapgolly.fridaGum.ArrayBuffer | scala.Null, 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fridaGum.MipsRegister
    - scala.Double
    - typingsJapgolly.fridaGum.UInt64_
    - typingsJapgolly.fridaGum.Int64_
    - typingsJapgolly.fridaGum.NativePointerValue
  */
  type MipsCallArgument = typingsJapgolly.fridaGum._MipsCallArgument | scala.Double
  type ModuleMapFilter = js.Function1[/* m */ typingsJapgolly.fridaGum.Module, scala.Boolean]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fridaGum.NativePointerValue
    - typingsJapgolly.fridaGum.UInt64_
    - typingsJapgolly.fridaGum.Int64_
    - scala.Double
    - scala.Boolean
    - js.Array[js.Any]
  */
  type NativeArgumentValue = typingsJapgolly.fridaGum._NativeArgumentValue | js.Array[js.Any] | scala.Double | scala.Boolean
  type NativeCallbackImplementation = js.ThisFunction1[
    /* this */ js.UndefOr[typingsJapgolly.fridaGum.InvocationContext], 
    /* repeated */ js.Any, 
    js.Any
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fridaGum.NativePointer
    - typingsJapgolly.fridaGum.UInt64_
    - typingsJapgolly.fridaGum.Int64_
    - scala.Double
    - scala.Boolean
    - js.Array[js.Any]
  */
  type NativeReturnValue = typingsJapgolly.fridaGum._NativeReturnValue | js.Array[js.Any] | scala.Double | scala.Boolean
  type NativeType = java.lang.String | js.Array[js.Any]
  /**
    * Given as a string of the form: rwx, where rw- means “readable and writable”.
    */
  type PageProtection = java.lang.String
  type RpcExports = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.fridaGum.AnyFunction]
  type ScheduledCallback = js.Function1[/* repeated */ js.Any, scala.Unit]
  type StalkerArm64TransformCallback = js.Function1[/* iterator */ typingsJapgolly.fridaGum.StalkerArm64Iterator, scala.Unit]
  type StalkerBlockEventBare = js.Tuple2[
    typingsJapgolly.fridaGum.NativePointer | java.lang.String, 
    typingsJapgolly.fridaGum.NativePointer | java.lang.String
  ]
  type StalkerBlockEventFull = js.Tuple3[
    typingsJapgolly.fridaGum.fridaGumStrings.block, 
    typingsJapgolly.fridaGum.NativePointer | java.lang.String, 
    typingsJapgolly.fridaGum.NativePointer | java.lang.String
  ]
  type StalkerCallEventBare = js.Tuple3[
    typingsJapgolly.fridaGum.NativePointer | java.lang.String, 
    typingsJapgolly.fridaGum.NativePointer | java.lang.String, 
    scala.Double
  ]
  type StalkerCallEventFull = js.Tuple4[
    typingsJapgolly.fridaGum.fridaGumStrings.call, 
    typingsJapgolly.fridaGum.NativePointer | java.lang.String, 
    typingsJapgolly.fridaGum.NativePointer | java.lang.String, 
    scala.Double
  ]
  type StalkerCallProbeCallback = typingsJapgolly.fridaGum.StalkerScriptCallProbeCallback | typingsJapgolly.fridaGum.StalkerNativeCallProbeCallback
  type StalkerCallProbeId = scala.Double
  type StalkerCallSummary = org.scalablytyped.runtime.StringDictionary[scala.Double]
  type StalkerCallout = typingsJapgolly.fridaGum.StalkerScriptCallout | typingsJapgolly.fridaGum.StalkerNativeCallout
  type StalkerCompileEventBare = js.Tuple2[
    typingsJapgolly.fridaGum.NativePointer | java.lang.String, 
    typingsJapgolly.fridaGum.NativePointer | java.lang.String
  ]
  type StalkerCompileEventFull = js.Tuple3[
    typingsJapgolly.fridaGum.fridaGumStrings.compile, 
    typingsJapgolly.fridaGum.NativePointer | java.lang.String, 
    typingsJapgolly.fridaGum.NativePointer | java.lang.String
  ]
  type StalkerEventBare = typingsJapgolly.fridaGum.StalkerCallEventBare | typingsJapgolly.fridaGum.StalkerRetEventBare | typingsJapgolly.fridaGum.StalkerExecEventBare | typingsJapgolly.fridaGum.StalkerBlockEventBare | typingsJapgolly.fridaGum.StalkerCompileEventBare
  type StalkerEventFull = typingsJapgolly.fridaGum.StalkerCallEventFull | typingsJapgolly.fridaGum.StalkerRetEventFull | typingsJapgolly.fridaGum.StalkerExecEventFull | typingsJapgolly.fridaGum.StalkerBlockEventFull | typingsJapgolly.fridaGum.StalkerCompileEventFull
  type StalkerExecEventBare = js.Array[typingsJapgolly.fridaGum.NativePointer | java.lang.String]
  type StalkerExecEventFull = js.Tuple2[
    typingsJapgolly.fridaGum.fridaGumStrings.exec, 
    typingsJapgolly.fridaGum.NativePointer | java.lang.String
  ]
  /**
    * Called synchronously when a call is made to the given address.
    *
    * Signature: `void onCall (GumCallSite * site, gpointer user_data)`
    */
  type StalkerNativeCallProbeCallback = typingsJapgolly.fridaGum.NativePointer
  /**
    * Signature: `void onAesEnc (GumCpuContext * cpu_context, gpointer user_data)`
    */
  type StalkerNativeCallout = typingsJapgolly.fridaGum.NativePointer
  /**
    * Signature: `void transform (GumStalkerIterator * iterator, GumStalkerWriter * output, gpointer user_data)`
    */
  type StalkerNativeTransformCallback = typingsJapgolly.fridaGum.NativePointer
  type StalkerRetEventBare = js.Tuple3[
    typingsJapgolly.fridaGum.NativePointer | java.lang.String, 
    typingsJapgolly.fridaGum.NativePointer | java.lang.String, 
    scala.Double
  ]
  type StalkerRetEventFull = js.Tuple4[
    typingsJapgolly.fridaGum.fridaGumStrings.ret, 
    typingsJapgolly.fridaGum.NativePointer | java.lang.String, 
    typingsJapgolly.fridaGum.NativePointer | java.lang.String, 
    scala.Double
  ]
  /**
    * Called synchronously when a call is made to the given address.
    */
  type StalkerScriptCallProbeCallback = js.Function1[/* args */ typingsJapgolly.fridaGum.InvocationArguments, scala.Unit]
  type StalkerScriptCallout = js.Function1[/* context */ typingsJapgolly.fridaGum.CpuContext, scala.Unit]
  type StalkerTransformCallback = typingsJapgolly.fridaGum.StalkerX86TransformCallback | typingsJapgolly.fridaGum.StalkerArm64TransformCallback | typingsJapgolly.fridaGum.StalkerNativeTransformCallback
  type StalkerX86TransformCallback = js.Function1[/* iterator */ typingsJapgolly.fridaGum.StalkerX86Iterator, scala.Unit]
  type ThreadId = scala.Double
  /**
    * Opaque ID returned by `setTimeout()`. Pass it to `clearTimeout()` to cancel a pending `setTimeout()`.
    */
  type TimeoutId = scala.Double
  type WeakRefCallback = js.Function0[scala.Unit]
  /**
    * Opaque ID returned by `WeakRef.bind()`. Pass it to `WeakRef.unbind()` to
    * stop monitoring the target value.
    */
  type WeakRefId = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fridaGum.X86Register
    - scala.Double
    - typingsJapgolly.fridaGum.UInt64_
    - typingsJapgolly.fridaGum.Int64_
    - typingsJapgolly.fridaGum.NativePointerValue
  */
  type X86CallArgument = typingsJapgolly.fridaGum._X86CallArgument | scala.Double
}
