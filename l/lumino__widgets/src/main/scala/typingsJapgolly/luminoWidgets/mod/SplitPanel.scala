package typingsJapgolly.luminoWidgets.mod

import typingsJapgolly.luminoWidgets.typesSplitpanelMod.SplitPanel.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets", "SplitPanel")
@js.native
/**
  * Construct a new split panel.
  *
  * @param options - The options for initializing the split panel.
  */
open class SplitPanel ()
  extends typingsJapgolly.luminoWidgets.typesSplitpanelMod.SplitPanel {
  def this(options: IOptions) = this()
}
object SplitPanel {
  
  @JSImport("@lumino/widgets", "SplitPanel")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The default implementation of `IRenderer`.
    */
  @JSImport("@lumino/widgets", "SplitPanel.Renderer")
  @js.native
  open class Renderer ()
    extends typingsJapgolly.luminoWidgets.typesSplitpanelMod.SplitPanel.Renderer
  
  /**
    * The default `Renderer` instance.
    */
  @JSImport("@lumino/widgets", "SplitPanel.defaultRenderer")
  @js.native
  val defaultRenderer: typingsJapgolly.luminoWidgets.typesSplitpanelMod.SplitPanel.Renderer = js.native
  
  /**
    * Get the split panel stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The split panel stretch factor for the widget.
    */
  inline def getStretch(widget: typingsJapgolly.luminoWidgets.typesWidgetMod.Widget): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStretch")(widget.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Set the split panel stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the stretch factor.
    */
  inline def setStretch(widget: typingsJapgolly.luminoWidgets.typesWidgetMod.Widget, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStretch")(widget.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
