package typingsJapgolly.sharepoint

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalloutActionMenu extends StObject {
  
  def addAction(action: CalloutAction): Unit
  
  def calculateActionWidth(): Unit
  
  def getActions(): js.Array[CalloutAction]
  
  def refreshActions(): Unit
  
  def render(): Unit
}
object CalloutActionMenu {
  
  inline def apply(
    addAction: CalloutAction => Callback,
    calculateActionWidth: Callback,
    getActions: CallbackTo[js.Array[CalloutAction]],
    refreshActions: Callback,
    render: Callback
  ): CalloutActionMenu = {
    val __obj = js.Dynamic.literal(addAction = js.Any.fromFunction1((t0: CalloutAction) => addAction(t0).runNow()), calculateActionWidth = calculateActionWidth.toJsFn, getActions = getActions.toJsFn, refreshActions = refreshActions.toJsFn, render = render.toJsFn)
    __obj.asInstanceOf[CalloutActionMenu]
  }
  
  extension [Self <: CalloutActionMenu](x: Self) {
    
    inline def setAddAction(value: CalloutAction => Callback): Self = StObject.set(x, "addAction", js.Any.fromFunction1((t0: CalloutAction) => value(t0).runNow()))
    
    inline def setCalculateActionWidth(value: Callback): Self = StObject.set(x, "calculateActionWidth", value.toJsFn)
    
    inline def setGetActions(value: CallbackTo[js.Array[CalloutAction]]): Self = StObject.set(x, "getActions", value.toJsFn)
    
    inline def setRefreshActions(value: Callback): Self = StObject.set(x, "refreshActions", value.toJsFn)
    
    inline def setRender(value: Callback): Self = StObject.set(x, "render", value.toJsFn)
  }
}
