package typingsJapgolly.bizcharts

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.bizcharts.libCreatePlotMod.BasePlotOptions
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsTreemapChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/TreemapChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TreemapOptions & RefAttributes[Any]] = js.native
  
  trait TreemapOptions
    extends StObject
       with typingsJapgolly.antvG2plot.libPlotsTreemapTypesMod.TreemapOptions
       with BasePlotOptions {
    
    /** maxLevel 旧版g2Plot api，即将废弃请查看最新文档 */
    var maxLevel: js.UndefOr[Double] = js.undefined
  }
  object TreemapOptions {
    
    inline def apply(): TreemapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreemapOptions]
    }
    
    extension [Self <: TreemapOptions](x: Self) {
      
      inline def setMaxLevel(value: Double): Self = StObject.set(x, "maxLevel", value.asInstanceOf[js.Any])
      
      inline def setMaxLevelUndefined: Self = StObject.set(x, "maxLevel", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[TreemapOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsTreemapChartMod.foo` */
  override def _to: ForwardRefExoticComponent[TreemapOptions & RefAttributes[Any]] = default
}
