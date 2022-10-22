package typingsJapgolly.chartJs.mod

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.chartJs.typesBasicMod.AnyObject
import typingsJapgolly.chartJs.typesElementMod.Element
import typingsJapgolly.chartJs.typesLayoutMod.LayoutItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendElement[TType /* <: ChartType */]
  extends StObject
     with Element[AnyObject, LegendOptions[TType]]
     with LayoutItem {
  
  var chart: Chart[TType, DefaultDataPoint[TType], Any] = js.native
  
  var ctx: CanvasRenderingContext2D = js.native
  
  var legendItems: js.UndefOr[js.Array[LegendItem]] = js.native
}
