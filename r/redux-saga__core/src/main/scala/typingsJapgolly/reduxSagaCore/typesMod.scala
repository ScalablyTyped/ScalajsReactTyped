package typingsJapgolly.reduxSagaCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.bufferMod.global.BufferConstructor
import typingsJapgolly.node.bufferMod.global.BufferEncoding
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import typingsJapgolly.reduxSagaCore.anon.Args
import typingsJapgolly.reduxSagaCore.anon.Effect
import typingsJapgolly.reduxSagaCore.typesEffectsMod.ForkEffect
import typingsJapgolly.std.Parameters
import typingsJapgolly.std.Partial
import typingsJapgolly.std.SharedArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("@redux-saga/core/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[C /* <: js.Object */](): SagaMiddleware[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[SagaMiddleware[C]]
  inline def default[C /* <: js.Object */](options: SagaMiddlewareOptions[C]): SagaMiddleware[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[SagaMiddleware[C]]
  
  @JSImport("@redux-saga/core/types", "Buffer")
  @js.native
  def Buffer: BufferConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@redux-saga/core/types", "Buffer")
  @js.native
  open class BufferCls protected ()
    extends StObject
       with Buffer {
    /**
      * Produces a Buffer backed by the same allocated memory as
      * the given {ArrayBuffer}/{SharedArrayBuffer}.
      *
      *
      * @param arrayBuffer The ArrayBuffer with which to share memory.
      * @deprecated since v10.0.0 - Use `Buffer.from(arrayBuffer[, byteOffset[, length]])` instead.
      */
    def this(arrayBuffer: js.typedarray.ArrayBuffer) = this()
    def this(arrayBuffer: SharedArrayBuffer) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      * @deprecated since v10.0.0 - Use `Buffer.from(array)` instead.
      */
    def this(array: js.Array[Any]) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      * @deprecated since v10.0.0 - Use `Buffer.from(array)` instead.
      */
    def this(array: js.typedarray.Uint8Array) = this()
    /**
      * Copies the passed {buffer} data onto a new {Buffer} instance.
      *
      * @param buffer The buffer to copy.
      * @deprecated since v10.0.0 - Use `Buffer.from(buffer)` instead.
      */
    def this(buffer: Buffer) = this()
    /**
      * Allocates a new buffer of {size} octets.
      *
      * @param size count of octets to allocate.
      * @deprecated since v10.0.0 - Use `Buffer.alloc()` instead (also see `Buffer.allocUnsafe()`).
      */
    def this(size: Double) = this()
    /**
      * Allocates a new buffer containing the given {str}.
      *
      * @param str String to store in buffer.
      * @param encoding encoding to use, optional.  Default is 'utf8'
      * @deprecated since v10.0.0 - Use `Buffer.from(string[, encoding])` instead.
      */
    def this(str: String) = this()
    def this(str: String, encoding: BufferEncoding) = this()
  }
  
  inline def Buffer_=(x: BufferConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Buffer")(x.asInstanceOf[js.Any])
  
  @JSImport("@redux-saga/core/types", "CANCEL")
  @js.native
  val CANCEL: String = js.native
  
  @JSImport("@redux-saga/core/types", "END")
  @js.native
  val END: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EndType */ Any = js.native
  type END = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EndType */ Any
  
  object buffers {
    
    @JSImport("@redux-saga/core/types", "buffers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Same as `fixed` but Overflow will silently drop the messages.
      */
    inline def dropping[T](): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("dropping")().asInstanceOf[Buffer]
    inline def dropping[T](limit: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("dropping")(limit.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    /**
      * Like `fixed` but Overflow will cause the buffer to expand dynamically.
      */
    inline def expanding[T](): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("expanding")().asInstanceOf[Buffer]
    inline def expanding[T](limit: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("expanding")(limit.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    /**
      * New messages will be buffered up to `limit`. Overflow will raise an Error.
      * Omitting a `limit` value will result in a limit of 10.
      */
    inline def fixed[T](): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("fixed")().asInstanceOf[Buffer]
    inline def fixed[T](limit: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("fixed")(limit.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    /**
      * No buffering, new messages will be lost if there are no pending takers
      */
    inline def none[T](): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("none")().asInstanceOf[Buffer]
    
    /**
      * Same as `fixed` but Overflow will insert the new message at the end and
      * drop the oldest message in the buffer.
      */
    inline def sliding[T](): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sliding")().asInstanceOf[Buffer]
    inline def sliding[T](limit: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sliding")(limit.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  }
  
  inline def channel[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NotUndefined */ Any */](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("channel")().asInstanceOf[Any]
  inline def channel[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NotUndefined */ Any */](buffer: Buffer): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("channel")(buffer.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def detach(forkEffect: ForkEffect): ForkEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("detach")(forkEffect.asInstanceOf[js.Any]).asInstanceOf[ForkEffect]
  
  inline def eventChannel[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NotUndefined */ Any */](subscribe: Subscribe[T]): EventChannel_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventChannel")(subscribe.asInstanceOf[js.Any]).asInstanceOf[EventChannel_[T]]
  inline def eventChannel[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NotUndefined */ Any */](subscribe: Subscribe[T], buffer: Buffer): EventChannel_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventChannel")(subscribe.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[EventChannel_[T]]
  
  inline def multicastChannel[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NotUndefined */ Any */](): MulticastChannel_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("multicastChannel")().asInstanceOf[MulticastChannel_[T]]
  
  inline def runSaga[Action, State, S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Saga */ Any */](
    options: RunSagaOptions[Action, State],
    saga: S,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<S> is not an array type */ args: Parameters[S]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runSaga")(options.asInstanceOf[js.Any], saga.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def stdChannel[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NotUndefined */ Any */](): MulticastChannel_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("stdChannel")().asInstanceOf[MulticastChannel_[T]]
  
  type EffectMiddleware = js.Function1[
    /* next */ js.Function1[/* effect */ Any, Unit], 
    js.Function1[/* effect */ Any, Unit]
  ]
  
  trait ErrorInfo extends StObject {
    
    var sagaStack: String
  }
  object ErrorInfo {
    
    inline def apply(sagaStack: String): ErrorInfo = {
      val __obj = js.Dynamic.literal(sagaStack = sagaStack.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorInfo]
    }
    
    extension [Self <: ErrorInfo](x: Self) {
      
      inline def setSagaStack(value: String): Self = StObject.set(x, "sagaStack", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventChannel_[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NotUndefined */ Any */] extends StObject {
    
    def close(): Unit
    
    def flush(cb: js.Function1[/* items */ js.Array[T] | typingsJapgolly.reduxSagaCore.typesMod.END, Unit]): Unit
    
    def take(cb: js.Function1[/* message */ T | typingsJapgolly.reduxSagaCore.typesMod.END, Unit]): Unit
  }
  object EventChannel_ {
    
    inline def apply[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NotUndefined */ Any */](
      close: Callback,
      flush: js.Function1[/* items */ js.Array[T] | typingsJapgolly.reduxSagaCore.typesMod.END, Unit] => Callback,
      take: js.Function1[/* message */ T | typingsJapgolly.reduxSagaCore.typesMod.END, Unit] => Callback
    ): EventChannel_[T] = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, flush = js.Any.fromFunction1((t0: js.Function1[/* items */ js.Array[T] | typingsJapgolly.reduxSagaCore.typesMod.END, Unit]) => flush(t0).runNow()), take = js.Any.fromFunction1((t0: js.Function1[/* message */ T | typingsJapgolly.reduxSagaCore.typesMod.END, Unit]) => take(t0).runNow()))
      __obj.asInstanceOf[EventChannel_[T]]
    }
    
    extension [Self <: EventChannel_[?], T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NotUndefined */ Any */](x: Self & EventChannel_[T]) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setFlush(
        value: js.Function1[/* items */ js.Array[T] | typingsJapgolly.reduxSagaCore.typesMod.END, Unit] => Callback
      ): Self = StObject.set(x, "flush", js.Any.fromFunction1((t0: js.Function1[/* items */ js.Array[T] | typingsJapgolly.reduxSagaCore.typesMod.END, Unit]) => value(t0).runNow()))
      
      inline def setTake(
        value: js.Function1[/* message */ T | typingsJapgolly.reduxSagaCore.typesMod.END, Unit] => Callback
      ): Self = StObject.set(x, "take", js.Any.fromFunction1((t0: js.Function1[/* message */ T | typingsJapgolly.reduxSagaCore.typesMod.END, Unit]) => value(t0).runNow()))
    }
  }
  
  trait FlushableChannel[T] extends StObject {
    
    def flush(cb: js.Function1[/* items */ js.Array[T] | typingsJapgolly.reduxSagaCore.typesMod.END, Unit]): Unit
  }
  object FlushableChannel {
    
    inline def apply[T](
      flush: js.Function1[/* items */ js.Array[T] | typingsJapgolly.reduxSagaCore.typesMod.END, Unit] => Callback
    ): FlushableChannel[T] = {
      val __obj = js.Dynamic.literal(flush = js.Any.fromFunction1((t0: js.Function1[/* items */ js.Array[T] | typingsJapgolly.reduxSagaCore.typesMod.END, Unit]) => flush(t0).runNow()))
      __obj.asInstanceOf[FlushableChannel[T]]
    }
    
    extension [Self <: FlushableChannel[?], T](x: Self & FlushableChannel[T]) {
      
      inline def setFlush(
        value: js.Function1[/* items */ js.Array[T] | typingsJapgolly.reduxSagaCore.typesMod.END, Unit] => Callback
      ): Self = StObject.set(x, "flush", js.Any.fromFunction1((t0: js.Function1[/* items */ js.Array[T] | typingsJapgolly.reduxSagaCore.typesMod.END, Unit]) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait MulticastChannel_[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NotUndefined */ Any */] extends StObject {
    
    def close(): Unit = js.native
    
    def put(message: typingsJapgolly.reduxSagaCore.typesMod.END | T): Unit = js.native
    
    def take(cb: js.Function1[/* message */ T | typingsJapgolly.reduxSagaCore.typesMod.END, Unit]): Unit = js.native
    def take(
      cb: js.Function1[/* message */ T | typingsJapgolly.reduxSagaCore.typesMod.END, Unit],
      matcher: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Predicate<T> */ Any
    ): Unit = js.native
  }
  
  @js.native
  trait PredicateTakeableChannel[T] extends StObject {
    
    def take(cb: js.Function1[/* message */ T | typingsJapgolly.reduxSagaCore.typesMod.END, Unit]): Unit = js.native
    def take(
      cb: js.Function1[/* message */ T | typingsJapgolly.reduxSagaCore.typesMod.END, Unit],
      matcher: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Predicate<T> */ Any
    ): Unit = js.native
  }
  
  @js.native
  trait PuttableChannel[T] extends StObject {
    
    def put(message: typingsJapgolly.reduxSagaCore.typesMod.END | T): Unit = js.native
  }
  
  trait RunSagaOptions[A, S] extends StObject {
    
    /**
      * See docs for `channel`
      */
    var channel: js.UndefOr[PredicateTakeableChannel[A]] = js.undefined
    
    /**
      * See docs for `createSagaMiddleware(options)`
      */
    var context: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Used to fulfill `put` effects.
      *
      * @param output argument provided by the Saga to the `put` Effect
      */
    var dispatch: js.UndefOr[js.Function1[/* output */ A, Any]] = js.undefined
    
    /**
      * See docs for `createSagaMiddleware(options)`
      */
    var effectMiddlewares: js.UndefOr[js.Array[EffectMiddleware]] = js.undefined
    
    /**
      * Used to fulfill `select` and `getState` effects
      */
    var getState: js.UndefOr[js.Function0[S]] = js.undefined
    
    /**
      * See docs for `createSagaMiddleware(options)`
      */
    var onError: js.UndefOr[js.Function2[/* error */ js.Error, /* errorInfo */ ErrorInfo, Unit]] = js.undefined
    
    /**
      * See docs for `createSagaMiddleware(options)`
      */
    var sagaMonitor: js.UndefOr[SagaMonitor] = js.undefined
  }
  object RunSagaOptions {
    
    inline def apply[A, S](): RunSagaOptions[A, S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RunSagaOptions[A, S]]
    }
    
    extension [Self <: RunSagaOptions[?, ?], A, S](x: Self & (RunSagaOptions[A, S])) {
      
      inline def setChannel(value: PredicateTakeableChannel[A]): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDispatch(value: /* output */ A => Any): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setDispatchUndefined: Self = StObject.set(x, "dispatch", js.undefined)
      
      inline def setEffectMiddlewares(value: js.Array[EffectMiddleware]): Self = StObject.set(x, "effectMiddlewares", value.asInstanceOf[js.Any])
      
      inline def setEffectMiddlewaresUndefined: Self = StObject.set(x, "effectMiddlewares", js.undefined)
      
      inline def setEffectMiddlewaresVarargs(value: EffectMiddleware*): Self = StObject.set(x, "effectMiddlewares", js.Array(value*))
      
      inline def setGetState(value: CallbackTo[S]): Self = StObject.set(x, "getState", value.toJsFn)
      
      inline def setGetStateUndefined: Self = StObject.set(x, "getState", js.undefined)
      
      inline def setOnError(value: (/* error */ js.Error, /* errorInfo */ ErrorInfo) => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* errorInfo */ ErrorInfo) => (value(t0, t1)).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setSagaMonitor(value: SagaMonitor): Self = StObject.set(x, "sagaMonitor", value.asInstanceOf[js.Any])
      
      inline def setSagaMonitorUndefined: Self = StObject.set(x, "sagaMonitor", js.undefined)
    }
  }
  
  @js.native
  trait SagaMiddleware[C /* <: js.Object */]
    extends Middleware[js.Object, Any, Dispatch[AnyAction]] {
    
    /**
      * Dynamically run `saga`. Can be used to run Sagas **only after** the
      * `applyMiddleware` phase.
      *
      * The method returns a `Task` descriptor.
      *
      * #### Notes
      *
      * `saga` must be a function which returns a [Generator
      * Object](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Generator).
      * The middleware will then iterate over the Generator and execute all yielded
      * Effects.
      *
      * `saga` may also start other sagas using the various Effects provided by the
      * library. The iteration process described below is also applied to all child
      * sagas.
      *
      * In the first iteration, the middleware invokes the `next()` method to
      * retrieve the next Effect. The middleware then executes the yielded Effect
      * as specified by the Effects API below. Meanwhile, the Generator will be
      * suspended until the effect execution terminates. Upon receiving the result
      * of the execution, the middleware calls `next(result)` on the Generator
      * passing it the retrieved result as an argument. This process is repeated
      * until the Generator terminates normally or by throwing some error.
      *
      * If the execution results in an error (as specified by each Effect creator)
      * then the `throw(error)` method of the Generator is called instead. If the
      * Generator function defines a `try/catch` surrounding the current yield
      * instruction, then the `catch` block will be invoked by the underlying
      * Generator runtime. The runtime will also invoke any corresponding finally
      * block.
      *
      * In the case a Saga is cancelled (either manually or using the provided
      * Effects), the middleware will invoke `return()` method of the Generator.
      * This will cause the Generator to skip directly to the finally block.
      *
      * @param saga a Generator function
      * @param args arguments to be provided to `saga`
      */
    def run[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Saga */ Any */](
      saga: S,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<S> is not an array type */ args: Parameters[S]
    ): Any = js.native
    
    def setContext(props: Partial[C]): Unit = js.native
  }
  
  trait SagaMiddlewareOptions[C /* <: js.Object */] extends StObject {
    
    /**
      * Initial value of the saga's context.
      */
    var context: js.UndefOr[C] = js.undefined
    
    /**
      * Allows you to intercept any effect, resolve it on your own and pass to the
      * next middleware.
      */
    var effectMiddlewares: js.UndefOr[js.Array[EffectMiddleware]] = js.undefined
    
    /**
      * If provided, the middleware will call it with uncaught errors from Sagas.
      * useful for sending uncaught exceptions to error tracking services.
      */
    var onError: js.UndefOr[js.Function2[/* error */ js.Error, /* errorInfo */ ErrorInfo, Unit]] = js.undefined
    
    /**
      * If a Saga Monitor is provided, the middleware will deliver monitoring
      * events to the monitor.
      */
    var sagaMonitor: js.UndefOr[SagaMonitor] = js.undefined
  }
  object SagaMiddlewareOptions {
    
    inline def apply[C /* <: js.Object */](): SagaMiddlewareOptions[C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SagaMiddlewareOptions[C]]
    }
    
    extension [Self <: SagaMiddlewareOptions[?], C /* <: js.Object */](x: Self & SagaMiddlewareOptions[C]) {
      
      inline def setContext(value: C): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setEffectMiddlewares(value: js.Array[EffectMiddleware]): Self = StObject.set(x, "effectMiddlewares", value.asInstanceOf[js.Any])
      
      inline def setEffectMiddlewaresUndefined: Self = StObject.set(x, "effectMiddlewares", js.undefined)
      
      inline def setEffectMiddlewaresVarargs(value: EffectMiddleware*): Self = StObject.set(x, "effectMiddlewares", js.Array(value*))
      
      inline def setOnError(value: (/* error */ js.Error, /* errorInfo */ ErrorInfo) => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* errorInfo */ ErrorInfo) => (value(t0, t1)).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setSagaMonitor(value: SagaMonitor): Self = StObject.set(x, "sagaMonitor", value.asInstanceOf[js.Any])
      
      inline def setSagaMonitorUndefined: Self = StObject.set(x, "sagaMonitor", js.undefined)
    }
  }
  
  trait SagaMonitor extends StObject {
    
    /**
      * @param action The dispatched Redux action. If the action was dispatched by
      * a Saga then the action will have a property `SAGA_ACTION` set to true
      * (`SAGA_ACTION` can be imported from `@redux-saga/symbols`).
      */
    var actionDispatched: js.UndefOr[js.Function1[/* action */ Action[Any], Unit]] = js.undefined
    
    /**
      * @param effectId The ID of the yielded effect
      */
    var effectCancelled: js.UndefOr[js.Function1[/* effectId */ Double, Unit]] = js.undefined
    
    /**
      * @param effectId The ID of the yielded effect
      * @param error Error raised with the rejection of the effect
      */
    var effectRejected: js.UndefOr[js.Function2[/* effectId */ Double, /* error */ Any, Unit]] = js.undefined
    
    /**
      * @param effectId The ID of the yielded effect
      * @param result The result of the successful resolution of the effect. In
      *   case of `fork` or `spawn` effects, the result will be a `Task` object.
      */
    var effectResolved: js.UndefOr[js.Function2[/* effectId */ Double, /* result */ Any, Unit]] = js.undefined
    
    /**
      * @param effectId Unique ID assigned to the yielded effect
      * @param parentEffectId ID of the parent Effect. In the case of a `race` or
      *   `parallel` effect, all effects yielded inside will have the direct
      *   race/parallel effect as a parent. In case of a top-level effect, the
      *   parent will be the containing Saga
      * @param label In case of a `race`/`all` effect, all child effects will be
      *   assigned as label the corresponding keys of the object passed to
      *   `race`/`all`
      * @param effect The yielded effect itself
      */
    var effectTriggered: js.UndefOr[js.Function1[/* options */ Effect, Unit]] = js.undefined
    
    /**
      * @param effectId Unique ID assigned to this root saga execution
      * @param saga The generator function that starts to run
      * @param args The arguments passed to the generator function
      */
    var rootSagaStarted: js.UndefOr[js.Function1[/* options */ Args, Unit]] = js.undefined
  }
  object SagaMonitor {
    
    inline def apply(): SagaMonitor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SagaMonitor]
    }
    
    extension [Self <: SagaMonitor](x: Self) {
      
      inline def setActionDispatched(value: /* action */ Action[Any] => Callback): Self = StObject.set(x, "actionDispatched", js.Any.fromFunction1((t0: /* action */ Action[Any]) => value(t0).runNow()))
      
      inline def setActionDispatchedUndefined: Self = StObject.set(x, "actionDispatched", js.undefined)
      
      inline def setEffectCancelled(value: /* effectId */ Double => Callback): Self = StObject.set(x, "effectCancelled", js.Any.fromFunction1((t0: /* effectId */ Double) => value(t0).runNow()))
      
      inline def setEffectCancelledUndefined: Self = StObject.set(x, "effectCancelled", js.undefined)
      
      inline def setEffectRejected(value: (/* effectId */ Double, /* error */ Any) => Callback): Self = StObject.set(x, "effectRejected", js.Any.fromFunction2((t0: /* effectId */ Double, t1: /* error */ Any) => (value(t0, t1)).runNow()))
      
      inline def setEffectRejectedUndefined: Self = StObject.set(x, "effectRejected", js.undefined)
      
      inline def setEffectResolved(value: (/* effectId */ Double, /* result */ Any) => Callback): Self = StObject.set(x, "effectResolved", js.Any.fromFunction2((t0: /* effectId */ Double, t1: /* result */ Any) => (value(t0, t1)).runNow()))
      
      inline def setEffectResolvedUndefined: Self = StObject.set(x, "effectResolved", js.undefined)
      
      inline def setEffectTriggered(value: /* options */ Effect => Callback): Self = StObject.set(x, "effectTriggered", js.Any.fromFunction1((t0: /* options */ Effect) => value(t0).runNow()))
      
      inline def setEffectTriggeredUndefined: Self = StObject.set(x, "effectTriggered", js.undefined)
      
      inline def setRootSagaStarted(value: /* options */ Args => Callback): Self = StObject.set(x, "rootSagaStarted", js.Any.fromFunction1((t0: /* options */ Args) => value(t0).runNow()))
      
      inline def setRootSagaStartedUndefined: Self = StObject.set(x, "rootSagaStarted", js.undefined)
    }
  }
  
  type Subscribe[T] = js.Function1[
    /* cb */ js.Function1[/* input */ T | typingsJapgolly.reduxSagaCore.typesMod.END, Unit], 
    Unsubscribe
  ]
  
  trait TakeableChannel[T] extends StObject {
    
    def take(cb: js.Function1[/* message */ T | typingsJapgolly.reduxSagaCore.typesMod.END, Unit]): Unit
  }
  object TakeableChannel {
    
    inline def apply[T](take: js.Function1[/* message */ T | typingsJapgolly.reduxSagaCore.typesMod.END, Unit] => Callback): TakeableChannel[T] = {
      val __obj = js.Dynamic.literal(take = js.Any.fromFunction1((t0: js.Function1[/* message */ T | typingsJapgolly.reduxSagaCore.typesMod.END, Unit]) => take(t0).runNow()))
      __obj.asInstanceOf[TakeableChannel[T]]
    }
    
    extension [Self <: TakeableChannel[?], T](x: Self & TakeableChannel[T]) {
      
      inline def setTake(
        value: js.Function1[/* message */ T | typingsJapgolly.reduxSagaCore.typesMod.END, Unit] => Callback
      ): Self = StObject.set(x, "take", js.Any.fromFunction1((t0: js.Function1[/* message */ T | typingsJapgolly.reduxSagaCore.typesMod.END, Unit]) => value(t0).runNow()))
    }
  }
  
  type Unsubscribe = js.Function0[Unit]
}
