package typingsJapgolly.winrtUwp.global.Windows.Media.Protection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains a method that indicates whether a protection service has completed successfully. */
/* note: abstract class */ @JSGlobal("Windows.Media.Protection.MediaProtectionServiceCompletion")
@js.native
open class MediaProtectionServiceCompletion ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Protection.MediaProtectionServiceCompletion {
  
  /**
    * Indicates whether a protection service has completed successfully.
    * @param success Indicates the successful completion of a protection service.
    */
  /* CompleteClass */
  override def complete(success: Boolean): Unit = js.native
}
