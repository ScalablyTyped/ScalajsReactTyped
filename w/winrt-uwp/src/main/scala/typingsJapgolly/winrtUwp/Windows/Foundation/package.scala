package typingsJapgolly.winrtUwp.Windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Foundation {
  /** Represents a method that handles the completed event of an asynchronous action. */
  type AsyncActionCompletedHandler = js.Function2[
    /* asyncInfo */ typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncAction, 
    /* asyncStatus */ typingsJapgolly.winrtUwp.Windows.Foundation.AsyncStatus, 
    scala.Unit
  ]
  /** Represents a method that handles progress update events of an asynchronous action that provides progress updates. */
  type AsyncActionProgressHandler[TProgress] = js.Function2[
    /* asyncInfo */ typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncActionWithProgress[TProgress], 
    /* progressInfo */ TProgress, 
    scala.Unit
  ]
  /** Represents a method that handles the completed event of an asynchronous action that provides progress updates. */
  type AsyncActionWithProgressCompletedHandler[TProgress] = js.Function2[
    /* asyncInfo */ typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncActionWithProgress[TProgress], 
    /* asyncStatus */ typingsJapgolly.winrtUwp.Windows.Foundation.AsyncStatus, 
    scala.Unit
  ]
  /** Represents a method that handles the completed event of an asynchronous operation. */
  type AsyncOperationCompletedHandler[TResult] = js.Function2[
    /* asyncInfo */ typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncOperation[TResult], 
    /* asyncStatus */ typingsJapgolly.winrtUwp.Windows.Foundation.AsyncStatus, 
    scala.Unit
  ]
  /** Represents a method that handles progress update events of an asynchronous operation that provides progress updates. */
  type AsyncOperationProgressHandler[TResult, TProgress] = js.Function2[
    /* asyncInfo */ typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncOperationWithProgress[TResult, TProgress], 
    /* progressInfo */ TProgress, 
    scala.Unit
  ]
  /** Represents a method that handles the completed event of an asynchronous operation that provides progress updates. */
  type AsyncOperationWithProgressCompletedHandler[TResult, TProgress] = js.Function2[
    /* asyncInfo */ typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncOperationWithProgress[TResult, TProgress], 
    /* asyncStatus */ typingsJapgolly.winrtUwp.Windows.Foundation.AsyncStatus, 
    scala.Unit
  ]
  /** Represents a method that handles the completed event of a deferred action. */
  type DeferralCompletedHandler = js.Function0[scala.Unit]
  /** Represents a method that handles general events. */
  type EventHandler[T] = js.Function1[/* ev */ T with typingsJapgolly.winrtUwp.Windows.WinRTEvent[_], scala.Unit]
  type IPromiseWithIAsyncAction = typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithOperation[scala.Unit, typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncAction]
  type IPromiseWithIAsyncActionWithProgress[TProgress] = typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithOperation[
    scala.Unit, 
    typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncActionWithProgress[TProgress]
  ]
  type IPromiseWithIAsyncOperation[TResult] = typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithOperation[TResult, typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncOperation[TResult]]
  type IPromiseWithIAsyncOperationWithProgress[TResult, TProgress] = typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithOperation[
    TResult, 
    typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncOperationWithProgress[TResult, TProgress]
  ]
  /** Represents a method that handles general events. */
  type TypedEventHandler[TSender, TResult] = js.Function1[
    /* ev */ TResult with typingsJapgolly.winrtUwp.Windows.WinRTEvent[TSender], 
    scala.Unit
  ]
}
