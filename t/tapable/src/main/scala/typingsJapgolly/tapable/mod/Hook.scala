package typingsJapgolly.tapable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tapable", "Hook")
@js.native
class Hook[TArg1, TArg2, TArg3, TTabResult, THookResult] () extends js.Object {
  def this(tapArgumentNames: js.Array[String]) = this()
  var interceptors: js.Array[HookInterceptor] = js.native
  var taps: js.Array[_] = js.native
  def call(): THookResult = js.native
  def call(arg1: TArg1): THookResult = js.native
  def call(arg1: TArg1, arg2: TArg2): THookResult = js.native
  def call(arg1: TArg1, arg2: TArg2, arg3: TArg3, args: js.Any*): THookResult = js.native
  def callAsync(): THookResult = js.native
  def callAsync(arg1: TArg1): THookResult = js.native
  def callAsync(arg1: TArg1, arg2: TArg2): THookResult = js.native
  def callAsync(arg1: TArg1, arg2: TArg2, arg3: TArg3, args: js.Any*): THookResult = js.native
  def compile(options: HookCompileOptions): js.Function = js.native
  def intercept(interceptor: HookInterceptor): Unit = js.native
  def isUsed(): Boolean = js.native
  def promise(): js.Promise[THookResult] = js.native
  def promise(arg1: TArg1): js.Promise[THookResult] = js.native
  def promise(arg1: TArg1, arg2: TArg2): js.Promise[THookResult] = js.native
  def promise(arg1: TArg1, arg2: TArg2, arg3: TArg3, args: js.Any*): js.Promise[THookResult] = js.native
  def tap(
    name: String,
    fn: js.Function4[/* arg1 */ TArg1, /* arg2 */ TArg2, /* arg3 */ TArg3, /* repeated */ js.Any, TTabResult]
  ): Unit = js.native
  def tap(
    name: Tap,
    fn: js.Function4[/* arg1 */ TArg1, /* arg2 */ TArg2, /* arg3 */ TArg3, /* repeated */ js.Any, TTabResult]
  ): Unit = js.native
  def tapAsync(
    name: String,
    fn: js.Function4[/* arg1 */ TArg1, /* arg2 */ TArg2, /* arg3 */ TArg3, /* repeated */ js.Any, Unit]
  ): Unit = js.native
  def tapAsync(
    name: Tap,
    fn: js.Function4[/* arg1 */ TArg1, /* arg2 */ TArg2, /* arg3 */ TArg3, /* repeated */ js.Any, Unit]
  ): Unit = js.native
  def tapPromise(
    name: String,
    fn: js.Function4[
      /* arg1 */ TArg1, 
      /* arg2 */ TArg2, 
      /* arg3 */ TArg3, 
      /* repeated */ js.Any, 
      js.Promise[TTabResult]
    ]
  ): Unit = js.native
  def tapPromise(
    name: Tap,
    fn: js.Function4[
      /* arg1 */ TArg1, 
      /* arg2 */ TArg2, 
      /* arg3 */ TArg3, 
      /* repeated */ js.Any, 
      js.Promise[TTabResult]
    ]
  ): Unit = js.native
}

