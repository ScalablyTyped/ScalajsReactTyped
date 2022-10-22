package typingsJapgolly.reactVis.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactVis.mod.AnimationParam
import typingsJapgolly.reactVis.mod.LineSeriesPoint
import typingsJapgolly.reactVis.mod.LineSeriesProps
import typingsJapgolly.reactVis.mod.RVNearestXData
import typingsJapgolly.reactVis.mod.RVNearestXYData
import typingsJapgolly.reactVis.mod.Scale
import typingsJapgolly.reactVis.reactVisStrings.dashed
import typingsJapgolly.reactVis.reactVisStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LineSeries {
  
  @JSImport("react-vis", "LineSeries")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactVis.mod.LineSeries] {
    
    inline def _colorValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['_color'] */ js.Any): this.type = set("_colorValue", value.asInstanceOf[js.Any])
    
    inline def _opacityValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T['_opacity'] */ js.Any
    ): this.type = set("_opacityValue", value.asInstanceOf[js.Any])
    
    inline def _sizeValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['_size'] */ js.Any): this.type = set("_sizeValue", value.asInstanceOf[js.Any])
    
    inline def _xValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['_x'] */ js.Any): this.type = set("_xValue", value.asInstanceOf[js.Any])
    
    inline def _yValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['_y'] */ js.Any): this.type = set("_yValue", value.asInstanceOf[js.Any])
    
    inline def animation(value: String | AnimationParam | Boolean): this.type = set("animation", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: String | Double): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def colorBaseValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any): this.type = set("colorBaseValue", value.asInstanceOf[js.Any])
    
    inline def colorDistance(value: Double): this.type = set("colorDistance", value.asInstanceOf[js.Any])
    
    inline def colorDomain(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any
        ]
    ): this.type = set("colorDomain", value.asInstanceOf[js.Any])
    
    inline def colorDomainVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any)*
    ): this.type = set("colorDomain", js.Array(value*))
    
    inline def colorRange(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any
        ]
    ): this.type = set("colorRange", value.asInstanceOf[js.Any])
    
    inline def colorRangeVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any)*
    ): this.type = set("colorRange", js.Array(value*))
    
    inline def colorType(value: Scale): this.type = set("colorType", value.asInstanceOf[js.Any])
    
    inline def curve(value: String | (js.Function1[/* x */ Any, Any])): this.type = set("curve", value.asInstanceOf[js.Any])
    
    inline def curveFunction1(value: /* x */ Any => Any): this.type = set("curve", js.Any.fromFunction1(value))
    
    inline def data(value: js.Array[LineSeriesPoint | js.Array[Any]]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataVarargs(value: (LineSeriesPoint | js.Array[Any])*): this.type = set("data", js.Array(value*))
    
    inline def fill(value: String | Double): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def getColor(
      value: LineSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): this.type = set("getColor", js.Any.fromFunction1(value))
    
    inline def getColor0(
      value: LineSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): this.type = set("getColor0", js.Any.fromFunction1(value))
    
    inline def getNull(value: LineSeriesPoint => Any): this.type = set("getNull", js.Any.fromFunction1(value))
    
    inline def getOpacity(
      value: LineSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): this.type = set("getOpacity", js.Any.fromFunction1(value))
    
    inline def getOpacity0(
      value: LineSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): this.type = set("getOpacity0", js.Any.fromFunction1(value))
    
    inline def getSize(
      value: LineSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): this.type = set("getSize", js.Any.fromFunction1(value))
    
    inline def getSize0(
      value: LineSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): this.type = set("getSize0", js.Any.fromFunction1(value))
    
    inline def getX(
      value: LineSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): this.type = set("getX", js.Any.fromFunction1(value))
    
    inline def getX0(
      value: LineSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): this.type = set("getX0", js.Any.fromFunction1(value))
    
    inline def getY(
      value: LineSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): this.type = set("getY", js.Any.fromFunction1(value))
    
    inline def getY0(
      value: LineSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): this.type = set("getY0", js.Any.fromFunction1(value))
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def onNearestX(value: (LineSeriesPoint, /* data */ RVNearestXData[LineSeriesPoint]) => Callback): this.type = set("onNearestX", js.Any.fromFunction2((t0: LineSeriesPoint, t1: /* data */ RVNearestXData[LineSeriesPoint]) => (value(t0, t1)).runNow()))
    
    inline def onNearestXY(value: (LineSeriesPoint, /* data */ RVNearestXYData[LineSeriesPoint]) => Callback): this.type = set("onNearestXY", js.Any.fromFunction2((t0: LineSeriesPoint, t1: /* data */ RVNearestXYData[LineSeriesPoint]) => (value(t0, t1)).runNow()))
    
    inline def onSeriesClick(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): this.type = set("onSeriesClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onSeriesMouseOut(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): this.type = set("onSeriesMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onSeriesMouseOver(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): this.type = set("onSeriesMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onSeriesRightClick(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): this.type = set("onSeriesRightClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onValueClick(value: (LineSeriesPoint, /* event */ ReactMouseEventFrom[HTMLElement]) => Callback): this.type = set("onValueClick", js.Any.fromFunction2((t0: LineSeriesPoint, t1: /* event */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
    
    inline def onValueMouseOut(value: (LineSeriesPoint, /* event */ ReactMouseEventFrom[HTMLElement]) => Callback): this.type = set("onValueMouseOut", js.Any.fromFunction2((t0: LineSeriesPoint, t1: /* event */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
    
    inline def onValueMouseOver(value: (LineSeriesPoint, /* event */ ReactMouseEventFrom[HTMLElement]) => Callback): this.type = set("onValueMouseOver", js.Any.fromFunction2((t0: LineSeriesPoint, t1: /* event */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
    
    inline def onValueRightClick(value: (LineSeriesPoint, /* event */ ReactMouseEventFrom[HTMLElement]) => Callback): this.type = set("onValueRightClick", js.Any.fromFunction2((t0: LineSeriesPoint, t1: /* event */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
    
    inline def opacity(value: Double): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    inline def opacityBaseValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any): this.type = set("opacityBaseValue", value.asInstanceOf[js.Any])
    
    inline def opacityDistance(value: Double): this.type = set("opacityDistance", value.asInstanceOf[js.Any])
    
    inline def opacityDomain(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any
        ]
    ): this.type = set("opacityDomain", value.asInstanceOf[js.Any])
    
    inline def opacityDomainVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any)*
    ): this.type = set("opacityDomain", js.Array(value*))
    
    inline def opacityRange(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any
        ]
    ): this.type = set("opacityRange", value.asInstanceOf[js.Any])
    
    inline def opacityRangeVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T['opacity'] */ js.Any)*
    ): this.type = set("opacityRange", js.Array(value*))
    
    inline def opacityType(value: Scale): this.type = set("opacityType", value.asInstanceOf[js.Any])
    
    inline def sizeBaseValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any): this.type = set("sizeBaseValue", value.asInstanceOf[js.Any])
    
    inline def sizeDistance(value: Double): this.type = set("sizeDistance", value.asInstanceOf[js.Any])
    
    inline def sizeDomain(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any
        ]
    ): this.type = set("sizeDomain", value.asInstanceOf[js.Any])
    
    inline def sizeDomainVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any)*): this.type = set("sizeDomain", js.Array(value*))
    
    inline def sizeRange(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any
        ]
    ): this.type = set("sizeRange", value.asInstanceOf[js.Any])
    
    inline def sizeRangeVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['size'] */ js.Any)*): this.type = set("sizeRange", js.Array(value*))
    
    inline def sizeType(value: Scale): this.type = set("sizeType", value.asInstanceOf[js.Any])
    
    inline def stack(value: Boolean): this.type = set("stack", value.asInstanceOf[js.Any])
    
    inline def stroke(value: String | Double): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    inline def strokeStyle(value: dashed | solid): this.type = set("strokeStyle", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def xBaseValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any): this.type = set("xBaseValue", value.asInstanceOf[js.Any])
    
    inline def xDistance(value: Double): this.type = set("xDistance", value.asInstanceOf[js.Any])
    
    inline def xDomain(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any
        ]
    ): this.type = set("xDomain", value.asInstanceOf[js.Any])
    
    inline def xDomainVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any)*): this.type = set("xDomain", js.Array(value*))
    
    inline def xRange(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any
        ]
    ): this.type = set("xRange", value.asInstanceOf[js.Any])
    
    inline def xRangeVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any)*): this.type = set("xRange", js.Array(value*))
    
    inline def xType(value: Scale): this.type = set("xType", value.asInstanceOf[js.Any])
    
    inline def yBaseValue(value: /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any): this.type = set("yBaseValue", value.asInstanceOf[js.Any])
    
    inline def yDistance(value: Double): this.type = set("yDistance", value.asInstanceOf[js.Any])
    
    inline def yDomain(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any
        ]
    ): this.type = set("yDomain", value.asInstanceOf[js.Any])
    
    inline def yDomainVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any)*): this.type = set("yDomain", js.Array(value*))
    
    inline def yRange(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any
        ]
    ): this.type = set("yRange", value.asInstanceOf[js.Any])
    
    inline def yRangeVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any)*): this.type = set("yRange", js.Array(value*))
    
    inline def yType(value: Scale): this.type = set("yType", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: LineSeries.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LineSeriesProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
