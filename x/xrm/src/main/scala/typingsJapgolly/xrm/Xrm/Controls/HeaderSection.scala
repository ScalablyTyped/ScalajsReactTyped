package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderSection extends StObject {
  
  /**
    * Returns the header's body visibility.
    * @remarks Available only for Unified Interface.
    */
  def getBodyVisible(): Boolean
  
  /**
    * Returns the command bar visibility.
    * @remarks Available only for Unified Interface.
    */
  def getCommandBarVisible(): Boolean
  
  /**
    * Returns the tab navigator visibility.
    * @remarks Available only for Unified Interface.
    */
  def getTabNavigatorVisible(): Boolean
  
  /**
    * Sets the header's body visibility.
    * @arg bool Specify true to show the body; false to hide the body.
    * @remarks Available only for Unified Interface.
    */
  def setBodyVisible(bool: Boolean): Unit
  
  /**
    * Sets the command bar visibility.
    * @arg bool Specify true to show the command bar; false to hide the command bar.
    * @remarks Available only for Unified Interface.
    */
  def setCommandBarVisible(bool: Boolean): Unit
  
  /**
    * Sets the tab navigator visibility.
    * @arg bool Specify true to show the tab navigator; false to hide the tab navigator.
    * @remarks Available only for Unified Interface.
    */
  def setTabNavigatorVisible(bool: Boolean): Unit
}
object HeaderSection {
  
  inline def apply(
    getBodyVisible: CallbackTo[Boolean],
    getCommandBarVisible: CallbackTo[Boolean],
    getTabNavigatorVisible: CallbackTo[Boolean],
    setBodyVisible: Boolean => Callback,
    setCommandBarVisible: Boolean => Callback,
    setTabNavigatorVisible: Boolean => Callback
  ): HeaderSection = {
    val __obj = js.Dynamic.literal(getBodyVisible = getBodyVisible.toJsFn, getCommandBarVisible = getCommandBarVisible.toJsFn, getTabNavigatorVisible = getTabNavigatorVisible.toJsFn, setBodyVisible = js.Any.fromFunction1((t0: Boolean) => setBodyVisible(t0).runNow()), setCommandBarVisible = js.Any.fromFunction1((t0: Boolean) => setCommandBarVisible(t0).runNow()), setTabNavigatorVisible = js.Any.fromFunction1((t0: Boolean) => setTabNavigatorVisible(t0).runNow()))
    __obj.asInstanceOf[HeaderSection]
  }
  
  extension [Self <: HeaderSection](x: Self) {
    
    inline def setGetBodyVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "getBodyVisible", value.toJsFn)
    
    inline def setGetCommandBarVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "getCommandBarVisible", value.toJsFn)
    
    inline def setGetTabNavigatorVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "getTabNavigatorVisible", value.toJsFn)
    
    inline def setSetBodyVisible(value: Boolean => Callback): Self = StObject.set(x, "setBodyVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetCommandBarVisible(value: Boolean => Callback): Self = StObject.set(x, "setCommandBarVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetTabNavigatorVisible(value: Boolean => Callback): Self = StObject.set(x, "setTabNavigatorVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
