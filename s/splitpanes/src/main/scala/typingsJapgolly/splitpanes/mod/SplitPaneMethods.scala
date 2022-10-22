package typingsJapgolly.splitpanes.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitPaneMethods extends StObject {
  
  def addSplitter(paneIndex: Double, nextPaneNode: Node, isVeryFirst: Boolean): Unit
  
  def bindEvents(): Unit
  
  def calculatePanesSize(drag: CoordinateType): Unit
  
  def checkSplitpanesNodes(): Unit
  
  def doPushOtherPanes(sums: SumsType, dragPercent: Double): Null | js.Object
  
  def equalize(): Unit
  
  def equalizeAfterAddOrRemove(arg0: ChangedPaneType): Unit
  
  def findPrevExpandedPane(splitterIndex: Double): Pane | js.Object
  
  def getCurrentDragPercentage(drag: CoordinateType): Double
  
  def getCurrentMouseDrag(event: Event): CoordinateType
  
  def initialPanesSizing(): Unit
  
  def onMouseDown(event: Event, splitterIndex: Double): Unit
  
  def onMouseMove(event: Event): Unit
  
  def onMouseUp(): Unit
  
  def onPaneAdd(pane: Pane): Unit
  
  def onPaneClick(event: Event, splitterIndex: Double): Unit
  
  def onPaneRemove(pane: Pane): Unit
  
  def onSplitterClick(event: Event, splitterIndex: Double): Unit
  
  def onSplitterDblClick(event: Event, splitterIndex: Double): Pane | Unit
  
  def readjustSizes(leftToAllocate: Double, ungrowable: js.Array[Double], unshrinkable: js.Array[Double]): Unit
  
  def redoSplitters(): Unit
  
  def removeSplitter(node: Node): Unit
  
  def requestUpdate(arg0: RequestUpdateType): Unit
  
  def resetPaneSizes(changedPanes: ChangedPaneType): Unit
  
  def sumNextPanesSize(splitterIndex: Double): Double
  
  def sumPrevPanesSize(splitterIndex: Double): Double
  
  def unbindEvents(): Unit
  
  def updatePaneComponents(): Unit
}
object SplitPaneMethods {
  
  inline def apply(
    addSplitter: (Double, Node, Boolean) => Callback,
    bindEvents: Callback,
    calculatePanesSize: CoordinateType => Callback,
    checkSplitpanesNodes: Callback,
    doPushOtherPanes: (SumsType, Double) => Null | js.Object,
    equalize: Callback,
    equalizeAfterAddOrRemove: ChangedPaneType => Callback,
    findPrevExpandedPane: Double => Pane | js.Object,
    getCurrentDragPercentage: CoordinateType => Double,
    getCurrentMouseDrag: Event => CoordinateType,
    initialPanesSizing: Callback,
    onMouseDown: (Event, Double) => Callback,
    onMouseMove: Event => Callback,
    onMouseUp: Callback,
    onPaneAdd: Pane => Callback,
    onPaneClick: (Event, Double) => Callback,
    onPaneRemove: Pane => Callback,
    onSplitterClick: (Event, Double) => Callback,
    onSplitterDblClick: (Event, Double) => Pane | Unit,
    readjustSizes: (Double, js.Array[Double], js.Array[Double]) => Callback,
    redoSplitters: Callback,
    removeSplitter: Node => Callback,
    requestUpdate: RequestUpdateType => Callback,
    resetPaneSizes: ChangedPaneType => Callback,
    sumNextPanesSize: Double => Double,
    sumPrevPanesSize: Double => Double,
    unbindEvents: Callback,
    updatePaneComponents: Callback
  ): SplitPaneMethods = {
    val __obj = js.Dynamic.literal(addSplitter = js.Any.fromFunction3((t0: Double, t1: Node, t2: Boolean) => (addSplitter(t0, t1, t2)).runNow()), bindEvents = bindEvents.toJsFn, calculatePanesSize = js.Any.fromFunction1((t0: CoordinateType) => calculatePanesSize(t0).runNow()), checkSplitpanesNodes = checkSplitpanesNodes.toJsFn, doPushOtherPanes = js.Any.fromFunction2(doPushOtherPanes), equalize = equalize.toJsFn, equalizeAfterAddOrRemove = js.Any.fromFunction1((t0: ChangedPaneType) => equalizeAfterAddOrRemove(t0).runNow()), findPrevExpandedPane = js.Any.fromFunction1(findPrevExpandedPane), getCurrentDragPercentage = js.Any.fromFunction1(getCurrentDragPercentage), getCurrentMouseDrag = js.Any.fromFunction1(getCurrentMouseDrag), initialPanesSizing = initialPanesSizing.toJsFn, onMouseDown = js.Any.fromFunction2((t0: Event, t1: Double) => (onMouseDown(t0, t1)).runNow()), onMouseMove = js.Any.fromFunction1((t0: Event) => onMouseMove(t0).runNow()), onMouseUp = onMouseUp.toJsFn, onPaneAdd = js.Any.fromFunction1((t0: Pane) => onPaneAdd(t0).runNow()), onPaneClick = js.Any.fromFunction2((t0: Event, t1: Double) => (onPaneClick(t0, t1)).runNow()), onPaneRemove = js.Any.fromFunction1((t0: Pane) => onPaneRemove(t0).runNow()), onSplitterClick = js.Any.fromFunction2((t0: Event, t1: Double) => (onSplitterClick(t0, t1)).runNow()), onSplitterDblClick = js.Any.fromFunction2(onSplitterDblClick), readjustSizes = js.Any.fromFunction3((t0: Double, t1: js.Array[Double], t2: js.Array[Double]) => (readjustSizes(t0, t1, t2)).runNow()), redoSplitters = redoSplitters.toJsFn, removeSplitter = js.Any.fromFunction1((t0: Node) => removeSplitter(t0).runNow()), requestUpdate = js.Any.fromFunction1((t0: RequestUpdateType) => requestUpdate(t0).runNow()), resetPaneSizes = js.Any.fromFunction1((t0: ChangedPaneType) => resetPaneSizes(t0).runNow()), sumNextPanesSize = js.Any.fromFunction1(sumNextPanesSize), sumPrevPanesSize = js.Any.fromFunction1(sumPrevPanesSize), unbindEvents = unbindEvents.toJsFn, updatePaneComponents = updatePaneComponents.toJsFn)
    __obj.asInstanceOf[SplitPaneMethods]
  }
  
