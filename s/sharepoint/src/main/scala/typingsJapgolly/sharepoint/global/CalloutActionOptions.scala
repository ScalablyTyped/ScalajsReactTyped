package typingsJapgolly.sharepoint.global

import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CalloutActionOptions")
@js.native
open class CalloutActionOptions ()
  extends StObject
     with typingsJapgolly.sharepoint.CalloutActionOptions {
  
  /* CompleteClass */
  var disabledTooltip: String = js.native
  
  /** Callback which returns if the action link is enabled */
  /* CompleteClass */
  override def isEnabledCallback(action: typingsJapgolly.sharepoint.CalloutAction): Boolean = js.native
  
  /** Callback which returns if the action link is visible */
  /* CompleteClass */
  override def isVisibleCallback(action: typingsJapgolly.sharepoint.CalloutAction): Boolean = js.native
  
  /** Submenu entries for the action. If defined, the action link click will popup the specified menu. */
  /* CompleteClass */
  var menuEntries: js.Array[typingsJapgolly.sharepoint.CalloutActionMenuEntry] = js.native
  
  /** Callback that is executed when the action link is clicked.
    @param event Standard javascript event object
    @param action The action object */
  /* CompleteClass */
  override def onClickCallback(event: Event, action: typingsJapgolly.sharepoint.CalloutAction): Any = js.native
  
  /** Text for the action link */
  /* CompleteClass */
  var text: String = js.native
  
  /* CompleteClass */
  var tooltip: String = js.native
}
