package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.Collection.ItemCollection
import typingsJapgolly.xrm.Xrm.DisplayState
import typingsJapgolly.xrm.Xrm.Events.ContextSensitiveHandler
import typingsJapgolly.xrm.Xrm.Ui
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a form tab.
  * @see {@link UiElement}
  * @see {@link UiFocusable}
  */
trait Tab
  extends StObject
     with UiStandardElement
     with UiFocusable {
  
  /**
    * Adds a function to be called when the TabStateChange event occurs.
    * @param handler The function to be executed on the TabStateChange event.
    */
  def addTabStateChange(handler: ContextSensitiveHandler): Unit
  
  /**
    * Gets display state of the tab.
    * @returns The display state, as either "expanded" or "collapsed"
    */
  def getDisplayState(): DisplayState
  
  /**
    * Gets the name of the tab.
    * @returns The name.
    */
  def getName(): String
  
  /**
    * Gets a reference to the {@link FormContext.ui formContext.ui} parent of the tab.
    * @returns The parent.
    */
  def getParent(): Ui
  
  /**
    * Removes a function to be called when the TabStateChange event occurs.
    * @param handler The function to be removed from the TabStateChange event.
    */
  def removeTabStateChange(handler: ContextSensitiveHandler): Unit
  
  /**
    * A reference to the collection of form sections within this tab.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var sections: ItemCollection[Section]
  
  /**
    * Sets display state of the tab.
    * @param displayState Display state of the tab, as either "expanded" or "collapsed"
    * @deprecated Deprecated in the 2021 release wave 1 (April 2021). Use the setFocus method in Unified Interface to ensure the correct tab is opened on a form.
    */
  def setDisplayState(displayState: DisplayState): Unit
}
object Tab {
  
  inline def apply(
    addTabStateChange: ContextSensitiveHandler => Callback,
    getDisplayState: CallbackTo[DisplayState],
    getLabel: CallbackTo[String],
    getName: CallbackTo[String],
    getParent: CallbackTo[Ui],
    getVisible: CallbackTo[Boolean],
    removeTabStateChange: ContextSensitiveHandler => Callback,
    sections: ItemCollection[Section],
    setDisplayState: DisplayState => Callback,
    setFocus: Callback,
    setLabel: String => Callback,
    setVisible: Boolean => Callback
  ): Tab = {
    val __obj = js.Dynamic.literal(addTabStateChange = js.Any.fromFunction1((t0: ContextSensitiveHandler) => addTabStateChange(t0).runNow()), getDisplayState = getDisplayState.toJsFn, getLabel = getLabel.toJsFn, getName = getName.toJsFn, getParent = getParent.toJsFn, getVisible = getVisible.toJsFn, removeTabStateChange = js.Any.fromFunction1((t0: ContextSensitiveHandler) => removeTabStateChange(t0).runNow()), sections = sections.asInstanceOf[js.Any], setDisplayState = js.Any.fromFunction1((t0: DisplayState) => setDisplayState(t0).runNow()), setFocus = setFocus.toJsFn, setLabel = js.Any.fromFunction1((t0: String) => setLabel(t0).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()))
    __obj.asInstanceOf[Tab]
  }
  
  extension [Self <: Tab](x: Self) {
    
    inline def setAddTabStateChange(value: ContextSensitiveHandler => Callback): Self = StObject.set(x, "addTabStateChange", js.Any.fromFunction1((t0: ContextSensitiveHandler) => value(t0).runNow()))
    
    inline def setGetDisplayState(value: CallbackTo[DisplayState]): Self = StObject.set(x, "getDisplayState", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetParent(value: CallbackTo[Ui]): Self = StObject.set(x, "getParent", value.toJsFn)
    
    inline def setRemoveTabStateChange(value: ContextSensitiveHandler => Callback): Self = StObject.set(x, "removeTabStateChange", js.Any.fromFunction1((t0: ContextSensitiveHandler) => value(t0).runNow()))
    
    inline def setSections(value: ItemCollection[Section]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSetDisplayState(value: DisplayState => Callback): Self = StObject.set(x, "setDisplayState", js.Any.fromFunction1((t0: DisplayState) => value(t0).runNow()))
  }
}
