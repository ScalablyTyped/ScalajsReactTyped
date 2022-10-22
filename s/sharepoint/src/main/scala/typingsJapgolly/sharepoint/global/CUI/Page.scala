package typingsJapgolly.sharepoint.global.CUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Page {
  
  @JSGlobal("CUI.Page.CommandDispatcher")
  @js.native
  open class CommandDispatcher ()
    extends StObject
       with typingsJapgolly.sharepoint.CUI.Page.CommandDispatcher {
    
    /* CompleteClass */
    override def executeCommand(commandId: String, properties: Any): Any = js.native
  }
  
  @JSGlobal("CUI.Page.FocusManager")
  @js.native
  open class FocusManager ()
    extends StObject
       with typingsJapgolly.sharepoint.CUI.Page.FocusManager {
    
    /* CompleteClass */
    override def canHandleCommand(commandId: String): Boolean = js.native
    
    /* CompleteClass */
    override def executeCommand(commandId: String, properties: Any): Any = js.native
    
    /* CompleteClass */
    override def getFocusedComponents(): js.Array[typingsJapgolly.sharepoint.CUI.Component] = js.native
    
    /* CompleteClass */
    override def handleCommand(commandId: String, properties: Any, sequenceNumber: Double): Boolean = js.native
    
    /* CompleteClass */
    override def releaseAllFoci(): Boolean = js.native
    
    /* CompleteClass */
    override def releaseFocusFromComponent(component: typingsJapgolly.sharepoint.CUI.Component): Any = js.native
    
    /* CompleteClass */
    override def requestFocusForComponent(component: typingsJapgolly.sharepoint.CUI.Component): Any = js.native
  }
  
  @JSGlobal("CUI.Page.PageComponent")
  @js.native
  open class PageComponent ()
    extends StObject
       with typingsJapgolly.sharepoint.CUI.Page.PageComponent {
    
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
    override def init(): scala.Unit = js.native
    
    /* CompleteClass */
    override def isFocusable(): Boolean = js.native
    
    /* CompleteClass */
    override def receiveFocus(): Boolean = js.native
    
    /* CompleteClass */
    override def yieldFocus(): Boolean = js.native
  }
  
  @JSGlobal("CUI.Page.PageManager")
  @js.native
  open class PageManager ()
    extends StObject
       with typingsJapgolly.sharepoint.CUI.Page.PageManager {
    
    /* CompleteClass */
    override def add_ribbonInited(value: js.Function0[scala.Unit]): Any = js.native
    
    /* CompleteClass */
    override def canHandleCommand(commandId: String): Boolean = js.native
    
    /* CompleteClass */
    override def get_commandDispatcher(): typingsJapgolly.sharepoint.CUI.Page.CommandDispatcher = js.native
    
    /* CompleteClass */
    override def get_focusManager(): typingsJapgolly.sharepoint.CUI.Page.FocusManager = js.native
    
    /* CompleteClass */
    override def get_undoManager(): typingsJapgolly.sharepoint.CUI.Page.UndoManager = js.native
    
    /* CompleteClass */
    override def handleCommand(commandId: String, properties: Any, sequenceNumber: Double): Boolean = js.native
  }
  object PageManager {
    
    @JSGlobal("CUI.Page.PageManager")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def createPageManager(): typingsJapgolly.sharepoint.CUI.Page.PageManager = ^.asInstanceOf[js.Dynamic].applyDynamic("createPageManager")().asInstanceOf[typingsJapgolly.sharepoint.CUI.Page.PageManager]
    
    /* static member */
    inline def getInstance(): typingsJapgolly.sharepoint.CUI.Page.PageManager = ^.asInstanceOf[js.Dynamic].applyDynamic("get_instance")().asInstanceOf[typingsJapgolly.sharepoint.CUI.Page.PageManager]
    
    /* static member */
    inline def initialize(): scala.Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")().asInstanceOf[scala.Unit]
  }
  
  @JSGlobal("CUI.Page.UndoManager")
  @js.native
  open class UndoManager ()
    extends StObject
       with typingsJapgolly.sharepoint.CUI.Page.UndoManager {
    
    /* CompleteClass */
    override def canHandleCommand(commandId: String): Boolean = js.native
    
    /* CompleteClass */
    override def handleCommand(commandId: String, properties: Any, sequenceNumber: Double): Boolean = js.native
  }
}
