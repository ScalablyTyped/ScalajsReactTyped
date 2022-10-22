package typingsJapgolly.luminoWidgets

import typingsJapgolly.luminoSignaling.mod.ISignal
import typingsJapgolly.luminoWidgets.typesPanelMod.Panel
import typingsJapgolly.luminoWidgets.typesStackedlayoutMod.StackedLayout
import typingsJapgolly.luminoWidgets.typesStackedpanelMod.StackedPanel.IOptions
import typingsJapgolly.luminoWidgets.typesWidgetMod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesStackedpanelMod {
  
  @JSImport("@lumino/widgets/types/stackedpanel", "StackedPanel")
  @js.native
  /**
    * Construct a new stacked panel.
    *
    * @param options - The options for initializing the panel.
    */
  open class StackedPanel () extends Panel {
    def this(options: IOptions) = this()
    
    /* private */ var _widgetRemoved: Any = js.native
    
    /**
      * A signal emitted when a widget is removed from a stacked panel.
      */
    val widgetRemoved: ISignal[this.type, Widget] = js.native
  }
  object StackedPanel {
    
    /**
      * An options object for creating a stacked panel.
      */
    trait IOptions extends StObject {
      
      /**
        * The stacked layout to use for the stacked panel.
        *
        * The default is a new `StackedLayout`.
        */
      var layout: js.UndefOr[StackedLayout] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setLayout(value: StackedLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
        
        inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      }
    }
  }
}
