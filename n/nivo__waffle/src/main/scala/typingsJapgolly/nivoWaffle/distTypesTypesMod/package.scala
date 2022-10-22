package typingsJapgolly.nivoWaffle.distTypesTypesMod

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.nivoWaffle.distTypesTypesMod.^
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.cells
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def isDataCell[RawDatum /* <: Datum */](cell: Cell[RawDatum]): /* is @nivo/waffle.@nivo/waffle/dist/types/types.DataCell<RawDatum> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataCell")(cell.asInstanceOf[js.Any]).asInstanceOf[/* is @nivo/waffle.@nivo/waffle/dist/types/types.DataCell<RawDatum> */ Boolean]

type DatumFormattedValue = String | Double

type DatumId = String | Double

type DatumLabel = String | Double

type DatumValue = Double

/* Inlined std.Exclude<@nivo/waffle.@nivo/waffle/dist/types/types.LayerId, 'legends'> */
type HtmlLayerId = cells

type MouseHandler[RawDatum /* <: Datum */, ElementType] = js.Function2[
/* cell */ Cell[RawDatum], 
/* event */ ReactMouseEventFrom[ElementType & Element], 
Unit]

type SvgLayer[RawDatum /* <: Datum */] = LayerId | FC[CustomLayerProps[RawDatum]]

type ValueFormatter = js.Function1[/* value */ Double, DatumFormattedValue]
