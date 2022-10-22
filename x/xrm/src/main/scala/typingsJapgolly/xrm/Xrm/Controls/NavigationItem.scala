package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a navigation item.
  * @see {@link UiElement}
  * @see {@link UiFocusable}
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-ui-navigation External Link: formContext.ui.navigation item (Client API reference)}
  */
trait NavigationItem
  extends StObject
     with UiStandardElement
     with UiFocusable {
  
  /**
    * Gets the name of the item.
    * @returns The identifier.
    */
  def getId(): String
}
object NavigationItem {
  
  inline def apply(
    getId: CallbackTo[String],
    getLabel: CallbackTo[String],
    getVisible: CallbackTo[Boolean],
    setFocus: Callback,
    setLabel: String => Callback,
    setVisible: Boolean => Callback
  ): NavigationItem = {
    val __obj = js.Dynamic.literal(getId = getId.toJsFn, getLabel = getLabel.toJsFn, getVisible = getVisible.toJsFn, setFocus = setFocus.toJsFn, setLabel = js.Any.fromFunction1((t0: String) => setLabel(t0).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()))
    __obj.asInstanceOf[NavigationItem]
  }
  
  extension [Self <: NavigationItem](x: Self) {
    
    inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "getId", value.toJsFn)
  }
}
