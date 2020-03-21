package typingsJapgolly.jupyterlabApputils.dialogMod.Dialog

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A dialog renderer.
  */
trait IRenderer extends js.Object {
  /**
    * Create the body of the dialog.
    *
    * @param value - The input value for the body.
    *
    * @returns A widget for the body.
    */
  def createBody(body: Body[_]): Widget
  /**
    * Create a button node for the dialog.
    *
    * @param button - The button data.
    *
    * @returns A node for the button.
    */
  def createButtonNode(button: IButton): HTMLElement
  /**
    * Create the footer of the dialog.
    *
    * @param buttons - The button nodes to add to the footer.
    *
    * @returns A widget for the footer.
    */
  def createFooter(buttons: js.Array[HTMLElement]): Widget
  /**
    * Create the header of the dialog.
    *
    * @param title - The title of the dialog.
    *
    * @returns A widget for the dialog header.
    */
  def createHeader(title: Header): Widget
}

object IRenderer {
  @scala.inline
  def apply(
    createBody: Body[js.Any] => CallbackTo[Widget],
    createButtonNode: IButton => CallbackTo[HTMLElement],
    createFooter: js.Array[HTMLElement] => CallbackTo[Widget],
    createHeader: Header => CallbackTo[Widget]
  ): IRenderer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createBody")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabApputils.dialogMod.Dialog.Body[js.Any]) => createBody(t0).runNow()))
    __obj.updateDynamic("createButtonNode")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabApputils.dialogMod.Dialog.IButton) => createButtonNode(t0).runNow()))
    __obj.updateDynamic("createFooter")(js.Any.fromFunction1((t0: js.Array[org.scalajs.dom.raw.HTMLElement]) => createFooter(t0).runNow()))
    __obj.updateDynamic("createHeader")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabApputils.dialogMod.Dialog.Header) => createHeader(t0).runNow()))
    __obj.asInstanceOf[IRenderer]
  }
}

