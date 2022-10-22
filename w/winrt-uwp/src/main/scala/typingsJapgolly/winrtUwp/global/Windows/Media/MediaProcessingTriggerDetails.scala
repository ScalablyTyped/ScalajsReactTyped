package typingsJapgolly.winrtUwp.global.Windows.Media

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.ValueSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a media processing background task access to the set of arguments supplied in the call to MediaProcessingTrigger::RequestAsync . */
/* note: abstract class */ @JSGlobal("Windows.Media.MediaProcessingTriggerDetails")
@js.native
open class MediaProcessingTriggerDetails ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.MediaProcessingTriggerDetails {
  
  /** Gets a value set containing the arguments supplied in the call to MediaProcessingTrigger::RequestAsync . */
  /* CompleteClass */
  var arguments: ValueSet = js.native
}
