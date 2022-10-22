package typingsJapgolly.antvG2plot

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialSankeyOptions
import typingsJapgolly.antvG2plot.libCorePlotMod.Plot
import typingsJapgolly.antvG2plot.libPlotsSankeyTypesMod.SankeyOptions
import typingsJapgolly.antvG2plot.libTypesCommonMod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsSankeyMod {
  
  @JSImport("@antv/g2plot/lib/plots/sankey", "Sankey")
  @js.native
  open class Sankey protected () extends Plot[SankeyOptions] {
    def this(container: String, options: SankeyOptions) = this()
    def this(container: HTMLElement, options: SankeyOptions) = this()
    
    /**
      * @override
      * @param data
      */
    def changeData(data: Data): Unit = js.native
  }
  /* static members */
  object Sankey {
    
    @JSImport("@antv/g2plot/lib/plots/sankey", "Sankey")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDefaultOptions(): PartialSankeyOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialSankeyOptions]
  }
}
