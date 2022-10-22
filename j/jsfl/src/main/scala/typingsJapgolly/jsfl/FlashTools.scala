package typingsJapgolly.jsfl

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashTools extends StObject {
  
  var activeTool: Any
  
  var altIsDown: Any
  
  def constraintPoint(): Any
  
  var ctlIsDown: Any
  
  def getKeyDown(): Any
  
  var mouseIsDown: Any
  
  var penDownLoc: Any
  
  var penLoc: Any
  
  def setCreatingBbox(): Any
  
  def setCursor(): Any
  
  var shiftIsDown: Any
  
  def snapPoint(): Any
  
  var toolObjs: Any
}
object FlashTools {
  
  inline def apply(
    activeTool: Any,
    altIsDown: Any,
    constraintPoint: CallbackTo[Any],
    ctlIsDown: Any,
    getKeyDown: CallbackTo[Any],
    mouseIsDown: Any,
    penDownLoc: Any,
    penLoc: Any,
    setCreatingBbox: CallbackTo[Any],
    setCursor: CallbackTo[Any],
    shiftIsDown: Any,
    snapPoint: CallbackTo[Any],
    toolObjs: Any
  ): FlashTools = {
    val __obj = js.Dynamic.literal(activeTool = activeTool.asInstanceOf[js.Any], altIsDown = altIsDown.asInstanceOf[js.Any], constraintPoint = constraintPoint.toJsFn, ctlIsDown = ctlIsDown.asInstanceOf[js.Any], getKeyDown = getKeyDown.toJsFn, mouseIsDown = mouseIsDown.asInstanceOf[js.Any], penDownLoc = penDownLoc.asInstanceOf[js.Any], penLoc = penLoc.asInstanceOf[js.Any], setCreatingBbox = setCreatingBbox.toJsFn, setCursor = setCursor.toJsFn, shiftIsDown = shiftIsDown.asInstanceOf[js.Any], snapPoint = snapPoint.toJsFn, toolObjs = toolObjs.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashTools]
  }
  
  extension [Self <: FlashTools](x: Self) {
    
    inline def setActiveTool(value: Any): Self = StObject.set(x, "activeTool", value.asInstanceOf[js.Any])
    
    inline def setAltIsDown(value: Any): Self = StObject.set(x, "altIsDown", value.asInstanceOf[js.Any])
    
    inline def setConstraintPoint(value: CallbackTo[Any]): Self = StObject.set(x, "constraintPoint", value.toJsFn)
    
    inline def setCtlIsDown(value: Any): Self = StObject.set(x, "ctlIsDown", value.asInstanceOf[js.Any])
    
    inline def setGetKeyDown(value: CallbackTo[Any]): Self = StObject.set(x, "getKeyDown", value.toJsFn)
    
    inline def setMouseIsDown(value: Any): Self = StObject.set(x, "mouseIsDown", value.asInstanceOf[js.Any])
    
    inline def setPenDownLoc(value: Any): Self = StObject.set(x, "penDownLoc", value.asInstanceOf[js.Any])
    
    inline def setPenLoc(value: Any): Self = StObject.set(x, "penLoc", value.asInstanceOf[js.Any])
    
    inline def setSetCreatingBbox(value: CallbackTo[Any]): Self = StObject.set(x, "setCreatingBbox", value.toJsFn)
    
    inline def setSetCursor(value: CallbackTo[Any]): Self = StObject.set(x, "setCursor", value.toJsFn)
    
    inline def setShiftIsDown(value: Any): Self = StObject.set(x, "shiftIsDown", value.asInstanceOf[js.Any])
    
    inline def setSnapPoint(value: CallbackTo[Any]): Self = StObject.set(x, "snapPoint", value.toJsFn)
    
    inline def setToolObjs(value: Any): Self = StObject.set(x, "toolObjs", value.asInstanceOf[js.Any])
  }
}
