package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data to the RemoteParticipantComposingChanged event. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Chat.RemoteParticipantComposingChangedEventArgs")
@js.native
open class RemoteParticipantComposingChangedEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Chat.RemoteParticipantComposingChangedEventArgs {
  
  /** Gets a Boolean value indicating if the remote participant is currently composing a message. */
  /* CompleteClass */
  var isComposing: Boolean = js.native
  
  /** Gets the address of the remote chat participant. */
  /* CompleteClass */
  var participantAddress: String = js.native
  
  /** Gets the ID for the message transport. */
  /* CompleteClass */
  var transportId: String = js.native
}
