package typingsJapgolly.antvG2plot

import typingsJapgolly.antvG2plot.libCoreAdaptorMod.Params
import typingsJapgolly.antvG2plot.libPlotsStockTypesMod.StockOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsStockAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/stock/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[StockOptions]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def axis(params: Params[StockOptions]): Params[StockOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("axis")(params.asInstanceOf[js.Any]).asInstanceOf[Params[StockOptions]]
  
  inline def legend(params: Params[StockOptions]): Params[StockOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("legend")(params.asInstanceOf[js.Any]).asInstanceOf[Params[StockOptions]]
  
  inline def meta(params: Params[StockOptions]): Params[StockOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("meta")(params.asInstanceOf[js.Any]).asInstanceOf[Params[StockOptions]]
  
  inline def tooltip(params: Params[StockOptions]): Params[StockOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(params.asInstanceOf[js.Any]).asInstanceOf[Params[StockOptions]]
}
