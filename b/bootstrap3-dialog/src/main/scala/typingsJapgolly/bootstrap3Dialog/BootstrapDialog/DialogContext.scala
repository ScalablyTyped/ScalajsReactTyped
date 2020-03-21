package typingsJapgolly.bootstrap3Dialog.BootstrapDialog

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogContext extends js.Object {
  /**  	Close the dialog. Usage: dialogInstance.close() */
  def close(): Unit
  /** Disable all buttons in dialog footer when it's false, enable all when it's true. */
  def enableButtons(enable: Boolean): Unit
  def getButton(buttonId: String): JQuery_[HTMLElement]
  /** Get data entry according to the given key, returns null if no data entry found. */
  def getData(dataName: String): js.Any
  /** Return the raw modal, equivalent to $('<div class='modal fade'...></div>') */
  def getModal(): JQuery_[HTMLElement]
  /** Return the raw modal body. */
  def getModalBody(): JQuery_[HTMLElement]
  /** Return the raw modal content. */
  def getModalContent(): JQuery_[HTMLElement]
  /** Return the raw modal dialog. */
  def getModalDialog(): JQuery_[HTMLElement]
  /** Return the raw modal footer. */
  def getModalFooter(): JQuery_[HTMLElement]
  /** Return the raw modal header. */
  def getModalHeader(): JQuery_[HTMLElement]
  def getTitle(): String
  /** Open the dialog. Usage: dialogInstance.open() */
  def open(): Unit
  /**
    * Calling dialog.open() will automatically get this method called first, but if you want to do something on your dialog
    * before it's shown, you can manually call dialog.realize() before calling dialog.open().
    */
  def realize(): Unit
  /**
    * When set to true (default), dialog can be closed by clicking close icon in dialog header,
    * or by clicking outside the dialog, or, ESC key is pressed.
    */
  def setClosable(closable: Boolean): Unit
  /** Bind data entry to dialog instance, value can be any types that javascript supports. */
  def setData(dataName: String, value: js.Any): Unit
  def setMessage(message: String): Unit
  def setTitle(title: String): Unit
  /** See BootstrapDialog.TYPE_xxx constants. */
  def setType(dialogType: String): Unit
}

object DialogContext {
  @scala.inline
  def apply(
    close: Callback,
    enableButtons: Boolean => Callback,
    getButton: String => CallbackTo[JQuery_[HTMLElement]],
    getData: String => CallbackTo[js.Any],
    getModal: CallbackTo[JQuery_[HTMLElement]],
    getModalBody: CallbackTo[JQuery_[HTMLElement]],
    getModalContent: CallbackTo[JQuery_[HTMLElement]],
    getModalDialog: CallbackTo[JQuery_[HTMLElement]],
    getModalFooter: CallbackTo[JQuery_[HTMLElement]],
    getModalHeader: CallbackTo[JQuery_[HTMLElement]],
    getTitle: CallbackTo[String],
    open: Callback,
    realize: Callback,
    setClosable: Boolean => Callback,
    setData: (String, js.Any) => Callback,
    setMessage: String => Callback,
    setTitle: String => Callback,
    setType: String => Callback
  ): DialogContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("enableButtons")(js.Any.fromFunction1((t0: scala.Boolean) => enableButtons(t0).runNow()))
    __obj.updateDynamic("getButton")(js.Any.fromFunction1((t0: java.lang.String) => getButton(t0).runNow()))
    __obj.updateDynamic("getData")(js.Any.fromFunction1((t0: java.lang.String) => getData(t0).runNow()))
    __obj.updateDynamic("getModal")(getModal.toJsFn)
    __obj.updateDynamic("getModalBody")(getModalBody.toJsFn)
    __obj.updateDynamic("getModalContent")(getModalContent.toJsFn)
    __obj.updateDynamic("getModalDialog")(getModalDialog.toJsFn)
    __obj.updateDynamic("getModalFooter")(getModalFooter.toJsFn)
    __obj.updateDynamic("getModalHeader")(getModalHeader.toJsFn)
    __obj.updateDynamic("getTitle")(getTitle.toJsFn)
    __obj.updateDynamic("open")(open.toJsFn)
    __obj.updateDynamic("realize")(realize.toJsFn)
    __obj.updateDynamic("setClosable")(js.Any.fromFunction1((t0: scala.Boolean) => setClosable(t0).runNow()))
    __obj.updateDynamic("setData")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => setData(t0, t1).runNow()))
    __obj.updateDynamic("setMessage")(js.Any.fromFunction1((t0: java.lang.String) => setMessage(t0).runNow()))
    __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: java.lang.String) => setTitle(t0).runNow()))
    __obj.updateDynamic("setType")(js.Any.fromFunction1((t0: java.lang.String) => setType(t0).runNow()))
    __obj.asInstanceOf[DialogContext]
  }
}

