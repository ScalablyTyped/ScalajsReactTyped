package typingsJapgolly.antvG2plot

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialVennOptions
import typingsJapgolly.antvG2plot.libCorePlotMod.Plot
import typingsJapgolly.antvG2plot.libPlotsVennTypesMod.VennOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsVennMod {
  
  @JSImport("@antv/g2plot/lib/plots/venn", "Venn")
  @js.native
  open class Venn protected () extends Plot[VennOptions] {
    def this(container: String, options: VennOptions) = this()
    def this(container: HTMLElement, options: VennOptions) = this()
  }
  /* static members */
  object Venn {
    
    @JSImport("@antv/g2plot/lib/plots/venn", "Venn")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDefaultOptions(): PartialVennOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialVennOptions]
  }
}
