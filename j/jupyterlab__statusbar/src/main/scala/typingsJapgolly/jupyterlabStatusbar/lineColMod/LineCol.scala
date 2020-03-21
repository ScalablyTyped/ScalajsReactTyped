package typingsJapgolly.jupyterlabStatusbar.lineColMod

import typingsJapgolly.jupyterlabApputils.vdomMod.VDomModel
import typingsJapgolly.jupyterlabApputils.vdomMod.VDomRenderer
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsJapgolly.jupyterlabStatusbar.lineColMod.LineCol.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/statusbar/lib/defaults/lineCol", "LineCol")
@js.native
/**
  * Construct a new LineCol status item.
  */
class LineCol () extends VDomRenderer[Model] {
  /**
    * A click handler for the widget.
    */
  var _handleClick: js.Any = js.native
  /**
    * Handle submission for the widget.
    */
  var _handleSubmit: js.Any = js.native
  var _popup: js.Any = js.native
}

@JSImport("@jupyterlab/statusbar/lib/defaults/lineCol", "LineCol")
@js.native
object LineCol extends js.Object {
  /**
    * A VDom model for a status item tracking the line/column of an editor.
    */
  @js.native
  class Model () extends VDomModel {
    var _column: js.Any = js.native
    var _editor: js.Any = js.native
    var _getAllState: js.Any = js.native
    var _line: js.Any = js.native
    /**
      * React to a change in the cursors of the current editor.
      */
    var _onSelectionChanged: js.Any = js.native
    var _triggerChange: js.Any = js.native
    /**
      * The current column of the model.
      */
    val column: Double = js.native
    /**
      * The current editor of the model.
      */
    var editor: IEditor | Null = js.native
    /**
      * The current line of the model.
      */
    val line: Double = js.native
  }
  
}

