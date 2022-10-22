package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background

import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** Represents a method that handles the cancellation of a background task. */
type BackgroundTaskCanceledEventHandler = js.Function1[
/* ev */ BackgroundTaskCancellationReason & WinRTEvent[IBackgroundTaskInstance], 
Unit]

/** Represents a method that handles completion events for a background task. */
type BackgroundTaskCompletedEventHandler = js.Function1[
/* ev */ BackgroundTaskCompletedEventArgs & WinRTEvent[BackgroundTaskRegistration], 
Unit]

/** Represents a method that handles progress update events for a background task. */
type BackgroundTaskProgressEventHandler = js.Function1[
/* ev */ BackgroundTaskProgressEventArgs & WinRTEvent[BackgroundTaskRegistration], 
Unit]
