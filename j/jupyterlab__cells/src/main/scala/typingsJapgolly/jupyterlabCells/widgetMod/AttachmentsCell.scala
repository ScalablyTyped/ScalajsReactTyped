package typingsJapgolly.jupyterlabCells.widgetMod

import typingsJapgolly.jupyterlabCells.modelMod.IAttachmentsCellModel
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/widget", "AttachmentsCell")
@js.native
abstract class AttachmentsCell () extends Cell {
  /**
    * Takes in a file object and adds it to
    * the cell attachments
    */
  var _attachFile: js.Any = js.native
  /**
    * Attaches all DataTransferItems (obtained from
    * clipboard or native drop events) to the cell
    */
  var _attachFiles: js.Any = js.native
  var _evtDragOver: js.Any = js.native
  /**
    * Handle the `'p-drop'` event for the widget.
    */
  var _evtDrop: js.Any = js.native
  /**
    * Handle the `drop` event for the widget
    */
  var _evtNativeDrop: js.Any = js.native
  /**
    * Handle the `paste` event for the widget
    */
  var _evtPaste: js.Any = js.native
  /**
    * The model used by the widget.
    */
  @JSName("model")
  val model_AttachmentsCell: IAttachmentsCellModel = js.native
  /**
    * Handle the DOM events for the widget.
    *
    * @param event - The DOM event sent to the widget.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the notebook panel's node. It should
    * not be called directly by user code.
    */
  def handleEvent(event: Event_): Unit = js.native
  /**
    * Modify the cell source to include a reference to the attachment.
    */
  /* protected */ def updateCellSourceWithAttachment(attachmentName: String): Unit = js.native
}

