package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for an entity's form selector item.
  */
trait FormItem extends StObject {
  
  /**
    * Gets the unique identifier of the form.
    * @returns The identifier, in Guid format.
    */
  def getId(): String
  
  /**
    * Gets the label for the form.
    * @returns The label.
    */
  def getLabel(): String
  
  /**
    * Returns a value that indicates whether the form is currently visible.
    * @returns true if the form is visible; false otherwise.
    */
  def getVisible(): Boolean
  
  /**
    * Navigates the user to this form.
    */
  def navigate(): Unit
  
  /**
    * Sets a value that indicates whether the form is visible.
    * @param isVisible Specify true to show the form; false to hide the form.
    * @see {@link https://docs.microsoft.com/en-us/powerapps/developer/model-driven-apps/clientapi/reference/formcontext-ui-formselector/setvisible External Link: setVisible (Client API reference)}
    */
  def setVisible(isVisible: Boolean): Unit
}
object FormItem {
  
  inline def apply(
    getId: CallbackTo[String],
    getLabel: CallbackTo[String],
    getVisible: CallbackTo[Boolean],
    navigate: Callback,
    setVisible: Boolean => Callback
  ): FormItem = {
    val __obj = js.Dynamic.literal(getId = getId.toJsFn, getLabel = getLabel.toJsFn, getVisible = getVisible.toJsFn, navigate = navigate.toJsFn, setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()))
    __obj.asInstanceOf[FormItem]
  }
  
  extension [Self <: FormItem](x: Self) {
    
    inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetLabel(value: CallbackTo[String]): Self = StObject.set(x, "getLabel", value.toJsFn)
    
    inline def setGetVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "getVisible", value.toJsFn)
    
    inline def setNavigate(value: Callback): Self = StObject.set(x, "navigate", value.toJsFn)
    
    inline def setSetVisible(value: Boolean => Callback): Self = StObject.set(x, "setVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
