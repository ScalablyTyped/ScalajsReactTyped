package typingsJapgolly.winrtUwp.global.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an object to be used by the MediaStreamSource.closed event to provide information to the application. */
/* note: abstract class */ @JSGlobal("Windows.Media.Core.MediaStreamSourceClosedRequest")
@js.native
open class MediaStreamSourceClosedRequest ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Core.MediaStreamSourceClosedRequest {
  
  /** Gets the reason why the media stream source was closed. */
  /* CompleteClass */
  var reason: typingsJapgolly.winrtUwp.Windows.Media.Core.MediaStreamSourceClosedReason = js.native
}
