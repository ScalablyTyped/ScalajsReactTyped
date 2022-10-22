package typingsJapgolly.nivoBar

import typingsJapgolly.nivoBar.anon.Bars
import typingsJapgolly.nivoBar.anon.FormatValue
import typingsJapgolly.nivoBar.distTypesTypesMod.BarDatum
import typingsJapgolly.nivoBar.distTypesTypesMod.BarSvgProps
import typingsJapgolly.nivoBar.nivoBarStrings.data
import typingsJapgolly.nivoBar.nivoBarStrings.height
import typingsJapgolly.nivoBar.nivoBarStrings.indexScale
import typingsJapgolly.nivoBar.nivoBarStrings.innerPadding
import typingsJapgolly.nivoBar.nivoBarStrings.keys
import typingsJapgolly.nivoBar.nivoBarStrings.layout
import typingsJapgolly.nivoBar.nivoBarStrings.maxValue
import typingsJapgolly.nivoBar.nivoBarStrings.minValue
import typingsJapgolly.nivoBar.nivoBarStrings.padding
import typingsJapgolly.nivoBar.nivoBarStrings.reverse
import typingsJapgolly.nivoBar.nivoBarStrings.valueScale
import typingsJapgolly.nivoBar.nivoBarStrings.width
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComputeStackedMod {
  
  @JSImport("@nivo/bar/dist/types/compute/stacked", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateStackedBars[RawDatum /* <: BarDatum */](
    hasDataLayoutMinValueMaxValueReverseWidthHeightPaddingValueScaleIndexScaleConfigHiddenIdsProps: (Pick[
      Required[BarSvgProps[RawDatum]], 
      keys | maxValue | minValue | innerPadding | padding | valueScale | indexScale | layout | reverse | height | width | data
    ]) & FormatValue[RawDatum]
  ): Bars[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateStackedBars")(hasDataLayoutMinValueMaxValueReverseWidthHeightPaddingValueScaleIndexScaleConfigHiddenIdsProps.asInstanceOf[js.Any]).asInstanceOf[Bars[RawDatum]]
}
