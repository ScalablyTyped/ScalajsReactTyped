package typingsJapgolly.luminoWidgets.mod

import typingsJapgolly.luminoWidgets.anon.PartialICellConfig
import typingsJapgolly.luminoWidgets.typesGridlayoutMod.GridLayout.ICellConfig
import typingsJapgolly.luminoWidgets.typesGridlayoutMod.GridLayout.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets", "GridLayout")
@js.native
/**
  * Construct a new grid layout.
  *
  * @param options - The options for initializing the layout.
  */
open class GridLayout ()
  extends typingsJapgolly.luminoWidgets.typesGridlayoutMod.GridLayout {
  def this(options: IOptions) = this()
}
object GridLayout {
  
  @JSImport("@lumino/widgets", "GridLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get the cell config for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The cell config for the widget.
    */
  inline def getCellConfig(widget: typingsJapgolly.luminoWidgets.typesWidgetMod.Widget): ICellConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellConfig")(widget.asInstanceOf[js.Any]).asInstanceOf[ICellConfig]
  
  /**
    * Set the cell config for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the cell config.
    */
  inline def setCellConfig(widget: typingsJapgolly.luminoWidgets.typesWidgetMod.Widget, value: PartialICellConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCellConfig")(widget.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
