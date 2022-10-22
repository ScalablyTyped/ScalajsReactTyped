package typingsJapgolly.antvG2plot

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialStockOptions
import typingsJapgolly.antvG2plot.libCorePlotMod.Plot
import typingsJapgolly.antvG2plot.libPlotsStockTypesMod.StockOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsStockMod {
  
  @JSImport("@antv/g2plot/lib/plots/stock", "Stock")
  @js.native
  open class Stock protected () extends Plot[StockOptions] {
    def this(container: String, options: StockOptions) = this()
    def this(container: HTMLElement, options: StockOptions) = this()
    
    /**
      * @override
      * @param data
      */
    def changeData(data: js.Array[Record[String, Any]]): Unit = js.native
  }
  /* static members */
  object Stock {
    
    @JSImport("@antv/g2plot/lib/plots/stock", "Stock")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 获取 散点图 默认配置项
      * 供外部使用
      */
    inline def getDefaultOptions(): PartialStockOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialStockOptions]
  }
}
