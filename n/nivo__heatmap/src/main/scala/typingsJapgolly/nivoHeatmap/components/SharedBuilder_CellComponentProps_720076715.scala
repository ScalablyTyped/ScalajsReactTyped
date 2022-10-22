package typingsJapgolly.nivoHeatmap.components

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.ComputedCell
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_CellComponentProps_720076715[Datum /* <: HeatMapDatum */] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def onClick(
    value: /* cell */ ComputedCell[Datum] => js.Function1[/* event */ ReactMouseEventFrom[Element], Unit]
  ): this.type = set("onClick", js.Any.fromFunction1(value))
  
  inline def onMouseEnter(
    value: /* cell */ ComputedCell[Datum] => js.Function1[/* event */ ReactMouseEventFrom[Element], Unit]
  ): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
  
  inline def onMouseLeave(
    value: /* cell */ ComputedCell[Datum] => js.Function1[/* event */ ReactMouseEventFrom[Element], Unit]
  ): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
  
  inline def onMouseMove(
    value: /* cell */ ComputedCell[Datum] => js.Function1[/* event */ ReactMouseEventFrom[Element], Unit]
  ): this.type = set("onMouseMove", js.Any.fromFunction1(value))
}
