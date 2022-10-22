package typingsJapgolly.nivoWaffle

import typingsJapgolly.nivoWaffle.distTypesTypesMod.CanvasProps
import typingsJapgolly.nivoWaffle.distTypesTypesMod.Datum
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.borderColor
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.borderWidth
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.colors
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.columns
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.data
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.emptyColor
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.emptyOpacity
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.fillDirection
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.isInteractive
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.legends
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.margin
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.onClick
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.onMouseMove
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.padding
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.pixelRatio
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.role
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.rows
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.theme
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.tooltip
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.total
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.valueFormat
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveWaffleCanvasMod {
  
  @JSImport("@nivo/waffle/dist/types/ResponsiveWaffleCanvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveWaffleCanvas[RawDatum /* <: Datum */](
    props: Pick[
      CanvasProps[RawDatum], 
      legends | onClick | onMouseMove | data | valueFormat | fillDirection | padding | colors | emptyColor | borderColor | margin | theme | emptyOpacity | borderWidth | isInteractive | tooltip | role | total | rows | columns | pixelRatio
    ]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveWaffleCanvas")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
