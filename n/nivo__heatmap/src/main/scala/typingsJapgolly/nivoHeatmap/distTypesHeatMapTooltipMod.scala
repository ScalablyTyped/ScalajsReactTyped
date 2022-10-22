package typingsJapgolly.nivoHeatmap

import typingsJapgolly.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.TooltipProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHeatMapTooltipMod {
  
  @JSImport("@nivo/heatmap/dist/types/HeatMapTooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def HeatMapTooltip[Datum /* <: HeatMapDatum */](hasCell: TooltipProps[Datum]): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("HeatMapTooltip")(hasCell.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
}
