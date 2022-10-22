package typingsJapgolly.antvG2plot

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialRadialBarOptions
import typingsJapgolly.antvG2plot.libCorePlotMod.Plot
import typingsJapgolly.antvG2plot.libPlotsRadialBarTypesMod.RadialBarOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsRadialBarMod {
  
  @JSImport("@antv/g2plot/lib/plots/radial-bar", "RadialBar")
  @js.native
  open class RadialBar protected () extends Plot[RadialBarOptions] {
    def this(container: String, options: RadialBarOptions) = this()
    def this(container: HTMLElement, options: RadialBarOptions) = this()
  }
  /* static members */
  object RadialBar {
    
    @JSImport("@antv/g2plot/lib/plots/radial-bar", "RadialBar")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDefaultOptions(): PartialRadialBarOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialRadialBarOptions]
  }
}
