package typingsJapgolly.node.NodeJS

import typingsJapgolly.node.Console
import typingsJapgolly.node.Fn_Radix
import typingsJapgolly.node.Fn_UriComponent
import typingsJapgolly.node.TypeofClassBuffer
import typingsJapgolly.node.TypeofIntl
import typingsJapgolly.std.ArrayBufferConstructor
import typingsJapgolly.std.ArrayConstructor
import typingsJapgolly.std.BooleanConstructor
import typingsJapgolly.std.DataViewConstructor
import typingsJapgolly.std.DateConstructor
import typingsJapgolly.std.EvalErrorConstructor
import typingsJapgolly.std.Float32ArrayConstructor
import typingsJapgolly.std.Float64ArrayConstructor
import typingsJapgolly.std.FunctionConstructor
import typingsJapgolly.std.Int16ArrayConstructor
import typingsJapgolly.std.Int32ArrayConstructor
import typingsJapgolly.std.Int8ArrayConstructor
import typingsJapgolly.std.MapConstructor
import typingsJapgolly.std.NumberConstructor
import typingsJapgolly.std.ObjectConstructor
import typingsJapgolly.std.RangeErrorConstructor
import typingsJapgolly.std.ReferenceErrorConstructor
import typingsJapgolly.std.RegExpConstructor
import typingsJapgolly.std.SetConstructor
import typingsJapgolly.std.StringConstructor
import typingsJapgolly.std.SyntaxErrorConstructor
import typingsJapgolly.std.TypeErrorConstructor
import typingsJapgolly.std.URIErrorConstructor
import typingsJapgolly.std.Uint16ArrayConstructor
import typingsJapgolly.std.Uint32ArrayConstructor
import typingsJapgolly.std.Uint8ArrayConstructor
import typingsJapgolly.std.WeakMapConstructor
import typingsJapgolly.std.WeakSetConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Global extends js.Object {
  var ArrayBuffer: ArrayBufferConstructor = js.native
  @JSName("Array")
  var Array_Original: ArrayConstructor = js.native
  @JSName("Boolean")
  var Boolean_Original: BooleanConstructor = js.native
  var Buffer: TypeofClassBuffer = js.native
  var DataView: DataViewConstructor = js.native
  @JSName("Date")
  var Date_Original: DateConstructor = js.native
  @JSName("Error")
  var Error_Original: typingsJapgolly.std.ErrorConstructor = js.native
  @JSName("EvalError")
  var EvalError_Original: EvalErrorConstructor = js.native
  var Float32Array: Float32ArrayConstructor = js.native
  var Float64Array: Float64ArrayConstructor = js.native
  @JSName("Function")
  var Function_Original: FunctionConstructor = js.native
  var GLOBAL: Global = js.native
  var Infinity: Double = js.native
  var Int16Array: Int16ArrayConstructor = js.native
  var Int32Array: Int32ArrayConstructor = js.native
  var Int8Array: Int8ArrayConstructor = js.native
  var Intl: TypeofIntl = js.native
  var JSON: typingsJapgolly.std.JSON = js.native
  var Map: MapConstructor = js.native
  var Math: typingsJapgolly.std.Math = js.native
  var NaN: Double = js.native
  @JSName("Number")
  var Number_Original: NumberConstructor = js.native
  @JSName("Object")
  var Object_Original: ObjectConstructor = js.native
  var Promise: js.Function = js.native
  @JSName("RangeError")
  var RangeError_Original: RangeErrorConstructor = js.native
  @JSName("ReferenceError")
  var ReferenceError_Original: ReferenceErrorConstructor = js.native
  @JSName("RegExp")
  var RegExp_Original: RegExpConstructor = js.native
  var Set: SetConstructor = js.native
  @JSName("String")
  var String_Original: StringConstructor = js.native
  var Symbol: js.Function = js.native
  @JSName("SyntaxError")
  var SyntaxError_Original: SyntaxErrorConstructor = js.native
  @JSName("TypeError")
  var TypeError_Original: TypeErrorConstructor = js.native
  @JSName("URIError")
  var URIError_Original: URIErrorConstructor = js.native
  var Uint16Array: Uint16ArrayConstructor = js.native
  var Uint32Array: Uint32ArrayConstructor = js.native
  var Uint8Array: Uint8ArrayConstructor = js.native
  var Uint8ClampedArray: js.Function = js.native
  var WeakMap: WeakMapConstructor = js.native
  var WeakSet: WeakSetConstructor = js.native
  var console: Console = js.native
  @JSName("decodeURIComponent")
  var decodeURIComponent_Original: js.Function1[/* encodedURIComponent */ java.lang.String, java.lang.String] = js.native
  @JSName("decodeURI")
  var decodeURI_Original: js.Function1[/* encodedURI */ java.lang.String, java.lang.String] = js.native
  @JSName("encodeURIComponent")
  var encodeURIComponent_Original: Fn_UriComponent = js.native
  @JSName("encodeURI")
  var encodeURI_Original: js.Function1[/* uri */ java.lang.String, java.lang.String] = js.native
  @JSName("eval")
  var eval_Original: js.Function1[/* x */ java.lang.String, _] = js.native
  var global: Global = js.native
  @JSName("isFinite")
  var isFinite_Original: js.Function1[/* number */ Double, Boolean] = js.native
  @JSName("isNaN")
  var isNaN_Original: js.Function1[/* number */ Double, Boolean] = js.native
  @JSName("parseFloat")
  var parseFloat_Original: js.Function1[/* string */ java.lang.String, Double] = js.native
  @JSName("parseInt")
  var parseInt_Original: Fn_Radix = js.native
  var process: Process = js.native
  @JSName("queueMicrotask")
  var queueMicrotask_Original: js.Function1[/* callback */ js.Function0[Unit], Unit] = js.native
  var root: Global = js.native
  var undefined: js.UndefOr[scala.Nothing] = js.native
  var v8debug: js.UndefOr[js.Any] = js.native
  def Array(): js.Array[_] = js.native
  def Array(arrayLength: Double): js.Array[_] = js.native
  def Array[T](items: T*): js.Array[T] = js.native
  @JSName("Array")
  def Array_T[T](arrayLength: Double): js.Array[T] = js.native
  def Boolean[T](): scala.Boolean = js.native
  def Boolean[T](value: T): scala.Boolean = js.native
  def Date(): java.lang.String = js.native
  def Error(): js.Error = js.native
  def Error(message: java.lang.String): js.Error = js.native
  def EvalError(): js.EvalError = js.native
  def EvalError(message: java.lang.String): js.EvalError = js.native
  def Function(args: java.lang.String*): js.Function = js.native
  def Number(): Double = js.native
  def Number(value: js.Any): Double = js.native
  def Object(): js.Any = js.native
  def Object(value: js.Any): js.Any = js.native
  def RangeError(): js.RangeError = js.native
  def RangeError(message: java.lang.String): js.RangeError = js.native
  def ReferenceError(): js.ReferenceError = js.native
  def ReferenceError(message: java.lang.String): js.ReferenceError = js.native
  def RegExp(pattern: java.lang.String): js.RegExp = js.native
  def RegExp(pattern: java.lang.String, flags: java.lang.String): js.RegExp = js.native
  def RegExp(pattern: typingsJapgolly.std.RegExp): js.RegExp = js.native
  def RegExp(pattern: typingsJapgolly.std.RegExp, flags: java.lang.String): js.RegExp = js.native
  def String(): java.lang.String = js.native
  def String(value: js.Any): java.lang.String = js.native
  def SyntaxError(): js.SyntaxError = js.native
  def SyntaxError(message: java.lang.String): js.SyntaxError = js.native
  def TypeError(): js.TypeError = js.native
  def TypeError(message: java.lang.String): js.TypeError = js.native
  def URIError(): js.URIError = js.native
  def URIError(message: java.lang.String): js.URIError = js.native
  def clearImmediate(immediateId: Immediate): Unit = js.native
  def clearInterval(intervalId: Timeout): Unit = js.native
  def clearTimeout(timeoutId: Timeout): Unit = js.native
  def decodeURI(encodedURI: java.lang.String): java.lang.String = js.native
  def decodeURIComponent(encodedURIComponent: java.lang.String): java.lang.String = js.native
  def encodeURI(uri: java.lang.String): java.lang.String = js.native
  def encodeURIComponent(uriComponent: java.lang.String): java.lang.String = js.native
  def encodeURIComponent(uriComponent: Boolean): java.lang.String = js.native
  def encodeURIComponent(uriComponent: Double): java.lang.String = js.native
  def escape(str: java.lang.String): java.lang.String = js.native
  def eval(x: java.lang.String): js.Any = js.native
  def gc(): Unit = js.native
  def isFinite(number: Double): Boolean = js.native
  def isNaN(number: Double): Boolean = js.native
  def parseFloat(string: java.lang.String): Double = js.native
  def parseInt(s: java.lang.String): Double = js.native
  def parseInt(s: java.lang.String, radix: Double): Double = js.native
  def queueMicrotask(callback: js.Function0[Unit]): Unit = js.native
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate = js.native
  def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
  def unescape(str: java.lang.String): java.lang.String = js.native
}

