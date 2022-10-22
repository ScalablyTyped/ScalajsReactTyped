package typingsJapgolly.chartist

import typingsJapgolly.chartist.anon.Dir
import typingsJapgolly.chartist.anon.Len
import typingsJapgolly.chartist.anon.Max
import typingsJapgolly.chartist.chartistStrings.height
import typingsJapgolly.chartist.chartistStrings.horizontal
import typingsJapgolly.chartist.chartistStrings.vertical
import typingsJapgolly.chartist.chartistStrings.width
import typingsJapgolly.chartist.chartistStrings.x
import typingsJapgolly.chartist.chartistStrings.x1
import typingsJapgolly.chartist.chartistStrings.x2
import typingsJapgolly.chartist.chartistStrings.y
import typingsJapgolly.chartist.chartistStrings.y1
import typingsJapgolly.chartist.chartistStrings.y2
import typingsJapgolly.chartist.distCoreTypesMod.ChartRect
import typingsJapgolly.chartist.distCoreTypesMod.Label
import typingsJapgolly.chartist.distCoreTypesMod.NormalizedSeries
import typingsJapgolly.chartist.distCoreTypesMod.NormalizedSeriesPrimitiveValue
import typingsJapgolly.chartist.distCoreTypesMod.OptionsWithDefaults
import typingsJapgolly.chartist.distEventMod.EventEmitter
import typingsJapgolly.chartist.distSvgMod.Svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAxesAxisMod {
  
  /* note: abstract class */ @JSImport("chartist/dist/axes/Axis", "Axis")
  @js.native
  open class Axis protected () extends StObject {
    def this(units: AxisUnits_, chartRect: ChartRect, ticks: js.Array[Label]) = this()
    
    val axisLength: Double = js.native
    
    /* private */ val chartRect: Any = js.native
    
    val counterUnits: AxisUnits_ = js.native
    
    def createGridAndLabels(gridGroup: Svg, labelGroup: Svg, chartOptions: OptionsWithDefaults, eventEmitter: EventEmitter): Unit = js.native
    
    /* private */ val gridOffset: Any = js.native
    
    def projectValue(value: Label | NormalizedSeriesPrimitiveValue): Double = js.native
    def projectValue(value: Label | NormalizedSeriesPrimitiveValue, index: Double): Double = js.native
    def projectValue(value: Label | NormalizedSeriesPrimitiveValue, index: Double, series: NormalizedSeries): Double = js.native
    def projectValue(value: Label | NormalizedSeriesPrimitiveValue, index: Unit, series: NormalizedSeries): Double = js.native
    
    val range: js.UndefOr[Max] = js.native
    
    /* private */ val ticks: Any = js.native
    
    val units: AxisUnits_ = js.native
  }
  
  object axisUnits {
    
    @JSImport("chartist/dist/axes/Axis", "axisUnits.x")
    @js.native
    val x: Dir = js.native
    
    @JSImport("chartist/dist/axes/Axis", "axisUnits.y")
    @js.native
    val y: Len = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chartist.distAxesAxisMod.XAxisUnits
    - typingsJapgolly.chartist.distAxesAxisMod.YAxisUnits
  */
  trait AxisUnits_ extends StObject
  object AxisUnits_ {
    
    inline def XAxisUnits(): typingsJapgolly.chartist.distAxesAxisMod.XAxisUnits = {
      val __obj = js.Dynamic.literal(dir = "horizontal", len = "width", pos = "x", rectEnd = "x2", rectOffset = "y2", rectStart = "x1")
      __obj.asInstanceOf[typingsJapgolly.chartist.distAxesAxisMod.XAxisUnits]
    }
    
    inline def YAxisUnits(): typingsJapgolly.chartist.distAxesAxisMod.YAxisUnits = {
      val __obj = js.Dynamic.literal(dir = "vertical", len = "height", pos = "y", rectEnd = "y1", rectOffset = "x1", rectStart = "y2")
      __obj.asInstanceOf[typingsJapgolly.chartist.distAxesAxisMod.YAxisUnits]
    }
  }
  
  trait XAxisUnits
    extends StObject
       with AxisUnits_ {
    
    val dir: horizontal
    
    val len: width
    
    val pos: x
    
    val rectEnd: x2
    
    val rectOffset: y2
    
    val rectStart: x1
  }
  object XAxisUnits {
    
    inline def apply(): XAxisUnits = {
      val __obj = js.Dynamic.literal(dir = "horizontal", len = "width", pos = "x", rectEnd = "x2", rectOffset = "y2", rectStart = "x1")
      __obj.asInstanceOf[XAxisUnits]
    }
    
    extension [Self <: XAxisUnits](x: Self) {
      
      inline def setDir(value: horizontal): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setLen(value: width): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
      
      inline def setPos(value: typingsJapgolly.chartist.chartistStrings.x): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setRectEnd(value: x2): Self = StObject.set(x, "rectEnd", value.asInstanceOf[js.Any])
      
      inline def setRectOffset(value: y2): Self = StObject.set(x, "rectOffset", value.asInstanceOf[js.Any])
      
      inline def setRectStart(value: x1): Self = StObject.set(x, "rectStart", value.asInstanceOf[js.Any])
    }
  }
  
  trait YAxisUnits
    extends StObject
       with AxisUnits_ {
    
    val dir: vertical
    
    val len: height
    
    val pos: y
    
    val rectEnd: y1
    
    val rectOffset: x1
    
    val rectStart: y2
  }
  object YAxisUnits {
    
    inline def apply(): YAxisUnits = {
      val __obj = js.Dynamic.literal(dir = "vertical", len = "height", pos = "y", rectEnd = "y1", rectOffset = "x1", rectStart = "y2")
      __obj.asInstanceOf[YAxisUnits]
    }
    
    extension [Self <: YAxisUnits](x: Self) {
      
      inline def setDir(value: vertical): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setLen(value: height): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
      
      inline def setPos(value: y): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setRectEnd(value: y1): Self = StObject.set(x, "rectEnd", value.asInstanceOf[js.Any])
      
      inline def setRectOffset(value: x1): Self = StObject.set(x, "rectOffset", value.asInstanceOf[js.Any])
      
      inline def setRectStart(value: y2): Self = StObject.set(x, "rectStart", value.asInstanceOf[js.Any])
    }
  }
}
