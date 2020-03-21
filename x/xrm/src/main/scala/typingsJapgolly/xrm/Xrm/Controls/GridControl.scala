package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.Events.ContextSensitiveHandler
import typingsJapgolly.xrm.XrmEnum.GridControlContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a CRM grid control.
  *
  * @see {@link Control}
  */
trait GridControl extends Control {
  /**
    * Use this method to add event handlers to the GridControl's OnLoad event.
    *
    * @param handler The event handler.
    */
  def addOnLoad(handler: ContextSensitiveHandler): Unit
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
    * Use this method to remove event handlers from the GridControl's OnLoad event.
    * @param handler The handler.
    */
  def removeOnLoad(handler: js.Function0[Unit]): Unit
}

object GridControl {
  @scala.inline
  def apply(
    addOnLoad: ContextSensitiveHandler => Callback,
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
    removeOnLoad: js.Function0[Unit] => Callback,
    setLabel: String => Callback
  ): GridControl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addOnLoad")(js.Any.fromFunction1((t0: typingsJapgolly.xrm.Xrm.Events.ContextSensitiveHandler) => addOnLoad(t0).runNow()))
    __obj.updateDynamic("getContextType")(getContextType.toJsFn)
    __obj.updateDynamic("getControlType")(getControlType.toJsFn)
    __obj.updateDynamic("getEntityName")(getEntityName.toJsFn)
    __obj.updateDynamic("getGrid")(getGrid.toJsFn)
    __obj.updateDynamic("getLabel")(getLabel.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getParent")(getParent.toJsFn)
    __obj.updateDynamic("getViewSelector")(getViewSelector.toJsFn)
    __obj.updateDynamic("getVisible")(getVisible.toJsFn)
    __obj.updateDynamic("refresh")(refresh.toJsFn)
    __obj.updateDynamic("removeOnLoad")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => removeOnLoad(t0).runNow()))
    __obj.updateDynamic("setLabel")(js.Any.fromFunction1((t0: java.lang.String) => setLabel(t0).runNow()))
    __obj.asInstanceOf[GridControl]
  }
}

