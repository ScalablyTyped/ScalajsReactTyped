package typingsJapgolly.chartist

import typingsJapgolly.chartist.anon.Dir
import typingsJapgolly.chartist.anon.Len
import typingsJapgolly.chartist.distAxesAxisMod.AxisUnits_
import typingsJapgolly.chartist.distCoreTypesMod.AxisOptions
import typingsJapgolly.chartist.distCoreTypesMod.ChartRect
import typingsJapgolly.chartist.distCoreTypesMod.Label
import typingsJapgolly.chartist.distCoreTypesMod.NormalizedSeries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAxesMod {
  
  @JSImport("chartist/dist/axes", "AutoScaleAxis")
  @js.native
  open class AutoScaleAxis protected ()
    extends typingsJapgolly.chartist.distAxesAutoScaleAxisMod.AutoScaleAxis {
    def this(axisUnit: AxisUnits_, data: js.Array[NormalizedSeries], chartRect: ChartRect, options: AxisOptions) = this()
  }
  
  /* note: abstract class */ @JSImport("chartist/dist/axes", "Axis")
  @js.native
  open class Axis protected ()
    extends typingsJapgolly.chartist.distAxesAxisMod.Axis {
    def this(units: AxisUnits_, chartRect: ChartRect, ticks: js.Array[Label]) = this()
  }
  
  @JSImport("chartist/dist/axes", "FixedScaleAxis")
  @js.native
  open class FixedScaleAxis protected ()
    extends typingsJapgolly.chartist.distAxesFixedScaleAxisMod.FixedScaleAxis {
    def this(axisUnit: AxisUnits_, data: js.Array[NormalizedSeries], chartRect: ChartRect, options: AxisOptions) = this()
  }
  
  @JSImport("chartist/dist/axes", "StepAxis")
  @js.native
  open class StepAxis protected ()
    extends typingsJapgolly.chartist.distAxesStepAxisMod.StepAxis {
    def this(axisUnit: AxisUnits_, _data: Any, chartRect: ChartRect, options: AxisOptions) = this()
  }
  
  object axisUnits {
    
    @JSImport("chartist/dist/axes", "axisUnits.x")
    @js.native
    val x: Dir = js.native
    
    @JSImport("chartist/dist/axes", "axisUnits.y")
    @js.native
    val y: Len = js.native
  }
}
