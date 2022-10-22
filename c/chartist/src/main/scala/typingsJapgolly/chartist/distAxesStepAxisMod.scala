package typingsJapgolly.chartist

import typingsJapgolly.chartist.distAxesAxisMod.Axis
import typingsJapgolly.chartist.distAxesAxisMod.AxisUnits_
import typingsJapgolly.chartist.distCoreTypesMod.AxisOptions
import typingsJapgolly.chartist.distCoreTypesMod.ChartRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAxesStepAxisMod {
  
  @JSImport("chartist/dist/axes/StepAxis", "StepAxis")
  @js.native
  open class StepAxis protected () extends Axis {
    def this(axisUnit: AxisUnits_, _data: Any, chartRect: ChartRect, options: AxisOptions) = this()
    
    /* private */ val stepLength: Any = js.native
    
    val stretch: Boolean = js.native
  }
}
