package typingsJapgolly.winrtUwp.global.Windows.UI.WebUI

import typingsJapgolly.winrtUwp.Windows.UI.WebUI.IWebUIBackgroundTaskInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an instance of a background task that has been triggered to run. */
/* note: abstract class */ @JSGlobal("Windows.UI.WebUI.WebUIBackgroundTaskInstance")
@js.native
open class WebUIBackgroundTaskInstance ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.UI.WebUI.WebUIBackgroundTaskInstance
object WebUIBackgroundTaskInstance {
  
  @JSGlobal("Windows.UI.WebUI.WebUIBackgroundTaskInstance")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets the current background task. */
  /* static member */
  @JSGlobal("Windows.UI.WebUI.WebUIBackgroundTaskInstance.current")
  @js.native
  def current: IWebUIBackgroundTaskInstance = js.native
  inline def current_=(x: IWebUIBackgroundTaskInstance): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
}
