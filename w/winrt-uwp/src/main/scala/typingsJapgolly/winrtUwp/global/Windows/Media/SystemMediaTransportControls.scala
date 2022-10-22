package typingsJapgolly.winrtUwp.global.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an object that enables integrate with the system media transport controls and support for media commands. */
/* note: abstract class */ @JSGlobal("Windows.Media.SystemMediaTransportControls")
@js.native
open class SystemMediaTransportControls ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.SystemMediaTransportControls
object SystemMediaTransportControls {
  
  @JSGlobal("Windows.Media.SystemMediaTransportControls")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The system transport controls for the current view.
    * @return The system transport controls for the current view.
    */
  /* static member */
  inline def getForCurrentView(): typingsJapgolly.winrtUwp.Windows.Media.SystemMediaTransportControls = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typingsJapgolly.winrtUwp.Windows.Media.SystemMediaTransportControls]
}
