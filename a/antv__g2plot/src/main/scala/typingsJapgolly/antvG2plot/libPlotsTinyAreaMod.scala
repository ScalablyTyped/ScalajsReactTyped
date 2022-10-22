package typingsJapgolly.antvG2plot

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialTinyAreaOptions
import typingsJapgolly.antvG2plot.libCorePlotMod.Plot
import typingsJapgolly.antvG2plot.libPlotsTinyAreaTypesMod.TinyAreaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsTinyAreaMod {
  
  @JSImport("@antv/g2plot/lib/plots/tiny-area", "TinyArea")
  @js.native
  open class TinyArea protected () extends Plot[TinyAreaOptions] {
    def this(container: String, options: TinyAreaOptions) = this()
    def this(container: HTMLElement, options: TinyAreaOptions) = this()
    
    /**
      * @override
      * @param data
      */
    def changeData(data: js.Array[Double]): Unit = js.native
  }
  /* static members */
  object TinyArea {
    
    @JSImport("@antv/g2plot/lib/plots/tiny-area", "TinyArea")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 获取默认配置项
      * 供外部使用
      */
    inline def getDefaultOptions(): PartialTinyAreaOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialTinyAreaOptions]
  }
}
