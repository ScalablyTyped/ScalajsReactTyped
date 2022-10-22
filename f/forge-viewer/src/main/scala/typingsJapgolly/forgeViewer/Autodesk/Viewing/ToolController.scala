package typingsJapgolly.forgeViewer.Autodesk.Viewing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolController extends StObject {
  
  def activateTool(name: String): Boolean
  
  def deactivateTool(name: String): Boolean
  
  def deregisterTool(tool: Any): Boolean
  
  def getActiveTool(): ToolInterface
  
  def getActiveToolName(): String
  
  def getDefaultTool(): ToolInterface
  
  def getIsLocked(): Boolean
  
  def getTool(name: String): ToolInterface
  
  def getToolNames(): js.Array[String]
  
  def recordHomeView(): Unit
  
  def registerTool(tool: Any): Boolean
  
  def setIsLocked(state: Boolean): Boolean
}
object ToolController {
  
  inline def apply(
    activateTool: String => Boolean,
    deactivateTool: String => Boolean,
    deregisterTool: Any => Boolean,
    getActiveTool: CallbackTo[ToolInterface],
    getActiveToolName: CallbackTo[String],
    getDefaultTool: CallbackTo[ToolInterface],
    getIsLocked: CallbackTo[Boolean],
    getTool: String => ToolInterface,
    getToolNames: CallbackTo[js.Array[String]],
    recordHomeView: Callback,
    registerTool: Any => Boolean,
    setIsLocked: Boolean => Boolean
  ): ToolController = {
    val __obj = js.Dynamic.literal(activateTool = js.Any.fromFunction1(activateTool), deactivateTool = js.Any.fromFunction1(deactivateTool), deregisterTool = js.Any.fromFunction1(deregisterTool), getActiveTool = getActiveTool.toJsFn, getActiveToolName = getActiveToolName.toJsFn, getDefaultTool = getDefaultTool.toJsFn, getIsLocked = getIsLocked.toJsFn, getTool = js.Any.fromFunction1(getTool), getToolNames = getToolNames.toJsFn, recordHomeView = recordHomeView.toJsFn, registerTool = js.Any.fromFunction1(registerTool), setIsLocked = js.Any.fromFunction1(setIsLocked))
    __obj.asInstanceOf[ToolController]
  }
  
  extension [Self <: ToolController](x: Self) {
    
    inline def setActivateTool(value: String => Boolean): Self = StObject.set(x, "activateTool", js.Any.fromFunction1(value))
    
    inline def setDeactivateTool(value: String => Boolean): Self = StObject.set(x, "deactivateTool", js.Any.fromFunction1(value))
    
    inline def setDeregisterTool(value: Any => Boolean): Self = StObject.set(x, "deregisterTool", js.Any.fromFunction1(value))
    
    inline def setGetActiveTool(value: CallbackTo[ToolInterface]): Self = StObject.set(x, "getActiveTool", value.toJsFn)
    
    inline def setGetActiveToolName(value: CallbackTo[String]): Self = StObject.set(x, "getActiveToolName", value.toJsFn)
    
    inline def setGetDefaultTool(value: CallbackTo[ToolInterface]): Self = StObject.set(x, "getDefaultTool", value.toJsFn)
    
    inline def setGetIsLocked(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsLocked", value.toJsFn)
    
    inline def setGetTool(value: String => ToolInterface): Self = StObject.set(x, "getTool", js.Any.fromFunction1(value))
    
    inline def setGetToolNames(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getToolNames", value.toJsFn)
    
    inline def setRecordHomeView(value: Callback): Self = StObject.set(x, "recordHomeView", value.toJsFn)
    
    inline def setRegisterTool(value: Any => Boolean): Self = StObject.set(x, "registerTool", js.Any.fromFunction1(value))
    
    inline def setSetIsLocked(value: Boolean => Boolean): Self = StObject.set(x, "setIsLocked", js.Any.fromFunction1(value))
  }
}
