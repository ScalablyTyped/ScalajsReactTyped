package typingsJapgolly.winrtUwp.global.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages an app navigation operation. */
/* note: abstract class */ @JSGlobal("Windows.UI.WebUI.WebUINavigatedOperation")
@js.native
open class WebUINavigatedOperation ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.UI.WebUI.WebUINavigatedOperation {
  
  /**
    * Requests that the completion of app navigation be delayed.
    * @return The navigated deferral object.
    */
  /* CompleteClass */
  override def getDeferral(): typingsJapgolly.winrtUwp.Windows.UI.WebUI.WebUINavigatedDeferral = js.native
}
