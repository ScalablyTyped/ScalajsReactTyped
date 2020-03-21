package typingsJapgolly.phosphorWidgets.boxpanelMod

import typingsJapgolly.phosphorWidgets.boxpanelMod.BoxPanel.Alignment
import typingsJapgolly.phosphorWidgets.boxpanelMod.BoxPanel.Direction
import typingsJapgolly.phosphorWidgets.boxpanelMod.BoxPanel.IOptions
import typingsJapgolly.phosphorWidgets.panelMod.Panel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/boxpanel", "BoxPanel")
@js.native
/**
  * Construct a new box panel.
  *
  * @param options - The options for initializing the box panel.
  */
class BoxPanel_ () extends Panel {
  def this(options: IOptions) = this()
  /**
    * Get the content alignment for the box panel.
    *
    * #### Notes
    * This is the alignment of the widgets in the layout direction.
    *
    * The alignment has no effect if the widgets can expand to fill the
    * entire box layout.
    */
  /**
    * Set the content alignment for the box panel.
    *
    * #### Notes
    * This is the alignment of the widgets in the layout direction.
    *
    * The alignment has no effect if the widgets can expand to fill the
    * entire box layout.
    */
  var alignment: Alignment = js.native
  /**
    * Get the layout direction for the box panel.
    */
  /**
    * Set the layout direction for the box panel.
    */
  var direction: Direction = js.native
  /**
    * Get the inter-element spacing for the box panel.
    */
  /**
    * Set the inter-element spacing for the box panel.
    */
  var spacing: Double = js.native
}

