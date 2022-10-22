package typingsJapgolly.luminoWidgets.mod

import typingsJapgolly.luminoWidgets.typesLayoutMod.Layout.HorizontalAlignment
import typingsJapgolly.luminoWidgets.typesLayoutMod.Layout.IOptions
import typingsJapgolly.luminoWidgets.typesLayoutMod.Layout.VerticalAlignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@lumino/widgets", "Layout")
@js.native
/**
  * Construct a new layout.
  *
  * @param options - The options for initializing the layout.
  */
open class Layout ()
  extends typingsJapgolly.luminoWidgets.typesLayoutMod.Layout {
  def this(options: IOptions) = this()
}
object Layout {
  
  @JSImport("@lumino/widgets", "Layout")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get the horizontal alignment for a widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The horizontal alignment for the widget.
    *
    * #### Notes
    * If the layout width allocated to a widget is larger than its max
    * width, the horizontal alignment controls how the widget is placed
    * within the extra horizontal space.
    *
    * If the allocated width is less than the widget's max width, the
    * horizontal alignment has no effect.
    *
    * Some layout implementations may ignore horizontal alignment.
    */
  inline def getHorizontalAlignment(widget: typingsJapgolly.luminoWidgets.typesWidgetMod.Widget): HorizontalAlignment = ^.asInstanceOf[js.Dynamic].applyDynamic("getHorizontalAlignment")(widget.asInstanceOf[js.Any]).asInstanceOf[HorizontalAlignment]
  
  /**
    * Get the vertical alignment for a widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The vertical alignment for the widget.
    *
    * #### Notes
    * If the layout height allocated to a widget is larger than its max
    * height, the vertical alignment controls how the widget is placed
    * within the extra vertical space.
    *
    * If the allocated height is less than the widget's max height, the
    * vertical alignment has no effect.
    *
    * Some layout implementations may ignore vertical alignment.
    */
  inline def getVerticalAlignment(widget: typingsJapgolly.luminoWidgets.typesWidgetMod.Widget): VerticalAlignment = ^.asInstanceOf[js.Dynamic].applyDynamic("getVerticalAlignment")(widget.asInstanceOf[js.Any]).asInstanceOf[VerticalAlignment]
  
  /**
    * Set the horizontal alignment for a widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the horizontal alignment.
    *
    * #### Notes
    * If the layout width allocated to a widget is larger than its max
    * width, the horizontal alignment controls how the widget is placed
    * within the extra horizontal space.
    *
    * If the allocated width is less than the widget's max width, the
    * horizontal alignment has no effect.
    *
    * Some layout implementations may ignore horizontal alignment.
    *
    * Changing the horizontal alignment will post an `update-request`
    * message to widget's parent, provided the parent has a layout
    * installed.
    */
  inline def setHorizontalAlignment(widget: typingsJapgolly.luminoWidgets.typesWidgetMod.Widget, value: HorizontalAlignment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setHorizontalAlignment")(widget.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Set the vertical alignment for a widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the vertical alignment.
    *
    * #### Notes
    * If the layout height allocated to a widget is larger than its max
    * height, the vertical alignment controls how the widget is placed
    * within the extra vertical space.
    *
    * If the allocated height is less than the widget's max height, the
    * vertical alignment has no effect.
    *
    * Some layout implementations may ignore vertical alignment.
    *
    * Changing the horizontal alignment will post an `update-request`
    * message to widget's parent, provided the parent has a layout
    * installed.
    */
  inline def setVerticalAlignment(widget: typingsJapgolly.luminoWidgets.typesWidgetMod.Widget, value: VerticalAlignment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVerticalAlignment")(widget.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
