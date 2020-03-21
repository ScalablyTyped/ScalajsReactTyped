package typingsJapgolly.jupyterlabCells.widgetMod

import typingsJapgolly.jupyterlabCells.modelMod.IMarkdownCellModel
import typingsJapgolly.jupyterlabCells.widgetMod.MarkdownCell.IOptions
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/widget", "MarkdownCell")
@js.native
class MarkdownCell_ protected () extends AttachmentsCell {
  /**
    * Construct a Markdown cell widget.
    */
  def this(options: IOptions) = this()
  /**
    * Handle the rendered state.
    */
  var _handleRendered: js.Any = js.native
  var _monitor: js.Any = js.native
  var _prevText: js.Any = js.native
  var _ready: js.Any = js.native
  var _rendered: js.Any = js.native
  var _renderer: js.Any = js.native
  var _rendermime: js.Any = js.native
  /**
    * Update the rendered input.
    */
  var _updateRenderedInput: js.Any = js.native
  /**
    * The model used by the widget.
    */
  @JSName("model")
  val model_MarkdownCell_ : IMarkdownCellModel = js.native
  /**
    * Whether the cell is rendered.
    */
  var rendered: Boolean = js.native
  /**
    * Render an input instead of the text editor.
    */
  /* protected */ def renderInput(widget: Widget): Unit = js.native
  /**
    * Show the text editor instead of rendered input.
    */
  /* protected */ def showEditor(): Unit = js.native
}

