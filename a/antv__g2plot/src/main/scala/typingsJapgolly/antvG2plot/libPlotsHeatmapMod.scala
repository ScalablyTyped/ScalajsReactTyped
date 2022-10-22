package typingsJapgolly.antvG2plot

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialHeatmapOptions
import typingsJapgolly.antvG2plot.libCorePlotMod.Plot
import typingsJapgolly.antvG2plot.libPlotsHeatmapTypesMod.HeatmapOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsHeatmapMod {
  
  @JSImport("@antv/g2plot/lib/plots/heatmap", "Heatmap")
  @js.native
  open class Heatmap protected () extends Plot[HeatmapOptions] {
    def this(container: String, options: HeatmapOptions) = this()
    def this(container: HTMLElement, options: HeatmapOptions) = this()
  }
  /* static members */
  object Heatmap {
    
    @JSImport("@antv/g2plot/lib/plots/heatmap", "Heatmap")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 获取 柱形图 默认配置项
      * 供外部使用
      */
    inline def getDefaultOptions(): PartialHeatmapOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialHeatmapOptions]
  }
}
