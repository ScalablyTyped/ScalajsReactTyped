package typingsJapgolly.winrtUwp.global.Windows.Media.Protection.PlayReady

import typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady.IPlayReadyServiceRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Receives multiple service request objects that are necessary to enable the playback ability for a given content header. */
/* note: abstract class */ @JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyContentResolver")
@js.native
open class PlayReadyContentResolver ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyContentResolver
object PlayReadyContentResolver {
  
  @JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyContentResolver")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Proactively initiates the service request chain for a given content header.
    * @param contentHeader Content header for the content the app wants to resolve all necessary service request operations.
    * @return The first service request operation required to resolve the content.
    */
  /* static member */
  inline def serviceRequest(contentHeader: typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyContentHeader): IPlayReadyServiceRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("serviceRequest")(contentHeader.asInstanceOf[js.Any]).asInstanceOf[IPlayReadyServiceRequest]
}
