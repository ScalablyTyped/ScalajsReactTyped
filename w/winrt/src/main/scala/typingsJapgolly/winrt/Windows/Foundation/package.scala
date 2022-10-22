package typingsJapgolly.winrt.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AsyncActionCompletedHandler = js.Function2[/* asyncInfo */ IAsyncAction, /* asyncStatus */ AsyncStatus, Unit]

type AsyncActionProgressHandler[TProgress] = js.Function2[
/* asyncInfo */ IAsyncActionWithProgress[TProgress], 
/* progressInfo */ TProgress, 
Unit]

type AsyncActionWithProgressCompletedHandler[TProgress] = js.Function2[
/* asyncInfo */ IAsyncActionWithProgress[TProgress], 
/* asyncStatus */ AsyncStatus, 
Unit]

type AsyncOperationCompletedHandler[TResult] = js.Function2[/* asyncInfo */ IAsyncOperation[TResult], /* asyncStatus */ AsyncStatus, Unit]

type AsyncOperationProgressHandler[TResult, TProgress] = js.Function2[
/* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], 
/* progressInfo */ TProgress, 
Unit]

type AsyncOperationWithProgressCompletedHandler[TResult, TProgress] = js.Function2[
/* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], 
/* asyncStatus */ AsyncStatus, 
Unit]

type EventHandler[T] = js.Function2[/* sender */ Any, /* args */ T, Unit]

type TypedEventHandler[TSender, TResult] = js.Function2[/* sender */ TSender, /* args */ TResult, Unit]
