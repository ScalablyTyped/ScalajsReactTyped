package typingsJapgolly.ejWebAll.global.ej.datavisualization

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import typingsJapgolly.ejWebAll.ej.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.datavisualization.RangeNavigator")
@js.native
open class RangeNavigator protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: Model) = this()
  def this(element: JQuery, options: Model) = this()
}
object RangeNavigator {
  
  @JSGlobal("ej.datavisualization.RangeNavigator")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.datavisualization.RangeNavigator.FontStyle")
  @js.native
  object FontStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.FontStyle & Double] = js.native
    
    /* 1 */ val Bold: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.FontStyle.Bold & Double = js.native
    
    /* 2 */ val Italic: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.FontStyle.Italic & Double = js.native
    
    /* 0 */ val Normal: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.FontStyle.Normal & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.RangeNavigator.FontWeight")
  @js.native
  object FontWeight extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.FontWeight & Double] = js.native
    
    /* 1 */ val Lighter: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.FontWeight.Lighter & Double = js.native
    
    /* 0 */ val Regular: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.FontWeight.Regular & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.RangeNavigator.HorizontalAlignment")
  @js.native
  object HorizontalAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.HorizontalAlignment & Double
      ] = js.native
    
    /* 1 */ val Left: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.HorizontalAlignment.Left & Double = js.native
    
    /* 0 */ val Middle: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.HorizontalAlignment.Middle & Double = js.native
    
    /* 2 */ val Right: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.HorizontalAlignment.Right & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.RangeNavigator.IntervalType")
  @js.native
  object IntervalType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.IntervalType & Double
      ] = js.native
    
    /* 4 */ val Days: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.IntervalType.Days & Double = js.native
    
    /* 5 */ val Hours: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.IntervalType.Hours & Double = js.native
    
    /* 6 */ val Minutes: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.IntervalType.Minutes & Double = js.native
    
    /* 2 */ val Months: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.IntervalType.Months & Double = js.native
    
    /* 1 */ val Quarters: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.IntervalType.Quarters & Double = js.native
    
    /* 3 */ val Weeks: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.IntervalType.Weeks & Double = js.native
    
    /* 0 */ val Years: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.IntervalType.Years & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.RangeNavigator.LabelIntersectAction")
  @js.native
  object LabelIntersectAction extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.LabelIntersectAction & Double
      ] = js.native
    
    /* 1 */ val Hide: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.LabelIntersectAction.Hide & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.LabelIntersectAction.None & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.RangeNavigator.LabelPlacement")
  @js.native
  object LabelPlacement extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.LabelPlacement & Double
      ] = js.native
    
    /* 0 */ val Inside: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.LabelPlacement.Inside & Double = js.native
    
    /* 1 */ val Outside: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.LabelPlacement.Outside & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.datavisualization.RangeNavigator.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.datavisualization.RangeNavigator.Position")
  @js.native
  object Position extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.Position & Double] = js.native
    
    /* 1 */ val Bottom: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.Position.Bottom & Double = js.native
    
    /* 0 */ val Top: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.Position.Top & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.RangeNavigator.RangePadding")
  @js.native
  object RangePadding extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.RangePadding & Double
      ] = js.native
    
    /* 0 */ val Additional: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.RangePadding.Additional & Double = js.native
    
    /* 2 */ val None: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.RangePadding.None & Double = js.native
    
    /* 1 */ val Normal: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.RangePadding.Normal & Double = js.native
    
    /* 3 */ val Round: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.RangePadding.Round & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.RangeNavigator.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.Type & Double] = js.native
    
    /* 0 */ val Area: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.Type.Area & Double = js.native
    
    /* 1 */ val Line: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.Type.Line & Double = js.native
    
    /* 2 */ val Spline: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.Type.Spline & Double = js.native
    
    /* 4 */ val SplineArea: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.Type.SplineArea & Double = js.native
    
    /* 3 */ val StepArea: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.Type.StepArea & Double = js.native
    
    /* 5 */ val StepLine: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.Type.StepLine & Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.RangeNavigator.ValueType")
  @js.native
  object ValueType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.ValueType & Double] = js.native
    
    /* 1 */ val DateTime: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.ValueType.DateTime & Double = js.native
    
    /* 0 */ val Numeric: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator.ValueType.Numeric & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.datavisualization.RangeNavigator.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.datavisualization.RangeNavigator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
