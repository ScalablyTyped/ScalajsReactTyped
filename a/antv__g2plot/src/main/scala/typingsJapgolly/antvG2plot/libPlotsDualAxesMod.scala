package typingsJapgolly.antvG2plot

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.libCorePlotMod.Plot
import typingsJapgolly.antvG2plot.libPlotsDualAxesTypesMod.DualAxesOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsDualAxesMod {
  
  @JSImport("@antv/g2plot/lib/plots/dual-axes", "DualAxes")
  @js.native
  open class DualAxes protected () extends Plot[DualAxesOptions] {
    def this(container: String, options: DualAxesOptions) = this()
    def this(container: HTMLElement, options: DualAxesOptions) = this()
  }
}
