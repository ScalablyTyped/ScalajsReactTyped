package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the data for a MessageAvailableChanged event. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Chat.RcsEndUserMessageAvailableEventArgs")
@js.native
open class RcsEndUserMessageAvailableEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Chat.RcsEndUserMessageAvailableEventArgs {
  
  /** Gets a Boolean value indicating if a new message is available. */
  /* CompleteClass */
  var isMessageAvailable: Boolean = js.native
  
  /** Gets the actual message to display, or empty if IsMessageAvailable is FALSE. */
  /* CompleteClass */
  var message: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Chat.RcsEndUserMessage = js.native
}
