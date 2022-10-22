package typingsJapgolly.regeneratorRuntime

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.regeneratorRuntime.anon.Iterator
import typingsJapgolly.regeneratorRuntime.anon.ReadonlyCompletionRecord
import typingsJapgolly.regeneratorRuntime.anon.`0`
import typingsJapgolly.regeneratorRuntime.anon.readonlytryLocrootOmitTry
import typingsJapgolly.regeneratorRuntime.regeneratorRuntimeStrings.`return`
import typingsJapgolly.regeneratorRuntime.regeneratorRuntimeStrings.`throw`
import typingsJapgolly.regeneratorRuntime.regeneratorRuntimeStrings.break
import typingsJapgolly.regeneratorRuntime.regeneratorRuntimeStrings.continue
import typingsJapgolly.regeneratorRuntime.regeneratorRuntimeStrings.end
import typingsJapgolly.regeneratorRuntime.regeneratorRuntimeStrings.next
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.AsyncGenerator
import typingsJapgolly.std.Generator
import typingsJapgolly.std.GeneratorFunction
import typingsJapgolly.std.IteratorResult
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("regenerator-runtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("regenerator-runtime", "AsyncIterator")
  @js.native
  open class AsyncIterator[TYield, TReturn, TNext] protected ()
    extends StObject
       with AsyncGenerator[TYield, TReturn, TNext] {
    def this(
      generator: Generator[
            TYield | PromiseLike[TYield] | awrap[Any], 
            TReturn | PromiseLike[TReturn] | awrap[Any], 
            Any
          ],
      PromiseImpl: ResolvablePromiseConstructorLike
    ) = this()
    
    @JSName("return")
    def return_MAsyncIterator(value: TReturn): js.Promise[IteratorResult[TYield, TReturn]] = js.native
    @JSName("return")
    def return_MAsyncIterator(value: PromiseLike[TReturn]): js.Promise[IteratorResult[TYield, TReturn]] = js.native
    
    @JSName("throw")
    def throw_MAsyncIterator(e: Any): js.Promise[IteratorResult[TYield, TReturn]] = js.native
  }
  
  inline def async[T, TReturn](innerFn: InnerFunction[T, Any, TReturn, Any]): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ]]
  inline def async[T, TReturn](
    innerFn: InnerFunction[T, Any, TReturn, Any],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ]]
  inline def async[T, TReturn](
    innerFn: InnerFunction[T, Any, TReturn, Any],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: T
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ]]
  inline def async[T, TReturn](
    innerFn: InnerFunction[T, Any, TReturn, Any],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: T,
    tryLocsList: Unit,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ]]
  inline def async[T, TReturn](
    innerFn: InnerFunction[T, Any, TReturn, Any],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: T,
    tryLocsList: TryLocationsList
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ]]
  inline def async[T, TReturn](
    innerFn: InnerFunction[T, Any, TReturn, Any],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: T,
    tryLocsList: TryLocationsList,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ]]
  inline def async[T, TReturn](
    innerFn: InnerFunction[T, Any, TReturn, Any],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: Unit,
    tryLocsList: Unit,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ]]
  inline def async[T, TReturn](
    innerFn: InnerFunction[T, Any, TReturn, Any],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: Unit,
    tryLocsList: TryLocationsList
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ]]
  inline def async[T, TReturn](
    innerFn: InnerFunction[T, Any, TReturn, Any],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: Unit,
    tryLocsList: TryLocationsList,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ]]
  inline def async[T, TReturn](
    innerFn: InnerFunction[T, Any, TReturn, Any],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: T
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ]]
  inline def async[T, TReturn](
    innerFn: InnerFunction[T, Any, TReturn, Any],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: T,
    tryLocsList: Unit,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ]]
  inline def async[T, TReturn](
    innerFn: InnerFunction[T, Any, TReturn, Any],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: T,
    tryLocsList: TryLocationsList
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ]]
  inline def async[T, TReturn](
    innerFn: InnerFunction[T, Any, TReturn, Any],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: T,
    tryLocsList: TryLocationsList,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ]]
  inline def async[T, TReturn](
    innerFn: InnerFunction[T, Any, TReturn, Any],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: Unit,
    tryLocsList: Unit,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ]]
  inline def async[T, TReturn](
    innerFn: InnerFunction[T, Any, TReturn, Any],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: Unit,
    tryLocsList: TryLocationsList
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ]]
  inline def async[T, TReturn](
    innerFn: InnerFunction[T, Any, TReturn, Any],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: Unit,
    tryLocsList: TryLocationsList,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ]]
  inline def async[T, TReturn](
    innerFn: InnerFunction[T, Any, TReturn, Any],
    // tslint:disable-next-line: ban-types
  outerFn: Unit,
    self: T
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ]]
  inline def async[T, TReturn](
    innerFn: InnerFunction[T, Any, TReturn, Any],
    // tslint:disable-next-line: ban-types
  outerFn: Unit,
    self: T,
    tryLocsList: Unit,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ]]
  inline def async[T, TReturn](
    innerFn: InnerFunction[T, Any, TReturn, Any],
    // tslint:disable-next-line: ban-types
  outerFn: Unit,
    self: T,
    tryLocsList: TryLocationsList
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ]]
  inline def async[T, TReturn](
    innerFn: InnerFunction[T, Any, TReturn, Any],
    // tslint:disable-next-line: ban-types
  outerFn: Unit,
    self: T,
    tryLocsList: TryLocationsList,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ]]
  inline def async[T, TReturn](
    innerFn: InnerFunction[T, Any, TReturn, Any],
    // tslint:disable-next-line: ban-types
  outerFn: Unit,
    self: Unit,
    tryLocsList: Unit,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ]]
  inline def async[T, TReturn](
    innerFn: InnerFunction[T, Any, TReturn, Any],
    // tslint:disable-next-line: ban-types
  outerFn: Unit,
    self: Unit,
    tryLocsList: TryLocationsList
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ]]
  inline def async[T, TReturn](
    innerFn: InnerFunction[T, Any, TReturn, Any],
    // tslint:disable-next-line: ban-types
  outerFn: Unit,
    self: Unit,
    tryLocsList: TryLocationsList,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
  ]]
  inline def async[T, TYield, TReturn](innerFn: InnerFunction[T, TYield, TReturn, Any], outerFn: GeneratorFunction): AsyncIterator[
    /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator[
    /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    Any
  ]]
  inline def async[T, TYield, TReturn](innerFn: InnerFunction[T, TYield, TReturn, Any], outerFn: GeneratorFunction, self: T): AsyncIterator[
    /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator[
    /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    Any
  ]]
  inline def async[T, TYield, TReturn](
    innerFn: InnerFunction[T, TYield, TReturn, Any],
    outerFn: GeneratorFunction,
    self: T,
    tryLocsList: Unit,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): AsyncIterator[
    /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator[
    /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    Any
  ]]
  inline def async[T, TYield, TReturn](
    innerFn: InnerFunction[T, TYield, TReturn, Any],
    outerFn: GeneratorFunction,
    self: T,
    tryLocsList: TryLocationsList
  ): AsyncIterator[
    /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator[
    /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    Any
  ]]
  inline def async[T, TYield, TReturn](
    innerFn: InnerFunction[T, TYield, TReturn, Any],
    outerFn: GeneratorFunction,
    self: T,
    tryLocsList: TryLocationsList,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): AsyncIterator[
    /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator[
    /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    Any
  ]]
  inline def async[T, TYield, TReturn](
    innerFn: InnerFunction[T, TYield, TReturn, Any],
    outerFn: GeneratorFunction,
    self: Unit,
    tryLocsList: Unit,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): AsyncIterator[
    /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator[
    /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    Any
  ]]
  inline def async[T, TYield, TReturn](
    innerFn: InnerFunction[T, TYield, TReturn, Any],
    outerFn: GeneratorFunction,
    self: Unit,
    tryLocsList: TryLocationsList
  ): AsyncIterator[
    /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator[
    /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    Any
  ]]
  inline def async[T, TYield, TReturn](
    innerFn: InnerFunction[T, TYield, TReturn, Any],
    outerFn: GeneratorFunction,
    self: Unit,
    tryLocsList: TryLocationsList,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): AsyncIterator[
    /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator[
    /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
    Any
  ]]
  
  @JSImport("regenerator-runtime", "awrap")
  @js.native
  open class awrap[V] protected () extends StObject {
    def this(arg: V) = this()
    
    val __await: V = js.native
    
    // Used to tell TypeScript that this class is to be treated as a nominal type:
    /* private */ val `private`: Any = js.native
  }
  object awrap {
    
    @JSImport("regenerator-runtime", "awrap")
    @js.native
    def apply[V](arg: V): awrap[V] = js.native
  }
  
  object global {
    
    /* was `typeof imported_regenerator-runtime` */
    object regeneratorRuntime {
      
      @JSGlobal("regeneratorRuntime")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("regeneratorRuntime.AsyncIterator")
      @js.native
      open class AsyncIterator[TYield, TReturn, TNext] protected ()
        extends typingsJapgolly.regeneratorRuntime.mod.AsyncIterator[TYield, TReturn, TNext] {
        def this(
          generator: Generator[
                    TYield | PromiseLike[TYield] | typingsJapgolly.regeneratorRuntime.mod.awrap[Any], 
                    TReturn | PromiseLike[TReturn] | typingsJapgolly.regeneratorRuntime.mod.awrap[Any], 
                    Any
                  ],
          PromiseImpl: ResolvablePromiseConstructorLike
        ) = this()
      }
      
      inline def async[T, TReturn](innerFn: InnerFunction[T, Any, TReturn, Any]): js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ] = ^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ]]
      inline def async[T, TReturn](
        innerFn: InnerFunction[T, Any, TReturn, Any],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function
      ): js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ]]
      inline def async[T, TReturn](
        innerFn: InnerFunction[T, Any, TReturn, Any],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: T
      ): js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ]]
      inline def async[T, TReturn](
        innerFn: InnerFunction[T, Any, TReturn, Any],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: T,
        tryLocsList: Unit,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ]]
      inline def async[T, TReturn](
        innerFn: InnerFunction[T, Any, TReturn, Any],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: T,
        tryLocsList: TryLocationsList
      ): js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ]]
      inline def async[T, TReturn](
        innerFn: InnerFunction[T, Any, TReturn, Any],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: T,
        tryLocsList: TryLocationsList,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ]]
      inline def async[T, TReturn](
        innerFn: InnerFunction[T, Any, TReturn, Any],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: Unit,
        tryLocsList: Unit,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ]]
      inline def async[T, TReturn](
        innerFn: InnerFunction[T, Any, TReturn, Any],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: Unit,
        tryLocsList: TryLocationsList
      ): js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ]]
      inline def async[T, TReturn](
        innerFn: InnerFunction[T, Any, TReturn, Any],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: Unit,
        tryLocsList: TryLocationsList,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ]]
      inline def async[T, TReturn](
        innerFn: InnerFunction[T, Any, TReturn, Any],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: T
      ): js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ]]
      inline def async[T, TReturn](
        innerFn: InnerFunction[T, Any, TReturn, Any],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: T,
        tryLocsList: Unit,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ]]
      inline def async[T, TReturn](
        innerFn: InnerFunction[T, Any, TReturn, Any],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: T,
        tryLocsList: TryLocationsList
      ): js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ]]
      inline def async[T, TReturn](
        innerFn: InnerFunction[T, Any, TReturn, Any],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: T,
        tryLocsList: TryLocationsList,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ]]
      inline def async[T, TReturn](
        innerFn: InnerFunction[T, Any, TReturn, Any],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: Unit,
        tryLocsList: Unit,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ]]
      inline def async[T, TReturn](
        innerFn: InnerFunction[T, Any, TReturn, Any],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: Unit,
        tryLocsList: TryLocationsList
      ): js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ]]
      inline def async[T, TReturn](
        innerFn: InnerFunction[T, Any, TReturn, Any],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: Unit,
        tryLocsList: TryLocationsList,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ]]
      inline def async[T, TReturn](
        innerFn: InnerFunction[T, Any, TReturn, Any],
        // tslint:disable-next-line: ban-types
      outerFn: Unit,
        self: T
      ): js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ]]
      inline def async[T, TReturn](
        innerFn: InnerFunction[T, Any, TReturn, Any],
        // tslint:disable-next-line: ban-types
      outerFn: Unit,
        self: T,
        tryLocsList: Unit,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ]]
      inline def async[T, TReturn](
        innerFn: InnerFunction[T, Any, TReturn, Any],
        // tslint:disable-next-line: ban-types
      outerFn: Unit,
        self: T,
        tryLocsList: TryLocationsList
      ): js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ]]
      inline def async[T, TReturn](
        innerFn: InnerFunction[T, Any, TReturn, Any],
        // tslint:disable-next-line: ban-types
      outerFn: Unit,
        self: T,
        tryLocsList: TryLocationsList,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ]]
      inline def async[T, TReturn](
        innerFn: InnerFunction[T, Any, TReturn, Any],
        // tslint:disable-next-line: ban-types
      outerFn: Unit,
        self: Unit,
        tryLocsList: Unit,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ]]
      inline def async[T, TReturn](
        innerFn: InnerFunction[T, Any, TReturn, Any],
        // tslint:disable-next-line: ban-types
      outerFn: Unit,
        self: Unit,
        tryLocsList: TryLocationsList
      ): js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ]]
      inline def async[T, TReturn](
        innerFn: InnerFunction[T, Any, TReturn, Any],
        // tslint:disable-next-line: ban-types
      outerFn: Unit,
        self: Unit,
        tryLocsList: TryLocationsList,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : TReturn */ js.Any
          ]]
      inline def async[T, TYield, TReturn](innerFn: InnerFunction[T, TYield, TReturn, Any], outerFn: GeneratorFunction): typingsJapgolly.regeneratorRuntime.mod.AsyncIterator[
            /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.regeneratorRuntime.mod.AsyncIterator[
            /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            Any
          ]]
      inline def async[T, TYield, TReturn](innerFn: InnerFunction[T, TYield, TReturn, Any], outerFn: GeneratorFunction, self: T): typingsJapgolly.regeneratorRuntime.mod.AsyncIterator[
            /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.regeneratorRuntime.mod.AsyncIterator[
            /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            Any
          ]]
      inline def async[T, TYield, TReturn](
        innerFn: InnerFunction[T, TYield, TReturn, Any],
        outerFn: GeneratorFunction,
        self: T,
        tryLocsList: Unit,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): typingsJapgolly.regeneratorRuntime.mod.AsyncIterator[
            /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.regeneratorRuntime.mod.AsyncIterator[
            /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            Any
          ]]
      inline def async[T, TYield, TReturn](
        innerFn: InnerFunction[T, TYield, TReturn, Any],
        outerFn: GeneratorFunction,
        self: T,
        tryLocsList: TryLocationsList
      ): typingsJapgolly.regeneratorRuntime.mod.AsyncIterator[
            /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.regeneratorRuntime.mod.AsyncIterator[
            /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            Any
          ]]
      inline def async[T, TYield, TReturn](
        innerFn: InnerFunction[T, TYield, TReturn, Any],
        outerFn: GeneratorFunction,
        self: T,
        tryLocsList: TryLocationsList,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): typingsJapgolly.regeneratorRuntime.mod.AsyncIterator[
            /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.regeneratorRuntime.mod.AsyncIterator[
            /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            Any
          ]]
      inline def async[T, TYield, TReturn](
        innerFn: InnerFunction[T, TYield, TReturn, Any],
        outerFn: GeneratorFunction,
        self: Unit,
        tryLocsList: Unit,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): typingsJapgolly.regeneratorRuntime.mod.AsyncIterator[
            /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.regeneratorRuntime.mod.AsyncIterator[
            /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            Any
          ]]
      inline def async[T, TYield, TReturn](
        innerFn: InnerFunction[T, TYield, TReturn, Any],
        outerFn: GeneratorFunction,
        self: Unit,
        tryLocsList: TryLocationsList
      ): typingsJapgolly.regeneratorRuntime.mod.AsyncIterator[
            /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.regeneratorRuntime.mod.AsyncIterator[
            /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            Any
          ]]
      inline def async[T, TYield, TReturn](
        innerFn: InnerFunction[T, TYield, TReturn, Any],
        outerFn: GeneratorFunction,
        self: Unit,
        tryLocsList: TryLocationsList,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): typingsJapgolly.regeneratorRuntime.mod.AsyncIterator[
            /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.regeneratorRuntime.mod.AsyncIterator[
            /* import warning: importer.ImportType#apply Failed type conversion: TYield extends std.PromiseLike<infer Await> ? Await : std.Exclude<TYield, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: TReturn extends std.PromiseLike<infer Await> ? Await : std.Exclude<TReturn, regenerator-runtime.regenerator-runtime.awrap<unknown>> */ js.Any, 
            Any
          ]]
      
      @JSGlobal("regeneratorRuntime.awrap")
      @js.native
      open class awrap[V] protected ()
        extends typingsJapgolly.regeneratorRuntime.mod.awrap[V] {
        def this(arg: V) = this()
      }
      object awrap {
        
        @JSGlobal("regeneratorRuntime.awrap")
        @js.native
        def apply[V](arg: V): typingsJapgolly.regeneratorRuntime.mod.awrap[V] = js.native
      }
      
      inline def isGeneratorFunction(func: Any): /* is std.GeneratorFunction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGeneratorFunction")(func.asInstanceOf[js.Any]).asInstanceOf[/* is std.GeneratorFunction */ Boolean]
      
      inline def keys(`object`: js.Object): js.Function0[IteratorResult[String, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Function0[IteratorResult[String, Unit]]]
      
      inline def mark[F /* <: js.Function */](genFun: F): F & GeneratorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("mark")(genFun.asInstanceOf[js.Any]).asInstanceOf[F & GeneratorFunction]
      
      inline def values[T](iterableOrArrayLike: js.Iterable[T]): js.Iterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(iterableOrArrayLike.asInstanceOf[js.Any]).asInstanceOf[js.Iterator[T]]
      inline def values[T](iterableOrArrayLike: ArrayLike[T]): js.Iterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(iterableOrArrayLike.asInstanceOf[js.Any]).asInstanceOf[js.Iterator[T]]
      inline def values[I /* <: js.Iterator[Any] */](iterable: Iterator[I]): I = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(iterable.asInstanceOf[js.Any]).asInstanceOf[I]
      
      inline def wrap[T, TYield, TReturn, TNext](innerFn: InnerFunction[T, TYield, TReturn, TNext]): Generator[TYield, TReturn, TNext] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any]).asInstanceOf[Generator[TYield, TReturn, TNext]]
      inline def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function
      ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
      inline def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: T
      ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
      inline def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: T,
        tryLocsList: TryLocationsList
      ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
      inline def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: Unit,
        tryLocsList: TryLocationsList
      ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
      inline def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: T
      ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
      inline def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: T,
        tryLocsList: TryLocationsList
      ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
      inline def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: Unit,
        tryLocsList: TryLocationsList
      ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
      inline def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: Unit,
        self: T
      ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
      inline def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: Unit,
        self: T,
        tryLocsList: TryLocationsList
      ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
      inline def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: Unit,
        self: Unit,
        tryLocsList: TryLocationsList
      ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
    }
  }
  
  inline def isGeneratorFunction(func: Any): /* is std.GeneratorFunction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGeneratorFunction")(func.asInstanceOf[js.Any]).asInstanceOf[/* is std.GeneratorFunction */ Boolean]
  
  inline def keys(`object`: js.Object): js.Function0[IteratorResult[String, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Function0[IteratorResult[String, Unit]]]
  
  inline def mark[F /* <: js.Function */](genFun: F): F & GeneratorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("mark")(genFun.asInstanceOf[js.Any]).asInstanceOf[F & GeneratorFunction]
  
  inline def values[T](iterableOrArrayLike: js.Iterable[T]): js.Iterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(iterableOrArrayLike.asInstanceOf[js.Any]).asInstanceOf[js.Iterator[T]]
  inline def values[T](iterableOrArrayLike: ArrayLike[T]): js.Iterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(iterableOrArrayLike.asInstanceOf[js.Any]).asInstanceOf[js.Iterator[T]]
  inline def values[I /* <: js.Iterator[Any] */](iterable: Iterator[I]): I = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(iterable.asInstanceOf[js.Any]).asInstanceOf[I]
  
  inline def wrap[T, TYield, TReturn, TNext](innerFn: InnerFunction[T, TYield, TReturn, TNext]): Generator[TYield, TReturn, TNext] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any]).asInstanceOf[Generator[TYield, TReturn, TNext]]
  inline def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function
  ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
  inline def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: T
  ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
  inline def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: T,
    tryLocsList: TryLocationsList
  ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
  inline def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: Unit,
    tryLocsList: TryLocationsList
  ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
  inline def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: T
  ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
  inline def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: T,
    tryLocsList: TryLocationsList
  ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
  inline def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: Unit,
    tryLocsList: TryLocationsList
  ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
  inline def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: Unit,
    self: T
  ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
  inline def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: Unit,
    self: T,
    tryLocsList: TryLocationsList
  ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
  inline def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: Unit,
    self: Unit,
    tryLocsList: TryLocationsList
  ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
  
  trait CompletionRecord extends StObject {
    
    var arg: Any
    
    var `type`: CompletionType
  }
  object CompletionRecord {
    
    inline def apply(arg: Any, `type`: CompletionType): CompletionRecord = {
      val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompletionRecord]
    }
    
    extension [Self <: CompletionRecord](x: Self) {
      
      inline def setArg(value: Any): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
      
      inline def setType(value: CompletionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.regeneratorRuntime.regeneratorRuntimeStrings.normal
    - typingsJapgolly.regeneratorRuntime.regeneratorRuntimeStrings.`return`
    - typingsJapgolly.regeneratorRuntime.regeneratorRuntimeStrings.`throw`
    - typingsJapgolly.regeneratorRuntime.regeneratorRuntimeStrings.break
    - typingsJapgolly.regeneratorRuntime.regeneratorRuntimeStrings.continue
  */
  trait CompletionType extends StObject
  object CompletionType {
    
    inline def break: typingsJapgolly.regeneratorRuntime.regeneratorRuntimeStrings.break = "break".asInstanceOf[typingsJapgolly.regeneratorRuntime.regeneratorRuntimeStrings.break]
    
    inline def continue: typingsJapgolly.regeneratorRuntime.regeneratorRuntimeStrings.continue = "continue".asInstanceOf[typingsJapgolly.regeneratorRuntime.regeneratorRuntimeStrings.continue]
    
    inline def normal: typingsJapgolly.regeneratorRuntime.regeneratorRuntimeStrings.normal = "normal".asInstanceOf[typingsJapgolly.regeneratorRuntime.regeneratorRuntimeStrings.normal]
    
    inline def `return`: typingsJapgolly.regeneratorRuntime.regeneratorRuntimeStrings.`return` = "return".asInstanceOf[typingsJapgolly.regeneratorRuntime.regeneratorRuntimeStrings.`return`]
    
    inline def `throw`: typingsJapgolly.regeneratorRuntime.regeneratorRuntimeStrings.`throw` = "throw".asInstanceOf[typingsJapgolly.regeneratorRuntime.regeneratorRuntimeStrings.`throw`]
  }
  
  @js.native
  trait Context[TYield, TReturn, TNext]
    extends StObject
       with /* temp */ StringDictionary[Any] {
    
    /**
      * @param type The completion type.
      * @param nextLoc The location label to resume iteration at.
      */
    def abrupt(`type`: break | continue, nextLoc: Double): Any = js.native
    /**
      * @param type The completion type.
      * @param arg The [[Value]] or [[Target]] of the completion record.
      */
    def abrupt(`type`: CompletionType): Any = js.native
    def abrupt(`type`: CompletionType, arg: Any): Any = js.native
    /**
      * @param type The completion type.
      * @param rval The return value.
      */
    @JSName("abrupt")
    def abrupt_return(`type`: `return`): Any = js.native
    @JSName("abrupt")
    def abrupt_return(`type`: `return`, rval: TReturn): Any = js.native
    /**
      * @param type The completion type.
      * @param exception The exception to throw.
      */
    @JSName("abrupt")
    def abrupt_throw(`type`: `throw`): scala.Nothing = js.native
    @JSName("abrupt")
    def abrupt_throw(`type`: `throw`, exception: Any): scala.Nothing = js.native
    
    /**
      * The argument passed to the generator method.
      */
    var arg: Any = js.native
    
    /**
      * Used to obtain the exception that was thrown in the associated try block.
      *
      * @param tryLoc The label of the beginning of the try block.
      */
    def `catch`(tryLoc: Double): Any = js.native
    
    /**
      * @param record The completion record.
      * @param afterLoc The location to resume the generator at, only used by normal completions.
      */
    def complete(record: ReadonlyCompletionRecord): Any = js.native
    def complete(record: ReadonlyCompletionRecord, afterLoc: ContextLocation): Any = js.native
    
    /**
      * If truthy, then it contains information about the currently `yield*` delegated iterator.
      */
    var delegate: js.UndefOr[DelegatedIterator] = js.native
    
    /**
      * @param iterable The iterable to delegate to.
      * @param resultName The name of the property to assign to on this context.
      * @param nextLoc The label of the location where to resume iteration.
      */
    def delegateYield(iterable: `0`[TYield], resultName: String, nextLoc: ContextLocation): Any = js.native
    
    /**
      * Dispatches an exception to `innerFn`
      *
      * @param exception The exception to dispatch.
      */
    def dispatchException(exception: Any): Boolean = js.native
    
    /**
      * Whether the generator has finished.
      */
    var done: Boolean = js.native
    
    /**
      * Used to signify the end of a finally block.
      *
      * @param finallyLoc The label of the beginning of the finally block.
      */
    def finish(finallyLoc: Double): Any = js.native
    
    /**
      * The generator method.
      */
    var method: next | `return` | `throw` = js.native
    
    /**
      * The label of the next location, is set to `'end'` when the generator needs to close abruptly.
      */
    var next: Double | end = js.native
    
    /**
      * The label of the previous location, needs to be set to `next` at the start of user code.
      */
    var prev: Any = js.native
    
    def reset(): Unit = js.native
    def reset(skipTempReset: Boolean): Unit = js.native
    
    /**
      * The return value, set by `abrupt("return")`.
      */
    var rval: TReturn = js.native
    
    /**
      * The value passed to `next()`.
      */
    var sent: TNext = js.native
    
    /**
      * Ends the iteration.
      */
    def stop(): TReturn = js.native
    
    val tryEntries: Array[readonlytryLocrootOmitTry | TryEntry] = js.native
  }
  
  type ContextLocation = Double | end
  
  trait DelegatedIterator extends StObject {
    
    var iterator: js.Iterator[Any]
  }
  object DelegatedIterator {
    
    inline def apply(iterator: js.Iterator[Any]): DelegatedIterator = {
      val __obj = js.Dynamic.literal(iterator = iterator.asInstanceOf[js.Any])
      __obj.asInstanceOf[DelegatedIterator]
    }
    
    extension [Self <: DelegatedIterator](x: Self) {
      
      inline def setIterator(value: js.Iterator[Any]): Self = StObject.set(x, "iterator", value.asInstanceOf[js.Any])
    }
  }
  
  type InnerFunction[T, TYield, TReturn, TNext] = js.ThisFunction1[/* this */ T, /* context */ Context[TYield, TReturn, TNext], Any]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new <T>(executor : (resolve : (value : T | std.PromiseLike<T>): void, reject : (reason : any | undefined): void): void): std.PromiseLike<T> */ @js.native
  trait ResolvablePromiseConstructorLike extends StObject {
    
    def resolve[T](): PromiseLike[T] = js.native
    def resolve[T](value: T): PromiseLike[T] = js.native
  }
  
  trait TryEntry extends StObject {
    
    val afterLoc: js.UndefOr[ContextLocation] = js.undefined
    
    val catchLoc: js.UndefOr[Double] = js.undefined
    
    var completion: js.UndefOr[CompletionRecord] = js.undefined
    
    val finallyLoc: js.UndefOr[Double] = js.undefined
    
    val tryLoc: Double
  }
  object TryEntry {
    
    inline def apply(tryLoc: Double): TryEntry = {
      val __obj = js.Dynamic.literal(tryLoc = tryLoc.asInstanceOf[js.Any])
      __obj.asInstanceOf[TryEntry]
    }
    
    extension [Self <: TryEntry](x: Self) {
      
      inline def setAfterLoc(value: ContextLocation): Self = StObject.set(x, "afterLoc", value.asInstanceOf[js.Any])
      
      inline def setAfterLocUndefined: Self = StObject.set(x, "afterLoc", js.undefined)
      
      inline def setCatchLoc(value: Double): Self = StObject.set(x, "catchLoc", value.asInstanceOf[js.Any])
      
      inline def setCatchLocUndefined: Self = StObject.set(x, "catchLoc", js.undefined)
      
      inline def setCompletion(value: CompletionRecord): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
      
      inline def setCompletionUndefined: Self = StObject.set(x, "completion", js.undefined)
      
      inline def setFinallyLoc(value: Double): Self = StObject.set(x, "finallyLoc", value.asInstanceOf[js.Any])
      
      inline def setFinallyLocUndefined: Self = StObject.set(x, "finallyLoc", js.undefined)
      
      inline def setTryLoc(value: Double): Self = StObject.set(x, "tryLoc", value.asInstanceOf[js.Any])
    }
  }
  
  type TryLocationsList = js.Array[
    (js.Tuple2[Double, Double]) | (js.Tuple4[Double, js.UndefOr[Double], Double, ContextLocation])
  ]
}
