package typingsJapgolly.chartist

import typingsJapgolly.chartist.anon.Max
import typingsJapgolly.chartist.distAxesAxisMod.Axis
import typingsJapgolly.chartist.distAxesAxisMod.AxisUnits_
import typingsJapgolly.chartist.distCoreTypesMod.AxisOptions
import typingsJapgolly.chartist.distCoreTypesMod.ChartRect
import typingsJapgolly.chartist.distCoreTypesMod.NormalizedSeries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAxesFixedScaleAxisMod {
  
  @JSImport("chartist/dist/axes/FixedScaleAxis", "FixedScaleAxis")
  @js.native
  open class FixedScaleAxis protected () extends Axis {
    def this(axisUnit: AxisUnits_, data: js.Array[NormalizedSeries], chartRect: ChartRect, options: AxisOptions) = this()
    
    @JSName("range")
    val range_FixedScaleAxis: Max = js.native
  }
}
