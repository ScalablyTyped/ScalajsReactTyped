package typingsJapgolly.nivoBar

import typingsJapgolly.nivoBar.anon.Direction
import typingsJapgolly.nivoBar.distTypesTypesMod.BarDatum
import typingsJapgolly.nivoBar.distTypesTypesMod.BarSvgProps
import typingsJapgolly.nivoBar.distTypesTypesMod.BarsWithHidden
import typingsJapgolly.nivoBar.distTypesTypesMod.LegendData
import typingsJapgolly.nivoBar.distTypesTypesMod.LegendLabelDatum
import typingsJapgolly.nivoBar.nivoBarStrings.groupMode
import typingsJapgolly.nivoBar.nivoBarStrings.grouped
import typingsJapgolly.nivoBar.nivoBarStrings.horizontal
import typingsJapgolly.nivoBar.nivoBarStrings.layout
import typingsJapgolly.nivoBar.nivoBarStrings.reverse
import typingsJapgolly.nivoBar.nivoBarStrings.stacked
import typingsJapgolly.nivoBar.nivoBarStrings.vertical
import typingsJapgolly.nivoLegends.distTypesTypesMod.LegendDirection
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComputeLegendsMod {
  
  @JSImport("@nivo/bar/dist/types/compute/legends", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLegendData[RawDatum /* <: BarDatum */](
    hasBarsDirectionFromGroupModeLayoutLegendLabelReverse: (Pick[Required[BarSvgProps[RawDatum]], groupMode | layout | reverse]) & Direction[RawDatum]
  ): js.Array[LegendData] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLegendData")(hasBarsDirectionFromGroupModeLayoutLegendLabelReverse.asInstanceOf[js.Any]).asInstanceOf[js.Array[LegendData]]
  
  inline def getLegendDataForIndexes[RawDatum /* <: BarDatum */](
    bars: BarsWithHidden[RawDatum],
    layout: horizontal | vertical,
    getLegendLabel: js.Function1[/* datum */ LegendLabelDatum[RawDatum], String]
  ): js.Array[LegendData] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLegendDataForIndexes")(bars.asInstanceOf[js.Any], layout.asInstanceOf[js.Any], getLegendLabel.asInstanceOf[js.Any])).asInstanceOf[js.Array[LegendData]]
  
  inline def getLegendDataForKeys[RawDatum /* <: BarDatum */](
    bars: BarsWithHidden[RawDatum],
    layout: horizontal | vertical,
    direction: LegendDirection,
    groupMode: grouped | stacked,
    reverse: Boolean,
    getLegendLabel: js.Function1[/* datum */ LegendLabelDatum[RawDatum], String]
  ): js.Array[LegendData] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLegendDataForKeys")(bars.asInstanceOf[js.Any], layout.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], groupMode.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], getLegendLabel.asInstanceOf[js.Any])).asInstanceOf[js.Array[LegendData]]
}
