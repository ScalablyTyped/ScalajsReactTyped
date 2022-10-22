package typingsJapgolly.chartist

import org.scalablytyped.runtime.Instantiable4
import typingsJapgolly.chartist.distAxesAutoScaleAxisMod.AutoScaleAxis
import typingsJapgolly.chartist.distAxesAxisMod.AxisUnits_
import typingsJapgolly.chartist.distAxesFixedScaleAxisMod.FixedScaleAxis
import typingsJapgolly.chartist.distAxesStepAxisMod.StepAxis
import typingsJapgolly.chartist.distCoreTypesMod.AxisOptions
import typingsJapgolly.chartist.distCoreTypesMod.ChartRect
import typingsJapgolly.chartist.distCoreTypesMod.NormalizedSeries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAxesTypesMod {
  
  type AxisType = Instantiable4[
    /* axisUnit */ AxisUnits_, 
    (/* _data */ Any) | (/* data */ js.Array[NormalizedSeries]), 
    /* chartRect */ ChartRect, 
    /* options */ AxisOptions, 
    AutoScaleAxis | FixedScaleAxis | StepAxis
  ]
}