  extension [Self <: SplitPaneMethods](x: Self) {
    
    inline def setAddSplitter(value: (Double, Node, Boolean) => Callback): Self = StObject.set(x, "addSplitter", js.Any.fromFunction3((t0: Double, t1: Node, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setBindEvents(value: Callback): Self = StObject.set(x, "bindEvents", value.toJsFn)
    
    inline def setCalculatePanesSize(value: CoordinateType => Callback): Self = StObject.set(x, "calculatePanesSize", js.Any.fromFunction1((t0: CoordinateType) => value(t0).runNow()))
    
    inline def setCheckSplitpanesNodes(value: Callback): Self = StObject.set(x, "checkSplitpanesNodes", value.toJsFn)
    
    inline def setDoPushOtherPanes(value: (SumsType, Double) => Null | js.Object): Self = StObject.set(x, "doPushOtherPanes", js.Any.fromFunction2(value))
    
    inline def setEqualize(value: Callback): Self = StObject.set(x, "equalize", value.toJsFn)
    
    inline def setEqualizeAfterAddOrRemove(value: ChangedPaneType => Callback): Self = StObject.set(x, "equalizeAfterAddOrRemove", js.Any.fromFunction1((t0: ChangedPaneType) => value(t0).runNow()))
    
    inline def setFindPrevExpandedPane(value: Double => Pane | js.Object): Self = StObject.set(x, "findPrevExpandedPane", js.Any.fromFunction1(value))
    
    inline def setGetCurrentDragPercentage(value: CoordinateType => Double): Self = StObject.set(x, "getCurrentDragPercentage", js.Any.fromFunction1(value))
    
    inline def setGetCurrentMouseDrag(value: Event => CoordinateType): Self = StObject.set(x, "getCurrentMouseDrag", js.Any.fromFunction1(value))
    
    inline def setInitialPanesSizing(value: Callback): Self = StObject.set(x, "initialPanesSizing", value.toJsFn)
    
    inline def setOnMouseDown(value: (Event, Double) => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction2((t0: Event, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseMove(value: Event => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    
    inline def setOnMouseUp(value: Callback): Self = StObject.set(x, "onMouseUp", value.toJsFn)
    
    inline def setOnPaneAdd(value: Pane => Callback): Self = StObject.set(x, "onPaneAdd", js.Any.fromFunction1((t0: Pane) => value(t0).runNow()))
    
    inline def setOnPaneClick(value: (Event, Double) => Callback): Self = StObject.set(x, "onPaneClick", js.Any.fromFunction2((t0: Event, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setOnPaneRemove(value: Pane => Callback): Self = StObject.set(x, "onPaneRemove", js.Any.fromFunction1((t0: Pane) => value(t0).runNow()))
    
    inline def setOnSplitterClick(value: (Event, Double) => Callback): Self = StObject.set(x, "onSplitterClick", js.Any.fromFunction2((t0: Event, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setOnSplitterDblClick(value: (Event, Double) => Pane | Unit): Self = StObject.set(x, "onSplitterDblClick", js.Any.fromFunction2(value))
    
    inline def setReadjustSizes(value: (Double, js.Array[Double], js.Array[Double]) => Callback): Self = StObject.set(x, "readjustSizes", js.Any.fromFunction3((t0: Double, t1: js.Array[Double], t2: js.Array[Double]) => (value(t0, t1, t2)).runNow()))
    
    inline def setRedoSplitters(value: Callback): Self = StObject.set(x, "redoSplitters", value.toJsFn)
    
    inline def setRemoveSplitter(value: Node => Callback): Self = StObject.set(x, "removeSplitter", js.Any.fromFunction1((t0: Node) => value(t0).runNow()))
    
    inline def setRequestUpdate(value: RequestUpdateType => Callback): Self = StObject.set(x, "requestUpdate", js.Any.fromFunction1((t0: RequestUpdateType) => value(t0).runNow()))
    
    inline def setResetPaneSizes(value: ChangedPaneType => Callback): Self = StObject.set(x, "resetPaneSizes", js.Any.fromFunction1((t0: ChangedPaneType) => value(t0).runNow()))
    
    inline def setSumNextPanesSize(value: Double => Double): Self = StObject.set(x, "sumNextPanesSize", js.Any.fromFunction1(value))
    
    inline def setSumPrevPanesSize(value: Double => Double): Self = StObject.set(x, "sumPrevPanesSize", js.Any.fromFunction1(value))
    
    inline def setUnbindEvents(value: Callback): Self = StObject.set(x, "unbindEvents", value.toJsFn)
    
    inline def setUpdatePaneComponents(value: Callback): Self = StObject.set(x, "updatePaneComponents", value.toJsFn)
  }
}
