package typingsJapgolly.officeJsPreview.Office

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents add-in level functionality for operating or configuring various aspects of the add-in.
  */
trait Addin_ extends js.Object {
  /**
    * Gets the current startup behavior for the add-in.
    */
  def getStartupBehavior(): js.Promise[StartupBehavior]
  /**
    * Hides the task pane.
    * @returns A promise that is resolved when the UI is hidden.
    */
  def hide(): js.Promise[Unit]
  /**
    * Adds a listener for the `onVisbilityModeChanged` event.
    * @param listener - The listener function that is called when the event is emitted. This function takes in a message for the receiving component.
    * @returns A promise that resolves when the listener is added.
    */
  def onVisibilityModeChanged(listener: js.Function1[/* message */ VisibilityModeChangedMessage, Unit]): js.Promise[RemoveEventListener]
  /**
    * Sets the startup behavior for the add-in for when the document is opened next time.
    * @param behavior - Specifies startup behavior of the add-in.
    */
  def setStartupBehavior(behavior: StartupBehavior): js.Promise[Unit]
  /**
    * Shows the task pane associated with the add-in.
    * @returns A promise that is resolved when the UI is shown.
    */
  def showAsTaskpane(): js.Promise[Unit]
}

object Addin_ {
  @scala.inline
  def apply(
    getStartupBehavior: CallbackTo[js.Promise[StartupBehavior]],
    hide: CallbackTo[js.Promise[Unit]],
    onVisibilityModeChanged: js.Function1[/* message */ VisibilityModeChangedMessage, Unit] => CallbackTo[js.Promise[RemoveEventListener]],
    setStartupBehavior: StartupBehavior => CallbackTo[js.Promise[Unit]],
    showAsTaskpane: CallbackTo[js.Promise[Unit]]
  ): Addin_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStartupBehavior")(getStartupBehavior.toJsFn)
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("onVisibilityModeChanged")(js.Any.fromFunction1((t0: js.Function1[
  /* message */ typingsJapgolly.officeJsPreview.Office.VisibilityModeChangedMessage, 
  scala.Unit]) => onVisibilityModeChanged(t0).runNow()))
    __obj.updateDynamic("setStartupBehavior")(js.Any.fromFunction1((t0: typingsJapgolly.officeJsPreview.Office.StartupBehavior) => setStartupBehavior(t0).runNow()))
    __obj.updateDynamic("showAsTaskpane")(showAsTaskpane.toJsFn)
    __obj.asInstanceOf[Addin_]
  }
}

