package typingsJapgolly.winrtUwp.global.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the events that notify an app of triggers to its edge-based UI. */
/* note: abstract class */ @JSGlobal("Windows.UI.Input.EdgeGesture")
@js.native
open class EdgeGesture ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.UI.Input.EdgeGesture
object EdgeGesture {
  
  @JSGlobal("Windows.UI.Input.EdgeGesture")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets an instance of the EdgeGesture class that is used to add and remove event delegate handlers for the current view.
    * @return The currently relevant instance of the EdgeGesture object.
    */
  /* static member */
  inline def getForCurrentView(): typingsJapgolly.winrtUwp.Windows.UI.Input.EdgeGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typingsJapgolly.winrtUwp.Windows.UI.Input.EdgeGesture]
}
