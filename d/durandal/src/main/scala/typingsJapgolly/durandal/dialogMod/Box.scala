package typingsJapgolly.durandal.dialogMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Models a message box's message, title and options.
  * @class
  */
trait Box extends js.Object {
  /**
    * Provides the view to the composition system.
    * @returns {DOMElement} The view of the message box.
    */
  def getView(): HTMLElement
  /**
    * Selects an option and closes the message box, returning the selected option through the dialog system's promise.
    * @param {string} dialogResult The result to select.
    */
  def selectOption(dialogResult: String): Unit
}

object Box {
  @scala.inline
  def apply(getView: CallbackTo[HTMLElement], selectOption: String => Callback): Box = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getView")(getView.toJsFn)
    __obj.updateDynamic("selectOption")(js.Any.fromFunction1((t0: java.lang.String) => selectOption(t0).runNow()))
    __obj.asInstanceOf[Box]
  }
}

