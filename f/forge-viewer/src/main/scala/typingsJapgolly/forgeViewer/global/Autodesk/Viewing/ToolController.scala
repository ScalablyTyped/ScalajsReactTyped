package typingsJapgolly.forgeViewer.global.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Autodesk.Viewing.ToolController")
@js.native
open class ToolController ()
  extends StObject
     with typingsJapgolly.forgeViewer.Autodesk.Viewing.ToolController {
  
  /* CompleteClass */
  override def activateTool(name: String): Boolean = js.native
  
  /* CompleteClass */
  override def deactivateTool(name: String): Boolean = js.native
  
  /* CompleteClass */
  override def deregisterTool(tool: Any): Boolean = js.native
  
  /* CompleteClass */
  override def getActiveTool(): typingsJapgolly.forgeViewer.Autodesk.Viewing.ToolInterface = js.native
  
  /* CompleteClass */
  override def getActiveToolName(): String = js.native
  
  /* CompleteClass */
  override def getDefaultTool(): typingsJapgolly.forgeViewer.Autodesk.Viewing.ToolInterface = js.native
  
  /* CompleteClass */
  override def getIsLocked(): Boolean = js.native
  
  /* CompleteClass */
  override def getTool(name: String): typingsJapgolly.forgeViewer.Autodesk.Viewing.ToolInterface = js.native
  
  /* CompleteClass */
  override def getToolNames(): js.Array[String] = js.native
  
  /* CompleteClass */
  override def recordHomeView(): Unit = js.native
  
  /* CompleteClass */
  override def registerTool(tool: Any): Boolean = js.native
  
  /* CompleteClass */
  override def setIsLocked(state: Boolean): Boolean = js.native
}
