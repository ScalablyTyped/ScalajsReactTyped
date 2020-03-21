package typingsJapgolly.officeJs.Office

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The object that is returned when `UI.displayDialogAsync` is called. It exposes methods for registering event handlers and closing the dialog.
  * 
  * @remarks
  * 
  * **Requirement set**: {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/dialog-api-requirement-sets | DialogApi}
  */
trait Dialog extends js.Object {
  /**
    * Registers an event handler. The two supported events are:
    *
    * - DialogMessageReceived. Triggered when the dialog box sends a message to its parent.
    *
    * - DialogEventReceived. Triggered when the dialog box has been closed or otherwise unloaded.
    */
  def addEventHandler(eventType: EventType, handler: js.Function): Unit
  /**
    * Called from a parent page to close the corresponding dialog box. 
    */
  def close(): Unit
  /**
    * FOR INTERNAL USE ONLY. DO NOT CALL IN YOUR CODE.
    */
  def sendMessage(name: String): Unit
}

object Dialog {
  @scala.inline
  def apply(
    addEventHandler: (EventType, js.Function) => Callback,
    close: Callback,
    sendMessage: String => Callback
  ): Dialog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventHandler")(js.Any.fromFunction2((t0: typingsJapgolly.officeJs.Office.EventType, t1: js.Function) => addEventHandler(t0, t1).runNow()))
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("sendMessage")(js.Any.fromFunction1((t0: java.lang.String) => sendMessage(t0).runNow()))
    __obj.asInstanceOf[Dialog]
  }
}

