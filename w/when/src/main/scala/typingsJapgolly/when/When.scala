package typingsJapgolly.when

import typingsJapgolly.when.When._underscore.Fn0
import typingsJapgolly.when.When._underscore.Fn1
import typingsJapgolly.when.When._underscore.Fn2
import typingsJapgolly.when.When._underscore.Fn3
import typingsJapgolly.when.When._underscore.Fn4
import typingsJapgolly.when.When._underscore.Fn5
import typingsJapgolly.when.whenStrings.fulfilled
import typingsJapgolly.when.whenStrings.pending
import typingsJapgolly.when.whenStrings.rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object When {
  
  @js.native
  trait Deferred[T] extends StObject {
    
    def notify(update: Any): Unit = js.native
    
    var promise: Promise[T] = js.native
    
    def reject(reason: Any): Unit = js.native
    
    def resolve(): Unit = js.native
    def resolve(value: T): Unit = js.native
    def resolve(value: Promise[T]): Unit = js.native
  }
  
  /**
    * Describes the outcome of a promise.
    * state may be one of:
    * "fulfilled" - the promise has resolved
    * "rejected" - the promise has rejected
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.when.When.FulfilledDescriptor[T]
    - typingsJapgolly.when.When.RejectedDescriptor
  */
  trait Descriptor[T] extends StObject
  object Descriptor {
    
    inline def FulfilledDescriptor[T](value: T): typingsJapgolly.when.When.FulfilledDescriptor[T] = {
      val __obj = js.Dynamic.literal(state = "fulfilled", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.when.When.FulfilledDescriptor[T]]
    }
    
    inline def RejectedDescriptor(reason: Any): typingsJapgolly.when.When.RejectedDescriptor = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], state = "rejected")
      __obj.asInstanceOf[typingsJapgolly.when.When.RejectedDescriptor]
    }
  }
  
  trait FulfilledDescriptor[T]
    extends StObject
       with Descriptor[T]
       with Snapshot[T] {
    
    var state: fulfilled
    
    var value: T
  }
  object FulfilledDescriptor {
    
    inline def apply[T](value: T): FulfilledDescriptor[T] = {
      val __obj = js.Dynamic.literal(state = "fulfilled", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FulfilledDescriptor[T]]
    }
    
    extension [Self <: FulfilledDescriptor[?], T](x: Self & FulfilledDescriptor[T]) {
      
      inline def setState(value: fulfilled): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PendingDescriptor
    extends StObject
       with Snapshot[Any] {
    
    var state: pending
  }
  object PendingDescriptor {
    
    inline def apply(): PendingDescriptor = {
      val __obj = js.Dynamic.literal(state = "pending")
      __obj.asInstanceOf[PendingDescriptor]
    }
    
    extension [Self <: PendingDescriptor](x: Self) {
      
      inline def setState(value: pending): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Promise[T] extends StObject {
    
    def `catch`[U](): Promise[U] = js.native
    // Make sure you test any usage of these overloads, exceptionType must
    // be a constructor with prototype set to an instance of Error.
    def `catch`[U](exceptionType: Any): Promise[U] = js.native
    def `catch`[U](exceptionType: Any, onRejected: js.Function1[/* reason */ Any, U | Promise[U]]): Promise[U] = js.native
    def `catch`[U](
      filter: js.Function1[/* reason */ Any, Boolean],
      onRejected: js.Function1[/* reason */ Any, U | Promise[U]]
    ): Promise[U] = js.native
    def `catch`[U](onRejected: js.Function1[/* reason */ Any, Boolean | Promise[U] | U]): Promise[U] = js.native
    
    def delay(milliseconds: Double): Promise[T] = js.native
    
    def done[U](): Unit = js.native
    def done[U](onFulfilled: js.Function1[/* value */ T, Unit]): Unit = js.native
    def done[U](onFulfilled: js.Function1[/* value */ T, Unit], onRejected: js.Function1[/* reason */ Any, Unit]): Unit = js.native
    def done[U](onFulfilled: Unit, onRejected: js.Function1[/* reason */ Any, Unit]): Unit = js.native
    
    def `else`(value: T): Promise[T] = js.native
    
    def ensure(onFulfilledOrRejected: js.Function): Promise[T] = js.native
    
    def `finally`(onFulfilledOrRejected: js.Function): Promise[T] = js.native
    
    def fold[U, V](combine: js.Function2[/* value1 */ T, /* value2 */ V, U | Promise[U]], value2: V): Promise[U] = js.native
    def fold[U, V](combine: js.Function2[/* value1 */ T, /* value2 */ V, U | Promise[U]], value2: Promise[V]): Promise[U] = js.native
    
    def inspect(): Snapshot[T] = js.native
    
    def orElse(value: T): Promise[T] = js.native
    
    def otherwise[U](): Promise[U] = js.native
    // Make sure you test any usage of these overloads, exceptionType must
    // be a constructor with prototype set to an instance of Error.
    def otherwise[U](exceptionType: Any): Promise[U] = js.native
    def otherwise[U](exceptionType: Any, onRejected: js.Function1[/* reason */ Any, U | Promise[U]]): Promise[U] = js.native
    def otherwise[U](onRejected: js.Function1[/* reason */ Any, Boolean | Promise[U] | U]): Promise[U] = js.native
    def otherwise[U](
      predicate: js.Function1[/* reason */ Any, Boolean],
      onRejected: js.Function1[/* reason */ Any, U | Promise[U]]
    ): Promise[U] = js.native
    
    def spread[T](onFulfilled: Fn0[Promise[T] | T]): Promise[T] = js.native
    def spread[A1, T](onFulfilled: Fn1[A1, Promise[T] | T]): Promise[T] = js.native
    def spread[A1, A2, T](onFulfilled: Fn2[A1, A2, Promise[T] | T]): Promise[T] = js.native
    def spread[A1, A2, A3, T](onFulfilled: Fn3[A1, A2, A3, Promise[T] | T]): Promise[T] = js.native
    def spread[A1, A2, A3, A4, T](onFulfilled: Fn4[A1, A2, A3, A4, Promise[T] | T]): Promise[T] = js.native
    def spread[A1, A2, A3, A4, A5, T](onFulfilled: Fn5[A1, A2, A3, A4, A5, Promise[T] | T]): Promise[T] = js.native
    
    def tap(onFulfilledSideEffect: js.Function1[/* value */ T, Unit]): Promise[T] = js.native
    
    def `then`(): Promise[T] = js.native
    def `then`(onFulfilled: js.Function1[/* value */ T, T | Thenable[T]]): Promise[T] = js.native
    def `then`(
      onFulfilled: js.Function1[/* value */ T, T | Thenable[T]],
      onRejected: js.Function1[/* reason */ Any, T | Thenable[T]]
    ): Promise[T] = js.native
    def `then`(
      onFulfilled: js.Function1[/* value */ T, T | Thenable[T]],
      onRejected: js.Function1[/* reason */ Any, T | Thenable[T]],
      onProgress: js.Function1[/* update */ Any, Unit]
    ): Promise[T] = js.native
    def `then`(
      onFulfilled: js.Function1[/* value */ T, T | Thenable[T]],
      onRejected: Null,
      onProgress: js.Function1[/* update */ Any, Unit]
    ): Promise[T] = js.native
    def `then`(
      onFulfilled: js.Function1[/* value */ T, T | Thenable[T]],
      onRejected: Unit,
      onProgress: js.Function1[/* update */ Any, Unit]
    ): Promise[T] = js.native
    def `then`(onFulfilled: Null, onRejected: js.Function1[/* reason */ Any, T | Thenable[T]]): Promise[T] = js.native
    def `then`(
      onFulfilled: Null,
      onRejected: js.Function1[/* reason */ Any, T | Thenable[T]],
      onProgress: js.Function1[/* update */ Any, Unit]
    ): Promise[T] = js.native
    def `then`(onFulfilled: Null, onRejected: Null, onProgress: js.Function1[/* update */ Any, Unit]): Promise[T] = js.native
    def `then`(onFulfilled: Null, onRejected: Unit, onProgress: js.Function1[/* update */ Any, Unit]): Promise[T] = js.native
    def `then`(onFulfilled: Unit, onRejected: js.Function1[/* reason */ Any, T | Thenable[T]]): Promise[T] = js.native
    def `then`(
      onFulfilled: Unit,
      onRejected: js.Function1[/* reason */ Any, T | Thenable[T]],
      onProgress: js.Function1[/* update */ Any, Unit]
    ): Promise[T] = js.native
    def `then`(onFulfilled: Unit, onRejected: Null, onProgress: js.Function1[/* update */ Any, Unit]): Promise[T] = js.native
    def `then`(onFulfilled: Unit, onRejected: Unit, onProgress: js.Function1[/* update */ Any, Unit]): Promise[T] = js.native
    @JSName("then")
    def then_TResult[TResult](onFulfilled: js.Function1[/* value */ T, TResult | Thenable[TResult]]): Promise[TResult] = js.native
    @JSName("then")
    def then_TResult[TResult](
      onFulfilled: js.Function1[/* value */ T, T | TResult | (Thenable[T | TResult])],
      onRejected: js.Function1[/* reason */ Any, TResult | Thenable[TResult]]
    ): Promise[TResult] = js.native
    @JSName("then")
    def then_TResult[TResult](
      onFulfilled: js.Function1[/* value */ T, T | TResult | (Thenable[T | TResult])],
      onRejected: js.Function1[/* reason */ Any, TResult | Thenable[TResult]],
      onProgress: js.Function1[/* update */ Any, Unit]
    ): Promise[TResult] = js.native
    @JSName("then")
    def then_TResult[TResult](
      onFulfilled: js.Function1[/* value */ T, TResult | Thenable[TResult]],
      onRejected: Null,
      onProgress: js.Function1[/* update */ Any, Unit]
    ): Promise[TResult] = js.native
    @JSName("then")
    def then_TResult[TResult](
      onFulfilled: js.Function1[/* value */ T, TResult | Thenable[TResult]],
      onRejected: Unit,
      onProgress: js.Function1[/* update */ Any, Unit]
    ): Promise[TResult] = js.native
    @JSName("then")
    def then_TResult[TResult](onFulfilled: Null, onRejected: js.Function1[/* reason */ Any, TResult | Thenable[TResult]]): Promise[T | TResult] = js.native
    @JSName("then")
    def then_TResult[TResult](
      onFulfilled: Null,
      onRejected: js.Function1[/* reason */ Any, TResult | Thenable[TResult]],
      onProgress: js.Function1[/* update */ Any, Unit]
    ): Promise[T | TResult] = js.native
    @JSName("then")
    def then_TResult[TResult](onFulfilled: Unit, onRejected: js.Function1[/* reason */ Any, TResult | Thenable[TResult]]): Promise[T | TResult] = js.native
    @JSName("then")
    def then_TResult[TResult](
      onFulfilled: Unit,
      onRejected: js.Function1[/* reason */ Any, TResult | Thenable[TResult]],
      onProgress: js.Function1[/* update */ Any, Unit]
    ): Promise[T | TResult] = js.native
    @JSName("then")
    def then_TResult1TResult2[TResult1, TResult2](
      onFulfilled: js.Function1[/* value */ T, TResult1 | Thenable[TResult1]],
      onRejected: js.Function1[/* reason */ Any, TResult2 | Thenable[TResult2]]
    ): Promise[TResult1 | TResult2] = js.native
    @JSName("then")
    def then_TResult1TResult2[TResult1, TResult2](
      onFulfilled: js.Function1[/* value */ T, TResult1 | Thenable[TResult1]],
      onRejected: js.Function1[/* reason */ Any, TResult2 | Thenable[TResult2]],
      onProgress: js.Function1[/* update */ Any, Unit]
    ): Promise[TResult1 | TResult2] = js.native
    
    def timeout(milliseconds: Double): Promise[T] = js.native
    def timeout(milliseconds: Double, reason: Any): Promise[T] = js.native
    
    def `with`(thisArg: Any): Promise[T] = js.native
    
    def withThis(thisArg: Any): Promise[T] = js.native
    
    def `yield`[U](value: U): Promise[U] = js.native
    def `yield`[U](value: Promise[U]): Promise[U] = js.native
  }
  
  trait RejectedDescriptor
    extends StObject
       with Descriptor[Any]
       with Snapshot[Any] {
    
    var reason: Any
    
    var state: rejected
  }
  object RejectedDescriptor {
    
    inline def apply(reason: Any): RejectedDescriptor = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], state = "rejected")
      __obj.asInstanceOf[RejectedDescriptor]
    }
    
    extension [Self <: RejectedDescriptor](x: Self) {
      
      inline def setReason(value: Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setState(value: rejected): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Snapshot which describes the status of a promise.
    * state may be one of:
    * "fulfilled" - the promise has resolved
    * "rejected" - the promise has rejected
    * "pending" - the promise is still pending to resolve/reject
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.when.When.FulfilledDescriptor[T]
    - typingsJapgolly.when.When.RejectedDescriptor
    - typingsJapgolly.when.When.PendingDescriptor
  */
  trait Snapshot[T] extends StObject
  object Snapshot {
    
    inline def FulfilledDescriptor[T](value: T): typingsJapgolly.when.When.FulfilledDescriptor[T] = {
      val __obj = js.Dynamic.literal(state = "fulfilled", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.when.When.FulfilledDescriptor[T]]
    }
    
    inline def PendingDescriptor(): typingsJapgolly.when.When.PendingDescriptor = {
      val __obj = js.Dynamic.literal(state = "pending")
      __obj.asInstanceOf[typingsJapgolly.when.When.PendingDescriptor]
    }
    
    inline def RejectedDescriptor(reason: Any): typingsJapgolly.when.When.RejectedDescriptor = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], state = "rejected")
      __obj.asInstanceOf[typingsJapgolly.when.When.RejectedDescriptor]
    }
  }
  
  @js.native
  trait Thenable[T] extends StObject {
    
    def `then`[U](): Thenable[U] = js.native
    def `then`[U](onFulfilled: js.Function1[/* value */ T, U]): Thenable[U] = js.native
    def `then`[U](onFulfilled: js.Function1[/* value */ T, U], onRejected: js.Function1[/* reason */ Any, U]): Thenable[U] = js.native
    def `then`[U](onFulfilled: Unit, onRejected: js.Function1[/* reason */ Any, U]): Thenable[U] = js.native
  }
  
  // Helper interfaces
  object _underscore {
    
    type Fn0[T] = js.Function0[T]
    
    type Fn1[A1, T] = js.Function1[/* a1 */ A1, T]
    
    type Fn2[A1, A2, T] = js.Function2[/* a1 */ A1, /* a2 */ A2, T]
    
    type Fn3[A1, A2, A3, T] = js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, T]
    
    type Fn4[A1, A2, A3, A4, T] = js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, T]
    
    type Fn5[A1, A2, A3, A4, A5, T] = js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, T]
    
    type Fn6[A1, A2, A3, A4, A5, A6, T] = js.Function6[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, /* a6 */ A6, T]
    
    type LiftedFn0[T] = Fn0[Promise[T]]
    
    type LiftedFn1[A1, T] = Fn1[A1 | Promise[A1], Promise[T]]
    
    type LiftedFn2[A1, A2, T] = Fn2[A1 | Promise[A1], A2 | Promise[A2], Promise[T]]
    
    type LiftedFn3[A1, A2, A3, T] = Fn3[A1 | Promise[A1], A2 | Promise[A2], A3 | Promise[A3], Promise[T]]
    
    type LiftedFn4[A1, A2, A3, A4, T] = Fn4[A1 | Promise[A1], A2 | Promise[A2], A3 | Promise[A3], A4 | Promise[A4], Promise[T]]
    
    type LiftedFn5[A1, A2, A3, A4, A5, T] = Fn5[
        A1 | Promise[A1], 
        A2 | Promise[A2], 
        A3 | Promise[A3], 
        A4 | Promise[A4], 
        A5 | Promise[A5], 
        Promise[T]
      ]
    
    type NodeCallback[T] = js.Function2[/* err */ Any, /* result */ T, Unit]
    
    type NodeFn0[T] = Fn1[NodeCallback[T], Unit]
    
    type NodeFn1[A1, T] = Fn2[A1, NodeCallback[T], Unit]
    
    type NodeFn2[A1, A2, T] = Fn3[A1, A2, NodeCallback[T], Unit]
    
    type NodeFn3[A1, A2, A3, T] = Fn4[A1, A2, A3, NodeCallback[T], Unit]
    
    type NodeFn4[A1, A2, A3, A4, T] = Fn5[A1, A2, A3, A4, NodeCallback[T], Unit]
    
    type NodeFn5[A1, A2, A3, A4, A5, T] = Fn6[A1, A2, A3, A4, A5, NodeCallback[T], Unit]
  }
}
