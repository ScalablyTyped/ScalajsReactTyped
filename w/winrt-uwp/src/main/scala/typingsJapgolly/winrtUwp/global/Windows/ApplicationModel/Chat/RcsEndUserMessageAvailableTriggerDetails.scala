package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data to the background task about a new message. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Chat.RcsEndUserMessageAvailableTriggerDetails")
@js.native
open class RcsEndUserMessageAvailableTriggerDetails ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Chat.RcsEndUserMessageAvailableTriggerDetails {
  
  /** Gets the text of the new message. */
  /* CompleteClass */
  var text: String = js.native
  
  /** Gets the title of the new message. */
  /* CompleteClass */
  var title: String = js.native
}
