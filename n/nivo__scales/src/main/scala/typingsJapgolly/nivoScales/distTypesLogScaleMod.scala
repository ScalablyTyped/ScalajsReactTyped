package typingsJapgolly.nivoScales

import typingsJapgolly.nivoScales.distTypesTypesMod.ComputedSerieAxis
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleAxis
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleLog
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleLogSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLogScaleMod {
  
  @JSImport("@nivo/scales/dist/types/logScale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLogScale(hasBaseMinMax: ScaleLogSpec, data: ComputedSerieAxis[Double], size: Double, axis: ScaleAxis): ScaleLog = (^.asInstanceOf[js.Dynamic].applyDynamic("createLogScale")(hasBaseMinMax.asInstanceOf[js.Any], data.asInstanceOf[js.Any], size.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[ScaleLog]
}
