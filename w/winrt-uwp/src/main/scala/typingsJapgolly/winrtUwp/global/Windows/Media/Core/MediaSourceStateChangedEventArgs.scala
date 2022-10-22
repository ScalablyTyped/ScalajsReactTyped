package typingsJapgolly.winrtUwp.global.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("Windows.Media.Core.MediaSourceStateChangedEventArgs")
@js.native
open class MediaSourceStateChangedEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Core.MediaSourceStateChangedEventArgs {
  
  /** Gets the new current state of the MediaSource . */
  /* CompleteClass */
  var newState: typingsJapgolly.winrtUwp.Windows.Media.Core.MediaSourceState = js.native
  
  /** Gets the previous state of the MediaSource before the state changed. */
  /* CompleteClass */
  var oldState: typingsJapgolly.winrtUwp.Windows.Media.Core.MediaSourceState = js.native
}
