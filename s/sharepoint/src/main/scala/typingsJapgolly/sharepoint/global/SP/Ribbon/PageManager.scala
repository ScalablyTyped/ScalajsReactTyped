package typingsJapgolly.sharepoint.global.SP.Ribbon

import typingsJapgolly.sharepoint.CUI.Component
import typingsJapgolly.sharepoint.CUI.Page.CommandDispatcher
import typingsJapgolly.sharepoint.CUI.Page.FocusManager
import typingsJapgolly.sharepoint.CUI.Page.UndoManager
import typingsJapgolly.sharepoint.CUI.Root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.Ribbon.PageManager")
@js.native
open class PageManager ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.Ribbon.PageManager {
  
  /* CompleteClass */
  override def addPageComponent(component: Component): Unit = js.native
  
  /* CompleteClass */
  override def add_ribbonInited(value: js.Function0[Unit]): Any = js.native
  
  /* CompleteClass */
  override def canHandleCommand(commandId: String): Boolean = js.native
  
  /* CompleteClass */
  override def get_commandDispatcher(): CommandDispatcher = js.native
  
  /* CompleteClass */
  override def get_focusManager(): FocusManager = js.native
  
  /* CompleteClass */
  override def get_ribbon(): typingsJapgolly.sharepoint.SP.Ribbon.Ribbon = js.native
  
  /* CompleteClass */
  override def get_undoManager(): UndoManager = js.native
  
  /* CompleteClass */
  override def handleCommand(commandId: String, properties: Any, sequenceNumber: Double): Boolean = js.native
  
  /* CompleteClass */
  override def isRootCommandEnabled(commandId: String, root: Root): Boolean = js.native
  
  /* CompleteClass */
  override def onRootRefreshed(root: Root): Unit = js.native
  
  /* CompleteClass */
  override def removePageComponent(component: Component): Unit = js.native
}
object PageManager {
  
  @JSGlobal("SP.Ribbon.PageManager")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getInstance(): typingsJapgolly.sharepoint.SP.Ribbon.PageManager = ^.asInstanceOf[js.Dynamic].applyDynamic("get_instance")().asInstanceOf[typingsJapgolly.sharepoint.SP.Ribbon.PageManager]
}
