package typingsJapgolly.jupyterlabCells.mod

import typingsJapgolly.jupyterlabCells.widgetMod.Cell.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "Cell")
@js.native
class Cell protected ()
  extends typingsJapgolly.jupyterlabCells.widgetMod.Cell {
  /**
    * Construct a new base cell widget.
    */
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/cells", "Cell")
@js.native
object Cell extends js.Object {
  /**
    * The default implementation of an `IContentFactory`.
    *
    * This includes a CodeMirror editor factory to make it easy to use out of the box.
    */
  @js.native
  /**
    * Create a content factory for a cell.
    */
  class ContentFactory ()
    extends typingsJapgolly.jupyterlabCells.widgetMod.Cell.ContentFactory {
    def this(options: typingsJapgolly.jupyterlabCells.widgetMod.Cell.ContentFactory.IOptions) = this()
  }
  
  /**
    * The default content factory for cells.
    */
  val defaultContentFactory: typingsJapgolly.jupyterlabCells.widgetMod.Cell.ContentFactory = js.native
  /**
    * A namespace for cell content factory.
    */
  @js.native
  object ContentFactory extends js.Object
  
}

