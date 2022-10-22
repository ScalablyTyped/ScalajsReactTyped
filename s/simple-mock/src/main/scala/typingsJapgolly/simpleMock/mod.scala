package typingsJapgolly.simpleMock

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.PromiseConstructorLike
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("simple-mock", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  trait Action[T] extends StObject {
    
    /**
      * arguments to call back with
      */
    var cbArgs: ArrayLike[Any]
    
    var returnValue: T
    
    var throwError: js.Error
  }
  object Action {
    
    inline def apply[T](cbArgs: ArrayLike[Any], returnValue: T, throwError: js.Error): Action[T] = {
      val __obj = js.Dynamic.literal(cbArgs = cbArgs.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], throwError = throwError.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action[T]]
    }
    
    extension [Self <: Action[?], T](x: Self & Action[T]) {
      
      inline def setCbArgs(value: ArrayLike[Any]): Self = StObject.set(x, "cbArgs", value.asInstanceOf[js.Any])
      
      inline def setReturnValue(value: T): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
      
      inline def setThrowError(value: js.Error): Self = StObject.set(x, "throwError", value.asInstanceOf[js.Any])
    }
  }
  
  trait Calls[T] extends StObject {
    
    /**
      * first argument
      */
    var arg: Any
    
    /**
      * an array of arguments received on the call
      */
    var args: js.Array[Any]
    
    /**
      * the context (this) of the call
      */
    var context: Any
    
    /**
      * autoincrementing number, can be compared to evaluate call order
      */
    var k: Double
    
    /**
      * the value returned by the wrapped function
      */
    var returned: T
    
    /**
      * the error thrown by the wrapped function
      */
    var threw: js.Error
  }
  object Calls {
    
    inline def apply[T](arg: Any, args: js.Array[Any], context: Any, k: Double, returned: T, threw: js.Error): Calls[T] = {
      val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], returned = returned.asInstanceOf[js.Any], threw = threw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Calls[T]]
    }
    
    extension [Self <: Calls[?], T](x: Self & Calls[T]) {
      
      inline def setArg(value: Any): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setK(value: Double): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      inline def setReturned(value: T): Self = StObject.set(x, "returned", value.asInstanceOf[js.Any])
      
      inline def setThrew(value: js.Error): Self = StObject.set(x, "threw", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Fn[T] extends StObject {
    
    def apply(args: Any*): T = js.native
  }
  
  @js.native
  trait Spy[T] extends StObject {
    
    def apply(args: Any*): T = js.native
    
    /**
      * Number of times the function was called.
      */
    var callCount: Double = js.native
    
    var called: Boolean = js.native
    
    var calls: js.Array[Calls[T]] = js.native
    
    var firstCall: Calls[T] = js.native
    
    /**
      * The last call object. (This is often also the first and only call.)
      */
    var lastCall: Calls[T] = js.native
    
    /**
      * Resets all counts and properties to the original state.
      */
    def reset(): Unit = js.native
  }
  
  @js.native
  trait Static extends StObject {
    
    var Promise: js.UndefOr[PromiseConstructorLike] = js.native
    
    /**
      * Returns a stub function that is also a spy.
      */
    def mock(): Stub[Any] = js.native
    /**
      * If obj has already has this function, it is wrapped in a spy. The resulting spy can be turned into a stub by further configuration. Restores with all mocks.
      */
    def mock(obj: Any, key: String): Stub[Any] = js.native
    /**
      * Wraps fn in a spy.
      */
    def mock[T](fn: Fn[T]): Spy[T] = js.native
    /**
      * Wraps fn in a spy and sets this on the obj, restorable with all mocks.
      */
    def mock[T](obj: Any, key: String, fn: Fn[T]): Stub[T] = js.native
    /**
      * Sets the value on this object. E.g. mock(config, 'title', 'test') is the same as config.title = 'test', but restorable with all mocks.
      */
    def mock[T](obj: Any, key: String, mockValue: T): T = js.native
    @JSName("mock")
    def mock_T[T](): Stub[T] = js.native
    @JSName("mock")
    def mock_T[T](obj: Any, key: String): Stub[T] = js.native
    
    /**
      * Restores all current mocks.
      */
    def restore(): Unit = js.native
    /**
      * Use this if you need to restore only a single mock value or function on an object.
      */
    def restore(obj: Any, key: String): Unit = js.native
    
    /**
      * Wraps fn in a spy.
      */
    def spy[T](fn: Fn[T]): Spy[T] = js.native
    
    /**
      * Returns a stub function that is also a spy.
      */
    def stub(): Stub[Any] = js.native
    @JSName("stub")
    def stub_T[T](): Stub[T] = js.native
  }
  
  @js.native
  trait Stub[T]
    extends StObject
       with Spy[T] {
    
    /**
      * An array of behaviours.
      * Note: modifying this array directly is not supported, rather use stub.withActions(actions) if you need to add actions.
      */
    var actions: js.Array[Action[T]] = js.native
    
    /**
      * Configures this stub to call this function, returning its return value.
      * Subsequent calls of this on the same stub (chainable) will queue up different behaviours for each subsequent call of the stub.
      */
    def callFn[R](fn: Fn[R]): Stub[R] = js.native
    
    /**
      * Configures this stub to call the original, unstubbed function, returning its return value.
      * Subsequent calls of this on the same stub (chainable) will queue up different behaviours for each subsequent call of the stub.
      */
    def callOriginal(): Stub[T] = js.native
    
    /**
      * Configures this stub to call back with the arguments passed. It will use either the last argument as callback, or the argument at cbArgumentIndex.
      * Subsequent calls of this on the same stub (chainable) will queue up different behaviours for each subsequent call of the stub.
      */
    def callback(args: Any*): Stub[T] = js.native
    
    /**
      * Configures this stub to call back with the arguments passed. It will use either the last argument as callback, or the argument at cbArgumentIndex.
      * Subsequent calls of this on the same stub (chainable) will queue up different behaviours for each subsequent call of the stub.
      */
    def callbackArgWith(cbArgumentIndex: Double, args: Any*): Stub[T] = js.native
    
    /**
      * Configures this stub to call back with the arguments passed. It will use either the last argument as callback, or the argument at cbArgumentIndex.
      * Subsequent calls of this on the same stub (chainable) will queue up different behaviours for each subsequent call of the stub.
      */
    def callbackAtIndex(cbArgumentIndex: Double, args: Any*): Stub[T] = js.native
    
    /**
      * Configures this stub to call back with the arguments passed. It will use either the last argument as callback, or the argument at cbArgumentIndex.
      * Subsequent calls of this on the same stub (chainable) will queue up different behaviours for each subsequent call of the stub.
      */
    def callbackWith(args: Any*): Stub[T] = js.native
    
    /**
      * Configures the last configured function or callback to be called in this context, i.e. this will be obj.
      */
    def inThisContext(obj: Any): Stub[T] = js.native
    
    /**
      * setting whether the queue of actions for this stub should repeat.
      * @default true
      */
    var loop: Boolean = js.native
    
    /**
      * Configures the stub to disable looping.
      */
    def noLoop(): Stub[T] = js.native
    
    /**
      * Configures the stub to return a Promise (where available) rejecting with this error. Same as stub.returnWith(Promise.reject(val)).
      * You can use a custom Promise-conforming library, i.e. simple.Promise = require('bluebird') or simple.Promise = $q.
      */
    def rejectWith[V](`val`: V): Stub[PromiseLike[V]] = js.native
    
    /**
      * Configures the stub to return a Promise (where available] resolving to this value. Same as stub.returnWith(Promise.resolve(val)).
      * You can use a custom Promise-conforming library, i.e. simple.Promise = require('bluebird') or simple.Promise = $q.
      */
    def resolveWith[V](`val`: V): Stub[PromiseLike[V]] = js.native
    
    /**
      * Configures this stub to return with this value.
      * Subsequent calls of this on the same stub (chainable) will queue up different behaviours for each subsequent call of the stub.
      */
    def returnWith[R](`val`: R): Stub[R] = js.native
    
    /**
      * Configures this stub to throw this error.
      * Subsequent calls of this on the same stub (chainable) will queue up different behaviours for each subsequent call of the stub.
      */
    def throwWith(err: js.Error): Stub[T] = js.native
    
    /**
      * Configures this stub to use the specified array of actions.
      */
    def withActions(): Stub[T] = js.native
    def withActions(actions: js.Array[Action[T]]): Stub[T] = js.native
    
    /**
      * Configures the stub to enable looping.
      */
    def withLoop(): Stub[T] = js.native
  }
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Static = ^
}
