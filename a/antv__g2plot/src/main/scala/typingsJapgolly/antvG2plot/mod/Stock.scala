package typingsJapgolly.antvG2plot.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialStockOptions
import typingsJapgolly.antvG2plot.libPlotsStockTypesMod.StockOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "Stock")
@js.native
open class Stock protected ()
  extends typingsJapgolly.antvG2plot.libPlotsStockMod.Stock {
  def this(container: String, options: StockOptions) = this()
  def this(container: HTMLElement, options: StockOptions) = this()
}
/* static members */
object Stock {
  
  @JSImport("@antv/g2plot", "Stock")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取 散点图 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialStockOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialStockOptions]
}
