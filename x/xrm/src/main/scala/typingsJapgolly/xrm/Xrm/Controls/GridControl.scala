package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.Events.GridControl.LoadEventHandler
import typingsJapgolly.xrm.XrmEnum.GridControlContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a CRM grid control.
  *
  * @see {@link Control}
  */
trait GridControl
  extends StObject
     with Control
     with UiCanSetVisibleElement {
  
  /**
    * Use this method to add event handlers to the GridControl's OnLoad event.
    *
    * @param handler The event handler.
    */
  def addOnLoad(handler: LoadEventHandler): Unit
  
  /**
    * This method returns context information about the GridControl.
    *
    * @returns The context type.
    */
  def getContextType(): GridControlContext
  
  /**
    * Use this method to get the logical name of the entity data displayed in the grid.
    *
    * @returns The entity name.
    */
  def getEntityName(): String
  
  /**
    * Use this method to get access to the Grid available in the GridControl.
    * @returns The grid.
    */
  def getGrid(): Grid
  
  /**
    * Use this method to get access to the ViewSelector available for the GridControl when it is configured to display views.
    * @returns The view selector.
    */
  def getViewSelector(): ViewSelector
  
  /**
    * Refreshes the sub grid.
    * @remarks Not available during the "on load" event of the form.
    */
  def refresh(): Unit
  
  /**
    * Refreshes the sub grid ribbon.
    * @see {@link https://docs.microsoft.com/it-it/powerapps/developer/model-driven-apps/clientapi/reference/grids/gridcontrol/refreshribbon External Link: refreshRibbon (Client API reference)}
    */
  def refreshRibbon(): Unit
  
  /**
    * Use this method to remove event handlers from the GridControl's OnLoad event.
    * @param handler The handler.
    */
  def removeOnLoad(handler: js.Function0[Unit]): Unit
}
object GridControl {
  
  inline def apply(
    addOnLoad: LoadEventHandler => Callback,
    getContextType: CallbackTo[GridControlContext],
    getControlType: CallbackTo[ControlType | String],
    getEntityName: CallbackTo[String],
    getGrid: CallbackTo[Grid],
    getLabel: CallbackTo[String],
    getName: CallbackTo[String],
    getParent: CallbackTo[Section],
    getViewSelector: CallbackTo[ViewSelector],
    getVisible: CallbackTo[Boolean],
    refresh: Callback,
    refreshRibbon: Callback,
    removeOnLoad: js.Function0[Unit] => Callback,
    setLabel: String => Callback,
    setVisible: Boolean => Callback
  ): GridControl = {
    val __obj = js.Dynamic.literal(addOnLoad = js.Any.fromFunction1((t0: LoadEventHandler) => addOnLoad(t0).runNow()), getContextType = getContextType.toJsFn, getControlType = getControlType.toJsFn, getEntityName = getEntityName.toJsFn, getGrid = getGrid.toJsFn, getLabel = getLabel.toJsFn, getName = getName.toJsFn, getParent = getParent.toJsFn, getViewSelector = getViewSelector.toJsFn, getVisible = getVisible.toJsFn, refresh = refresh.toJsFn, refreshRibbon = refreshRibbon.toJsFn, removeOnLoad = js.Any.fromFunction1((t0: js.Function0[Unit]) => removeOnLoad(t0).runNow()), setLabel = js.Any.fromFunction1((t0: String) => setLabel(t0).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()))
    __obj.asInstanceOf[GridControl]
  }
  
  extension [Self <: GridControl](x: Self) {
    
    inline def setAddOnLoad(value: LoadEventHandler => Callback): Self = StObject.set(x, "addOnLoad", js.Any.fromFunction1((t0: LoadEventHandler) => value(t0).runNow()))
    
    inline def setGetContextType(value: CallbackTo[GridControlContext]): Self = StObject.set(x, "getContextType", value.toJsFn)
    
    inline def setGetEntityName(value: CallbackTo[String]): Self = StObject.set(x, "getEntityName", value.toJsFn)
    
    inline def setGetGrid(value: CallbackTo[Grid]): Self = StObject.set(x, "getGrid", value.toJsFn)
    
    inline def setGetViewSelector(value: CallbackTo[ViewSelector]): Self = StObject.set(x, "getViewSelector", value.toJsFn)
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
    
    inline def setRefreshRibbon(value: Callback): Self = StObject.set(x, "refreshRibbon", value.toJsFn)
    
    inline def setRemoveOnLoad(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "removeOnLoad", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
  }
}
