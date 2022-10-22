package typingsJapgolly.sharepoint.global.SP.Ribbon

import typingsJapgolly.sharepoint.SP.Application.UI.DefaultFormsInformation
import typingsJapgolly.sharepoint.SP.Application.UI.ViewSelectorGroups
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.Ribbon.GroupBoardWebPartPageComponent")
@js.native
open class GroupBoardWebPartPageComponent ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.Ribbon.ListViewWebPartPageComponent {
  
  /* CompleteClass */
  override def canHandleCommand(commandId: String): Boolean = js.native
  
  /* CompleteClass */
  override def getFocusedCommands(): js.Array[String] = js.native
  
  /* CompleteClass */
  override def getGlobalCommands(): js.Array[String] = js.native
  
  /* CompleteClass */
  override def getId(): String = js.native
  
  /* CompleteClass */
  override def handleCommand(commandId: String, properties: Any, sequenceNumber: Double): Boolean = js.native
  
  /* CompleteClass */
  override def init(): Unit = js.native
  
  /* CompleteClass */
  override def isFocusable(): Boolean = js.native
  
  /* CompleteClass */
  override def onDefaultFormsInformationRetrieveFailure(): Unit = js.native
  
  /* CompleteClass */
  override def onDefaultFormsInformationRetrieveSuccess(defaultForms: DefaultFormsInformation): Unit = js.native
  
  /* CompleteClass */
  override def onViewInformationReturned(viewGroups: ViewSelectorGroups): Unit = js.native
  
  /* CompleteClass */
  override def receiveFocus(): Boolean = js.native
  
  /* CompleteClass */
  override def yieldFocus(): Boolean = js.native
}
