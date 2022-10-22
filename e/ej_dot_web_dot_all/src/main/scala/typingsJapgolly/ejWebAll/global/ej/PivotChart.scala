package typingsJapgolly.ejWebAll.global.ej

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.PivotChart")
@js.native
open class PivotChart protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.PivotChart {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Model) = this()
}
object PivotChart {
  
  @JSGlobal("ej.PivotChart")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.PivotChart.ChartTypes")
  @js.native
  object ChartTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.PivotChart.ChartTypes & Double] = js.native
    
    /* 3 */ val Area: typingsJapgolly.ejWebAll.ej.PivotChart.ChartTypes.Area & Double = js.native
    
    /* 8 */ val Bar: typingsJapgolly.ejWebAll.ej.PivotChart.ChartTypes.Bar & Double = js.native
    
    /* 16 */ val Bubble: typingsJapgolly.ejWebAll.ej.PivotChart.ChartTypes.Bubble & Double = js.native
    
    /* 2 */ val Column: typingsJapgolly.ejWebAll.ej.PivotChart.ChartTypes.Column & Double = js.native
    
    /* 14 */ val Doughnut: typingsJapgolly.ejWebAll.ej.PivotChart.ChartTypes.Doughnut & Double = js.native
    
    /* 13 */ val Funnel: typingsJapgolly.ejWebAll.ej.PivotChart.ChartTypes.Funnel & Double = js.native
    
    /* 0 */ val Line: typingsJapgolly.ejWebAll.ej.PivotChart.ChartTypes.Line & Double = js.native
    
    /* 7 */ val Pie: typingsJapgolly.ejWebAll.ej.PivotChart.ChartTypes.Pie & Double = js.native
    
    /* 12 */ val Pyramid: typingsJapgolly.ejWebAll.ej.PivotChart.ChartTypes.Pyramid & Double = js.native
    
    /* 15 */ val Scatter: typingsJapgolly.ejWebAll.ej.PivotChart.ChartTypes.Scatter & Double = js.native
    
    /* 1 */ val Spline: typingsJapgolly.ejWebAll.ej.PivotChart.ChartTypes.Spline & Double = js.native
    
    /* 4 */ val SplineArea: typingsJapgolly.ejWebAll.ej.PivotChart.ChartTypes.SplineArea & Double = js.native
    
    /* 9 */ val StackingArea: typingsJapgolly.ejWebAll.ej.PivotChart.ChartTypes.StackingArea & Double = js.native
    
    /* 11 */ val StackingBar: typingsJapgolly.ejWebAll.ej.PivotChart.ChartTypes.StackingBar & Double = js.native
    
    /* 10 */ val StackingColumn: typingsJapgolly.ejWebAll.ej.PivotChart.ChartTypes.StackingColumn & Double = js.native
    
    /* 6 */ val StepArea: typingsJapgolly.ejWebAll.ej.PivotChart.ChartTypes.StepArea & Double = js.native
    
    /* 5 */ val StepLine: typingsJapgolly.ejWebAll.ej.PivotChart.ChartTypes.StepLine & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.PivotChart.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.PivotChart.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.PivotChart = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.PivotChart): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
