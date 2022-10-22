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

object distAxesAutoScaleAxisMod {
  
  @JSImport("chartist/dist/axes/AutoScaleAxis", "AutoScaleAxis")
  @js.native
  open class AutoScaleAxis protected () extends Axis {
    def this(axisUnit: AxisUnits_, data: js.Array[NormalizedSeries], chartRect: ChartRect, options: AxisOptions) = this()
    
    /* private */ val bounds: Any = js.native
    
    @JSName("range")
    val range_AutoScaleAxis: Max = js.native
  }
}
