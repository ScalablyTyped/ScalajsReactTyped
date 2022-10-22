package typingsJapgolly.jupyterlabUiComponents

import typingsJapgolly.jupyterlabTranslation.libTokensMod.ITranslator
import typingsJapgolly.jupyterlabUiComponents.libIconWidgetsTabbarsvgMod.DockPanelSvg.IOptions
import typingsJapgolly.luminoWidgets.mod.DockPanel
import typingsJapgolly.luminoWidgets.mod.TabBar
import typingsJapgolly.luminoWidgets.mod.TabPanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconWidgetsTabbarsvgMod {
  
  @JSImport("@jupyterlab/ui-components/lib/icon/widgets/tabbarsvg", "DockPanelSvg")
  @js.native
  /**
    * Construct a new dock panel.
    *
    * @param options - The options for initializing the panel.
    */
  open class DockPanelSvg () extends DockPanel {
    def this(options: IOptions) = this()
  }
  object DockPanelSvg {
    
    /**
      * A modified implementation of the DockPanel Renderer.
      */
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets/tabbarsvg", "DockPanelSvg.Renderer")
    @js.native
    open class Renderer ()
      extends typingsJapgolly.luminoWidgets.mod.DockPanel.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets/tabbarsvg", "DockPanelSvg.defaultRenderer")
    @js.native
    val defaultRenderer: Renderer = js.native
    
    trait IOptions
      extends StObject
         with typingsJapgolly.luminoWidgets.typesDockpanelMod.DockPanel.IOptions {
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon/widgets/tabbarsvg", "TabBarSvg")
  @js.native
  /**
    * Construct a new tab bar. Overrides the default renderer.
    *
    * @param options - The options for initializing the tab bar.
    */
  open class TabBarSvg[T] () extends TabBar[T] {
    def this(options: typingsJapgolly.jupyterlabUiComponents.libIconWidgetsTabbarsvgMod.TabBarSvg.IOptions[T]) = this()
  }
  object TabBarSvg {
    
    /**
      * A modified implementation of the TabBar Renderer.
      */
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets/tabbarsvg", "TabBarSvg.Renderer")
    @js.native
    open class Renderer ()
      extends typingsJapgolly.luminoWidgets.mod.TabBar.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets/tabbarsvg", "TabBarSvg.defaultRenderer")
    @js.native
    val defaultRenderer: Renderer = js.native
    
    trait IOptions[T]
      extends StObject
         with typingsJapgolly.luminoWidgets.typesTabbarMod.TabBar.IOptions[T] {
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IOptions {
      
      inline def apply[T](): typingsJapgolly.jupyterlabUiComponents.libIconWidgetsTabbarsvgMod.TabBarSvg.IOptions[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.jupyterlabUiComponents.libIconWidgetsTabbarsvgMod.TabBarSvg.IOptions[T]]
      }
      
      extension [Self <: typingsJapgolly.jupyterlabUiComponents.libIconWidgetsTabbarsvgMod.TabBarSvg.IOptions[?], T](x: Self & typingsJapgolly.jupyterlabUiComponents.libIconWidgetsTabbarsvgMod.TabBarSvg.IOptions[T]) {
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon/widgets/tabbarsvg", "TabPanelSvg")
  @js.native
  /**
    * Construct a new tab panel.
    *
    * @param options - The options for initializing the tab panel.
    */
  open class TabPanelSvg () extends TabPanel {
    def this(options: typingsJapgolly.luminoWidgets.typesTabpanelMod.TabPanel.IOptions) = this()
  }
}
