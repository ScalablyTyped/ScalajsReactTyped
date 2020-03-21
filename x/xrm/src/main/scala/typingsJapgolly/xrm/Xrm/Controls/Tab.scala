package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.Collection.ItemCollection
import typingsJapgolly.xrm.Xrm.DisplayState
import typingsJapgolly.xrm.Xrm.Events.ContextSensitiveHandler
import typingsJapgolly.xrm.Xrm.Ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a form tab.
  * @see {@link UiElement}
  * @see {@link UiFocusable}
  */
trait Tab
  extends UiStandardElement
     with UiFocusable {
  /**
    * A reference to the collection of form sections within this tab.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var sections: ItemCollection[Section]
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
    * Sets display state of the tab.
    * @param displayState Display state of the tab, as either "expanded" or "collapsed"
    */
  def setDisplayState(displayState: DisplayState): Unit
}

object Tab {
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(sections = sections.asInstanceOf[js.Any])
    __obj.updateDynamic("addTabStateChange")(js.Any.fromFunction1((t0: typingsJapgolly.xrm.Xrm.Events.ContextSensitiveHandler) => addTabStateChange(t0).runNow()))
    __obj.updateDynamic("getDisplayState")(getDisplayState.toJsFn)
    __obj.updateDynamic("getLabel")(getLabel.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getParent")(getParent.toJsFn)
    __obj.updateDynamic("getVisible")(getVisible.toJsFn)
    __obj.updateDynamic("removeTabStateChange")(js.Any.fromFunction1((t0: typingsJapgolly.xrm.Xrm.Events.ContextSensitiveHandler) => removeTabStateChange(t0).runNow()))
    __obj.updateDynamic("setDisplayState")(js.Any.fromFunction1((t0: typingsJapgolly.xrm.Xrm.DisplayState) => setDisplayState(t0).runNow()))
    __obj.updateDynamic("setFocus")(setFocus.toJsFn)
    __obj.updateDynamic("setLabel")(js.Any.fromFunction1((t0: java.lang.String) => setLabel(t0).runNow()))
    __obj.updateDynamic("setVisible")(js.Any.fromFunction1((t0: scala.Boolean) => setVisible(t0).runNow()))
    __obj.asInstanceOf[Tab]
  }
}

