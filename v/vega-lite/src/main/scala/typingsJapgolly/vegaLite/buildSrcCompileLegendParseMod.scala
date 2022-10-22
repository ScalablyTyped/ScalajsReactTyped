package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.anon.PartialRecordfillcolorfil
import typingsJapgolly.vegaLite.buildSrcChannelMod.NonPositionScaleChannel
import typingsJapgolly.vegaLite.buildSrcCompileLegendComponentMod.LegendComponent
import typingsJapgolly.vegaLite.buildSrcCompileModelMod.Model
import typingsJapgolly.vegaLite.buildSrcCompileUnitMod.UnitModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileLegendParseMod {
  
  @JSImport("vega-lite/build/src/compile/legend/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeLegendComponent(mergedLegend: LegendComponent, childLegend: LegendComponent): LegendComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeLegendComponent")(mergedLegend.asInstanceOf[js.Any], childLegend.asInstanceOf[js.Any])).asInstanceOf[LegendComponent]
  
  inline def parseLegend(model: Model): PartialRecordfillcolorfil = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLegend")(model.asInstanceOf[js.Any]).asInstanceOf[PartialRecordfillcolorfil]
  
  inline def parseLegendForChannel(model: UnitModel, channel: NonPositionScaleChannel): LegendComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("parseLegendForChannel")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[LegendComponent]
}
