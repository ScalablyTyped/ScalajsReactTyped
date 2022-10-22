package typingsJapgolly.reduxSagaTypes

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reduxSagaTypes.reduxSagaTypesBooleans.`false`
import typingsJapgolly.reduxSagaTypes.reduxSagaTypesBooleans.`true`
import typingsJapgolly.reduxSagaTypes.reduxSagaTypesStrings.`@@redux-sagaSlashCHANNEL_END`
import typingsJapgolly.std.IterableIterator
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait Action[T /* <: String */] extends StObject {
    
    var `type`: T
  }
  object Action {
    
    inline def apply[T /* <: String */](`type`: T): Action[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action[T]]
    }
    
    extension [Self <: Action[?], T /* <: String */](x: Self & Action[T]) {
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    P extends @redux-saga/types.@redux-saga/types/types.ActionSubPattern<@redux-saga/types.@redux-saga/types/types.Action<string>> ? @redux-saga/types.@redux-saga/types/types.ActionMatchingSubPattern<P> : P extends std.Array<@redux-saga/types.@redux-saga/types/types.ActionSubPattern<@redux-saga/types.@redux-saga/types/types.Action<string>>> ? @redux-saga/types.@redux-saga/types/types.ActionMatchingSubPattern<P[number]> : never
    }}}
    */
  @js.native
  trait ActionMatchingPattern[P /* <: ActionPattern[Action[String]] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    P extends @redux-saga/types.@redux-saga/types/types.GuardPredicate<infer A, @redux-saga/types.@redux-saga/types/types.Action<string>> ? A : P extends @redux-saga/types.@redux-saga/types/types.StringableActionCreator<infer A> ? A : @redux-saga/types.@redux-saga/types/types.Action<string>
    }}}
    */
  @js.native
  trait ActionMatchingSubPattern[P /* <: ActionSubPattern[Action[String]] */] extends StObject
  
  type ActionPattern[Guard /* <: Action[String] */] = ActionSubPattern[Guard] | js.Array[ActionSubPattern[Guard]]
  
  type ActionSubPattern[Guard /* <: Action[String] */] = (GuardPredicate[Guard, Action[String]]) | StringableActionCreator[Guard] | Predicate[Action[String]] | ActionType
  
  type ActionType = String | Double | js.Symbol
  
  trait Buffer[T] extends StObject {
    
    def flush(): js.Array[T]
    
    /**
      * Returns true if there are no messages on the buffer. A channel calls this
      * method whenever a new taker is registered
      */
    def isEmpty(): Boolean
    
    /**
      * Used to put new message in the buffer. Note the Buffer can choose to not
      * store the message (e.g. a dropping buffer can drop any new message
      * exceeding a given limit)
      */
    def put(message: T): Unit
    
    /**
      * used to retrieve any buffered message. Note the behavior of this method has
      * to be consistent with `isEmpty`
      */
    def take(): js.UndefOr[T]
  }
  object Buffer {
    
    inline def apply[T](
      flush: CallbackTo[js.Array[T]],
      isEmpty: CallbackTo[Boolean],
      put: T => Callback,
      take: CallbackTo[js.UndefOr[T]]
    ): Buffer[T] = {
      val __obj = js.Dynamic.literal(flush = flush.toJsFn, isEmpty = isEmpty.toJsFn, put = js.Any.fromFunction1((t0: T) => put(t0).runNow()), take = take.toJsFn)
      __obj.asInstanceOf[Buffer[T]]
    }
    
    extension [Self <: Buffer[?], T](x: Self & Buffer[T]) {
      
      inline def setFlush(value: CallbackTo[js.Array[T]]): Self = StObject.set(x, "flush", value.toJsFn)
      
      inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
      
      inline def setPut(value: T => Callback): Self = StObject.set(x, "put", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
      
      inline def setTake(value: CallbackTo[js.UndefOr[T]]): Self = StObject.set(x, "take", value.toJsFn)
    }
  }
  
  @js.native
  trait Channel[T /* <: NotUndefined */] extends StObject {
    
    /**
      * Closes the channel which means no more puts will be allowed. All pending
      * takers will be invoked with `END`.
      */
    def close(): Unit = js.native
    
    /**
      * Used to extract all buffered messages from the channel. The flush is
      * resolved using the following rules
      *
      * - If the channel is closed and there are no buffered messages, then
      *   `callback` is invoked with `END`
      * - Otherwise `callback` is invoked with all buffered messages.
      */
    def flush(cb: js.Function1[/* items */ js.Array[T] | END, Unit]): Unit = js.native
    
    /**
      * Used to put message on the buffer. The put will be handled using the
      * following rules
      *
      * - If the channel is closed, then the put will have no effect.
      * - If there are pending takers, then invoke the oldest taker with the
      *   message.
      * - Otherwise put the message on the underlying buffer
      */
    def put(message: T): Unit = js.native
    def put(message: END): Unit = js.native
    
    /**
      * Used to register a taker. The take is resolved using the following rules
      *
      * - If the channel has buffered messages, then `callback` will be invoked
      *   with the next message from the underlying buffer (using `buffer.take()`)
      * - If the channel is closed and there are no buffered messages, then
      *   `callback` is invoked with `END`
      * - Otherwise`callback` will be queued until a message is put into the
      *   channel
      */
    def take(cb: js.Function1[/* message */ T | END, Unit]): Unit = js.native
  }
  
  trait CombinatorEffect[T, E] extends StObject {
    
    @JSName("@@redux-saga/IO")
    var `@@redux-sagaSlashIO`: `true`
    
    var combinator: `true`
    
    var payload: CombinatorEffectDescriptor[E]
    
    var `type`: T
  }
  object CombinatorEffect {
    
    inline def apply[T, E](payload: CombinatorEffectDescriptor[E], `type`: T): CombinatorEffect[T, E] = {
      val __obj = js.Dynamic.literal(combinator = true, payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("@@redux-saga/IO")(true)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CombinatorEffect[T, E]]
    }
    
    extension [Self <: CombinatorEffect[?, ?], T, E](x: Self & (CombinatorEffect[T, E])) {
      
      inline def `set@@redux-sagaSlashIO`(value: `true`): Self = StObject.set(x, "@@redux-saga/IO", value.asInstanceOf[js.Any])
      
      inline def setCombinator(value: `true`): Self = StObject.set(x, "combinator", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: CombinatorEffectDescriptor[E]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadVarargs(value: E*): Self = StObject.set(x, "payload", js.Array(value*))
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type CombinatorEffectDescriptor[E] = StringDictionary[E] | js.Array[E]
  
  trait END extends StObject {
    
    var `type`: `@@redux-sagaSlashCHANNEL_END`
  }
  object END {
    
    inline def apply(): END = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("@@redux-saga/CHANNEL_END")
      __obj.asInstanceOf[END]
    }
    
    extension [Self <: END](x: Self) {
      
      inline def setType(value: `@@redux-sagaSlashCHANNEL_END`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Effect[T] = (SimpleEffect[T, Any]) | (CombinatorEffect[T, Any])
  
  type GuardPredicate[G /* <: T */, T] = js.Function1[/* arg */ T, /* is G */ Boolean]
  
  type NotUndefined = js.Object | Null
  
  type Pattern[T] = SubPattern[T] | js.Array[SubPattern[T]]
  
  type Predicate[T] = js.Function1[/* arg */ T, Boolean]
  
  type Saga[Args /* <: js.Array[Any] */] = js.Function1[/* args */ Args, IterableIterator[Any]]
  
  type SagaIterator = IterableIterator[StrictEffect[Any]]
  
  trait SimpleEffect[T, P] extends StObject {
    
    @JSName("@@redux-saga/IO")
    var `@@redux-sagaSlashIO`: `true`
    
    var combinator: `false`
    
    var payload: P
    
    var `type`: T
  }
  object SimpleEffect {
    
    inline def apply[T, P](payload: P, `type`: T): SimpleEffect[T, P] = {
      val __obj = js.Dynamic.literal(combinator = false, payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("@@redux-saga/IO")(true)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleEffect[T, P]]
    }
    
    extension [Self <: SimpleEffect[?, ?], T, P](x: Self & (SimpleEffect[T, P])) {
      
      inline def `set@@redux-sagaSlashIO`(value: `true`): Self = StObject.set(x, "@@redux-saga/IO", value.asInstanceOf[js.Any])
      
      inline def setCombinator(value: `false`): Self = StObject.set(x, "combinator", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: P): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type StrictCombinatorEffect[T] = CombinatorEffect[T, StrictEffect[T]]
  
  type StrictEffect[T] = (SimpleEffect[T, Any]) | Any
  
  @js.native
  trait StringableActionCreator[A /* <: Action[String] */] extends StObject {
    
    def apply(args: Any*): A = js.native
  }
  
  type SubPattern[T] = Predicate[T] | StringableActionCreator[Action[String]] | ActionType
  
  trait Task[T] extends StObject {
    
    /**
      * Cancels the task (If it is still running)
      */
    def cancel(): Unit
    
    /**
      * Returns task thrown error. `undefined` if task is still running
      */
    def error(): js.UndefOr[Any]
    
    /**
      * Returns true if the task has been cancelled
      */
    def isCancelled(): Boolean
    
    /**
      * Returns true if the task hasn't yet returned or thrown an error
      */
    def isRunning(): Boolean
    
    /**
      * Returns task return value. `undefined` if task is still running
      */
    def result[R](): js.UndefOr[R]
    
    def setContext[C /* <: js.Object */](props: Partial[C]): Unit
    
    /**
      * Returns a Promise which is either:
      * - resolved with task's return value
      * - rejected with task's thrown error
      */
    def toPromise[R](): js.Promise[R]
  }
  object Task {
    
    inline def apply[T](
      cancel: Callback,
      error: CallbackTo[js.UndefOr[Any]],
      isCancelled: CallbackTo[Boolean],
      isRunning: CallbackTo[Boolean],
      result: CallbackTo[js.UndefOr[Any]],
      setContext: Partial[Any] => Callback,
      toPromise: CallbackTo[js.Promise[Any]]
    ): Task[T] = {
      val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, error = error.toJsFn, isCancelled = isCancelled.toJsFn, isRunning = isRunning.toJsFn, result = result.toJsFn, setContext = js.Any.fromFunction1((t0: Partial[Any]) => setContext(t0).runNow()), toPromise = toPromise.toJsFn)
      __obj.asInstanceOf[Task[T]]
    }
    
    extension [Self <: Task[?], T](x: Self & Task[T]) {
      
      inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
      
      inline def setError(value: CallbackTo[js.UndefOr[Any]]): Self = StObject.set(x, "error", value.toJsFn)
      
      inline def setIsCancelled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isCancelled", value.toJsFn)
      
      inline def setIsRunning(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRunning", value.toJsFn)
      
      inline def setResult(value: CallbackTo[js.UndefOr[Any]]): Self = StObject.set(x, "result", value.toJsFn)
      
      inline def setSetContext(value: Partial[Any] => Callback): Self = StObject.set(x, "setContext", js.Any.fromFunction1((t0: Partial[Any]) => value(t0).runNow()))
      
      inline def setToPromise(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "toPromise", value.toJsFn)
    }
  }
}
