package typingsJapgolly.popoto.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.popoto.providerMod.Link
import typingsJapgolly.popoto.providerMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofQueryViewer extends StObject {
  
  val CHOOSE_LABEL: String
  
  val QUERY_STARTER: String
  
  def clickSpan(): Unit
  
  val containerId: String
  
  /**
    * Create the query viewer area.
    */
  def createQueryArea(): Unit
  
  def generateConstraintData(links: js.Array[Link], nodes: js.Array[Node]): js.Array[Any]
  
  def generateData(links: js.Array[Link], nodes: js.Array[Node]): js.Array[Any]
  
  def mouseOutSpan(): Unit
  
  def mouseOverSpan(): Unit
  
  def rightClickSpan(): Unit
  
  /**
    * Update all the elements displayed on the query viewer based on current graph.
    */
  def updateQuery(): Unit
}
object TypeofQueryViewer {
  
  inline def apply(
    CHOOSE_LABEL: String,
    QUERY_STARTER: String,
    clickSpan: Callback,
    containerId: String,
    createQueryArea: Callback,
    generateConstraintData: (js.Array[Link], js.Array[Node]) => js.Array[Any],
    generateData: (js.Array[Link], js.Array[Node]) => js.Array[Any],
    mouseOutSpan: Callback,
    mouseOverSpan: Callback,
    rightClickSpan: Callback,
    updateQuery: Callback
  ): TypeofQueryViewer = {
    val __obj = js.Dynamic.literal(CHOOSE_LABEL = CHOOSE_LABEL.asInstanceOf[js.Any], QUERY_STARTER = QUERY_STARTER.asInstanceOf[js.Any], clickSpan = clickSpan.toJsFn, containerId = containerId.asInstanceOf[js.Any], createQueryArea = createQueryArea.toJsFn, generateConstraintData = js.Any.fromFunction2(generateConstraintData), generateData = js.Any.fromFunction2(generateData), mouseOutSpan = mouseOutSpan.toJsFn, mouseOverSpan = mouseOverSpan.toJsFn, rightClickSpan = rightClickSpan.toJsFn, updateQuery = updateQuery.toJsFn)
    __obj.asInstanceOf[TypeofQueryViewer]
  }
  
  extension [Self <: TypeofQueryViewer](x: Self) {
    
    inline def setCHOOSE_LABEL(value: String): Self = StObject.set(x, "CHOOSE_LABEL", value.asInstanceOf[js.Any])
    
    inline def setClickSpan(value: Callback): Self = StObject.set(x, "clickSpan", value.toJsFn)
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setCreateQueryArea(value: Callback): Self = StObject.set(x, "createQueryArea", value.toJsFn)
    
    inline def setGenerateConstraintData(value: (js.Array[Link], js.Array[Node]) => js.Array[Any]): Self = StObject.set(x, "generateConstraintData", js.Any.fromFunction2(value))
    
    inline def setGenerateData(value: (js.Array[Link], js.Array[Node]) => js.Array[Any]): Self = StObject.set(x, "generateData", js.Any.fromFunction2(value))
    
    inline def setMouseOutSpan(value: Callback): Self = StObject.set(x, "mouseOutSpan", value.toJsFn)
    
    inline def setMouseOverSpan(value: Callback): Self = StObject.set(x, "mouseOverSpan", value.toJsFn)
    
    inline def setQUERY_STARTER(value: String): Self = StObject.set(x, "QUERY_STARTER", value.asInstanceOf[js.Any])
    
    inline def setRightClickSpan(value: Callback): Self = StObject.set(x, "rightClickSpan", value.toJsFn)
    
    inline def setUpdateQuery(value: Callback): Self = StObject.set(x, "updateQuery", value.toJsFn)
  }
}
