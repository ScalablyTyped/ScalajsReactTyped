package typingsJapgolly.chartJs.mod

import typingsJapgolly.chartJs.anon.CoreChartOptionsbarElemen
import typingsJapgolly.chartJs.anon.CoreChartOptionsdoughnutE
import typingsJapgolly.chartJs.anon.CoreChartOptionslineEleme
import typingsJapgolly.chartJs.anon.CoreChartOptionspieElemen
import typingsJapgolly.chartJs.anon.CoreChartOptionspolarArea
import typingsJapgolly.chartJs.anon.CoreChartOptionsradarElem
import typingsJapgolly.chartJs.anon.CoreChartOptionsscatterEl
import typingsJapgolly.chartJs.anon.DatasetChartOptionsChartT
import typingsJapgolly.chartJs.chartJsStrings.bubble
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in chart.js.chart.js.ChartType ]: chart.js.chart.js.CoreChartOptions<key> & chart.js.chart.js.ElementChartOptions<key> & chart.js.chart.js.PluginChartOptions<key> & chart.js.chart.js.DatasetChartOptions<chart.js.chart.js.ChartType> & chart.js.chart.js.ScaleChartOptions<key> & chart.js.chart.js.ChartTypeRegistry[key]['chartOptions']} */
trait Overrides extends StObject {
  
  var bar: CoreChartOptionsbarElemen
  
  var bubble: CoreChartOptions[typingsJapgolly.chartJs.chartJsStrings.bubble] & ElementChartOptions[typingsJapgolly.chartJs.chartJsStrings.bubble] & PluginChartOptions[typingsJapgolly.chartJs.chartJsStrings.bubble] & DatasetChartOptionsChartT & ScaleChartOptions[typingsJapgolly.chartJs.chartJsStrings.bubble] & Any
  
  var doughnut: CoreChartOptionsdoughnutE
  
  var line: CoreChartOptionslineEleme
  
  var pie: CoreChartOptionspieElemen
  
  var polarArea: CoreChartOptionspolarArea
  
  var radar: CoreChartOptionsradarElem
  
  var scatter: CoreChartOptionsscatterEl
}
object Overrides {
  
  inline def apply(
    bar: CoreChartOptionsbarElemen,
    bubble: CoreChartOptions[bubble] & ElementChartOptions[bubble] & PluginChartOptions[bubble] & DatasetChartOptionsChartT & ScaleChartOptions[bubble] & Any,
    doughnut: CoreChartOptionsdoughnutE,
    line: CoreChartOptionslineEleme,
    pie: CoreChartOptionspieElemen,
    polarArea: CoreChartOptionspolarArea,
    radar: CoreChartOptionsradarElem,
    scatter: CoreChartOptionsscatterEl
  ): Overrides = {
    val __obj = js.Dynamic.literal(bar = bar.asInstanceOf[js.Any], bubble = bubble.asInstanceOf[js.Any], doughnut = doughnut.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], pie = pie.asInstanceOf[js.Any], polarArea = polarArea.asInstanceOf[js.Any], radar = radar.asInstanceOf[js.Any], scatter = scatter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overrides]
  }
  
  extension [Self <: Overrides](x: Self) {
    
    inline def setBar(value: CoreChartOptionsbarElemen): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setBubble(
      value: CoreChartOptions[bubble] & ElementChartOptions[bubble] & PluginChartOptions[bubble] & DatasetChartOptionsChartT & ScaleChartOptions[bubble] & Any
    ): Self = StObject.set(x, "bubble", value.asInstanceOf[js.Any])
    
    inline def setDoughnut(value: CoreChartOptionsdoughnutE): Self = StObject.set(x, "doughnut", value.asInstanceOf[js.Any])
    
    inline def setLine(value: CoreChartOptionslineEleme): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setPie(value: CoreChartOptionspieElemen): Self = StObject.set(x, "pie", value.asInstanceOf[js.Any])
    
    inline def setPolarArea(value: CoreChartOptionspolarArea): Self = StObject.set(x, "polarArea", value.asInstanceOf[js.Any])
    
    inline def setRadar(value: CoreChartOptionsradarElem): Self = StObject.set(x, "radar", value.asInstanceOf[js.Any])
    
    inline def setScatter(value: CoreChartOptionsscatterEl): Self = StObject.set(x, "scatter", value.asInstanceOf[js.Any])
  }
}
