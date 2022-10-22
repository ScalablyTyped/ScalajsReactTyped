package typingsJapgolly.regeneratorRuntime

import typingsJapgolly.regeneratorRuntime.anon.Iterator
import typingsJapgolly.regeneratorRuntime.mod.InnerFunction
import typingsJapgolly.regeneratorRuntime.mod.ResolvablePromiseConstructorLike
import typingsJapgolly.regeneratorRuntime.mod.TryLocationsList
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.Generator
import typingsJapgolly.std.GeneratorFunction
import typingsJapgolly.std.IteratorResult
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
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
    
    object global {
      
      /* was `typeof imported_regenerator-runtime` */
      object regeneratorRuntime {
        
        @JSGlobal("regeneratorRuntime")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("regeneratorRuntime.AsyncIterator")
        @js.native
        open class AsyncIterator[TYield, TReturn, TNext] protected ()
          extends typingsJapgolly.regeneratorRuntime.mod.global.regeneratorRuntime.AsyncIterator[TYield, TReturn, TNext] {
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
          extends typingsJapgolly.regeneratorRuntime.mod.global.regeneratorRuntime.awrap[V] {
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
  }
}
