package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents progress information for a task at the time a progress update notification is sent. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskProgressEventArgs")
@js.native
open class BackgroundTaskProgressEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskProgressEventArgs {
  
  /** Gets the identifier of the background task instance for this progress status notification. */
  /* CompleteClass */
  var instanceId: String = js.native
  
  /** Gets progress status for a background task instance. */
  /* CompleteClass */
  var progress: Double = js.native
}
