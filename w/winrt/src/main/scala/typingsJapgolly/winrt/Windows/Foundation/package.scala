package typingsJapgolly.winrt.Windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Foundation {
  type AsyncActionCompletedHandler = js.Function2[
    /* asyncInfo */ typingsJapgolly.winrt.Windows.Foundation.IAsyncAction, 
    /* asyncStatus */ typingsJapgolly.winrt.Windows.Foundation.AsyncStatus, 
    scala.Unit
  ]
  type AsyncActionProgressHandler[TProgress] = js.Function2[
    /* asyncInfo */ typingsJapgolly.winrt.Windows.Foundation.IAsyncActionWithProgress[TProgress], 
    /* progressInfo */ TProgress, 
    scala.Unit
  ]
  type AsyncActionWithProgressCompletedHandler[TProgress] = js.Function2[
    /* asyncInfo */ typingsJapgolly.winrt.Windows.Foundation.IAsyncActionWithProgress[TProgress], 
    /* asyncStatus */ typingsJapgolly.winrt.Windows.Foundation.AsyncStatus, 
    scala.Unit
  ]
  type AsyncOperationCompletedHandler[TResult] = js.Function2[
    /* asyncInfo */ typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation[TResult], 
    /* asyncStatus */ typingsJapgolly.winrt.Windows.Foundation.AsyncStatus, 
    scala.Unit
  ]
  type AsyncOperationProgressHandler[TResult, TProgress] = js.Function2[
    /* asyncInfo */ typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress[TResult, TProgress], 
    /* progressInfo */ TProgress, 
    scala.Unit
  ]
  type AsyncOperationWithProgressCompletedHandler[TResult, TProgress] = js.Function2[
    /* asyncInfo */ typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress[TResult, TProgress], 
    /* asyncStatus */ typingsJapgolly.winrt.Windows.Foundation.AsyncStatus, 
    scala.Unit
  ]
  type EventHandler[T] = js.Function2[/* sender */ js.Any, /* args */ T, scala.Unit]
  type TypedEventHandler[TSender, TResult] = js.Function2[/* sender */ TSender, /* args */ TResult, scala.Unit]
}
