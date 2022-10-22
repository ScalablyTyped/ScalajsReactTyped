package typingsJapgolly.sharepoint.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CalloutAction")
@js.native
open class CalloutAction protected ()
  extends StObject
     with typingsJapgolly.sharepoint.CalloutAction {
  def this(options: typingsJapgolly.sharepoint.CalloutActionOptions) = this()
  
  /* CompleteClass */
  override def getDisabledToolTip(): String = js.native
  
  /* CompleteClass */
  override def getIsDisabledCallback(action: typingsJapgolly.sharepoint.CalloutAction): Boolean = js.native
  
  /* CompleteClass */
  override def getIsMenu(): Boolean = js.native
  
  /* CompleteClass */
  override def getIsVisibleCallback(action: typingsJapgolly.sharepoint.CalloutAction): Boolean = js.native
  
  /* CompleteClass */
  override def getMenuEntries(): js.Array[typingsJapgolly.sharepoint.CalloutActionMenuEntry] = js.native
  
  /* CompleteClass */
  override def getOnClickCallback(event: Any, action: typingsJapgolly.sharepoint.CalloutAction): Any = js.native
  
  /* CompleteClass */
  override def getText(): String = js.native
  
  /* CompleteClass */
  override def getToolTop(): String = js.native
  
  /* CompleteClass */
  override def isEnabled(): Boolean = js.native
  
  /* CompleteClass */
  override def isVisible(): Boolean = js.native
  
  /* CompleteClass */
  override def render(): Unit = js.native
  
  /* CompleteClass */
  override def set(options: typingsJapgolly.sharepoint.CalloutActionOptions): Unit = js.native
}
