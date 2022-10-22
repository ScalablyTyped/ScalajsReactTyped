package typingsJapgolly.bluebirdGlobal

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.bluebird.anon.AsyncHooks
import typingsJapgolly.bluebird.mod.Bluebird
import typingsJapgolly.bluebird.mod.CatchFilter
import typingsJapgolly.bluebird.mod.ConcurrencyOption
import typingsJapgolly.bluebird.mod.Constructor
import typingsJapgolly.bluebird.mod.CoroutineOptions
import typingsJapgolly.bluebird.mod.Disposer
import typingsJapgolly.bluebird.mod.FromNodeOptions
import typingsJapgolly.bluebird.mod.Inspection
import typingsJapgolly.bluebird.mod.PromisifyAllOptions
import typingsJapgolly.bluebird.mod.PromisifyAll_
import typingsJapgolly.bluebird.mod.PromisifyOptions
import typingsJapgolly.bluebird.mod.Resolvable
import typingsJapgolly.bluebird.mod.ResolvableProps
import typingsJapgolly.bluebird.mod.Resolver
import typingsJapgolly.bluebird.mod.SpreadOption
import typingsJapgolly.bluebird.mod.^
import typingsJapgolly.bluebirdGlobal.anon.Fn0
import typingsJapgolly.bluebirdGlobal.anon.Fn1
import typingsJapgolly.bluebirdGlobal.anon.Fn2
import typingsJapgolly.bluebirdGlobal.anon.Fn3
import typingsJapgolly.bluebirdGlobal.anon.Fn4
import typingsJapgolly.bluebirdGlobal.anon.FnCall
import typingsJapgolly.bluebirdGlobal.anon.FnCallArg1Arg2Arg3Arg4Arg5Handler
import typingsJapgolly.bluebirdGlobal.anon.FnCallDisposerDisposer2Disposer3Executor
import typingsJapgolly.bluebirdGlobal.anon.FnCallFilter1Filter2Filter3Filter4Filter5OnReject
import typingsJapgolly.bluebirdGlobal.anon.FnCallFilter1Filter2Filter3Filter4Filter5Reason
import typingsJapgolly.bluebirdGlobal.anon.FnCallFilter1Filter2Filter3Filter4Filter5Value
import typingsJapgolly.bluebirdGlobal.anon.FnCallFn
import typingsJapgolly.bluebirdGlobal.anon.FnCallGeneratorFunctionOptions
import typingsJapgolly.bluebirdGlobal.anon.FnCallHandler
import typingsJapgolly.bluebirdGlobal.anon.FnCallMsMessage
import typingsJapgolly.bluebirdGlobal.anon.FnCallMsValue
import typingsJapgolly.bluebirdGlobal.anon.FnCallNodeFunctionOptions
import typingsJapgolly.bluebirdGlobal.anon.FnCallObject
import typingsJapgolly.bluebirdGlobal.anon.FnCallOnFulfilledOnRejected
import typingsJapgolly.bluebirdGlobal.anon.FnCallResolverOptions
import typingsJapgolly.bluebirdGlobal.anon.FnCallTargetOptions
import typingsJapgolly.bluebirdGlobal.anon.FnCallThis
import typingsJapgolly.bluebirdGlobal.anon.FnCallValue
import typingsJapgolly.bluebirdGlobal.anon.FnCallValues
import typingsJapgolly.bluebirdGlobal.anon.FnCallValuesCount
import typingsJapgolly.bluebirdGlobal.anon.FnCallValuesFiltererOption
import typingsJapgolly.bluebirdGlobal.anon.FnCallValuesIterator
import typingsJapgolly.bluebirdGlobal.anon.FnCallValuesMapperOptions
import typingsJapgolly.bluebirdGlobal.anon.FnCallValuesReducerInitialValue
import typingsJapgolly.std.IterableIterator
import typingsJapgolly.std.Map
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    /*
      * Patch all instance method
      */
    @js.native
    trait Promise[T] extends StObject {
      
      def all(): ^[T] = js.native
      
      def any(): ^[scala.Nothing] = js.native
      @JSName("any")
      def any_Q[Q](): ^[Q] = js.native
      
      def asCallback(callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[T], Unit]): this.type = js.native
      def asCallback(callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[T], Unit], options: SpreadOption): this.type = js.native
      def asCallback(sink: Any*): this.type = js.native
      @JSName("asCallback")
      var asCallback_Original: FnCall[T] = js.native
      
      def bind(thisArg: Any): Bluebird[T] = js.native
      @JSName("bind")
      var bind_Original: js.Function1[/* thisArg */ Any, Bluebird[T]] = js.native
      
      def call[U /* <: /* keyof Q */ String */, Q](propertyName: U, args: Any*): Bluebird[
            /* import warning: importer.ImportType#apply Failed type conversion: Q[U] extends (args : ...any): any ? std.ReturnType<Q[U]> : never */ js.Any
          ] = js.native
      @JSName("call")
      var call_Original: js.ThisFunction2[
            /* this */ Bluebird[Any], 
            /* keyof any */ /* propertyName */ String, 
            /* repeated */ Any, 
            Bluebird[
              /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] extends (args : ...any): any ? std.ReturnType<any[keyof any]> : never */ js.Any
            ]
          ] = js.native
      
      def cancel(): Unit = js.native
      @JSName("cancel")
      var cancel_Original: js.Function0[Unit] = js.native
      
      /*
        * TypeScript disallows adding overrides via `catch: typeof Bluebird.prototype.catch`. Copy&paste them then.
        *
        * @todo Duplication of code is never ideal. See whether there's a better way of achieving this.
        */
      def `catch`(
        predicate: js.Function1[/* error */ Any, Boolean],
        onReject: js.Function1[/* error */ Any, T | (PromiseLike[T | Unit]) | Unit]
      ): ^[T] = js.native
      def `catch`(predicate: js.Object, onReject: js.Function1[/* error */ Any, T | (PromiseLike[T | Unit]) | Unit]): ^[T] = js.native
      def `catch`[TResult](): Promise[T | TResult] = js.native
      def `catch`[E /* <: js.Error */](
        ErrorClass: Instantiable1[/* args (repeated) */ Any, E],
        onReject: js.Function1[/* error */ E, T | (PromiseLike[T | Unit]) | Unit]
      ): ^[T] = js.native
      def `catch`[TResult](onrejected: js.Function1[/* reason */ Any, TResult | PromiseLike[TResult]]): Promise[T | TResult] = js.native
      
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: Constructor[js.Error],
        filter5: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: Constructor[js.Error],
        filter5: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        filter4: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        filter4: Constructor[js.Error],
        filter5: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        filter4: Constructor[js.Error],
        filter5: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        filter4: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](filter1: CatchFilter[js.Error], filter2: CatchFilter[js.Error], value: U): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: Constructor[js.Error],
        filter5: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: Constructor[js.Error],
        filter5: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        filter4: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        filter4: Constructor[js.Error],
        filter5: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        filter4: Constructor[js.Error],
        filter5: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        filter4: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](filter1: CatchFilter[js.Error], filter2: Constructor[js.Error], value: U): Bluebird[T | U] = js.native
      def catchReturn[U](// tslint:disable-next-line:unified-signatures
      filter1: CatchFilter[js.Error], value: U): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: Constructor[js.Error],
        filter5: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: Constructor[js.Error],
        filter5: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        filter4: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        filter4: Constructor[js.Error],
        filter5: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        filter4: Constructor[js.Error],
        filter5: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        filter4: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](filter1: Constructor[js.Error], filter2: CatchFilter[js.Error], value: U): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: Constructor[js.Error],
        filter5: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: Constructor[js.Error],
        filter5: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        filter4: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        filter4: Constructor[js.Error],
        filter5: CatchFilter[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        filter4: Constructor[js.Error],
        filter5: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        filter4: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](filter1: Constructor[js.Error], filter2: Constructor[js.Error], value: U): Bluebird[T | U] = js.native
      def catchReturn[U](filter1: Constructor[js.Error], value: U): Bluebird[T | U] = js.native
      def catchReturn[U](value: U): Bluebird[T | U] = js.native
      @JSName("catchReturn")
      var catchReturn_Original: FnCallFilter1Filter2Filter3Filter4Filter5Value[T] = js.native
      
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: Constructor[js.Error],
        filter5: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: Constructor[js.Error],
        filter5: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        filter4: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        filter4: Constructor[js.Error],
        filter5: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        filter4: Constructor[js.Error],
        filter5: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        filter4: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(filter1: CatchFilter[js.Error], filter2: CatchFilter[js.Error], reason: js.Error): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: Constructor[js.Error],
        filter5: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: Constructor[js.Error],
        filter5: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        filter4: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        filter4: Constructor[js.Error],
        filter5: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        filter4: Constructor[js.Error],
        filter5: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        filter4: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(filter1: CatchFilter[js.Error], filter2: Constructor[js.Error], reason: js.Error): Bluebird[T] = js.native
      def catchThrow(// tslint:disable-next-line:unified-signatures
      filter1: CatchFilter[js.Error], reason: js.Error): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: Constructor[js.Error],
        filter5: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: Constructor[js.Error],
        filter5: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        filter4: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        filter4: Constructor[js.Error],
        filter5: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        filter4: Constructor[js.Error],
        filter5: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        filter4: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: CatchFilter[js.Error],
        filter3: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(filter1: Constructor[js.Error], filter2: CatchFilter[js.Error], reason: js.Error): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: Constructor[js.Error],
        filter5: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: Constructor[js.Error],
        filter5: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        filter4: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        filter4: CatchFilter[js.Error],
        filter5: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        filter4: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        filter4: Constructor[js.Error],
        filter5: CatchFilter[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        filter4: Constructor[js.Error],
        filter5: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        filter4: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[js.Error],
        filter2: Constructor[js.Error],
        filter3: Constructor[js.Error],
        reason: js.Error
      ): Bluebird[T] = js.native
      def catchThrow(filter1: Constructor[js.Error], filter2: Constructor[js.Error], reason: js.Error): Bluebird[T] = js.native
      def catchThrow(filter1: Constructor[js.Error], reason: js.Error): Bluebird[T] = js.native
      def catchThrow(reason: js.Error): Bluebird[T] = js.native
      @JSName("catchThrow")
      var catchThrow_Original: FnCallFilter1Filter2Filter3Filter4Filter5Reason[T] = js.native
      
      @JSName("catch")
      def catch_EU[E /* <: js.Error */, U](
        ErrorClass: Instantiable1[/* args (repeated) */ Any, E],
        onReject: js.Function1[/* error */ E, U | PromiseLike[U]]
      ): ^[U | T] = js.native
      @JSName("catch")
      def catch_U[U](
        predicate: js.Function1[/* error */ Any, Boolean],
        onReject: js.Function1[/* error */ Any, U | PromiseLike[U]]
      ): ^[U | T] = js.native
      @JSName("catch")
      def catch_U[U](predicate: js.Object, onReject: js.Function1[/* error */ Any, U | PromiseLike[U]]): ^[U | T] = js.native
      
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U](): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U](onReject: js.Function1[/* error */ Any, Resolvable[U]]): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1](
        // tslint:disable-next-line:unified-signatures
      filter1: CatchFilter[E1],
        onReject: js.Function1[/* error */ E1, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1](filter1: Constructor[E1], onReject: js.Function1[/* error */ E1, Resolvable[U]]): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      @JSName("caught")
      var caught_Original: typingsJapgolly.bluebird.anon.FnCall[T] & FnCallFilter1Filter2Filter3Filter4Filter5OnReject[T] = js.native
      
      def delay(ms: Double): Bluebird[T] = js.native
      @JSName("delay")
      var delay_Original: js.Function1[/* ms */ Double, Bluebird[T]] = js.native
      
      def disposer(disposeFn: js.Function2[/* arg */ T, /* promise */ Bluebird[T], Resolvable[Unit]]): Disposer[T] = js.native
      @JSName("disposer")
      var disposer_Original: js.Function1[
            /* disposeFn */ js.Function2[/* arg */ T, /* promise */ Bluebird[T], Resolvable[Unit]], 
            Disposer[T]
          ] = js.native
      
      def done[U](): Unit = js.native
      def done[U](onFulfilled: js.Function1[/* value */ T, Resolvable[U]]): Unit = js.native
      def done[U](
        onFulfilled: js.Function1[/* value */ T, Resolvable[U]],
        onRejected: js.Function1[/* error */ Any, Resolvable[U]]
      ): Unit = js.native
      def done[U](onFulfilled: Unit, onRejected: js.Function1[/* error */ Any, Resolvable[U]]): Unit = js.native
      @JSName("done")
      var done_Original: FnCallOnFulfilledOnRejected[T] = js.native
      
      def each[Q](iterator: IterateFunction[Q, Any]): ^[T] = js.native
      
      def error[U](onReject: js.Function1[/* reason */ Any, Resolvable[U]]): Bluebird[U] = js.native
      @JSName("error")
      var error_Original: js.Function1[/* onReject */ js.Function1[/* reason */ Any, Resolvable[Any]], Bluebird[Any]] = js.native
      
      def filter[Q](filterer: IterateFunction[Q, Boolean]): ^[T] = js.native
      def filter[Q](filterer: IterateFunction[Q, Boolean], options: ConcurrencyOption): ^[T] = js.native
      
      /*
        * See comments above `then` for the reason why this is needed. Taken from es2018.promise.d.ts.
        *
        * #std-lib-copy&paste-to-remove
        *
        * @todo See the comment near the top of the file about code marked with #std-lib-copy&paste-to-remove
        */
      def `finally`(): Promise[T] = js.native
      def `finally`(onfinally: js.Function0[Unit]): Promise[T] = js.native
      
      // finally: Bluebird<T>["finally"]; // Provided by lib.es2018.promise.d.ts
      def get[U /* <: /* keyof T */ String */](key: U): Bluebird[
            /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ js.Any
          ] = js.native
      // finally: Bluebird<T>["finally"]; // Provided by lib.es2018.promise.d.ts
      @JSName("get")
      var get_Original: js.Function1[
            /* keyof T */ /* key */ String, 
            Bluebird[
              /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
            ]
          ] = js.native
      
      def isCancelled(): Boolean = js.native
      @JSName("isCancelled")
      var isCancelled_Original: js.Function0[Boolean] = js.native
      
      def isFulfilled(): Boolean = js.native
      @JSName("isFulfilled")
      var isFulfilled_Original: js.Function0[Boolean] = js.native
      
      def isPending(): Boolean = js.native
      @JSName("isPending")
      var isPending_Original: js.Function0[Boolean] = js.native
      
      def isRejected(): Boolean = js.native
      @JSName("isRejected")
      var isRejected_Original: js.Function0[Boolean] = js.native
      
      def isResolved(): Boolean = js.native
      @JSName("isResolved")
      var isResolved_Original: js.Function0[Boolean] = js.native
      
      def lastly(handler: js.Function0[Resolvable[Any]]): Bluebird[T] = js.native
      @JSName("lastly")
      var lastly_Original: js.Function1[/* handler */ js.Function0[Resolvable[Any]], Bluebird[T]] = js.native
      
      def map[U, Q](mapper: IterateFunction[Q, U]): ^[js.Array[U]] = js.native
      def map[U, Q](mapper: IterateFunction[Q, U], options: ConcurrencyOption): ^[js.Array[U]] = js.native
      
      def mapSeries[U, Q](iterator: IterateFunction[Q, U]): ^[js.Array[U]] = js.native
      
      def nodeify(callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[T], Unit]): this.type = js.native
      def nodeify(callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[T], Unit], options: SpreadOption): this.type = js.native
      def nodeify(sink: Any*): this.type = js.native
      @JSName("nodeify")
      var nodeify_Original: FnCall[T] = js.native
      
      def props[T](): Bluebird[T] = js.native
      @JSName("props")
      def props_KV[K, V](): Bluebird[Map[K, V]] = js.native
      @JSName("props")
      var props_Original: FnCallThis = js.native
      
      def race(): ^[scala.Nothing] = js.native
      @JSName("race")
      def race_Q[Q](): ^[Q] = js.native
      
      def reason(): Any = js.native
      @JSName("reason")
      var reason_Original: js.Function0[Any] = js.native
      
      def reduce[U, Q](
        reducer: js.Function4[
              /* memo */ U, 
              /* item */ Q, 
              /* index */ Double, 
              /* arrayLength */ Double, 
              U | PromiseLike[U]
            ]
      ): ^[U] = js.native
      def reduce[U, Q](
        reducer: js.Function4[
              /* memo */ U, 
              /* item */ Q, 
              /* index */ Double, 
              /* arrayLength */ Double, 
              U | PromiseLike[U]
            ],
        initialValue: U
      ): ^[U] = js.native
      
      def reflect(): Bluebird[Inspection[T]] = js.native
      @JSName("reflect")
      var reflect_Original: js.Function0[Bluebird[Inspection[T]]] = js.native
      
      def `return`(): Bluebird[Unit] = js.native
      def `return`[U](value: U): Bluebird[U] = js.native
      @JSName("return")
      var return_Original: FnCallValue = js.native
      
      def some(count: Double): ^[T] = js.native
      
      def spread[U, Q](fulfilledHandler: js.Function1[/* repeated */ Q, U | PromiseLike[U]]): ^[U] = js.native
      
      def suppressUnhandledRejections(): Unit = js.native
      @JSName("suppressUnhandledRejections")
      var suppressUnhandledRejections_Original: js.Function0[Unit] = js.native
      
      def tap(onFulFill: js.Function1[/* value */ T, Resolvable[Any]]): Bluebird[T] = js.native
      
      def tapCatch(onReject: js.Function1[/* error */ js.UndefOr[Any], Resolvable[Any]]): Bluebird[T] = js.native
      def tapCatch[E1](
        // tslint:disable-next-line:unified-signatures
      filter1: CatchFilter[E1],
        onReject: js.Function1[/* error */ E1, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1](filter1: Constructor[E1], onReject: js.Function1[/* error */ E1, Resolvable[Any]]): Bluebird[T] = js.native
      def tapCatch[E1, E2](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        onReject: js.Function1[/* error */ E1 | E2, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        onReject: js.Function1[/* error */ E1 | E2, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        onReject: js.Function1[/* error */ E1 | E2, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        onReject: js.Function1[/* error */ E1 | E2, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
      ): Bluebird[T] = js.native
      @JSName("tapCatch")
      var tapCatch_Original: Fn0[T] = js.native
      
      @JSName("tap")
      var tap_Original: js.Function1[/* onFulFill */ js.Function1[/* value */ T, Resolvable[Any]], Bluebird[T]] = js.native
      
      /*
        * Copy&paste ::then and ::catch from lib.es5.promise.d.ts, because Bluebird's typings are not
        * in line with the standard lib.
        *
        * #std-lib-copy&paste-to-remove
        *
        * @todo See the comment near the top of the file about code marked with #std-lib-copy&paste-to-remove
        */
      def `then`[TResult1, TResult2](): Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | PromiseLike[TResult1]]): Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](
        onfulfilled: js.Function1[/* value */ T, TResult1 | PromiseLike[TResult1]],
        onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]
      ): Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): Promise[TResult1 | TResult2] = js.native
      
      // then: Bluebird<T>["then"]; // Provided by lib.es5.d.ts
      def thenReturn(): Bluebird[Unit] = js.native
      // then: Bluebird<T>["then"]; // Provided by lib.es5.d.ts
      def thenReturn[U](value: U): Bluebird[U] = js.native
      // then: Bluebird<T>["then"]; // Provided by lib.es5.d.ts
      @JSName("thenReturn")
      var thenReturn_Original: FnCallValue = js.native
      
      def thenThrow(reason: js.Error): Bluebird[scala.Nothing] = js.native
      @JSName("thenThrow")
      var thenThrow_Original: js.Function1[/* reason */ js.Error, Bluebird[scala.Nothing]] = js.native
      
      def `throw`(reason: js.Error): Bluebird[scala.Nothing] = js.native
      @JSName("throw")
      var throw_Original: js.Function1[/* reason */ js.Error, Bluebird[scala.Nothing]] = js.native
      
      def timeout(ms: Double): Bluebird[T] = js.native
      def timeout(ms: Double, message: String): Bluebird[T] = js.native
      def timeout(ms: Double, message: js.Error): Bluebird[T] = js.native
      @JSName("timeout")
      var timeout_Original: FnCallMsMessage[T] = js.native
      
      def toJSON(): js.Object = js.native
      @JSName("toJSON")
      var toJSON_Original: js.Function0[js.Object] = js.native
      
      @JSName("toString")
      var toString_Original: js.Function0[String] = js.native
      
      def value(): T = js.native
      @JSName("value")
      var value_Original: js.Function0[T] = js.native
    }
    /*
      * Declare the `Promise` variable. This is needed for es5 only and is a no-op for all other targets.
      *
      * #std-lib-copy&paste-to-remove
      *
      * @todo See the comment near the top of the file about code marked with #std-lib-copy&paste-to-remove
      */
    @JSGlobal("Promise")
    @js.native
    def Promise: PromiseConstructor = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Promise")
    @js.native
    open class PromiseCls[T] protected ()
      extends StObject
         with Promise[T] {
      def this(callback: js.Function3[
                /* resolve */ js.Function1[/* thenableOrResult */ js.UndefOr[T | PromiseLike[T]], Unit], 
                /* reject */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
                /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
                Unit
              ]) = this()
    }
    
    inline def Promise_=(x: PromiseConstructor): Unit = js.Dynamic.global.updateDynamic("Promise")(x.asInstanceOf[js.Any])
    
    type IterateFunction[T, R] = js.Function3[/* item */ T, /* index */ Double, /* arrayLength */ Double, R | PromiseLike[R]]
    
    /*
      * Patch all static methods and the constructor
      */
    @js.native
    trait PromiseConstructor
      extends StObject
         with Instantiable1[
              /* callback */ js.Function3[
                /* resolve */ js.Function1[/* thenableOrResult */ js.UndefOr[js.Object | PromiseLike[js.Object]], Unit], 
                /* reject */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
                /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
                Unit
              ], 
              Promise[js.Object]
            ] {
      
      def all[T](values: js.Array[T | PromiseLike[T]]): Promise[js.Array[T]] = js.native
      def all[T1, T2](values: js.Tuple2[T1 | PromiseLike[T1], T2 | PromiseLike[T2]]): Promise[js.Tuple2[T1, T2]] = js.native
      def all[T1, T2, T3](values: js.Tuple3[T1 | PromiseLike[T1], T2 | PromiseLike[T2], T3 | PromiseLike[T3]]): Promise[js.Tuple3[T1, T2, T3]] = js.native
      def all[T1, T2, T3, T4](
        values: js.Tuple4[T1 | PromiseLike[T1], T2 | PromiseLike[T2], T3 | PromiseLike[T3], T4 | PromiseLike[T4]]
      ): Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
      def all[T1, T2, T3, T4, T5](
        values: js.Tuple5[
              T1 | PromiseLike[T1], 
              T2 | PromiseLike[T2], 
              T3 | PromiseLike[T3], 
              T4 | PromiseLike[T4], 
              T5 | PromiseLike[T5]
            ]
      ): Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
      def all[T1, T2, T3, T4, T5, T6](
        values: js.Tuple6[
              T1 | PromiseLike[T1], 
              T2 | PromiseLike[T2], 
              T3 | PromiseLike[T3], 
              T4 | PromiseLike[T4], 
              T5 | PromiseLike[T5], 
              T6 | PromiseLike[T6]
            ]
      ): Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
      def all[T1, T2, T3, T4, T5, T6, T7](
        values: js.Tuple7[
              T1 | PromiseLike[T1], 
              T2 | PromiseLike[T2], 
              T3 | PromiseLike[T3], 
              T4 | PromiseLike[T4], 
              T5 | PromiseLike[T5], 
              T6 | PromiseLike[T6], 
              T7 | PromiseLike[T7]
            ]
      ): Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
      def all[T1, T2, T3, T4, T5, T6, T7, T8](
        values: js.Tuple8[
              T1 | PromiseLike[T1], 
              T2 | PromiseLike[T2], 
              T3 | PromiseLike[T3], 
              T4 | PromiseLike[T4], 
              T5 | PromiseLike[T5], 
              T6 | PromiseLike[T6], 
              T7 | PromiseLike[T7], 
              T8 | PromiseLike[T8]
            ]
      ): Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
      def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
        values: js.Tuple9[
              T1 | PromiseLike[T1], 
              T2 | PromiseLike[T2], 
              T3 | PromiseLike[T3], 
              T4 | PromiseLike[T4], 
              T5 | PromiseLike[T5], 
              T6 | PromiseLike[T6], 
              T7 | PromiseLike[T7], 
              T8 | PromiseLike[T8], 
              T9 | PromiseLike[T9]
            ]
      ): Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
      /*
        * Copy&paste from lib.es2015.promise.d.ts, because Bluebird's typings are not in line with the standard lib.
        *
        * #std-lib-copy&paste-to-remove
        *
        * @todo See the comment near the top of the file about code marked with #std-lib-copy&paste-to-remove
        */
      def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
        values: js.Tuple10[
              T1 | PromiseLike[T1], 
              T2 | PromiseLike[T2], 
              T3 | PromiseLike[T3], 
              T4 | PromiseLike[T4], 
              T5 | PromiseLike[T5], 
              T6 | PromiseLike[T6], 
              T7 | PromiseLike[T7], 
              T8 | PromiseLike[T8], 
              T9 | PromiseLike[T9], 
              T10 | PromiseLike[T10]
            ]
      ): Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
      
      // all: typeof Bluebird.all; // Provided by lib.es2015.d.ts
      def any[R](values: Resolvable[js.Iterable[Resolvable[R]]]): Bluebird[R] = js.native
      // all: typeof Bluebird.all; // Provided by lib.es2015.d.ts
      @JSName("any")
      var any_Original: FnCallValues = js.native
      
      def attempt[R](fn: js.Function0[Resolvable[R]]): Bluebird[R] = js.native
      @JSName("attempt")
      var attempt_Original: FnCallFn = js.native
      
      def bind(thisArg: Any): Bluebird[Unit] = js.native
      @JSName("bind")
      var bind_Original: js.Function1[/* thisArg */ Any, Bluebird[Unit]] = js.native
      
      def cast[R](value: Resolvable[R]): Bluebird[R] = js.native
      @JSName("cast")
      var cast_Original: Fn1 = js.native
      
      def config(options: AsyncHooks): Unit = js.native
      @JSName("config")
      var config_Original: js.Function1[/* options */ AsyncHooks, Unit] = js.native
      
      def coroutine[T](generatorFunction: js.Function0[IterableIterator[Any]]): js.Function0[Bluebird[T]] = js.native
      def coroutine[T](generatorFunction: js.Function0[IterableIterator[Any]], options: CoroutineOptions): js.Function0[Bluebird[T]] = js.native
      def coroutine[T, A1](generatorFunction: js.Function1[/* a1 */ A1, IterableIterator[Any]]): js.Function1[/* a1 */ A1, Bluebird[T]] = js.native
      def coroutine[T, A1](generatorFunction: js.Function1[/* a1 */ A1, IterableIterator[Any]], options: CoroutineOptions): js.Function1[/* a1 */ A1, Bluebird[T]] = js.native
      def coroutine[T, A1, A2](generatorFunction: js.Function2[/* a1 */ A1, /* a2 */ A2, IterableIterator[Any]]): js.Function2[/* a1 */ A1, /* a2 */ A2, Bluebird[T]] = js.native
      def coroutine[T, A1, A2](
        generatorFunction: js.Function2[/* a1 */ A1, /* a2 */ A2, IterableIterator[Any]],
        options: CoroutineOptions
      ): js.Function2[/* a1 */ A1, /* a2 */ A2, Bluebird[T]] = js.native
      def coroutine[T, A1, A2, A3](generatorFunction: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, IterableIterator[Any]]): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, Bluebird[T]] = js.native
      def coroutine[T, A1, A2, A3](
        generatorFunction: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, IterableIterator[Any]],
        options: CoroutineOptions
      ): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, Bluebird[T]] = js.native
      def coroutine[T, A1, A2, A3, A4](
        generatorFunction: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, IterableIterator[Any]]
      ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, Bluebird[T]] = js.native
      def coroutine[T, A1, A2, A3, A4](
        generatorFunction: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, IterableIterator[Any]],
        options: CoroutineOptions
      ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, Bluebird[T]] = js.native
      def coroutine[T, A1, A2, A3, A4, A5](
        generatorFunction: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, IterableIterator[Any]]
      ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, Bluebird[T]] = js.native
      def coroutine[T, A1, A2, A3, A4, A5](
        generatorFunction: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, IterableIterator[Any]],
        options: CoroutineOptions
      ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, Bluebird[T]] = js.native
      def coroutine[T, A1, A2, A3, A4, A5, A6](
        generatorFunction: js.Function6[
              /* a1 */ A1, 
              /* a2 */ A2, 
              /* a3 */ A3, 
              /* a4 */ A4, 
              /* a5 */ A5, 
              /* a6 */ A6, 
              IterableIterator[Any]
            ]
      ): js.Function6[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, /* a6 */ A6, Bluebird[T]] = js.native
      def coroutine[T, A1, A2, A3, A4, A5, A6](
        generatorFunction: js.Function6[
              /* a1 */ A1, 
              /* a2 */ A2, 
              /* a3 */ A3, 
              /* a4 */ A4, 
              /* a5 */ A5, 
              /* a6 */ A6, 
              IterableIterator[Any]
            ],
        options: CoroutineOptions
      ): js.Function6[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, /* a6 */ A6, Bluebird[T]] = js.native
      def coroutine[T, A1, A2, A3, A4, A5, A6, A7](
        generatorFunction: js.Function7[
              /* a1 */ A1, 
              /* a2 */ A2, 
              /* a3 */ A3, 
              /* a4 */ A4, 
              /* a5 */ A5, 
              /* a6 */ A6, 
              /* a7 */ A7, 
              IterableIterator[Any]
            ]
      ): js.Function7[
            /* a1 */ A1, 
            /* a2 */ A2, 
            /* a3 */ A3, 
            /* a4 */ A4, 
            /* a5 */ A5, 
            /* a6 */ A6, 
            /* a7 */ A7, 
            Bluebird[T]
          ] = js.native
      def coroutine[T, A1, A2, A3, A4, A5, A6, A7](
        generatorFunction: js.Function7[
              /* a1 */ A1, 
              /* a2 */ A2, 
              /* a3 */ A3, 
              /* a4 */ A4, 
              /* a5 */ A5, 
              /* a6 */ A6, 
              /* a7 */ A7, 
              IterableIterator[Any]
            ],
        options: CoroutineOptions
      ): js.Function7[
            /* a1 */ A1, 
            /* a2 */ A2, 
            /* a3 */ A3, 
            /* a4 */ A4, 
            /* a5 */ A5, 
            /* a6 */ A6, 
            /* a7 */ A7, 
            Bluebird[T]
          ] = js.native
      def coroutine[T, A1, A2, A3, A4, A5, A6, A7, A8](
        generatorFunction: js.Function8[
              /* a1 */ A1, 
              /* a2 */ A2, 
              /* a3 */ A3, 
              /* a4 */ A4, 
              /* a5 */ A5, 
              /* a6 */ A6, 
              /* a7 */ A7, 
              /* a8 */ A8, 
              IterableIterator[Any]
            ]
      ): js.Function8[
            /* a1 */ A1, 
            /* a2 */ A2, 
            /* a3 */ A3, 
            /* a4 */ A4, 
            /* a5 */ A5, 
            /* a6 */ A6, 
            /* a7 */ A7, 
            /* a8 */ A8, 
            Bluebird[T]
          ] = js.native
      def coroutine[T, A1, A2, A3, A4, A5, A6, A7, A8](
        generatorFunction: js.Function8[
              /* a1 */ A1, 
              /* a2 */ A2, 
              /* a3 */ A3, 
              /* a4 */ A4, 
              /* a5 */ A5, 
              /* a6 */ A6, 
              /* a7 */ A7, 
              /* a8 */ A8, 
              IterableIterator[Any]
            ],
        options: CoroutineOptions
      ): js.Function8[
            /* a1 */ A1, 
            /* a2 */ A2, 
            /* a3 */ A3, 
            /* a4 */ A4, 
            /* a5 */ A5, 
            /* a6 */ A6, 
            /* a7 */ A7, 
            /* a8 */ A8, 
            Bluebird[T]
          ] = js.native
      @JSName("coroutine")
      var coroutine_Original: FnCallGeneratorFunctionOptions = js.native
      
      def defer[R](): Resolver[R] = js.native
      @JSName("defer")
      var defer_Original: Fn2 = js.native
      
      def delay(ms: Double): Bluebird[Unit] = js.native
      def delay[R](ms: Double, value: Resolvable[R]): Bluebird[R] = js.native
      @JSName("delay")
      var delay_Original: FnCallMsValue = js.native
      
      def each[R](
        values: Resolvable[js.Iterable[Resolvable[R]]],
        iterator: typingsJapgolly.bluebird.mod.IterateFunction[R, Any]
      ): Bluebird[js.Array[R]] = js.native
      @JSName("each")
      var each_Original: FnCallValuesIterator = js.native
      
      def filter[R](
        values: Resolvable[js.Iterable[Resolvable[R]]],
        filterer: typingsJapgolly.bluebird.mod.IterateFunction[R, Boolean]
      ): Bluebird[js.Array[R]] = js.native
      def filter[R](
        values: Resolvable[js.Iterable[Resolvable[R]]],
        filterer: typingsJapgolly.bluebird.mod.IterateFunction[R, Boolean],
        option: ConcurrencyOption
      ): Bluebird[js.Array[R]] = js.native
      @JSName("filter")
      var filter_Original: FnCallValuesFiltererOption = js.native
      
      def fromCallback[T](
        resolver: js.Function1[/* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], Unit]
      ): Bluebird[T] = js.native
      def fromCallback[T](
        resolver: js.Function1[/* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], Unit],
        options: FromNodeOptions
      ): Bluebird[T] = js.native
      @JSName("fromCallback")
      var fromCallback_Original: FnCallResolverOptions = js.native
      
      def fromNode[T](
        resolver: js.Function1[/* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], Unit]
      ): Bluebird[T] = js.native
      def fromNode[T](
        resolver: js.Function1[/* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], Unit],
        options: FromNodeOptions
      ): Bluebird[T] = js.native
      @JSName("fromNode")
      var fromNode_Original: FnCallResolverOptions = js.native
      
      def is(value: Any): Boolean = js.native
      @JSName("is")
      var is_Original: js.Function1[/* value */ Any, Boolean] = js.native
      
      def join[R](values: Resolvable[R]*): Bluebird[js.Array[R]] = js.native
      def join[R, A1](arg1: Resolvable[A1], handler: js.Function1[/* arg1 */ A1, Resolvable[R]]): Bluebird[R] = js.native
      def join[R, A1, A2](
        arg1: Resolvable[A1],
        arg2: Resolvable[A2],
        handler: js.Function2[/* arg1 */ A1, /* arg2 */ A2, Resolvable[R]]
      ): Bluebird[R] = js.native
      def join[R, A1, A2, A3](
        arg1: Resolvable[A1],
        arg2: Resolvable[A2],
        arg3: Resolvable[A3],
        handler: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Resolvable[R]]
      ): Bluebird[R] = js.native
      def join[R, A1, A2, A3, A4](
        arg1: Resolvable[A1],
        arg2: Resolvable[A2],
        arg3: Resolvable[A3],
        arg4: Resolvable[A4],
        handler: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Resolvable[R]]
      ): Bluebird[R] = js.native
      def join[R, A1, A2, A3, A4, A5](
        arg1: Resolvable[A1],
        arg2: Resolvable[A2],
        arg3: Resolvable[A3],
        arg4: Resolvable[A4],
        arg5: Resolvable[A5],
        handler: js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Resolvable[R]]
      ): Bluebird[R] = js.native
      @JSName("join")
      var join_Original: FnCallArg1Arg2Arg3Arg4Arg5Handler = js.native
      
      def longStackTraces(): Unit = js.native
      @JSName("longStackTraces")
      var longStackTraces_Original: js.Function0[Unit] = js.native
      
      def map[R, U](
        values: Resolvable[js.Iterable[Resolvable[R]]],
        mapper: typingsJapgolly.bluebird.mod.IterateFunction[R, U]
      ): Bluebird[js.Array[U]] = js.native
      def map[R, U](
        values: Resolvable[js.Iterable[Resolvable[R]]],
        mapper: typingsJapgolly.bluebird.mod.IterateFunction[R, U],
        options: ConcurrencyOption
      ): Bluebird[js.Array[U]] = js.native
      
      def mapSeries[R, U](
        values: Resolvable[js.Iterable[Resolvable[R]]],
        iterator: typingsJapgolly.bluebird.mod.IterateFunction[R, U]
      ): Bluebird[js.Array[U]] = js.native
      @JSName("mapSeries")
      var mapSeries_Original: Fn3 = js.native
      
      @JSName("map")
      var map_Original: FnCallValuesMapperOptions = js.native
      
      def method[R](fn: js.Function0[Resolvable[R]]): js.Function0[Bluebird[R]] = js.native
      def method[R](fn: js.Function1[/* repeated */ Any, Resolvable[R]]): js.Function1[/* repeated */ Any, Bluebird[R]] = js.native
      def method[R, A1, A2](fn: js.Function2[/* arg1 */ A1, /* arg2 */ A2, Resolvable[R]]): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Bluebird[R]] = js.native
      def method[R, A1, A2, A3](fn: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Resolvable[R]]): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Bluebird[R]] = js.native
      def method[R, A1, A2, A3, A4](fn: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Resolvable[R]]): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Bluebird[R]] = js.native
      def method[R, A1, A2, A3, A4, A5](
        fn: js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Resolvable[R]]
      ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Bluebird[R]] = js.native
      @JSName("method")
      var method_Original: Fn4 = js.native
      @JSName("method")
      def method_RA1[R, A1](fn: js.Function1[/* arg1 */ A1, Resolvable[R]]): js.Function1[/* arg1 */ A1, Bluebird[R]] = js.native
      
      def onPossiblyUnhandledRejection(): Unit = js.native
      def onPossiblyUnhandledRejection(handler: js.Function1[/* reason */ Any, Any]): Unit = js.native
      def onPossiblyUnhandledRejection(handler: js.Function2[/* error */ js.Error, /* promise */ Bluebird[Any], Unit]): Unit = js.native
      @JSName("onPossiblyUnhandledRejection")
      var onPossiblyUnhandledRejection_Original: FnCallHandler = js.native
      
      def promisify(nodeFunction: js.Function1[/* repeated */ Any, Unit]): js.Function1[/* repeated */ Any, Bluebird[Any]] = js.native
      def promisify(nodeFunction: js.Function1[/* repeated */ Any, Unit], options: PromisifyOptions): js.Function1[/* repeated */ Any, Bluebird[Any]] = js.native
      def promisify[T, A1](
        func: js.Function2[
              /* arg1 */ A1, 
              /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ]
      ): js.Function1[/* arg1 */ A1, Bluebird[T]] = js.native
      def promisify[T, A1](
        func: js.Function2[
              /* arg1 */ A1, 
              /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ],
        options: PromisifyOptions
      ): js.Function1[/* arg1 */ A1, Bluebird[T]] = js.native
      def promisify[T, A1, A2](
        func: js.Function3[
              /* arg1 */ A1, 
              /* arg2 */ A2, 
              /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ]
      ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Bluebird[T]] = js.native
      def promisify[T, A1, A2](
        func: js.Function3[
              /* arg1 */ A1, 
              /* arg2 */ A2, 
              /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ],
        options: PromisifyOptions
      ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Bluebird[T]] = js.native
      def promisify[T, A1, A2, A3](
        func: js.Function4[
              /* arg1 */ A1, 
              /* arg2 */ A2, 
              /* arg3 */ A3, 
              /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ]
      ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Bluebird[T]] = js.native
      def promisify[T, A1, A2, A3](
        func: js.Function4[
              /* arg1 */ A1, 
              /* arg2 */ A2, 
              /* arg3 */ A3, 
              /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ],
        options: PromisifyOptions
      ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Bluebird[T]] = js.native
      def promisify[T, A1, A2, A3, A4](
        func: js.Function5[
              /* arg1 */ A1, 
              /* arg2 */ A2, 
              /* arg3 */ A3, 
              /* arg4 */ A4, 
              /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ]
      ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Bluebird[T]] = js.native
      def promisify[T, A1, A2, A3, A4](
        func: js.Function5[
              /* arg1 */ A1, 
              /* arg2 */ A2, 
              /* arg3 */ A3, 
              /* arg4 */ A4, 
              /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ],
        options: PromisifyOptions
      ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Bluebird[T]] = js.native
      def promisify[T, A1, A2, A3, A4, A5](
        func: js.Function6[
              /* arg1 */ A1, 
              /* arg2 */ A2, 
              /* arg3 */ A3, 
              /* arg4 */ A4, 
              /* arg5 */ A5, 
              /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ]
      ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Bluebird[T]] = js.native
      def promisify[T, A1, A2, A3, A4, A5](
        func: js.Function6[
              /* arg1 */ A1, 
              /* arg2 */ A2, 
              /* arg3 */ A3, 
              /* arg4 */ A4, 
              /* arg5 */ A5, 
              /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ],
        options: PromisifyOptions
      ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Bluebird[T]] = js.native
      
      def promisifyAll[T /* <: js.Object */](target: T): PromisifyAll_[T] = js.native
      def promisifyAll[T /* <: js.Object */](target: T, options: PromisifyAllOptions[T]): PromisifyAll_[T] = js.native
      @JSName("promisifyAll")
      var promisifyAll_Original: FnCallTargetOptions = js.native
      
      @JSName("promisify")
      var promisify_Original: FnCallNodeFunctionOptions = js.native
      @JSName("promisify")
      def promisify_T_Function0[T](
        func: js.Function1[/* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], Unit]
      ): js.Function0[Bluebird[T]] = js.native
      @JSName("promisify")
      def promisify_T_Function0[T](
        func: js.Function1[/* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], Unit],
        options: PromisifyOptions
      ): js.Function0[Bluebird[T]] = js.native
      
      def props[T](`object`: ResolvableProps[T]): Bluebird[T] = js.native
      def props[T](`object`: PromiseLike[ResolvableProps[T]]): Bluebird[T] = js.native
      def props[K, V](map: Resolvable[Map[K, Resolvable[V]]]): Bluebird[Map[K, V]] = js.native
      @JSName("props")
      var props_Original: FnCallObject = js.native
      
      def race[T](values: js.Array[T | PromiseLike[T]]): Promise[T] = js.native
      def race[T1, T2](values: js.Tuple2[T1 | PromiseLike[T1], T2 | PromiseLike[T2]]): Promise[T1 | T2] = js.native
      def race[T1, T2, T3](values: js.Tuple3[T1 | PromiseLike[T1], T2 | PromiseLike[T2], T3 | PromiseLike[T3]]): Promise[T1 | T2 | T3] = js.native
      def race[T1, T2, T3, T4](
        values: js.Tuple4[T1 | PromiseLike[T1], T2 | PromiseLike[T2], T3 | PromiseLike[T3], T4 | PromiseLike[T4]]
      ): Promise[T1 | T2 | T3 | T4] = js.native
      def race[T1, T2, T3, T4, T5](
        values: js.Tuple5[
              T1 | PromiseLike[T1], 
              T2 | PromiseLike[T2], 
              T3 | PromiseLike[T3], 
              T4 | PromiseLike[T4], 
              T5 | PromiseLike[T5]
            ]
      ): Promise[T1 | T2 | T3 | T4 | T5] = js.native
      def race[T1, T2, T3, T4, T5, T6](
        values: js.Tuple6[
              T1 | PromiseLike[T1], 
              T2 | PromiseLike[T2], 
              T3 | PromiseLike[T3], 
              T4 | PromiseLike[T4], 
              T5 | PromiseLike[T5], 
              T6 | PromiseLike[T6]
            ]
      ): Promise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
      def race[T1, T2, T3, T4, T5, T6, T7](
        values: js.Tuple7[
              T1 | PromiseLike[T1], 
              T2 | PromiseLike[T2], 
              T3 | PromiseLike[T3], 
              T4 | PromiseLike[T4], 
              T5 | PromiseLike[T5], 
              T6 | PromiseLike[T6], 
              T7 | PromiseLike[T7]
            ]
      ): Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
      def race[T1, T2, T3, T4, T5, T6, T7, T8](
        values: js.Tuple8[
              T1 | PromiseLike[T1], 
              T2 | PromiseLike[T2], 
              T3 | PromiseLike[T3], 
              T4 | PromiseLike[T4], 
              T5 | PromiseLike[T5], 
              T6 | PromiseLike[T6], 
              T7 | PromiseLike[T7], 
              T8 | PromiseLike[T8]
            ]
      ): Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
      def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](
        values: js.Tuple9[
              T1 | PromiseLike[T1], 
              T2 | PromiseLike[T2], 
              T3 | PromiseLike[T3], 
              T4 | PromiseLike[T4], 
              T5 | PromiseLike[T5], 
              T6 | PromiseLike[T6], 
              T7 | PromiseLike[T7], 
              T8 | PromiseLike[T8], 
              T9 | PromiseLike[T9]
            ]
      ): Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
      def race[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
        values: js.Tuple10[
              T1 | PromiseLike[T1], 
              T2 | PromiseLike[T2], 
              T3 | PromiseLike[T3], 
              T4 | PromiseLike[T4], 
              T5 | PromiseLike[T5], 
              T6 | PromiseLike[T6], 
              T7 | PromiseLike[T7], 
              T8 | PromiseLike[T8], 
              T9 | PromiseLike[T9], 
              T10 | PromiseLike[T10]
            ]
      ): Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
      
      // race: typeof Bluebird.race; // Provided by lib.es2015.d.ts
      def reduce[R, U](
        values: Resolvable[js.Iterable[Resolvable[R]]],
        reducer: js.Function4[
              /* total */ U, 
              /* current */ R, 
              /* index */ Double, 
              /* arrayLength */ Double, 
              Resolvable[U]
            ]
      ): Bluebird[U] = js.native
      // race: typeof Bluebird.race; // Provided by lib.es2015.d.ts
      def reduce[R, U](
        values: Resolvable[js.Iterable[Resolvable[R]]],
        reducer: js.Function4[
              /* total */ U, 
              /* current */ R, 
              /* index */ Double, 
              /* arrayLength */ Double, 
              Resolvable[U]
            ],
        initialValue: U
      ): Bluebird[U] = js.native
      // race: typeof Bluebird.race; // Provided by lib.es2015.d.ts
      @JSName("reduce")
      var reduce_Original: FnCallValuesReducerInitialValue = js.native
      
      def reject(reason: Any): Promise[scala.Nothing] = js.native
      @JSName("reject")
      def reject_T[T](reason: Any): Promise[T] = js.native
      
      def resolve(): Promise[Unit] = js.native
      def resolve[T](value: T): Promise[T] = js.native
      def resolve[T](value: PromiseLike[T]): Promise[T] = js.native
      
      // reject: typeof Bluebird.reject; // Provided by lib.es2015.d.ts
      // resolve: typeof Bluebird.resolve; // Provided by lib.es2015.d.ts
      def some[R](values: Resolvable[js.Iterable[Resolvable[R]]], count: Double): Bluebird[js.Array[R]] = js.native
      // reject: typeof Bluebird.reject; // Provided by lib.es2015.d.ts
      // resolve: typeof Bluebird.resolve; // Provided by lib.es2015.d.ts
      @JSName("some")
      var some_Original: FnCallValuesCount = js.native
      
      def `try`[R](fn: js.Function0[Resolvable[R]]): Bluebird[R] = js.native
      @JSName("try")
      var try_Original: FnCallFn = js.native
      
      def `using`[R, T](disposer: Disposer[R], executor: js.Function1[/* transaction */ R, PromiseLike[T]]): Bluebird[T] = js.native
      def `using`[R1, R2, T](
        disposer: Disposer[R1],
        disposer2: Disposer[R2],
        executor: js.Function2[/* transaction1 */ R1, /* transaction2 */ R2, PromiseLike[T]]
      ): Bluebird[T] = js.native
      def `using`[R1, R2, R3, T](
        disposer: Disposer[R1],
        disposer2: Disposer[R2],
        disposer3: Disposer[R3],
        executor: js.Function3[/* transaction1 */ R1, /* transaction2 */ R2, /* transaction3 */ R3, PromiseLike[T]]
      ): Bluebird[T] = js.native
      @JSName("using")
      var using_Original: FnCallDisposerDisposer2Disposer3Executor = js.native
    }
  }
}
