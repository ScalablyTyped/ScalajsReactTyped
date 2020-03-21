package typingsJapgolly.phosphorDatagrid.textrendererMod

import typingsJapgolly.phosphorDatagrid.cellrendererMod.CellRenderer
import typingsJapgolly.phosphorDatagrid.cellrendererMod.CellRenderer.ConfigOption
import typingsJapgolly.phosphorDatagrid.cellrendererMod.CellRenderer.ICellConfig
import typingsJapgolly.phosphorDatagrid.graphicscontextMod.GraphicsContext
import typingsJapgolly.phosphorDatagrid.textrendererMod.TextRenderer.HorizontalAlignment
import typingsJapgolly.phosphorDatagrid.textrendererMod.TextRenderer.IOptions
import typingsJapgolly.phosphorDatagrid.textrendererMod.TextRenderer.VerticalAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid/lib/textrenderer", "TextRenderer")
@js.native
/**
  * Construct a new text renderer.
  *
  * @param options - The options for initializing the renderer.
  */
class TextRenderer_ () extends CellRenderer {
  def this(options: IOptions) = this()
  /**
    * The CSS color for the cell background.
    */
  val backgroundColor: ConfigOption[String] = js.native
  /**
    * The CSS shorthand font for drawing the text.
    */
  val font: ConfigOption[String] = js.native
  /**
    * The horizontal alignment for the cell text.
    */
  val horizontalAlignment: ConfigOption[HorizontalAlignment] = js.native
  /**
    * The CSS color for drawing the text.
    */
  val textColor: ConfigOption[String] = js.native
  /**
    * The vertical alignment for the cell text.
    */
  val verticalAlignment: ConfigOption[VerticalAlignment] = js.native
  /**
    * Draw the background for the cell.
    *
    * @param gc - The graphics context to use for drawing.
    *
    * @param config - The configuration data for the cell.
    */
  def drawBackground(gc: GraphicsContext, config: ICellConfig): Unit = js.native
  /**
    * Draw the text for the cell.
    *
    * @param gc - The graphics context to use for drawing.
    *
    * @param config - The configuration data for the cell.
    */
  def drawText(gc: GraphicsContext, config: ICellConfig): Unit = js.native
  /**
    * The format function for the cell value.
    */
  def format(config: ICellConfig): String = js.native
}

