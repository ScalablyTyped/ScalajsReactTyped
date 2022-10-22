package typingsJapgolly.antvG2plot

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialTinyColumnOptions
import typingsJapgolly.antvG2plot.libCorePlotMod.Plot
import typingsJapgolly.antvG2plot.libPlotsTinyColumnTypesMod.TinyColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsTinyColumnMod {
  
  @JSImport("@antv/g2plot/lib/plots/tiny-column", "TinyColumn")
  @js.native
  open class TinyColumn protected () extends Plot[TinyColumnOptions] {
    def this(container: String, options: TinyColumnOptions) = this()
    def this(container: HTMLElement, options: TinyColumnOptions) = this()
    
    /**
      * @override
      * @param data
      */
    def changeData(data: js.Array[Double]): Unit = js.native
  }
  /* static members */
  object TinyColumn {
    
    @JSImport("@antv/g2plot/lib/plots/tiny-column", "TinyColumn")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 获取默认配置项
      * 供外部使用
      */
    inline def getDefaultOptions(): PartialTinyColumnOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialTinyColumnOptions]
  }
}
