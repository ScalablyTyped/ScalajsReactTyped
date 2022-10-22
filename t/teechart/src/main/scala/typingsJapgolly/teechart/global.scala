package typingsJapgolly.teechart

import typingsJapgolly.teechart.Tee.IAnnotation
import typingsJapgolly.teechart.Tee.IArea
import typingsJapgolly.teechart.Tee.IAxis
import typingsJapgolly.teechart.Tee.IBubble
import typingsJapgolly.teechart.Tee.ICandle
import typingsJapgolly.teechart.Tee.IChart
import typingsJapgolly.teechart.Tee.ICursorTool
import typingsJapgolly.teechart.Tee.ICustomBar
import typingsJapgolly.teechart.Tee.ICustomSeries
import typingsJapgolly.teechart.Tee.IDragTool
import typingsJapgolly.teechart.Tee.IFormat
import typingsJapgolly.teechart.Tee.IGantt
import typingsJapgolly.teechart.Tee.ILine
import typingsJapgolly.teechart.Tee.IMargins
import typingsJapgolly.teechart.Tee.IPie
import typingsJapgolly.teechart.Tee.IPoint
import typingsJapgolly.teechart.Tee.IRectangle
import typingsJapgolly.teechart.Tee.ISeries
import typingsJapgolly.teechart.Tee.IToolTip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Tee {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Area")
    @js.native
    open class Area ()
      extends StObject
         with IArea {
      def this(values: js.Array[Double]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Bar")
    @js.native
    open class Bar ()
      extends StObject
         with ICustomBar {
      def this(values: js.Array[Double]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Bubble")
    @js.native
    open class Bubble ()
      extends StObject
         with IBubble {
      def this(values: js.Array[Double]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Candle")
    @js.native
    open class Candle ()
      extends StObject
         with ICandle {
      def this(values: js.Array[Double]) = this()
    }
    
    @JSGlobal("Tee.Chart")
    @js.native
    open class Chart protected ()
      extends StObject
         with typingsJapgolly.teechart.Tee.Chart {
      def this(canvas: String) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.CursorTool")
    @js.native
    open class CursorTool ()
      extends StObject
         with ICursorTool {
      def this(chart: typingsJapgolly.teechart.Tee.Chart) = this()
      
      /* CompleteClass */
      var active: Boolean = js.native
      
      /* CompleteClass */
      var chart: IChart = js.native
      
      /* CompleteClass */
      override def clicked(p: IPoint): Boolean = js.native
      
      /* CompleteClass */
      var direction: String = js.native
      
      /* CompleteClass */
      var dragging: Double = js.native
      
      /* CompleteClass */
      override def draw(): Unit = js.native
      
      /* CompleteClass */
      var followMouse: Boolean = js.native
      
      /* CompleteClass */
      var format: IFormat = js.native
      
      /* CompleteClass */
      var horizAxis: IAxis = js.native
      
      /* CompleteClass */
      override def mousedown(event: Any): Boolean = js.native
      
      /* CompleteClass */
      override def mousemove(event: Any): Boolean = js.native
      
      /* CompleteClass */
      override def over(point: IPoint): Boolean = js.native
      
      /* CompleteClass */
      var render: String = js.native
      
      /* CompleteClass */
      override def setRender(render: String): Unit = js.native
      
      /* CompleteClass */
      var size: IPoint = js.native
      
      /* CompleteClass */
      var vertAxis: IAxis = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Donut")
    @js.native
    open class Donut ()
      extends StObject
         with IPie {
      def this(values: js.Array[Double]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.DragTool")
    @js.native
    open class DragTool ()
      extends StObject
         with IDragTool {
      def this(chart: typingsJapgolly.teechart.Tee.Chart) = this()
      
      /* CompleteClass */
      var active: Boolean = js.native
      
      /* CompleteClass */
      var chart: IChart = js.native
      
      /* CompleteClass */
      override def clicked(p: IPoint): Boolean = js.native
      
      /* CompleteClass */
      override def draw(): Unit = js.native
      
      /* CompleteClass */
      override def mousedown(event: Any): Boolean = js.native
      
      /* CompleteClass */
      override def mousemove(event: Any): Boolean = js.native
      
      /* CompleteClass */
      var series: ISeries = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Gantt")
    @js.native
    open class Gantt ()
      extends StObject
         with IGantt {
      def this(values: js.Array[Double]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.HorizArea")
    @js.native
    open class HorizArea ()
      extends StObject
         with IArea {
      def this(values: js.Array[Double]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.HorizBar")
    @js.native
    open class HorizBar ()
      extends StObject
         with ICustomBar {
      def this(values: js.Array[Double]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Line")
    @js.native
    open class Line ()
      extends StObject
         with ILine {
      def this(values: js.Array[Double]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Pie")
    @js.native
    open class Pie ()
      extends StObject
         with IPie {
      def this(values: js.Array[Double]) = this()
    }
    
    @JSGlobal("Tee.Point")
    @js.native
    open class Point ()
      extends StObject
         with typingsJapgolly.teechart.Tee.Point {
      
      /* CompleteClass */
      var x: Double = js.native
      
      /* CompleteClass */
      var y: Double = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.PointXY")
    @js.native
    open class PointXY ()
      extends StObject
         with ICustomSeries {
      def this(values: js.Array[Double]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.ToolTip")
    @js.native
    open class ToolTip ()
      extends StObject
         with IToolTip {
      def this(chart: typingsJapgolly.teechart.Tee.Chart) = this()
      
      /* CompleteClass */
      var active: Boolean = js.native
      
      /* CompleteClass */
      override def add(text: String): IAnnotation = js.native
      
      /* CompleteClass */
      var animated: Double = js.native
      
      /* CompleteClass */
      var autoHide: Boolean = js.native
      
      /* CompleteClass */
      var autoRedraw: Boolean = js.native
      
      /* CompleteClass */
      var bounds: IRectangle = js.native
      
      /* CompleteClass */
      var chart: IChart = js.native
      
      /* CompleteClass */
      override def clicked(p: IPoint): Boolean = js.native
      
      /* CompleteClass */
      var currentIndex: Double = js.native
      
      /* CompleteClass */
      var currentSeries: ISeries = js.native
      
      /* CompleteClass */
      var delay: Double = js.native
      
      /* CompleteClass */
      override def draw(): Unit = js.native
      
      /* CompleteClass */
      var format: IFormat = js.native
      
      /* CompleteClass */
      override def hide(): Unit = js.native
      
      /* CompleteClass */
      var items: js.Array[IAnnotation] = js.native
      
      /* CompleteClass */
      var margins: IMargins = js.native
      
      /* CompleteClass */
      override def mousedown(event: Any): Boolean = js.native
      
      /* CompleteClass */
      override def mousemove(event: Any): Boolean = js.native
      
      /* CompleteClass */
      var position: IPoint = js.native
      
      /* CompleteClass */
      override def refresh(series: ISeries, index: Double): Unit = js.native
      
      /* CompleteClass */
      override def resize(): Unit = js.native
      
      /* CompleteClass */
      var text: String = js.native
      
      /* CompleteClass */
      var transparent: Boolean = js.native
      
      /* CompleteClass */
      var visible: Boolean = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Volume")
    @js.native
    open class Volume ()
      extends StObject
         with ICustomBar {
      def this(values: js.Array[Double]) = this()
    }
  }
}
