package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.LookupValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the view selector.  Use the ViewSelector methods to get or set information about the view selector
  * of the grid control.
  */
trait ViewSelector extends StObject {
  
  /**
    * Use this method to get a reference to the current view.
    * @returns The current view.
    */
  def getCurrentView(): LookupValue
  
  /**
    * Use this method to determine whether the view selector is visible.
    * @returns true if visible, false if not.
    */
  def isVisible(): Boolean
  
  /**
    * Use this method to set the current view.
    * @param viewSelectorItem The view selector item.
    */
  def setCurrentView(viewSelectorItem: LookupValue): Unit
}
object ViewSelector {
  
  inline def apply(
    getCurrentView: CallbackTo[LookupValue],
    isVisible: CallbackTo[Boolean],
    setCurrentView: LookupValue => Callback
  ): ViewSelector = {
    val __obj = js.Dynamic.literal(getCurrentView = getCurrentView.toJsFn, isVisible = isVisible.toJsFn, setCurrentView = js.Any.fromFunction1((t0: LookupValue) => setCurrentView(t0).runNow()))
    __obj.asInstanceOf[ViewSelector]
  }
  
  extension [Self <: ViewSelector](x: Self) {
    
    inline def setGetCurrentView(value: CallbackTo[LookupValue]): Self = StObject.set(x, "getCurrentView", value.toJsFn)
    
    inline def setIsVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVisible", value.toJsFn)
    
    inline def setSetCurrentView(value: LookupValue => Callback): Self = StObject.set(x, "setCurrentView", js.Any.fromFunction1((t0: LookupValue) => value(t0).runNow()))
  }
}
