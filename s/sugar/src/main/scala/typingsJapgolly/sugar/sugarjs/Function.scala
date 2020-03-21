package typingsJapgolly.sugar.sugarjs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sugarjs.Function")
@js.native
object Function extends js.Object {
  @js.native
  trait ChainableBase[RawValue] extends js.Object {
    var raw: RawValue = js.native
    def after(n: Double): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    @JSName("apply")
    def apply(thisArg: js.Any): SugarDefaultChainable[_] = js.native
    @JSName("apply")
    def apply(thisArg: js.Any, argArray: js.Any): SugarDefaultChainable[_] = js.native
    def bind(thisArg: js.Any, argArray: js.Any*): SugarDefaultChainable[_] = js.native
    def call(thisArg: js.Any, argArray: js.Any*): SugarDefaultChainable[_] = js.native
    def cancel(): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def debounce(): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def debounce(ms: Double): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def delay(): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def delay(ms: Double, args: js.Any*): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def every(): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def every(ms: Double, args: js.Any*): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def `lazy`(): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def `lazy`(ms: Double): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def `lazy`(ms: Double, immediate: Boolean): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def `lazy`(ms: Double, immediate: Boolean, limit: Double): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def lock(): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def lock(n: Double): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def memoize(): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def memoize(hashFn: java.lang.String): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def memoize(hashFn: java.lang.String, limit: Double): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def memoize(hashFn: typingsJapgolly.sugar.Function): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def memoize(hashFn: typingsJapgolly.sugar.Function, limit: Double): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def once(): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def partial(args: js.Any*): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def throttle(): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
    def throttle(ms: Double): SugarDefaultChainable[typingsJapgolly.sugar.Function] = js.native
  }
  
  @js.native
  trait Constructor
    extends SugarNamespace
       with Instantiable0[Chainable[typingsJapgolly.sugar.Function]]
       with Instantiable1[
          /* raw */ typingsJapgolly.sugar.Function, 
          Chainable[typingsJapgolly.sugar.Function]
        ] {
    def apply(): Chainable[typingsJapgolly.sugar.Function] = js.native
    def apply(raw: typingsJapgolly.sugar.Function): Chainable[typingsJapgolly.sugar.Function] = js.native
    def after(instance: typingsJapgolly.sugar.Function, n: Double): typingsJapgolly.sugar.Function = js.native
    def cancel(instance: typingsJapgolly.sugar.Function): typingsJapgolly.sugar.Function = js.native
    def debounce(instance: typingsJapgolly.sugar.Function): typingsJapgolly.sugar.Function = js.native
    def debounce(instance: typingsJapgolly.sugar.Function, ms: Double): typingsJapgolly.sugar.Function = js.native
    def delay(instance: typingsJapgolly.sugar.Function): typingsJapgolly.sugar.Function = js.native
    def delay(instance: typingsJapgolly.sugar.Function, ms: Double, args: js.Any*): typingsJapgolly.sugar.Function = js.native
    def every(instance: typingsJapgolly.sugar.Function): typingsJapgolly.sugar.Function = js.native
    def every(instance: typingsJapgolly.sugar.Function, ms: Double, args: js.Any*): typingsJapgolly.sugar.Function = js.native
    def `lazy`(instance: typingsJapgolly.sugar.Function): typingsJapgolly.sugar.Function = js.native
    def `lazy`(instance: typingsJapgolly.sugar.Function, ms: Double): typingsJapgolly.sugar.Function = js.native
    def `lazy`(instance: typingsJapgolly.sugar.Function, ms: Double, immediate: Boolean): typingsJapgolly.sugar.Function = js.native
    def `lazy`(instance: typingsJapgolly.sugar.Function, ms: Double, immediate: Boolean, limit: Double): typingsJapgolly.sugar.Function = js.native
    def lock(instance: typingsJapgolly.sugar.Function): typingsJapgolly.sugar.Function = js.native
    def lock(instance: typingsJapgolly.sugar.Function, n: Double): typingsJapgolly.sugar.Function = js.native
    def memoize(instance: typingsJapgolly.sugar.Function): typingsJapgolly.sugar.Function = js.native
    def memoize(instance: typingsJapgolly.sugar.Function, hashFn: java.lang.String): typingsJapgolly.sugar.Function = js.native
    def memoize(instance: typingsJapgolly.sugar.Function, hashFn: java.lang.String, limit: Double): typingsJapgolly.sugar.Function = js.native
    def memoize(instance: typingsJapgolly.sugar.Function, hashFn: typingsJapgolly.sugar.Function): typingsJapgolly.sugar.Function = js.native
    def memoize(instance: typingsJapgolly.sugar.Function, hashFn: typingsJapgolly.sugar.Function, limit: Double): typingsJapgolly.sugar.Function = js.native
    def once(instance: typingsJapgolly.sugar.Function): typingsJapgolly.sugar.Function = js.native
    def partial(instance: typingsJapgolly.sugar.Function, args: js.Any*): typingsJapgolly.sugar.Function = js.native
    def throttle(instance: typingsJapgolly.sugar.Function): typingsJapgolly.sugar.Function = js.native
    def throttle(instance: typingsJapgolly.sugar.Function, ms: Double): typingsJapgolly.sugar.Function = js.native
  }
  
  type Chainable[RawValue] = ChainableBase[RawValue] with typingsJapgolly.sugar.sugarjs.Object.ChainableBase[RawValue]
}

