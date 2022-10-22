package typingsJapgolly.nivoScales

import typingsJapgolly.d3Scale.mod.ScaleBand_
import typingsJapgolly.nivoScales.distTypesTypesMod.ComputedSerieAxis
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleAxis
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleBand
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleBandSpec
import typingsJapgolly.nivoScales.distTypesTypesMod.StringValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBandScaleMod {
  
  @JSImport("@nivo/scales/dist/types/bandScale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def castBandScale[Input](scale: ScaleBand_[Input]): ScaleBand[Input] = ^.asInstanceOf[js.Dynamic].applyDynamic("castBandScale")(scale.asInstanceOf[js.Any]).asInstanceOf[ScaleBand[Input]]
  
  inline def createBandScale[Input /* <: StringValue */](hasRound: ScaleBandSpec, data: ComputedSerieAxis[Input], size: Double, axis: ScaleAxis): ScaleBand[Input] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBandScale")(hasRound.asInstanceOf[js.Any], data.asInstanceOf[js.Any], size.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[ScaleBand[Input]]
}
