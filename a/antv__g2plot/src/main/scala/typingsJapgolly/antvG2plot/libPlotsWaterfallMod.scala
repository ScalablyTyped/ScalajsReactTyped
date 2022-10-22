package typingsJapgolly.antvG2plot

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialWaterfallOptions
import typingsJapgolly.antvG2plot.libCorePlotMod.Plot
import typingsJapgolly.antvG2plot.libPlotsWaterfallTypesMod.WaterfallOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsWaterfallMod {
  
  @JSImport("@antv/g2plot/lib/plots/waterfall", "Waterfall")
  @js.native
  open class Waterfall protected () extends Plot[WaterfallOptions] {
    def this(container: String, options: WaterfallOptions) = this()
    def this(container: HTMLElement, options: WaterfallOptions) = this()
  }
  /* static members */
  object Waterfall {
    
    @JSImport("@antv/g2plot/lib/plots/waterfall", "Waterfall")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 获取 瀑布图 默认配置项
      * 供外部使用
      */
    inline def getDefaultOptions(): PartialWaterfallOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialWaterfallOptions]
  }
}
