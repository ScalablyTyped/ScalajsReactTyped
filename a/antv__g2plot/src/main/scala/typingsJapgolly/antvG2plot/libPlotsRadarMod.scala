package typingsJapgolly.antvG2plot

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.libCorePlotMod.Plot
import typingsJapgolly.antvG2plot.libPlotsRadarTypesMod.RadarOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsRadarMod {
  
  @JSImport("@antv/g2plot/lib/plots/radar", "Radar")
  @js.native
  open class Radar protected () extends Plot[RadarOptions] {
    def this(container: String, options: RadarOptions) = this()
    def this(container: HTMLElement, options: RadarOptions) = this()
  }
}
