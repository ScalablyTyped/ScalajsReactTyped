package typingsJapgolly.winrtUwp.global.Windows.System

import typingsJapgolly.winrtUwp.Windows.Foundation.Point
import typingsJapgolly.winrtUwp.Windows.Foundation.Rect
import typingsJapgolly.winrtUwp.Windows.UI.Popups.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies options for user interface elements such as the application picker that can be invoked by this API. */
/* note: abstract class */ @JSGlobal("Windows.System.LauncherUIOptions")
@js.native
open class LauncherUIOptions ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.System.LauncherUIOptions {
  
  /** Gets or sets the point on the screen where the user opened a file or URI. */
  /* CompleteClass */
  var invocationPoint: Point = js.native
  
  /** Gets or sets the preferred placement of the Open With and Warning dialog boxes when starting a default app. */
  /* CompleteClass */
  var preferredPlacement: Placement = js.native
  
  /** Gets or sets the selection rectangle on the screen where the user opened a file or URI. */
  /* CompleteClass */
  var selectionRect: Rect = js.native
}
