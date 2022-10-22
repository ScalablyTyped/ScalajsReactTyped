package typingsJapgolly.oracleOraclejet.ojdiagramMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.anon.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DvtDiagramLayoutContext extends StObject {
  
  def getCommonContainer(nodeId1: Any, nodeId2: Any): Any
  
  def getComponentSize(): H
  
  def getCurrentViewport(): H
  
  def getEventData(): js.Object
  
  def getLinkById(id: Any): DvtDiagramLayoutContextLink
  
  def getLinkByIndex(index: Double): DvtDiagramLayoutContextLink
  
  def getLinkCount(): Double
  
  def getNodeById(id: Any): DvtDiagramLayoutContextNode
  
  def getNodeByIndex(index: Double): DvtDiagramLayoutContextNode
  
  def getNodeCount(): Double
  
  def getViewport(): H
  
  def isLocaleR2L(): Boolean
  
  def setViewport(viewport: H): Unit
}
object DvtDiagramLayoutContext {
  
  inline def apply(
    getCommonContainer: (Any, Any) => Any,
    getComponentSize: CallbackTo[H],
    getCurrentViewport: CallbackTo[H],
    getEventData: CallbackTo[js.Object],
    getLinkById: Any => DvtDiagramLayoutContextLink,
    getLinkByIndex: Double => DvtDiagramLayoutContextLink,
    getLinkCount: CallbackTo[Double],
    getNodeById: Any => DvtDiagramLayoutContextNode,
    getNodeByIndex: Double => DvtDiagramLayoutContextNode,
    getNodeCount: CallbackTo[Double],
    getViewport: CallbackTo[H],
    isLocaleR2L: CallbackTo[Boolean],
    setViewport: H => Callback
  ): DvtDiagramLayoutContext = {
    val __obj = js.Dynamic.literal(getCommonContainer = js.Any.fromFunction2(getCommonContainer), getComponentSize = getComponentSize.toJsFn, getCurrentViewport = getCurrentViewport.toJsFn, getEventData = getEventData.toJsFn, getLinkById = js.Any.fromFunction1(getLinkById), getLinkByIndex = js.Any.fromFunction1(getLinkByIndex), getLinkCount = getLinkCount.toJsFn, getNodeById = js.Any.fromFunction1(getNodeById), getNodeByIndex = js.Any.fromFunction1(getNodeByIndex), getNodeCount = getNodeCount.toJsFn, getViewport = getViewport.toJsFn, isLocaleR2L = isLocaleR2L.toJsFn, setViewport = js.Any.fromFunction1((t0: H) => setViewport(t0).runNow()))
    __obj.asInstanceOf[DvtDiagramLayoutContext]
  }
  
  extension [Self <: DvtDiagramLayoutContext](x: Self) {
    
    inline def setGetCommonContainer(value: (Any, Any) => Any): Self = StObject.set(x, "getCommonContainer", js.Any.fromFunction2(value))
    
    inline def setGetComponentSize(value: CallbackTo[H]): Self = StObject.set(x, "getComponentSize", value.toJsFn)
    
    inline def setGetCurrentViewport(value: CallbackTo[H]): Self = StObject.set(x, "getCurrentViewport", value.toJsFn)
    
    inline def setGetEventData(value: CallbackTo[js.Object]): Self = StObject.set(x, "getEventData", value.toJsFn)
    
    inline def setGetLinkById(value: Any => DvtDiagramLayoutContextLink): Self = StObject.set(x, "getLinkById", js.Any.fromFunction1(value))
    
    inline def setGetLinkByIndex(value: Double => DvtDiagramLayoutContextLink): Self = StObject.set(x, "getLinkByIndex", js.Any.fromFunction1(value))
    
    inline def setGetLinkCount(value: CallbackTo[Double]): Self = StObject.set(x, "getLinkCount", value.toJsFn)
    
    inline def setGetNodeById(value: Any => DvtDiagramLayoutContextNode): Self = StObject.set(x, "getNodeById", js.Any.fromFunction1(value))
    
    inline def setGetNodeByIndex(value: Double => DvtDiagramLayoutContextNode): Self = StObject.set(x, "getNodeByIndex", js.Any.fromFunction1(value))
    
    inline def setGetNodeCount(value: CallbackTo[Double]): Self = StObject.set(x, "getNodeCount", value.toJsFn)
    
    inline def setGetViewport(value: CallbackTo[H]): Self = StObject.set(x, "getViewport", value.toJsFn)
    
    inline def setIsLocaleR2L(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLocaleR2L", value.toJsFn)
    
    inline def setSetViewport(value: H => Callback): Self = StObject.set(x, "setViewport", js.Any.fromFunction1((t0: H) => value(t0).runNow()))
  }
}
